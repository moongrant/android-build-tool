package p326o0O0ooO;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f36978OooO00o = o0OoOo0.OooO0o0("PackageManagerHelper");

    public static void OooO00o(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
            String str = f36978OooO00o;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            o0oooo0OooO0OO.OooO00o(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            o0OoOo0 o0oooo0OooO0OO2 = o0OoOo0.OooO0OO();
            String str2 = f36978OooO00o;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            o0oooo0OooO0OO2.OooO00o(str2, String.format("%s could not be %s", objArr2), e);
        }
    }
}
