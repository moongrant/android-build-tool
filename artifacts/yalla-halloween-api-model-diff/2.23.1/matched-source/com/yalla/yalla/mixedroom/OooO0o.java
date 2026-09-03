package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23024OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23025OooO0o0;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f23024OooO0Oo = i;
        this.f23025OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23024OooO0Oo;
        Object obj2 = this.f23025OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                mixedRoomActivity.OooOoO0();
                com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().OooO00o();
                RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO(mixedRoomActivity.f22985Oooo0o0);
                }
                break;
            case 1:
                LoginOnRoomDialogActivity this$0 = (LoginOnRoomDialogActivity) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 2:
                BadgeFragment.initData$lambda$5((BadgeFragment) obj2, (List) obj);
                break;
            default:
                RoomInfoMemberListFragment.initObserve$lambda$15((RoomInfoMemberListFragment) obj2, (Long) obj);
                break;
        }
    }
}
