package com.zego.zegoavkit2.hardwaremonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoMEMUtils {
    public static long[] getHeap() {
        long[] heapNative = getHeapNative();
        long[] heapDalvik = getHeapDalvik();
        long j = heapDalvik[0];
        long j2 = heapDalvik[1];
        return new long[]{heapNative[0], heapNative[1], j, j2, heapNative[0] + j, heapNative[1] + j2};
    }

    public static long[] getHeapDalvik() {
        return new long[]{Runtime.getRuntime().totalMemory() >> 10, (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 10};
    }

    public static long[] getHeapNative() {
        return new long[]{Debug.getNativeHeapSize() >> 10, Debug.getNativeHeapAllocatedSize() >> 10};
    }

    public static long[] getMemInfo() {
        long[] jArr = new long[4];
        try {
            Method method = Class.forName("android.os.Process").getMethod("readProcLines", String.class, String[].class, long[].class);
            long[] jArr2 = {30, -30, 0, 0};
            Object[] objArr = {new String("/proc/meminfo"), new String[]{"MemTotal:", "MemFree:", "Buffers:", "Cached:"}, jArr2};
            if (method != null) {
                method.invoke(null, objArr);
                for (int i = 0; i < 4; i++) {
                    jArr[i] = jArr2[i] / 1024;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jArr;
    }

    public static long[] getPSS(Context context, int i) {
        long[] jArr = new long[3];
        if (i >= 0) {
            Debug.MemoryInfo memoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{i})[0];
            jArr[0] = memoryInfo.nativePss;
            jArr[1] = memoryInfo.dalvikPss;
            jArr[2] = memoryInfo.getTotalPss();
        } else {
            jArr[0] = 0;
            jArr[1] = 0;
            jArr[2] = 0;
        }
        return jArr;
    }

    public static long[] getPrivDirty(Context context, int i) {
        Debug.MemoryInfo memoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{i})[0];
        return new long[]{memoryInfo.nativePrivateDirty, memoryInfo.dalvikPrivateDirty, memoryInfo.getTotalPrivateDirty()};
    }
}
