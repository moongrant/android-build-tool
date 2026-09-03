package p525o0o0OOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53525OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f53526OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f53527OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(CoroutineScope coroutineScope, Oooo000 oooo000, int i) {
        super(0);
        this.f53525OooO0Oo = coroutineScope;
        this.f53527OooO0o0 = oooo000;
        this.f53526OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f53525OooO0Oo, null, null, new o0O0o(this.f53527OooO0o0, this.f53526OooO0o, null), 3, null);
        return Unit.INSTANCE;
    }
}
