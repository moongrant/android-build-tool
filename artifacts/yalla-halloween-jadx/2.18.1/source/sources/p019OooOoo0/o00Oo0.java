package p019OooOoo0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import p008OooOOOo.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ComponentName f374OooO0O0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o00Oo0(OooO0OO oooO0OO, ComponentName componentName) {
        this.f373OooO00o = oooO0OO;
        this.f374OooO0O0 = componentName;
    }

    public static boolean OooO00o(Context context, String str, o00Ooo o00ooo2) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, o00ooo2, 33);
    }
}
