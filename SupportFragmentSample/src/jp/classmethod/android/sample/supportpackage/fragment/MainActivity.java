package jp.classmethod.android.sample.supportpackage.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction tx = manager.beginTransaction();
        tx.add(R.id.layout_a, new MainFragment(), "fragment_a");
        tx.add(R.id.layout_b, new MainFragment(), "fragment_b");
        tx.commit();
        
    }

}
