package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements OooOOO0<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000Oo0.OooO00o f1343OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function f1344OooO0O0;

    public Oooo000(o000Oo0.OooO00o oooO00o) {
        OooOo.OooO00o oooO00o2 = OooOo.f1338OooO00o;
        this.f1343OooO00o = oooO00o;
        this.f1344OooO0O0 = oooO00o2;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        this.f1343OooO00o.OooO0OO(th);
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Object obj) {
        o000Oo0.OooO00o oooO00o = this.f1343OooO00o;
        try {
            oooO00o.OooO0O0(this.f1344OooO0O0.apply(obj));
        } catch (Throwable th) {
            oooO00o.OooO0OO(th);
        }
    }
}
