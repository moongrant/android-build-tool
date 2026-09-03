package p692oO000o0o;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Object f52703OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Class<?> f52704OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Method f52705OooO0OO;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f52704OooO0O0 = cls;
            f52703OooO00o = cls.newInstance();
            f52704OooO0O0.getMethod("getUDID", Context.class);
            f52705OooO0OO = f52704OooO0O0.getMethod("getOAID", Context.class);
            f52704OooO0O0.getMethod("getVAID", Context.class);
            f52704OooO0O0.getMethod("getAAID", Context.class);
        } catch (Exception e) {
            Log.e("IdentifierManager", "reflect exception!", e);
        }
    }
}
