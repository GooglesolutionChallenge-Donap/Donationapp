//package com.example.donationapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//import android.widget.AutoCompleteTextView;
//
//public class receiversignup1 extends AppCompatActivity {
//
//    AutoCompleteTextView autoCompleteTextView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_receiversignup1);
//         autoCompleteTextView = findViewById(R.id.receiversignup1_autocompletetxt);
//
//        String []option = {"Organisation Category" , "NGO", "Orphanage", "Old-Age Home"};
//
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this , R.layout.receiversignup1_orgcategorylist , option);
//
//        autoCompleteTextView.setText(arrayAdapter.getItem(0).toString() , false);
//
//        autoCompleteTextView.setAdapter(arrayAdapter);
//    }
//}







        package com.example.donationapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.AutoCompleteTextView;
        import android.widget.Toast;

public class receiversignup1 extends AppCompatActivity {

    String[] items =  {"Material","Design","Components","Android","5.0 Lollipop"};
    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiversignup1);

        //changing statusbar color

        statusbar.blackiconstatusbar(receiversignup1.this,R.color.light_bg);

        autoCompleteTxt = findViewById(R.id.receiversignup1_autocompletetxt);

        adapterItems = new ArrayAdapter<String>(this,R.layout.receiversignup1_orgcategorylist,items);
        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item: "+item,Toast.LENGTH_SHORT).show();
            }
        });
    }
}





















