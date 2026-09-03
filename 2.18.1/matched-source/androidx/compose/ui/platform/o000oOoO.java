package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f6448Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f6449Oooo0oO;

    public /* synthetic */ o000oOoO(Object obj, int i) {
        this.f6448Oooo0o = i;
        this.f6449Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6448Oooo0o) {
            case 0:
                AndroidComposeView this$0 = (AndroidComposeView) this.f6449Oooo0oO;
                AndroidComposeView.OooO00o oooO00o = AndroidComposeView.f6196o0000OOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f6237o0000O0O = false;
                MotionEvent motionEvent = this$0.f6233o00000oo;
                Intrinsics.checkNotNull(motionEvent);
                if (!(motionEvent.getActionMasked() == 10)) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
                }
                this$0.Oooo0(motionEvent);
                return;
            default:
                ((androidx.emoji2.text.OooOOO.OooO0O0) this.f6449Oooo0oO).OooO0OO();
                return;
        }
    }
}
