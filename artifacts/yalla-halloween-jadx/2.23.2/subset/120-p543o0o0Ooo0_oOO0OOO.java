package p543o0o0Ooo0;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
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
import com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen;
import com.yalla.yalla.ui.screen.user.RoomThemeMineScreen;
import com.yalla.yalla.ui.screen.user.RoomThemePageType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55506OooO00o = ComposableLambdaKt.composableLambdaInstance(1970480528, false, OooO00o.f55508OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55507OooO0O0 = ComposableLambdaKt.composableLambdaInstance(1119055548, false, OooO0O0.f55509OooO0Oo);

    @SourceDebugExtension({"SMAP\nRoomThemeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$RoomThemeScreenKt$lambda-1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,88:1\n36#2:89\n1097#3,6:90\n154#4:96\n154#4:97\n*S KotlinDebug\n*F\n+ 1 RoomThemeScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$RoomThemeScreenKt$lambda-1$1\n*L\n61#1:89\n61#1:90,6\n64#1:96\n69#1:97\n*E\n"})
    public static final class OooO00o extends Lambda implements Function5<String, Boolean, Function0<? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55508OooO0Oo = new OooO00o();

        public OooO00o() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(String str, Boolean bool, Function0<? extends Unit> function0, Composer composer, Integer num) {
            int i;
            String title = str;
            boolean zBooleanValue = bool.booleanValue();
            Function0<? extends Unit> onClick = function0;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed(title) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 112) == 0) {
                i |= composer2.changed(zBooleanValue) ? 32 : 16;
            }
            if ((iIntValue & 896) == 0) {
                i |= composer2.changedInstance(onClick) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i & 5851) == 1170 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1970480528, i, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$RoomThemeScreenKt.lambda-1.<anonymous> (RoomThemeScreen.kt:52)");
                }
                int i2 = o0OOo000.f48347o00OOooO;
                long j = zBooleanValue ? o0OOo000.f48185Ooooo00 : o0OOo000.f48171Oooo0o;
                long sp = TextUnitKt.getSp(14);
                FontWeight medium = FontWeight.INSTANCE.getMedium();
                long sp2 = TextUnitKt.getSp(0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(onClick);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new oOO0OO(onClick);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1261Text4IGK_g(title, PaddingKt.m479paddingVpY3zN4(BackgroundKt.m170backgroundbw27NRU(PaddingKt.m478padding3ABfNKs(o0O0O00.OooO0O0(modifierFillMaxWidth$default, false, false, 100L, false, null, null, null, (Function0) objRememberedValue, 249), Dp.m3775constructorimpl(4)), zBooleanValue ? o0OOo000.f48187OooooO0 : o0OOo000.f48164Oooo, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(7)), j, sp, (FontStyle) null, medium, (FontFamily) null, sp2, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & i) | 12782592, 0, 130896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function4<p230o00oOo0o.o0O0O00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55509OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(p230o00oOo0o.o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
            p230o00oOo0o.o0O0O00 HorizontalPager = o0o0o00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1119055548, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$RoomThemeScreenKt.lambda-2.<anonymous> (RoomThemeScreen.kt:80)");
                }
                if (iIntValue == RoomThemePageType.Mine.getValue()) {
                    composer2.startReplaceableGroup(1596612902);
                    RoomThemeMineScreen.INSTANCE.MainContent(composer2, 6);
                    composer2.endReplaceableGroup();
                } else if (iIntValue == RoomThemePageType.Custom.getValue()) {
                    composer2.startReplaceableGroup(1596612988);
                    RoomThemeCustomScreen.INSTANCE.MainContent(composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1596613015);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
