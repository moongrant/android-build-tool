package p519o0o0O0oO;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO00OOo0 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (o00Oo0.OooO0oo().OooOO0O() == 0) {
            Room.GetEnvelopListRequest.Builder builderNewBuilder = Room.GetEnvelopListRequest.newBuilder();
            builderNewBuilder.setAutotype(1);
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(10074, builderNewBuilder.build().toByteArray());
                return;
            }
            return;
        }
        Room.GetEnvelopListRequest.Builder builderNewBuilder2 = Room.GetEnvelopListRequest.newBuilder();
        builderNewBuilder2.setAutotype(0);
        RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oo(10074, builderNewBuilder2.build().toByteArray());
        }
    }
}
