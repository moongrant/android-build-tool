package p474o0o00;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o0OO00O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ProtectionDetailActivity f47343OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ TrustedDevice f47344OooO0oo;

    public o0oOOo(ProtectionDetailActivity protectionDetailActivity, TrustedDevice trustedDevice) {
        this.f47343OooO0oO = protectionDetailActivity;
        this.f47344OooO0oo = trustedDevice;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        long id = this.f47344OooO0oo.getId();
        int i = ProtectionDetailActivity.f25280OooOo0;
        ProtectionDetailActivity protectionDetailActivity = this.f47343OooO0oO;
        protectionDetailActivity.getClass();
        o0OO00O o0oo00o2 = new o0OO00O(protectionDetailActivity);
        o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.account_login_protection_delete_dialog_title));
        o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.account_login_protection_delete_dialog_content));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.account_login_protection_delete_dialog_confirm));
        o0oo00o2.OooOo0(new o0(protectionDetailActivity, id));
        o0oo00o2.OooOO0o();
    }
}
