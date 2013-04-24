package com.tastebuds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Indian1 extends Activity implements OnClickListener{
	Button b,b1;
	AutoCompleteTextView v;
	TextView tv,drop;
	String content;
	String list[]={"Adai","Atte ka seera","Badam ka seera","Baked Bread Rolls","Beetroot Halwa","Bhel","Boondi","Bread Besan Bajji","Cabbage Kofta Curry","Carrot Halwa","Channa Bhatura","Chickoo Halwa","Chutney spread","Coconut Burfi","Dal ka seera","Dhaal vada","Doodhi Halwa","Gobi Manchurian","Green All-Purpose Chutney","Gulab Jamoon","Hot Kachori","Imarti","Kaju Barfi","Kalakand (Milk Burfi)","Karanjia","Kesar Pista Kulfi","Khajur Burfi or Rolls","Malai Kofta","Malai Ladoo","Masala Dosa","Masala Vada","Mava Burfi","Mitha Khaja","Mixed Dal Dosas","Mix Veg Curry","Pear and Mango Chutney","Pedhas","Pineapple Gojju","Poha","Potato in Curd Gravy","Puranpoli","Rava Dosa","Rava (Semolina) Ladoo","Rossogolla","Sada (Plain) Dosa","Samosa","Sarson ka saag","Shahi Paneer","Shankarpala","Shrikhand","Simple Potato Cake","Sindhi Saibhaji","Spicy Khaja","Spicy Roti","Spicy Sev","Sweet Kachori","Sweet Pongal","Tandoori Roti (without Tandoor)","Tikha Baigan Masala","Tur Dal Kofta","Ulundu vada","Vaangi Baath (Brinjal Rice)","Vegetable Cutlet","Vegetable Pie"};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian1);
        b=(Button) this.findViewById(R.id.button1);
        b1=(Button)findViewById(R.id.button2);
        v=(AutoCompleteTextView) this.findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = 
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        v.setAdapter(adapter);
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_indian1, menu);
        return true;
    }
    
    public void getContent(String filename)
    {
    	try {
    		InputStream stream = getAssets().open(filename);
    		int size = stream.available();
    		byte[] buffer = new byte[size];
    		stream.read(buffer);
    		stream.close();
    	    content = new String(buffer);
    	}
    	catch(FileNotFoundException e)
    	{
    		content = filename+" is not in our Database right now, Please Check in our next Update";
    	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			content = "I/O err 	or";
			e.printStackTrace();
		}
	}
	public void onClick(View vi) {
		 String s1,filename;
		 filename = "";
		 s1=v.getText().toString();
		 int id = vi.getId();
		 content="";
		 if(id==R.id.button1)
		 {
			 setContentView(R.layout.content);
			 tv=(TextView) this.findViewById(R.id.textView1);
				 if(s1.equals("Adai"))
				 {
				 filename="Adai";
				 }
				 if(s1.equals("Atte ka seera"))
				 {
				 filename="Atte ka seera";
				 }
				 if(s1.equals("Badam ka seera"))
				 {
				 filename="Badam ka seera";
				 }
				 if(s1.equals("Baked Bread Rolls"))
				 {
				 filename="Baked Bread Rolls";
				 }
				 if(s1.equals("Beetroot Halwa"))
				 {
				 filename="Beetroot Halwa";
				 }
				 if(s1.equals("Bhel"))
				 {
				 filename="Bhel";
				 }
				 if(s1.equals("Boondi"))
				 {
				 filename="Boondi";
				 }
				 if(s1.equals("Bread Besan Bajji"))
				 {
				 filename="Bread Besan Bajji";
				 }
				 if(s1.equals("Cabbage Kofta Curry"))
				 {
				 filename="Cabbage Kofta Curry";
				 }
				 if(s1.equals("Carrot Halwa"))
				 {
				 filename="Carrot Halwa";
				 }
				 if(s1.equals("Channa Bhatura"))
				 {
				 filename="Channa Bhatura";
				 }
				 if(s1.equals("Chickoo Halwa"))
				 {
				 filename="Chickoo Halwa";
				 }
				 if(s1.equals("Chutney spread"))
				 {
				 filename="Chutney spread";
				 }
				 if(s1.equals("Coconut Burfi"))
				 {
				 filename="Coconut Burfi";
				 }
				 if(s1.equals("Dal ka seera"))
				 {
				 filename="Dal ka seera";
				 }
				 if(s1.equals("Dhaal vada"))
				 {
				 filename="Dhaal vada";
				 }
				 if(s1.equals("Doodhi Halwa"))
				 {
				 filename="Doodhi Halwa";
				 }
				 if(s1.equals("Gobi Manchurian"))
				 {
				 filename="Gobi Manchurian";
				 }
				 if(s1.equals("Green All-Purpose Chutney"))
				 {
				 filename="Green All-Purpose Chutney";
				 }
				 if(s1.equals("Gulab Jamoon"))
				 {
				 filename="Gulab Jamoon";
				 }
				 if(s1.equals("Hot Kachori"))
				 {
				 filename="Hot Kachori";
				 }
				 if(s1.equals("Imarti"))
				 {
				 filename="Imarti";
				 }
				 if(s1.equals("Kaju Barfi"))
				 {
				 filename="Kaju Barfi";
				 }
				 if(s1.equals("Kalakand (Milk Burfi)"))
				 {
				 filename="Kalakand (Milk Burfi)";
				 }
				 if(s1.equals("Karanjia"))
				 {
				 filename="Karanjia";
				 }
				 if(s1.equals("Kesar Pista Kulfi"))
				 {
				 filename="Kesar Pista Kulfi";
				 }
				 if(s1.equals("Khajur Burfi or Rolls"))
				 {
				 filename="Khajur Burfi or Rolls";
				 }
				 if(s1.equals("Malai Kofta"))
				 {
				 filename="Malai Kofta";
				 }
				 if(s1.equals("Malai Ladoo"))
				 {
				 filename="Malai Ladoo";
				 }
				 if(s1.equals("Masala Dosa"))
				 {
				 filename="Masala Dosa";
				 }
				 if(s1.equals("Masala Vada"))
				 {
				 filename="Masala Vada";
				 }
				 if(s1.equals("Mava Burfi"))
				 {
				 filename="Mava Burfi";
				 }
				 if(s1.equals("Mitha Khaja"))
				 {
				 filename="Mitha Khaja";
				 }
				 if(s1.equals("Mixed Dal Dosas"))
				 {
				 filename="Mixed Dal Dosas";
				 }
				 if(s1.equals("Mix Veg Curry"))
				 {
				 filename="Mix Veg Curry";
				 }
				 if(s1.equals("Pear and Mango Chutney"))
				 {
				 filename="Pear and Mango Chutney";
				 }
				 if(s1.equals("Pedhas"))
				 {
				 filename="Pedhas";
				 }
				 if(s1.equals("Pineapple Gojju"))
				 {
				 filename="Pineapple Gojju";
				 }
				 if(s1.equals("Poha"))
				 {
				 filename="Poha";
				 }
				 if(s1.equals("Potato in Curd Gravy"))
				 {
				 filename="Potato in Curd Gravy";
				 }
				 if(s1.equals("Puranpoli"))
				 {
				 filename="Puranpoli";
				 }
				 if(s1.equals("Rava Dosa"))
				 {
				 filename="Rava Dosa";
				 }
				 if(s1.equals("Rava (Semolina) Ladoo"))
				 {
				 filename="Rava (Semolina) Ladoo";
				 }
				 if(s1.equals("Rossogolla"))
				 {
				 filename="Rossogolla";
				 }
				 if(s1.equals("Sada (Plain) Dosa"))
				 {
				 filename="Sada (Plain) Dosa";
				 }
				 if(s1.equals("Samosa"))
				 {
				 filename="Samosa";
				 }
				 if(s1.equals("Sarson ka saag"))
				 {
				 filename="Sarson ka saag";
				 }
				 if(s1.equals("Shahi Paneer"))
				 {
				 filename="Shahi Paneer";
				 }
				 if(s1.equals("Shankarpala"))
				 {
				 filename="Shankarpala";
				 }
				 if(s1.equals("Shrikhand"))
				 {
				 filename="Shrikhand";
				 }
				 if(s1.equals("Simple Potato Cake"))
				 {
				 filename="Simple Potato Cake";
				 }
				 if(s1.equals("Sindhi Saibhaji"))
				 {
				 filename="Sindhi Saibhaji";
				 }
				 if(s1.equals("Spicy Khaja"))
				 {
				 filename="Spicy Khaja";
				 }
				 if(s1.equals("Spicy Roti"))
				 {
				 filename="Spicy Roti";
				 }
				 if(s1.equals("Spicy Sev"))
				 {
				 filename="Spicy Sev";
				 }
				 if(s1.equals("Sweet Kachori"))
				 {
				 filename="Sweet Kachori";
				 }
				 if(s1.equals("Sweet Pongal"))
				 {
				 filename="Sweet Pongal";
				 }
				 if(s1.equals("Tandoori Roti (without Tandoor)"))
				 {
				 filename="Tandoori Roti (without Tandoor)";
				 }
				 if(s1.equals("Tikha Baigan Masala"))
				 {
				 filename="Tikha Baigan Masala";
				 }
				 if(s1.equals("Tur Dal Kofta"))
				 {
				 filename="Tur Dal Kofta";
				 }
				 if(s1.equals("Ulundu vada"))
				 {
				 filename="Ulundu vada";
				 }
				 if(s1.equals("Vaangi Baath (Brinjal Rice)"))
				 {
				 filename="Vaangi Baath (Brinjal Rice)";
				 }
				 if(s1.equals("Vegetable Cutlet"))
				 {
				 filename="Vegetable Cutlet";
				 }
				 if(s1.equals("Vegetable Pie"))
				 {
				 filename="Vegetable Pie";
				 }
				 getContent(filename);
				 tv.setText(content);			
		 		 }
		 if(vi.getId()== R.id.button2){
			 	setContentView(R.layout.content);
			 	tv=(TextView) this.findViewById(R.id.textView1);
			 	filename="indexindian.txt";
			 	getContent(filename);
			 	tv.setText(content);
			 }
	}
}
