package o0OOOO0;

import android.os.Bundle;
import p349o0OOOOoO.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends o0OOOO00.OooO00o {
    public OooOO0(Bundle bundle) {
        OooO00o(bundle);
    }

    @Override // o0OOOO00.OooO00o
    public final void OooO00o(Bundle bundle) {
        super.OooO00o(bundle);
        OooOO0O oooOO0O = new OooOO0O();
        bundle.getInt("_wxobject_sdkVer");
        bundle.getString("_wxobject_title");
        bundle.getString("_wxobject_description");
        bundle.getByteArray("_wxobject_thumbdata");
        bundle.getString("_wxobject_mediatagname");
        bundle.getString("_wxobject_message_action");
        bundle.getString("_wxobject_message_ext");
        String string = bundle.getString("_wxobject_identifier_");
        if (string == null || string.length() == 0) {
            int i = o00O0O.f42850OooO00o;
        } else {
            string = string.replace("com.tencent.mm.sdk.openapi", "com.tencent.mm.sdk.modelmsg");
        }
        if (string == null || string.length() <= 0) {
            return;
        }
        try {
            OooOO0O.OooO00o oooO00o = (OooOO0O.OooO00o) Class.forName(string).newInstance();
            oooOO0O.f42800OooO00o = oooO00o;
            oooO00o.OooO00o();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            int i2 = o00O0O.f42850OooO00o;
        }
    }

    @Override // o0OOOO00.OooO00o
    public final int OooO0O0() {
        return 4;
    }
}
