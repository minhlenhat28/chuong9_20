package firstproject.leminh.chuong9_bai20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ArrayList list;
    public SanPhamAdapter sanPhamAdapter;
    public ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();

    }
    public void addControls(){
        list = new ArrayList<SanPham>();
        list.add(new SanPham("VC-1k","Vertu Constellation",1000));
        list.add(new SanPham("IP-52","IPhone 5S",2000));
        list.add(new SanPham("NK-9-3k","Nokia Lumia 925",3000));
        list.add(new SanPham("SG-S4","SamSung Galaxy S4",4000));
        list.add(new SanPham("HTC-D65","HTC Desire 600",5000));
        list.add(new SanPham("HKP-RL-6","HKPhone Revo LEAD",6000));
        listView = (ListView) findViewById(R.id.lv);
        sanPhamAdapter = new SanPhamAdapter(this,R.layout.item,list);
        listView.setAdapter(sanPhamAdapter);
    }

    public void addEvent(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Nhap vao: "+position+""+ sanPhamAdapter.getItem(position).getTen(),Toast.LENGTH_SHORT).show();
                MycustomDialog dialog = new MycustomDialog(MainActivity.this);
                dialog.setData(position,sanPhamAdapter.getItem(position).getTen(),
                        sanPhamAdapter.getItem(position).getMa(),
                        sanPhamAdapter.getItem(position).getDongia());
                dialog.show();
            }
        });
    }
    public void xoadulieu(int pos){

    }
}
