package com.sl.java.opengl.rendering.cnative;

/*********************************************************************
 * Created by shenglei on 2022/6/26.
 *********************************************************************/
public class NativeRender extends JNIBase{
    public NativeRender() {
        nativeOnInit();
    }

    public void onSurfaceCreated() {
        nativeOnSurfaceCreated();
    }

    public void onSurfaceChanged(int width, int height) {
        nativeOnSurfaceChanged(width, height);
    }

    public void onDrawFrame() {
        nativeOnDrawFrame();
    }


    private native void nativeOnInit();
    private native void nativeOnUnInit();
    private native void nativeOnSurfaceCreated();
    private native void nativeOnSurfaceChanged(int width, int height);
    private native void nativeOnDrawFrame();
}