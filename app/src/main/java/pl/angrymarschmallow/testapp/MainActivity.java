package pl.angrymarschmallow.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> listaObecnosci = new ArrayList<String>(){{
        add("bodolsog");
        add("scorpion43");
        add("meandors");
        add("CrackingMinds");
        add("Warmish");
        add("matrix56");
        add("Ap6y3HuK");
        add("vova");


    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
