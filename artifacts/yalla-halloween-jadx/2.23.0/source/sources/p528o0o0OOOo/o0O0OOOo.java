package p528o0o0OOOo;

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
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53721OooO00o = ComposableLambdaKt.composableLambdaInstance(453357902, false, OooO00o.f53722OooO0Oo);

    @SourceDebugExtension({"SMAP\nVideoRightArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoRightArea.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$VideoRightAreaKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,605:1\n154#2:606\n*S KotlinDebug\n*F\n+ 1 VideoRightArea.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$VideoRightAreaKt$lambda-1$1\n*L\n515#1:606\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53722OooO0Oo = new OooO00o();

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
                ComposerKt.traceEventStart(453357902, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$VideoRightAreaKt.lambda-1.<anonymous> (VideoRightArea.kt:509)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_video_followed, composer2, 0), (String) null, BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(19)), RoundedCornerShapeKt.getCircleShape()), o0oO0O0o.f47150o00OOOO0, null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }
}
