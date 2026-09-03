package o0O0OOOo;

import java.util.Objects;
import p289o0O0OOoO.o0000O00;
import p289o0O0OOoO.o0000Ooo;
import p289o0O0OOoO.o0000oo;
import p641o0ooO0oo.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O<o0000Ooo> f35678OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O<o0000Ooo> f35679OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O<OooO> f35680OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O<o00000O> f35681OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O<String> f35682OooO0o0;

    public o0O0O00(o000O o000o, o000O o000o2) {
        o0000O00 o0000o00 = o0000O00.OooO00o.f35703OooO00o;
        o0000oo o0000ooVar = o0000oo.OooO00o.f35704OooO00o;
        OooOOOO oooOOOO = OooOOOO.OooO00o.f35645OooO00o;
        this.f35678OooO00o = o0000o00;
        this.f35679OooO0O0 = o0000ooVar;
        this.f35680OooO0OO = oooOOOO;
        this.f35681OooO0Oo = o000o;
        this.f35682OooO0o0 = o000o2;
    }

    @Override // p641o0ooO0oo.o000O
    public final Object get() {
        p629o0ooO.Oooo0 oooO00o;
        o0000Ooo o0000ooo = this.f35678OooO00o.get();
        o0000Ooo o0000ooo2 = this.f35679OooO0O0.get();
        OooO oooO = this.f35680OooO0OO.get();
        o00000O o00000o = this.f35681OooO0Oo.get();
        o000O<String> o000o = this.f35682OooO0o0;
        Object obj = o0O0OO0.OooO00o.f35534OooO0OO;
        if (o000o instanceof p629o0ooO.Oooo0) {
            oooO00o = (p629o0ooO.Oooo0) o000o;
        } else {
            Objects.requireNonNull(o000o);
            oooO00o = new o0O0OO0.OooO00o(o000o);
        }
        return new oo0o0Oo(o0000ooo, o0000ooo2, oooO, o00000o, oooO00o);
    }
}
