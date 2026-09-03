package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment;
import com.yalla.yalla.ui.vm.moment.MomentFeaturedVM;
import kotlin.jvm.internal.Intrinsics;
import p205o00o0o0o.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000Ooo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23060OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23061OooO0o0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f23060OooO0Oo = i;
        this.f23061OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23060OooO0Oo;
        Object obj2 = this.f23061OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                mixedRoomActivity.getClass();
                if (((Boolean) obj).booleanValue()) {
                    o000O o000o = new o000O(mixedRoomActivity);
                    o000o.OooOo00(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.backpack_frozen));
                    o000o.OooOO0o();
                }
                break;
            case 1:
                TopicInfoActivity this$0 = (TopicInfoActivity) obj2;
                String str = (String) obj;
                int i3 = TopicInfoActivity.f25918OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel = this$0.f25922OooOo00;
                TopicInfoModel topicInfoModel2 = null;
                if (topicInfoModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    topicInfoModel = null;
                }
                if (topicInfoModel.isOwner()) {
                    TopicInfoModel topicInfoModel3 = this$0.f25922OooOo00;
                    if (topicInfoModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    } else {
                        topicInfoModel2 = topicInfoModel3;
                    }
                    Intrinsics.checkNotNull(str);
                    topicInfoModel2.setRule(str);
                    this$0.OooOoO().setTopicRule(str);
                }
                break;
            default:
                MomentListFeaturedFragment.InitObservers$lambda$1((MomentFeaturedVM) obj2, (MomentDetailModel) obj);
                break;
        }
    }
}
