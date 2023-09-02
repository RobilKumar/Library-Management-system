package Library.Management.System.LibrarymanagementSystem.Service.impl;

import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.AuthorResponseDto;
import Library.Management.System.LibrarymanagementSystem.entity.Author;

public interface AuthorService {
    public  String addAuthor(Author author);
    public AuthorResponseDto getAuthor(String  email);
}
