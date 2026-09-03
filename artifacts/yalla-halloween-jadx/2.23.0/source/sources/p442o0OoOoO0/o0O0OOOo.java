package p442o0OoOoO0;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<EventModel> f46261OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(OooO0O0<EventModel> oooO0O0) {
        super(1);
        this.f46261OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooO0O0<EventModel> oooO0O0 = this.f46261OooO0Oo;
        if (oooO0O0.OooO0O0() > 0) {
            LazyListScope.CC.OooO(LazyColumn, null, null, o00O0O0O.f46194OooO00o, 3, null);
        }
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(614775155, true, new o0O0OOO0(oooO0O0)), 6, null);
        return Unit.INSTANCE;
    }
}
