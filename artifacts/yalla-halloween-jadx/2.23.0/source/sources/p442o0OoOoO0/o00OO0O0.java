package p442o0OoOoO0;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;
import p507o0o00ooo.u0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<EventModel> f46206OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(OooO0O0<EventModel> oooO0O0) {
        super(3);
        this.f46206OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        LazyItemScope item = lazyItemScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-696708041, iIntValue, -1, "com.yalla.yalla.module.event.ui.page.EventMineSubscribePage.<anonymous>.<anonymous>.<anonymous> (EventMineSubscribePage.kt:64)");
            }
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.event_not_more, composer2, 0);
            int i = OooO0O0.f34327OooO0o0;
            u0.OooO0OO(this.f46206OooO0Oo, strStringResource, composer2, 8, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
