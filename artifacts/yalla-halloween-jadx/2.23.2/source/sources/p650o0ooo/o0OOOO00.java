package p650o0ooo;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OOOO00 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (o00Ooo.OooO0oo().OooOO0O() == 0) {
            Room.GetEnvelopListRequest.Builder builderNewBuilder = Room.GetEnvelopListRequest.newBuilder();
            builderNewBuilder.setAutotype(1);
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(10074, builderNewBuilder.build().toByteArray());
                return;
            }
            return;
        }
        Room.GetEnvelopListRequest.Builder builderNewBuilder2 = Room.GetEnvelopListRequest.newBuilder();
        builderNewBuilder2.setAutotype(0);
        RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oo(10074, builderNewBuilder2.build().toByteArray());
        }
    }
}
