package Library.Management.System.LibrarymanagementSystem.Controller;

import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.IssueBookRequestDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.IssueBookResponseDto;
import Library.Management.System.LibrarymanagementSystem.Service.impl.TransactionService;
import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;
@RequestMapping("/add")
    public IssueBookResponseDto issueBook(IssueBookRequestDto issueBookRequestDto){
      return issueBook(issueBookRequestDto);
    }
}
