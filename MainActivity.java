package voice_to_text.sandy148101.com.adapterlistview;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    int[] IMAGES = {R.drawable.icon,R.drawable.icon1,R.drawable.icon2,R.drawable.icon3,R.drawable.icon4,
            R.drawable.icon5,R.drawable.icon6,R.drawable.icon7,R.drawable.icon8,R.drawable.icon9,R.drawable.icon9,R.drawable.icon9,
            R.drawable.icon9,R.drawable.icon9,R.drawable.icon9,R.drawable.icon9,R.drawable.icon9,R.drawable.icon9,R.drawable.icon9};

    String[] NAMES = {"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ","AA","BB","CC","DD","EE","FF","GG","HH","II","JJ"};
    String[] description ={"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj","aa","bb","cc","dd","ee","ff","gg","hh","ii","jj"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listview);

        customadapter customadapter= new customadapter();
        listView.setAdapter(customadapter);

    }

    class customadapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
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

            convertView=getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView =(ImageView)convertView.findViewById(R.id.imageView_id);

            TextView textViewname = (TextView)convertView.findViewById(R.id.textView_Name);

            TextView textViewDescription =(TextView)convertView.findViewById(R.id.textView_Description);

            textViewname.setText(NAMES[position]);
            textViewDescription.setText(description[position]);

            return convertView;
        }
    }
}
