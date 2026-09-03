package oO0OO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f60095OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f60096OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f60097OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f60098OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f60099OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OooO00o oooO00o, String str, Modifier modifier, int i, int i2) {
        super(2);
        this.f60095OooO0Oo = oooO00o;
        this.f60097OooO0o0 = str;
        this.f60096OooO0o = modifier;
        this.f60098OooO0oO = i;
        this.f60099OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooO00o oooO00o = this.f60095OooO0Oo;
        String str = this.f60097OooO0o0;
        oooO00o.OooO0oo(RecomposeScopeImplKt.updateChangedFlags(this.f60098OooO0oO | 1), this.f60099OooO0oo, composer, this.f60096OooO0o, str);
        return Unit.INSTANCE;
    }
}
