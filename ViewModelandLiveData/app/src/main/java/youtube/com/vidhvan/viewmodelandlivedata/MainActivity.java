package youtube.com.vidhvan.viewmodelandlivedata;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import youtube.com.vidhvan.viewmodelandlivedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mvm;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mvm = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setMyvar(mvm);
    }
}