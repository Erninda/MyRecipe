package ac.id.polinema.background.ui;

import ac.id.polinema.background.R;
import ac.id.polinema.background.api.helper.ServiceGenerator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class BlankActivity extends AppCompatActivity {

    private ProgressDialog progress;
    private RecyclerView linksView;
    private ItemAdapter itemAdapter;
    private FastAdapter fastAdapter;
    private List dataLinks = new ArrayList<>();
    private String id,title,destination,shortUrl;
    String apikey = "0e201d5e013144e486f0de58fc0da8cc";
    TextView id_link, judul, tujuan, linkBaru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);
        progress = new ProgressDialog(this);
        progress.setMessage("Loading...");
        progress.show();
        id_link = findViewById(R.id.id_link);
        judul = findViewById(R.id.judul);
        tujuan = findViewById(R.id.tujuan);
        linkBaru = findViewById(R.id.linkBaru);
//        getData();
    }

//    public void getData(){
//        progress.hide();
//        ApiInterface service = ServiceGenerator.createService(ApiInterface.class);
//        Call<List<ResponseData>> call = service.getRebrand(apikey);
//        call.enqueue(new Callback<List<ResponseData>>() {
//            @Override
//            public void onResponse(Call<List<ResponseData>> call, Response<List<ResponseData>> response) {
//                if(response.isSuccessful()){
//                    int i = 0;
//                    id = response.body().get(i).getId();
//                    title = response.body().get(i).getTitle();
//                    destination = response.body().get(i).getDestination();
//                    shortUrl = response.body().get(i).getShortUrl();
//
//                    id_link.setText(id);
//                    judul.setText(title);
//                    tujuan.setText(destination);
//                    linkBaru.setText(shortUrl);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<ResponseData>> call, Throwable t) {
//                Toast.makeText(BlankActivity.this, "Gagal", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }
}
