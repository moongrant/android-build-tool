package androidx.media3.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0O0O implements androidx.media3.common.OooO0OO.OooO00o, o00O0Oo.o000000.OooO0O0 {
    @Override // androidx.media3.common.OooO0OO.OooO00o
    public final androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        String str = o00O0OO0.f9459OooOOO0;
        p080o000OoO.o00Oo0.OooO0O0(bundle.containsKey(str), "uid should be set.");
        int i = bundle.getInt(str);
        String str2 = o00O0OO0.f9458OooOOO;
        p080o000OoO.o00Oo0.OooO0O0(bundle.containsKey(str2), "type should be set.");
        int i2 = bundle.getInt(str2);
        int i3 = bundle.getInt(o00O0OO0.f9460OooOOOO, 0);
        int i4 = bundle.getInt(o00O0OO0.f9465OooOo0, 0);
        String string = bundle.getString(o00O0OO0.f9461OooOOOo);
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("package name should be set.");
        }
        String string2 = bundle.getString(o00O0OO0.f9463OooOOo0, "");
        IBinder iBinderOooO00o = p063o0000oO.Oooo0.OooO00o(bundle, o00O0OO0.f9464OooOOoo);
        ComponentName componentName = (ComponentName) bundle.getParcelable(o00O0OO0.f9462OooOOo);
        Bundle bundle2 = bundle.getBundle(o00O0OO0.f9466OooOo00);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new o00O0OO0(i, i2, i3, i4, string, string2, componentName, iBinderOooO00o, bundle2);
    }
}
