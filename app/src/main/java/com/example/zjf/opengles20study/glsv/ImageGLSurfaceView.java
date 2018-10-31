package com.example.zjf.opengles20study.glsv;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import com.example.zjf.opengles20study.base.BaseGLSurfaceView;
import com.example.zjf.opengles20study.image.ImageRenderer;

import java.io.IOException;

/**
*@description 展示图片GLSurfaceView
*
*@author zjf
*@date 2018/10/31 14:40
*/
public class ImageGLSurfaceView extends BaseGLSurfaceView {

    public ImageGLSurfaceView(Context context) throws IOException {
        super(context);
        setRenderer(new ImageRenderer(context));
        //setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
        //requestRender();
    }
}
