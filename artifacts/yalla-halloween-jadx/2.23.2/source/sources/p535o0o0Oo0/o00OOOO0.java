package p535o0o0Oo0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p196o00o0OOO.oOO00O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53643OooO00o = ComposableLambdaKt.composableLambdaInstance(1513213361, false, OooO00o.f53644OooO0Oo);

    @SourceDebugExtension({"SMAP\nMomentCommentDialogComments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogComments.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$MomentCommentDialogCommentsKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,185:1\n154#2:186\n*S KotlinDebug\n*F\n+ 1 MomentCommentDialogComments.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$MomentCommentDialogCommentsKt$lambda-1$1\n*L\n75#1:186\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53644OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1513213361, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogCommentsKt.lambda-1.<anonymous> (MomentCommentDialogComments.kt:71)");
                }
                oOO00O.OooO00o(StringResources_androidKt.stringResource(o000000.No_comments_yet, composer2, 0), o0Oo0oo.icon_no_list_comment, Dp.m3775constructorimpl(35), null, null, false, null, null, null, composer2, 384, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
