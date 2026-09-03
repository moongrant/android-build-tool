package p535o0o0OOoO;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOOoOOO0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f43720Oooo;

    public oOOoOOO0(BlackListActivity blackListActivity) {
        this.f43720Oooo = blackListActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        if (BlackListActivity.OooOoO(this.f43720Oooo)) {
            return;
        }
        BlackListActivity blackListActivity = this.f43720Oooo;
        boolean z = !blackListActivity.f21923OoooOoO;
        blackListActivity.f21923OoooOoO = z;
        if (z) {
            blackListActivity.f21924OoooOoo.setText(blackListActivity.getString(R.string.Done));
        } else {
            blackListActivity.f21924OoooOoo.setText(blackListActivity.getString(R.string.Edit));
        }
        this.f43720Oooo.f21927OooooO0.notifyDataSetChanged();
    }
}
