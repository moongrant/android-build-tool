package p498o0o00Oo0;

import androidx.lifecycle.Observer;
import java.util.Objects;
import kotlin.Pair;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.o00O0O;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00000<T> f41295OooO00o = new o00000<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Pair pair = (Pair) obj;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00O0O o00o0oOooO00o = OooOOO0.OooO00o();
        int iIntValue = ((Number) pair.getFirst()).intValue();
        Objects.requireNonNull(o00o0oOooO00o);
        o00o0oOooO00o.OooO0oO(o000O0O0.OooO00o(-23703096368656L), iIntValue);
        o00O0O o00o0oOooO00o2 = OooOOO0.OooO00o();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        Objects.requireNonNull(o00o0oOooO00o2);
        o00o0oOooO00o2.OooO0oO(o000O0O0.OooO00o(-23797585649168L), iIntValue2);
    }
}
