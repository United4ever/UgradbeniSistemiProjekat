package ba.unsa.etf.rma.edin_ceric.us;

import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Edin on 18.5.2016.
 */
public class MyAsyncTask extends AsyncTask<Void, Void, Void> {
    private String destAddress;
    private int destPort;
    public Socket socket = null;
    private String response;

    public MyAsyncTask(String address, int port, Socket socket) {
        this.destAddress = address;
        this.destPort = port;
        this.socket = socket;
    }

    @Override
    protected Void doInBackground(Void... params) {

        try {
            socket = new Socket(destAddress, destPort);
            if(socket.isConnected()) {
                recieveMessage();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void recieveMessage() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        try {
            response = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(bufferedReader.ready()) {
            bufferedReader.close();
        }
    }

    public String returnResponse() {
        return response;
    }

}
