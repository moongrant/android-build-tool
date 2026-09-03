package p524o0o0O0oO;

import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yalla.yalla.ui.activity.account.AccountActivity;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.FollowingActivity;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p546o0o0Ooo0.oO0O00oO;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00OO implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43031OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43032OooO0O0;

    public /* synthetic */ o0O00OO(Object obj, int i) {
        this.f43031OooO00o = i;
        this.f43032OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f43031OooO00o) {
            case 0:
                o0O0000O this$0 = (o0O0000O) this.f43032OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00000.OooO0OO("Me_level");
                Intrinsics.checkNotNullExpressionValue(url, "it");
                if (true ^ StringsKt.isBlank(url)) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserLevel);
                    webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.Level));
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    WebActivity.f22108OoooooO.OooO00o(this$0.f43021OooO0Oo, webPageInfo);
                    OooOo.OooO0O0("105020");
                }
                break;
            case 1:
                AccountActivity this$1 = (AccountActivity) this.f43032OooO0O0;
                Boolean it = (Boolean) obj;
                int i = AccountActivity.f21695Ooooo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (!it.booleanValue()) {
                    LinearLayout linearLayout = this$1.OooOoo().f49421OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llUnprotected");
                    oOO00O.OooO(linearLayout);
                } else {
                    LinearLayout linearLayout2 = this$1.OooOoo().f49421OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llUnprotected");
                    oOO00O.OooO00o(linearLayout2);
                }
                break;
            case 2:
                MainSearchActivity this$2 = (MainSearchActivity) this.f43032OooO0O0;
                String str = (String) obj;
                MainSearchActivity.OooO00o oooO00o = MainSearchActivity.f21967Oooooo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (!Intrinsics.areEqual(str, StringsKt.trim((CharSequence) this$2.OooOoo().f49734OooO0O0.getText().toString()).toString())) {
                    this$2.OooOoo().f49734OooO0O0.setText(str);
                    this$2.OooOoo().f49734OooO0O0.setSelection(str.length());
                }
                break;
            case 3:
                TopicDetailActivity this$3 = (TopicDetailActivity) this.f43032OooO0O0;
                TopicGroupInfoModel topicGroupInfoModel = (TopicGroupInfoModel) obj;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                int type = topicGroupInfoModel.getType();
                if (type == 0) {
                    LinearLayoutCompat linearLayoutCompat = this$3.OooOooo().f51080OooO0o0.f49840OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.head.layoutFans");
                    oOO00O.OooO00o(linearLayoutCompat);
                } else if (type == 1) {
                    LinearLayoutCompat linearLayoutCompat2 = this$3.OooOooo().f51080OooO0o0.f49840OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.head.layoutFans");
                    oOO00O.OooO(linearLayoutCompat2);
                    this$3.OooOooo().f51080OooO0o0.f49836OooO.setText(o000O0O0.OooO0OO(R.string.topic_group_create));
                } else if (type == 2 && !topicGroupInfoModel.getIsDisbanded()) {
                    LinearLayoutCompat linearLayoutCompat3 = this$3.OooOooo().f51080OooO0o0.f49840OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "binding.head.layoutFans");
                    oOO00O.OooO(linearLayoutCompat3);
                    this$3.OooOooo().f51080OooO0o0.f49836OooO.setText(o000O0O0.OooO0OO(R.string.topic_group_join));
                }
                break;
            case 4:
                oO0O00oO this$4 = (oO0O00oO) this.f43032OooO0O0;
                RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (roomUserInfoModel == null) {
                    this$4.OooO0Oo().OooO0O0();
                } else {
                    this$4.OooO0o0(this$4.OooO0Oo(), roomUserInfoModel);
                    this$4.OooO0Oo().OooOO0();
                }
                break;
            case 5:
                FollowingActivity followingActivity = (FollowingActivity) this.f43032OooO0O0;
                Long l = (Long) obj;
                int i2 = 0;
                while (true) {
                    if (i2 < followingActivity.f23331OooooO0.getData().size()) {
                        if (l.longValue() != followingActivity.f23331OooooO0.getData().get(i2).getUserId()) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 > 0 && i2 < followingActivity.f23331OooooO0.getData().size()) {
                    followingActivity.f23331OooooO0.remove(i2);
                    break;
                }
                break;
            default:
                TopicPostLatestFragment.m405initObserve$lambda5((TopicPostLatestFragment) this.f43032OooO0O0, (Long) obj);
                break;
        }
    }
}
