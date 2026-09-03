package oO0OO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f60100OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f60101OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f60102OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f60103OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f60104OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO00o oooO00o, String str, Modifier modifier, int i, int i2) {
        super(2);
        this.f60100OooO0Oo = oooO00o;
        this.f60102OooO0o0 = str;
        this.f60101OooO0o = modifier;
        this.f60103OooO0oO = i;
        this.f60104OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooO00o oooO00o = this.f60100OooO0Oo;
        String str = this.f60102OooO0o0;
        oooO00o.OooO0oo(RecomposeScopeImplKt.updateChangedFlags(this.f60103OooO0oO | 1), this.f60104OooO0oo, composer, this.f60101OooO0o, str);
        return Unit.INSTANCE;
    }
}
