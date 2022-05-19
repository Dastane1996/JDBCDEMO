package phoneBook.phoneJDBC;

public class App {
    public static void main(String[] args) {
        PhoneBookService phoneBookService = new PhoneBookService();
        Phone phone = new Phone();
        phone.setCallId(6);
        phone.setName("Rahul");
        phone.setType("Incomming");
        phone.setDuration(100);

        //phoneBookService.insertData(phone);
        phoneBookService.readData();
        //phoneBookService.deleteData(4);
        //phoneBookService.updateData(1);


    }
}
