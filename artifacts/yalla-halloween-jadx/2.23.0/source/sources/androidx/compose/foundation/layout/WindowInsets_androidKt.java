package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bB\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"(\u0010\u000f\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\"\u0015\u0010\u0014\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0016\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\"\u0015\u0010\u0018\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\"\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013\"\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013\"\u0015\u0010\u001e\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013\"\u0015\u0010 \u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013\"\u0015\u0010\"\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b!\u0010\u0013\"\u0015\u0010$\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b#\u0010\u0013\"\u0015\u0010&\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b%\u0010\u0013\"\u0015\u0010(\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b'\u0010\u0013\"\u0015\u0010*\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b)\u0010\u0013\"\u0015\u0010,\u001a\u00020\u0011*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b+\u0010\u0013\"\u001e\u00100\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0013\"\u001e\u00103\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u0013\"\u001e\u00106\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u0013\"\u001e\u00109\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\u0013\"\u001e\u0010<\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010\u0013\"\u001e\u0010=\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010/\u001a\u0004\b=\u0010>\"\u001e\u0010@\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010/\u001a\u0004\b@\u0010>\"\u001e\u0010D\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010/\u001a\u0004\bB\u0010>\"\u001e\u0010G\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010/\u001a\u0004\bE\u0010>\"\u001e\u0010J\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010/\u001a\u0004\bH\u0010>\"\u001e\u0010K\u001a\u00020\t*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010/\u001a\u0004\bK\u0010>\"\u001e\u0010O\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010/\u001a\u0004\bM\u0010\u0013\"\u001e\u0010R\u001a\u00020\u0011*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010/\u001a\u0004\bP\u0010\u0013¨\u0006S"}, d2 = {"Lo00000oO/OooOO0O;", "Landroidx/compose/foundation/layout/InsetsValues;", "toInsetsValues", "insets", "", "name", "Landroidx/compose/foundation/layout/ValueInsets;", "ValueInsets", "Landroidx/compose/ui/platform/ComposeView;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getConsumeWindowInsets", "(Landroidx/compose/ui/platform/ComposeView;)Z", "setConsumeWindowInsets", "(Landroidx/compose/ui/platform/ComposeView;Z)V", "consumeWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "Landroidx/compose/foundation/layout/WindowInsets;", "getCaptionBar", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "captionBar", "getDisplayCutout", "displayCutout", "getIme", "ime", "getMandatorySystemGestures", "mandatorySystemGestures", "getNavigationBars", "navigationBars", "getStatusBars", "statusBars", "getSystemBars", "systemBars", "getSystemGestures", "systemGestures", "getTappableElement", "tappableElement", "getWaterfall", "waterfall", "getSafeDrawing", "safeDrawing", "getSafeGestures", "safeGestures", "getSafeContent", "safeContent", "getCaptionBarIgnoringVisibility", "getCaptionBarIgnoringVisibility$annotations", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;)V", "captionBarIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility$annotations", "navigationBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility$annotations", "statusBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility$annotations", "systemBarsIgnoringVisibility", "getTappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility$annotations", "tappableElementIgnoringVisibility", "isCaptionBarVisible", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Z", "isCaptionBarVisible$annotations", "isImeVisible", "isImeVisible$annotations", "getAreStatusBarsVisible", "getAreStatusBarsVisible$annotations", "areStatusBarsVisible", "getAreNavigationBarsVisible", "getAreNavigationBarsVisible$annotations", "areNavigationBarsVisible", "getAreSystemBarsVisible", "getAreSystemBarsVisible$annotations", "areSystemBarsVisible", "isTappableElementVisible", "isTappableElementVisible$annotations", "getImeAnimationSource", "getImeAnimationSource$annotations", "imeAnimationSource", "getImeAnimationTarget", "getImeAnimationTarget$annotations", "imeAnimationTarget", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
public final class WindowInsets_androidKt {
    @NotNull
    public static final ValueInsets ValueInsets(@NotNull p052o00000oO.OooOO0O insets, @NotNull String name) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ValueInsets(toInsetsValues(insets), name);
    }

    @Composable
    @ExperimentalLayoutApi
    @JvmName(name = "getAreNavigationBarsVisible")
    public static final boolean getAreNavigationBarsVisible(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 710310464)) {
            ComposerKt.traceEventStart(710310464, i, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:349)");
        }
        boolean zIsVisible = WindowInsetsHolder.INSTANCE.current(composer, 8).getNavigationBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zIsVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreNavigationBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @ExperimentalLayoutApi
    @JvmName(name = "getAreStatusBarsVisible")
    public static final boolean getAreStatusBarsVisible(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 1613283456)) {
            ComposerKt.traceEventStart(1613283456, i, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:337)");
        }
        boolean zIsVisible = WindowInsetsHolder.INSTANCE.current(composer, 8).getStatusBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zIsVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreStatusBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @ExperimentalLayoutApi
    @JvmName(name = "getAreSystemBarsVisible")
    public static final boolean getAreSystemBarsVisible(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 1985490720)) {
            ComposerKt.traceEventStart(1985490720, i, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:361)");
        }
        boolean zIsVisible = WindowInsetsHolder.INSTANCE.current(composer, 8).getSystemBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zIsVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreSystemBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @JvmName(name = "getCaptionBar")
    @NotNull
    public static final WindowInsets getCaptionBar(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1832025528)) {
            ComposerKt.traceEventStart(-1832025528, i, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:125)");
        }
        AndroidWindowInsets captionBar = WindowInsetsHolder.INSTANCE.current(composer, 8).getCaptionBar();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return captionBar;
    }

    @ExperimentalLayoutApi
    @JvmName(name = "getCaptionBarIgnoringVisibility")
    @NotNull
    @Composable
    public static final WindowInsets getCaptionBarIgnoringVisibility(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1731251574)) {
            ComposerKt.traceEventStart(-1731251574, i, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:249)");
        }
        ValueInsets captionBarIgnoringVisibility = WindowInsetsHolder.INSTANCE.current(composer, 8).getCaptionBarIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return captionBarIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getCaptionBarIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    public static final boolean getConsumeWindowInsets(@NotNull ComposeView composeView) {
        Intrinsics.checkNotNullParameter(composeView, "<this>");
        Object tag = composeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Composable
    @JvmName(name = "getDisplayCutout")
    @NotNull
    public static final WindowInsets getDisplayCutout(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 1324817724)) {
            ComposerKt.traceEventStart(1324817724, i, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:134)");
        }
        AndroidWindowInsets displayCutout = WindowInsetsHolder.INSTANCE.current(composer, 8).getDisplayCutout();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return displayCutout;
    }

    @Composable
    @JvmName(name = "getIme")
    @NotNull
    public static final WindowInsets getIme(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1466917860)) {
            ComposerKt.traceEventStart(-1466917860, i, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:148)");
        }
        AndroidWindowInsets ime = WindowInsetsHolder.INSTANCE.current(composer, 8).getIme();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return ime;
    }

    @ExperimentalLayoutApi
    @JvmName(name = "getImeAnimationSource")
    @NotNull
    @Composable
    public static final WindowInsets getImeAnimationSource(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1126064918)) {
            ComposerKt.traceEventStart(-1126064918, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:387)");
        }
        ValueInsets imeAnimationSource = WindowInsetsHolder.INSTANCE.current(composer, 8).getImeAnimationSource();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imeAnimationSource;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getImeAnimationSource$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    @JvmName(name = "getImeAnimationTarget")
    @NotNull
    @Composable
    public static final WindowInsets getImeAnimationTarget(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -466319786)) {
            ComposerKt.traceEventStart(-466319786, i, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:402)");
        }
        ValueInsets imeAnimationTarget = WindowInsetsHolder.INSTANCE.current(composer, 8).getImeAnimationTarget();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imeAnimationTarget;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getImeAnimationTarget$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @JvmName(name = "getMandatorySystemGestures")
    @NotNull
    public static final WindowInsets getMandatorySystemGestures(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 1369492988)) {
            ComposerKt.traceEventStart(1369492988, i, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:157)");
        }
        AndroidWindowInsets mandatorySystemGestures = WindowInsetsHolder.INSTANCE.current(composer, 8).getMandatorySystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mandatorySystemGestures;
    }

    @Composable
    @JvmName(name = "getNavigationBars")
    @NotNull
    public static final WindowInsets getNavigationBars(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 1596175702)) {
            ComposerKt.traceEventStart(1596175702, i, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:167)");
        }
        AndroidWindowInsets navigationBars = WindowInsetsHolder.INSTANCE.current(composer, 8).getNavigationBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBars;
    }

    @ExperimentalLayoutApi
    @JvmName(name = "getNavigationBarsIgnoringVisibility")
    @NotNull
    @Composable
    public static final WindowInsets getNavigationBarsIgnoringVisibility(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1990981160)) {
            ComposerKt.traceEventStart(-1990981160, i, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:263)");
        }
        ValueInsets navigationBarsIgnoringVisibility = WindowInsetsHolder.INSTANCE.current(composer, 8).getNavigationBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBarsIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getNavigationBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @JvmName(name = "getSafeContent")
    @NotNull
    public static final WindowInsets getSafeContent(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -2026663876)) {
            ComposerKt.traceEventStart(-2026663876, i, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:237)");
        }
        WindowInsets safeContent = WindowInsetsHolder.INSTANCE.current(composer, 8).getSafeContent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeContent;
    }

    @Composable
    @JvmName(name = "getSafeDrawing")
    @NotNull
    public static final WindowInsets getSafeDrawing(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -49441252)) {
            ComposerKt.traceEventStart(-49441252, i, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:217)");
        }
        WindowInsets safeDrawing = WindowInsetsHolder.INSTANCE.current(composer, 8).getSafeDrawing();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeDrawing;
    }

    @Composable
    @JvmName(name = "getSafeGestures")
    @NotNull
    public static final WindowInsets getSafeGestures(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1594247780)) {
            ComposerKt.traceEventStart(-1594247780, i, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:228)");
        }
        WindowInsets safeGestures = WindowInsetsHolder.INSTANCE.current(composer, 8).getSafeGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return safeGestures;
    }

    @Composable
    @JvmName(name = "getStatusBars")
    @NotNull
    public static final WindowInsets getStatusBars(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -675090670)) {
            ComposerKt.traceEventStart(-675090670, i, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:175)");
        }
        AndroidWindowInsets statusBars = WindowInsetsHolder.INSTANCE.current(composer, 8).getStatusBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBars;
    }

    @ExperimentalLayoutApi
    @JvmName(name = "getStatusBarsIgnoringVisibility")
    @NotNull
    @Composable
    public static final WindowInsets getStatusBarsIgnoringVisibility(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 594020756)) {
            ComposerKt.traceEventStart(594020756, i, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:275)");
        }
        ValueInsets statusBarsIgnoringVisibility = WindowInsetsHolder.INSTANCE.current(composer, 8).getStatusBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBarsIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getStatusBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @JvmName(name = "getSystemBars")
    @NotNull
    public static final WindowInsets getSystemBars(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -282936756)) {
            ComposerKt.traceEventStart(-282936756, i, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:183)");
        }
        AndroidWindowInsets systemBars = WindowInsetsHolder.INSTANCE.current(composer, 8).getSystemBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBars;
    }

    @ExperimentalLayoutApi
    @JvmName(name = "getSystemBarsIgnoringVisibility")
    @NotNull
    @Composable
    public static final WindowInsets getSystemBarsIgnoringVisibility(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 1564566798)) {
            ComposerKt.traceEventStart(1564566798, i, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:288)");
        }
        ValueInsets systemBarsIgnoringVisibility = WindowInsetsHolder.INSTANCE.current(composer, 8).getSystemBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemBarsIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getSystemBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @JvmName(name = "getSystemGestures")
    @NotNull
    public static final WindowInsets getSystemGestures(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 989216224)) {
            ComposerKt.traceEventStart(989216224, i, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:191)");
        }
        AndroidWindowInsets systemGestures = WindowInsetsHolder.INSTANCE.current(composer, 8).getSystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return systemGestures;
    }

    @Composable
    @JvmName(name = "getTappableElement")
    @NotNull
    public static final WindowInsets getTappableElement(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1994205284)) {
            ComposerKt.traceEventStart(-1994205284, i, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:199)");
        }
        AndroidWindowInsets tappableElement = WindowInsetsHolder.INSTANCE.current(composer, 8).getTappableElement();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tappableElement;
    }

    @ExperimentalLayoutApi
    @JvmName(name = "getTappableElementIgnoringVisibility")
    @NotNull
    @Composable
    public static final WindowInsets getTappableElementIgnoringVisibility(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1488788292)) {
            ComposerKt.traceEventStart(-1488788292, i, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:301)");
        }
        ValueInsets tappableElementIgnoringVisibility = WindowInsetsHolder.INSTANCE.current(composer, 8).getTappableElementIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tappableElementIgnoringVisibility;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getTappableElementIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @JvmName(name = "getWaterfall")
    @NotNull
    public static final WindowInsets getWaterfall(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 1943241020)) {
            ComposerKt.traceEventStart(1943241020, i, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:207)");
        }
        ValueInsets waterfall = WindowInsetsHolder.INSTANCE.current(composer, 8).getWaterfall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return waterfall;
    }

    @Composable
    @ExperimentalLayoutApi
    @JvmName(name = "isCaptionBarVisible")
    public static final boolean isCaptionBarVisible(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -501076620)) {
            ComposerKt.traceEventStart(-501076620, i, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:313)");
        }
        boolean zIsVisible = WindowInsetsHolder.INSTANCE.current(composer, 8).getCaptionBar().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zIsVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isCaptionBarVisible$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @ExperimentalLayoutApi
    @JvmName(name = "isImeVisible")
    public static final boolean isImeVisible(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1873571424)) {
            ComposerKt.traceEventStart(-1873571424, i, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:325)");
        }
        boolean zIsVisible = WindowInsetsHolder.INSTANCE.current(composer, 8).getIme().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zIsVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isImeVisible$annotations(WindowInsets.Companion companion) {
    }

    @Composable
    @ExperimentalLayoutApi
    @JvmName(name = "isTappableElementVisible")
    public static final boolean isTappableElementVisible(@NotNull WindowInsets.Companion companion, @Nullable Composer composer, int i) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, -1737201120)) {
            ComposerKt.traceEventStart(-1737201120, i, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:372)");
        }
        boolean zIsVisible = WindowInsetsHolder.INSTANCE.current(composer, 8).getTappableElement().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zIsVisible;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isTappableElementVisible$annotations(WindowInsets.Companion companion) {
    }

    public static final void setConsumeWindowInsets(@NotNull ComposeView composeView, boolean z) {
        Intrinsics.checkNotNullParameter(composeView, "<this>");
        composeView.setTag(androidx.compose.ui.R.id.consume_window_insets_tag, Boolean.valueOf(z));
    }

    @NotNull
    public static final InsetsValues toInsetsValues(@NotNull p052o00000oO.OooOO0O oooOO0O) {
        Intrinsics.checkNotNullParameter(oooOO0O, "<this>");
        return new InsetsValues(oooOO0O.f33989OooO00o, oooOO0O.f33990OooO0O0, oooOO0O.f33991OooO0OO, oooOO0O.f33992OooO0Oo);
    }
}
