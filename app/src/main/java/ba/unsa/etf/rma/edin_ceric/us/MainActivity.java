package ba.unsa.etf.rma.edin_ceric.us;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {

    EditText editTextAddress, editTextPort;
    Button buttonConnect, buttonClear, dugme1, dugme2, dugme3, dugme4, dugme5, dugme6, dugme7, dugme8, dugme9;
    Socket socket = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAddress = (EditText)findViewById(R.id.address);
        editTextPort = (EditText)findViewById(R.id.port);

        buttonConnect = (Button)findViewById(R.id.connect);
        buttonClear = (Button)findViewById(R.id.clear);
        dugme1 = (Button)findViewById(R.id.dugme1);
        dugme2 = (Button)findViewById(R.id.dugme2);
        dugme3 = (Button)findViewById(R.id.dugme3);
        dugme4 = (Button)findViewById(R.id.dugme4);
        dugme5 = (Button)findViewById(R.id.dugme5);
        dugme6 = (Button)findViewById(R.id.dugme6);
        dugme7 = (Button)findViewById(R.id.dugme7);
        dugme8 = (Button)findViewById(R.id.dugme8);
        dugme9 = (Button)findViewById(R.id.dugme9);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyAsyncTask asyncTask = new MyAsyncTask(editTextAddress.getText().toString(),
                        Integer.parseInt(editTextPort.getText().toString()), socket);
                asyncTask.execute();
            }
        });

        dugme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("1");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });

        dugme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("2");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });

        dugme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("3");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });

        dugme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("4");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });

        dugme5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("5");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });

        dugme6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("6");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });

        dugme7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("7");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });

        dugme8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("8");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });

        dugme9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(socket != null) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                        dataOutputStream.writeUTF("9");
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("Socket je vec otvoren, treba ga prvo zatvoriti");
                }
            }
        });
    }
}
