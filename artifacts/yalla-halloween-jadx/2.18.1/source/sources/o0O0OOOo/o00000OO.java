package o0O0OOOo;

import android.content.Context;
import p641o0ooO0oo.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O<Context> f35663OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O<String> f35664OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O<Integer> f35665OooO0OO;

    public o00000OO(o000O o000o) {
        OooOO0O oooOO0O = OooOO0O.OooO00o.f35642OooO00o;
        OooOOO oooOOO = OooOOO.OooO00o.f35643OooO00o;
        this.f35663OooO00o = o000o;
        this.f35664OooO0O0 = oooOO0O;
        this.f35665OooO0OO = oooOOO;
    }

    @Override // p641o0ooO0oo.o000O
    public final Object get() {
        return new o00000O(this.f35663OooO00o.get(), this.f35664OooO0O0.get(), this.f35665OooO0OO.get().intValue());
    }
}
