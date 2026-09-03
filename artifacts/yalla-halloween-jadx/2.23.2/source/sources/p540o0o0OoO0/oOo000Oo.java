package p540o0o0OoO0;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p483o0o000Oo.o0000O00;
import p502o0o00o0O.o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f55022OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000Oo(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f55022OooO0Oo = mixedRoomActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o oVar;
        OooO00o.OooO0O0("102229");
        o0000O00 o0000o00 = com.yalla.yalla.service.room.OooO00o.f24529OooOo0;
        o0000o00.f48501OooO0O0.setValue(Boolean.FALSE);
        if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.f48458OooO.getValue()).booleanValue()) {
            MixedRoomActivity mixedRoomActivity = this.f55022OooO0Oo;
            if (mixedRoomActivity != null && (oVar = mixedRoomActivity.f22961OooOo0) != null) {
                oVar.OooO00o();
            }
        } else {
            o0000o00.f48502OooO0OO.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
