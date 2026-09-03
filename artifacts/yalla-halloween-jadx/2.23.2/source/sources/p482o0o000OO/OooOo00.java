package p482o0o000OO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.service.room.RoomLiveService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOo00 implements Observer {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        MixedRoomDataSource.OooO0o0().f22990OooO0Oo.obtainMessage(10008010, 1, 0, obj).sendToTarget();
    }
}
