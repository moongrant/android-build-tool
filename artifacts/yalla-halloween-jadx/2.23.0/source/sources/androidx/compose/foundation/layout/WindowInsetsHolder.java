package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010=\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010?\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\bJ\u000e\u0010C\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0003J\u000e\u0010D\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010-\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\fR\u0011\u0010/\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0010R\u0011\u00101\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\fR\u0011\u00103\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0010R\u0011\u00105\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\fR\u0011\u00107\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\fR\u0011\u00109\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0010R\u0011\u0010;\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0010¨\u0006F"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "accessCount", "", "captionBar", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getCaptionBar", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBarIgnoringVisibility", "Landroidx/compose/foundation/layout/ValueInsets;", "getCaptionBarIgnoringVisibility", "()Landroidx/compose/foundation/layout/ValueInsets;", "consumes", "", "getConsumes", "()Z", "displayCutout", "getDisplayCutout", "ime", "getIme", "imeAnimationSource", "getImeAnimationSource", "imeAnimationTarget", "getImeAnimationTarget", "insetsListener", "Landroidx/compose/foundation/layout/InsetsListener;", "mandatorySystemGestures", "getMandatorySystemGestures", "navigationBars", "getNavigationBars", "navigationBarsIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "safeContent", "Landroidx/compose/foundation/layout/WindowInsets;", "getSafeContent", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", "getSafeDrawing", "safeGestures", "getSafeGestures", "statusBars", "getStatusBars", "statusBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "systemBars", "getSystemBars", "systemBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "systemGestures", "getSystemGestures", "tappableElement", "getTappableElement", "tappableElementIgnoringVisibility", "getTappableElementIgnoringVisibility", "waterfall", "getWaterfall", "decrementAccessors", "", "incrementAccessors", "update", "windowInsets", "types", "updateImeAnimationSource", "updateImeAnimationTarget", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;

    @NotNull
    private final AndroidWindowInsets captionBar;

    @NotNull
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;

    @NotNull
    private final AndroidWindowInsets displayCutout;

    @NotNull
    private final AndroidWindowInsets ime;

    @NotNull
    private final ValueInsets imeAnimationSource;

    @NotNull
    private final ValueInsets imeAnimationTarget;

    @NotNull
    private final InsetsListener insetsListener;

    @NotNull
    private final AndroidWindowInsets mandatorySystemGestures;

    @NotNull
    private final AndroidWindowInsets navigationBars;

    @NotNull
    private final ValueInsets navigationBarsIgnoringVisibility;

    @NotNull
    private final WindowInsets safeContent;

    @NotNull
    private final WindowInsets safeDrawing;

    @NotNull
    private final WindowInsets safeGestures;

    @NotNull
    private final AndroidWindowInsets statusBars;

    @NotNull
    private final ValueInsets statusBarsIgnoringVisibility;

    @NotNull
    private final AndroidWindowInsets systemBars;

    @NotNull
    private final ValueInsets systemBarsIgnoringVisibility;

    @NotNull
    private final AndroidWindowInsets systemGestures;

    @NotNull
    private final AndroidWindowInsets tappableElement;

    @NotNull
    private final ValueInsets tappableElementIgnoringVisibility;

    @NotNull
    private final ValueInsets waterfall;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "()V", "testInsets", "", "viewMap", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "current", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getOrCreateFor", ViewHierarchyConstants.VIEW_KEY, "setUseTestInsets", "", "systemInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/core/view/WindowInsetsCompat;", "type", "", "name", "", "valueInsetsIgnoringVisibility", "Landroidx/compose/foundation/layout/ValueInsets;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n76#2:768\n361#3,7:769\n1#4:776\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n610#1:768\n628#1:769,7\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                Object obj = weakHashMap.get(view);
                Object obj2 = obj;
                if (obj == null) {
                    WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                    weakHashMap.put(view, windowInsetsHolder2);
                    obj2 = windowInsetsHolder2;
                }
                windowInsetsHolder = (WindowInsetsHolder) obj2;
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsets, int type, String name) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(type, name);
            if (windowInsets != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsets, type);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsets, int type, String name) {
            p052o00000oO.OooOO0O oooOO0OOooO0O0;
            if (windowInsets == null || (oooOO0OOooO0O0 = windowInsets.OooO0O0(type)) == null) {
                oooOO0OOooO0O0 = p052o00000oO.OooOO0O.f33988OooO0o0;
            }
            Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0O0, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return WindowInsets_androidKt.ValueInsets(oooOO0OOooO0O0, name);
        }

        @Composable
        @NotNull
        public final WindowInsetsHolder current(@Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-1366542614);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)");
            }
            final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            EffectsKt.DisposableEffect(orCreateFor, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    orCreateFor.incrementAccessors(view);
                    final WindowInsetsHolder windowInsetsHolder = orCreateFor;
                    final View view2 = view;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            windowInsetsHolder.decrementAccessors(view2);
                        }
                    };
                }
            }, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return orCreateFor;
        }

        public final void setUseTestInsets(boolean testInsets) {
            WindowInsetsHolder.testInsets = testInsets;
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i);
    }

    public final void decrementAccessors(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.accessCount - 1;
        this.accessCount = i;
        if (i == 0) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO.OooOo0(view, null);
            ViewCompat.OooOOo(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    @NotNull
    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    @NotNull
    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    @NotNull
    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    @NotNull
    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    @NotNull
    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    @NotNull
    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    @NotNull
    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    @NotNull
    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    @NotNull
    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    @NotNull
    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    @NotNull
    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    @NotNull
    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    @NotNull
    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    @NotNull
    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    @NotNull
    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    @NotNull
    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    @NotNull
    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    @NotNull
    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    @NotNull
    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    @NotNull
    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.accessCount == 0) {
            InsetsListener insetsListener = this.insetsListener;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO.OooOo0(view, insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.OooOOo(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void update(@NotNull WindowInsetsCompat windowInsets, int types) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (testInsets) {
            android.view.WindowInsets windowInsetsOooO = windowInsets.OooO();
            Intrinsics.checkNotNull(windowInsetsOooO);
            windowInsets = WindowInsetsCompat.OooOO0(null, windowInsetsOooO);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.captionBar.update$foundation_layout_release(windowInsets, types);
        this.ime.update$foundation_layout_release(windowInsets, types);
        this.displayCutout.update$foundation_layout_release(windowInsets, types);
        this.navigationBars.update$foundation_layout_release(windowInsets, types);
        this.statusBars.update$foundation_layout_release(windowInsets, types);
        this.systemBars.update$foundation_layout_release(windowInsets, types);
        this.systemGestures.update$foundation_layout_release(windowInsets, types);
        this.tappableElement.update$foundation_layout_release(windowInsets, types);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsets, types);
        if (types == 0) {
            ValueInsets valueInsets = this.captionBarIgnoringVisibility;
            p052o00000oO.OooOO0O oooOO0OOooO0O0 = windowInsets.OooO0O0(4);
            Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0O0, "insets.getInsetsIgnoring…aptionBar()\n            )");
            valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(oooOO0OOooO0O0));
            ValueInsets valueInsets2 = this.navigationBarsIgnoringVisibility;
            p052o00000oO.OooOO0O oooOO0OOooO0O1 = windowInsets.OooO0O0(2);
            Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0O1, "insets.getInsetsIgnoring…ationBars()\n            )");
            valueInsets2.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(oooOO0OOooO0O1));
            ValueInsets valueInsets3 = this.statusBarsIgnoringVisibility;
            p052o00000oO.OooOO0O oooOO0OOooO0O2 = windowInsets.OooO0O0(1);
            Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0O2, "insets.getInsetsIgnoring…tatusBars()\n            )");
            valueInsets3.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(oooOO0OOooO0O2));
            ValueInsets valueInsets4 = this.systemBarsIgnoringVisibility;
            p052o00000oO.OooOO0O oooOO0OOooO0O3 = windowInsets.OooO0O0(7);
            Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0O3, "insets.getInsetsIgnoring…ystemBars()\n            )");
            valueInsets4.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(oooOO0OOooO0O3));
            ValueInsets valueInsets5 = this.tappableElementIgnoringVisibility;
            p052o00000oO.OooOO0O oooOO0OOooO0O4 = windowInsets.OooO0O0(64);
            Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0O4, "insets.getInsetsIgnoring…leElement()\n            )");
            valueInsets5.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(oooOO0OOooO0O4));
            androidx.core.view.Oooo000 oooo000OooO0o0 = windowInsets.f5382OooO00o.OooO0o0();
            if (oooo000OooO0o0 != null) {
                p052o00000oO.OooOO0O oooOO0OOooO0OO = Build.VERSION.SDK_INT >= 30 ? p052o00000oO.OooOO0O.OooO0OO(androidx.core.view.Oooo000.OooO0O0.OooO0O0(oooo000OooO0o0.f5333OooO00o)) : p052o00000oO.OooOO0O.f33988OooO0o0;
                Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0OO, "cutout.waterfallInsets");
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(oooOO0OOooO0OO));
            }
        }
        Snapshot.INSTANCE.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(@NotNull WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        ValueInsets valueInsets = this.imeAnimationSource;
        p052o00000oO.OooOO0O oooOO0OOooO00o = windowInsets.OooO00o(8);
        Intrinsics.checkNotNullExpressionValue(oooOO0OOooO00o, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(oooOO0OOooO00o));
    }

    public final void updateImeAnimationTarget(@NotNull WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        ValueInsets valueInsets = this.imeAnimationTarget;
        p052o00000oO.OooOO0O oooOO0OOooO00o = windowInsets.OooO00o(8);
        Intrinsics.checkNotNullExpressionValue(oooOO0OOooO00o, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(oooOO0OOooO00o));
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        androidx.core.view.Oooo000 oooo000OooO0o0;
        Companion companion = INSTANCE;
        this.captionBar = companion.systemInsets(windowInsetsCompat, 4, "captionBar");
        AndroidWindowInsets androidWindowInsetsSystemInsets = companion.systemInsets(windowInsetsCompat, 128, "displayCutout");
        this.displayCutout = androidWindowInsetsSystemInsets;
        AndroidWindowInsets androidWindowInsetsSystemInsets2 = companion.systemInsets(windowInsetsCompat, 8, "ime");
        this.ime = androidWindowInsetsSystemInsets2;
        AndroidWindowInsets androidWindowInsetsSystemInsets3 = companion.systemInsets(windowInsetsCompat, 32, "mandatorySystemGestures");
        this.mandatorySystemGestures = androidWindowInsetsSystemInsets3;
        this.navigationBars = companion.systemInsets(windowInsetsCompat, 2, "navigationBars");
        this.statusBars = companion.systemInsets(windowInsetsCompat, 1, "statusBars");
        AndroidWindowInsets androidWindowInsetsSystemInsets4 = companion.systemInsets(windowInsetsCompat, 7, "systemBars");
        this.systemBars = androidWindowInsetsSystemInsets4;
        AndroidWindowInsets androidWindowInsetsSystemInsets5 = companion.systemInsets(windowInsetsCompat, 16, "systemGestures");
        this.systemGestures = androidWindowInsetsSystemInsets5;
        AndroidWindowInsets androidWindowInsetsSystemInsets6 = companion.systemInsets(windowInsetsCompat, 64, "tappableElement");
        this.tappableElement = androidWindowInsetsSystemInsets6;
        p052o00000oO.OooOO0O oooOO0OOooO0OO = p052o00000oO.OooOO0O.f33988OooO0o0;
        if (windowInsetsCompat != null && (oooo000OooO0o0 = windowInsetsCompat.f5382OooO00o.OooO0o0()) != null && Build.VERSION.SDK_INT >= 30) {
            oooOO0OOooO0OO = p052o00000oO.OooOO0O.OooO0OO(androidx.core.view.Oooo000.OooO0O0.OooO0O0(oooo000OooO0o0.f5333OooO00o));
        }
        Intrinsics.checkNotNullExpressionValue(oooOO0OOooO0OO, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets(oooOO0OOooO0OO, "waterfall");
        this.waterfall = ValueInsets;
        WindowInsets windowInsetsUnion = WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsetsSystemInsets4, androidWindowInsetsSystemInsets2), androidWindowInsetsSystemInsets);
        this.safeDrawing = windowInsetsUnion;
        WindowInsets windowInsetsUnion2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsetsSystemInsets6, androidWindowInsetsSystemInsets3), androidWindowInsetsSystemInsets5), ValueInsets);
        this.safeGestures = windowInsetsUnion2;
        this.safeContent = WindowInsetsKt.union(windowInsetsUnion, windowInsetsUnion2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 4, "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 2, "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 1, "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 7, "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 64, "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 8, "imeAnimationTarget");
        this.imeAnimationSource = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new InsetsListener(this);
    }
}
