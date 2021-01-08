JC = javac

Expenses:
	$(JC) Expenses.java

run:
	java Expenses

clean:
	$(RM) Expenses.class
