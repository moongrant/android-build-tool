package OooOOO;

import OooO00o.OooO00o.OooO00o.OooO00o.p002OooOOo0.o0ooOOo;
import android.app.Dialog;
import com.app.base.app.appConfig.apiDataModela.FriendsRepository;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.share.bean.ShareResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f171Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f172OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f173OoooO00;

    public /* synthetic */ OooOOO0(Object obj, Object obj2, int i) {
        this.f171Oooo = i;
        this.f173OoooO00 = obj;
        this.f172OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f171Oooo) {
            case 0:
                BaseResp response = (BaseResp) this.f173OoooO00;
                o0ooOOo this$0 = (o0ooOOo) this.f172OoooO0;
                Intrinsics.checkNotNullParameter(response, "$response");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(response instanceof ShareResponse)) {
                    ShareResponse shareResponseCreateShareResponse$default = ShareResponse.Companion.createShareResponse$default(ShareResponse.INSTANCE, -2002, null, 2, null);
                    if (this$0.isAdded()) {
                        Dialog dialog = this$0.f62OoooO0O;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        this$0.OooO00o(shareResponseCreateShareResponse$default);
                        break;
                    }
                } else {
                    ShareResponse shareResponse = (ShareResponse) response;
                    if (this$0.isAdded()) {
                        Dialog dialog2 = this$0.f62OoooO0O;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        this$0.OooO00o(shareResponse);
                        break;
                    }
                }
                break;
            case 1:
                FriendsRepository.m10toDBUserFriends$lambda0((List) this.f173OoooO00, (p141o00OOOoO.OooO0OO) this.f172OoooO0);
                break;
            default:
                com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o = (com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o) this.f173OoooO00;
                ((com.google.android.exoplayer2.drm.OooO00o) this.f172OoooO0).OooOoo(c0097OooO00o.f13738OooO00o, c0097OooO00o.f13739OooO0O0);
                break;
        }
    }
}
