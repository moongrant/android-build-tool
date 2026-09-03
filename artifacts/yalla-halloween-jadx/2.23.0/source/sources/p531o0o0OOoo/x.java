package p531o0o0OOoo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f54543OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomUserRecordModel> f54544OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomUserRecordModel> f54545OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54546OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54547OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, OooO0O0<RoomUserRecordModel> oooO0O0, OooO0O0<RoomUserRecordModel> oooO0O1, int i, int i2) {
        super(3);
        this.f54543OooO0Oo = str;
        this.f54545OooO0o0 = oooO0O0;
        this.f54544OooO0o = oooO0O1;
        this.f54546OooO0oO = i;
        this.f54547OooO0oo = i2;
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
                ComposerKt.traceEventStart(-825336636, iIntValue, -1, "com.yalla.yalla.ui.screen.room.RoomUserOperationRecordPage.<anonymous> (RoomUserActionRecordScreen.kt:175)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, null, false, new w(this.f54543OooO0Oo, this.f54545OooO0o0, this.f54544OooO0o, this.f54546OooO0oO, this.f54547OooO0oo), composer2, 6, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
