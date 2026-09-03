package p143o00OOooo;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p164o00OoOo0.oo0O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOO0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32022OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32023OooO0O0;

    public /* synthetic */ o00OOO0O(Object obj, int i) {
        this.f32022OooO00o = i;
        this.f32023OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32022OooO00o) {
            case 0:
                RoomInfoProfileFragment.m77initDataObserver$lambda5((RoomInfoProfileFragment) this.f32023OooO0O0, (Boolean) obj);
                break;
            case 1:
                oo0O this$0 = (oo0O) this.f32023OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO00o(0);
                break;
            case 2:
                MutableLiveData mutableLiveData = (MutableLiveData) this.f32023OooO0O0;
                Integer num = (Integer) obj;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(num);
                    break;
                }
                break;
            case 3:
                MomentSendActivity this$1 = (MomentSendActivity) this.f32023OooO0O0;
                MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO();
                String strOooO0OO = o000O0O0.OooO0OO(R.string.Network_connection_lost);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    } else {
                        o0o0oooOooO0O0.run();
                    }
                    break;
                }
                break;
            case 4:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f32023OooO0O0;
                Long l = (Long) obj;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                TopicInfoModel topicInfoModel = this$2.f22569Ooooo00;
                if (topicInfoModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                    topicInfoModel = null;
                }
                long id = topicInfoModel.getId();
                if (l != null && l.longValue() == id) {
                    this$2.Oooo00O().getGroupInfo();
                }
                break;
            case 5:
                PremiumActivity this$3 = (PremiumActivity) this.f32023OooO0O0;
                Pair<Boolean, Integer> it = (Pair) obj;
                PremiumActivity.OooO00o oooO00o3 = PremiumActivity.f23360o0ooOOo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.f23378o0OoOo0 = PremiumLevel.INSTANCE.OooO00o(it.getSecond());
                UserPremiumView userPremiumView = this$3.Oooo00o().f51114OooO0o0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                userPremiumView.setPremium(it);
                break;
            default:
                TopicPostPopularFragment.m410initObserve$lambda0((TopicPostPopularFragment) this.f32023OooO0O0, (MomentDetailModel) obj);
                break;
        }
    }
}
