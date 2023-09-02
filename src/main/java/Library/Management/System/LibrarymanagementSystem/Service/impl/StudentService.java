package Library.Management.System.LibrarymanagementSystem.Service.impl;

import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.StudentRequestDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.UpdateStudentMobileDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.UpdateStudentResponseDto;
import Library.Management.System.LibrarymanagementSystem.Exception.StudentNotFoundException;
import Library.Management.System.LibrarymanagementSystem.entity.Student;

public interface StudentService {
    public String addStudent(StudentRequestDto studentRequestDto);
    public String deleteStudent(int id);

   public  Student getStudent(int id);

    public UpdateStudentResponseDto updateStudent(UpdateStudentMobileDto updateStudentMobileDto) throws StudentNotFoundException;
}
