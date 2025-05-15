package components;

import java.time.LocalDate;
import javax.swing.JLabel;


/**
 * Block der ein Datum anzeigen kann
 */
public class DateComponent extends  JLabel {
    private LocalDate date;

    /**
     * Konstruktor der DateComponent
     * @param year Jahr des Datums
     * @param month Monat des Datums
     * @param day Tag des Datums
     */
    public DateComponent(int year, int month, int day) {
        updateDate(year, month, day);
    }

    /**
     * Aktualisiert das angegebene Datum
     * @param year Jahr des neuen Datums
     * @param month Monat des neuen Datums
     * @param day Tag des neuen Datums
     */
    public final void updateDate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);

        String dateText = String.format("%d.%d.%d", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
        setText(dateText);
    }
}