package p519o0o0O0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0OOO f52523OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(o00O0OOO o00o0ooo2) {
        super(1);
        this.f52523OooO0Oo = o00o0ooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oo0oOO0(this.f52523OooO0Oo, null), 2, null);
        return Unit.INSTANCE;
    }
}
