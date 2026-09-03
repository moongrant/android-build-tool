package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 implements OooO00o {
    public OooOOO0() {
        com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o();
    }

    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return OooO00o.C0318OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable Object obj) {
        Room.MoraExpiredNotify from;
        OooO00o.C0318OooO00o.OooO0O0(this, i, obj);
        if (i != 1000500 || (from = Room.MoraExpiredNotify.parseFrom((byte[]) obj)) == null) {
            return;
        }
        o0000O00.OooO0OO("RoomMoraMsgProcessor", "what = " + i + "  data = " + from);
        if (Math.abs(from.getMuuid()) > 0) {
            MixedRoomDataSource.OooO0o0().OooOo0o(from.getMuuid());
        }
    }
}
