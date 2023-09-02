package Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos;

import Library.Management.System.LibrarymanagementSystem.Enum.TransactionStatus;
import Library.Management.System.LibrarymanagementSystem.entity.Transaction;
import Library.Management.System.LibrarymanagementSystem.Enum.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class IssueBookResponseDto {
    private String transactionNumber;
    private TransactionStatus transactionStatus;
    private String bookName;
}
