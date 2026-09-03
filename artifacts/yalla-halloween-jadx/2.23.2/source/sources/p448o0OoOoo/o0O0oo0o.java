package p448o0OoOoo;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo0o extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<EventModel> f47484OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(OooOOOO<EventModel> oooOOOO) {
        super(1);
        this.f47484OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooOOOO<EventModel> oooOOOO = this.f47484OooO0Oo;
        if (oooOOOO.OooO0O0() > 0) {
            LazyListScope.CC.OooO(LazyColumn, null, null, o00O0000.f47404OooO00o, 3, null);
        }
        LazyListScope.CC.OooOO0O(LazyColumn, oooOOOO.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(614775155, true, new o0oO0O0o(oooOOOO)), 6, null);
        return Unit.INSTANCE;
    }
}
