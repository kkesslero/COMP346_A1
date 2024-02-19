import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            PrintStream output = new PrintStream("Test2_Buffer10.txt");
            System.setOut(output);

        }catch(FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            System.exit(0);
        }

    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/

    	Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();
        Server objServer = new Server();
        objServer.start();
        Client objClientSendTransaction = new Client("sending");
        objClientSendTransaction.start();
        Client objClientReceiveTransaction = new Client("receiving");
        objClientReceiveTransaction.start();
    }
}
