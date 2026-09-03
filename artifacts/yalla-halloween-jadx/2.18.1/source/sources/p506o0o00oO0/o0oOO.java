package p506o0o00oO0;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.ShareChannel;
import kotlin.jvm.internal.Intrinsics;
import p143o00OOooo.o00O0O0O;
import p502o0o00o0.o00000O;
import p579o0oOoOOo.m;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0oOO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f41680Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00000O f41681Oooo0oO;

    public /* synthetic */ o0oOO(o00000O o00000o, int i) {
        this.f41680Oooo0o = i;
        this.f41681Oooo0oO = o00000o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ShareChannel shareChannel;
        switch (this.f41680Oooo0o) {
            case 0:
                o0O00o0 this$0 = (o0O00o0) this.f41681Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(view, this$0.OooOO0O().f49433OooO0OO)) {
                    shareChannel = ShareChannel.Friends;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0O().f49435OooO0o)) {
                    shareChannel = ShareChannel.Moments;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0O().f49432OooO0O0)) {
                    shareChannel = ShareChannel.Facebook;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0O().f49438OooO0oo)) {
                    shareChannel = ShareChannel.Twitter;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0O().f49434OooO0Oo)) {
                    shareChannel = ShareChannel.Instagram;
                } else {
                    shareChannel = Intrinsics.areEqual(view, this$0.OooOO0O().f49430OooO) ? ShareChannel.WhatsApp : null;
                }
                this$0.f41669OoooOOo.OooO00o(shareChannel);
                this$0.OooO0O0();
                break;
            default:
                m this$1 = (m) this.f41681Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                OooOo.OooO0O0("105009");
                FragmentActivity fragmentActivity = this$1.f46013OoooO;
                SharedUrlManager.INSTANCE.getFeedBackUrl().observe(fragmentActivity, new o00O0O0O(fragmentActivity, 7));
                break;
        }
    }
}
