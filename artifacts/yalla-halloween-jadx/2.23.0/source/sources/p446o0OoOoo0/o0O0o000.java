package p446o0OoOoo0;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f46376OooO00o = ComposableLambdaKt.composableLambdaInstance(-552819879, false, OooO00o.f46377OooO0Oo);

    @SourceDebugExtension({"SMAP\nEventCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventCreateScreen.kt\ncom/yalla/yalla/module/event/ui/screen/ComposableSingletons$EventCreateScreenKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,827:1\n154#2:828\n154#2:829\n154#2:830\n*S KotlinDebug\n*F\n+ 1 EventCreateScreen.kt\ncom/yalla/yalla/module/event/ui/screen/ComposableSingletons$EventCreateScreenKt$lambda-1$1\n*L\n166#1:828\n171#1:829\n173#1:830\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f46377OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
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
                    ComposerKt.traceEventStart(-552819879, iIntValue, -1, "com.yalla.yalla.module.event.ui.screen.ComposableSingletons$EventCreateScreenKt.lambda-1.<anonymous> (EventCreateScreen.kt:159)");
                }
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_doubt_white, composer2, 0);
                long j = o0oO0O0o.f46946OooO0O0;
                Modifier.Companion companion = Modifier.INSTANCE;
                IconKt.m1103Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m523size3ABfNKs(o0O0O00.OooO0O0(ClipKt.clip(PaddingKt.m476padding3ABfNKs(companion, Dp.m3765constructorimpl(8)), RoundedCornerShapeKt.getCircleShape()), false, false, 0L, false, null, null, null, oo0OOoo.f46403OooO0Oo, 255), Dp.m3765constructorimpl(24)), j, composer2, 56, 0);
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(6)), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
