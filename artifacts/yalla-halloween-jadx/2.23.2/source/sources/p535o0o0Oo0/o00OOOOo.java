package p535o0o0Oo0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.lazy.LazyItemScope;
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
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53645OooO00o = ComposableLambdaKt.composableLambdaInstance(-345868999, false, OooO00o.f53647OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53646OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-2052142553, false, OooO0O0.f53648OooO0Oo);

    @SourceDebugExtension({"SMAP\nMomentCommentDialogGifts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogGifts.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$MomentCommentDialogGiftsKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,293:1\n154#2:294\n*S KotlinDebug\n*F\n+ 1 MomentCommentDialogGifts.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$MomentCommentDialogGiftsKt$lambda-1$1\n*L\n87#1:294\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53647OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(-345868999, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogGiftsKt.lambda-1.<anonymous> (MomentCommentDialogGifts.kt:83)");
                }
                oOO00O.OooO00o(StringResources_androidKt.stringResource(o000000.No_gifts_yet, composer2, 0), o0Oo0oo.icon_no_list_gift, Dp.m3775constructorimpl(35), null, null, false, null, null, null, composer2, 384, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f53648OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            LazyItemScope item = lazyItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2052142553, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogGiftsKt.lambda-2.<anonymous> (MomentCommentDialogGifts.kt:93)");
                }
                o0O0OOOo.OooO0O0(o0O0OOOo.f53714OooO00o, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
