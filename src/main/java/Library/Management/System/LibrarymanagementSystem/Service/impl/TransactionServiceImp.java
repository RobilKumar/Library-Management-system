package Library.Management.System.LibrarymanagementSystem.Service.impl;

import Library.Management.System.LibrarymanagementSystem.DTOs.RequestDtos.IssueBookRequestDto;
import Library.Management.System.LibrarymanagementSystem.DTOs.ResponseDTos.IssueBookResponseDto;
import Library.Management.System.LibrarymanagementSystem.Enum.CardStatus;
import Library.Management.System.LibrarymanagementSystem.Enum.TransactionStatus;
import Library.Management.System.LibrarymanagementSystem.Repository.BookRepository;
import Library.Management.System.LibrarymanagementSystem.Repository.CardRepository;
import Library.Management.System.LibrarymanagementSystem.Repository.TransactionRepository;
import Library.Management.System.LibrarymanagementSystem.entity.Book;
import Library.Management.System.LibrarymanagementSystem.entity.Card;
import Library.Management.System.LibrarymanagementSystem.entity.Transaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


//@Service
//public class TransactionServiceImp implements   TransactionService{
//    @Autowired
//    CardRepository cardRepository;
//
//    @Autowired
//    BookRepository bookRepository;
//
//    @Autowired
//    TransactionRepository transactionRepository;
//
//
//
//
//  //  @Override
////    public IssueBookResponseDto issueBook(IssueBookRequestDto issueBookRequestDto) throws Exception {
////
////        Transaction transaction= new Transaction();
////        transaction.setTransactionNumber(String.valueOf(UUID.randomUUID()));
////        transaction.setIssueOperation(true);
////
////        Card card;
////        try{
////            // checking card is present or not
////            card= cardRepository.findById(issueBookRequestDto.getCardId()).get();
////
////        }
////        catch(Exception e){
////            transaction.setTransactionStatus(TransactionStatus.FAILED);
////            transactionRepository.save(transaction);
////
////            throw new Exception("Invalid vcard");
////        }
////        transaction.setCard(card);
////
////
////        Book book;
////        try{
////            book= bookRepository.findById(issueBookRequestDto.getBookId()).get();
////
////
////        }catch (Exception e){
////            transaction.setTransactionStatus(TransactionStatus.FAILED);
////            transactionRepository.save(transaction);
////            throw new Exception("Book is not valid");
////
////
////        }
////        transaction.setBook(book);
////
////     if(card.getCardstatus()!= CardStatus.ACTIVE){
////         transaction.setTransactionStatus(TransactionStatus.FAILED);
////         transactionRepository.save(transaction);
////         throw new Exception("Card is not activated");
////
////     }
////     if(book.isIssued()){
////         transaction.setTransactionStatus(TransactionStatus.FAILED);
////         transactionRepository.save(transaction);
////         throw new Exception("Book is not available");
////
////     }
////     transaction.setTransactionStatus(TransactionStatus.SUCCCESS);
////     book.setIssued(true);
////     book.setCard(card);
////     book.getTransactionList().add(transaction);
////
////      card.getBooksIssued().add(book);// getting prob here
////           card.getTransactionList().add(transaction);
////
////    }
//}
