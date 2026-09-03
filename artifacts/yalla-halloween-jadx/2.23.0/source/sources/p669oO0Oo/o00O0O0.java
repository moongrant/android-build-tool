package p669oO0Oo;

import androidx.compose.foundation.layout.RowScope;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000O;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.service.room.OooO00o;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p004OooO0oO.o000oOoO;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 extends Lambda implements Function4<RowScope, Color, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f60544OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f60545OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(long j, int i) {
        super(4);
        this.f60544OooO0Oo = j;
        this.f60545OooO0o0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(RowScope rowScope, Color color, Composer composer, Integer num) {
        String strOooO00o;
        RowScope TextButton = rowScope;
        color.m1680unboximpl();
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((iIntValue & 641) == 128 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-327143454, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskHostDialog.InviteButton.<anonymous> (LiveRoomMemberTaskHostDialog.kt:166)");
            }
            long j = this.f60544OooO0Oo;
            if (j > 0) {
                composer2.startReplaceableGroup(477928535);
                String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Invite, composer2, 0);
                long j2 = o0oO0O0o.f46946OooO0O0;
                TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, j2, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                DecimalFormat decimalFormat = new DecimalFormat("00");
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long hours = timeUnit.toHours(j);
                long minutes = timeUnit.toMinutes(j % ((long) 3600000));
                long seconds = timeUnit.toSeconds(j % ((long) 60000));
                TextKt.m1251Text4IGK_g(o000oOoO.OooO00o("(", decimalFormat.format(hours) + CertificateUtil.DELIMITER + decimalFormat.format(minutes) + CertificateUtil.DELIMITER + decimalFormat.format(seconds), ")"), (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(477928782);
                int iIntValue2 = ((Number) OooO00o.f24986OooOOOO.f47517OooOOO.getValue()).intValue();
                int i = this.f60545OooO0o0;
                if (i > 0) {
                    composer2.startReplaceableGroup(477928962);
                    strOooO00o = o0000O.OooO00o(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Invite_x_x, composer2, 0), String.valueOf(i)), String.valueOf(iIntValue2));
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(477929173);
                    strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Invite_x, composer2, 0), String.valueOf(i));
                    composer2.endReplaceableGroup();
                }
                TextKt.m1251Text4IGK_g(strOooO00o, (Modifier) null, o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
