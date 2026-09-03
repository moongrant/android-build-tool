package androidx.compose.compiler.plugins.kotlin.k1;

import android.os.Bundle;
import androidx.media3.common.OooO0OO;
import androidx.media3.common.OooOO0;
import androidx.media3.common.o000oOoO;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.ArrayList;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements OooO0OO.OooO00o {
    public static String OooO00o(String str, Class cls) {
        return str + cls;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public OooO0OO OooO0OO(Bundle bundle) {
        o0O00 o0o00OooO00o;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o000oOoO.f6762OooO);
        if (parcelableArrayList == null) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
            o0o00OooO00o = o0O00.f19060OooO0oo;
        } else {
            o0o00OooO00o = o00oO0o.OooO00o(OooOO0.f6396o00oO0o, parcelableArrayList);
        }
        return new o000oOoO(bundle.getString(o000oOoO.f6763OooOO0, ""), (OooOO0[]) o0o00OooO00o.toArray(new OooOO0[0]));
    }
}
