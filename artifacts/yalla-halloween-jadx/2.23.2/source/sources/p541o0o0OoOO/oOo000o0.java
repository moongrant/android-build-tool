package p541o0o0OoOO;

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
import androidx.media3.session.o00O0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55294OooO00o = ComposableLambdaKt.composableLambdaInstance(-1870891722, false, OooO00o.f55296OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55295OooO0O0 = ComposableLambdaKt.composableLambdaInstance(1840394655, false, OooO0O0.f55297OooO0Oo);

    @SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenTopInfoKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,334:1\n154#2:335\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenTopInfoKt$lambda-1$1\n*L\n157#1:335\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55296OooO0Oo = new OooO00o();

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
            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_room_sound_close, composer2, 0), (String) null, o00O0O0.OooO00o(4, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenTopInfoKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,334:1\n154#2:335\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/ComposableSingletons$LiveRoomScreenTopInfoKt$lambda-2$1\n*L\n168#1:335\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55297OooO0Oo = new OooO0O0();

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
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icon_room_lock_flag, composer2, 0), (String) null, o00O0O0.OooO00o(6, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }
}
