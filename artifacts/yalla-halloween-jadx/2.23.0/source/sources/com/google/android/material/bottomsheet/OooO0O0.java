package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.oo0o0Oo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000O0Oo;
import androidx.core.view.o000OO00;
import androidx.core.view.o0oOOo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import o0O000Oo.OooO;
import o0O000Oo.OooO0o;
import o0O000Oo.OooOO0;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o0000Ooo;
import p272o0O000oo.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public class OooO0O0 extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public FrameLayout f16515OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f16516OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public FrameLayout f16517OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CoordinatorLayout f16518OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f16519OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f16520OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f16521OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public C0218OooO0O0 f16522OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f16523OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f16524OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final OooO00o f16525OooOOOo;

    public class OooO00o extends BottomSheetBehavior.OooO0OO {
        public OooO00o() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NonNull View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(int i, @NonNull View view) {
            if (i == 5) {
                OooO0O0.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0218OooO0O0 extends BottomSheetBehavior.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Boolean f16527OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final WindowInsetsCompat f16528OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Window f16529OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f16530OooO0Oo;

        public C0218OooO0O0(FrameLayout frameLayout, WindowInsetsCompat windowInsetsCompat) {
            ColorStateList colorStateListOooO0oO;
            this.f16528OooO0O0 = windowInsetsCompat;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.OooOoO(frameLayout).f16431OooO;
            if (materialShapeDrawable != null) {
                colorStateListOooO0oO = materialShapeDrawable.f17582OooO0Oo.f17607OooO0OO;
            } else {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                colorStateListOooO0oO = ViewCompat.OooOOO.OooO0oO(frameLayout);
            }
            if (colorStateListOooO0oO != null) {
                this.f16527OooO00o = Boolean.valueOf(OooOOO.OooO0Oo(colorStateListOooO0oO.getDefaultColor()));
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                this.f16527OooO00o = Boolean.valueOf(OooOOO.OooO0Oo(((ColorDrawable) frameLayout.getBackground()).getColor()));
            } else {
                this.f16527OooO00o = null;
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
        public final void OooO0OO(int i, @NonNull View view) {
            OooO0Oo(view);
        }

        public final void OooO0Oo(View view) {
            int top = view.getTop();
            WindowInsetsCompat windowInsetsCompat = this.f16528OooO0O0;
            if (top < windowInsetsCompat.OooO0o()) {
                Window window = this.f16529OooO0OO;
                if (window != null) {
                    Boolean bool = this.f16527OooO00o;
                    new o0oOOo(window.getDecorView(), window).OooO00o(bool == null ? this.f16530OooO0Oo : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), windowInsetsCompat.OooO0o() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f16529OooO0OO;
                if (window2 != null) {
                    new o0oOOo(window2.getDecorView(), window2).OooO00o(this.f16530OooO0Oo);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void OooO0o0(@Nullable Window window) {
            o0oOOo.OooO oooO0OO;
            if (this.f16529OooO0OO == window) {
                return;
            }
            this.f16529OooO0OO = window;
            if (window != null) {
                View decorView = window.getDecorView();
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    oooO0OO = new o0oOOo.OooO0o(window);
                } else {
                    oooO0OO = i >= 26 ? new o0oOOo.OooO0OO(decorView, window) : new o0oOOo.OooO0O0(decorView, window);
                }
                this.f16530OooO0Oo = oooO0OO.OooO0OO();
            }
        }
    }

    public OooO0O0(@NonNull ContextThemeWrapper contextThemeWrapper) {
        this(contextThemeWrapper, 0);
        this.f16524OooOOOO = getContext().getTheme().obtainStyledAttributes(new int[]{o00000.enableEdgeToEdge}).getBoolean(0, false);
    }

    public final FrameLayout OooO(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        OooO0oO();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16517OooO0oO.findViewById(o0000Ooo.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f16524OooOOOO) {
            FrameLayout frameLayout = this.f16515OooO;
            com.google.android.material.bottomsheet.OooO00o oooO00o = new com.google.android.material.bottomsheet.OooO00o(this);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO.OooOo0(frameLayout, oooO00o);
        }
        this.f16515OooO.removeAllViews();
        if (layoutParams == null) {
            this.f16515OooO.addView(view);
        } else {
            this.f16515OooO.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(o0000Ooo.touch_outside).setOnClickListener(new OooO0o(this));
        ViewCompat.OooOOOO(this.f16515OooO, new OooO(this));
        this.f16515OooO.setOnTouchListener(new OooOO0());
        return this.f16517OooO0oO;
    }

    public final void OooO0oO() {
        if (this.f16517OooO0oO == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), o0000O00.design_bottom_sheet_dialog, null);
            this.f16517OooO0oO = frameLayout;
            this.f16518OooO0oo = (CoordinatorLayout) frameLayout.findViewById(o0000Ooo.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f16517OooO0oO.findViewById(o0000Ooo.design_bottom_sheet);
            this.f16515OooO = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooOoO = BottomSheetBehavior.OooOoO(frameLayout2);
            this.f16516OooO0o = bottomSheetBehaviorOooOoO;
            bottomSheetBehaviorOooOoO.OooOo00(this.f16525OooOOOo);
            this.f16516OooO0o.Oooo00o(this.f16520OooOO0O);
        }
    }

    @NonNull
    public final BottomSheetBehavior<FrameLayout> OooO0oo() {
        if (this.f16516OooO0o == null) {
            OooO0oO();
        }
        return this.f16516OooO0o;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooO0oo = OooO0oo();
        if (!this.f16519OooOO0 || bottomSheetBehaviorOooO0oo.f16470Oooo0o0 == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorOooO0oo.Oooo0O0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f16524OooOOOO && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f16517OooO0oO;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f16518OooO0oo;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            o000OO00.OooO00o(window, !z);
            C0218OooO0O0 c0218OooO0O0 = this.f16522OooOOO;
            if (c0218OooO0O0 != null) {
                c0218OooO0O0.OooO0o0(window);
            }
        }
    }

    @Override // androidx.appcompat.app.oo0o0Oo, androidx.activity.OooOo00, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C0218OooO0O0 c0218OooO0O0 = this.f16522OooOOO;
        if (c0218OooO0O0 != null) {
            c0218OooO0O0.OooO0o0(null);
        }
    }

    @Override // androidx.activity.OooOo00, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16516OooO0o;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f16470Oooo0o0 != 5) {
            return;
        }
        bottomSheetBehavior.Oooo0O0(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f16520OooOO0O != z) {
            this.f16520OooOO0O = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f16516OooO0o;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.Oooo00o(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f16520OooOO0O) {
            this.f16520OooOO0O = true;
        }
        this.f16521OooOO0o = z;
        this.f16523OooOOO0 = true;
    }

    @Override // androidx.appcompat.app.oo0o0Oo, androidx.activity.OooOo00, android.app.Dialog
    public final void setContentView(@LayoutRes int i) {
        super.setContentView(OooO(null, i, null));
    }

    @Override // androidx.appcompat.app.oo0o0Oo, androidx.activity.OooOo00, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(OooO(view, 0, null));
    }

    @Override // androidx.appcompat.app.oo0o0Oo, androidx.activity.OooOo00, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(OooO(view, 0, layoutParams));
    }

    public OooO0O0(@NonNull Context context, @StyleRes int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(o00000.bottomSheetDialogTheme, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = o0000O0O.Theme_Design_Light_BottomSheetDialog;
            }
        }
        super(context, i);
        this.f16520OooOO0O = true;
        this.f16521OooOO0o = true;
        this.f16525OooOOOo = new OooO00o();
        OooO0o0().OooOo0(1);
        this.f16524OooOOOO = getContext().getTheme().obtainStyledAttributes(new int[]{o00000.enableEdgeToEdge}).getBoolean(0, false);
    }
}
