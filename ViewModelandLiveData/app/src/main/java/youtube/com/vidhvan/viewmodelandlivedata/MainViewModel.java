package youtube.com.vidhvan.viewmodelandlivedata;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel
{
    /*int count = 0;*/
    public MutableLiveData<Integer> count = new MutableLiveData<>();
    //alt + insert -> Constructor
    public MainViewModel()
    {
        Log.i("MainViewModel","ViewModel is Created!");
        count.setValue(0);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("MainViewModel","ViewModel is Destroyed!");
    }

    public void increment(){
        count.setValue(count.getValue() + 1);
    }

    public void decrement(){
        count.setValue(count.getValue() - 1);
    }
}
