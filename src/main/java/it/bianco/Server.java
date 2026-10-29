package it.bianco;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PORTA = 12345;

    public static void main(String[] args) {
        //creato il socket per far parlare il server ed il client; 
        try(ServerSocket server = new ServerSocket(PORTA)){
            while (true) { 
                //accettazione del client in arrivo; 
                Socket clientSocket = server.accept(); 

                
                ClientHandler ch = new ClientHandler();
                Thread thread = new Thread();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
       }
    }
}