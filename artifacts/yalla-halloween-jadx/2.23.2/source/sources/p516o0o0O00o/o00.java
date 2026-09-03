package p516o0o0O00o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51113OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51114OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000000 f51115OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(CoroutineScope coroutineScope, o000000 o000000Var, int i) {
        super(0);
        this.f51113OooO0Oo = coroutineScope;
        this.f51115OooO0o0 = o000000Var;
        this.f51114OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f51113OooO0Oo, null, null, new o000OOo0(this.f51115OooO0o0, this.f51114OooO0o, null), 3, null);
        return Unit.INSTANCE;
    }
}
