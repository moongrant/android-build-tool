package p358o0OOOo0o;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.List;
import p295o0O0OoO.o00Ooo;
import p357o0OOOo0O.o0000oo;
import p359o0OOOoO.Oooo0;
import p359o0OOOoO.o000oOoO;
import p359o0OOOoO.o0OoOo0;
import p360o0OOOoO0.OooO0O0;
import p360o0OOOoO0.OooOO0O;
import p375o0OOo0oo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile OooO0O0 f38388OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile o000oOoO f38389OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public final List<Oooo0> f38390OooO0OO;

    public o000OO(o0ooOOo<p356o0OOOo00.OooO0O0> o0ooooo2) {
        o0OoOo0 o0oooo1 = new o0OoOo0();
        OooOO0O oooOO0O = new OooOO0O();
        this.f38389OooO0O0 = o0oooo1;
        this.f38390OooO0OO = new ArrayList();
        this.f38388OooO00o = oooOO0O;
        ((o0000oo) o0ooooo2).OooO00o(new o00Ooo(this, 1));
    }
}
