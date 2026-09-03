package p559o0oOOoo0;

import android.os.Looper;
import android.text.TextUtils;
import com.app.base.dialog.baseDialog.PasswordSettingDialog;
import com.app.base.view.pop.passwordSettingPop.PasswordSettingModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p034OoooO0O.o0Oo0oo;
import p074o000O0oo.OooOOO;
import p159o00OoOO.o000O00O;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PasswordSettingModel f44846OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oo0O f44847OooO0O0;

    public o00OOO00(oo0O oo0o, PasswordSettingModel passwordSettingModel) {
        this.f44847OooO0O0 = oo0o;
        this.f44846OooO00o = passwordSettingModel;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(String str, String str2) {
        PasswordSettingDialog passwordSettingDialog;
        super.onError(str, str2);
        if (!str.equals("2045") || (passwordSettingDialog = this.f44847OooO0O0.f44848OooO00o) == null) {
            return;
        }
        passwordSettingDialog.dismiss();
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Operation_succeeded);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        if (o000O00O.OooO().f32427Oooo != null) {
            if (TextUtils.isEmpty(this.f44846OooO00o.getPassword())) {
                o000O00O.OooO().f32427Oooo.setIsencrypt(0);
                o00OO00O.f43313OooooOo.OooO00o().f43335OooOo0.postValue(Boolean.FALSE);
            } else {
                o000O00O.OooO().f32427Oooo.setIsencrypt(4);
                o00OO00O.f43313OooooOo.OooO00o().f43335OooOo0.postValue(Boolean.TRUE);
            }
            o0Oo0oo.OooO0o0(33, null);
        }
    }
}
