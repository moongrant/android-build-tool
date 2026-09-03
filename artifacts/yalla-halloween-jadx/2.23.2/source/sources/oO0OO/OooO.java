package oO0OO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f59934OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f59935OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f59936OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f59937OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f59938OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooO00o oooO00o, boolean z, Modifier modifier, int i, int i2) {
        super(2);
        this.f59934OooO0Oo = oooO00o;
        this.f59936OooO0o0 = z;
        this.f59935OooO0o = modifier;
        this.f59937OooO0oO = i;
        this.f59938OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooO00o oooO00o = this.f59934OooO0Oo;
        boolean z = this.f59936OooO0o0;
        oooO00o.OooOOo0(RecomposeScopeImplKt.updateChangedFlags(this.f59937OooO0oO | 1), this.f59938OooO0oo, composer, this.f59935OooO0o, z);
        return Unit.INSTANCE;
    }
}
