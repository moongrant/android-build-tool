package p650o0ooo;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.user.UserMyOutFitModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class s4 extends Lambda implements Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function4<ColumnScope, UserMyOutFitModel, Composer, Integer, Unit> f59157OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f59158OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s4(Function4<? super ColumnScope, ? super UserMyOutFitModel, ? super Composer, ? super Integer, Unit> function4, int i) {
        super(4);
        this.f59157OooO0Oo = function4;
        this.f59158OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(ColumnScope columnScope, UserMyOutFitModel userMyOutFitModel, Composer composer, Integer num) {
        ColumnScope PagerProfileItem = columnScope;
        UserMyOutFitModel it = userMyOutFitModel;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(PagerProfileItem, "$this$PagerProfileItem");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2097826284, iIntValue, -1, "com.yalla.yalla.ui.dialog.UserOutFitDialog.onAddProfilePreViewDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserOutFitDialog.kt:135)");
        }
        this.f59157OooO0Oo.invoke(PagerProfileItem, it, composer2, Integer.valueOf((iIntValue & 14) | 64 | ((this.f59158OooO0o0 >> 6) & 896)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
