package com.example.zjf.opengles20study.glsv;

import android.content.Context;
import android.opengl.GLES20;
import android.util.AttributeSet;

import com.example.zjf.opengles20study.base.BaseGLSurfaceView;
import com.example.zjf.opengles20study.shape.triangle.Triangle;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
*@description  绘制各类三角形的GLSurfaceView
*
*@author zjf
*@date 2018/10/31 11:15
*/
public class TriangleGLSurfaceView extends BaseGLSurfaceView {

    public TriangleGLSurfaceView(Context context) {
        super(context);
        setRenderer(new TriangleRenderer()); // 绘制三角形
    }

    public TriangleGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setRenderer(new TriangleRenderer()); // 绘制三角形
    }

    class TriangleRenderer implements Renderer{
        private Triangle triangle;

        @Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {
            triangle = new Triangle();
        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {
            GLES20.glViewport(0, 0, width, height);
        }

        @Override
        public void onDrawFrame(GL10 gl) {
            triangle.draw();
        }
    }
}
