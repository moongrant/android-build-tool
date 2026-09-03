package p558o0oOOoo;

import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<RoomVoteDialog> f44805Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f44806Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(o0O00OO<RoomVoteDialog> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f44805Oooo0o = o0o00oo2;
        this.f44806Oooo0oO = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("InRoom_Sidebar_poll");
        o0O00OO<RoomVoteDialog> o0o00oo2 = this.f44805Oooo0o;
        MixedRoomActivity mixedRoomActivity = this.f44806Oooo0oO;
        if (o0o00oo2.getValue() == null) {
            o0o00oo2.setValue(new RoomVoteDialog(mixedRoomActivity, o0O0O0Oo.OooOOO0.f44804Oooo0o));
        }
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43186OoooOOO.setValue(Boolean.TRUE);
        RoomVoteDialog value = o0o00oo2.getValue();
        if (value != null) {
            value.OooOO0();
        }
        o0O0O0Oo.OooO0OO(this.f44805Oooo0o, this.f44806Oooo0oO);
        return Unit.INSTANCE;
    }
}
