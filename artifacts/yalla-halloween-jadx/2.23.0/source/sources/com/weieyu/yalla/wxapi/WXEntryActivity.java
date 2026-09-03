package com.weieyu.yalla.wxapi;

import android.content.Intent;
import android.os.Bundle;
import com.code.android.util.OooOo00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import o0OOOO00.OooO00o;
import o0OOOO00.OooO0o;
import p342o0OOO0oO.OooO;
import p343o0OOO0oo.OooOO0;
import p346o0OOOOoO.OooOo;
import p349o0OOOo0.OooO0O0;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public class WXEntryActivity extends BaseFragmentActivity {
    public final void OooOo0(OooOo oooOo) {
        String str = ((OooO0o) oooOo).f43616OooO0O0;
        if (oooOo.f43667OooO00o == 0 && OooOo00.OooO0O0(str)) {
            LiveEventBus.get(OooO0O0.OooO00o("B7lS/wuAGxgfu1j5\n", "UPwRt0rURFQ=\n")).post(str);
        } else {
            LiveEventBus.get(OooO0O0.OooO00o("svDKn6QkLniq8sCZ\n", "5bWJ1+VwcTQ=\n")).post("");
        }
        finish();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        OooOo oooO0o;
        String stringExtra;
        super.onCreate(bundle);
        o00Oo0.OooO0o().OooOO0o();
        int i = OooOO0.f43608OooO00o;
        int i2 = OooOO0.f43608OooO00o;
        Intent intent = getIntent();
        boolean z = true;
        if ((intent == null || (stringExtra = intent.getStringExtra("wx_token_key")) == null || !stringExtra.equals("com.tencent.mm.openapi.token")) ? false : true) {
            String stringExtra2 = intent.getStringExtra("_mmessage_content");
            int intExtra = intent.getIntExtra("_mmessage_sdkVersion", 0);
            String stringExtra3 = intent.getStringExtra("_mmessage_appPackage");
            if (stringExtra3 != null && stringExtra3.length() != 0) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("_mmessage_checksum");
                byte[] bArrOooO00o = OooO.OooO00o(intExtra, stringExtra2, stringExtra3);
                if (byteArrayExtra == null || byteArrayExtra.length == 0 || bArrOooO00o == null || bArrOooO00o.length == 0 || byteArrayExtra.length != bArrOooO00o.length) {
                    z = false;
                    break;
                }
                for (int i3 = 0; i3 < byteArrayExtra.length; i3++) {
                    if (byteArrayExtra[i3] != bArrOooO00o[i3]) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    switch (intent.getIntExtra("_wxapi_command_type", 0)) {
                        case 1:
                            oooO0o = new OooO0o(intent.getExtras());
                            break;
                        case 2:
                            oooO0o = new o0OOOO00.OooO(intent.getExtras());
                            break;
                        case 3:
                            new OooO00o(intent.getExtras());
                            return;
                        case 4:
                            new o0OOOO00.OooOO0(intent.getExtras());
                            return;
                        case 5:
                            oooO0o = new o0OOOO0.OooO00o(intent.getExtras());
                            break;
                        case 6:
                            new o0OOOO00.OooO0O0(intent.getExtras());
                            return;
                    }
                    OooOo0(oooO0o);
                    return;
                }
            }
        }
        int i4 = OooOO0.f43608OooO00o;
    }
}
