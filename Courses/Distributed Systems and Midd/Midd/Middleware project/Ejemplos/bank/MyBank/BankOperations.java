package MyBank;


/**
* MyBank/BankOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Saturday, April 7, 2012 1:30:10 PM CEST
*/

public interface BankOperations 
{
  MyBank.Account createNewAccount (String name, String address);
  MyBank.Account getAccount (int number);
} // interface BankOperations
