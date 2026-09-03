package p144o00OOooo;

import android.webkit.WebView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.TopicFollowChange;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicNewFragment;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p100o000oOoO.o0O00O;
import p164o00OoOo.o00O00OO;
import p207o00o0o0o.o000O0O0;
import p504o0o00o0.o00000OO;
import p524o0o0O0o.o00OO000;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOOO0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32045OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32046OooO0O0;

    public /* synthetic */ o00OOOO0(Object obj, int i) {
        this.f32045OooO00o = i;
        this.f32046OooO0O0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32045OooO00o) {
            case 0:
                RoomInfoProfileFragment.m79initDataObserver$lambda7((RoomInfoProfileFragment) this.f32046OooO0O0, (String) obj);
                break;
            case 1:
                o00O00OO this$0 = (o00O00OO) this.f32046OooO0O0;
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (str == null || str.length() == 0) {
                    oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this$0.f32542OooO00o);
                    oooO00o.f48451OooO0oO = R.drawable.icon_room_bg;
                    oooO00o.f48445OooO00o = 1;
                    oooO00o.f48461OooOOo0 = this$0.f32543OooO0O0.getDrawable();
                    oooO00o.f48449OooO0o = R.drawable.icon_room_bg;
                    oooO00o.OooO0o(this$0.f32543OooO0O0);
                } else if (this$0.f32543OooO0O0.getDrawable() != null) {
                    oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this$0.f32542OooO00o);
                    oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize(str, o000O0O0.OooO0oo(), o000O0O0.OooO0oO());
                    oooO00o2.f48445OooO00o = 0;
                    oooO00o2.f48461OooOOo0 = this$0.f32543OooO0O0.getDrawable();
                    oooO00o2.f48449OooO0o = R.drawable.icon_room_bg;
                    oooO00o2.OooO0o(this$0.f32543OooO0O0);
                } else {
                    oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(this$0.f32542OooO00o);
                    oooO00o3.f48447OooO0OO = CloudImageUtilKt.imgSize(str, o000O0O0.OooO0oo(), o000O0O0.OooO0oO());
                    oooO00o3.f48445OooO00o = 0;
                    oooO00o3.f48459OooOOOo = R.drawable.icon_room_bg;
                    oooO00o3.f48449OooO0o = R.drawable.icon_room_bg;
                    oooO00o3.OooO0o(this$0.f32543OooO0O0);
                }
                break;
            case 2:
                AccountProtectionActivity this$1 = (AccountProtectionActivity) this.f32046OooO0O0;
                int i = AccountProtectionActivity.f21730Oooooo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOooo().getAccountPrivacy();
                break;
            case 3:
                SettingActivity this$2 = (SettingActivity) this.f32046OooO0O0;
                SettingActivity.OooO00o oooO00o4 = SettingActivity.f22078OooooOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.finish();
                break;
            case 4:
                PostDetailActivity this$3 = (PostDetailActivity) this.f32046OooO0O0;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PostDetailActivity.OooO00o oooO00o5 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (!zBooleanValue) {
                    this$3.OooOooO().f50516OooO0Oo.setVisibility(0);
                    this$3.OooOooO().f50516OooO0Oo.setOnClickListener(o00000OO.f41572OoooO0);
                } else {
                    this$3.OooOooO().f50516OooO0Oo.setVisibility(8);
                    this$3.OooOooO().f50516OooO0Oo.setOnClickListener(null);
                }
                break;
            case 5:
                TopicDetailActivity this$4 = (TopicDetailActivity) this.f32046OooO0O0;
                OnTopPostForTopicModel onTopPostForTopicModel = (OnTopPostForTopicModel) obj;
                TopicDetailActivity.OooO00o oooO00o6 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                TopicInfoModel value = this$4.Oooo000().getTopicDetailLocal().getValue();
                if (value != null && onTopPostForTopicModel.getTopicId() == value.getId()) {
                    TopicInfoModel value2 = this$4.Oooo000().getTopicDetailLocal().getValue();
                    if (value2 != null) {
                        value2.setTopDyId(onTopPostForTopicModel.getPostId());
                    }
                    Response response = (Response) this$4.Oooo000().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        topicInfoModel.setTopDyId(onTopPostForTopicModel.getPostId());
                    }
                    this$4.Oooo000().getTopDyIdRefresh().postValue(Long.valueOf(onTopPostForTopicModel.getPostId()));
                    this$4.Oooo000().getTopDyId().postValue(Long.valueOf(onTopPostForTopicModel.getPostId()));
                }
                break;
            case 6:
                Function1 tmp0 = (Function1) this.f32046OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke((Boolean) obj);
                break;
            case 7:
                WebView webView = (WebView) ((o0O00O) this.f32046OooO0O0).getValue();
                if (webView != null) {
                    o00OO000.OooO0OO(webView);
                }
                break;
            case 8:
                MainMomentsTopicNewFragment.m355initObserver$lambda1((MainMomentsTopicNewFragment) this.f32046OooO0O0, (TopicFollowChange) obj);
                break;
            default:
                TopicPostPopularFragment.m412initObserve$lambda2((TopicPostPopularFragment) this.f32046OooO0O0, (Long) obj);
                break;
        }
    }
}
