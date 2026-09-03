package com.android.billingclient.api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import p087o000Oooo.o000O00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000 implements p517o0o0O00O.o00Ooo {
    public static final p086o000OooO.o000000 OooO00o(Context context) {
        p086o000OooO.o000000 o000000Var = new p086o000OooO.o000000(context);
        o000000Var.f28473OooOo0O.OooO00o(new p087o000Oooo.o0000O());
        o000000Var.f28473OooOo0O.OooO00o(new o000O00O());
        return o000000Var;
    }

    /* JADX INFO: Removed unreachable split cross block B:24:0x0031 */
    public static void OooO0O0(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                Uri uriFromFile = Uri.fromFile(new File(str));
                if (uriFromFile != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                        intent.setData(uriFromFile);
                        context.sendBroadcast(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
