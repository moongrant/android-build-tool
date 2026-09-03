package o000Oo0;

import android.content.Context;
import androidx.media3.common.Player;
import com.google.firebase.FirebaseCommonRegistrar;
import p080o000OoO.o00000O0;
import p315o0O0oOo.o000OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements OooO0o, o00000O0.OooO00o, o000OO.OooO00o {
    @Override // o0O0oOo.o000OO.OooO00o
    public final String OooO0O0(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.OooO00o(installerPackageName) : "";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onRenderedFirstFrame();
    }
}
