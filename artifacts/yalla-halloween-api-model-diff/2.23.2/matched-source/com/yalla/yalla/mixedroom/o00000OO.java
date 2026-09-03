package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import com.yalla.yalla.ui.vm.moment.MomentFeaturedVM;
import kotlin.jvm.internal.Intrinsics;
import p205o00o0o0o.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23043OooO0o0;

    public /* synthetic */ o00000OO(Object obj, int i) {
        this.f23042OooO0Oo = i;
        this.f23043OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23042OooO0Oo;
        Object obj2 = this.f23043OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                mixedRoomActivity.getClass();
                if (((Boolean) obj).booleanValue()) {
                    o000O o000o = new o000O(mixedRoomActivity);
                    o000o.OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.backpack_frozen));
                    o000o.OooOO0o();
                }
                break;
            case 1:
                TopicInfoActivity this$0 = (TopicInfoActivity) obj2;
                UserInfo userInfo = (UserInfo) obj;
                int i3 = TopicInfoActivity.f25916OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoHeadView topicInfoHeadViewOooOoO = this$0.OooOoO();
                Intrinsics.checkNotNull(userInfo);
                topicInfoHeadViewOooOoO.OooO0OO(userInfo);
                break;
            default:
                MomentListFeaturedFragment.InitObservers$lambda$1((MomentFeaturedVM) obj2, (MomentDetailModel) obj);
                break;
        }
    }
}
