package p528o0o0OOOo;

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
import p150o00Oo0oO.o0000Ooo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53715OooO00o = ComposableLambdaKt.composableLambdaInstance(-848836615, false, OooO00o.f53717OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53716OooO0O0 = ComposableLambdaKt.composableLambdaInstance(243529191, false, OooO0O0.f53718OooO0Oo);

    @SourceDebugExtension({"SMAP\nMomentCommentDialogPraises.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogPraises.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$MomentCommentDialogPraisesKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,203:1\n154#2:204\n*S KotlinDebug\n*F\n+ 1 MomentCommentDialogPraises.kt\ncom/yalla/yalla/ui/screen/moment/media/ComposableSingletons$MomentCommentDialogPraisesKt$lambda-1$1\n*L\n80#1:204\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53717OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(-848836615, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogPraisesKt.lambda-1.<anonymous> (MomentCommentDialogPraises.kt:75)");
                }
                o0000Ooo.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.No_likes_yet, composer2, 0), oOo00OO0.icon_no_list_praise, Dp.m3765constructorimpl(35), null, null, false, null, null, null, composer2, 384, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f53718OooO0Oo = new OooO0O0();

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
                    ComposerKt.traceEventStart(243529191, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.ComposableSingletons$MomentCommentDialogPraisesKt.lambda-2.<anonymous> (MomentCommentDialogPraises.kt:84)");
                }
                oO0o0o.OooO0O0(oO0o0o.f54055OooO00o, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
