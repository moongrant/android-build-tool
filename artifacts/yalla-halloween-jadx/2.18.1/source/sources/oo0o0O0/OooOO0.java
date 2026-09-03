package oo0o0O0;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO<View> f53349Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f53350Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f53351Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO<View> oooO, ViewTreeObserver viewTreeObserver, OooOO0O oooOO0O) {
        super(1);
        this.f53349Oooo0o = oooO;
        this.f53350Oooo0oO = viewTreeObserver;
        this.f53351Oooo0oo = oooOO0O;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        OooO<View> oooO = this.f53349Oooo0o;
        ViewTreeObserver viewTreeObserver = this.f53350Oooo0oO;
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "viewTreeObserver");
        OooO.OooO00o.OooO00o(oooO, viewTreeObserver, this.f53351Oooo0oo);
        return Unit.INSTANCE;
    }
}
