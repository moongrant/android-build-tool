package p578o0oOoOoo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p455o0Ooo0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56457OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f56458OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0Oo00(MutableState<Boolean> mutableState, oo0o0Oo oo0o0oo) {
        super(0);
        this.f56457OooO0Oo = mutableState;
        this.f56458OooO0o0 = oo0o0oo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f56457OooO0Oo.setValue(Boolean.FALSE);
        this.f56458OooO0o0.OooOO0O();
        return Unit.INSTANCE;
    }
}
