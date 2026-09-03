package com.weieyu.yalla.wxapi;

import android.content.Intent;
import android.os.Bundle;
import com.code.android.util.OooOo00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import o0OOOO0.OooO;
import o0OOOO0.OooO00o;
import o0OOOO0.OooO0o;
import o0OOOO0.OooOO0;
import o0OOOO00.OooO0O0;
import p347o0OOO0oo.OooOO0O;
import p417o0Oo0oO0.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public class WXEntryActivity extends BaseFragmentActivity {
    public final void OooOo0(OooO0O0 oooO0O0) {
        String str = ((OooO0o) oooO0O0).f42795OooO0O0;
        if (oooO0O0.f42799OooO00o == 0 && OooOo00.OooO0O0(str)) {
            LiveEventBus.get(p355o0OOOo0O.OooO0O0.OooO00o("/HxJTdB1kN7kfkNL\n", "qzkKBZEhz5I=\n")).post(str);
        } else {
            LiveEventBus.get(p355o0OOOo0O.OooO0O0.OooO00o("R6C77t30USVforHo\n", "EOX4ppygDmk=\n")).post("");
        }
        finish();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        OooO0O0 oooO0o;
        String stringExtra;
        super.onCreate(bundle);
        o00Oo0.OooO0o().OooOO0o();
        int i = p350o0OOOOoO.o00Oo0.f42846OooO00o;
        int i2 = p350o0OOOOoO.o00Oo0.f42846OooO00o;
        Intent intent = getIntent();
        boolean z = true;
        if ((intent == null || (stringExtra = intent.getStringExtra("wx_token_key")) == null || !stringExtra.equals("com.tencent.mm.openapi.token")) ? false : true) {
            String stringExtra2 = intent.getStringExtra("_mmessage_content");
            int intExtra = intent.getIntExtra("_mmessage_sdkVersion", 0);
            String stringExtra3 = intent.getStringExtra("_mmessage_appPackage");
            if (stringExtra3 != null && stringExtra3.length() != 0) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("_mmessage_checksum");
                byte[] bArrOooO00o = OooOO0O.OooO00o(intExtra, stringExtra2, stringExtra3);
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
                            oooO0o = new OooO(intent.getExtras());
                            break;
                        case 3:
                            new OooO00o(intent.getExtras());
                            return;
                        case 4:
                            new OooOO0(intent.getExtras());
                            return;
                        case 5:
                            oooO0o = new o0OOOO0o.OooO00o(intent.getExtras());
                            break;
                        case 6:
                            new o0OOOO0.OooO0O0(intent.getExtras());
                            return;
                    }
                    OooOo0(oooO0o);
                    return;
                }
            }
        }
        int i4 = p350o0OOOOoO.o00Oo0.f42846OooO00o;
    }
}
