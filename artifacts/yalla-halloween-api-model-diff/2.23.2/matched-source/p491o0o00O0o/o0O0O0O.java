package p491o0o00O0o;

import android.app.Activity;
import android.net.Uri;
import androidx.lifecycle.Observer;
import com.code.android.util.OooO0O0;
import com.code.android.util.Oooo000;
import com.yalla.album.AlbumActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p184o00o00O0.OooO0o;
import p494o0o00OOo.o0OoOo0;
import p590o0oOooo0.r0;
import p590o0oOooo0.s0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0O0O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49018OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49019OooO0o0;

    public /* synthetic */ o0O0O0O(Object obj, int i) {
        this.f49018OooO0Oo = i;
        this.f49019OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49018OooO0Oo;
        Object obj2 = this.f49019OooO0o0;
        switch (i) {
            case 0:
                SmsCodeActivity this$0 = (SmsCodeActivity) obj2;
                int i2 = SmsCodeActivity.f24843Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    r0 r0Var = s0.f57273OooO00o;
                    if (r0Var != null) {
                        r0Var.cancel();
                        s0.f57273OooO00o = null;
                    }
                    if (s0.f57274OooO0O0 != null) {
                        s0.f57274OooO0O0 = null;
                    }
                    s0.f57275OooO0OO = null;
                    this$0.finish();
                }
                break;
            default:
                o0OoOo0 this$1 = (o0OoOo0) obj2;
                Uri uri = (Uri) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Activity activityOooO00o = OooO0O0.OooO00o(AlbumActivity.class);
                if (activityOooO00o != null) {
                    activityOooO00o.finish();
                }
                ArrayList arrayList = new ArrayList();
                MomentSendActivity momentSendActivity = this$1.f49590OooO00o;
                Intrinsics.checkNotNull(uri);
                File fileOooO0O0 = Oooo000.OooO0O0(momentSendActivity, uri);
                String absolutePath = fileOooO0O0 != null ? fileOooO0O0.getAbsolutePath() : null;
                if (absolutePath == null) {
                    absolutePath = "";
                }
                OooO0o.OooO0o0(absolutePath, new o0OoOo0.OooO00o(absolutePath, arrayList, this$1));
                break;
        }
    }
}
