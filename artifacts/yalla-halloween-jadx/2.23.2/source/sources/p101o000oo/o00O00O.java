package p101o000oo;

import androidx.paging.OooOOO0;
import androidx.paging.OooOo00;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O implements Function1<oo0o0Oo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f35516OooO0Oo = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO00O<Object, RecyclerView.o0O0O00> f35517OooO0o0;

    public o00O00O(h3 h3Var) {
        this.f35517OooO0o0 = h3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oo0o0Oo oo0o0oo) {
        oo0o0Oo loadStates = oo0o0oo;
        Intrinsics.checkNotNullParameter(loadStates, "loadStates");
        if (this.f35516OooO0Oo) {
            this.f35516OooO0Oo = false;
        } else if (loadStates.f35621OooO0Oo.f10254OooO00o instanceof OooOOO0.OooO0OO) {
            oOO00O<Object, RecyclerView.o0O0O00> ooo00o = this.f35517OooO0o0;
            if (ooo00o.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT && !ooo00o.f35582OooO00o) {
                ooo00o.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
            }
            Intrinsics.checkNotNullParameter(this, "listener");
            o000oOoO<Object> o000oooo2 = ooo00o.f35583OooO0O0;
            o000oooo2.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            o00Oo0 o00oo1 = o000oooo2.f35492OooO0oO;
            o00oo1.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            OooOo00 oooOo00 = o00oo1.f10469OooO0o;
            oooOo00.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            oooOo00.f10266OooO00o.remove(this);
        }
        return Unit.INSTANCE;
    }
}
