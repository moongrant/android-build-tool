package p528o0o0OOOo;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53724OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PagerState f53725OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(PagerState pagerState, CoroutineScope coroutineScope) {
        super(1);
        this.f53724OooO0Oo = coroutineScope;
        this.f53725OooO0o0 = pagerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        BuildersKt__Builders_commonKt.launch$default(this.f53724OooO0Oo, null, null, new oo0OOoo(this.f53725OooO0o0, num.intValue(), null), 3, null);
        return Unit.INSTANCE;
    }
}
