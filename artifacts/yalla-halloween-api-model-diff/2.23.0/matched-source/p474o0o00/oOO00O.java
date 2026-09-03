package p474o0o00;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.ViewModelLazy;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.vm.account.PasswordVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o0000OO0;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f47347OooO0oO;

    public oOO00O(PasswordActivity passwordActivity) {
        this.f47347OooO0oO = passwordActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = PasswordActivity.f25224OooOoOO;
        PasswordActivity passwordActivity = this.f47347OooO0oO;
        String string = StringsKt.trim((CharSequence) passwordActivity.OooOoO0().f59108OooO0OO.getText().toString()).toString();
        boolean z = true;
        if (passwordActivity.OooOoO0().f59108OooO0OO.getText().toString().length() != string.length() || string.length() < 6) {
            String string2 = passwordActivity.getString(oO00OOo0.invalid_password);
            if (string2 != null && !StringsKt.isBlank(string2)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        ClientCodeType clientCodeType = passwordActivity.f25232OooOoO0;
        int i2 = clientCodeType == null ? -1 : PasswordActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        ViewModelLazy viewModelLazy = passwordActivity.f25228OooOo00;
        if (i2 == 1) {
            String str = passwordActivity.f25227OooOo0;
            String str2 = passwordActivity.f25230OooOo0o;
            BaseActivityK.OooOo0o(passwordActivity, null, 0L, 3);
            ((PasswordVM) viewModelLazy.getValue()).phoneRegister(str, string, str2).observe(passwordActivity, new o0000OO0(new o00O000(passwordActivity), null, new o00O000o(passwordActivity), false, 10));
            return;
        }
        if (i2 == 2) {
            String str3 = passwordActivity.f25227OooOo0;
            String str4 = passwordActivity.f25230OooOo0o;
            BaseActivityK.OooOo0o(passwordActivity, null, 0L, 3);
            ((PasswordVM) viewModelLazy.getValue()).userResetPassword(str3, string, str4).observe(passwordActivity, new o0000OO0(new oo00o(passwordActivity, str3, string), new o00O0(passwordActivity), null, false, 12));
            return;
        }
        if (i2 == 3) {
            passwordActivity.OooOoOO(0, passwordActivity.f25227OooOo0, passwordActivity.f25230OooOo0o, string);
        } else if (i2 == 4) {
            passwordActivity.OooOoO(passwordActivity.f25227OooOo0, string);
        } else {
            if (i2 != 5) {
                return;
            }
            passwordActivity.OooOoOO(1, passwordActivity.f25227OooOo0, passwordActivity.f25230OooOo0o, string);
        }
    }
}
