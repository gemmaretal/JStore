import java.io.*;

public class ItemNotFoundException extends Exception{
    private int item_error;

    public ItemNotFoundException(int item_input){
        super();
        item_error = item_input;
    }

    @Override
    public String getMessage(){
        return "Item ID: ";
    }

    public String getExMessage(){
        return super.getMessage() + item_error + "not found.";
    }
}
