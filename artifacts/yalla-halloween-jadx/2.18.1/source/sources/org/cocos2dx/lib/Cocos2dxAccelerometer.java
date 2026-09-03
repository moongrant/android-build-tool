package org.cocos2dx.lib;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import com.umeng.analytics.pro.ak;

/* JADX INFO: loaded from: classes3.dex */
public class Cocos2dxAccelerometer implements SensorEventListener {
    public static final float ALPHA = 0.25f;
    private static final String TAG = "Cocos2dxAccelerometer";
    public final float[] accelerometerValues = new float[3];
    public final float[] compassFieldValues = new float[3];
    private final Sensor mAccelerometer;
    private final Sensor mCompass;
    private final Context mContext;
    private final int mNaturalOrientation;
    private final SensorManager mSensorManager;

    public Cocos2dxAccelerometer(Context context) {
        this.mContext = context;
        SensorManager sensorManager = (SensorManager) context.getSystemService(ak.ac);
        this.mSensorManager = sensorManager;
        this.mAccelerometer = sensorManager.getDefaultSensor(1);
        this.mCompass = sensorManager.getDefaultSensor(2);
        this.mNaturalOrientation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    public static native void onSensorChanged(float f, float f2, float f3, long j);

    public void disable() {
        this.mSensorManager.unregisterListener(this);
    }

    public void enableAccel() {
        this.mSensorManager.registerListener(this, this.mAccelerometer, 1);
    }

    public void enableCompass() {
        this.mSensorManager.registerListener(this, this.mCompass, 1);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            if (sensorEvent.sensor.getType() == 2) {
                float[] fArr = this.compassFieldValues;
                float[] fArr2 = sensorEvent.values;
                fArr[0] = fArr2[0];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[2];
                return;
            }
            return;
        }
        float[] fArr3 = sensorEvent.values;
        float f = fArr3[0];
        float f2 = fArr3[1];
        float f3 = fArr3[2];
        float[] fArr4 = this.accelerometerValues;
        fArr4[0] = f;
        fArr4[1] = f2;
        fArr4[2] = f3;
        int i = this.mContext.getResources().getConfiguration().orientation;
        if (i == 2 && this.mNaturalOrientation != 0) {
            float f4 = -f2;
            f2 = f;
            f = f4;
        } else if (i == 1 && this.mNaturalOrientation != 0) {
            f2 = -f;
            f = f2;
        }
        int rotation = Cocos2dxHelper.getActivity().getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 2 || rotation == 3) {
            f = -f;
            f2 = -f2;
        }
        Cocos2dxGLSurfaceView.queueAccelerometer(f, f2, f3, sensorEvent.timestamp);
    }

    public void setInterval(float f) {
        this.mSensorManager.registerListener(this, this.mAccelerometer, (int) (f * 1000000.0f));
    }
}
