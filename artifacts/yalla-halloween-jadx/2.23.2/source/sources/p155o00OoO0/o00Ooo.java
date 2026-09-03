package p155o00OoO0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.qiniu.android.storage.Configuration;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f37948OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37949OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f37950OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final int f37951OooO0o0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37952OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ActivityManager f37953OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f37954OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f37955OooO0Oo;

        static {
            f37951OooO0o0 = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public OooO00o(Context context) {
            this.f37955OooO0Oo = f37951OooO0o0;
            this.f37952OooO00o = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f37953OooO0O0 = activityManager;
            this.f37954OooO0OO = new OooO0O0(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
                return;
            }
            this.f37955OooO0Oo = 0.0f;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DisplayMetrics f37956OooO00o;

        public OooO0O0(DisplayMetrics displayMetrics) {
            this.f37956OooO00o = displayMetrics;
        }
    }

    public o00Ooo(OooO00o oooO00o) {
        Context context = oooO00o.f37952OooO00o;
        ActivityManager activityManager = oooO00o.f37953OooO0O0;
        int i = activityManager.isLowRamDevice() ? 2097152 : Configuration.BLOCK_SIZE;
        this.f37950OooO0OO = i;
        int iRound = Math.round(activityManager.getMemoryClass() * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = oooO00o.f37954OooO0OO.f37956OooO00o;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = oooO00o.f37955OooO0Oo;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f37949OooO0O0 = iRound3;
            this.f37948OooO00o = iRound2;
        } else {
            float f3 = i2 / (f2 + 2.0f);
            this.f37949OooO0O0 = Math.round(2.0f * f3);
            this.f37948OooO00o = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f37949OooO0O0));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f37948OooO00o));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
