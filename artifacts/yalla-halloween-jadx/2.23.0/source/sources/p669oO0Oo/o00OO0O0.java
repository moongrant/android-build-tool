package p669oO0Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOoO.oOO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0O0 f60562OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f60563OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO000 f60564OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(oo0o0O0 oo0o0o0, oOO000 ooo000, int i) {
        super(2);
        this.f60562OooO0Oo = oo0o0o0;
        this.f60564OooO0o0 = ooo000;
        this.f60563OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f60563OooO0o | 1);
        oo0o0O0.OooO0o(this.f60562OooO0Oo, this.f60564OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
