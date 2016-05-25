package ba.unsa.etf.rma.edin_ceric.us;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Edin on 18.5.2016.
 */
public class MyAsyncTask extends AsyncTask<Void, Void, Void> {
    private String destAddress;
    private int destPort;
    Socket socket;

    public MyAsyncTask(String address, int port, Socket socket) {
        this.destAddress = address;
        this.destPort = port;
        this.socket = socket;
    }

    @Override
    protected Void doInBackground(Void... params) {

        try {
            socket = new Socket(destAddress, destPort);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
