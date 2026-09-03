package p492o0o00OO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0OO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49351OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(MomentSendActivity momentSendActivity) {
        super(2);
        this.f49351OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(832635511, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentSendActivity.initView.<anonymous> (MomentSendActivity.kt:564)");
            }
            oo0oO0 oo0oo0 = oo0oO0.f52751OooO00o;
            int i = MomentSendActivity.f25726Oooo0OO;
            MomentSendActivity momentSendActivity = this.f49351OooO0Oo;
            MomentSendShareModel momentSendShareModelOooOoO0 = momentSendActivity.OooOoO0();
            MomentSendModel momentSendModelOooOoOO = momentSendActivity.OooOoOO();
            EditTextSpan mEditContent = momentSendActivity.OooOo().f44321OooO0o0;
            Intrinsics.checkNotNullExpressionValue(mEditContent, "mEditContent");
            oo0oo0.OooO00o(momentSendShareModelOooOoO0, momentSendModelOooOoOO, mEditContent, new oo00oO(momentSendActivity), composer2, 25160);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
