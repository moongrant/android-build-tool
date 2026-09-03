package p143o00OOooo;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.common.model.FaqTag;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import com.yalla.yalla.util.NetWork;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p168o00Ooo0.o00O0O;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31997OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31998OooO0O0;

    public /* synthetic */ o00O0O0(Object obj, int i) {
        this.f31997OooO00o = i;
        this.f31998OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31997OooO00o) {
            case 0:
                RoomInfoMemberListFragment.m55initObserve$lambda19((RoomInfoMemberListFragment) this.f31998OooO0O0, (Integer) obj);
                break;
            case 1:
                o00O0O headerFrameLoad = (o00O0O) this.f31998OooO0O0;
                Intrinsics.checkNotNullParameter(headerFrameLoad, "$headerFrameLoad");
                headerFrameLoad.OooO00o((String) obj);
                break;
            case 2:
                YallaTeamMessageActivity context = (YallaTeamMessageActivity) this.f31998OooO0O0;
                String url = (String) obj;
                YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FAQ);
                    Intrinsics.checkNotNullExpressionValue(url, "it");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.OooO00o("isReply", "1");
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
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    context.f22258Oooooo = false;
                } else {
                    context.f22258Oooooo = false;
                }
                break;
            case 3:
                WalletActivity this$0 = (WalletActivity) this.f31998OooO0O0;
                Boolean it = (Boolean) obj;
                WalletActivity.OooO00o oooO00o2 = WalletActivity.f23268OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.booleanValue()) {
                    this$0.finish();
                }
                break;
            case 4:
                MainExploreFragment.m335initObserver$lambda5((MainExploreFragment) this.f31998OooO0O0, (List) obj);
                break;
            default:
                MainRoomMineFollowingFragment.m462loadRecommendRoomList$lambda9((MainRoomMineFollowingFragment) this.f31998OooO0O0, (Response) obj);
                break;
        }
    }
}
