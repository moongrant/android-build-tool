package o000O00O;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 implements Function1<OooOo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f34519OooO0Oo = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo<Object, RecyclerView.o0O0O00> f34520OooO0o0;

    public o000O0(p400o0Oo0OO.OooOO0O oooOO0O) {
        this.f34520OooO0o0 = oooOO0O;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOo oooOo) {
        OooOo loadStates = oooOo;
        Intrinsics.checkNotNullParameter(loadStates, "loadStates");
        if (this.f34519OooO0Oo) {
            this.f34519OooO0Oo = false;
        } else if (loadStates.f34458OooO0Oo.f7160OooO00o instanceof androidx.paging.OooOOO0.OooO0OO) {
            o000O0Oo<Object, RecyclerView.o0O0O00> o000o0oo2 = this.f34520OooO0o0;
            if (o000o0oo2.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT && !o000o0oo2.f34532OooO00o) {
                o000o0oo2.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            OooO00o<Object> oooO00o = o000o0oo2.f34533OooO0O0;
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            OooO0o oooO0o = oooO00o.f34432OooO0oO;
            oooO0o.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            androidx.paging.OooOo00 oooOo00 = oooO0o.f7375OooO0o;
            oooOo00.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            oooOo00.f7172OooO00o.remove(this);
        }
        return Unit.INSTANCE;
    }
}
