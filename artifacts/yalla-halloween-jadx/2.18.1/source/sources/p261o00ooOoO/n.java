package p261o00ooOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f34793Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f34794Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Ref.LongRef longRef, Function0<Unit> function0) {
        super(0);
        this.f34793Oooo0o = longRef;
        this.f34794Oooo0oO = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.f34793Oooo0o.element) >= 500) {
            this.f34793Oooo0o.element = jCurrentTimeMillis;
            this.f34794Oooo0oO.invoke();
        }
        return Unit.INSTANCE;
    }
}
