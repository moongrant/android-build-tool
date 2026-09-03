package o0OOOO00;

import android.os.Bundle;
import p346o0OOOOoO.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends OooOo00 {
    public OooOO0(Bundle bundle) {
        OooO00o(bundle);
    }

    @Override // p346o0OOOOoO.OooOo00
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
            int i = p343o0OOO0oo.OooOO0.f43608OooO00o;
        } else {
            string = string.replace("com.tencent.mm.sdk.openapi", "com.tencent.mm.sdk.modelmsg");
        }
        if (string == null || string.length() <= 0) {
            return;
        }
        try {
            OooOO0O.OooO00o oooO00o = (OooOO0O.OooO00o) Class.forName(string).newInstance();
            oooOO0O.f43617OooO00o = oooO00o;
            oooO00o.OooO00o();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            int i2 = p343o0OOO0oo.OooOO0.f43608OooO00o;
        }
    }

    @Override // p346o0OOOOoO.OooOo00
    public final int OooO0O0() {
        return 4;
    }
}
