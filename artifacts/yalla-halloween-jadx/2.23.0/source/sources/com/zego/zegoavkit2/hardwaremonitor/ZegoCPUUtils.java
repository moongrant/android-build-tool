package com.zego.zegoavkit2.hardwaremonitor;

import android.os.Process;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoCPUUtils {
    private RandomAccessFile appProcStatFile;
    private RandomAccessFile sysProcStatFile;
    private final long tickInHz = ZegoTimeUtilJNI.getTimeTick();
    private final int cpuCount = Runtime.getRuntime().availableProcessors();
    private float appCpuUseTimeLast = 0.0f;
    private float appCpuUsage = 0.0f;
    private long sysCpuTotalTimeLast = 0;
    private long sysCpuIdelTimeLast = 0;
    private float sysCpuUsage = 0.0f;

    public ZegoCPUUtils() {
        try {
            this.appProcStatFile = new RandomAccessFile(String.format("/proc/%d/stat", Integer.valueOf(Process.myPid())), "r");
        } catch (IOException unused) {
        }
        try {
            this.sysProcStatFile = new RandomAccessFile("proc/stat", "r");
        } catch (IOException unused2) {
        }
    }

    private static String[] getStrsFromFile(RandomAccessFile randomAccessFile) {
        String line;
        if (randomAccessFile == null) {
            return null;
        }
        try {
            randomAccessFile.seek(0L);
            line = randomAccessFile.readLine();
        } catch (IOException unused) {
            line = null;
        }
        if (line.isEmpty()) {
            return null;
        }
        return line.split("\\s+");
    }

    private void updateCpuUsage() {
        long jCurrentTimeMillis;
        long j;
        String[] strsFromFile = getStrsFromFile(this.appProcStatFile);
        if (strsFromFile == null || strsFromFile.length < 52) {
            return;
        }
        long j2 = (long) (((Long.parseLong(strsFromFile[16]) + (Long.parseLong(strsFromFile[15]) + (Long.parseLong(strsFromFile[14]) + Long.parseLong(strsFromFile[13])))) * 1000.0f) / this.tickInHz);
        String[] strsFromFile2 = getStrsFromFile(this.sysProcStatFile);
        if (strsFromFile2 == null || strsFromFile2.length < 8) {
            jCurrentTimeMillis = System.currentTimeMillis() * ((long) this.cpuCount);
            j = jCurrentTimeMillis;
        } else {
            long j3 = Long.parseLong(strsFromFile2[7]) + Long.parseLong(strsFromFile2[6]) + Long.parseLong(strsFromFile2[5]) + Long.parseLong(strsFromFile2[4]) + Long.parseLong(strsFromFile2[3]) + Long.parseLong(strsFromFile2[2]) + Long.parseLong(strsFromFile2[1]);
            long j4 = Long.parseLong(strsFromFile2[5]) + Long.parseLong(strsFromFile2[4]);
            long j5 = this.tickInHz;
            jCurrentTimeMillis = (long) ((j3 * 1000.0f) / j5);
            j = (long) ((j4 * 1000.0f) / j5);
        }
        float f = j2;
        float f2 = jCurrentTimeMillis - this.sysCpuTotalTimeLast;
        this.appCpuUsage = ((f - this.appCpuUseTimeLast) * 100.0f) / f2;
        this.sysCpuUsage = ((f2 - (j - this.sysCpuIdelTimeLast)) * 100.0f) / f2;
        this.appCpuUseTimeLast = f;
        this.sysCpuIdelTimeLast = j;
        this.sysCpuTotalTimeLast = jCurrentTimeMillis;
    }

    public double[] getCpuUsage() {
        double[] dArr;
        synchronized (this) {
            updateCpuUsage();
            dArr = new double[2];
            float f = this.appCpuUsage;
            dArr[0] = ((double) f) > 0.0d ? f : 0.0d;
            float f2 = this.sysCpuUsage;
            dArr[1] = ((double) f2) > 0.0d ? f2 : 0.0d;
        }
        return dArr;
    }
}
