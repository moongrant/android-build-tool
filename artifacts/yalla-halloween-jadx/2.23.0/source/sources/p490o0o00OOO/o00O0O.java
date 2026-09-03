package p490o0o00OOO;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p433o0OoOOo.o00OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48647OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48647OooO0Oo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OO00O o00oo00o;
        MixedRoomActivity mixedRoomActivity = this.f48647OooO0Oo;
        if (mixedRoomActivity != null && (o00oo00o = mixedRoomActivity.f23452OoooO0.f48472OooO) != null) {
            o00oo00o.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
