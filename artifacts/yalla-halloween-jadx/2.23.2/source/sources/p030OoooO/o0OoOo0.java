package p030OoooO;

import androidx.annotation.NonNull;
import java.util.List;
import o000OO.OooOOO0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements o000Oo0.OooO0OO<List<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f1358OooO0Oo;

    public o0OoOo0(o00Ooo o00ooo2) {
        this.f1358OooO0Oo = o00ooo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(@NonNull o000Oo0.OooO00o<List<Object>> oooO00o) {
        o00Ooo o00ooo2 = this.f1358OooO0Oo;
        OooOOO0.OooO0o("The result can only set once!", o00ooo2.f1352OooO == null);
        o00ooo2.f1352OooO = oooO00o;
        return "ListFuture[" + this + "]";
    }
}
