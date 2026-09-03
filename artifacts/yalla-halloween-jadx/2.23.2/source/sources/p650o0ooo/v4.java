package p650o0ooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class v4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f59189OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000000 f59190OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(o000000 o000000Var, CoroutineScope coroutineScope) {
        super(0);
        this.f59189OooO0Oo = coroutineScope;
        this.f59190OooO0o0 = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f59189OooO0Oo, null, null, new u4(this.f59190OooO0o0, null), 3, null);
        return Unit.INSTANCE;
    }
}
