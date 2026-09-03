package p536o0o0OOo0;

import android.os.Looper;
import android.view.View;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p656o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o000 extends o00Oo0 {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f43580OoooO0O;

    public o0O0o000(PasswordActivity passwordActivity) {
        this.f43580OoooO0O = passwordActivity;
    }

    @Override // p656o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PasswordActivity passwordActivity = this.f43580OoooO0O;
        PasswordActivity.OooO00o oooO00o = PasswordActivity.f21800ooOO;
        String string = StringsKt.trim((CharSequence) passwordActivity.OooOooO().f49845OooO0OO.getText().toString()).toString();
        if (this.f43580OoooO0O.OooOooO().f49845OooO0OO.getText().toString().length() != string.length() || string.length() < 6) {
            String string2 = this.f43580OoooO0O.getString(R.string.invalid_password);
            ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
            if (string2 == null || StringsKt.isBlank(string2)) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, string2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
                return;
            } else {
                o00O000 o00o001 = o00O000.f34368OooO00o;
                o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                return;
            }
        }
        PasswordActivity passwordActivity2 = this.f43580OoooO0O;
        ClientCodeType clientCodeType = passwordActivity2.f21807Ooooooo;
        int i = clientCodeType == null ? -1 : PasswordActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        if (i == 1) {
            String str = passwordActivity2.f21803OooooOo;
            String str2 = passwordActivity2.f21804Oooooo;
            BaseActivityK.OooOoo0(passwordActivity2, null, 0L, 3, null);
            passwordActivity2.OooOooo().phoneRegister(str, string, str2).observe(passwordActivity2, new OooOo(new o0O0OO0(passwordActivity2), null, new o0O0OOO0(passwordActivity2), false, 10));
            return;
        }
        if (i == 2) {
            String str3 = passwordActivity2.f21803OooooOo;
            String str4 = passwordActivity2.f21804Oooooo;
            BaseActivityK.OooOoo0(passwordActivity2, null, 0L, 3, null);
            passwordActivity2.OooOooo().userResetPassword(str3, string, str4).observe(passwordActivity2, new OooOo(new o0O0o00O(passwordActivity2, str3, string), new o0O0o0(passwordActivity2), null, false, 12));
            return;
        }
        if (i == 3) {
            passwordActivity2.Oooo00O(passwordActivity2.f21803OooooOo, passwordActivity2.f21804Oooooo, string, 0);
        } else if (i == 4) {
            passwordActivity2.Oooo000(passwordActivity2.f21803OooooOo, string);
        } else {
            if (i != 5) {
                return;
            }
            passwordActivity2.Oooo00O(passwordActivity2.f21803OooooOo, passwordActivity2.f21804Oooooo, string, 1);
        }
    }
}
