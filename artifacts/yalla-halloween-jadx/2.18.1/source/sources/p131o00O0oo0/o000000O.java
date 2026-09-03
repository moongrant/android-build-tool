package p131o00O0oo0;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class o000000O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000000<T> f31153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public T f31154OooO0O0;

    public o000000O() {
        this.f31153OooO00o = new o000000<>();
        this.f31154OooO0O0 = null;
    }

    @Nullable
    public T OooO00o(o000000<T> o000000Var) {
        return this.f31154OooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Object OooO0O0(Object obj, Object obj2) {
        o000000<T> o000000Var = this.f31153OooO00o;
        o000000Var.f31151OooO00o = obj;
        o000000Var.f31152OooO0O0 = obj2;
        return OooO00o(o000000Var);
    }

    public o000000O(@Nullable T t) {
        this.f31153OooO00o = new o000000<>();
        this.f31154OooO0O0 = t;
    }
}
