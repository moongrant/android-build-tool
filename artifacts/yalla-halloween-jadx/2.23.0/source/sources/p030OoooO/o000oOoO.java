package p030OoooO;

import androidx.annotation.NonNull;
import java.util.List;
import o000OO.OooOOO0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements o00O000.OooO0OO<List<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f1377OooO0Oo;

    public o000oOoO(o00Oo0 o00oo1) {
        this.f1377OooO0Oo = o00oo1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(@NonNull o00O000.OooO00o<List<Object>> oooO00o) {
        o00Oo0 o00oo1 = this.f1377OooO0Oo;
        OooOOO0.OooO0o("The result can only set once!", o00oo1.f1381OooO == null);
        o00oo1.f1381OooO = oooO00o;
        return "ListFuture[" + this + "]";
    }
}
