package com.yalla.yalla.ui.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.o00Oo00;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.o0oOOo;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p539o0o0OoOO.c0;
import p539o0o0OoOO.d0;
import p539o0o0OoOO.y1;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nBottomSheetDialogProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,594:1\n154#2:595\n1#3:596\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogWrapper\n*L\n379#1:595\n*E\n"})
public final class OooO0O0 extends com.google.android.material.bottomsheet.OooO0O0 implements ViewRootForInspector {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public com.yalla.yalla.ui.view.OooO00o f30519OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f30520OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final View f30521OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final OooO0OO f30522OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final c0 f30523OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public final o0oOOo f30524OooOo0O;

    public static final class OooO00o extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@NotNull View view, @NotNull Outline result) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.view.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public /* synthetic */ class C0337OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BottomSheetBehaviorProperties.State.values().length];
            try {
                iArr2[BottomSheetBehaviorProperties.State.Expanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BottomSheetBehaviorProperties.State.Collapsed.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BottomSheetBehaviorProperties.State.HalfExpanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class OooO0OO extends BottomSheetBehavior.OooO0OO {
        public OooO0OO() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NotNull View bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(int i, @NotNull View bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i == 5) {
                OooO0O0.this.f30520OooOOo0.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(@NotNull Function0<Unit> onDismissRequest, @NotNull com.yalla.yalla.ui.view.OooO00o properties, @NotNull View composeView, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull UUID dialogId) {
        super(new ContextThemeWrapper(composeView.getContext(), properties.f30515OooO0Oo ? oO00Oo00.TransparentEdgeToEdgeEnabledBottomSheetTheme : oO00Oo00.TransparentEdgeToEdgeDisabledBottomSheetTheme));
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        this.f30520OooOOo0 = onDismissRequest;
        this.f30519OooOOo = properties;
        this.f30521OooOOoo = composeView;
        this.f30522OooOo0 = new OooO0OO();
        float fM3765constructorimpl = Dp.m3765constructorimpl(30);
        Window window = getWindow();
        this.f30524OooOo0O = window != null ? new o0oOOo(window.getDecorView(), window) : null;
        Window window2 = getWindow();
        if (window2 == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        window2.setBackgroundDrawableResource(R.color.transparent);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        c0 c0Var = new c0(context, window2);
        c0Var.setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Dialog:" + dialogId);
        c0Var.setClipChildren(false);
        c0Var.setElevation(density.mo324toPx0680j_4(fM3765constructorimpl));
        c0Var.setOutlineProvider(new OooO00o());
        this.f30523OooOo00 = c0Var;
        View decorView = window2.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(c0Var);
        ViewTreeLifecycleOwner.set(c0Var, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(c0Var, ViewTreeViewModelStoreOwner.get(composeView));
        o000OO00.OooO.OooO0O0(c0Var, o000OO00.OooO.OooO00o(composeView));
        OooOO0(this.f30520OooOOo0, this.f30519OooOOo, layoutDirection);
    }

    public static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof c0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    public final void OooOO0(@NotNull Function0<Unit> onDismissRequest, @NotNull com.yalla.yalla.ui.view.OooO00o properties, @NotNull LayoutDirection layoutDirection) {
        int i;
        Window window;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f30520OooOOo0 = onDismissRequest;
        this.f30519OooOOo = properties;
        SecureFlagPolicy secureFlagPolicy = properties.f30517OooO0o0;
        d0.OooO00o oooO00o = d0.f55510OooO0O0;
        View view = this.f30521OooOOoo;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = false;
        boolean z2 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Intrinsics.checkNotNullParameter(secureFlagPolicy, "<this>");
        int i2 = d0.OooOOO0.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        int i3 = 3;
        if (i2 == 1) {
            z2 = false;
        } else if (i2 == 2) {
            z2 = true;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setFlags(z2 ? 8192 : -8193, 8192);
        int i4 = C0337OooO0O0.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i4 == 1) {
            i = 0;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        this.f30523OooOo00.setLayoutDirection(i);
        setCanceledOnTouchOutside(properties.f30513OooO0O0);
        y1 y1Var = properties.f30516OooO0o;
        boolean z3 = y1Var.f55760OooO0O0;
        o0oOOo o0oooo = this.f30524OooOo0O;
        if (o0oooo != null) {
            o0oooo.f5453OooO00o.OooO0Oo(z3);
        }
        if (Build.VERSION.SDK_INT >= 29 && (window = getWindow()) != null) {
            window.setNavigationBarContrastEnforced(y1Var.f55761OooO0OO);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            boolean z4 = y1Var.f55760OooO0O0;
            long jM1680unboximpl = y1Var.f55759OooO00o;
            if (z4) {
                if (o0oooo != null && o0oooo.f5453OooO00o.OooO0O0()) {
                    z = true;
                }
                if (!z) {
                    jM1680unboximpl = y1Var.f55762OooO0Oo.invoke(Color.m1660boximpl(jM1680unboximpl)).m1680unboximpl();
                }
            }
            window3.setNavigationBarColor(ColorKt.m1724toArgb8_81llA(jM1680unboximpl));
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooO0oo = OooO0oo();
        BottomSheetBehaviorProperties bottomSheetBehaviorProperties = properties.f30518OooO0oO;
        int i5 = C0337OooO0O0.$EnumSwitchMapping$1[bottomSheetBehaviorProperties.f30353OooO00o.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 4;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 6;
            }
        }
        bottomSheetBehaviorOooO0oo.Oooo0O0(i3);
        OooO0oo().f16441OooOO0O = bottomSheetBehaviorProperties.f30354OooO0O0;
        OooO0oo().f16442OooOO0o = bottomSheetBehaviorProperties.f30355OooO0OO;
        OooO0oo().f16468Oooo0OO = bottomSheetBehaviorProperties.f30356OooO0Oo;
        OooO0oo().OooOooo(bottomSheetBehaviorProperties.f30358OooO0o0);
        OooO0oo().Oooo00O(bottomSheetBehaviorProperties.f30357OooO0o);
        OooO0oo().Oooo00o(bottomSheetBehaviorProperties.f30359OooO0oO);
        OooO0oo().Oooo0(bottomSheetBehaviorProperties.f30360OooO0oo);
        OooO0oo().Oooo000(bottomSheetBehaviorProperties.f30352OooO);
        OooO0oo().f16467Oooo0O0 = bottomSheetBehaviorProperties.f30361OooOO0;
        OooO0oo().f16443OooOOO = bottomSheetBehaviorProperties.f30362OooOO0O;
        boolean z5 = properties.f30514OooO0OO;
        this.f16519OooOO0 = z5;
        OooO0OO oooO0OO = this.f30522OooOo0;
        if (z5) {
            OooO0oo().OooOo00(oooO0OO);
        } else {
            OooO0oo().f16479OoooOOo.remove(oooO0OO);
        }
    }

    @Override // com.google.android.material.bottomsheet.OooO0O0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f30519OooOOo.f30514OooO0OO) {
            super.cancel();
        } else {
            this.f30520OooOOo0.invoke();
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public final AbstractComposeView getSubCompositionView() {
        return this.f30523OooOo00;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final /* synthetic */ View getViewRoot() {
        return o00Oo00.OooO0O0(this);
    }

    @Override // androidx.activity.OooOo00, android.app.Dialog
    @Deprecated(message = "Deprecated")
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        if (this.f30519OooOOo.f30512OooO00o) {
            cancel();
        }
    }
}
