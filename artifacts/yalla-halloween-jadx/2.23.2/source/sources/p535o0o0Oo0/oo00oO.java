package p535o0o0Oo0;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54253OooO00o = ComposableLambdaKt.composableLambdaInstance(453357902, false, OooO00o.f54254OooO0Oo);

    @SourceDebugExtension({"SMAP\nVideoRightArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoRightArea.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$VideoRightAreaKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,606:1\n154#2:607\n*S KotlinDebug\n*F\n+ 1 VideoRightArea.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$VideoRightAreaKt$lambda-1$1\n*L\n516#1:607\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54254OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(453357902, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$VideoRightAreaKt.lambda-1.<anonymous> (VideoRightArea.kt:511)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_video_followed, composer2, 0), (String) null, BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(19)), RoundedCornerShapeKt.getCircleShape()), o0OOo000.f48367oOooo0o, null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }
}
