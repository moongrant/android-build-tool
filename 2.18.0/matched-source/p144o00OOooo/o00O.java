package p144o00OOooo;

import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.yalla.support.common.util.NetworkUtil;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.service.im.socket.IMSocketManagerOld;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.user.FollowingActivity;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p517o0o0O00.o00O00;
import p526o0o0O0oO.o0O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32005OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32006OooO0O0;

    public /* synthetic */ o00O(Object obj, int i) {
        this.f32005OooO00o = i;
        this.f32006OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = 0;
        switch (this.f32005OooO00o) {
            case 0:
                RoomInfoMomentFragment.m70initObserver$lambda6((RoomInfoMomentFragment) this.f32006OooO0O0, (Long) obj);
                break;
            case 1:
                o0O000 this$0 = (o0O000) this.f32006OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((url == null || StringsKt.isBlank(url)) ? 1 : 0) == 0) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FirstChargeRewardUrlMain);
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21237OoooO00 = url;
                    webPageInfo.f21239OoooOO0 = true;
                    WebActivity.f22127ooOO.OooO00o(this$0.f43038OooO0Oo, webPageInfo);
                    break;
                }
                break;
            case 2:
                IMSocketManagerOld this$1 = (IMSocketManagerOld) this.f32006OooO0O0;
                NetworkUtil.NetStatus netStatus = (NetworkUtil.NetStatus) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f21694OooO0oO && netStatus.getIsConnected() && this$1.f21692OooO0o.getValue() != IMSocketManagerOld.State.ConnectSuccess) {
                    o00O00.OooO0O0("SocketManager netStatus = " + netStatus);
                    this$1.f21687OooO = 5000L;
                    IMSocketManagerOld.OooO0oo(this$1, false, true, 1);
                    break;
                }
                break;
            case 3:
                FollowingActivity followingActivity = (FollowingActivity) this.f32006OooO0O0;
                Long l = (Long) obj;
                while (true) {
                    if (i < followingActivity.f23350Oooooo0.getData().size()) {
                        if (l.longValue() != followingActivity.f23350Oooooo0.getData().get(i).getUserId()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i > 0 && i < followingActivity.f23350Oooooo0.getData().size()) {
                    followingActivity.f23350Oooooo0.remove(i);
                    break;
                }
                break;
            default:
                TopicPostLatestFragment.m404initObserve$lambda3((TopicPostLatestFragment) this.f32006OooO0O0, (ArrayList) obj);
                break;
        }
    }
}
