package p442o0OoOoO0;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;
import p148o00Oo0o.oo0o0Oo;
import p153o00OoO0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<EventModel> f46262OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f46263OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f46264OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(OooO0O0<EventModel> oooO0O0, Context context, EventViewModel eventViewModel) {
        super(1);
        this.f46262OooO0Oo = oooO0O0;
        this.f46264OooO0o0 = context;
        this.f46263OooO0o = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooO0O0<EventModel> oooO0O0 = this.f46262OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(1241062666, true, new o0oOOo(oooO0O0, this.f46264OooO0o0, this.f46263OooO0o)), 6, null);
        OooOo00.OooO00o(LazyColumn, oooO0O0, o0000.OooO0OO(oo0o0Oo.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
