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
import android.content.Intent;
import android.content.res.AssetManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Italian extends Activity implements OnClickListener{
	Button b,b1;
	AutoCompleteTextView v;
	TextView tv,tv2,drop;
	String content;
	String list[]={"Abbacchio Alla Toscana","Antipasto Frutti Di-Mare","Aragosta Di Pesaro","Baccala Di Fondo Con Brandi","Barile Wine","Besciamella Sauce","Beurre Manié","Bistecca Alla Peperoni Giallo","Bistecca Alla Pizzaiola","Broccoli","Brodo di Pollo","Bruschetta","Canarino","Cannelloni Pasta","Capellini Alla Marinara","Capellini in Brodo","Capesante Con Brandi","Caprese Salad","Cavoletti Di Bruxelle","Cavolfiore Alla Milanese","Ceasar Salad","Chicken Broth","Corn Bread","Corn and Green Peas","Cosmopolitan","Crocante Primavera","Crème Carmel","Demi-Glace","Fettuccine Al Burro E Panna","Honey Glazed Ham","Kir Royal","Lasagne","Lemon Drop","Linguine Alla Puttanesca","Linguine Alle Vongole","Linguine Pescatore","Margarita","Melanzana Parmegina","Minestrone Soup","Mista Salad","Mozzarella In Carrozzo","Mushroom Grissini","Osso Buco","Panetonne","Passito","Pasta Con Tonno E Olive","Pasta E Fagioli","Pastella","Penne All’Arrabbiata","Pepperoni Alla Romana","Pere Al’ Amaretto","Petti De Pollo Ripieno","Polenta","Pollo Alla Cacciatore","Pollo Alle Mandorle","Pollo Con Fughi","Pollo Con Piselli","Pollo Vino Bianco","Potato Rice Bread","Potatoes","Proscuitto Melone","Red Peppers","Rice Flour Quick Bread ","Riso Con Funghi","Risotto Con Asparagi","Rissoto Portofino","Salmon Alla Osteria","Salsa Bolognese","Scampi And Risotto","Soufflé Au Grand Marnier","Spaghetti Aglio E Olio","Spaghetti Con Polpette","Spinach","Stracciatella Alla Romana","Thanksgiving Turkey","Tomato Sauce","Torta Di Citro","Vino Che Making","Zucchini","Zuppa Di Lenticchie","Zuppa Di Zucchini Con Riso"};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);
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
        getMenuInflater().inflate(R.menu.activity_italian, menu);
        return true;
    }
    
    public void getContent(String filename)
    {
    	try {
    		InputStream stream = getAssets().open(filename+".txt");
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
			 if(s1.equals("Abbacchio Alla Toscana"))
			 {
			 filename="1";
			 }
			 if(s1.equals("Antipasto Frutti Di-Mare"))
			 {
			 filename="2";
			 }
			 if(s1.equals("Aragosta Di Pesaro"))
			 {
			 filename="3";
			 }
			 if(s1.equals("Baccala Di Fondo Con Brandi"))
			 {
			 filename="4";
			 }
			 if(s1.equals("Barile Wine"))
			 {
			 filename="5";
			 }
			 if(s1.equals("Besciamella Sauce"))
			 {
			 filename="6";
			 }
			 if(s1.equals("Beurre Manié"))
			 {
			 filename="7";
			 }
			 if(s1.equals("Bistecca Alla Peperoni Giallo"))
			 {
			 filename="8";
			 }
			 if(s1.equals("Bistecca Alla Pizzaiola"))
			 {
			 filename="9";
			 }
			 if(s1.equals("Broccoli"))
			 {
			 filename="10";
			 }
			 if(s1.equals("Brodo di Pollo"))
			 {
			 filename="11";
			 }
			 if(s1.equals("Bruschetta"))
			 {
			 filename="12";
			 }
			 if(s1.equals("Canarino"))
			 {
			 filename="13";
			 }
			 if(s1.equals("Cannelloni Pasta"))
			 {
			 filename="14";
			 }
			 if(s1.equals("Capellini Alla Marinara"))
			 {
			 filename="15";
			 }
			 if(s1.equals("Capellini in Brodo"))
			 {
			 filename="16";
			 }
			 if(s1.equals("Capesante Con Brandi"))
			 {
			 filename="17";
			 }
			 if(s1.equals("Caprese Salad"))
			 {
			 filename="18";
			 }
			 if(s1.equals("Cavoletti Di Bruxelle"))
			 {
			 filename="19";
			 }
			 if(s1.equals("Cavolfiore Alla Milanese"))
			 {
			 filename="20";
			 }
			 if(s1.equals("Ceasar Salad"))
			 {
			 filename="21";
			 }
			 if(s1.equals("Chicken Broth"))
			 {
			 filename="22";
			 }
			 if(s1.equals("Corn Bread"))
			 {
			 filename="23";
			 }
			 if(s1.equals("Corn and Green Peas"))
			 {
			 filename="24";
			 }
			 if(s1.equals("Cosmopolitan"))
			 {
			 filename="25";
			 }
			 if(s1.equals("Crocante Primavera"))
			 {
			 filename="26";
			 }
			 if(s1.equals("Crème Carmel"))
			 {
			 filename="27";
			 }
			 if(s1.equals("Demi-Glace"))
			 {
			 filename="28";
			 }
			 if(s1.equals("Fettuccine Al Burro E Panna"))
			 {
			 filename="29";
			 }
			 if(s1.equals("Honey Glazed Ham"))
			 {
			 filename="30";
			 }
			 if(s1.equals("Kir Royal"))
			 {
			 filename="31";
			 }
			 if(s1.equals("Lasagne"))
			 {
			 filename="32";
			 }
			 if(s1.equals("Lemon Drop"))
			 {
			 filename="33";
			 }
			 if(s1.equals("Linguine Alla Puttanesca"))
			 {
			 filename="34";
			 }
			 if(s1.equals("Linguine Alle Vongole"))
			 {
			 filename="35";
			 }
			 if(s1.equals("Linguine Pescatore"))
			 {
			 filename="36";
			 }
			 if(s1.equals("Margarita"))
			 {
			 filename="37";
			 }
			 if(s1.equals("Melanzana Parmegina"))
			 {
			 filename="38";
			 }
			 if(s1.equals("Minestrone Soup"))
			 {
			 filename="39";
			 }
			 if(s1.equals("Mista Salad"))
			 {
			 filename="40";
			 }
			 if(s1.equals("Mozzarella In Carrozzo"))
			 {
			 filename="41";
			 }
			 if(s1.equals("Mushroom Grissini"))
			 {
			 filename="42";
			 }
			 if(s1.equals("Osso Buco"))
			 {
			 filename="43";
			 }
			 if(s1.equals("Panetonne"))
			 {
			 filename="44";
			 }
			 if(s1.equals("Passito"))
			 {
			 filename="45";
			 }
			 if(s1.equals("Pasta Con Tonno E Olive"))
			 {
			 filename="46";
			 }
			 if(s1.equals("Pasta E Fagioli"))
			 {
			 filename="47";
			 }
			 if(s1.equals("Pastella"))
			 {
			 filename="48";
			 }
			 if(s1.equals("Penne All’Arrabbiata"))
			 {
			 filename="49";
			 }
			 if(s1.equals("Pepperoni Alla Romana"))
			 {
			 filename="50";
			 }
			 if(s1.equals("Pere Al’ Amaretto"))
			 {
			 filename="51";
			 }
			 if(s1.equals("Petti De Pollo Ripieno"))
			 {
			 filename="52";
			 }
			 if(s1.equals("Polenta"))
			 {
			 filename="53";
			 }
			 if(s1.equals("Pollo Alla Cacciatore"))
			 {
			 filename="54";
			 }
			 if(s1.equals("Pollo Alle Mandorle"))
			 {
			 filename="55";
			 }
			 if(s1.equals("Pollo Con Fughi"))
			 {
			 filename="56";
			 }
			 if(s1.equals("Pollo Con Piselli"))
			 {
			 filename="57";
			 }
			 if(s1.equals("Pollo Vino Bianco"))
			 {
			 filename="58";
			 }
			 if(s1.equals("Potato Rice Bread"))
			 {
			 filename="59";
			 }
			 if(s1.equals("Potatoes"))
			 {
			 filename="60";
			 }
			 if(s1.equals("Proscuitto Melone"))
			 {
			 filename="61";
			 }
			 if(s1.equals("Red Peppers"))
			 {
			 filename="62";
			 }
			 if(s1.equals("Rice Flour Quick Bread "))
			 {
			 filename="63";
			 }
			 if(s1.equals("Riso Con Funghi"))
			 {
			 filename="64";
			 }
			 if(s1.equals("Risotto Con Asparagi"))
			 {
			 filename="65";
			 }
			 if(s1.equals("Rissoto Portofino"))
			 {
			 filename="66";
			 }
			 if(s1.equals("Salmon Alla Osteria"))
			 {
			 filename="67";
			 }
			 if(s1.equals("Salsa Bolognese"))
			 {
			 filename="68";
			 }
			 if(s1.equals("Scampi And Risotto"))
			 {
			 filename="69";
			 }
			 if(s1.equals("Soufflé Au Grand Marnier"))
			 {
			 filename="70";
			 }
			 if(s1.equals("Spaghetti Aglio E Olio"))
			 {
			 filename="71";
			 }
			 if(s1.equals("Spaghetti Con Polpette"))
			 {
			 filename="72";
			 }
			 if(s1.equals("Spinach"))
			 {
			 filename="73";
			 }
			 if(s1.equals("Stracciatella Alla Romana"))
			 {
			 filename="74";
			 }
			 if(s1.equals("Thanksgiving Turkey"))
			 {
			 filename="75";
			 }
			 if(s1.equals("Tomato Sauce"))
			 {
			 filename="76";
			 }
			 if(s1.equals("Torta Di Citro"))
			 {
			 filename="77";
			 }
			 if(s1.equals("Vino Che Making"))
			 {
			 filename="78";
			 }
			 if(s1.equals("Zucchini"))
			 {
			 filename="79";
			 }
			 if(s1.equals("Zuppa Di Lenticchie"))
			 {
			 filename="80";
			 }
			 if(s1.equals("Zuppa Di Zucchini Con Riso"))
			 {
			 filename="81";
			 }
			 getContent(filename);
			 tv.setText(content);
			 }
		 if(vi.getId()== R.id.button2){
		 setContentView(R.layout.content);
		 tv=(TextView) this.findViewById(R.id.textView1);
		 filename="indexitalian";
		 getContent(filename);
		 tv.setText(content);
		 }
			 			
		 
	}
}
