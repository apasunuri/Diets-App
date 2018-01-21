package com.example.abhin.veggiediet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class veggieDiet extends AppCompatActivity {
    String[] items = {"Red Potato Steam Bag", "Great Value Vitamin D Milk", "Mahatma Organic Natural Whole Grain Brown Rice", "Colavita Organic Cut Fusilli Pasta", "Newman's Own Pasta Sauce Marinara", "Bush's Best Organic Garbanzo Beans", "Great Value Florets Broccoli", "Del Monte Fresh Cut Blue Lake Cut Green Beans", "12 Large Grade A Eggs", "Baby Kale & Spinach", "Planters Lightly Salted Mixed Nuts"};
    String[] descriptions = {"12 oz", "1 gal", "2 lb", "1 lb", "24 oz", "15 oz", "14 oz", "14.5 oz, 4 ct", "12 ct", "8 oz", "15 oz"};
    String[] prices = {"$1.98", "$3.78", "$3.83", "$2.53", "$2.73", "$1.85", "$1.00", "$4.36", "$1.97", "$2.68", "$6.98"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veggie_diet);

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
