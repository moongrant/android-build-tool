package p566o0oOo00O;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowingActivity;
import kotlin.jvm.functions.Function0;
import p255o00ooO0o.oo0oOO0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f45183Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000O000 f45184OoooO00;

    public o000(o000O000 o000o001, UserInfoModel userInfoModel) {
        this.f45184OoooO00 = o000o001;
        this.f45183Oooo = userInfoModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        if (!this.f45183Oooo.getIsFollow()) {
            FollowingActivity.OooOoO(this.f45184OoooO00.f45212OooO00o, this.f45183Oooo);
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f45184OoooO00.f45212OooO00o);
        oo0ooo0.OooOoo(R.string.Unfollow);
        oo0ooo0.OooOo0(R.string.unFollow_tips);
        oo0ooo0.OooOOOo(R.string.Unfollow);
        final UserInfoModel userInfoModel = this.f45183Oooo;
        oo0ooo0.OooOo0o(new Function0() { // from class: o0oOo00O.o0000OO0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                o000 o000Var = this.f45200Oooo0o;
                FollowingActivity.OooOoO(o000Var.f45184OoooO00.f45212OooO00o, userInfoModel);
                return null;
            }
        });
        oo0ooo0.OooOoO();
        oo0ooo0.OooOOO0();
    }
}
