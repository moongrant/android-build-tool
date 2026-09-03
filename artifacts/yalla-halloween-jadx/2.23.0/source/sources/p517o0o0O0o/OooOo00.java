package p517o0o0O0o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f52126OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f52127OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Modifier f52128OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52129OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52130OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(OooOOOO oooOOOO, Modifier modifier, int i, int i2, int i3) {
        super(2);
        this.f52126OooO0Oo = oooOOOO;
        this.f52128OooO0o0 = modifier;
        this.f52127OooO0o = i;
        this.f52129OooO0oO = i2;
        this.f52130OooO0oo = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooOOOO oooOOOO = this.f52126OooO0Oo;
        oooOOOO.OooO0OO(this.f52127OooO0o, RecomposeScopeImplKt.updateChangedFlags(this.f52129OooO0oO | 1), this.f52130OooO0oo, composer, this.f52128OooO0o0);
        return Unit.INSTANCE;
    }
}
