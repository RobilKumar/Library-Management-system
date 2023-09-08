package Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos;

import Library.Management.System.LibrarymanagementSystem.Enum.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentResponseDto {

    private int id;
    private String name;
    private int age;
    private Department department;

    private String mobNo;

    CardResponseDto cardResponseDto;
}
