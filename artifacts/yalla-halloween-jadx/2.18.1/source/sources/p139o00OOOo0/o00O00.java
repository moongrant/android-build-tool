package p139o00OOOo0;

import com.app.base.dialog.baseDialog.PasswordSettingDialog;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PasswordSettingDialog f31822OooO00o;

    public o00O00(PasswordSettingDialog passwordSettingDialog) {
        this.f31822OooO00o = passwordSettingDialog;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        this.f31822OooO00o.OooOOO();
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.password_unjoin_toast_Done));
        LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
    }
}
