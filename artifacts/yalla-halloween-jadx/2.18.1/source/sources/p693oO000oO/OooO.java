package p693oO000oO;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import p386o0OOoo0O.o000OOo0;
import p388o0OOooO.o00000O0;
import p660o0ooo0o0.o00OOOOo;
import retrofit2.OooOO0;
import retrofit2.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends OooOO0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo0 f52706OooO00o;

    public OooO(o000OOo0 o000ooo1) {
        this.f52706OooO00o = o000ooo1;
    }

    public static OooO OooO0OO() {
        return OooO0Oo(new o000OOo0());
    }

    public static OooO OooO0Oo(o000OOo0 o000ooo1) {
        Objects.requireNonNull(o000ooo1, "gson == null");
        return new OooO(o000ooo1);
    }

    @Override // retrofit2.OooOO0.OooO00o
    public final OooOO0 OooO00o(Type type) {
        return new OooOO0(this.f52706OooO00o, this.f52706OooO00o.OooO0o0(o00000O0.get(type)));
    }

    @Override // retrofit2.OooOO0.OooO00o
    public final OooOO0<o00OOOOo, ?> OooO0O0(Type type, Annotation[] annotationArr, o0O0O00 o0o0o00) {
        return new OooOO0O(this.f52706OooO00o, this.f52706OooO00o.OooO0o0(o00000O0.get(type)));
    }
}
