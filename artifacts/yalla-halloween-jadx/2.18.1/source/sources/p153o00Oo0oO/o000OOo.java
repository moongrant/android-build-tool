package p153o00Oo0oO;

import android.content.Context;
import com.app.base.Function.LifecycleRequest;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import java.util.Map;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo {
    public final void OooO00o(Context context, String str, int i, String str2, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("type", CloudFileType.USER_AVATAR.getCode() + "");
        mapOooO0O0.put("id", str);
        mapOooO0O0.put("imgUpType", i + "");
        mapOooO0O0.put("imageurl", str2);
        LifecycleRequest lifecycleRequest = new LifecycleRequest(context);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        lifecycleRequest.OooO0O0(o0ooOOo.f32244OooOoo, o0ooOOo.f32265OoooOOo, mapOooO0O0, oooO0O0);
    }

    public final void OooO0O0(Context context, Map<String, String> map, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.remove("region");
        mapOooO0O0.putAll(map);
        LifecycleRequest lifecycleRequest = new LifecycleRequest(context);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(lifecycleRequest.OooO00o(oooO0O0), o0ooOOo.f32244OooOoo, o0ooOOo.f32329o00oO0O, mapOooO0O0, oooO0O0);
    }

    public final void OooO0OO(Context context, String str, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.remove("region");
        mapOooO0O0.put("headframeId", str);
        LifecycleRequest lifecycleRequest = new LifecycleRequest(context);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        lifecycleRequest.OooO0O0(o0ooOOo.f32244OooOoo, o0ooOOo.f32288o00000o0, mapOooO0O0, oooO0O0);
    }
}
