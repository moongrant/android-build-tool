package p516o0o0O0OO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f51930OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f51931OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f51932OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f51933OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f51934OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o0ooOOo o0ooooo, int i, Modifier modifier, int i2, int i3) {
        super(2);
        this.f51930OooO0Oo = o0ooooo;
        this.f51932OooO0o0 = i;
        this.f51931OooO0o = modifier;
        this.f51933OooO0oO = i2;
        this.f51934OooO0oo = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0ooOOo o0ooooo = this.f51930OooO0Oo;
        int i = this.f51932OooO0o0;
        o0ooooo.OooO0O0(i, RecomposeScopeImplKt.updateChangedFlags(this.f51933OooO0oO | 1), this.f51934OooO0oo, composer, this.f51931OooO0o);
        return Unit.INSTANCE;
    }
}
