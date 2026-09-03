package p519o0o0O0oO;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.ui.dialog.PasswordSettingDialog;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PasswordSettingDialog f53133OooO0o0;

    public s(PasswordSettingDialog passwordSettingDialog) {
        this.f53133OooO0o0 = passwordSettingDialog;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        this.f53133OooO0o0.OooOO0o();
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.password_unjoin_toast_Done);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
    }
}
