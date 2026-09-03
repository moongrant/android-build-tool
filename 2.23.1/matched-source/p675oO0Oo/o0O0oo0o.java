package p675oO0Oo;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0oo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f59498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Fragment f59499OooO0o0;

    public /* synthetic */ o0O0oo0o(Fragment fragment, int i) {
        this.f59498OooO0Oo = i;
        this.f59499OooO0o0 = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f59498OooO0Oo;
        Fragment fragment = this.f59499OooO0o0;
        switch (i) {
            case 0:
                o0O0O0Oo this$0 = (o0O0O0Oo) fragment;
                int i2 = o0O0O0Oo.f59463OooOO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Dialog dialog = this$0.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                MainSearchUserFragment this$1 = (MainSearchUserFragment) fragment;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.getVm().clearSearchHistory();
                break;
        }
    }
}
