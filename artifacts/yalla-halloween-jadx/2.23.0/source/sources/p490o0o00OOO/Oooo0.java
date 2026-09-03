package p490o0o00OOO;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p475o0o000.o000000;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f48519OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(MutableState<Boolean> mutableState) {
        super(0);
        this.f48519OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i;
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        if (oooO00o.OooO00o().OooOOO()) {
            i = 1;
        } else {
            i = oooO00o.OooO00o().OooOO0o() ? 2 : 3;
        }
        o0OO000.OooO0O0("102233", MapsKt.mapOf(new Pair("userType", Integer.valueOf(i))));
        if (this.f48519OooO0Oo.getValue().booleanValue()) {
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            o000000Var.f47389OooOo0.setValue(Boolean.FALSE);
            o00Oo0.OooO0o0().OooOOOO();
            o000000Var.OooOOOo();
            o00Oo0.OooO0o0().OooOOOo();
        } else {
            OooO00o.f24979OooO0oO.OooOOOo();
            o00Oo0.OooO0o0().OooOOOo();
        }
        OooO00o.f24979OooO0oO.f47384OooOOOO.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
