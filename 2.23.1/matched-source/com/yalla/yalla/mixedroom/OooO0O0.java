package com.yalla.yalla.mixedroom;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.view.NumberSize;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p474o0OoooOO.oo0oO0;
import p587o0oOooO.oOO00OO;
import p645o0ooOOO0.o0O0O0Oo;
import p675oO0Oo.g3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23020OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23021OooO0o0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f23020OooO0Oo = i;
        this.f23021OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23020OooO0Oo;
        Object obj2 = this.f23021OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                Integer num = (Integer) obj;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                mixedRoomActivity.getClass();
                if (num.intValue() > -1) {
                    g3 g3Var = new g3(mixedRoomActivity);
                    String number = String.valueOf(num.intValue());
                    Intrinsics.checkNotNullParameter(number, "number");
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(g3Var.f59167OooOO0O);
                    oooO00o.OooO00o(o0O0O0Oo.OooO0OO());
                    oooO00o.f43152OooOoo0 = 2;
                    oooO00o.f43142OooOOoo = 3;
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    oooO00o.f43127OooO0OO = com.code.android.util.o0OoOo0.OooOOO((String) oo0oO0.OooO().getValue(), "");
                    oooO00o.f43125OooO00o = 0;
                    oooO00o.OooO0Oo(g3Var.OooOO0().f44427OooO0OO);
                    g3Var.OooOO0().f44430OooO0o0.setText(com.code.android.util.o0OoOo0.OooOOO((String) oo0oO0.OooOOoo().getValue(), ""));
                    g3Var.OooOO0().f44428OooO0Oo.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_lucky_number_open_info_xxx), number));
                    g3Var.OooOO0().f44429OooO0o.setSize(NumberSize.Size.XX);
                    g3Var.OooOO0().f44429OooO0o.setNumCount(com.code.android.util.o0OoOo0.OooO0o0(0, com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().OooO0oo().getValue()));
                    g3Var.OooOO0().f44429OooO0o.setData(number);
                    g3Var.OooO();
                }
                break;
            case 1:
                LoginActivity context = (LoginActivity) obj2;
                String url = (String) obj;
                int i3 = LoginActivity.f24734OooOo0O;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginPageFeedback);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32289OooO0o0 = url;
                    webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.feedback));
                    webPageInfo.OooO00o("PID", p388o0OOooO.o000000.OooO00o());
                    webPageInfo.OooO00o("type", "1");
                    webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, p388o0OOooO.oo0o0Oo.OooO0Oo());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, p388o0OOooO.o000000.OooO0O0());
                    webPageInfo.OooO00o("sysVersion", p388o0OOooO.o000000.OooO0Oo());
                    webPageInfo.OooO00o("internet", oOO00OO.OooO00o().toString());
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    break;
                }
                break;
            case 2:
                TopicInfoActivity this$0 = (TopicInfoActivity) obj2;
                String str = (String) obj;
                int i4 = TopicInfoActivity.f25918OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoHeadView topicInfoHeadViewOooOoO = this$0.OooOoO();
                Intrinsics.checkNotNull(str);
                topicInfoHeadViewOooOoO.OooO0Oo(str);
                break;
            case 3:
                BadgeFragment.initView$lambda$2((BadgeFragment) obj2, (Integer) obj);
                break;
            case 4:
                RoomInfoMemberListFragment.initObserve$lambda$11((RoomInfoMemberListFragment) obj2, obj);
                break;
            default:
                BaseMomentVM.hidePostObserver$lambda$0((BaseMomentVM) obj2, ((Long) obj).longValue());
                break;
        }
    }
}
