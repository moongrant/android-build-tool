package p384o0OOoo0O;

import android.content.Context;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import java.util.LinkedHashMap;
import p426o0OoO0o0.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0ooOOo {
    public static void OooO00o(Context context, String str, int i, String str2, OooO0OO.OooO0O0 oooO0O0) {
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("type", CloudFileType.USER_AVATAR.getCode() + "");
        linkedHashMapOooO00o.put("id", str);
        linkedHashMapOooO00o.put("imgUpType", i + "");
        linkedHashMapOooO00o.put("imageurl", str2);
        new com.yalla.yalla.util.Function.OooO0OO(context).OooO00o(Oooo0.f43359OooOoo, Oooo0.f43380OoooOOo, linkedHashMapOooO00o, oooO0O0);
    }

    public static void OooO0O0(Context context, String str, OooO0OO.OooO0O0 oooO0O0) {
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.remove("region");
        linkedHashMapOooO00o.put("headframeId", str);
        new com.yalla.yalla.util.Function.OooO0OO(context).OooO00o(Oooo0.f43359OooOoo, Oooo0.f43399o00000O0, linkedHashMapOooO00o, oooO0O0);
    }
}
