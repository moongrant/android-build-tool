package p650o0ooo;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f58930OooO00o = ComposableLambdaKt.composableLambdaInstance(-265326073, false, OooO00o.f58934OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f58931OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-1676982500, false, OooO0O0.f58935OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f58932OooO0OO = ComposableLambdaKt.composableLambdaInstance(-674930021, false, OooO0OO.f58936OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f58933OooO0Oo = ComposableLambdaKt.composableLambdaInstance(-225576283, false, OooO0o.f58937OooO0Oo);

    public static final class OooO00o extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f58934OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope TextDialog = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-265326073, iIntValue, -1, "com.yalla.yalla.ui.dialog.ComposableSingletons$PostSendGiftInfoDialogUtilKt.lambda-1.<anonymous> (PostSendGiftInfoDialogUtil.kt:33)");
                }
                c0.OooO0O0(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nPostSendGiftInfoDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostSendGiftInfoDialogUtil.kt\ncom/yalla/yalla/ui/dialog/ComposableSingletons$PostSendGiftInfoDialogUtilKt$lambda-2$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,145:1\n36#2:146\n1097#3,6:147\n*S KotlinDebug\n*F\n+ 1 PostSendGiftInfoDialogUtil.kt\ncom/yalla/yalla/ui/dialog/ComposableSingletons$PostSendGiftInfoDialogUtilKt$lambda-2$1\n*L\n36#1:146\n36#1:147,6\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f58935OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
            MutableState<Boolean> it = mutableState;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(it) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1676982500, iIntValue, -1, "com.yalla.yalla.ui.dialog.ComposableSingletons$PostSendGiftInfoDialogUtilKt.lambda-2.<anonymous> (PostSendGiftInfoDialogUtil.kt:29)");
                }
                String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.Gifts_Received_XXX), "465");
                ComposableLambda composableLambda = oOO00O.f58930OooO00o;
                int i = iIntValue & 14;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(it);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o00O00OO(it);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                o000O0Oo.OooO0Oo(it, strOooO00o, null, composableLambda, false, false, null, null, null, false, null, false, (Function0) objRememberedValue, null, false, false, null, null, null, null, composer2, i | 3072, 0, 1044468);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f58936OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope JustForPreViewTextDialog = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(JustForPreViewTextDialog, "$this$JustForPreViewTextDialog");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-674930021, iIntValue, -1, "com.yalla.yalla.ui.dialog.ComposableSingletons$PostSendGiftInfoDialogUtilKt.lambda-3.<anonymous> (PostSendGiftInfoDialogUtil.kt:134)");
                }
                c0.OooO0O0(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f58937OooO0Oo = new OooO0o();

        public OooO0o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope JustForPreViewTextDialog = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(JustForPreViewTextDialog, "$this$JustForPreViewTextDialog");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-225576283, iIntValue, -1, "com.yalla.yalla.ui.dialog.ComposableSingletons$PostSendGiftInfoDialogUtilKt.lambda-4.<anonymous> (PostSendGiftInfoDialogUtil.kt:142)");
                }
                c0.OooO0O0(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
