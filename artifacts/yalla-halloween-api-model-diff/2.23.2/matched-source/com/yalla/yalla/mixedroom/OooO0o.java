package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23019OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23020OooO0o0;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f23019OooO0Oo = i;
        this.f23020OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23019OooO0Oo;
        Object obj2 = this.f23020OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                mixedRoomActivity.OooOoO0();
                com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().OooO00o();
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO(mixedRoomActivity.f22980Oooo0o0);
                }
                break;
            case 1:
                BadgeFragment.initData$lambda$5((BadgeFragment) obj2, (List) obj);
                break;
            default:
                RoomInfoMemberListFragment.initObserve$lambda$15((RoomInfoMemberListFragment) obj2, (Long) obj);
                break;
        }
    }
}
