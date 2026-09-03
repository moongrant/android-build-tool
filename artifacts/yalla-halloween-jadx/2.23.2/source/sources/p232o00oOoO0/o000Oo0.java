package p232o00oOoO0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSystemUiController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemUiController.kt\ncom/google/accompanist/systemuicontroller/SystemUiControllerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,312:1\n76#2:313\n76#2:322\n76#2:323\n50#3:314\n49#3:315\n1114#4,6:316\n*S KotlinDebug\n*F\n+ 1 SystemUiController.kt\ncom/google/accompanist/systemuicontroller/SystemUiControllerKt\n*L\n187#1:313\n193#1:322\n194#1:323\n188#1:314\n188#1:315\n188#1:316,6\n*E\n"})
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f39899OooO00o = ColorKt.Color$default(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f39900OooO0O0 = OooO00o.f39901OooO0Oo;

    public static final class OooO00o extends Lambda implements Function1<Color, Color> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f39901OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Color invoke(Color color) {
            return Color.m1671boximpl(ColorKt.m1726compositeOverOWjLjI(o000Oo0.f39899OooO00o, color.m1691unboximpl()));
        }
    }

    @Composable
    @NotNull
    public static final o000 OooO00o(@Nullable Composer composer) {
        composer.startReplaceableGroup(-715745933);
        composer.startReplaceableGroup(1009281237);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009281237, 0, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:191)");
        }
        ViewParent parent = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getParent();
        Window window = null;
        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
        Window window2 = dialogWindowProvider != null ? dialogWindowProvider.getWindow() : null;
        if (window2 == null) {
            Context baseContext = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "LocalView.current.context");
            while (true) {
                if (!(baseContext instanceof Activity)) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
                } else {
                    window = ((Activity) baseContext).getWindow();
                    break;
                }
            }
            window2 = window;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-715745933, 0, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:183)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(view) | composer.changed(window2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o000(view, window2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        o000 o000Var = (o000) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o000Var;
    }
}
