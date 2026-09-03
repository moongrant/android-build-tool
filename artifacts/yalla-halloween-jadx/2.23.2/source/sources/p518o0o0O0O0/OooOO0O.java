package p518o0o0O0O0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f51849OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Pair<String, Integer> f51850OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(Function1<? super String, Unit> function1, Pair<String, Integer> pair) {
        super(0);
        this.f51849OooO0Oo = function1;
        this.f51850OooO0o0 = pair;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f51849OooO0Oo.invoke(this.f51850OooO0o0.getFirst());
        return Unit.INSTANCE;
    }
}
