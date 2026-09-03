package p533o0o0Oo0;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
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
import com.facebook.OooOo;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54823OooO00o = ComposableLambdaKt.composableLambdaInstance(-1870891722, false, OooO00o.f54825OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54824OooO0O0 = ComposableLambdaKt.composableLambdaInstance(1840394655, false, OooO0O0.f54826OooO0Oo);

    @SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenTopInfoKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,335:1\n154#2:336\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenTopInfoKt$lambda-1$1\n*L\n158#1:336\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54825OooO0Oo = new OooO00o();

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
                ComposerKt.traceEventStart(-1870891722, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.ComposableSingletons$LiveRoomScreenTopInfoKt.lambda-1.<anonymous> (LiveRoomScreenTopInfo.kt:151)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_room_sound_close, composer2, 0), (String) null, OooOo.OooO0O0(4, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenTopInfoKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,335:1\n154#2:336\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenTopInfoKt$lambda-2$1\n*L\n169#1:336\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f54826OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1840394655, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.ComposableSingletons$LiveRoomScreenTopInfoKt.lambda-2.<anonymous> (LiveRoomScreenTopInfo.kt:162)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_room_lock_flag, composer2, 0), (String) null, OooOo.OooO0O0(6, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }
}
