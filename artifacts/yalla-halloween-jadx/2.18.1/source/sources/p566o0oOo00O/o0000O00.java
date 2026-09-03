package p566o0oOo00O;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import p255o00ooO0o.oo0oOO0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f45197Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0000oo f45198OoooO00;

    public o0000O00(o0000oo o0000ooVar, UserInfoModel userInfoModel) {
        this.f45198OoooO00 = o0000ooVar;
        this.f45197Oooo = userInfoModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        if (!this.f45197Oooo.getIsFollow()) {
            FollowerActivity.OooOoO(this.f45198OoooO00.f45205OooO00o, this.f45197Oooo);
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f45198OoooO00.f45205OooO00o);
        oo0ooo0.OooOooO(this.f45198OoooO00.f45205OooO00o.getResources().getString(R.string.Unfollow));
        oo0ooo0.OooOo0O(this.f45198OoooO00.f45205OooO00o.getResources().getString(R.string.unFollow_tips));
        oo0ooo0.OooOOo0(this.f45198OoooO00.f45205OooO00o.getResources().getString(R.string.Unfollow));
        oo0ooo0.OooOo0o(new o0000(this, this.f45197Oooo, 0));
        oo0ooo0.OooOoO();
        oo0ooo0.OooOOO0();
    }
}
