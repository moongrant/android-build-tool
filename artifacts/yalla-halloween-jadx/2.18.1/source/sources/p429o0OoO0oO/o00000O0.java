package p429o0OoO0oO;

import android.os.Bundle;
import com.android.billingclient.api.o0O0O00;
import p426o0OoO0Oo.o0OO00O;
import p428o0OoO0o0.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 extends o0000O00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00000O f39904OooO0OO;

    public o00000O0(Bundle bundle) {
        OooO00o(bundle);
    }

    @Override // p428o0OoO0o0.o0000O00
    public final void OooO00o(Bundle bundle) {
        super.OooO00o(bundle);
        o00000O o00000o = new o00000O();
        o00000o.f39896OooO00o = bundle.getInt("_wxobject_sdkVer");
        o00000o.f39897OooO0O0 = bundle.getString("_wxobject_title");
        o00000o.f39898OooO0OO = bundle.getString("_wxobject_description");
        o00000o.f39899OooO0Oo = bundle.getByteArray("_wxobject_thumbdata");
        o00000o.f39900OooO0o = bundle.getString("_wxobject_mediatagname");
        o00000o.f39902OooO0oO = bundle.getString("_wxobject_message_action");
        o00000o.f39903OooO0oo = bundle.getString("_wxobject_message_ext");
        String string = bundle.getString("_wxobject_identifier_");
        if (string == null || string.length() == 0) {
            o0O0O00 o0o0o00 = o0OO00O.f39846OooO00o;
        } else {
            string = string.replace("com.tencent.mm.sdk.openapi", "com.tencent.mm.sdk.modelmsg");
        }
        if (string != null && string.length() > 0) {
            try {
                o00000O.OooO00o oooO00o = (o00000O.OooO00o) Class.forName(string).newInstance();
                o00000o.f39901OooO0o0 = oooO00o;
                oooO00o.OooO00o();
            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();
                o0O0O00 o0o0o01 = o0OO00O.f39846OooO00o;
            }
        }
        this.f39904OooO0OO = o00000o;
    }

    @Override // p428o0OoO0o0.o0000O00
    public final int OooO0O0() {
        return 4;
    }
}
