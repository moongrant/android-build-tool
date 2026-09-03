package p494o0o00OoO;

import android.os.Looper;
import android.text.TextUtils;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.dialog.PasswordSettingDialog;
import com.yalla.yalla.ui.view.pop.passwordSettingPop.PasswordSettingModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f48760OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PasswordSettingModel f48761OooO0o0;

    public o00OO0OO(o00OO00O o00oo00o, PasswordSettingModel passwordSettingModel) {
        this.f48760OooO0o = o00oo00o;
        this.f48761OooO0o0 = passwordSettingModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(String str, String str2) {
        PasswordSettingDialog passwordSettingDialog;
        super.OooO0O0(str, str2);
        if (!str.equals("2045") || (passwordSettingDialog = this.f48760OooO0o.f48752OooO00o) == null) {
            return;
        }
        passwordSettingDialog.dismiss();
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Operation_succeeded);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        if (MixedRoomDataSource.OooO0o0().f23460OooO0o != null) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f48761OooO0o0.getPassword());
            OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
            if (zIsEmpty) {
                MixedRoomDataSource.OooO0o0().f23460OooO0o.setIsencrypt(0);
                oooO00o.OooO00o().f25012OooOOOo.postValue(Boolean.FALSE);
            } else {
                MixedRoomDataSource.OooO0o0().f23460OooO0o.setIsencrypt(4);
                oooO00o.OooO00o().f25012OooOOOo.postValue(Boolean.TRUE);
            }
            OooOo.OooO0OO(33, null);
        }
        PasswordSettingDialog passwordSettingDialog = this.f48760OooO0o.f48752OooO00o;
        if (passwordSettingDialog != null) {
            passwordSettingDialog.dismiss();
        }
    }
}
