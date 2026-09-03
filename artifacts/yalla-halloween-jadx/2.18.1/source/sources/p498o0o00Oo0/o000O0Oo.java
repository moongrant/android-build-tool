package p498o0o00Oo0;

import androidx.lifecycle.Observer;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p168o00Ooo0.OooOOOO;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.o00O0O;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O0Oo<T> f41314OooO00o = new o000O0Oo<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String it = (String) obj;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00O0O o00o0oOooO00o = OooOOO0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        Objects.requireNonNull(o00o0oOooO00o);
        Intrinsics.checkNotNullParameter(it, o000O0O0.OooO00o(-23286484540944L));
        String strValueOf = String.valueOf(o000O0O0.OooO00o(-23312254344720L).hashCode());
        String strOooO00o = StringsKt.isBlank(it) ? o000O0O0.OooO00o(-23372383886864L) : OooOOOO.OooO0OO(it);
        Intrinsics.checkNotNullExpressionValue(strOooO00o, o000O0O0.OooO00o(-23376678854160L));
        o00o0oOooO00o.OooO(strValueOf, strOooO00o);
    }
}
