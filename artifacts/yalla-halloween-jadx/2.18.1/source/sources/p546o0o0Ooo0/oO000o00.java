package p546o0o0Ooo0;

import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f44416Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f44416Oooo0o = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MixedRoomActivity mixedRoomActivity = this.f44416Oooo0o;
        o0O00000.OooO0OO("InRoom_game");
        OooOo.OooO0O0("102025");
        new RoomGameBoxDialog(mixedRoomActivity, mixedRoomActivity.f11773OoooooO).OooOOO0();
        return Unit.INSTANCE;
    }
}
