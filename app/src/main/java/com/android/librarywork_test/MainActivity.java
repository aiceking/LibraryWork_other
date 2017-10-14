package com.android.librarywork_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
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
        intent.putExtra("test", "业务模块二返回值：超人帅吗？");
        setResult(RESULT_OK, intent);
    }
}
