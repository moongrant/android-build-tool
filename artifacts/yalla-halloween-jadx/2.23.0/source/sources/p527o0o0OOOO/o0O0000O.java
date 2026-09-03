package p527o0o0OOOO;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
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
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O0.OooO0O0;
import p147o00Oo0Oo.o000OOo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFriendRequestMessageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRequestMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestMessageScreenKt$FriendRequestMessageScreenContent$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,266:1\n154#2:267\n36#3:268\n1097#4,6:269\n*S KotlinDebug\n*F\n+ 1 FriendRequestMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestMessageScreenKt$FriendRequestMessageScreenContent$1$3\n*L\n99#1:267\n100#1:268\n100#1:269,6\n*E\n"})
public final class o0O0000O extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<FriendRequestMessage> f53628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53629OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0000O(OooO0O0<FriendRequestMessage> oooO0O0, MutableState<Boolean> mutableState) {
        super(3);
        this.f53628OooO0Oo = oooO0O0;
        this.f53629OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        RowScope Toolbar = rowScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236659894, iIntValue, -1, "com.yalla.yalla.ui.screen.message.FriendRequestMessageScreenContent.<anonymous>.<anonymous> (FriendRequestMessageScreen.kt:91)");
            }
            if (this.f53628OooO0Oo.OooO0O0() > 0) {
                String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Clear, composer2, 0);
                long j = o000OOo.OooO0OO(composer2).f37701OooO;
                long sp = TextUnitKt.getSp(16);
                Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(8), 0.0f, 11, null);
                composer2.startReplaceableGroup(1157296644);
                MutableState<Boolean> mutableState = this.f53629OooO0o0;
                boolean zChanged = composer2.changed(mutableState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o0O00000(mutableState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1251Text4IGK_g(strStringResource, o0O0O00.OooO0O0(modifierM480paddingqDBjuR0$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
