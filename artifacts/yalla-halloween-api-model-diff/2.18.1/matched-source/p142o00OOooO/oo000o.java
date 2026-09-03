package p142o00OOooO;

import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.GiftAnimationModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p530o0o0OOO.o00O;
import p579o0oOoOOo.ooooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo000o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31980OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31981OooO0O0;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f31980OooO00o = i;
        this.f31981OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        GiftAnimationModel giftAnimationModel;
        switch (this.f31980OooO00o) {
            case 0:
                MainMomentFollowingFragment.m14initObserver$lambda12((MainMomentFollowingFragment) this.f31981OooO0O0, (MomentSendModel) obj);
                break;
            case 1:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f31981OooO0O0;
                int i = MixedRoomActivity.f11764o00000oO;
                Objects.requireNonNull(mixedRoomActivity);
                if ((obj instanceof GiftAnimationModel) && (giftAnimationModel = (GiftAnimationModel) obj) != null) {
                    String str = giftAnimationModel.fromUserId;
                    long j = 0;
                    if (str != null) {
                        try {
                            j = Long.parseLong(str);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(j);
                    if (roomUserInfoModelOooOO0 != null) {
                        mixedRoomActivity.Oooo0OO(roomUserInfoModelOooOO0, 0, giftAnimationModel.giftId.intValue(), giftAnimationModel.giftUserType);
                    }
                    break;
                }
                break;
            case 2:
                TopicInfoActivity this$0 = (TopicInfoActivity) this.f31981OooO0O0;
                String it = (String) obj;
                TopicInfoActivity.OooO00o oooO00o = TopicInfoActivity.f22623OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel = this$0.f22625Ooooo00;
                TopicInfoModel topicInfoModel2 = null;
                if (topicInfoModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    topicInfoModel = null;
                }
                if (topicInfoModel.isOwner()) {
                    TopicInfoModel topicInfoModel3 = this$0.f22625Ooooo00;
                    if (topicInfoModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    } else {
                        topicInfoModel2 = topicInfoModel3;
                    }
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    topicInfoModel2.setDescribe(it);
                    this$0.Oooo000().setTopicDesc(it);
                }
                break;
            case 3:
                ooooO0O0 this$1 = (ooooO0O0) this.f31981OooO0O0;
                int i2 = ooooO0O0.f46242OoooOo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.dismiss();
                break;
            case 4:
                MainSearchUserFragment.m378observerSearchText$lambda8((MainSearchUserFragment) this.f31981OooO0O0, (String) obj);
                break;
            default:
                Function1 tmp0 = (Function1) this.f31981OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
        }
    }
}
