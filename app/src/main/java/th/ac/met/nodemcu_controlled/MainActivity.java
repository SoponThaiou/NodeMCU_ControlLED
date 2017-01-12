package th.ac.met.nodemcu_controlled;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.button) {
            TextView resualt = (TextView) findViewById(R.id.button);
            promptSpeechInput();
        }
    }

    private void promptSpeechInput() {
        Intent i = new Intent(RecognizerIntente)
    }
}

