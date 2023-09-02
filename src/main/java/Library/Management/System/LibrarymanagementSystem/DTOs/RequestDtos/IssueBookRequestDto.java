package Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos;

import Library.Management.System.LibrarymanagementSystem.Enum.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class IssueBookRequestDto {
    private int cardId;
    private int bookId;

}
