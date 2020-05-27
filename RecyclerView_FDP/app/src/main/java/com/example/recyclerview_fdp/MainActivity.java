package com.example.recyclerview_fdp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int images[];
    String names [];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler1);
        //set the Adapter
        recyclerView.setAdapter(new MyAdapter());
        //set the LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        setData();

    }

    private void setData() {
        images = new int[]{R.drawable.img1,R.drawable.img2,R.drawable.img3,
        R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,
        R.drawable.img8,R.drawable.img9,R.drawable.kitkat};
        names = new String[]{"Astro","Blender","Cupcake","Donut","Froyo","Gingerbread","HoneyComb","IcecreamSandwich","JellyBean",
        "Kitkat"};

    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewInfo>{
/* The follwing  method id responsible  to attach the row.xml to all the
* items in the recyclerview*/
        @NonNull
        @Override
        public MyAdapter.ViewInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
             View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.row_item,parent,false);
            return new ViewInfo(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyAdapter.ViewInfo holder, int position) {
            holder.imageView.setImageResource(images[position]);
            holder.textView.setText(names[position]);
        }

        @Override
        public int getItemCount() {
            return images.length;
        }

        public class ViewInfo extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView textView;
            public ViewInfo(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.img1);
                textView = itemView.findViewById(R.id.text1);
            }
        }
    }
}
