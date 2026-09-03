package p674oO0Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f60106OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f60107OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f60108OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f60109OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f60110OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooOOO0 oooOOO0, long j, Modifier modifier, int i, int i2) {
        super(2);
        this.f60106OooO0Oo = oooOOO0;
        this.f60108OooO0o0 = j;
        this.f60107OooO0o = modifier;
        this.f60109OooO0oO = i;
        this.f60110OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooOOO0 oooOOO0 = this.f60106OooO0Oo;
        long j = this.f60108OooO0o0;
        oooOOO0.OooO00o(RecomposeScopeImplKt.updateChangedFlags(this.f60109OooO0oO | 1), this.f60110OooO0oo, j, composer, this.f60107OooO0o);
        return Unit.INSTANCE;
    }
}
