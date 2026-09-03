package p540o0o0OoO0;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54720OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(LifecycleOwner lifecycleOwner) {
        super(0);
        this.f54720OooO0Oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00000OO.f56674OooOOo.observe(this.f54720OooO0Oo, new o0oOO.OooO0OO(o00OOOOo.f54719OooO0Oo));
        return Unit.INSTANCE;
    }
}
