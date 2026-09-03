package p510o0o0O00;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51416OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PagerState f51417OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(CoroutineScope coroutineScope, PagerState pagerState, int i) {
        super(0);
        this.f51415OooO0Oo = coroutineScope;
        this.f51417OooO0o0 = pagerState;
        this.f51416OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f51415OooO0Oo, null, null, new o0000oo(this.f51417OooO0o0, this.f51416OooO0o, null), 3, null);
        return Unit.INSTANCE;
    }
}
