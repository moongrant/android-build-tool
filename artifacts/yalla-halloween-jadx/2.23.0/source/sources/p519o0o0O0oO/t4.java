package p519o0o0O0oO;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.o0Oo0oo;
import p184o00o00o.OooOo00;
import p511o0o0O000.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class t4 extends Lambda implements Function4<OooOo00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo<UserMyOutFitModel> f53160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f53161OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<UserMyOutFitModel, Unit> f53162OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> f53163OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t4(o0Oo0oo<UserMyOutFitModel> o0oo0oo2, Function1<? super UserMyOutFitModel, Unit> function1, int i, Function4<? super ColumnScope, ? super UserMyOutFitModel, ? super Composer, ? super Integer, Unit> function4) {
        super(4);
        this.f53160OooO0Oo = o0oo0oo2;
        this.f53162OooO0o0 = function1;
        this.f53161OooO0o = i;
        this.f53163OooO0oO = function4;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
        int i;
        OooOo00 HorizontalPager = oooOo00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-260542837, iIntValue2, -1, "com.yalla.yalla.ui.dialog.UserOutFitDialog.onAddProfilePreViewDialog.<anonymous>.<anonymous>.<anonymous> (UserOutFitDialog.kt:133)");
            }
            UserMyOutFitModel userMyOutFitModel = this.f53160OooO0Oo.f34662OooO0o.get(iIntValue);
            Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> function4 = this.f53163OooO0oO;
            int i2 = this.f53161OooO0o;
            OooO.OooO00o(userMyOutFitModel, this.f53162OooO0o0, ComposableLambdaKt.composableLambda(composer2, 2097826284, true, new s4(function4, i2)), composer2, ((i2 >> 6) & 112) | 392);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
