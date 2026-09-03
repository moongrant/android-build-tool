package p485o0o00O0;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f48218OooO00o = ComposableLambdaKt.composableLambdaInstance(-1303047724, false, OooO00o.f48219OooO0Oo);

    @SourceDebugExtension({"SMAP\nPostDetailCommentSonListBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/ComposableSingletons$PostDetailCommentSonListBottomCompKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,411:1\n154#2:412\n*S KotlinDebug\n*F\n+ 1 PostDetailCommentSonListBottomComp.kt\ncom/yalla/yalla/ui/activity/moment/ComposableSingletons$PostDetailCommentSonListBottomCompKt$lambda-1$1\n*L\n115#1:412\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f48219OooO0Oo = new OooO00o();

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
                ComposerKt.traceEventStart(-1303047724, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.ComposableSingletons$PostDetailCommentSonListBottomCompKt.lambda-1.<anonymous> (PostDetailCommentSonListBottomComp.kt:113)");
            }
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(3)), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }
}
