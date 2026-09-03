package p022Oooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f450Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f451Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO0(Function1<? super Boolean, Unit> function1, boolean z) {
        super(0);
        this.f450Oooo0o = function1;
        this.f451Oooo0oO = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f450Oooo0o.invoke(Boolean.valueOf(!this.f451Oooo0oO));
        return Unit.INSTANCE;
    }
}
