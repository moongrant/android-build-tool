package p580o0oOoOo;

import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f46685Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00o0(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f46685Oooo0o = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43155OooOOo.setValue(Boolean.FALSE);
        o0O00000.OooO0OO("InRoom_hostTheme");
        OooOo.OooO0O0("102228");
        RoomThemeStoreActivity.f23000OooooO0.OooO00o(this.f46685Oooo0o, false);
        return Unit.INSTANCE;
    }
}
