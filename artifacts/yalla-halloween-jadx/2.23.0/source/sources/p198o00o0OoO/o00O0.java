package p198o00o0OoO;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import p314o0O0oOo0.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0 implements o00OO00O.OooO00o, o000O0Oo.OooO00o {
    @Override // o0O0oOo0.o000O0Oo.OooO00o
    public final String OooO0O0(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // o00o0OoO.o00OO00O.OooO00o
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }
}
