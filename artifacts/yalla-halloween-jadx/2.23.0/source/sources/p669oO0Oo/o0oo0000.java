package p669oO0Oo;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.OooOO0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomLiveEnterPasswordDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveEnterPasswordDialog.kt\ncom/yalla/yalla/ui/dialog/room/RoomLiveEnterPasswordDialog$OnDialog$2$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,401:1\n154#2:402\n154#2:403\n154#2:404\n*S KotlinDebug\n*F\n+ 1 RoomLiveEnterPasswordDialog.kt\ncom/yalla/yalla/ui/dialog/room/RoomLiveEnterPasswordDialog$OnDialog$2$3\n*L\n185#1:402\n186#1:403\n188#1:404\n*E\n"})
public final class o0oo0000 extends Lambda implements Function4<RowScope, Color, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f60770OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(boolean z) {
        super(4);
        this.f60770OooO0Oo = z;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(RowScope rowScope, Color color, Composer composer, Integer num) {
        RowScope TextButton = rowScope;
        color.m1680unboximpl();
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((iIntValue & 641) == 128 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1206005227, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog.OnDialog.<anonymous>.<anonymous> (RoomLiveEnterPasswordDialog.kt:180)");
            }
            composer2.startReplaceableGroup(-1186902234);
            boolean z = this.f60770OooO0Oo;
            if (z) {
                ProgressIndicatorKt.m1137CircularProgressIndicatorLxG7B9w(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(16)), o0oO0O0o.f46946OooO0O0, Dp.m3765constructorimpl(2), 0L, 0, composer2, 390, 24);
                OooOO0.OooO0Oo(Dp.m3765constructorimpl(6), null, composer2, 6, 2);
            }
            composer2.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(z ? oO00OOo0.Entering : oO00OOo0.Enter, composer2, 0), (Modifier) null, o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
