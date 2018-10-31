package com.example.zjf.opengles20study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zjf.opengles20study.glsv.TriangleGLSurfaceView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TriangleGLSurfaceView(this)); // 绘制三角形
    }
}
