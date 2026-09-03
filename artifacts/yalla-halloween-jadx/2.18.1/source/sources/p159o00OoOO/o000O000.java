package p159o00OoOO;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.dialog.baseDialog.PasswordSettingDialog;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.ChackFollowAndJoinModel;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f32425OooO00o;

    public o000O000(MixedRoomActivity mixedRoomActivity) {
        this.f32425OooO00o = mixedRoomActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        ChackFollowAndJoinModel.DataBean dataBean;
        PasswordSettingDialog passwordSettingDialog;
        super.onFinish(str);
        this.f32425OooO00o.f11778o000000o = (ChackFollowAndJoinModel) o0Oo0oo.OooO0O0(str, ChackFollowAndJoinModel.class);
        MixedRoomActivity mixedRoomActivity = this.f32425OooO00o;
        ChackFollowAndJoinModel chackFollowAndJoinModel = mixedRoomActivity.f11778o000000o;
        if (chackFollowAndJoinModel == null || (dataBean = chackFollowAndJoinModel.data) == null || (passwordSettingDialog = mixedRoomActivity.f11769OooooOO) == null) {
            return;
        }
        passwordSettingDialog.OooOOOo(dataBean.isFollowing, dataBean.isJoined);
    }
}
