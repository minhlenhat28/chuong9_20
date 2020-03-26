package firstproject.leminh.chuong9_bai20;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MycustomDialog extends Dialog {
    TextView tvma;
    TextView tvtien;
    TextView tvten;
    Activity context;
    Button btnxoa;
    Button btntrove;
    int position;
    public MycustomDialog(@NonNull Activity context) {
        super(context);
        this.context = context;
        setContentView(R.layout.itemfordialog);
        addControls();
        addEvent();
    }
    public void addControls(){
        tvma = (TextView) findViewById(R.id.masp);
        tvten = (TextView) findViewById(R.id.tensp);
        tvtien = (TextView) findViewById(R.id.giatien);
        btntrove = (Button) findViewById(R.id.btntrove);
        btnxoa = (Button) findViewById(R.id.btnxoasp);
        setTitle("Thong tin chi tiet ");
        setCanceledOnTouchOutside(false);
    }
    public void setData(int pos, String ten, String ma, int gia){
        tvten.setText(ten);
        tvma.setText(ma);
        tvtien.setText(String.valueOf(gia));
        position =pos;
    }
    public void addEvent(){
        btntrove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        btntrove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
