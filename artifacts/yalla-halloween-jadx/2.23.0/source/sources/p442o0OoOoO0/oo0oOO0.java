package p442o0OoOoO0;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO00o;
import o000O0.OooO0O0;
import p148o00Oo0o.oo0o0Oo;
import p153o00OoO0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<EventModel> f46302OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(OooO0O0<EventModel> oooO0O0) {
        super(1);
        this.f46302OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooO0O0<EventModel> oooO0O0 = this.f46302OooO0Oo;
        int iOooO0O0 = oooO0O0.OooO0O0();
        oo0o0O0 oo0o0o0 = oo0o0O0.f46301OooO0Oo;
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        LazyListScope.CC.OooOO0O(LazyColumn, iOooO0O0, new OooO00o(oooO0O0, oo0o0o0), null, ComposableLambdaKt.composableLambdaInstance(642237349, true, new o00O0OOO(oooO0O0)), 4, null);
        OooOo00.OooO00o(LazyColumn, oooO0O0, o0000.OooO0OO(oo0o0Oo.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
