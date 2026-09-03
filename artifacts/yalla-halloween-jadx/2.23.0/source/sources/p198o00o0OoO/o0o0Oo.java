package p198o00o0OoO;

import android.content.Context;
import p192o00o0OO.o0000OO0;
import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0Oo implements o0000OO0<o00OOO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000<Context> f39110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000<String> f39111OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000<Integer> f39112OooO0OO;

    public o0o0Oo(o000 o000Var) {
        o00oOoo o00oooo2 = o00oOoo.OooO00o.f39109OooO00o;
        o00O000o o00o000o2 = o00O000o.OooO00o.f39078OooO00o;
        this.f39110OooO00o = o000Var;
        this.f39111OooO0O0 = o00oooo2;
        this.f39112OooO0OO = o00o000o2;
    }

    @Override // p625o0ooO000.o000
    public final Object get() {
        return new o00OOO0O(this.f39110OooO00o.get(), this.f39111OooO0O0.get(), this.f39112OooO0OO.get().intValue());
    }
}
