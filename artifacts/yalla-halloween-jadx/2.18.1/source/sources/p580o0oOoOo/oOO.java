package p580o0oOoOo;

import com.app.base.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00O;
import p559o0oOOoo0.oo0O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f46659Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f46659Oooo0o = mixedRoomActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o;
        OooOo.OooO0O0("102229");
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43155OooOOo.setValue(Boolean.FALSE);
        if (((Boolean) o00O.f43185OoooOO0.getValue()).booleanValue()) {
            MixedRoomActivity mixedRoomActivity = this.f46659Oooo0o;
            if (mixedRoomActivity != null && (oo0o = mixedRoomActivity.f11771Oooooo) != null) {
                oo0o.OooO00o();
            }
        } else {
            o0O00000.OooO0OO("InRoom_hostLockbuy");
            o00O.f43179Oooo0oO.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
