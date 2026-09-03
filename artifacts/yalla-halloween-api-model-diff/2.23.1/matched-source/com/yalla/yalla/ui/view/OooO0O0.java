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
import androidx.core.view.o0;
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
import p546o0o0Ooo0.o0O00OOO;
import p546o0o0Ooo0.o0oO0Ooo;
import p546o0o0Ooo0.oO0Ooooo;
import p565o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nBottomSheetDialogProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,594:1\n154#2:595\n1#3:596\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogWrapper\n*L\n379#1:595\n*E\n"})
public final class OooO0O0 extends com.google.android.material.bottomsheet.OooO0O0 implements ViewRootForInspector {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public com.yalla.yalla.ui.view.OooO00o f29984OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f29985OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final View f29986OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final OooO0OO f29987OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final o0O00OOO f29988OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public final o0 f29989OooOo0O;

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
    public /* synthetic */ class C0336OooO0O0 {
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
                OooO0O0.this.f29985OooOOo0.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(@NotNull Function0<Unit> onDismissRequest, @NotNull com.yalla.yalla.ui.view.OooO00o properties, @NotNull View composeView, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull UUID dialogId) {
        super(new ContextThemeWrapper(composeView.getContext(), properties.f29980OooO0Oo ? o000000.TransparentEdgeToEdgeEnabledBottomSheetTheme : o000000.TransparentEdgeToEdgeDisabledBottomSheetTheme));
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        this.f29985OooOOo0 = onDismissRequest;
        this.f29984OooOOo = properties;
        this.f29986OooOOoo = composeView;
        this.f29987OooOo0 = new OooO0OO();
        float fM3775constructorimpl = Dp.m3775constructorimpl(30);
        Window window = getWindow();
        this.f29989OooOo0O = window != null ? new o0(window.getDecorView(), window) : null;
        Window window2 = getWindow();
        if (window2 == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        window2.setBackgroundDrawableResource(R.color.transparent);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        o0O00OOO o0o00ooo2 = new o0O00OOO(context, window2);
        o0o00ooo2.setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Dialog:" + dialogId);
        o0o00ooo2.setClipChildren(false);
        o0o00ooo2.setElevation(density.mo326toPx0680j_4(fM3775constructorimpl));
        o0o00ooo2.setOutlineProvider(new OooO00o());
        this.f29988OooOo00 = o0o00ooo2;
        View decorView = window2.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(o0o00ooo2);
        ViewTreeLifecycleOwner.set(o0o00ooo2, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(o0o00ooo2, ViewTreeViewModelStoreOwner.get(composeView));
        o00O0000.OooO.OooO0O0(o0o00ooo2, o00O0000.OooO.OooO00o(composeView));
        OooOO0(this.f29985OooOOo0, this.f29984OooOOo, layoutDirection);
    }

    public static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof o0O00OOO) {
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
        this.f29985OooOOo0 = onDismissRequest;
        this.f29984OooOOo = properties;
        SecureFlagPolicy secureFlagPolicy = properties.f29982OooO0o0;
        o0oO0Ooo.OooO00o oooO00o = o0oO0Ooo.f55579OooO0O0;
        View view = this.f29986OooOOoo;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = false;
        boolean z2 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Intrinsics.checkNotNullParameter(secureFlagPolicy, "<this>");
        int i2 = o0oO0Ooo.OooOOO0.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
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
        int i4 = C0336OooO0O0.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i4 == 1) {
            i = 0;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        this.f29988OooOo00.setLayoutDirection(i);
        setCanceledOnTouchOutside(properties.f29978OooO0O0);
        oO0Ooooo oo0ooooo = properties.f29981OooO0o;
        boolean z3 = oo0ooooo.f55760OooO0O0;
        o0 o0Var = this.f29989OooOo0O;
        if (o0Var != null) {
            o0Var.f5423OooO00o.OooO0Oo(z3);
        }
        if (Build.VERSION.SDK_INT >= 29 && (window = getWindow()) != null) {
            window.setNavigationBarContrastEnforced(oo0ooooo.f55761OooO0OO);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            boolean z4 = oo0ooooo.f55760OooO0O0;
            long jM1691unboximpl = oo0ooooo.f55759OooO00o;
            if (z4) {
                if (o0Var != null && o0Var.f5423OooO00o.OooO0O0()) {
                    z = true;
                }
                if (!z) {
                    jM1691unboximpl = oo0ooooo.f55762OooO0Oo.invoke(Color.m1671boximpl(jM1691unboximpl)).m1691unboximpl();
                }
            }
            window3.setNavigationBarColor(ColorKt.m1735toArgb8_81llA(jM1691unboximpl));
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooO0oo = OooO0oo();
        BottomSheetBehaviorProperties bottomSheetBehaviorProperties = properties.f29983OooO0oO;
        int i5 = C0336OooO0O0.$EnumSwitchMapping$1[bottomSheetBehaviorProperties.f29817OooO00o.ordinal()];
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
        OooO0oo().f15975OooOO0O = bottomSheetBehaviorProperties.f29818OooO0O0;
        OooO0oo().f15976OooOO0o = bottomSheetBehaviorProperties.f29819OooO0OO;
        OooO0oo().f16002Oooo0OO = bottomSheetBehaviorProperties.f29820OooO0Oo;
        OooO0oo().OooOooo(bottomSheetBehaviorProperties.f29822OooO0o0);
        OooO0oo().Oooo00O(bottomSheetBehaviorProperties.f29821OooO0o);
        OooO0oo().Oooo00o(bottomSheetBehaviorProperties.f29823OooO0oO);
        OooO0oo().Oooo0(bottomSheetBehaviorProperties.f29824OooO0oo);
        OooO0oo().Oooo000(bottomSheetBehaviorProperties.f29816OooO);
        OooO0oo().f16001Oooo0O0 = bottomSheetBehaviorProperties.f29825OooOO0;
        OooO0oo().f15977OooOOO = bottomSheetBehaviorProperties.f29826OooOO0O;
        boolean z5 = properties.f29979OooO0OO;
        this.f16053OooOO0 = z5;
        OooO0OO oooO0OO = this.f29987OooOo0;
        if (z5) {
            OooO0oo().OooOo00(oooO0OO);
        } else {
            OooO0oo().f16013OoooOOo.remove(oooO0OO);
        }
    }

    @Override // com.google.android.material.bottomsheet.OooO0O0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f29984OooOOo.f29979OooO0OO) {
            super.cancel();
        } else {
            this.f29985OooOOo0.invoke();
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public final AbstractComposeView getSubCompositionView() {
        return this.f29988OooOo00;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final /* synthetic */ View getViewRoot() {
        return o00Oo00.OooO0O0(this);
    }

    @Override // androidx.activity.OooOo, android.app.Dialog
    @Deprecated(message = "Deprecated")
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        if (this.f29984OooOOo.f29977OooO00o) {
            cancel();
        }
    }
}
