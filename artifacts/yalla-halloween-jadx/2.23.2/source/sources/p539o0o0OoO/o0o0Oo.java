package p539o0o0OoO;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f54594OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomUserRecordModel> f54595OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomUserRecordModel> f54596OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54597OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54598OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(String str, OooOOOO<RoomUserRecordModel> oooOOOO, OooOOOO<RoomUserRecordModel> oooOOOO2, int i, int i2) {
        super(4);
        this.f54594OooO0Oo = str;
        this.f54596OooO0o0 = oooOOOO;
        this.f54595OooO0o = oooOOOO2;
        this.f54597OooO0oO = i;
        this.f54598OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(344257863, iIntValue2, -1, "com.yalla.yalla.ui.screen.room.RoomUserOperationRecordPage.<anonymous>.<anonymous>.<anonymous> (RoomUserActionRecordScreen.kt:178)");
            }
            String str = this.f54594OooO0Oo;
            RoomUserRecordModel roomUserRecordModelOooO00o = (StringsKt.isBlank(str) ^ true ? this.f54596OooO0o0 : this.f54595OooO0o).OooO00o(iIntValue);
            if (roomUserRecordModelOooO00o != null) {
                int i = this.f54598OooO0oo;
                o0oOO.OooO00o(roomUserRecordModelOooO00o, str, this.f54597OooO0oO, composer2, ((i << 6) & 896) | (i & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
