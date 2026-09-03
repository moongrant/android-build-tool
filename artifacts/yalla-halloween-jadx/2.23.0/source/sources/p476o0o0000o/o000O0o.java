package p476o0o0000o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.service.room.RoomLiveService;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f47591OooO0Oo;

    public o000O0o(RoomLiveService roomLiveService) {
        this.f47591OooO0Oo = roomLiveService;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        OooOOO0.OooO0OO("RoomLiveService", "Room_State_Disconnect");
        RoomLiveService roomLiveService = this.f47591OooO0Oo;
        roomLiveService.OooO0o0();
        roomLiveService.OooO0O0();
        roomLiveService.stopSelf();
    }
}
