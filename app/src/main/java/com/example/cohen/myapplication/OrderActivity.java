package com.example.cohen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class OrderActivity extends ActionBarActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }


    public void submitOrder(View view) {
        String text;
        text=(createOrderSummary());
        sendIntent("Subject", text);
        //displayMessage(createOrderSummary());
    }

    /**
     * This method displays the given text on the screen.
     */
    public void sendIntent (String subject,String text ){
        Intent intent= new Intent (Intent.ACTION_SEND);
        intent.setType("*/*");
        String[] adress = new String[3];
        adress[0]="cmoshec@gmail.com";
        adress[1]="aaa@sgmail.com";
        adress[2]="sss@gamail.com";
        intent.putExtra(Intent.EXTRA_EMAIL, adress);
        intent.putExtra(intent.EXTRA_SUBJECT, subject);
        intent.putExtra(intent.EXTRA_TEXT, text);
        if (intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }
    }


    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        if (quantity>30) {quantity=30;}
        display(quantity);
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        if (quantity<0) {quantity=0;}
        display(quantity);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }



    public int calculatePrice(boolean creamOrdered,boolean chocolateOredered) {


        int price=5;
        if (creamOrdered){
            price=price+2;
        }
        if (chocolateOredered){
            price=price+3;
        }

        return price;
    }

    public String createOrderSummary() {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.Check_Box_Cream);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.Check_Box_Chocolate);
        boolean checkstate1=checkBox1.isChecked();
        boolean checkstate2=checkBox2.isChecked();
        int totalPrice = calculatePrice(checkstate1,checkstate2)*quantity;
        EditText editText= (EditText) findViewById(R.id.editText);
        Editable name=editText.getText();
        String message = name + "\n Quantity: " + quantity + "\n Cream :" + checkstate1 + "\n Chocolate :" + checkstate2 + "\n Total: " + totalPrice  + "\n Thank you"
                ;
        return message;
    }


}
