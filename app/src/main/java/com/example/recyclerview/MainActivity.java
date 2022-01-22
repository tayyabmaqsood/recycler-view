package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //text fields variables
    private TextView personName;
    private TextView personCity;
    private Button personDOB;


    // Date Picker variables
    private DatePickerDialog datePickerDialog;
    private Button dateButton;


    // RecyclerView Variables
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Friends> friendsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatePicker();
        dateButton = findViewById(R.id.datePickerButton);
        dateButton.setText("Date Of Birth");

        recyclerView = (RecyclerView) findViewById(R.id.frindsRecyclerview);

        // means every item of recyclerview has fixed size
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        friendsList = new ArrayList<>();
    }

    //<======================== Date Picker Code ============================>
    private String getTodaysDate() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        month = month + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day,month,year);
    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListner = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            month+=1;
            String date = makeDateString(day,month,year);
            dateButton.setText(date);
            }
        };
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;
        datePickerDialog = new DatePickerDialog(this,style,dateSetListner,year,month,day);
    }

    private String makeDateString(int day, int month, int year) {
        return day+" - "+getmonthFormate(month)+" - "+year;
    }

    private String getmonthFormate(int month) {
        if(month == 1)
            return "Jan";
        if(month == 2)
            return "Feb";
        if(month == 3)
            return "March";
        if(month == 4)
            return "April";
        if(month == 5)
            return "May";
        if(month == 6)
            return "June";
        if(month == 7)
            return "July";
        if(month == 8)
            return "Aug";
        if(month == 9)
            return "Sept";
        if(month == 10)
            return "Oct";
        if(month == 11)
            return "Nov";
        if(month == 12)
            return "Dec";
        return "Jan";
    }
    public void openDatePicker(View view) {
        datePickerDialog.show();
    }

    //<============================ Code Other Than Date Picker ===================>

    public void addFriendToRecyclerView(View view) {
        personName = (TextView) findViewById(R.id.personsName);
        personCity = (TextView) findViewById(R.id.personsCity);
        personDOB = findViewById(R.id.datePickerButton);
        String DOB = personDOB.getText().toString();
        Friends friend = new Friends(personName.getText().toString(),DOB, personCity.getText().toString());
        friend.setId(friendsList.size() + 1);
        friendsList.add(friend);
        adapter = new MyAdapter(friendsList,this);
        recyclerView.setAdapter(adapter);
    }
}