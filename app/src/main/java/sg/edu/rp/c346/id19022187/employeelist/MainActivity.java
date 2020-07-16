package sg.edu.rp.c346.id19022187.employeelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee> alEmployee;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);
        alEmployee = new ArrayList();
        Employee employee1 = new Employee("John", "Software Technical Leader", 3400.0);
        alEmployee.add(employee1);
        alEmployee.add(new Employee("May", "Programmer", 2200.0));
        adapter = new CustomAdapter(this, R.layout.row, alEmployee);
        lvEmployee.setAdapter(adapter);
    }
}