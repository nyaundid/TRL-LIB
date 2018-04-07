package textbookrental;

import java.time.LocalDate;
import java.time.Period;

public class Loan {
    private Patron patron;
    private TextBook<?> textbook;
    LocalDate dateOfRent;
    Period period;

    public Loan(Patron patron, TextBook<?> book, Period period) {
        this.patron = patron;
        this.textbook = book;
        this.period = period;
        dateOfRent = LocalDate.now();
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public TextBook<?> getBook() {
        return textbook;
    }

    public void setTextBook(TextBook<?> textbook) {
        this.textbook = textbook;
    }

    public LocalDate getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(LocalDate dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

	public LocalDate getDateOfLoan() {
		// TODO Auto-generated method stub
		return null;
	}
}