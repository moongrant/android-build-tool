package p533o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O00O;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO0O0OoO implements oO00000 {
    public oO0O0OoO() {
        o00OO00O.f43313OooooOo.OooO00o();
    }

    @Override // p533o0o0OOOo.oO00000
    @NotNull
    public final String OooO00o() {
        return oO00000.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        Room.MoraExpiredNotify from;
        oO00000.OooO00o.OooO0O0(this, i, bArr);
        if (i != 1000500 || (from = Room.MoraExpiredNotify.parseFrom(bArr)) == null) {
            return;
        }
        o00O00.OooO0OO("RoomMoraMsgProcessor", "what = " + i + "  data = " + from);
        if (Math.abs(from.getMuuid()) > 0) {
            o000O00O.OooO().OoooO00(from.getMuuid());
        }
    }
}
