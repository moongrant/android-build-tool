package p556o0oOOooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p490o0o00OOO.OooOo00;
import p539o0o0OoOO.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SendMomentEmojiAtPollView f56081OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EditTextSpan f56082OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ y0 f56083OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0(SendMomentEmojiAtPollView sendMomentEmojiAtPollView, y0 y0Var, EditTextSpan editTextSpan) {
        super(2);
        this.f56081OooO0Oo = sendMomentEmojiAtPollView;
        this.f56083OooO0o0 = y0Var;
        this.f56082OooO0o = editTextSpan;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1966316632, iIntValue, -1, "com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView.initData.<anonymous> (SendMomentEmojiAtPollView.kt:85)");
            }
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = this.f56081OooO0Oo;
            OooOo00.OooO00o(sendMomentEmojiAtPollView.getPanelLayoutState(), this.f56083OooO0o0, 0, composer2, 72, 4);
            Unit unit = Unit.INSTANCE;
            EditTextSpan editTextSpan = this.f56082OooO0o;
            EffectsKt.LaunchedEffect(unit, new oOo0000O(sendMomentEmojiAtPollView, editTextSpan, null), composer2, 70);
            EffectsKt.LaunchedEffect(unit, new oOo000o0(this.f56083OooO0o0, editTextSpan, null), composer2, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
