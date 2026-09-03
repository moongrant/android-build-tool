package p650o0ooo;

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
import p101o000oo.o0000oo;
import p230o00oOo0o.o0O0O00;
import p512o0o0O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class t4 extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000oo<UserMyOutFitModel> f59166OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59167OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<UserMyOutFitModel, Unit> f59168OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> f59169OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t4(o0000oo<UserMyOutFitModel> o0000ooVar, Function1<? super UserMyOutFitModel, Unit> function1, int i, Function4<? super ColumnScope, ? super UserMyOutFitModel, ? super Composer, ? super Integer, Unit> function4) {
        super(4);
        this.f59166OooO0Oo = o0000ooVar;
        this.f59168OooO0o0 = function1;
        this.f59167OooO0o = i;
        this.f59169OooO0oO = function4;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
        o0O0O00 HorizontalPager = o0o0o00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-260542837, iIntValue2, -1, "com.yalla.yalla.ui.dialog.UserOutFitDialog.onAddProfilePreViewDialog.<anonymous>.<anonymous>.<anonymous> (UserOutFitDialog.kt:134)");
            }
            UserMyOutFitModel userMyOutFitModel = this.f59166OooO0Oo.f35433OooO0o.get(iIntValue);
            Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> function4 = this.f59169OooO0oO;
            int i = this.f59167OooO0o;
            OooO0O0.OooO00o(userMyOutFitModel, this.f59168OooO0o0, ComposableLambdaKt.composableLambda(composer2, 2097826284, true, new s4(function4, i)), composer2, ((i >> 6) & 112) | 392);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
