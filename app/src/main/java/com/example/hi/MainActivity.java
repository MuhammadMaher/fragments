package com.example.hi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle=new Bundle();
        bundle.putString("keyValue","Hello from activity to fragment");
        // set FragmentClass Arguments

        ChatsFragment fragment1 = new ChatsFragment();
        fragment1.setArguments(bundle);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,new ChatsFragment())
                . commit();


}

    public void chats(View view) {
            Bundle bundle=new Bundle();
            bundle.putString("keyValue","Hello from activity to fragment");
            // set FragmentClass Arguments

       ChatsFragment fragment1 = new ChatsFragment();
            fragment1.setArguments(bundle);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,new ChatsFragment())
                . commit();
    }

    public void status(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,new StatusFragment())
                . commit();

    }

    public void Calls(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,new CallsFragment())
                . commit();
    }
}