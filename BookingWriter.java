package file;

import entity.BookingInfo;
import java.io.FileWriter;
import java.io.IOException;

public class BookingWriter {
    public static void writeToFile(BookingInfo info) {
        try (FileWriter writer = new FileWriter("booking_data.txt", true)) {
            writer.write(info.toString() + "\n");
        } catch (IOException e) {
            System.err.println("Failed to write booking info: " + e.getMessage());
        }
    }
}
