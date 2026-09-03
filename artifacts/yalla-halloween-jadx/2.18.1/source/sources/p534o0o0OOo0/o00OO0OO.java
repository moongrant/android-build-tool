package p534o0o0OOo0;

import android.widget.TextView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.Oooo0;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0OO extends OooO0OO<TrustedDevice> {
    public o00OO0OO(AccountProtectionActivity accountProtectionActivity) {
        super(accountProtectionActivity, R.layout.account_item_account_protection);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        TrustedDevice trustedDevice = (TrustedDevice) obj;
        if (oooO0o == null || trustedDevice == null) {
            return;
        }
        TextView tvDeviceName = (TextView) oooO0o.OooO0Oo(R.id.tvDeviceName);
        if (trustedDevice.getIsCurrent()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(" (");
            sbOooO0o0.append(o000O0O0.OooO0OO(R.string.account_login_protection_native));
            sbOooO0o0.append(')');
            String string = sbOooO0o0.toString();
            tvDeviceName.setText(trustedDevice.getPhoneType() + string);
            Intrinsics.checkNotNullExpressionValue(tvDeviceName, "tvDeviceName");
            Oooo0.OooO0O0(tvDeviceName, o000O0O0.OooO00o(R.color.rec_color_00D8C9), string);
        } else {
            tvDeviceName.setText(trustedDevice.getPhoneType());
        }
        oooO0o.OooOO0(R.id.tvRecentLoginTime, o00O0.f48624OooO00o.OooO0OO(trustedDevice.getLastLoginTime(), "dd/MM/yyyy HH:mm"));
    }
}
