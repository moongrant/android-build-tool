package p644o0ooOOo;

import androidx.constraintlayout.core.state.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0o00 extends Lambda implements Function1<oO0Ooooo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO0oO0 f58043OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO0000Oo f58044OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(o0OO0oO0 o0oo0oo1, oO0000o0 oo0000o0) {
        super(1);
        this.f58043OooO0Oo = o0oo0oo1;
        this.f58044OooO0o0 = oo0000o0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oO0Ooooo oo0ooooo) {
        oO0Ooooo state = oo0ooooo;
        Intrinsics.checkNotNullParameter(state, "state");
        OooO00o OooO00o2 = state.OooO00o(this.f58043OooO0Oo.f58045OooO00o);
        oO0000o0 oo0000o0 = (oO0000o0) this.f58044OooO0o0;
        oo0000o0.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        OooO00o2.f4316Oooo0 = oo0000o0.f58078OooO00o.invoke(state);
        return Unit.INSTANCE;
    }
}
