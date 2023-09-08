package Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos;

import Library.Management.System.LibrarymanagementSystem.Enum.CardStatus;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CardResponseDto {

    private int id;


    Date issueDate;

    private Date updatedOn;

    private CardStatus cardstatus;

    private String  validTill;



}
