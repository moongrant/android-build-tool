package p490o0o00O0;

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
import p386o0OOoo0O.o0OoOo0;
import p472o0OoooO.oo0OOoo;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends oo0OOoo {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f48784OooO0oO;

    public o00O00O(PasswordActivity passwordActivity) {
        this.f48784OooO0oO = passwordActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p472o0OoooO.oo0OOoo
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = PasswordActivity.f24771OooOoOO;
        PasswordActivity passwordActivity = this.f48784OooO0oO;
        String string = StringsKt.trim((CharSequence) passwordActivity.OooOoO0().f44206OooO0OO.getText().toString()).toString();
        boolean z = true;
        if (passwordActivity.OooOoO0().f44206OooO0OO.getText().toString().length() != string.length() || string.length() < 6) {
            String string2 = passwordActivity.getString(o000OOo.invalid_password);
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
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        ClientCodeType clientCodeType = passwordActivity.f24779OooOoO0;
        int i2 = clientCodeType == null ? -1 : PasswordActivity.OooO0O0.$EnumSwitchMapping$0[clientCodeType.ordinal()];
        ViewModelLazy viewModelLazy = passwordActivity.f24775OooOo00;
        if (i2 == 1) {
            String str = passwordActivity.f24774OooOo0;
            String str2 = passwordActivity.f24777OooOo0o;
            BaseActivityK.OooOo0o(passwordActivity, null, 0L, 3);
            ((PasswordVM) viewModelLazy.getValue()).phoneRegister(str, string, str2).observe(passwordActivity, new o0OoOo0(new o00O000(passwordActivity), null, new o00O000o(passwordActivity), false, 10));
            return;
        }
        if (i2 == 2) {
            String str3 = passwordActivity.f24774OooOo0;
            String str4 = passwordActivity.f24777OooOo0o;
            BaseActivityK.OooOo0o(passwordActivity, null, 0L, 3);
            ((PasswordVM) viewModelLazy.getValue()).userResetPassword(str3, string, str4).observe(passwordActivity, new o0OoOo0(new o00O00o0(passwordActivity, str3, string), new oo00o(passwordActivity), null, false, 12));
            return;
        }
        if (i2 == 3) {
            passwordActivity.OooOoOO(0, passwordActivity.f24774OooOo0, passwordActivity.f24777OooOo0o, string);
        } else if (i2 == 4) {
            passwordActivity.OooOoO(passwordActivity.f24774OooOo0, string);
        } else {
            if (i2 != 5) {
                return;
            }
            passwordActivity.OooOoOO(1, passwordActivity.f24774OooOo0, passwordActivity.f24777OooOo0o, string);
        }
    }
}
