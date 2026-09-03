package p100o000oOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00O0O0;
import p047Oooooo0.o00OO0O0;
import p047Oooooo0.o0O0o;
import p047Oooooo0.o0oOOo;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public class o0OO0oO0<T> implements o0oOOo, o00OO0O0<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0OO<T> f29633Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public OooO00o<T> f29634Oooo0oO;

    public static final class OooO00o<T> extends o0O0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public T f29635OooO0OO;

        public OooO00o(T t) {
            this.f29635OooO0OO = t;
        }

        @Override // p047Oooooo0.o0O0o
        public final void OooO00o(@NotNull o0O0o value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f29635OooO0OO = ((OooO00o) value).f29635OooO0OO;
        }

        @Override // p047Oooooo0.o0O0o
        @NotNull
        public final o0O0o OooO0O0() {
            return new OooO00o(this.f29635OooO0OO);
        }
    }

    public o0OO0oO0(T t, @NotNull o0OO<T> policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.f29633Oooo0o = policy;
        this.f29634Oooo0oO = new OooO00o<>(t);
    }

    @Override // p047Oooooo0.o00OO0O0
    @NotNull
    public final o0OO<T> OooO() {
        return this.f29633Oooo0o;
    }

    @Override // p047Oooooo0.o0oOOo
    @NotNull
    public final o0O0o OooO00o() {
        return this.f29634Oooo0oO;
    }

    @Override // p047Oooooo0.o0oOOo
    public final void OooO0oo(@NotNull o0O0o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29634Oooo0oO = (OooO00o) value;
    }

    @Override // p047Oooooo0.o0oOOo
    @Nullable
    public final o0O0o OooOOOO(@NotNull o0O0o previous, @NotNull o0O0o current, @NotNull o0O0o applied) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(applied, "applied");
        if (this.f29633Oooo0o.OooO0O0(((OooO00o) current).f29635OooO0OO, ((OooO00o) applied).f29635OooO0OO)) {
            return current;
        }
        this.f29633Oooo0o.OooO00o();
        return null;
    }

    @Override // p100o000oOoO.o0O00OO, p100o000oOoO.oO0Oo
    public final T getValue() {
        return ((OooO00o) oo0o0O0.OooOOo0(this.f29634Oooo0oO, this)).f29635OooO0OO;
    }

    @Override // p100o000oOoO.o0O00OO
    public final void setValue(T t) {
        oo00o oo00oVarOooO;
        OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f29634Oooo0oO, oo0o0O0.OooO());
        if (this.f29633Oooo0o.OooO0O0(oooO00o.f29635OooO0OO, t)) {
            return;
        }
        OooO00o<T> oooO00o2 = this.f29634Oooo0oO;
        Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
        synchronized (oo0o0O0.f4158OooO0OO) {
            oo00oVarOooO = oo0o0O0.OooO();
            ((OooO00o) oo0o0O0.OooOOO(oooO00o2, this, oo00oVarOooO, oooO00o)).f29635OooO0OO = t;
            Unit unit = Unit.INSTANCE;
        }
        oo0o0O0.OooOOO0(oo00oVarOooO, this);
    }

    @NotNull
    public final String toString() {
        OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f29634Oooo0oO, oo0o0O0.OooO());
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MutableState(value=");
        sbOooO0o0.append(oooO00o.f29635OooO0OO);
        sbOooO0o0.append(")@");
        sbOooO0o0.append(hashCode());
        return sbOooO0o0.toString();
    }
}
