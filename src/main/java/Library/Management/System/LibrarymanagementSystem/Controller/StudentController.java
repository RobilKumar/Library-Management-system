package Library.Management.System.LibrarymanagementSystem.Controller;

import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.StudentRequestDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.UpdateStudentMobileDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.StudentResponseDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.UpdateStudentResponseDto;
import Library.Management.System.LibrarymanagementSystem.Exception.StudentNotFoundException;
import Library.Management.System.LibrarymanagementSystem.Service.impl.StudentService;

import Library.Management.System.LibrarymanagementSystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){
       return  studentService.addStudent(studentRequestDto);

    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam ("id")int id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("/get")
    public StudentResponseDto getStudent(@RequestParam("id") int id){
        return studentService.getStudent(id);
    }


    @PutMapping("/update")
    public UpdateStudentResponseDto updateStudent(@RequestBody UpdateStudentMobileDto updateStudentMobileDto) throws StudentNotFoundException {
       return studentService.updateStudent(updateStudentMobileDto);
    }
}
