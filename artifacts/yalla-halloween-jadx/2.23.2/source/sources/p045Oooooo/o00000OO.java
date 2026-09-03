package p045Oooooo;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.OooOO0O;
import java.util.concurrent.TimeUnit;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO implements OooOOO0<o000OO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f1871OooO00o;

    public o00000OO(o0000Ooo o0000ooo) {
        this.f1871OooO00o = o0000ooo;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        this.f1871OooO00o.OooO0OO(th, 0, "Unable to acquire InputBuffer.");
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(o000OO0O o000oo0o2) {
        o000OO0O o000oo0o3 = o000oo0o2;
        o0000Ooo o0000ooo = this.f1871OooO00o;
        o0000ooo.f1903OooOOo0.getClass();
        o000oo0o3.OooO0O0(TimeUnit.NANOSECONDS.toMicros(System.nanoTime()));
        o000oo0o3.OooO0OO();
        o000oo0o3.OooO00o();
        OooOO0O<Void> oooOO0OOooO0Oo = o000oo0o3.OooO0Oo();
        oooOO0OOooO0Oo.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO0Oo, new o00000O(this)), o0000ooo.f1894OooO0oo);
    }
}
