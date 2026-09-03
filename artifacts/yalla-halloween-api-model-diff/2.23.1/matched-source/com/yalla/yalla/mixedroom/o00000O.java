package com.yalla.yalla.mixedroom;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p675oO0Oo.o0O00O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23049OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f23050OooO0o0;

    public /* synthetic */ o00000O(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f23049OooO0Oo = i;
        this.f23050OooO0o0 = baseFragmentActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TopicInfoModel topicInfoModel = null;
        int i = this.f23049OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f23050OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) baseFragmentActivity;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                mixedRoomActivity.getClass();
                p482o0o000O.OooOo00 oooOo00 = com.yalla.yalla.service.room.OooO00o.f24535OooOOo0;
                int iIntValue = ((Number) oooOo00.f48446OooO0o0.getValue()).intValue();
                MutableState mutableState = oooOo00.f48445OooO0o;
                ((Number) mutableState.getValue()).intValue();
                mixedRoomActivity.OooOoOO(null, 0, iIntValue, ((Number) mutableState.getValue()).intValue() == GiftPropTypeUser.Backpack.getValue());
                break;
            case 1:
                LoginActivity this$0 = (LoginActivity) baseFragmentActivity;
                int i3 = LoginActivity.f24734OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Pair<kotlin.Long, kotlin.Long>");
                Pair pair = (Pair) obj;
                new o0O00O(this$0, ((Number) pair.getFirst()).longValue(), ((Number) pair.getSecond()).longValue()).OooO();
                break;
            default:
                TopicInfoActivity this$1 = (TopicInfoActivity) baseFragmentActivity;
                String str = (String) obj;
                int i4 = TopicInfoActivity.f25918OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopicInfoModel topicInfoModel2 = this$1.f25922OooOo00;
                if (topicInfoModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    topicInfoModel2 = null;
                }
                if (topicInfoModel2.isOwner()) {
                    TopicInfoModel topicInfoModel3 = this$1.f25922OooOo00;
                    if (topicInfoModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    } else {
                        topicInfoModel = topicInfoModel3;
                    }
                    Intrinsics.checkNotNull(str);
                    topicInfoModel.setImage(str);
                    this$1.OooOoO().setTopicHead(str);
                }
                break;
        }
    }
}
