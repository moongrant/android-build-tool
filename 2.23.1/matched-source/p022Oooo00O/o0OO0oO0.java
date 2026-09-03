package p022Oooo00O;

import androidx.camera.core.OooOo00;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO0oO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f827OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f828OooO0o0;

    public /* synthetic */ o0OO0oO0(Object obj, int i) {
        this.f827OooO0Oo = i;
        this.f828OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f827OooO0Oo;
        Object obj = this.f828OooO0o0;
        switch (i) {
            case 0:
                ((OooOo00) obj).OooO00o();
                break;
            default:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i2 = MomentDetailActivity.f25610Oooo0;
                this$0.OooOoOO().commentReplaceCid();
                break;
        }
    }
}
