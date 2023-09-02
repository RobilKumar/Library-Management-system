package Library.Management.System.LibrarymanagementSystem.Service.impl;

import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.IssueBookRequestDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.IssueBookResponseDto;

public interface TransactionService {
    public IssueBookResponseDto issueBook(IssueBookRequestDto issueBookRequestDto) throws Exception;
}
