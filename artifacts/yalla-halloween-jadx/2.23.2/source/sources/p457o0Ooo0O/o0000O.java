package p457o0Ooo0O;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p550o0oOOO0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f47654OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f47655OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(MutableState<Boolean> mutableState, o00O00OO o00o00oo2) {
        super(0);
        this.f47654OooO0Oo = mutableState;
        this.f47655OooO0o0 = o00o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f47654OooO0Oo.setValue(Boolean.FALSE);
        this.f47655OooO0o0.OooOO0O();
        return Unit.INSTANCE;
    }
}
