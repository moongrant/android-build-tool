package p520o0o0O0oo;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class y8 extends PopupWindow {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ x6 f53417OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(x6 x6Var, LinearLayout linearLayout) {
        super((View) linearLayout, -2, -2, true);
        this.f53417OooO00o = x6Var;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        x6 x6Var = this.f53417OooO00o;
        x6Var.f53396OooOoo0 = null;
        Job job = x6Var.f53397OooOooO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
