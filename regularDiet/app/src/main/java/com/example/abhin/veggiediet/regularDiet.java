package com.example.abhin.veggiediet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class regularDiet extends AppCompatActivity {
    String[] items = {"Nature's Own 100% Whole WheatBread Made with Honey", "Oscar Mayer Deli Fresh Oven Roasted Turkey Breast", "Sabra Classic Hummus", "Baby Kale and Spinach", "Grade A Frozen Turkey Breast", "Bush's Best Organic Garbanzo Beans", "12 Large Grade A Eggs", "Red Potatoes Steam Bag", "Great Value Vitamin D Milk", "Mahatma Organic Natural Whole Grain Brown Rice", "Colavita Organic Cut Fusilli Pasta"};
    String[] descriptions = {"16 oz", "22 oz", "17 oz", "8 oz", "1 lb", "15 oz", "12 ct", "12 oz", "1 gal", "2 lb", "1 lb"};
    String[] prices = {"$2.89", "$6.98", "$4.48", "$2.68", "$1.99", "$1.85", "$1.97", "$1.98", "$3.78", "$3.83", "$2.53"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_diet);

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
