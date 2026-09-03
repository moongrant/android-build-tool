package p549o0oOO0Oo;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.O0000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f55867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55868OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55869OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Context f55870OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(MutableIntState mutableIntState, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Context context) {
        super(0);
        this.f55867OooO0Oo = mutableIntState;
        this.f55869OooO0o0 = mutableState;
        this.f55868OooO0o = mutableState2;
        this.f55870OooO0oO = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f55867OooO0Oo.getIntValue() == 1) {
            this.f55869OooO0o0.setValue(Boolean.FALSE);
            this.f55868OooO0o.setValue(Boolean.TRUE);
        } else {
            O0000000.OooO0O0(this.f55870OooO0oO);
        }
        return Unit.INSTANCE;
    }
}
