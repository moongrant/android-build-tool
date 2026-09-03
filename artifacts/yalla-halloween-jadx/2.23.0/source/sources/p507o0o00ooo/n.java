package p507o0o00ooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f50038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f50039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f50040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f50041OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(CoroutineScope coroutineScope, Function1<? super Integer, Unit> function1, int i, Oooo000 oooo000) {
        super(0);
        this.f50038OooO0Oo = coroutineScope;
        this.f50040OooO0o0 = function1;
        this.f50039OooO0o = i;
        this.f50041OooO0oO = oooo000;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CoroutineScope coroutineScope = this.f50038OooO0Oo;
        Oooo000 oooo000 = this.f50041OooO0oO;
        int i = this.f50039OooO0o;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new m(oooo000, i, null), 3, null);
        Function1<Integer, Unit> function1 = this.f50040OooO0o0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }
}
