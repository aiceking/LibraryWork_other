package com.android.librarywork_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import butterknife.BindView;
import butterknife.ButterKnife;
@Route(path = "/workModule_other/1",group = "LibraryWork_other")
public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.tv_test)
    TextView tvTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_main);
        ButterKnife.bind(this);
        tvTest.setText(getIntent().getStringExtra("test"));
        Intent intent = new Intent();
        intent.putExtra("test", "超人帅吗？");
        setResult(RESULT_OK, intent);
    }
}
