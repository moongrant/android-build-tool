package p536o0o0OOo0;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.TopicFollowChange;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.AccountBindActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p548o0o0Ooo0.oO0;
import p548o0o0Ooo0.oO0O00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f43531OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f43532OooO0O0;

    public /* synthetic */ o00O0(Object obj, int i) {
        this.f43531OooO00o = i;
        this.f43532OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f43531OooO00o) {
            case 0:
                AccountBindActivity this$0 = (AccountBindActivity) this.f43532OooO0O0;
                AccountBindActivity.OooO00o oooO00o = AccountBindActivity.f21721Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 1:
                MomentSendActivity this$1 = (MomentSendActivity) this.f43532OooO0O0;
                MomentSendActivity.OooO00o oooO00o2 = MomentSendActivity.f22386o0ooOOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                BaseActivityK.OooOoo0(this$1, null, 0L, 3, null);
                break;
            case 2:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f43532OooO0O0;
                TopicFollowChange topicFollowChange = (TopicFollowChange) obj;
                TopicDetailActivity.OooO00o oooO00o3 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                TopicInfoModel value = this$2.Oooo000().getTopicDetailLocal().getValue();
                boolean z = false;
                if (value != null && value.getId() == topicFollowChange.getTopicId()) {
                    z = true;
                }
                if (z) {
                    this$2.Oooo000().isFollow().setValue(Boolean.valueOf(topicFollowChange.getFollow()));
                }
                break;
            default:
                oO0O00O this$3 = (oO0O00O) this.f43532OooO0O0;
                RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                RoomUserInfoModel roomUserInfoModelOooOO0 = o00OO000.f43171OooO00o.OooOO0(roomUserInfoModel.getUserId());
                if (roomUserInfoModelOooOO0 == null) {
                    o00OO0O0.f43338OooooOo.OooO00o().f43391OoooOoo.postValue(roomUserInfoModel);
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$3.f44372OooO00o), null, null, new oO0(roomUserInfoModel, this$3, null), 3, null);
                } else {
                    o00OO0O0.f43338OooooOo.OooO00o().f43391OoooOoo.postValue(roomUserInfoModelOooOO0);
                }
                break;
        }
    }
}
