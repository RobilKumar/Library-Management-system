package Library.Management.System.LibrarymanagementSystem.Controller;

import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.AuthorResponseDto;
import Library.Management.System.LibrarymanagementSystem.Service.impl.AuthorService;
import Library.Management.System.LibrarymanagementSystem.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
@Autowired
    AuthorService authorService;
    @PostMapping("/add")

    public String addAuthor(@RequestBody Author author){

        return authorService.addAuthor(author);

    }
@GetMapping("get_by_email")
    public AuthorResponseDto getAuthorByEmail(@RequestParam ("email") String email){
      return   authorService.getAuthor(email);
}
}
