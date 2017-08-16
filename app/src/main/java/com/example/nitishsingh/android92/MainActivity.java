package com.example.nitishsingh.android92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//here we are declaring 5 menu item
    private static final int item_1 = Menu.FIRST ;
    private static final int item_2 = Menu.FIRST + 1;
    private static final int item_3 = Menu.FIRST + 2;
    private static final int item_4 = Menu.FIRST + 3;
    private static final int item_5 = Menu.FIRST + 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      //here we are adding 5 different option
        menu.add(0,item_1,0,"Computer");
        menu.add(0,item_2,0,"Gamepad");
        menu.add(0,item_3,0,"Camera");
        menu.add(0,item_4,0,"Video");
        menu.add(0,item_5,0,"EMAIL");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //here we creating AdapterView for pasing the info of
        //the menu
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        //here we are getting the id of the item
        switch (item.getItemId()) {
            case item_1:
                Toast.makeText(getApplicationContext(),"Computer",Toast.LENGTH_SHORT).show();
            case item_2:
                Toast.makeText(getApplicationContext(),"Gamepad",Toast.LENGTH_SHORT).show();
            case item_3:
                Toast.makeText(getApplicationContext(),"Camera",Toast.LENGTH_SHORT).show();
            case item_4:
                Toast.makeText(getApplicationContext(),"Video",Toast.LENGTH_SHORT).show();
            case item_5:
                Toast.makeText(getApplicationContext(),"EMAIL",Toast.LENGTH_SHORT).show();

             default:
                 return  super.onContextItemSelected(item);
        }
    }
}
