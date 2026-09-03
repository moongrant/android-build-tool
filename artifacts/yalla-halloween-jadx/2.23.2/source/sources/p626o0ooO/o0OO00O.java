package p626o0ooO;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import p315o0O0oOo.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00O implements o000OO.OooO00o {
    @Override // o0O0oOo.o000OO.OooO00o
    public final String OooO0O0(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }
}
