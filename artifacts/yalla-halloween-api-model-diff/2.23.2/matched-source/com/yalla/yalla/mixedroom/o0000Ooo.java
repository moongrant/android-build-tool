package com.yalla.yalla.mixedroom;

import android.app.Dialog;
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
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p423o0OoO0OO.o000O0Oo;
import p590o0oOooo0.a0;
import p590o0oOooo0.k0;
import p650o0ooo.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000Ooo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23055OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23056OooO0o0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f23055OooO0Oo = i;
        this.f23056OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(final Object obj) {
        int i = this.f23055OooO0Oo;
        boolean z = true;
        Object obj2 = this.f23056OooO0o0;
        switch (i) {
            case 0:
                final MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                mixedRoomActivity.getClass();
                if (obj instanceof Dialog) {
                    k0.OooO00o(false, true, new Function1() { // from class: com.yalla.yalla.mixedroom.o0Oo0oo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            f0 f0Var = (f0) obj3;
                            int i3 = MixedRoomActivity.f22956OoooO0O;
                            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                            mixedRoomActivity2.getClass();
                            o000O0Oo.OooO0O0((Dialog) obj, f0Var.f58509OooO0o0);
                            mixedRoomActivity2.f22984OoooO00 = f0Var;
                            return null;
                        }
                    });
                }
                break;
            case 1:
                LoginActivity context = (LoginActivity) obj2;
                String url = (String) obj;
                int i3 = LoginActivity.f24727OooOo0O;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (url != null && !StringsKt.isBlank(url)) {
                    z = false;
                }
                if (!z) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginPageFeedback);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32283OooO0o0 = url;
                    webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.feedback));
                    webPageInfo.OooO00o("PID", p386o0OOooO.o000000.OooO00o());
                    webPageInfo.OooO00o("type", "1");
                    webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, p386o0OOooO.oo0o0Oo.OooO0Oo());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, p386o0OOooO.o000000.OooO0O0());
                    webPageInfo.OooO00o("sysVersion", p386o0OOooO.o000000.OooO0Oo());
                    webPageInfo.OooO00o("internet", a0.OooO00o().toString());
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
                int i4 = TopicInfoActivity.f25916OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoHeadView topicInfoHeadViewOooOoO = this$0.OooOoO();
                Intrinsics.checkNotNull(str);
                topicInfoHeadViewOooOoO.OooO0Oo(str);
                break;
            case 3:
                BadgeFragment.initView$lambda$1((BadgeFragment) obj2, (Integer) obj);
                break;
            default:
                RoomInfoMemberListFragment.initObserve$lambda$9((RoomInfoMemberListFragment) obj2, obj);
                break;
        }
    }
}
