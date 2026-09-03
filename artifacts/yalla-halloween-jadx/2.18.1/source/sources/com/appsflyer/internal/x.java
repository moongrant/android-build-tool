package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class x implements SensorEventListener {
    public long AFInAppEventParameterName;
    private final int AFKeystoreWrapper;

    @NonNull
    private final String AFLogger$LogLevel;

    @NonNull
    private final String AFVersionDeclaration;
    private final int AppsFlyer2dXConversionCallback;
    private final Executor init;
    public double valueOf;
    public final float[][] values = new float[2][];
    public final long[] AFInAppEventType = new long[2];

    public x(Sensor sensor, Executor executor) {
        this.init = executor;
        int type = sensor.getType();
        this.AFKeystoreWrapper = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFLogger$LogLevel = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFVersionDeclaration = str;
        this.AppsFlyer2dXConversionCallback = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    private boolean AFInAppEventType(int i, @NonNull String str, @NonNull String str2) {
        return this.AFKeystoreWrapper == i && this.AFLogger$LogLevel.equals(str) && this.AFVersionDeclaration.equals(str2);
    }

    @NonNull
    private static List<Float> valueOf(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public final void AFKeystoreWrapper(@NonNull Map<x, Map<String, Object>> map, boolean z) {
        if (!AFInAppEventType()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, AFKeystoreWrapper());
            return;
        }
        map.put(this, AFKeystoreWrapper());
        if (z) {
            int length = this.values.length;
            for (int i = 0; i < length; i++) {
                this.values[i] = null;
            }
            int length2 = this.AFInAppEventType.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.AFInAppEventType[i2] = 0;
            }
            this.valueOf = 0.0d;
            this.AFInAppEventParameterName = 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return AFInAppEventType(xVar.AFKeystoreWrapper, xVar.AFLogger$LogLevel, xVar.AFVersionDeclaration);
    }

    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.init.execute(new Runnable() { // from class: com.appsflyer.internal.x.3
            @Override // java.lang.Runnable
            public final void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                x xVar = x.this;
                float[][] fArr2 = xVar.values;
                float[] fArr3 = fArr2[0];
                if (fArr3 == null) {
                    float[] fArr4 = fArr;
                    fArr2[0] = Arrays.copyOf(fArr4, fArr4.length);
                    x.this.AFInAppEventType[0] = jCurrentTimeMillis;
                    return;
                }
                float[] fArr5 = fArr2[1];
                if (fArr5 == null) {
                    float[] fArr6 = fArr;
                    float[] fArrCopyOf = Arrays.copyOf(fArr6, fArr6.length);
                    x xVar2 = x.this;
                    xVar2.values[1] = fArrCopyOf;
                    xVar2.AFInAppEventType[1] = jCurrentTimeMillis;
                    xVar2.valueOf = x.AFKeystoreWrapper(fArr3, fArrCopyOf);
                    return;
                }
                long j2 = j;
                if (50000000 <= j2 - xVar.AFInAppEventParameterName) {
                    xVar.AFInAppEventParameterName = j2;
                    if (Arrays.equals(fArr5, fArr)) {
                        x.this.AFInAppEventType[1] = jCurrentTimeMillis;
                        return;
                    }
                    double dAFKeystoreWrapper = x.AFKeystoreWrapper(fArr3, fArr);
                    x xVar3 = x.this;
                    if (dAFKeystoreWrapper > xVar3.valueOf) {
                        float[][] fArr7 = xVar3.values;
                        float[] fArr8 = fArr;
                        fArr7[1] = Arrays.copyOf(fArr8, fArr8.length);
                        x xVar4 = x.this;
                        xVar4.AFInAppEventType[1] = jCurrentTimeMillis;
                        xVar4.valueOf = dAFKeystoreWrapper;
                    }
                }
            }
        });
    }

    private boolean AFInAppEventType() {
        return this.values[0] != null;
    }

    @NonNull
    private Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFKeystoreWrapper));
        concurrentHashMap.put("sN", this.AFLogger$LogLevel);
        concurrentHashMap.put("sV", this.AFVersionDeclaration);
        float[] fArr = this.values[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", valueOf(fArr));
        }
        float[] fArr2 = this.values[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", valueOf(fArr2));
        }
        return concurrentHashMap;
    }

    public static /* synthetic */ double AFKeystoreWrapper(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i = 0; i < iMin; i++) {
            dPow += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(dPow);
    }
}
