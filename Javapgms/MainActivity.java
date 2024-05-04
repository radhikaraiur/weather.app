import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding the TextView defined in the layout
        TextView textView = findViewById(R.id.textView);

        // Setting text to the TextView
        textView.setText("Hello, Android!");
    }
}<?

xml version = "1.0"encoding="utf-8"?><RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"xmlns:tools="http://schemas.android.com/tools"android:layout_width="match_parent"android:layout_height="match_parent"tools:context=".MainActivity">

<TextView
        android:id="@+id/textView"android:layout_width="wrap_content"android:layout_height="wrap_content"android:text="TextView"/
>