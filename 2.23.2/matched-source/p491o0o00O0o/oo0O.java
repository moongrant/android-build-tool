package p491o0o00O0o;

import android.os.Looper;
import android.view.View;
import androidx.activity.OooOo00;
import androidx.lifecycle.ViewModelLazy;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.vm.account.PasswordVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p384o0OOoo0O.o000oOoO;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f49074OooO0oO;

    public oo0O(PasswordActivity passwordActivity) {
        this.f49074OooO0oO = passwordActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = PasswordActivity.f24770OooOoOO;
        PasswordActivity passwordActivity = this.f49074OooO0oO;
        String string = StringsKt.trim((CharSequence) passwordActivity.OooOoO0().f44208OooO0OO.getText().toString()).toString();
        boolean z = true;
        if (passwordActivity.OooOoO0().f44208OooO0OO.getText().toString().length() != string.length() || string.length() < 6) {
            String string2 = passwordActivity.getString(o000000.invalid_password);
            if (string2 != null && !StringsKt.isBlank(string2)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        ClientCodeType clientCodeType = passwordActivity.f24778OooOoO0;
        int i2 = clientCodeType == null ? -1 : PasswordActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        ViewModelLazy viewModelLazy = passwordActivity.f24774OooOo00;
        if (i2 == 1) {
            String str = passwordActivity.f24773OooOo0;
            String str2 = passwordActivity.f24776OooOo0o;
            BaseActivityK.OooOo0o(passwordActivity, null, 0L, 3);
            ((PasswordVM) viewModelLazy.getValue()).phoneRegister(str, string, str2).observe(passwordActivity, new o000oOoO(new o00OO00O(passwordActivity), null, new o00OO0O0(passwordActivity), false, 10));
            return;
        }
        if (i2 == 2) {
            String str3 = passwordActivity.f24773OooOo0;
            String str4 = passwordActivity.f24776OooOo0o;
            BaseActivityK.OooOo0o(passwordActivity, null, 0L, 3);
            ((PasswordVM) viewModelLazy.getValue()).userResetPassword(str3, string, str4).observe(passwordActivity, new o000oOoO(new o00OOO0(passwordActivity, str3, string), new o00OOO0O(passwordActivity), null, false, 12));
            return;
        }
        if (i2 == 3) {
            passwordActivity.OooOoOO(0, passwordActivity.f24773OooOo0, passwordActivity.f24776OooOo0o, string);
        } else if (i2 == 4) {
            passwordActivity.OooOoO(passwordActivity.f24773OooOo0, string);
        } else {
            if (i2 != 5) {
                return;
            }
            passwordActivity.OooOoOO(1, passwordActivity.f24773OooOo0, passwordActivity.f24776OooOo0o, string);
        }
    }
}
