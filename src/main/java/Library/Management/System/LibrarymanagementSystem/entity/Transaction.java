package Library.Management.System.LibrarymanagementSystem.entity;

import Library.Management.System.LibrarymanagementSystem.Enum.TransactionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;


import java.util.Date;

@Entity
@Table(name="transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    private String transactionNumber;
@CreationTimestamp
    private Date transactionDate;

    private boolean isIssueOperation;

@Enumerated(EnumType.STRING)
private TransactionStatus transactionStatus;

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @ManyToOne
    @JoinColumn
    Card card;

@ManyToOne
    @JoinColumn
    Book book;



}
