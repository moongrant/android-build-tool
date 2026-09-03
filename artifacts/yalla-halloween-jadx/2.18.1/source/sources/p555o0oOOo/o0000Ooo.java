package p555o0oOOo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f44644OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f44645OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f44646OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f44647OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final int f44648OooO0o0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f44649OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ActivityManager f44650OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO0O0 f44651OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f44652OooO0Oo;

        static {
            f44648OooO0o0 = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public OooO00o(Context context) {
            this.f44652OooO0Oo = f44648OooO0o0;
            this.f44649OooO00o = context;
            this.f44650OooO0O0 = (ActivityManager) context.getSystemService("activity");
            this.f44651OooO0OO = new OooO0O0(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f44650OooO0O0.isLowRamDevice()) {
                return;
            }
            this.f44652OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DisplayMetrics f44653OooO00o;

        public OooO0O0(DisplayMetrics displayMetrics) {
            this.f44653OooO00o = displayMetrics;
        }
    }

    public o0000Ooo(OooO00o oooO00o) {
        this.f44646OooO0OO = oooO00o.f44649OooO00o;
        int i = oooO00o.f44650OooO0O0.isLowRamDevice() ? 2097152 : 4194304;
        this.f44647OooO0Oo = i;
        ActivityManager activityManager = oooO00o.f44650OooO0O0;
        int iRound = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = oooO00o.f44651OooO0OO.f44653OooO00o;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(oooO00o.f44652OooO0Oo * f);
        int iRound3 = Math.round(f * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f44645OooO0O0 = iRound3;
            this.f44644OooO00o = iRound2;
        } else {
            float f2 = i2 / (oooO00o.f44652OooO0Oo + 2.0f);
            this.f44645OooO0O0 = Math.round(2.0f * f2);
            this.f44644OooO00o = Math.round(f2 * oooO00o.f44652OooO0Oo);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Calculation complete, Calculated memory cache size: ");
            sbOooO0o0.append(OooO00o(this.f44645OooO0O0));
            sbOooO0o0.append(", pool size: ");
            sbOooO0o0.append(OooO00o(this.f44644OooO00o));
            sbOooO0o0.append(", byte array size: ");
            sbOooO0o0.append(OooO00o(i));
            sbOooO0o0.append(", memory class limited? ");
            sbOooO0o0.append(i3 > iRound);
            sbOooO0o0.append(", max size: ");
            sbOooO0o0.append(OooO00o(iRound));
            sbOooO0o0.append(", memoryClass: ");
            sbOooO0o0.append(oooO00o.f44650OooO0O0.getMemoryClass());
            sbOooO0o0.append(", isLowMemoryDevice: ");
            sbOooO0o0.append(oooO00o.f44650OooO0O0.isLowRamDevice());
            Log.d("MemorySizeCalculator", sbOooO0o0.toString());
        }
    }

    public final String OooO00o(int i) {
        return Formatter.formatFileSize(this.f44646OooO0OO, i);
    }
}
