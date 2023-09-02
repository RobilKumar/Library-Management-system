package Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos;

import Library.Management.System.LibrarymanagementSystem.Enum.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class StudentRequestDto {
    private String name;
    private int age;
    private Department department;
    private String mobNo;
}
