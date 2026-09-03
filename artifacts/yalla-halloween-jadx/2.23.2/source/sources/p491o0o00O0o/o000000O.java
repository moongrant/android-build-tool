package p491o0o00O0o;

import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000;
import com.code.android.util.o0000;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p004OooO0oO.o000oOoO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p571o0oOoO0.o0000oo;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends o0000oo<TrustedDevice> {
    public o000000O(AccountProtectionActivity accountProtectionActivity, int i) {
        super(accountProtectionActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        TrustedDevice trustedDevice = (TrustedDevice) obj;
        if (viewHolder == null || trustedDevice == null) {
            return;
        }
        TextView textView = (TextView) viewHolder.getView(o0OO00O.tvDeviceName);
        if (trustedDevice.getIsCurrent()) {
            String strOooO0O0 = o000oOoO.OooO0O0(" (", o0000.OooO0OO(o000000.account_login_protection_native), ")");
            textView.setText(trustedDevice.getPhoneType() + strOooO0O0);
            Intrinsics.checkNotNull(textView);
            o000.OooO0O0(textView, o0000.OooO00o(o0OOO0o.rec_color_00D8C9), strOooO0O0);
        } else {
            textView.setText(trustedDevice.getPhoneType());
        }
        viewHolder.setText(o0OO00O.tvRecentLoginTime, o0O0O0o0.OooO0OO(trustedDevice.getLastLoginTime(), "dd/MM/yyyy HH:mm"));
    }
}
