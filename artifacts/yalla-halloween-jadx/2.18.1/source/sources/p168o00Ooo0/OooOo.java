package p168o00Ooo0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Looper;
import android.os.RemoteException;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.qiniu.android.http.request.Request;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ooOOOOOo.OooO00o;
import p048OoooooO.o00OOOO0;
import p145o00Oo0.o0000O00;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OOo0;
import p416o0Oo0oO0.o00oO0o;
import p442o0OoOo0.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:56:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String OooO00o(Context context) {
        if (!o00oO0o.f39583OooO00o) {
            throw new RuntimeException("SDK Need Init First!");
        }
        OooO00o oooO00o = OooO00o.OooO0O0.f53506OooO00o;
        Context applicationContext = context.getApplicationContext();
        synchronized (oooO00o) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            }
            if (oooO00o.f53500OooO00o != null) {
                try {
                    return oooO00o.OooO0O0(applicationContext);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return "";
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (!applicationContext.bindService(intent, oooO00o.f53504OooO0o0, 1)) {
                if (oooO00o.f53500OooO00o == null) {
                    return "";
                }
                return oooO00o.OooO0O0(applicationContext);
            }
            synchronized (oooO00o.f53503OooO0Oo) {
                try {
                    oooO00o.f53503OooO0Oo.wait(3000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            if (oooO00o.f53500OooO00o == null) {
                return "";
            }
            try {
                return oooO00o.OooO0O0(applicationContext);
            } catch (RemoteException e3) {
                e3.printStackTrace();
                return "";
            }
            throw th;
        }
    }

    public static void OooO0O0(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    OooO0O0(file2);
                }
                file2.delete();
            }
            file.delete();
        }
    }

    public static float[] OooO0OO(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    public static boolean OooO0Oo(String str) {
        return str.equals(Request.HttpMethodPOST) || str.equals("PATCH") || str.equals(Request.HttpMethodPUT) || str.equals("DELETE");
    }

    public static boolean OooO0o(String str) {
        return str.equals(Request.HttpMethodPOST) || str.equals(Request.HttpMethodPUT) || str.equals("PATCH");
    }

    public static boolean OooO0o0(String str) {
        return OooO0o(str) || str.equals("DELETE");
    }

    public static o00OOOO0 OooO0oO(o00OOOO0 shadow, float f, o000OOo0 o000ooo1, long j, long j2, int i) {
        if ((i & 2) != 0) {
            o000ooo1 = o000O0Oo.f32099OooO00o;
        }
        o000OOo0 shape = o000ooo1;
        boolean z = (i & 4) != 0 && Float.compare(f, (float) 0) > 0;
        if ((i & 8) != 0) {
            j = o0000O00.f32072OooO00o;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = o0000O00.f32072OooO00o;
        }
        long j4 = j2;
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (Float.compare(f, 0) <= 0 && !z) {
            return shadow;
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oOoo.OooO00o(shadow, GraphicsLayerModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, new oo0o0Oo(f, shape, z, j3, j4)));
    }

    public static RectF OooO0oo(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr.length; i += 2) {
            float fRound = Math.round(fArr[i - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i] * 10.0f) / 10.0f;
            float f = rectF.left;
            if (fRound < f) {
                f = fRound;
            }
            rectF.left = f;
            float f2 = rectF.top;
            if (fRound2 < f2) {
                f2 = fRound2;
            }
            rectF.top = f2;
            float f3 = rectF.right;
            if (fRound <= f3) {
                fRound = f3;
            }
            rectF.right = fRound;
            float f4 = rectF.bottom;
            if (fRound2 <= f4) {
                fRound2 = f4;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF;
    }
}
