package p490o0o00O0;

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
import p494o0o00OO0.OooO;
import p587o0oOooO.oOO0OoO0;
import p587o0oOooO.ooooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48741OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48742OooO0o0;

    public /* synthetic */ o0(Object obj, int i) {
        this.f48741OooO0Oo = i;
        this.f48742OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48741OooO0Oo;
        Object obj2 = this.f48742OooO0o0;
        switch (i) {
            case 0:
                SmsCodeActivity this$0 = (SmsCodeActivity) obj2;
                int i2 = SmsCodeActivity.f24845Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    oOO0OoO0 ooo0ooo0 = ooooO0O0.f56869OooO00o;
                    if (ooo0ooo0 != null) {
                        ooo0ooo0.cancel();
                        ooooO0O0.f56869OooO00o = null;
                    }
                    if (ooooO0O0.f56870OooO0O0 != null) {
                        ooooO0O0.f56870OooO0O0 = null;
                    }
                    ooooO0O0.f56871OooO0OO = null;
                    this$0.finish();
                }
                break;
            default:
                OooO this$1 = (OooO) obj2;
                Uri uri = (Uri) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Activity activityOooO00o = OooO0O0.OooO00o(AlbumActivity.class);
                if (activityOooO00o != null) {
                    activityOooO00o.finish();
                }
                ArrayList arrayList = new ArrayList();
                MomentSendActivity momentSendActivity = this$1.f49536OooO00o;
                Intrinsics.checkNotNull(uri);
                File fileOooO0O0 = Oooo000.OooO0O0(momentSendActivity, uri);
                String absolutePath = fileOooO0O0 != null ? fileOooO0O0.getAbsolutePath() : null;
                if (absolutePath == null) {
                    absolutePath = "";
                }
                OooO0o.OooO0o0(absolutePath, new OooO.OooO00o(absolutePath, arrayList, this$1));
                break;
        }
    }
}
