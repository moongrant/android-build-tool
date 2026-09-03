package p579o0oOoOOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes3.dex */
public final class ooo0o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ooOOO0Oo f46232Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0o(ooOOO0Oo ooooo0oo) {
        super(1);
        this.f46232Oooo0o = ooooo0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new ooOOO00O(this.f46232Oooo0o, null), 2, null);
        return Unit.INSTANCE;
    }
}
