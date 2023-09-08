package Library.Management.System.LibrarymanagementSystem.Service.impl;

import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.StudentRequestDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.UpdateStudentMobileDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.CardResponseDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.StudentResponseDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.UpdateStudentResponseDto;
import Library.Management.System.LibrarymanagementSystem.Enum.CardStatus;
import Library.Management.System.LibrarymanagementSystem.Exception.StudentNotFoundException;
import Library.Management.System.LibrarymanagementSystem.Repository.StudentRepository;
import Library.Management.System.LibrarymanagementSystem.entity.Card;
import Library.Management.System.LibrarymanagementSystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public String addStudent(StudentRequestDto studentRequestDto) {
        // Generate a new  student from the StudentRequestDto object
        Student  student= new Student();
        student.setAge(studentRequestDto.getAge());
        student.setName(studentRequestDto.getName());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setMobNo(studentRequestDto.getMobNo());


        // Generate a new card for a student
        Card card= new Card();
        card.setCardstatus(CardStatus.ACTIVE);
        card.setValidTill(("2024/07/06"));
        // set a card for a student
        card.setStudent(student);

        student.setCard(card);// here we are doing setcard information in student database;


        studentRepository.save(student);
        return "Student added";


    }

    @Override
    public String deleteStudent(int id) {
        Student student= studentRepository.findById(id).get();
        if(student!=null){
            studentRepository.delete(student);
            return "Student deleted successfully";

        }else{
            return "Student is not present";
        }



    }

    @Override
    public StudentResponseDto getStudent(int id) {
       Student student= studentRepository.findById(id).get();

       StudentResponseDto studentResponseDto= new StudentResponseDto();
       studentResponseDto.setId(student.getId());
       studentResponseDto.setMobNo(student.getMobNo());
       studentResponseDto.setDepartment(student.getDepartment());
       studentResponseDto.setAge(student.getAge());
       studentResponseDto.setName(student.getName());


        CardResponseDto cardResponseDto= new CardResponseDto();
        cardResponseDto.setCardstatus(student.getCard().getCardstatus());
        cardResponseDto.setId(student.getId());
        cardResponseDto.setIssueDate(student.getCard().getIssueDate());
        cardResponseDto.setUpdatedOn(student.getCard().getUpdatedOn());
        cardResponseDto.setValidTill(student.getCard().getValidTill());


        studentResponseDto.setCardResponseDto(cardResponseDto);
        return studentResponseDto;




    }

    @Override
    public UpdateStudentResponseDto updateStudent(UpdateStudentMobileDto updateStudentMobileDto) throws StudentNotFoundException {
     Student student;
     try{
         student= studentRepository.findById(updateStudentMobileDto.getId()).get();
         student.setMobNo(updateStudentMobileDto.getMobNo());
         Student updatedStudent= studentRepository.save(student);

         // prepare resposnse dto
         UpdateStudentResponseDto updateStudentResponseDto= new UpdateStudentResponseDto();
         updateStudentResponseDto.setName(updatedStudent.getName());
         updateStudentResponseDto.setMobNo(updatedStudent.getMobNo());
         return updateStudentResponseDto;
     }
     catch(Exception e){
       throw new StudentNotFoundException("Invalid student id");
     }

    }



}
