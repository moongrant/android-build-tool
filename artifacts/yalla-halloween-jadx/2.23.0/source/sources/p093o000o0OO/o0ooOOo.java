package p093o000o0OO;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f35349OooO00o = o000oOoO.OooO0o0("PackageManagerHelper");

    public static void OooO00o(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        String str = f35349OooO00o;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            o000ooooOooO0OO.OooO00o(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            o000oOoO o000ooooOooO0OO2 = o000oOoO.OooO0OO();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            o000ooooOooO0OO2.OooO00o(str, String.format("%s could not be %s", objArr2), e);
        }
    }
}
