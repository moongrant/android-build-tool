package com.yalla.yalla.mixedroom;

import android.app.Dialog;
import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p425o0OoO0OO.o000O0;
import p587o0oOooO.oOO0O0O0;
import p675oO0Oo.c2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23043OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23044OooO0o0;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f23043OooO0Oo = i;
        this.f23044OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(final Object obj) {
        int i = this.f23043OooO0Oo;
        Object obj2 = this.f23044OooO0o0;
        switch (i) {
            case 0:
                final MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                mixedRoomActivity.getClass();
                if (obj instanceof Dialog) {
                    oOO0O0O0.OooO00o(false, true, new Function1() { // from class: com.yalla.yalla.mixedroom.o0Oo0oo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            c2 c2Var = (c2) obj3;
                            int i3 = MixedRoomActivity.f22961OoooO0O;
                            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                            mixedRoomActivity2.getClass();
                            o000O0.OooO0O0((Dialog) obj, c2Var.f59574OooO0o0);
                            mixedRoomActivity2.f22989OoooO00 = c2Var;
                            return null;
                        }
                    });
                }
                break;
            case 1:
                TopicInfoActivity this$0 = (TopicInfoActivity) obj2;
                UserInfo userInfo = (UserInfo) obj;
                int i3 = TopicInfoActivity.f25918OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoHeadView topicInfoHeadViewOooOoO = this$0.OooOoO();
                Intrinsics.checkNotNull(userInfo);
                topicInfoHeadViewOooOoO.OooO0OO(userInfo);
                break;
            case 2:
                BadgeFragment.initView$lambda$1((BadgeFragment) obj2, (Integer) obj);
                break;
            default:
                RoomInfoMemberListFragment.initObserve$lambda$9((RoomInfoMemberListFragment) obj2, obj);
                break;
        }
    }
}
