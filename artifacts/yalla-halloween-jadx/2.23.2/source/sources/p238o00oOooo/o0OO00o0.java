package p238o00oOooo;

import java.util.Set;
import p233o00oOoOO.o0O000o0;
import p233o00oOoOO.o0OoO00O;
import p233o00oOoOO.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00o0 implements o0OoO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<o0OoOoOo> f40027OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO00OO f40028OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OO0O0 f40029OooO0OO;

    public o0OO00o0(Set set, o0O0o000 o0o0o000, o0OO0O0 o0oo0o1) {
        this.f40027OooO00o = set;
        this.f40028OooO0O0 = o0o0o000;
        this.f40029OooO0OO = o0oo0o1;
    }

    @Override // p233o00oOoOO.o0OoO00O
    public final o0OO0 OooO00o(String str, o0OoOoOo o0oooooo, o0O000o0 o0o000o1) {
        Set<o0OoOoOo> set = this.f40027OooO00o;
        if (set.contains(o0oooooo)) {
            return new o0OO0(this.f40028OooO0O0, str, o0oooooo, o0o000o1, this.f40029OooO0OO);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", o0oooooo, set));
    }
}
