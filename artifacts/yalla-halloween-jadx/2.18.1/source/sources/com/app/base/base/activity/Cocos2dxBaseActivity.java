package com.app.base.base.activity;

import android.app.NotificationManager;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import com.app.base.application.App;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;
import org.cocos2dx.lib.Cocos2dxHelper;
import org.cocos2dx.lib.Cocos2dxRenderer;

/* JADX INFO: loaded from: classes.dex */
public class Cocos2dxBaseActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public Cocos2dxGLSurfaceView f11471OoooOo0 = null;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int[] f11472OoooOoO = null;

    public class OooO00o implements GLSurfaceView.EGLConfigChooser {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f11473OooO00o;

        public OooO00o(int[] iArr) {
            this.f11473OooO00o = iArr;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[][] iArr = new int[4][];
            int[] iArr2 = new int[19];
            iArr2[0] = 12324;
            int[] iArr3 = this.f11473OooO00o;
            iArr2[1] = iArr3[0];
            iArr2[2] = 12323;
            iArr2[3] = iArr3[1];
            iArr2[4] = 12322;
            iArr2[5] = iArr3[2];
            iArr2[6] = 12321;
            iArr2[7] = iArr3[3];
            iArr2[8] = 12325;
            iArr2[9] = iArr3[4];
            iArr2[10] = 12326;
            iArr2[11] = iArr3[5];
            iArr2[12] = 12338;
            iArr2[13] = iArr3[6] > 0 ? 1 : 0;
            iArr2[14] = 12337;
            iArr2[15] = iArr3[6];
            iArr2[16] = 12352;
            iArr2[17] = 4;
            iArr2[18] = 12344;
            iArr[0] = iArr2;
            int[] iArr4 = new int[19];
            iArr4[0] = 12324;
            iArr4[1] = iArr3[0];
            iArr4[2] = 12323;
            iArr4[3] = iArr3[1];
            iArr4[4] = 12322;
            iArr4[5] = iArr3[2];
            iArr4[6] = 12321;
            iArr4[7] = iArr3[3];
            iArr4[8] = 12325;
            iArr4[9] = iArr3[4] >= 24 ? 16 : iArr3[4];
            iArr4[10] = 12326;
            iArr4[11] = iArr3[5];
            iArr4[12] = 12338;
            iArr4[13] = iArr3[6] > 0 ? 1 : 0;
            iArr4[14] = 12337;
            iArr4[15] = iArr3[6];
            iArr4[16] = 12352;
            iArr4[17] = 4;
            iArr4[18] = 12344;
            iArr[1] = iArr4;
            int[] iArr5 = new int[19];
            iArr5[0] = 12324;
            iArr5[1] = iArr3[0];
            iArr5[2] = 12323;
            iArr5[3] = iArr3[1];
            iArr5[4] = 12322;
            iArr5[5] = iArr3[2];
            iArr5[6] = 12321;
            iArr5[7] = iArr3[3];
            iArr5[8] = 12325;
            iArr5[9] = iArr3[4] >= 24 ? 16 : iArr3[4];
            iArr5[10] = 12326;
            iArr5[11] = iArr3[5];
            iArr5[12] = 12338;
            iArr5[13] = 0;
            iArr5[14] = 12337;
            iArr5[15] = 0;
            iArr5[16] = 12352;
            iArr5[17] = 4;
            iArr5[18] = 12344;
            iArr[2] = iArr5;
            iArr[3] = new int[]{12352, 4, 12344};
            for (int i = 0; i < 4; i++) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr6 = new int[1];
                EGLConfig eGLConfig = (!egl10.eglChooseConfig(eGLDisplay, iArr[i], eGLConfigArr, 1, iArr6) || iArr6[0] <= 0) ? null : eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
            }
            return null;
        }
    }

    static {
        try {
            System.loadLibrary(App.f11458Oooo0oO.getPackageManager().getApplicationInfo(App.f11458Oooo0oO.getPackageName(), 128).metaData.getString("android.app.lib_name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Cocos2dxBaseActivity() {
        new Cocos2dxHelper();
    }

    private static native int[] getGLContextAttrs();

    public final void init() {
        Cocos2dxGLSurfaceView cocos2dxGLSurfaceView = new Cocos2dxGLSurfaceView(this);
        if (this.f11472OoooOoO[3] > 0) {
            cocos2dxGLSurfaceView.getHolder().setFormat(-3);
        }
        cocos2dxGLSurfaceView.setEGLConfigChooser(new OooO00o(this.f11472OoooOoO));
        cocos2dxGLSurfaceView.setFocusableInTouchMode(true);
        cocos2dxGLSurfaceView.setZOrderOnTop(true);
        cocos2dxGLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        cocos2dxGLSurfaceView.getHolder().setFormat(-3);
        this.f11471OoooOo0 = cocos2dxGLSurfaceView;
        cocos2dxGLSurfaceView.setPreserveEGLContextOnPause(true);
        this.f11471OoooOo0.setCocos2dxRenderer(new Cocos2dxRenderer());
        Cocos2dxHelper.init(this);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator<PreferenceManager.OnActivityResultListener> it = Cocos2dxHelper.getOnActivityResultListeners().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11472OoooOoO = getGLContextAttrs();
        init();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((NotificationManager) getSystemService("notification")).cancelAll();
        this.f11471OoooOo0 = null;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Cocos2dxHelper.onPause();
        this.f11471OoooOo0.onPause();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Cocos2dxHelper.onResume();
        this.f11471OoooOo0.onResume();
    }
}
