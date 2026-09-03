package p490o0o00OOO;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p433o0OoOOo.o00OOO00;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48616OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48617OooO0o0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48616OooO0Oo = mixedRoomActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OOO00 o00ooo01;
        if (((Boolean) OooO00o.f24989OooOOo0.f47451OooO0Oo.getValue()).booleanValue()) {
            o0OO000.OooO00o("102318");
        }
        o00Oo0.OooOO0O().OooOOOO(false);
        o00Oo0.OooOO0O().OooOOO(false);
        MixedRoomActivity mixedRoomActivity = this.f48616OooO0Oo;
        if ((mixedRoomActivity != null ? mixedRoomActivity.f23432OooOo0O : null) != null && (o00ooo01 = mixedRoomActivity.f23432OooOo0O) != null) {
            o0OO000.OooO00o("102036");
            o00ooo01.OooO0O0(null, 0, this.f48617OooO0o0, false);
        }
        return Unit.INSTANCE;
    }
}
