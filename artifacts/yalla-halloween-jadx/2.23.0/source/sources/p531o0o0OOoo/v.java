package p531o0o0OOoo;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o000O0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f54533OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomUserRecordModel> f54534OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomUserRecordModel> f54535OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54536OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54537OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, OooO0O0<RoomUserRecordModel> oooO0O0, OooO0O0<RoomUserRecordModel> oooO0O1, int i, int i2) {
        super(4);
        this.f54533OooO0Oo = str;
        this.f54535OooO0o0 = oooO0O0;
        this.f54534OooO0o = oooO0O1;
        this.f54536OooO0oO = i;
        this.f54537OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(344257863, iIntValue2, -1, "com.yalla.yalla.ui.screen.room.RoomUserOperationRecordPage.<anonymous>.<anonymous>.<anonymous> (RoomUserActionRecordScreen.kt:177)");
            }
            String str = this.f54533OooO0Oo;
            RoomUserRecordModel roomUserRecordModelOooO00o = (StringsKt.isBlank(str) ^ true ? this.f54535OooO0o0 : this.f54534OooO0o).OooO00o(iIntValue);
            if (roomUserRecordModelOooO00o != null) {
                int i2 = this.f54537OooO0oo;
                z.OooO00o(roomUserRecordModelOooO00o, str, this.f54536OooO0oO, composer2, ((i2 << 6) & 896) | (i2 & 112));
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
