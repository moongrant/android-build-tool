package p089o000o000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 implements Function1<OooOo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f28923Oooo0o = true;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O000o<Object, RecyclerView.oo0o0Oo> f28924Oooo0oO;

    public o00O000(o00O000o<Object, RecyclerView.oo0o0Oo> o00o000o2) {
        this.f28924Oooo0oO = o00o000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOo oooOo) {
        OooOo loadStates = oooOo;
        Intrinsics.checkNotNullParameter(loadStates, "loadStates");
        if (this.f28923Oooo0o) {
            this.f28923Oooo0o = false;
        } else if (loadStates.f28685OooO0Oo.f28702OooO00o instanceof o000000.OooO0OO) {
            o00O000o<Object, RecyclerView.oo0o0Oo> o00o000o2 = this.f28924Oooo0oO;
            if (o00o000o2.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT && !o00o000o2.f28931OooO00o) {
                o00o000o2.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
            }
            o00O000o<Object, RecyclerView.oo0o0Oo> o00o000o3 = this.f28924Oooo0oO;
            Objects.requireNonNull(o00o000o3);
            Intrinsics.checkNotNullParameter(this, "listener");
            OooO0o<Object> oooO0o = o00o000o3.f28932OooO0O0;
            Objects.requireNonNull(oooO0o);
            Intrinsics.checkNotNullParameter(this, "listener");
            OooO0o.OooO00o oooO00o = oooO0o.f28654OooO0oO;
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(this, "listener");
            o00000OO o00000oo2 = oooO00o.f28911OooO0o0;
            Objects.requireNonNull(o00000oo2);
            Intrinsics.checkNotNullParameter(this, "listener");
            o00000oo2.f28713OooO0O0.remove(this);
        }
        return Unit.INSTANCE;
    }
}
