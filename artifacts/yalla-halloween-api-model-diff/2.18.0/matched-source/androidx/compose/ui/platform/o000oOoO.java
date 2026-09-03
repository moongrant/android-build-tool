package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f6463Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f6464OoooO00;

    public /* synthetic */ o000oOoO(Object obj, int i) {
        this.f6463Oooo = i;
        this.f6464OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6463Oooo) {
            case 0:
                AndroidComposeView this$0 = (AndroidComposeView) this.f6464OoooO00;
                AndroidComposeView.OooO00o oooO00o = AndroidComposeView.f6211o0000Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f6251o0000OO0 = false;
                MotionEvent motionEvent = this$0.f6257o0000oo;
                Intrinsics.checkNotNull(motionEvent);
                if (!(motionEvent.getActionMasked() == 10)) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
                }
                this$0.Oooo0(motionEvent);
                return;
            default:
                ((androidx.emoji2.text.OooOOO.OooO0O0) this.f6464OoooO00).OooO0OO();
                return;
        }
    }
}
