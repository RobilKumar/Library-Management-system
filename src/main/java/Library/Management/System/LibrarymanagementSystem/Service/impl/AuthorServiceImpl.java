package Library.Management.System.LibrarymanagementSystem.Service.impl;

import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.AuthorResponseDto;
import Library.Management.System.LibrarymanagementSystem.Repository.AuthorRepository;
import Library.Management.System.LibrarymanagementSystem.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "author added successfully";
    }

    @Override
    public AuthorResponseDto getAuthor(String email) {
        Author author= authorRepository.findByEmail(email);
        // prepare a response Dto
        AuthorResponseDto authorResponseDto= new AuthorResponseDto();
        authorResponseDto.setName(author.getName());
        authorResponseDto.setAge(author.getAge());

        return authorResponseDto;


    }
}
