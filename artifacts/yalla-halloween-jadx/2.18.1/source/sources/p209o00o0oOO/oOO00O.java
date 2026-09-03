package p209o00o0oOO;

import android.content.Context;
import android.util.TypedValue;
import com.billy.android.swipe.SmartSwipeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f33368OooO00o;

    public interface OooO00o {
        SmartSwipeWrapper OooO00o();
    }

    static {
        try {
            if (OooO0OO("com.billy.android.swipe.androidx.WrapperFactory")) {
                return;
            }
            OooO0OO("com.billy.android.swipe.support.WrapperFactory");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static int OooO00o(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static int OooO0O0(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static boolean OooO0OO(String str) {
        try {
            Object objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof OooO00o)) {
                return true;
            }
            f33368OooO00o = (OooO00o) objNewInstance;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
