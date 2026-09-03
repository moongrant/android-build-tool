package p143o00OOooo;

import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.common.model.FaqTag;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import com.yalla.yalla.util.NetWork;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p524o0o0O0oO.o0O0000O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0o0O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32041OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32042OooO0O0;

    public /* synthetic */ oo0o0O0(Object obj, int i) {
        this.f32041OooO00o = i;
        this.f32042OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32041OooO00o) {
            case 0:
                RoomInfoMomentFragment.m69initObserver$lambda5((RoomInfoMomentFragment) this.f32042OooO0O0, (Long) obj);
                break;
            case 1:
                o0O0000O this$0 = (o0O0000O) this.f32042OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FAQ);
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.OooO00o("isReply", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
                    webPageInfo.OooO00o("appVersion", o0OOO0o.OooO0O0());
                    StringBuilder sb = new StringBuilder();
                    o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                    sb.append(o0Oo0oo.OooO0O0());
                    sb.append(' ');
                    sb.append(o0Oo0oo.OooO0OO());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, sb.toString());
                    webPageInfo.OooO00o("sysVersion", o0Oo0oo.OooO0Oo());
                    webPageInfo.OooO00o("internet", NetWork.OooO00o().toString());
                    webPageInfo.OooO00o("faqTag", String.valueOf(FaqTag.OtherIssues.getValue()));
                    WebActivity.f22108OoooooO.OooO00o(this$0.f43021OooO0Oo, webPageInfo);
                    OooOo.OooO0O0("105022");
                    break;
                }
                break;
            case 2:
                Function1 tmp0 = (Function1) this.f32042OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke((Boolean) obj);
                break;
            case 3:
                TopicPostLatestFragment.m403initObserve$lambda2((TopicPostLatestFragment) this.f32042OooO0O0, (Long) obj);
                break;
            default:
                MainRoomMineJoinedFragment.m474onLazyInit$lambda1((MainRoomMineJoinedFragment) this.f32042OooO0O0, obj);
                break;
        }
    }
}
