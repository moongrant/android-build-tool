package p486o0o00O00;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p147o00Oo0Oo.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f48265OooO00o = ComposableLambdaKt.composableLambdaInstance(-450210586, false, OooO00o.f48268OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f48266OooO0O0 = ComposableLambdaKt.composableLambdaInstance(1126077007, false, OooO0O0.f48269OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f48267OooO0OO = ComposableLambdaKt.composableLambdaInstance(-1058198930, false, OooO0OO.f48270OooO0Oo);

    @SourceDebugExtension({"SMAP\nWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/ComposableSingletons$WebActivityKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,702:1\n154#2:703\n154#2:704\n*S KotlinDebug\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/ComposableSingletons$WebActivityKt$lambda-1$1\n*L\n291#1:703\n293#1:704\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f48268OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope DropdownMenuItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$DropdownMenuItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-450210586, iIntValue, -1, "com.yalla.yalla.ui.activity.main.ComposableSingletons$WebActivityKt.lambda-1.<anonymous> (WebActivity.kt:285)");
                }
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icon_web_menu_refresh, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(24)), o000OOo.OooO0OO(composer2).f37701OooO, composer2, 440, 0);
                OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composer2, 6, 2);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Refresh, composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/ComposableSingletons$WebActivityKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,702:1\n154#2:703\n154#2:704\n*S KotlinDebug\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/ComposableSingletons$WebActivityKt$lambda-2$1\n*L\n306#1:703\n308#1:704\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f48269OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope DropdownMenuItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$DropdownMenuItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1126077007, iIntValue, -1, "com.yalla.yalla.ui.activity.main.ComposableSingletons$WebActivityKt.lambda-2.<anonymous> (WebActivity.kt:300)");
                }
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icon_web_menu_share, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(24)), o000OOo.OooO0OO(composer2).f37701OooO, composer2, 440, 0);
                OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composer2, 6, 2);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.share, composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/ComposableSingletons$WebActivityKt$lambda-3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,702:1\n154#2:703\n154#2:704\n*S KotlinDebug\n*F\n+ 1 WebActivity.kt\ncom/yalla/yalla/ui/activity/main/ComposableSingletons$WebActivityKt$lambda-3$1\n*L\n321#1:703\n323#1:704\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f48270OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope DropdownMenuItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(DropdownMenuItem, "$this$DropdownMenuItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1058198930, iIntValue, -1, "com.yalla.yalla.ui.activity.main.ComposableSingletons$WebActivityKt.lambda-3.<anonymous> (WebActivity.kt:315)");
                }
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icon_web_menu_browsers, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(24)), o000OOo.OooO0OO(composer2).f37701OooO, composer2, 440, 0);
                OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composer2, 6, 2);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Open_in_browser, composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
