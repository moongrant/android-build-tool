package com.weieyu.yalla.wxapi;

import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.o000000;
import com.app.base.base.activity.BaseActivity;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.common.util.OooO0OO;
import p175o00OooOO.o0O00O;
import p429o0OoO0Oo.o0OO00O;
import p431o0OoO0o0.o0000oo;
import p432o0OoO0oO.o00000;
import p432o0OoO0oO.o000000O;
import p432o0OoO0oO.o00000O0;
import p432o0OoO0oO.o000OOo;
import p432o0OoO0oO.o0O0O00;
import p433o0OoO0oo.o00000OO;
import p499o0o00Oo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class WXEntryActivity extends BaseActivity {
    public final void OooOoO(o0000oo o0000ooVar) {
        String str = ((o000000O) o0000ooVar).f39915OooO0O0;
        if (o0000ooVar.f39912OooO00o == 0 && OooO0OO.OooO0O0(str)) {
            LiveEventBus.get("WECHAT_LOGIN").post(str);
        } else {
            LiveEventBus.get("WECHAT_LOGIN").post("");
        }
        finish();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o0000oo o000000o2;
        String stringExtra;
        super.onCreate(bundle);
        OooOOO0 oooOOO0 = OooOOO0.f41199OooO00o;
        OooOOO0.OooO0o().OooOO0o();
        o000000 o000000Var = o0OO00O.f39866OooO00o;
        o000000 o000000Var2 = o0OO00O.f39866OooO00o;
        Intent intent = getIntent();
        boolean z = true;
        if ((intent == null || (stringExtra = intent.getStringExtra("wx_token_key")) == null || !stringExtra.equals("com.tencent.mm.openapi.token")) ? false : true) {
            String stringExtra2 = intent.getStringExtra("_mmessage_content");
            int intExtra = intent.getIntExtra("_mmessage_sdkVersion", 0);
            String stringExtra3 = intent.getStringExtra("_mmessage_appPackage");
            if (stringExtra3 == null || stringExtra3.length() == 0) {
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("_mmessage_checksum");
            byte[] bArrOooO00o = o0O00O.OooO00o(stringExtra2, intExtra, stringExtra3);
            if (byteArrayExtra == null || byteArrayExtra.length == 0 || bArrOooO00o == null || bArrOooO00o.length == 0 || byteArrayExtra.length != bArrOooO00o.length) {
                z = false;
                break;
            }
            for (int i = 0; i < byteArrayExtra.length; i++) {
                if (byteArrayExtra[i] != bArrOooO00o[i]) {
                    z = false;
                    break;
                }
            }
            if (z) {
                switch (intent.getIntExtra("_wxapi_command_type", 0)) {
                    case 1:
                        o000000o2 = new o000000O(intent.getExtras());
                        break;
                    case 2:
                        o000000o2 = new o00000(intent.getExtras());
                        break;
                    case 3:
                        new o0O0O00(intent.getExtras());
                        return;
                    case 4:
                        new o00000O0(intent.getExtras());
                        return;
                    case 5:
                        o000000o2 = new o00000OO(intent.getExtras());
                        break;
                    case 6:
                        new o000OOo(intent.getExtras());
                        return;
                }
                OooOoO(o000000o2);
                return;
            }
            o000000 o000000Var3 = o0OO00O.f39866OooO00o;
        }
    }
}
