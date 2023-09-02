package Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateStudentMobileDto {
    private int id;
    private String mobNo;
}
