package p144o00OOooo;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p165o00OoOo0.o00OO;
import p178o00Ooooo.oOo000o0;
import p255o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOO0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32040OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32041OooO0O0;

    public /* synthetic */ o00OOO0(Object obj, int i) {
        this.f32040OooO00o = i;
        this.f32041OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TopicInfoModel topicInfoModel;
        switch (this.f32040OooO00o) {
            case 0:
                RoomInfoProfileFragment.m78initDataObserver$lambda6((RoomInfoProfileFragment) this.f32041OooO0O0, (String) obj);
                break;
            case 1:
                o00OO this$0 = (o00OO) this.f32041OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oOo000o0 ooo000o0 = this$0.f32564OooO0OO;
                if (ooo000o0 != null) {
                    ooo000o0.dismiss();
                }
                break;
            case 2:
                AccountProtectionActivity this$1 = (AccountProtectionActivity) this.f32041OooO0O0;
                Pair pair = (Pair) obj;
                int i = AccountProtectionActivity.f21730Oooooo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (((Boolean) pair.getFirst()).booleanValue()) {
                    this$1.OooOooO(((Boolean) pair.getSecond()).booleanValue());
                } else {
                    TextView textView = this$1.OooOoo().f49458OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTrustedDevice");
                    oOO00O.OooO0O0(textView);
                    RecyclerView recyclerView = this$1.OooOoo().f49456OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvTrustedDevice");
                    oOO00O.OooO0O0(recyclerView);
                }
                this$1.OooOoo().f49457OooO0OO.setChecked(((Boolean) pair.getFirst()).booleanValue());
                break;
            case 3:
                SettingActivity this$2 = (SettingActivity) this.f32041OooO0O0;
                Boolean it = (Boolean) obj;
                SettingActivity.OooO00o oooO00o = SettingActivity.f22078OooooOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (!it.booleanValue()) {
                    LinearLayout linearLayout = this$2.OooOoo().f49877OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llUnprotected");
                    oOO00O.OooO(linearLayout);
                } else {
                    LinearLayout linearLayout2 = this$2.OooOoo().f49877OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llUnprotected");
                    oOO00O.OooO00o(linearLayout2);
                }
                break;
            case 4:
                TopicDetailActivity this$3 = (TopicDetailActivity) this.f32041OooO0O0;
                Boolean isRefresh = (Boolean) obj;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Response response = (Response) this$3.Oooo000().getTopicDetailLiveData().getValue();
                String strOooO = null;
                if (response != null && (topicInfoModel = (TopicInfoModel) response.getData()) != null) {
                    strOooO = OooO.OooO(Long.valueOf(topicInfoModel.getId()), "");
                }
                boolean loadCircleAdminIsSuccess = this$3.Oooo000().getLoadCircleAdminIsSuccess();
                Intrinsics.checkNotNullExpressionValue(isRefresh, "isRefresh");
                if (isRefresh.booleanValue() && !loadCircleAdminIsSuccess) {
                    this$3.OooOooO(strOooO);
                    break;
                }
                break;
            default:
                TopicPostPopularFragment.m411initObserve$lambda1((TopicPostPopularFragment) this.f32041OooO0O0, (Long) obj);
                break;
        }
    }
}
