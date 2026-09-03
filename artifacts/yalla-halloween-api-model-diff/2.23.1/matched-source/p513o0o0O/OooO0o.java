package p513o0o0O;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50915OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Fragment f50916OooO0o0;

    public /* synthetic */ OooO0o(Fragment fragment, int i) {
        this.f50915OooO0Oo = i;
        this.f50916OooO0o0 = fragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f50915OooO0Oo;
        Fragment fragment = this.f50916OooO0o0;
        switch (i) {
            case 0:
                OooO oooO = (OooO) fragment;
                String str = (String) obj;
                int i2 = OooO.f50886OooOo;
                oooO.f50900OooO0oO = str;
                TextView textView = oooO.f50905OooOOO;
                if (textView != null) {
                    textView.setText(str);
                }
                break;
            default:
                MomentDetailCommentFragment.initObserver$lambda$2((MomentDetailCommentFragment) fragment, obj);
                break;
        }
    }
}
