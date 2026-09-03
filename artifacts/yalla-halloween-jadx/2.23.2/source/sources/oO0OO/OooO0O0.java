package oO0OO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f60090OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f60091OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Modifier f60092OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f60093OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f60094OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO00o oooO00o, Modifier modifier, int i, int i2, int i3) {
        super(2);
        this.f60090OooO0Oo = oooO00o;
        this.f60092OooO0o0 = modifier;
        this.f60091OooO0o = i;
        this.f60093OooO0oO = i2;
        this.f60094OooO0oo = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooO00o oooO00o = this.f60090OooO0Oo;
        oooO00o.OooO0OO(this.f60091OooO0o, RecomposeScopeImplKt.updateChangedFlags(this.f60093OooO0oO | 1), this.f60094OooO0oo, composer, this.f60092OooO0o0);
        return Unit.INSTANCE;
    }
}
