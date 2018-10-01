package myapplication.prince.example.com.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class ToastMessage extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(ToastMessage.this,"hii,it's my first library",Toast.LENGTH_SHORT).show();
    }
}
