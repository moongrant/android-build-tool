package p516o0o0O00o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51464OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51465OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f51466OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000000 f51467OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00oOoo(CoroutineScope coroutineScope, Function1<? super Integer, Unit> function1, int i, o000000 o000000Var) {
        super(0);
        this.f51464OooO0Oo = coroutineScope;
        this.f51466OooO0o0 = function1;
        this.f51465OooO0o = i;
        this.f51467OooO0oO = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CoroutineScope coroutineScope = this.f51464OooO0Oo;
        o000000 o000000Var = this.f51467OooO0oO;
        int i = this.f51465OooO0o;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o0O0ooO(o000000Var, i, null), 3, null);
        Function1<Integer, Unit> function1 = this.f51466OooO0o0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }
}
