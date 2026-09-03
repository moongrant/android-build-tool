package p525o0o0OO0;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f53263OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Fragment f53264OooO0o0;

    public /* synthetic */ oo0O(Fragment fragment, int i) {
        this.f53263OooO0Oo = i;
        this.f53264OooO0o0 = fragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f53263OooO0Oo;
        Fragment fragment = this.f53264OooO0o0;
        switch (i) {
            case 0:
                o00OO o00oo2 = (o00OO) fragment;
                String str = (String) obj;
                int i2 = o00OO.f53219OooOo;
                o00oo2.f53233OooO0oO = str;
                TextView textView = o00oo2.f53238OooOOO;
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
