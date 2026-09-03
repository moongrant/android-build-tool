package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements OooOOO0<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO00o f1368OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function f1369OooO0O0;

    public OooOo(o00O000.OooO00o oooO00o) {
        OooOo00.OooO00o oooO00o2 = OooOo00.f1370OooO00o;
        this.f1368OooO00o = oooO00o;
        this.f1369OooO0O0 = oooO00o2;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        this.f1368OooO00o.OooO0OO(th);
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Object obj) {
        o00O000.OooO00o oooO00o = this.f1368OooO00o;
        try {
            oooO00o.OooO0O0(this.f1369OooO0O0.apply(obj));
        } catch (Throwable th) {
            oooO00o.OooO0OO(th);
        }
    }
}
