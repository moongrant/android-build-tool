package p669oO0Oo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p150o00Oo0oO.o0000Ooo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f60405OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(boolean z) {
        super(3);
        this.f60405OooO0Oo = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope ContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1406658768, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt.lambda-2.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomApplyMicListDialog.kt:127)");
            }
            o0000Ooo.OooO00o(StringResources_androidKt.stringResource(!this.f60405OooO0Oo ? oO00OOo0.apply_mic_list_empty : oO00OOo0.apply_mic_list_empty_owner, composer2, 0), 0, 0.0f, null, null, false, null, null, null, composer2, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
