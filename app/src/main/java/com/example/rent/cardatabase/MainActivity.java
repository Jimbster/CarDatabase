package com.example.rent.cardatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import com.example.rent.cardatabase.add.AddNewCarActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

@BindView(R.id.autocomplete_textview)
    AutoCompleteTextView autoCompleteTextView;

    private MotoDatabaseOpenHelper databaseOpenHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        databaseOpenHelper = new MotoDatabaseOpenHelper(this);
        AutocompleteAdapter adapter = new AutocompleteAdapter(this, databaseOpenHelper.getAllItems());
        autoCompleteTextView.setAdapter(adapter);

    }

    @OnClick(R.id.add_new_car)
    void onAddNewCarButtonClick () {
        Intent intent = new Intent(this, AddNewCarActivity.class);
        startActivity(intent);
    }
}
