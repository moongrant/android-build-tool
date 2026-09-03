package p518o0o0O0O0;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51900OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51901OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PagerState f51902OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(CoroutineScope coroutineScope, PagerState pagerState, int i) {
        super(0);
        this.f51900OooO0Oo = coroutineScope;
        this.f51902OooO0o0 = pagerState;
        this.f51901OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f51900OooO0Oo, null, null, new o000oOoO(this.f51902OooO0o0, this.f51901OooO0o, null), 3, null);
        return Unit.INSTANCE;
    }
}
