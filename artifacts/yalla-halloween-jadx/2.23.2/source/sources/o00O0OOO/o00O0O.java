package o00O0OOO;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f36297OooO00o = p115o00O00oO.o0Oo0oo.OooO0o("PackageManagerHelper");

    public static void OooO00o(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        String str = f36297OooO00o;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            p115o00O00oO.o0Oo0oo o0oo0ooOooO0Oo = p115o00O00oO.o0Oo0oo.OooO0Oo();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(z ? "enabled" : "disabled");
            o0oo0ooOooO0Oo.OooO00o(str, sb.toString());
        } catch (Exception e) {
            p115o00O00oO.o0Oo0oo o0oo0ooOooO0Oo2 = p115o00O00oO.o0Oo0oo.OooO0Oo();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            String string = sb2.toString();
            if (((o00O00oO.o0Oo0oo.OooO00o) o0oo0ooOooO0Oo2).f36159OooO0OO <= 3) {
                Log.d(str, string, e);
            }
        }
    }
}
