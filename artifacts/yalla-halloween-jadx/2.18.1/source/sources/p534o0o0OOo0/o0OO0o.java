package p534o0o0OOo0;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0o extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ProtectionDetailActivity f43577Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TrustedDevice f43578Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(ProtectionDetailActivity protectionDetailActivity, TrustedDevice trustedDevice) {
        super(0L, 1, null);
        this.f43577Oooo0o = protectionDetailActivity;
        this.f43578Oooo0oO = trustedDevice;
    }

    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ProtectionDetailActivity protectionDetailActivity = this.f43577Oooo0o;
        long id = this.f43578Oooo0oO.getId();
        int i = ProtectionDetailActivity.f21828Ooooo0o;
        oo0oOO0 oo0ooo0 = new oo0oOO0(protectionDetailActivity);
        oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.account_login_protection_delete_dialog_title));
        oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.account_login_protection_delete_dialog_content));
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.account_login_protection_delete_dialog_confirm));
        oo0ooo0.OooOo0o(new o0OO0oO0(protectionDetailActivity, id));
        oo0ooo0.OooOOO0();
    }
}
