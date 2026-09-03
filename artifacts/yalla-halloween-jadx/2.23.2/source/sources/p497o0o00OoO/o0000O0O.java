package p497o0o00OoO;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p415o0Oo0oO0.o00Ooo;
import p483o0o000Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f49749OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(MutableState<Boolean> mutableState) {
        super(0);
        this.f49749OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i;
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        if (oooO00o.OooO00o().OooOOO()) {
            i = 1;
        } else {
            i = oooO00o.OooO00o().OooOO0o() ? 2 : 3;
        }
        OooO00o.OooO0OO("102233", MapsKt.mapOf(new Pair("userType", Integer.valueOf(i))));
        if (this.f49749OooO0Oo.getValue().booleanValue()) {
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            o0000ooVar.f48594OooOo0.setValue(Boolean.FALSE);
            o00Ooo.OooO0o0().OooOOOO();
            o0000ooVar.OooOOOo();
            o00Ooo.OooO0o0().OooOOOo();
        } else {
            com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooOOOo();
            o00Ooo.OooO0o0().OooOOOo();
        }
        com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48589OooOOOO.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
