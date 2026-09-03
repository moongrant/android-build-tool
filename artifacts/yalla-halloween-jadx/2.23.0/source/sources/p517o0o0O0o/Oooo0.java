package p517o0o0O0o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f52131OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f52132OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f52133OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52134OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52135OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(OooOOOO oooOOOO, boolean z, Modifier modifier, int i, int i2) {
        super(2);
        this.f52131OooO0Oo = oooOOOO;
        this.f52133OooO0o0 = z;
        this.f52132OooO0o = modifier;
        this.f52134OooO0oO = i;
        this.f52135OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooOOOO oooOOOO = this.f52131OooO0Oo;
        boolean z = this.f52133OooO0o0;
        oooOOOO.OooOOo0(RecomposeScopeImplKt.updateChangedFlags(this.f52134OooO0oO | 1), this.f52135OooO0oo, composer, this.f52132OooO0o, z);
        return Unit.INSTANCE;
    }
}
