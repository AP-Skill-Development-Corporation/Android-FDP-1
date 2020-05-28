# ViewModel and LiveData - Starter Code
Please copy the following code and paste it in your ***activity_main.xml***
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">


    <Button
        android:id="@+id/button"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:onClick="increment"
        android:background="@color/colorPrimary"
        android:textColor="@android:color/white"
        android:textSize="20sp"
        android:textStyle="bold"
        android:text="Increment" />

    <TextView
        android:id="@+id/count_textView"
        android:layout_width="match_parent"
        android:gravity="center"
        android:textSize="100dp"
        android:textStyle="bold"
        android:layout_height="0dp"
        android:layout_weight="8"
        android:text="0" />

    <Button
        android:id="@+id/button2"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:onClick="decrement"
        android:background="@color/colorPrimary"
        android:textColor="@android:color/white"
        android:textSize="20sp"
        android:textStyle="bold"
        android:text="Decrement"/>
</LinearLayout>
```

Please copy the code below and paste it in ***MainActivity.java***

```java
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView count_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count_tv = findViewById(R.id.count_textView); // Connecting the count_textView with count_tv TextView Instance
    }

    /*The Following method, when invoked, increases the value on the
    * textview by 1.*/
    public void increment(View view)
    {
        count++;                                // reducing the current value by 1
        count_tv.setText(String.valueOf(count));// Setting the value of Count on the count textview on UI.
                                                // String.value() - converts the type of count value from Integer to String
    }

    /*The Following method, when invoked, decreases the value on the
     * textview by 1.*/
    public void decrement(View view)
    {
        count--;                                 // reducing the current value by 1
        count_tv.setText(String.valueOf(count)); // Setting the value of Count on the count textview on UI.
                                                 // String.value() - converts the type of count value from Integer to String
    }
}

```
