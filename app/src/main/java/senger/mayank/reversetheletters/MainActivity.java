package senger.mayank.reversetheletters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtWord;
    private TextView txtReversedWord;
    private String reverseWord = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       edtWord = findViewById(R.id.edtWord);
       txtReversedWord = findViewById(R.id.txtReversedWord);

       String[] myFavSports = new String[4];
       myFavSports[0] = "Boxing";
       myFavSports[1] = "Judo";
       myFavSports[2] = "Body Building";
       myFavSports[3] = "Karate";

       for (String sportName:myFavSports){

           Log.i("Sport", sportName);

       }


    }
    public void btnReverseClicked(View buttonView){

        reverseWord = "";
        String word = edtWord.getText().toString();
        char[] wordArray = word.toCharArray();

        for(int index = wordArray.length-1; index >= 0 ; index --){

           // Log.i("MyTag", wordArray[index] + "");
            reverseWord = reverseWord + wordArray[index];

        }

        txtReversedWord.setText((reverseWord));
    }


}
