package p614o0oo0Oo;

import android.content.Intent;
import android.text.TextUtils;
import com.app.base.model.RoomModel;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p654o0ooo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f48378OooO00o = false;

    public static void OooO00o(Intent intent, o0OoOo0<RoomModel> o0oooo1) {
        if (intent != null) {
            try {
                if (intent.hasExtra("BarId")) {
                    String stringExtra = intent.getStringExtra("BarId");
                    intent.removeExtra("BarId");
                    if (!f48378OooO00o && !TextUtils.isEmpty(stringExtra)) {
                        f48378OooO00o = true;
                        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                        o00000OO.f32213OooO0oO.OooO0OO(stringExtra, new o000O0o(o0oooo1));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
