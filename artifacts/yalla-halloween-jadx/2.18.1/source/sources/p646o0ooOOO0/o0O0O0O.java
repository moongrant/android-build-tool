package p646o0ooOOO0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.o0O0O00;
import net.sqlcipher.database.SQLiteDatabase;
import p058o0000OoO.OooO;
import p174o00OooOO.o0O00O;
import p426o0OoO0Oo.o0OO00O;
import p426o0OoO0Oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0O {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f48885OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f48886OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f48887OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Bundle f48888OooO0Oo;
    }

    public static boolean OooO00o(Context context, OooO00o oooO00o) {
        if (context == null) {
            o0O0O00 o0o0o00 = o0OO00O.f39846OooO00o;
            return false;
        }
        if (oo0o0Oo.OooO00o(oooO00o.f48885OooO00o)) {
            o0O0O00 o0o0o01 = o0OO00O.f39846OooO00o;
            return false;
        }
        if (oo0o0Oo.OooO00o(oooO00o.f48886OooO0O0)) {
            oooO00o.f48886OooO0O0 = OooO.OooO00o(new StringBuilder(), oooO00o.f48885OooO00o, ".wxapi.WXEntryActivity");
        }
        o0O0O00 o0o0o02 = o0OO00O.f39846OooO00o;
        Intent intent = new Intent();
        intent.setClassName(oooO00o.f48885OooO00o, oooO00o.f48886OooO0O0);
        Bundle bundle = oooO00o.f48888OooO0Oo;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String packageName = context.getPackageName();
        intent.putExtra("_mmessage_sdkVersion", 570490883);
        intent.putExtra("_mmessage_appPackage", packageName);
        intent.putExtra("_mmessage_content", oooO00o.f48887OooO0OO);
        intent.putExtra("_mmessage_checksum", o0O00O.OooO00o(oooO00o.f48887OooO0OO, 570490883, packageName));
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY).addFlags(134217728);
        try {
            context.startActivity(intent);
            intent.toString();
            return true;
        } catch (Exception e) {
            e.getMessage();
            o0O0O00 o0o0o03 = o0OO00O.f39846OooO00o;
            return false;
        }
    }
}
