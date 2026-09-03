package org.cocos2dx.lib;

import OooO00o.OooO00o;
import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public class Cocos2dxGLSurfaceView extends GLSurfaceView {
    private static final String TAG = "Cocos2dxGLSurfaceView";
    private static Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private boolean canTouchThrough;
    private Cocos2dxRenderer mCocos2dxRenderer;
    private boolean mMultipleTouchEnabled;
    private boolean mSoftKeyboardShown;

    public Cocos2dxGLSurfaceView(Context context) {
        super(context);
        this.mSoftKeyboardShown = false;
        this.mMultipleTouchEnabled = false;
        this.canTouchThrough = true;
        initView();
    }

    private static void dumpMotionEvent(MotionEvent motionEvent) {
        StringBuilder sb = new StringBuilder();
        int action = motionEvent.getAction();
        int i = action & KotlinVersion.MAX_COMPONENT_VALUE;
        sb.append("event ACTION_");
        sb.append(new String[]{"DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE", "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?"}[i]);
        if (i == 5 || i == 6) {
            sb.append("(pid ");
            sb.append(action >> 8);
            sb.append(")");
        }
        sb.append("[");
        int i2 = 0;
        while (i2 < motionEvent.getPointerCount()) {
            sb.append("#");
            sb.append(i2);
            sb.append("(pid ");
            sb.append(motionEvent.getPointerId(i2));
            sb.append(")=");
            sb.append((int) motionEvent.getX(i2));
            sb.append(",");
            sb.append((int) motionEvent.getY(i2));
            i2++;
            if (i2 < motionEvent.getPointerCount()) {
                sb.append(";");
            }
        }
        sb.append("]");
        Log.d(TAG, sb.toString());
    }

    private String getContentText() {
        return this.mCocos2dxRenderer.getContentText();
    }

    public static Cocos2dxGLSurfaceView getInstance() {
        return mCocos2dxGLSurfaceView;
    }

    public static void queueAccelerometer(final float f, final float f2, final float f3, final long j) {
        mCocos2dxGLSurfaceView.queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxAccelerometer.onSensorChanged(f, f2, f3, j);
            }
        });
    }

    public void deleteBackward() {
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.15
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleDeleteBackward();
            }
        });
    }

    public void initView() {
        setEGLContextClientVersion(2);
        setFocusableInTouchMode(true);
        mCocos2dxGLSurfaceView = this;
    }

    public void insertText(final String str) {
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.14
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleInsertText(str);
            }
        });
    }

    public boolean isCanTouchThrough() {
        return this.canTouchThrough;
    }

    public boolean isMultipleTouchEnabled() {
        return this.mMultipleTouchEnabled;
    }

    public boolean isSoftKeyboardShown() {
        return this.mSoftKeyboardShown;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(final int i, KeyEvent keyEvent) {
        if (i != 4 && i != 66 && i != 82 && i != 85) {
            switch (i) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
        }
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.12
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleKeyDown(i);
            }
        });
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(final int i, KeyEvent keyEvent) {
        if (i != 4 && i != 66 && i != 82 && i != 85) {
            switch (i) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return super.onKeyUp(i, keyEvent);
            }
        }
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.13
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleKeyUp(i);
            }
        });
        return true;
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleOnPause();
            }
        });
        setRenderMode(0);
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        setRenderMode(1);
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleOnResume();
            }
        });
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (isInEditMode()) {
            return;
        }
        this.mCocos2dxRenderer.setScreenWidthAndHeight(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        final int[] iArr = new int[pointerCount];
        final float[] fArr = new float[pointerCount];
        final float[] fArr2 = new float[pointerCount];
        if (this.mSoftKeyboardShown) {
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(((Activity) getContext()).getCurrentFocus().getWindowToken(), 0);
            requestFocus();
            this.mSoftKeyboardShown = false;
        }
        for (int i = 0; i < pointerCount; i++) {
            iArr[i] = motionEvent.getPointerId(i);
            fArr[i] = motionEvent.getX(i);
            fArr2[i] = motionEvent.getY(i);
        }
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            final int pointerId = motionEvent.getPointerId(0);
            final float f = fArr[0];
            final float f2 = fArr2[0];
            queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.5
                @Override // java.lang.Runnable
                public void run() {
                    Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionDown(pointerId, f, f2);
                }
            });
        } else if (action == 1) {
            final int pointerId2 = motionEvent.getPointerId(0);
            final float f3 = fArr[0];
            final float f4 = fArr2[0];
            queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.9
                @Override // java.lang.Runnable
                public void run() {
                    Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionUp(pointerId2, f3, f4);
                }
            });
        } else if (action != 2) {
            if (action != 3) {
                if (action == 5) {
                    int action2 = motionEvent.getAction() >> 8;
                    if (this.mMultipleTouchEnabled || action2 == 0) {
                        final int pointerId3 = motionEvent.getPointerId(action2);
                        final float x = motionEvent.getX(action2);
                        final float y = motionEvent.getY(action2);
                        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.4
                            @Override // java.lang.Runnable
                            public void run() {
                                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionDown(pointerId3, x, y);
                            }
                        });
                    }
                } else if (action == 6) {
                    int action3 = motionEvent.getAction() >> 8;
                    if (this.mMultipleTouchEnabled || action3 == 0) {
                        final int pointerId4 = motionEvent.getPointerId(action3);
                        final float x2 = motionEvent.getX(action3);
                        final float y2 = motionEvent.getY(action3);
                        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.8
                            @Override // java.lang.Runnable
                            public void run() {
                                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionUp(pointerId4, x2, y2);
                            }
                        });
                    }
                }
            } else if (this.mMultipleTouchEnabled) {
                queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.11
                    @Override // java.lang.Runnable
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionCancel(iArr, fArr, fArr2);
                    }
                });
            } else {
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    if (iArr[i2] == 0) {
                        final int[] iArr2 = {0};
                        final float[] fArr3 = {fArr[i2]};
                        final float[] fArr4 = {fArr2[i2]};
                        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.10
                            @Override // java.lang.Runnable
                            public void run() {
                                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionCancel(iArr2, fArr3, fArr4);
                            }
                        });
                        break;
                    }
                }
            }
        } else if (this.mMultipleTouchEnabled) {
            queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.7
                @Override // java.lang.Runnable
                public void run() {
                    Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionMove(iArr, fArr, fArr2);
                }
            });
        } else {
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (iArr[i3] == 0) {
                    final int[] iArr3 = {0};
                    final float[] fArr5 = {fArr[i3]};
                    final float[] fArr6 = {fArr2[i3]};
                    queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.6
                        @Override // java.lang.Runnable
                        public void run() {
                            Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionMove(iArr3, fArr5, fArr6);
                        }
                    });
                    break;
                }
            }
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("canTouchThrough:");
        sbOooO0O0.append(this.canTouchThrough);
        Log.d("COCOS 点击状态", sbOooO0O0.toString());
        return !this.canTouchThrough;
    }

    public void setCanTouchThrough(boolean z) {
        this.canTouchThrough = z;
    }

    public void setCocos2dxRenderer(Cocos2dxRenderer cocos2dxRenderer) {
        this.mCocos2dxRenderer = cocos2dxRenderer;
        setRenderer(cocos2dxRenderer);
    }

    public void setMultipleTouchEnabled(boolean z) {
        this.mMultipleTouchEnabled = z;
    }

    public void setSoftKeyboardShown(boolean z) {
        this.mSoftKeyboardShown = z;
    }

    public Cocos2dxGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSoftKeyboardShown = false;
        this.mMultipleTouchEnabled = false;
        this.canTouchThrough = true;
        initView();
    }
}
