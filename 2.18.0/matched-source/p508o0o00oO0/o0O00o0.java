package p508o0o00oO0;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.ShareChannel;
import kotlin.jvm.internal.Intrinsics;
import p144o00OOooo.o00O0O0O;
import p504o0o00o0.o00000O;
import p581o0oOoOOo.l;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f41684Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00000O f41685OoooO00;

    public /* synthetic */ o0O00o0(o00000O o00000o, int i) {
        this.f41684Oooo = i;
        this.f41685OoooO00 = o00000o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ShareChannel shareChannel;
        switch (this.f41684Oooo) {
            case 0:
                oo00oO this$0 = (oo00oO) this.f41685OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(view, this$0.OooOO0O().f49370OooO0OO)) {
                    shareChannel = ShareChannel.Friends;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0O().f49372OooO0o)) {
                    shareChannel = ShareChannel.Moments;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0O().f49369OooO0O0)) {
                    shareChannel = ShareChannel.Facebook;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0O().f49375OooO0oo)) {
                    shareChannel = ShareChannel.Twitter;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0O().f49371OooO0Oo)) {
                    shareChannel = ShareChannel.Instagram;
                } else {
                    shareChannel = Intrinsics.areEqual(view, this$0.OooOO0O().f49367OooO) ? ShareChannel.WhatsApp : null;
                }
                this$0.f41702OoooOoo.OooO00o(shareChannel);
                this$0.OooO0O0();
                break;
            default:
                l this$1 = (l) this.f41685OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                OooOo.OooO0O0("105009");
                FragmentActivity fragmentActivity = this$1.f46004OoooOOO;
                SharedUrlManager.INSTANCE.getFeedBackUrl().observe(fragmentActivity, new o00O0O0O(fragmentActivity, 7));
                break;
        }
    }
}
