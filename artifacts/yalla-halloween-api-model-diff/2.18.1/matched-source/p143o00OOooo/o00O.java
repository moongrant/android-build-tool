package p143o00OOooo;

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
import p515o0o0O00.o00O00;
import p524o0o0O0oO.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31984OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31985OooO0O0;

    public /* synthetic */ o00O(Object obj, int i) {
        this.f31984OooO00o = i;
        this.f31985OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = 0;
        switch (this.f31984OooO00o) {
            case 0:
                RoomInfoMomentFragment.m70initObserver$lambda6((RoomInfoMomentFragment) this.f31985OooO0O0, (Long) obj);
                break;
            case 1:
                o0O0000O this$0 = (o0O0000O) this.f31985OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((url == null || StringsKt.isBlank(url)) ? 1 : 0) == 0) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FirstChargeRewardUrlMain);
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.f21220OoooO0 = true;
                    WebActivity.f22108OoooooO.OooO00o(this$0.f43021OooO0Oo, webPageInfo);
                    break;
                }
                break;
            case 2:
                IMSocketManagerOld this$1 = (IMSocketManagerOld) this.f31985OooO0O0;
                NetworkUtil.NetStatus netStatus = (NetworkUtil.NetStatus) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f21675OooO0oO && netStatus.getIsConnected() && this$1.f21673OooO0o.getValue() != IMSocketManagerOld.State.ConnectSuccess) {
                    o00O00.OooO0O0("SocketManager netStatus = " + netStatus);
                    this$1.f21668OooO = 5000L;
                    IMSocketManagerOld.OooO0oo(this$1, false, true, 1);
                    break;
                }
                break;
            case 3:
                FollowingActivity followingActivity = (FollowingActivity) this.f31985OooO0O0;
                Long l = (Long) obj;
                while (true) {
                    if (i < followingActivity.f23331OooooO0.getData().size()) {
                        if (l.longValue() != followingActivity.f23331OooooO0.getData().get(i).getUserId()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i > 0 && i < followingActivity.f23331OooooO0.getData().size()) {
                    followingActivity.f23331OooooO0.remove(i);
                    break;
                }
                break;
            default:
                TopicPostLatestFragment.m404initObserve$lambda3((TopicPostLatestFragment) this.f31985OooO0O0, (ArrayList) obj);
                break;
        }
    }
}
