package p474o0o00;

import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000;
import com.code.android.util.o0000;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p004OooO0oO.o000oOoO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends o000O<TrustedDevice> {
    public OooOo00(AccountProtectionActivity accountProtectionActivity, int i) {
        super(accountProtectionActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        TrustedDevice trustedDevice = (TrustedDevice) obj;
        if (viewHolder == null || trustedDevice == null) {
            return;
        }
        TextView tvDeviceName = (TextView) viewHolder.getView(oO00O0oO.tvDeviceName);
        if (trustedDevice.getIsCurrent()) {
            String strOooO00o = o000oOoO.OooO00o(" (", o0000.OooO0OO(oO00OOo0.account_login_protection_native), ")");
            tvDeviceName.setText(trustedDevice.getPhoneType() + strOooO00o);
            Intrinsics.checkNotNullExpressionValue(tvDeviceName, "tvDeviceName");
            o000.OooO0O0(tvDeviceName, o0000.OooO00o(oO00O0o.rec_color_00D8C9), strOooO00o);
        } else {
            tvDeviceName.setText(trustedDevice.getPhoneType());
        }
        viewHolder.setText(oO00O0oO.tvRecentLoginTime, o0000oo.OooO0OO(trustedDevice.getLastLoginTime(), "dd/MM/yyyy HH:mm"));
    }
}
