package p519o0o0O0OO;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f51989OooO00o = ComposableLambdaKt.composableLambdaInstance(62914433, false, OooO00o.f51990OooO0Oo);

    @SourceDebugExtension({"SMAP\nMomentVideoComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/ComposableSingletons$MomentVideoCompKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,782:1\n154#2:783\n*S KotlinDebug\n*F\n+ 1 MomentVideoComp.kt\ncom/yalla/yalla/ui/composable/moment/ComposableSingletons$MomentVideoCompKt$lambda-1$1\n*L\n724#1:783\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f51990OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(62914433, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.ComposableSingletons$MomentVideoCompKt.lambda-1.<anonymous> (MomentVideoComp.kt:719)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_start_live_play, composer2, 0), (String) null, BoxWithConstraints.align(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(48)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
