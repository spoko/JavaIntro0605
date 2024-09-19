package exceptions;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws CookieMonsterException {//throws IOException {
        try{
            ReadFile.readFile("blahblah");
        } catch (IOException ioe) {
            System.out.println("Ops something went wrong. More details: " + ioe.getMessage());
        }

        try{
            System.out.println(2/2);
        }catch (ArithmeticException e){
            throw new CookieMonsterException(e.getMessage(), 2);
        }finally {
            System.out.println("i`ll be always execute");
        }

        System.out.println("End");
    }
}