package p502o0o00o0O;

import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.dialog.PasswordSettingDialog;
import com.yalla.yalla.ui.view.pop.passwordSettingPop.PasswordSettingModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000o extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o f50177OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PasswordSettingModel f50178OooO0o0;

    public oO00000o(o oVar, PasswordSettingModel passwordSettingModel) {
        this.f50177OooO0o = oVar;
        this.f50178OooO0o0 = passwordSettingModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(String str, String str2) {
        PasswordSettingDialog passwordSettingDialog;
        super.OooO0O0(str, str2);
        if (!str.equals("2045") || (passwordSettingDialog = this.f50177OooO0o.f50169OooO00o) == null) {
            return;
        }
        passwordSettingDialog.dismiss();
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        String strOooO0OO = o0000.OooO0OO(o000000.Operation_succeeded);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        if (MixedRoomDataSource.OooO0o0().f22991OooO0o != null) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f50178OooO0o0.getPassword());
            OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
            if (zIsEmpty) {
                MixedRoomDataSource.OooO0o0().f22991OooO0o.setIsencrypt(0);
                oooO00o.OooO00o().f24550OooOOOo.postValue(Boolean.FALSE);
            } else {
                MixedRoomDataSource.OooO0o0().f22991OooO0o.setIsencrypt(4);
                oooO00o.OooO00o().f24550OooOOOo.postValue(Boolean.TRUE);
            }
            p545o0oO0O00.OooOo00.OooO0O0(33, null);
        }
        PasswordSettingDialog passwordSettingDialog = this.f50177OooO0o.f50169OooO00o;
        if (passwordSettingDialog != null) {
            passwordSettingDialog.dismiss();
        }
    }
}
