package p445o0OoOoO0;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p193o00o0O0O.o0000oo;
import p583o0oOoo00.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f47306OooO00o = ComposableLambdaKt.composableLambdaInstance(297118250, false, OooO00o.f47307OooO0Oo);

    @SourceDebugExtension({"SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yalla/yalla/module/account/ui/screen/ComposableSingletons$AccountScreenKt$lambda-1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,106:1\n81#2:107\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yalla/yalla/module/account/ui/screen/ComposableSingletons$AccountScreenKt$lambda-1$1\n*L\n94#1:107\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47307OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope SettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(297118250, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.ComposableSingletons$AccountScreenKt.lambda-1.<anonymous> (AccountScreen.kt:93)");
                }
                Boolean bool = (Boolean) LiveDataAdapterKt.observeAsState(o000000.f56635OooO0O0, Boolean.FALSE, composer2, 56).getValue();
                Intrinsics.checkNotNullExpressionValue(bool, "invoke$lambda$0(...)");
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(bool.booleanValue() ? p562o0oOo000.o000000.On : p562o0oOo000.o000000.Off, composer2, 0), (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
