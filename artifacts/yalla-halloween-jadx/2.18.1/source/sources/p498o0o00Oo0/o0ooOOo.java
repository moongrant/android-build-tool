package p498o0o00Oo0;

import androidx.lifecycle.Observer;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.o00O0O;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0ooOOo<T> f41358OooO00o = new o0ooOOo<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String it = (String) obj;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00O0O o00o0oOooO00o = OooOOO0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        Objects.requireNonNull(o00o0oOooO00o);
        Intrinsics.checkNotNullParameter(it, o000O0O0.OooO00o(-19824740900368L));
        o00o0oOooO00o.OooO(o000O0O0.OooO00o(-19850510704144L), it);
    }
}
