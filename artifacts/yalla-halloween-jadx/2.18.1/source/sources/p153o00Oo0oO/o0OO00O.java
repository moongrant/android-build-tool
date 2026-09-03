package p153o00Oo0oO;

import com.app.base.Function.OooO0OO;
import com.app.base.application.App;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import java.util.Map;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {
    public final void OooO00o(CloudFileType cloudFileType, String str, int i, String str2, o00OO0O0.OooO0O0 oooO0O0) {
        App app = App.f11458Oooo0oO;
        Map mapOooO00o = OooO0OO.OooO00o();
        mapOooO00o.put("type", cloudFileType.getCode() + "");
        mapOooO00o.put("id", str);
        mapOooO00o.put("imgUpType", i + "");
        mapOooO00o.put("imageurl", str2);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, "/WebserversME/PictureME/PicQiniu", mapOooO00o, oooO0O0);
    }
}
