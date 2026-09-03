package p517o0o0O0o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f52136OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f52137OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f52138OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52139OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52140OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(OooOOOO oooOOOO, String str, Modifier modifier, int i, int i2) {
        super(2);
        this.f52136OooO0Oo = oooOOOO;
        this.f52138OooO0o0 = str;
        this.f52137OooO0o = modifier;
        this.f52139OooO0oO = i;
        this.f52140OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooOOOO oooOOOO = this.f52136OooO0Oo;
        String str = this.f52138OooO0o0;
        oooOOOO.OooO0oo(RecomposeScopeImplKt.updateChangedFlags(this.f52139OooO0oO | 1), this.f52140OooO0oo, composer, this.f52137OooO0o, str);
        return Unit.INSTANCE;
    }
}
