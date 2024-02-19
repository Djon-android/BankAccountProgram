package com.example.bankaccountprogram

data class BankAccount(
    val accountHolder: String,
    private var balance: Double
) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $amount. Balance = $balance")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withrawed $amount. Balance = $balance")
        } else {
            println("You have no money for this operation. Balance is $balance")
        }
    }

    fun acctBalance(): Double {
        return balance
    }

    fun displayTransactionsHistory() {
        println("Transaction history for $accountHolder")
        transactionHistory.forEach {
            println(it)
        }
    }
}