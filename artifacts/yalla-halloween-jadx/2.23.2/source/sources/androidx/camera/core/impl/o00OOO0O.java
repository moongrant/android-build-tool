package androidx.camera.core.impl;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import java.util.ArrayList;
import p238o00oOooo.o0O0o000;
import p238o00oOooo.o0OO00OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO0O implements FeatureManager.Callback, androidx.media3.common.OooO0OO.OooO00o, o00oo0o0.o000OO00.OooO00o {
    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        String str = androidx.media3.common.OooO00o.f6342OooOO0O;
        int i = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = androidx.media3.common.OooO00o.f6343OooOO0o;
        int i2 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = androidx.media3.common.OooO00o.f6345OooOOO0;
        int i3 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = androidx.media3.common.OooO00o.f6344OooOOO;
        int i4 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = androidx.media3.common.OooO00o.f6346OooOOOO;
        return new androidx.media3.common.OooO00o(i, i2, i3, i4, bundle.containsKey(str5) ? bundle.getInt(str5) : 0);
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            o0O0o000.OooO00o OooO00o2 = o0OO00OO.OooO00o();
            OooO00o2.OooO0O0(cursor.getString(1));
            OooO00o2.OooO0OO(o0O0o.OooO00o.OooO0O0(cursor.getInt(2)));
            String string = cursor.getString(3);
            OooO00o2.f40009OooO0O0 = string == null ? null : Base64.decode(string, 0);
            arrayList.add(OooO00o2.OooO00o());
        }
        return arrayList;
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        FacebookSdk.m4042sdkInitialize$lambda4(z);
    }
}
