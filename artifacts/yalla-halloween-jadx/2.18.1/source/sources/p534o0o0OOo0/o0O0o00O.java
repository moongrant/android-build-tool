package p534o0o0OOo0;

import android.view.View;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o00O extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f43563Oooo;

    public o0O0o00O(PasswordActivity passwordActivity) {
        this.f43563Oooo = passwordActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21845o00Ooo;
        PasswordActivity passwordActivity = this.f43563Oooo;
        SmsCodeActivity.OooO00o.OooO00o(passwordActivity, passwordActivity.f21784Ooooo0o, passwordActivity.f21785OooooO0, ClientCodeType.Retrieve, -1, null, 96);
    }
}
