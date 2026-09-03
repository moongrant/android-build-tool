package p442o0OoOoO0;

import android.content.Context;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LazyListState f46176OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f46177OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<EventModel> f46178OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f46179OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(LazyListState lazyListState, OooO0O0<EventModel> oooO0O0, Context context, EventViewModel eventViewModel) {
        super(3);
        this.f46176OooO0Oo = lazyListState;
        this.f46178OooO0o0 = oooO0O0;
        this.f46177OooO0o = context;
        this.f46179OooO0oO = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope RefreshContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861015763, iIntValue, -1, "com.yalla.yalla.module.event.ui.page.EventSquarePage.EventSquareList.<anonymous> (EventSquarePage.kt:130)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f46176OooO0Oo, null, false, null, null, null, false, new o0O0o(this.f46178OooO0o0, this.f46177OooO0o, this.f46179OooO0oO), composer2, 6, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
