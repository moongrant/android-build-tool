package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;
import io.agora.rtc.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements SensorEventListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f8295OooO00o = new float[16];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f8296OooO0O0 = new float[16];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float[] f8297OooO0OO = new float[16];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float[] f8298OooO0Oo = new float[3];

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC0154OooO00o[] f8299OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Display f8300OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f8301OooO0oO;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.spherical.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0154OooO00o {
        void OooO0OO(float f, float[] fArr);
    }

    public OooO00o(Display display, InterfaceC0154OooO00o... interfaceC0154OooO00oArr) {
        this.f8300OooO0o0 = display;
        this.f8299OooO0o = interfaceC0154OooO00oArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f8295OooO00o;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f8300OooO0o0.getRotation();
        float[] fArr3 = this.f8296OooO0O0;
        if (rotation != 0) {
            int i2 = Constants.ERR_WATERMARK_READ;
            if (rotation != 1) {
                i = Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f8298OooO0Oo;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(this.f8295OooO00o, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr5 = this.f8295OooO00o;
        if (!this.f8301OooO0oO) {
            o000OOo0.OooO0OO.OooO00o(this.f8297OooO0OO, fArr5);
            this.f8301OooO0oO = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f8296OooO0O0, 0, this.f8297OooO0OO, 0);
        for (InterfaceC0154OooO00o interfaceC0154OooO00o : this.f8299OooO0o) {
            interfaceC0154OooO00o.OooO0OO(f, fArr2);
        }
    }
}
