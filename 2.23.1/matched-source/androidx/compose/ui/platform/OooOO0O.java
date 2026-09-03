package androidx.compose.ui.platform;

import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4186OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4187OooO0o0;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f4186OooO0Oo = i;
        this.f4187OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4186OooO0Oo;
        Object obj = this.f4187OooO0o0;
        switch (i) {
            case 0:
                AndroidComposeView.sendHoverExitEvent$lambda$5((AndroidComposeView) obj);
                return;
            case 1:
                p110o000ooo0.o0000oo this$0 = (p110o000ooo0.o0000oo) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                throw null;
            default:
                MomentDetailActivity this$1 = (MomentDetailActivity) obj;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO().f45016OooOO0.setCurrentItem(this$1.f25622OooOooO);
                return;
        }
    }
}
