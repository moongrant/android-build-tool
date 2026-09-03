package p582o0oOoOo;

import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p393o0OOooOo.o0O00000;
import p532o0o0OOO.o00OO000;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO00Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f46706Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f46706Oooo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OO000 o00oo001 = o00OO000.f43171OooO00o;
        o00OO000.f43186OooOOo.setValue(Boolean.FALSE);
        o0O00000.OooO0OO("InRoom_hostTheme");
        OooOo.OooO0O0("102228");
        RoomThemeStoreActivity.f23019Oooooo0.OooO00o(this.f46706Oooo, false);
        return Unit.INSTANCE;
    }
}
