package com.example.abhin.veggiediet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class veganDiet extends AppCompatActivity {
    String[] items = {"Red Potato Steam Bag", "Blue Diamond Almond Breeze Unsweetened Vanilla Almond Milk", "Mahatma Organic Natural Whole Grain Brown Rice", "Great Value Florets Broccoli", "Marketside Baby Greens Salad", "Great Value Black Beans", "Bush's Best Organic Black Beans", "Jonagold Apples", "Kiwi", "Baby Kale & Spinach", "Bush's Best Organic Garbanzo Beans", "Great Value Organic Lentils"};
    String[] descriptions = {"12 oz", "32 fl oz", "2 lb", "14 oz", "6 oz", "15.25 oz, 4 count", "15 oz", "5 lb", "2 lb", "8 oz", "15 oz", "16 oz"};
    String[] prices = {"$1.98", "$2.22", "$3.83", "$1.00", "$2.68", "$3.30", "$1.85", "$4.92", "$3.98", "$2.68", "$1.85", "3.21"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegan_diet);

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
