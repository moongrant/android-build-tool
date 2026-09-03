package com.ishumei.l111l11111Il;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l11l1111lIIl {
    public static List<String> l1111l111111Il() {
        ArrayList arrayList = new ArrayList();
        try {
            Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
            if (context != null) {
                for (Sensor sensor : ((SensorManager) context.getSystemService(ak.ac)).getSensorList(-1)) {
                    arrayList.add(sensor.getType() + "," + sensor.getVendor());
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
