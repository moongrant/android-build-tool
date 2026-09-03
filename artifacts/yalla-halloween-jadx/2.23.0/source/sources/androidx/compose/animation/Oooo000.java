package androidx.compose.animation;

import android.content.Context;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.code.android.util.o0000;
import com.google.firebase.FirebaseCommonRegistrar;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import p314o0O0oOo0.o000O0Oo;
import p584o0oOooO0.oO00O0o;
import p585o0oOooOO.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements o000O0Oo.OooO00o, f {
    public static String OooO0OO(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    @Override // p585o0oOooOO.f
    public void OooO00o(Editable editable, int i, int i2) {
        int i3 = MomentSendActivity.f26175Oooo0OO;
        editable.setSpan(new ForegroundColorSpan(o0000.OooO00o(oO00O0o.color_00d8c9)), i, i2, 33);
    }

    @Override // o0O0oOo0.o000O0Oo.OooO00o
    public String OooO0O0(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.OooO00o(installerPackageName) : "";
    }
}
