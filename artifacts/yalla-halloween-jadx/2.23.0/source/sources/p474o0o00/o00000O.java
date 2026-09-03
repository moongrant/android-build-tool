package p474o0o00;

import android.view.View;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.LoginActivity.OooO;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import kotlin.jvm.internal.Intrinsics;
import p402o0Oo0OOO.o00O000o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47231OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47232OooO0o0;

    public /* synthetic */ o00000O(Object obj, int i) {
        this.f47231OooO0Oo = i;
        this.f47232OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f47231OooO0Oo;
        Object obj = this.f47232OooO0o0;
        switch (i) {
            case 0:
                LoginActivity this$0 = (LoginActivity) obj;
                int i2 = LoginActivity.f25186OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO000.OooO00o("101060");
                o00O000o.f44496OooO0oO.observe(this$0, this$0.new OooO());
                break;
            default:
                WalletCoinFragment.iniView$lambda$12((WalletCoinFragment) obj, view);
                break;
        }
    }
}
