package p579o0oOoOOo;

import com.app.base.mixedroom.model.RoomGameConfig;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00O000;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomVoteDialog f45946Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(RoomVoteDialog roomVoteDialog) {
        super(0);
        this.f45946Oooo0o = roomVoteDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f45946Oooo0o.f23782Ooooo00 = true;
        o00O000 o00o000OooO = o00O000.OooO();
        RoomGameConfig.Vote value = o00OO00O.f43313OooooOo.OooO00o().f43362OoooOOO.getValue();
        Long lValueOf = Long.valueOf(value != null ? value.getVoteId() : 0L);
        Objects.requireNonNull(o00o000OooO);
        if (o00O000.f32468OooO00o != null) {
            Room.EndVoteRequest.Builder builderNewBuilder = Room.EndVoteRequest.newBuilder();
            builderNewBuilder.setVoteId(lValueOf.longValue());
            o00O000.f32468OooO00o.OooO0oO(1100001, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
