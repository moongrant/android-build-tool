package p457o0Ooo0O;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p363o0OOo00O.OooO;
import p363o0OOo00O.OooO0o;
import p460o0Ooo0o.o00OOO00;
import p550o0oOOO0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f47670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f47671OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(MutableState<Boolean> mutableState, o00O00OO o00o00oo2) {
        super(0);
        this.f47670OooO0Oo = mutableState;
        this.f47671OooO0o0 = o00o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f47670OooO0Oo.setValue(Boolean.FALSE);
        o00O00OO o00o00oo2 = this.f47671OooO0o0;
        Float value = o00o00oo2.OooO0oo().f55987OooO00o.getValue();
        o00o00oo2.f55969OooO.setIntValue((int) (value != null ? value.floatValue() : 0.0f));
        OooO oooOOooO0o0 = o00o00oo2.OooO0o0();
        if (oooOOooO0o0 != null) {
            oooOOooO0o0.OooO0oO(o00o00oo2.OooO0oO() / 100.0f);
        }
        Float value2 = o00o00oo2.OooO0oo().f55988OooO0O0.getValue();
        o00o00oo2.f55978OooOO0.setIntValue((int) (value2 != null ? value2.floatValue() : 0.0f));
        OooO0o oooO0o = o00OOO00.f47803OooO00o;
        o00OOO00.f47803OooO00o.OooO0oO(o00o00oo2.OooO0O0() / 100.0f);
        return Unit.INSTANCE;
    }
}
