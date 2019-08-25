package com.example.parsaniahardik.horizontalprogressbar;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv, tv2, tv3;
    private Button btn, btn2, btn3;
    private ProgressBar progressBar, progressBar2, progressBar3;

    private int progressStatus = 0, progressStatus2 = 0, progressStatus3 = 0;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
        progressBar = findViewById(R.id.pb);

        tv2 = findViewById(R.id.tv2);
        btn2 = findViewById(R.id.btn2);
        progressBar2 = findViewById(R.id.pb2);

        tv3 = findViewById(R.id.tv3);
        btn3 = findViewById(R.id.btn3);
        progressBar3 = findViewById(R.id.pb3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (progressStatus == 100) {
                    progressStatus = 0;
                }

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressStatus < 100) {
                            // Update the progress status
                            progressStatus += 1;

                            // Try to sleep the thread for 20 milliseconds
                            try {
                                Thread.sleep(20);  //3 seconds
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progressStatus);
                                    // Show the progress on TextView
                                    tv.setText(progressStatus + "/100");
                                }
                            });
                        }
                    }
                }).start(); // Start the operation
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (progressStatus2 == 100) {
                    progressStatus2 = 0;
                }

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressStatus2 < 100) {
                            // Update the progress status
                            progressStatus2 += 1;

                            // Try to sleep the thread for 20 milliseconds
                            try {
                                Thread.sleep(20);  //3 seconds
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar2.setProgress(progressStatus2);
                                    // Show the progress on TextView
                                    tv2.setText(progressStatus2 + "/100");
                                }
                            });
                        }
                    }
                }).start(); // Start the operation
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (progressStatus3 == 100) {
                    progressStatus3 = 0;
                }

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressStatus3 < 100) {
                            // Update the progress status
                            progressStatus3 += 1;

                            // Try to sleep the thread for 20 milliseconds
                            try {
                                Thread.sleep(20);  //3 seconds
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar3.setProgress(progressStatus3);
                                    progressBar3.setSecondaryProgress(progressStatus3 + 15);
                                    // Show the progress on TextView
                                    tv3.setText(progressStatus3 + "/100");
                                }
                            });
                        }
                    }
                }).start(); // Start the operation
            }
        });
    }
}

