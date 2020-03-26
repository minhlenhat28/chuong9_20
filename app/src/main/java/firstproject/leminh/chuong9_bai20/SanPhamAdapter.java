package firstproject.leminh.chuong9_bai20;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SanPhamAdapter extends ArrayAdapter<SanPham> {
    public Context context;
    public int resource;
    public ArrayList<SanPham> sanPhams;
    public SanPhamAdapter(@NonNull Context context, int resource, ArrayList<SanPham> sanPhams) {
        super(context, resource,sanPhams);
        this.context = context;
        this.resource = resource;
        this.sanPhams = sanPhams;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        SanPham c = sanPhams.get(position);
        TextView tv = convertView.findViewById(R.id.tvitem);
        tv.setText(c.getTen());
        return convertView;

    }
}
