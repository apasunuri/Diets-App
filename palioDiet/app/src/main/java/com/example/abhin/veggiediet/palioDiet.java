package com.example.abhin.veggiediet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class palioDiet extends AppCompatActivity {
    String[] items = {"Great Value Black Beans", "Bush's Best Organic Black Beans", "Great Value Florets Broccoli", "Del Monte Fresh Cut Blue Lake Cut Green Beans", "12 Large Grade A Eggs", "Boneless Sirloin Tip Roast", "Grade A Frozen Turkey Breast"};
    String[] descriptions = {"15.25 oz", "15 oz", "14 oz", "14.5 oz", "12 ct", "1 lb", "1 lb"};
    String[] prices = {"$3.30", "$1.85", "$1.00", "$4.36", "$1.97", "$3.99", "$1.99"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palio_diet);

        ListView foodList = (ListView) findViewById(R.id.foodList);

        CustomAdapter customAdapter = new CustomAdapter();

        foodList.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return items.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout, null);

            TextView itemTextView = (TextView) convertView.findViewById(R.id.itemTextView);
            TextView descriptionTextView = (TextView) convertView.findViewById(R.id.descriptionTextView);
            TextView priceTextView = (TextView) convertView.findViewById(R.id.priceTextView);

            itemTextView.setText(items[position]);
            descriptionTextView.setText(descriptions[position]);
            priceTextView.setText(prices[position]);
            return convertView;
        }
    }
}
