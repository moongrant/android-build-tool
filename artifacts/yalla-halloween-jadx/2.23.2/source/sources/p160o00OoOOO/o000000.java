package p160o00OoOOO;

import android.os.Build;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean f38054OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f38055OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final File f38056OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static volatile o000000 f38057OooO0oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public int f38059OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38060OooO0OO = true;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f38061OooO0Oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f38058OooO00o = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f38055OooO0o0 = i < 29;
        f38054OooO0o = i >= 28;
        f38056OooO0oO = new File("/proc/self/fd");
    }

    @VisibleForTesting
    public o000000() {
    }

    public static o000000 OooO00o() {
        if (f38057OooO0oo == null) {
            synchronized (o000000.class) {
                if (f38057OooO0oo == null) {
                    f38057OooO0oo = new o000000();
                }
            }
        }
        return f38057OooO0oo;
    }

    public final int OooO0O0() {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return 500;
        }
        return this.f38058OooO00o;
    }

    public final boolean OooO0OO(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f38054OooO0o) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f38055OooO0o0 && !this.f38061OooO0Oo.get()) {
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
        if (i < 0 || i2 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        synchronized (this) {
            int i3 = this.f38059OooO0O0 + 1;
            this.f38059OooO0O0 = i3;
            if (i3 >= 50) {
                this.f38059OooO0O0 = 0;
                int length = f38056OooO0oO.list().length;
                long jOooO0O0 = OooO0O0();
                boolean z4 = ((long) length) < jOooO0O0;
                this.f38060OooO0OO = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jOooO0O0);
                }
            }
            z3 = this.f38060OooO0OO;
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
