package p531o0o0OOoo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f54522OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f54523OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f54524OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CoroutineScope coroutineScope, Oooo000 oooo000, int i) {
        super(0);
        this.f54522OooO0Oo = coroutineScope;
        this.f54524OooO0o0 = oooo000;
        this.f54523OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f54522OooO0Oo, null, null, new n(this.f54524OooO0o0, this.f54523OooO0o, null), 3, null);
        return Unit.INSTANCE;
    }
}
