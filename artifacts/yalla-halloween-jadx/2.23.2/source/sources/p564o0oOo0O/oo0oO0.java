package p564o0oOo0O;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p497o0o00OoO.o0000O00;
import p587o0oOooOO.t;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SendMomentEmojiAtPollView f56387OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EditTextSpan f56388OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ t f56389OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(SendMomentEmojiAtPollView sendMomentEmojiAtPollView, t tVar, EditTextSpan editTextSpan) {
        super(2);
        this.f56387OooO0Oo = sendMomentEmojiAtPollView;
        this.f56389OooO0o0 = tVar;
        this.f56388OooO0o = editTextSpan;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1966316632, iIntValue, -1, "com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView.initData.<anonymous> (SendMomentEmojiAtPollView.kt:86)");
            }
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = this.f56387OooO0Oo;
            o0000O00.OooO00o(sendMomentEmojiAtPollView.getPanelLayoutState(), this.f56389OooO0o0, 0, composer2, 72, 4);
            Unit unit = Unit.INSTANCE;
            EditTextSpan editTextSpan = this.f56388OooO0o;
            EffectsKt.LaunchedEffect(unit, new o0OO000(sendMomentEmojiAtPollView, editTextSpan, null), composer2, 70);
            EffectsKt.LaunchedEffect(unit, new o0OO000o(this.f56389OooO0o0, editTextSpan, null), composer2, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
