package p314o0O0oOOO;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p026Oooo0o.OooO0O0;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o0O0O00 f41865OooO0oO = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final long f41866OooO0oo = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ScheduledFuture f41872OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f41871OooO0o = -1;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentLinkedQueue<CpuMetricReading> f41867OooO00o = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f41868OooO0O0 = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f41869OooO0OO = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f41870OooO0Oo = Os.sysconf(OsConstants._SC_CLK_TCK);

    @SuppressLint({"ThreadPoolCreation"})
    public o000O000() {
    }

    public final synchronized void OooO00o(long j, Timer timer) {
        this.f41871OooO0o = j;
        try {
            this.f41872OooO0o0 = this.f41868OooO0O0.scheduleAtFixedRate(new OooO0O0(1, this, timer), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f41865OooO0oO.OooO0o("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    @Nullable
    public final CpuMetricReading OooO0O0(Timer timer) throws Throwable {
        BufferedReader bufferedReader;
        long j = this.f41870OooO0Oo;
        o0O0O00 o0o0o00 = f41865OooO0oO;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f41869OooO0OO));
            try {
                long jOooO00o = timer.OooO00o() + timer.f20004OooO0Oo;
                String[] strArrSplit = bufferedReader2.readLine().split(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                long j2 = Long.parseLong(strArrSplit[13]);
                long j3 = Long.parseLong(strArrSplit[15]);
                long j4 = Long.parseLong(strArrSplit[14]);
                long j5 = Long.parseLong(strArrSplit[16]);
                CpuMetricReading.OooO0O0 oooO0O0NewBuilder = CpuMetricReading.newBuilder();
                oooO0O0NewBuilder.OooO0O0(jOooO00o);
                double d = (j4 + j5) / j;
                long j6 = f41866OooO0oo;
                bufferedReader = bufferedReader2;
                try {
                    oooO0O0NewBuilder.OooO0Oo(Math.round(d * j6));
                    oooO0O0NewBuilder.OooO0o0(Math.round(((j2 + j3) / j) * j6));
                    CpuMetricReading cpuMetricReadingBuild = oooO0O0NewBuilder.build();
                    bufferedReader.close();
                    return cpuMetricReadingBuild;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        bufferedReader.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = bufferedReader2;
            }
        } catch (IOException e) {
            o0o0o00.OooO0o("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            o0o0o00.OooO0o("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            o0o0o00.OooO0o("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            o0o0o00.OooO0o("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
