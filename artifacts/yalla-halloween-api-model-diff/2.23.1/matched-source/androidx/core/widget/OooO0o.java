package androidx.core.widget;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.session.o000O0Oo;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView;
import kotlin.jvm.internal.Intrinsics;
import p373o0OOo0oO.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f5539OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f5540OooO0o0;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f5539OooO0Oo = i;
        this.f5540OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5539OooO0Oo;
        Object obj = this.f5540OooO0o0;
        switch (i) {
            case 0:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) obj;
                int i2 = ContentLoadingProgressBar.f5479OooO0o;
                contentLoadingProgressBar.getClass();
                System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
                return;
            case 1:
                o000O0Oo o000o0oo2 = (o000O0Oo) obj;
                o000o0oo2.getClass();
                o000o0oo2.getClass();
                throw null;
            case 2:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                if (appStartTrace.f19962OooOOoo != null) {
                    return;
                }
                appStartTrace.f19949OooO0o.getClass();
                appStartTrace.f19962OooOOoo = new Timer();
                TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
                oooO0O0NewBuilder.OooOOO0("_experiment_preDrawFoQ");
                oooO0O0NewBuilder.OooOO0O(appStartTrace.OooO0OO().f20009OooO0Oo);
                Timer timerOooO0OO = appStartTrace.OooO0OO();
                Timer timer = appStartTrace.f19962OooOOoo;
                timerOooO0OO.getClass();
                oooO0O0NewBuilder.OooOO0o(timer.f20010OooO0o0 - timerOooO0OO.f20010OooO0o0);
                TraceMetric traceMetricBuild = oooO0O0NewBuilder.build();
                TraceMetric.OooO0O0 oooO0O0 = appStartTrace.f19952OooO0oo;
                oooO0O0.OooO0o(traceMetricBuild);
                appStartTrace.OooO0o0(oooO0O0);
                return;
            default:
                SendMomentEmojiAtPollView this$0 = (SendMomentEmojiAtPollView) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditTextSpan view = this$0.f30654OooOO0O;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editContent");
                    view = null;
                }
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                return;
        }
    }
}
