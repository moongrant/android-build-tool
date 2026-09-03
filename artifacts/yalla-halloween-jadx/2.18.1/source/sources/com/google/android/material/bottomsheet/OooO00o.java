package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.Oooo000;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.uc.crashsdk.export.LogType;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000O0O0.oo000o;
import p072o000O0o0.o0000OO0;
import p337o0OO0o0.OooOOO0;
import p337o0OO0o0.OooOOOO;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends Oooo000 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public FrameLayout f16661OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public FrameLayout f16662OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f16663OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public CoordinatorLayout f16664OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f16665OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f16666OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public BottomSheetBehavior.OooO0OO f16667OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f16668OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NonNull
    public OooO f16669OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f16670o000oOoO;

    public class OooO extends BottomSheetBehavior.OooO0OO {
        public OooO() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NonNull View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(@NonNull View view, int i) {
            if (i == 5) {
                OooO00o.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0105OooO00o implements oo000o {
        public C0105OooO00o() {
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat) {
            OooO00o oooO00o = OooO00o.this;
            BottomSheetBehavior.OooO0OO oooO0OO = oooO00o.f16667OoooOOo;
            if (oooO0OO != null) {
                oooO00o.f16663OoooO00.OooOoo(oooO0OO);
            }
            OooO00o oooO00o2 = OooO00o.this;
            oooO00o2.f16667OoooOOo = new OooOO0(oooO00o2.f16661OoooO, windowInsetsCompat);
            OooO00o oooO00o3 = OooO00o.this;
            oooO00o3.f16663OoooO00.OooOo00(oooO00o3.f16667OoooOOo);
            return windowInsetsCompat;
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f16665OoooOO0 && oooO00o.isShowing()) {
                OooO00o oooO00o2 = OooO00o.this;
                if (!oooO00o2.f16666OoooOOO) {
                    TypedArray typedArrayObtainStyledAttributes = oooO00o2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                    oooO00o2.f16670o000oOoO = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    oooO00o2.f16666OoooOOO = true;
                }
                if (oooO00o2.f16670o000oOoO) {
                    OooO00o.this.cancel();
                }
            }
        }
    }

    public class OooO0OO extends androidx.core.view.OooO00o {
        public OooO0OO() {
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            if (!OooO00o.this.f16665OoooOO0) {
                o0000oo1.Oooo0OO(false);
            } else {
                o0000oo1.OooO00o(1048576);
                o0000oo1.Oooo0OO(true);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean OooO0oO(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                OooO00o oooO00o = OooO00o.this;
                if (oooO00o.f16665OoooOO0) {
                    oooO00o.cancel();
                    return true;
                }
            }
            return super.OooO0oO(view, i, bundle);
        }
    }

    public class OooO0o implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public static class OooOO0 extends BottomSheetBehavior.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f16675OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f16676OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WindowInsetsCompat f16677OooO0OO;

        public OooOO0(View view, WindowInsetsCompat windowInsetsCompat) {
            ColorStateList colorStateListOooO0oO;
            this.f16677OooO0OO = windowInsetsCompat;
            boolean z = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.f16676OooO0O0 = z;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.OooOoO0(view).f16602OooO0oo;
            if (materialShapeDrawable != null) {
                colorStateListOooO0oO = materialShapeDrawable.f17510Oooo0o.f17536OooO0OO;
            } else {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                colorStateListOooO0oO = ViewCompat.OooOOO.OooO0oO(view);
            }
            if (colorStateListOooO0oO != null) {
                this.f16675OooO00o = o0O0000O.OooO0Oo(colorStateListOooO0oO.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f16675OooO00o = o0O0000O.OooO0Oo(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f16675OooO00o = z;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO00o(@NonNull View view) {
            OooO0Oo(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NonNull View view) {
            OooO0Oo(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(@NonNull View view, int i) {
            OooO0Oo(view);
        }

        public final void OooO0Oo(View view) {
            if (view.getTop() < this.f16677OooO0OO.OooO()) {
                OooO00o.OooOO0O(view, this.f16675OooO00o);
                view.setPadding(view.getPaddingLeft(), this.f16677OooO0OO.OooO() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                OooO00o.OooOO0O(view, this.f16676OooO0O0);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    public OooO00o(@NonNull Context context, @StyleRes int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(p337o0OO0o0.OooO0o.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : p337o0OO0o0.Oooo000.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.f16665OoooOO0 = true;
        this.f16670o000oOoO = true;
        this.f16669OoooOoO = new OooO();
        OooO();
        this.f16668OoooOo0 = getContext().getTheme().obtainStyledAttributes(new int[]{p337o0OO0o0.OooO0o.enableEdgeToEdge}).getBoolean(0, false);
    }

    public static void OooOO0O(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    public final FrameLayout OooOO0() {
        if (this.f16662OoooO0 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), OooOOOO.design_bottom_sheet_dialog, null);
            this.f16662OoooO0 = frameLayout;
            this.f16664OoooO0O = (CoordinatorLayout) frameLayout.findViewById(OooOOO0.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f16662OoooO0.findViewById(OooOOO0.design_bottom_sheet);
            this.f16661OoooO = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooOoO0 = BottomSheetBehavior.OooOoO0(frameLayout2);
            this.f16663OoooO00 = bottomSheetBehaviorOooOoO0;
            bottomSheetBehaviorOooOoO0.OooOo00(this.f16669OoooOoO);
            this.f16663OoooO00.OooOooo(this.f16665OoooOO0);
        }
        return this.f16662OoooO0;
    }

    public final View OooOO0o(int i, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        OooOO0();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16662OoooO0.findViewById(OooOOO0.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f16668OoooOo0) {
            FrameLayout frameLayout = this.f16661OoooO;
            C0105OooO00o c0105OooO00o = new C0105OooO00o();
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO.OooOo0(frameLayout, c0105OooO00o);
        }
        this.f16661OoooO.removeAllViews();
        if (layoutParams == null) {
            this.f16661OoooO.addView(view);
        } else {
            this.f16661OoooO.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(OooOOO0.touch_outside).setOnClickListener(new OooO0O0());
        ViewCompat.OooOo0o(this.f16661OoooO, new OooO0OO());
        this.f16661OoooO.setOnTouchListener(new OooO0o());
        return this.f16662OoooO0;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f16663OoooO00 == null) {
            OooOO0();
        }
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f16668OoooOo0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f16662OoooO0;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f16664OoooO0O;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(LogType.UNEXP_OTHER);
            }
        }
    }

    @Override // androidx.appcompat.app.Oooo000, androidx.activity.OooOOO0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.OooOOO0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16663OoooO00;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f16630Oooo0O0 != 5) {
            return;
        }
        bottomSheetBehavior.Oooo00O(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f16665OoooOO0 != z) {
            this.f16665OoooOO0 = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16663OoooO00;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.OooOooo(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f16665OoooOO0) {
            this.f16665OoooOO0 = true;
        }
        this.f16670o000oOoO = z;
        this.f16666OoooOOO = true;
    }

    @Override // androidx.appcompat.app.Oooo000, androidx.activity.OooOOO0, android.app.Dialog
    public final void setContentView(@LayoutRes int i) {
        super.setContentView(OooOO0o(i, null, null));
    }

    @Override // androidx.appcompat.app.Oooo000, androidx.activity.OooOOO0, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(OooOO0o(0, view, null));
    }

    @Override // androidx.appcompat.app.Oooo000, androidx.activity.OooOOO0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(OooOO0o(0, view, layoutParams));
    }
}
