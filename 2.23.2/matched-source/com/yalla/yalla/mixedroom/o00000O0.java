package com.yalla.yalla.mixedroom;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f23041OooO0o0;

    public /* synthetic */ o00000O0(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f23040OooO0Oo = i;
        this.f23041OooO0o0 = baseFragmentActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TopicInfoModel topicInfoModel = null;
        int i = this.f23040OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f23041OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) baseFragmentActivity;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                mixedRoomActivity.getClass();
                p483o0o000Oo.o000OOo o000ooo2 = com.yalla.yalla.service.room.OooO00o.f24527OooOOo0;
                int iIntValue = ((Number) o000ooo2.f48624OooO0o0.getValue()).intValue();
                MutableState mutableState = o000ooo2.f48623OooO0o;
                ((Number) mutableState.getValue()).intValue();
                mixedRoomActivity.OooOoOO(null, 0, iIntValue, ((Number) mutableState.getValue()).intValue() == GiftPropTypeUser.Backpack.getValue());
                break;
            default:
                TopicInfoActivity this$0 = (TopicInfoActivity) baseFragmentActivity;
                String str = (String) obj;
                int i3 = TopicInfoActivity.f25916OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel2 = this$0.f25920OooOo00;
                if (topicInfoModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    topicInfoModel2 = null;
                }
                if (topicInfoModel2.isOwner()) {
                    TopicInfoModel topicInfoModel3 = this$0.f25920OooOo00;
                    if (topicInfoModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    } else {
                        topicInfoModel = topicInfoModel3;
                    }
                    Intrinsics.checkNotNull(str);
                    topicInfoModel.setDescribe(str);
                    this$0.OooOoO().setTopicDesc(str);
                }
                break;
        }
    }
}
