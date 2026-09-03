package p669oO0Oo;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f60501OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(LifecycleOwner lifecycleOwner) {
        super(0);
        this.f60501OooO0Oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000o.f44505OooOOo.observe(this.f60501OooO0Oo, new o000O0Oo.OooOOO0(o000O.f60453OooO0Oo));
        return Unit.INSTANCE;
    }
}
