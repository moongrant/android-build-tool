package p540o0o0OoO0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f55043OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55044OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55045OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(CoroutineScope coroutineScope, LazyListState lazyListState, MutableState<Boolean> mutableState) {
        super(0);
        this.f55043OooO0Oo = coroutineScope;
        this.f55045OooO0o0 = lazyListState;
        this.f55044OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f55043OooO0Oo, null, null, new o00OO0OO(this.f55045OooO0o0, this.f55044OooO0o, null), 3, null);
        return Unit.INSTANCE;
    }
}
