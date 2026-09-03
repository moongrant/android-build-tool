package p498o0o00Oo0;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O000<T> f41311OooO00o = new o000O000<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String it = (String) obj;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00O0O o00o0oOooO00o = OooOOO0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o00o0oOooO00o.OooOOO0(it);
    }
}
