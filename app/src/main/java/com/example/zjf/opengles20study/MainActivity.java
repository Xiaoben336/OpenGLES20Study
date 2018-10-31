package com.example.zjf.opengles20study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zjf.opengles20study.glsv.ImageGLSurfaceView;
import com.example.zjf.opengles20study.glsv.SquareGLSurfaceView;
import com.example.zjf.opengles20study.glsv.TriangleGLSurfaceView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new TriangleGLSurfaceView(this)); // 绘制三角形
        //setContentView(new SquareGLSurfaceView(this)); // 绘制正方形
        try {
            setContentView(new ImageGLSurfaceView(this));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
