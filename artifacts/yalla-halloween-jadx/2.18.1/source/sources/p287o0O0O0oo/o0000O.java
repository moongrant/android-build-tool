package p287o0O0O0oo;

import android.content.Context;
import p641o0ooO0oo.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O<Context> f35521OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O<o0000O0> f35522OooO0O0;

    public o0000O(o000O<Context> o000o, o000O<o0000O0> o000o2) {
        this.f35521OooO00o = o000o;
        this.f35522OooO0O0 = o000o2;
    }

    @Override // p641o0ooO0oo.o000O
    public final Object get() {
        return new o000OO(this.f35521OooO00o.get(), this.f35522OooO0O0.get());
    }
}
