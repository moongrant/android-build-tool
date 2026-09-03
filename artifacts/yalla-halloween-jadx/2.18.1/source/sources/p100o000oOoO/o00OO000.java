package p100o000oOoO;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p036OoooOOO.o0OO00O;
import p036OoooOOO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Object f29493OooO00o = new Object();

    @NotNull
    public static final o00O0OO OooO00o(@NotNull o00O000<?> applier, @NotNull o00O0OOO parent) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new o00O(parent, applier);
    }

    public static final void OooO0O0(o0OO00O o0oo00o2, Object key, Object obj) {
        Objects.requireNonNull(o0oo00o2);
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(o0oo00o2.OooO00o(key) >= 0)) {
            oo0o0Oo oo0o0oo = new oo0o0Oo();
            oo0o0oo.add(obj);
            Unit unit = Unit.INSTANCE;
            o0oo00o2.OooO0O0(key, oo0o0oo);
            return;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        int iOooO00o = o0oo00o2.OooO00o(key);
        oo0o0Oo oo0o0oo2 = (oo0o0Oo) (iOooO00o >= 0 ? o0oo00o2.f3676OooO0O0[iOooO00o] : null);
        if (oo0o0oo2 != null) {
            oo0o0oo2.add(obj);
        }
    }
}
