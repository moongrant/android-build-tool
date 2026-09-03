package o00OO0O0;

import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.logging.type.LogSeverity;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final File f37226OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f37227OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final boolean f37228OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static volatile o00Oo0 f37229OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static volatile int f37230OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f37231OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37232OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f37233OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public int f37234OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f37236OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f37235OooO0o = new AtomicBoolean(false);

    static {
        int i = Build.VERSION.SDK_INT;
        f37227OooO0oO = i < 29;
        f37228OooO0oo = i >= 26;
        f37226OooO = new File("/proc/self/fd");
        f37230OooOO0O = -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
    @VisibleForTesting
    public o00Oo0() {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT == 26) {
            Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else {
                    if (Build.MODEL.startsWith((String) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
        } else {
            z = false;
            break;
        }
        if (!z) {
            z2 = Build.VERSION.SDK_INT != 27 ? false : Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL) ? false : true;
        }
        this.f37231OooO00o = z2;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f37232OooO0O0 = 20000;
            this.f37233OooO0OO = 0;
        } else {
            this.f37232OooO0O0 = LogSeverity.ALERT_VALUE;
            this.f37233OooO0OO = 128;
        }
    }

    public final boolean OooO00o(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f37231OooO00o) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f37228OooO0oo) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f37227OooO0oO && !this.f37235OooO0o.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i3 = this.f37233OooO0OO;
        if (i < i3) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i2 < i3) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        synchronized (this) {
            int i4 = this.f37234OooO0Oo + 1;
            this.f37234OooO0Oo = i4;
            if (i4 >= 50) {
                this.f37234OooO0Oo = 0;
                int length = f37226OooO.list().length;
                long j = f37230OooOO0O != -1 ? f37230OooOO0O : this.f37232OooO0O0;
                boolean z4 = ((long) length) < j;
                this.f37236OooO0o0 = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
                }
            }
            z3 = this.f37236OooO0o0;
        }
        if (z3) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
