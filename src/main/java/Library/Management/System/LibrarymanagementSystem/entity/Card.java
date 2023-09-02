package Library.Management.System.LibrarymanagementSystem.entity;


import Library.Management.System.LibrarymanagementSystem.Enum.CardStatus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @CreationTimestamp
    Date issueDate;
    @UpdateTimestamp
    private Date updatedOn;
@Enumerated(EnumType.STRING)
    private CardStatus cardstatus;

 private String  validTill;
 @OneToOne
 @JoinColumn
 Student student;

@OneToMany(mappedBy = "card", cascade = CascadeType.ALL )
    List<Transaction> transactionList=  new ArrayList<>();

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL )
    List<Book> booksIssued= new ArrayList<>();

}
