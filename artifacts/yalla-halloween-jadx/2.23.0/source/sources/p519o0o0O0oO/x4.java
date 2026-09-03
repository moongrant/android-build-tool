package p519o0o0O0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class x4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53211OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f53212OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Oooo000 oooo000, CoroutineScope coroutineScope) {
        super(0);
        this.f53211OooO0Oo = coroutineScope;
        this.f53212OooO0o0 = oooo000;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f53211OooO0Oo, null, null, new w4(this.f53212OooO0o0, null), 3, null);
        return Unit.INSTANCE;
    }
}
