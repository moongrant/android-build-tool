package p491o0o00O0o;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ProtectionDetailActivity f49008OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ TrustedDevice f49009OooO0oo;

    public o0O00O(ProtectionDetailActivity protectionDetailActivity, TrustedDevice trustedDevice) {
        this.f49008OooO0oO = protectionDetailActivity;
        this.f49009OooO0oo = trustedDevice;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        long id = this.f49009OooO0oo.getId();
        int i = ProtectionDetailActivity.f24825OooOo0;
        ProtectionDetailActivity protectionDetailActivity = this.f49008OooO0oO;
        protectionDetailActivity.getClass();
        o000O o000o = new o000O(protectionDetailActivity);
        o000o.OooOoO(o0000.OooO0OO(o000000.account_login_protection_delete_dialog_title));
        o000o.OooOo00(o0000.OooO0OO(o000000.account_login_protection_delete_dialog_content));
        o000o.OooOo(true);
        o000o.OooOOOo(o0000.OooO0OO(o000000.account_login_protection_delete_dialog_confirm));
        o000o.OooOo0(new o0O00OOO(protectionDetailActivity, id));
        o000o.OooOO0o();
    }
}
