package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23018OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23019OooO0o0;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f23018OooO0Oo = i;
        this.f23019OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23018OooO0Oo;
        Object obj2 = this.f23019OooO0o0;
        switch (i) {
            case 0:
                int i2 = MixedRoomActivity.f22961OoooO0O;
                ((MixedRoomActivity) obj2).finish();
                break;
            case 1:
                BadgeFragment.initData$lambda$6((BadgeFragment) obj2, (List) obj);
                break;
            default:
                RoomInfoMemberListFragment.initObserve$lambda$16((RoomInfoMemberListFragment) obj2, (Long) obj);
                break;
        }
    }
}
