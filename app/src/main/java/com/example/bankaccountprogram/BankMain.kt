package com.example.bankaccountprogram

fun main() {
    val account = BankAccount("User", 200.0)
    account.deposit(200.0)
    account.withdraw(500.0)
    account.deposit(500.0)
    account.withdraw(500.0)
    account.displayTransactionsHistory()
    println(account.acctBalance())
    val sarahAccount = BankAccount("Sarah", 0.0)
    sarahAccount.deposit(100.0)
    sarahAccount.withdraw(10.0)
    sarahAccount.deposit(300.0)
    sarahAccount.displayTransactionsHistory()
    println(sarahAccount.acctBalance())
}