package p669oO0Oo;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f60441OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(LifecycleOwner lifecycleOwner) {
        super(0);
        this.f60441OooO0Oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000o.f44505OooOOo.observe(this.f60441OooO0Oo, new o00000O.OooO0OO(o00000.f60432OooO0Oo));
        return Unit.INSTANCE;
    }
}
