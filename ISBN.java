import java.util.*;
public class ISBN {
    long isbn ;

    void iSBN(Scanner sc){
        System.out.println("Enter the ISBN number");
        isbn = sc.nextLong();
        checkISBN(isbn);
    }

    long count(long isbn2){
        int count = 0;
        while(isbn2 != 0){
            isbn2 /= 10;
            count++; 
        }
        return count;
    }

    void checkISBN(long isbn){
        long sum = 0;
        long temp = isbn;
        int multi = 10;

        if(count(isbn) < 10 | count(isbn) > 10){
            System.out.println("ISBN should be a 10 digit number");
        }

        else{
            while(temp != 0){
                long v = temp % 10 ;
                sum = sum + (v * multi);
                multi--;
                temp = temp / 10;
            }

            if(sum % 11 == 0){
                System.out.println("Legal ISBN");
            }

            else{
                System.out.println("Illegal ISBN");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ISBN isbn = new ISBN();
        isbn.iSBN(scanner);
    }
    
}
