package p238o00oOooo;

import java.util.HashMap;
import p233o00oOoOO.o0O00;
import p233o00oOoOO.o0O000O;
import p233o00oOoOO.o0O000Oo;
import p233o00oOoOO.o0O000o0;
import p233o00oOoOO.o0O00O0o;
import p233o00oOoOO.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0<T> implements o0O00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00OO f40020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f40021OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OoOoOo f40022OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O000o0<T, byte[]> f40023OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OO0O0 f40024OooO0o0;

    public o0OO0(o0OO00OO o0oo00oo2, String str, o0OoOoOo o0oooooo, o0O000o0<T, byte[]> o0o000o1, o0OO0O0 o0oo0o1) {
        this.f40020OooO00o = o0oo00oo2;
        this.f40021OooO0O0 = str;
        this.f40022OooO0OO = o0oooooo;
        this.f40023OooO0Oo = o0o000o1;
        this.f40024OooO0o0 = o0oo0o1;
    }

    public final void OooO00o(o0O000O o0o000o, o0O00O0o o0o00o0o) {
        o0OO00OO o0oo00oo2 = this.f40020OooO00o;
        if (o0oo00oo2 == null) {
            throw new NullPointerException("Null transportContext");
        }
        String str = this.f40021OooO0O0;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        o0O000o0<T, byte[]> o0o000o1 = this.f40023OooO0Oo;
        if (o0o000o1 == null) {
            throw new NullPointerException("Null transformer");
        }
        o0OoOoOo o0oooooo = this.f40022OooO0OO;
        if (o0oooooo == null) {
            throw new NullPointerException("Null encoding");
        }
        oo0OOoo oo0oooo = new oo0OOoo(o0oo00oo2, str, o0o000o, o0o000o1, o0oooooo);
        o0OOooO0 o0ooooo0 = (o0OOooO0) this.f40024OooO0o0;
        o0ooooo0.getClass();
        o0O000Oo<?> o0o000oo2 = oo0oooo.f40046OooO0OO;
        o0O0o000 o0o0o000OooO0o0 = oo0oooo.f40044OooO00o.OooO0o0(o0o000oo2.OooO0OO());
        o0O0OOOo.OooO00o oooO00o = new o0O0OOOo.OooO00o();
        oooO00o.f40003OooO0o = new HashMap();
        oooO00o.f40002OooO0Oo = Long.valueOf(o0ooooo0.f40036OooO00o.getTime());
        oooO00o.f40004OooO0o0 = Long.valueOf(o0ooooo0.f40037OooO0O0.getTime());
        oooO00o.OooO0Oo(oo0oooo.f40045OooO0O0);
        oooO00o.OooO0OO(new o0oOo0O0(oo0oooo.f40048OooO0o0, oo0oooo.f40047OooO0Oo.apply(o0o000oo2.OooO0O0())));
        oooO00o.f40000OooO0O0 = o0o000oo2.OooO00o();
        o0ooooo0.f40038OooO0OO.OooO00o(o0o00o0o, oooO00o.OooO0O0(), o0o0o000OooO0o0);
    }
}
