package p497o0o00OoO;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p442o0OoOo0O.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f49750OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f49750OooO0Oo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0000 o0000Var;
        MixedRoomActivity mixedRoomActivity = this.f49750OooO0Oo;
        if (mixedRoomActivity != null && (o0000Var = mixedRoomActivity.f22983OoooO0.f49614OooO) != null) {
            o0000Var.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
