public interface Commands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHORNAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;

    int PRINT_AUTHOR_BY_INDEX = 8;
    int REGOSTRATION = 9;
    int LOGIN = 10;
    int EXIT_USER_PAGE = 11;



    static void printAdminCommand(){
        System.out.println("Input " + ADD_BOOK + " for add book.");
        System.out.println("Input " + ADD_AUTHOR + " for add author.");
    }
    static void printCommand(){
//        System.out.println("Input " + ADD_BOOK + " for add book.");
        System.out.println("Input " + PRINT_ALL_BOOKS + " for print all books.");
        System.out.println("Input " + PRINT_BOOKS_BY_AUTHORNAME + " for print books by author name.");
        System.out.println("Input " + PRINT_BOOKS_BY_GENRE + " for print books by genre.");
        System.out.println("Input " + PRINT_BY_PRICE_RANGE + " for print books by price range.");
//        System.out.println("Input " + ADD_AUTHOR + " for add author.");
        System.out.println("Input " + PRINT_ALL_AUTHOR + " for print all author.");
        System.out.println("Input " + PRINT_AUTHOR_BY_INDEX + " for print author by index.");
        System.out.println("Input " + EXIT_USER_PAGE + " for exit user page.");
    }

    static void printRegLog(){
        System.out.println("Input " + EXIT + " for exit");
        System.out.println("Input " + REGOSTRATION + " for registration");
        System.out.println("Input " + LOGIN + " for login");
    }

}
