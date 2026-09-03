package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f5453OooO00o;

    public static class OooO {
        public void OooO00o(int i) {
            throw null;
        }

        public boolean OooO0O0() {
            return false;
        }

        public boolean OooO0OO() {
            throw null;
        }

        public void OooO0Oo(boolean z) {
        }

        public void OooO0o() {
            throw null;
        }

        public void OooO0o0(boolean z) {
            throw null;
        }

        public void OooO0oO(int i) {
            throw null;
        }
    }

    @RequiresApi(20)
    public static class OooO00o extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Window f5454OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final View f5455OooO0O0;

        public OooO00o(@NonNull View view, @NonNull Window window) {
            this.f5454OooO00o = window;
            this.f5455OooO0O0 = view;
        }

        public final void OooO(int i) {
            View decorView = this.f5454OooO00o.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO00o(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        OooO0oo(4);
                    } else if (i2 == 2) {
                        OooO0oo(2);
                    } else if (i2 == 8) {
                        Window window = this.f5454OooO00o;
                        ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                    }
                }
            }
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO0o() {
            OooO(2048);
            OooO0oo(4096);
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO0oO(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    Window window = this.f5454OooO00o;
                    if (i2 == 1) {
                        OooO(4);
                        window.clearFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                    } else if (i2 == 2) {
                        OooO(2);
                    } else if (i2 == 8) {
                        final View viewFindViewById = this.f5455OooO0O0;
                        if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                            viewFindViewById.requestFocus();
                        } else {
                            viewFindViewById = window.getCurrentFocus();
                        }
                        if (viewFindViewById == null) {
                            viewFindViewById = window.findViewById(R.id.content);
                        }
                        if (viewFindViewById != null && viewFindViewById.hasWindowFocus()) {
                            final int i3 = 0;
                            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.oo00oO
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i4 = i3;
                                    Object obj = viewFindViewById;
                                    switch (i4) {
                                        case 0:
                                            View view = (View) obj;
                                            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                                            return;
                                        default:
                                            o000O0O0.o00Ooo this$0 = (o000O0O0.o00Ooo) obj;
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            this$0.getClass();
                                            CollectionsKt.emptyList();
                                            throw null;
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }

        public final void OooO0oo(int i) {
            View decorView = this.f5454OooO00o.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }
    }

    @RequiresApi(23)
    public static class OooO0O0 extends OooO00o {
        @Override // androidx.core.view.o0oOOo.OooO
        public final boolean OooO0OO() {
            return (this.f5454OooO00o.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO0o0(boolean z) {
            if (!z) {
                OooO(8192);
                return;
            }
            Window window = this.f5454OooO00o;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            OooO0oo(8192);
        }
    }

    @RequiresApi(26)
    public static class OooO0OO extends OooO0O0 {
        @Override // androidx.core.view.o0oOOo.OooO
        public final boolean OooO0O0() {
            return (this.f5454OooO00o.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO0Oo(boolean z) {
            if (!z) {
                OooO(16);
                return;
            }
            Window window = this.f5454OooO00o;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            OooO0oo(16);
        }
    }

    @RequiresApi(30)
    @Deprecated
    public o0oOOo(@NonNull WindowInsetsController windowInsetsController) {
        this.f5453OooO00o = new OooO0o(windowInsetsController);
    }

    public final void OooO00o(boolean z) {
        this.f5453OooO00o.OooO0o0(z);
    }

    @RequiresApi(30)
    public static class OooO0o extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowInsetsController f5456OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Window f5457OooO0O0;

        public OooO0o(@NonNull Window window) {
            this(window.getInsetsController());
            this.f5457OooO0O0 = window;
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO00o(int i) {
            this.f5456OooO00o.hide(i);
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final boolean OooO0O0() {
            return (this.f5456OooO00o.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final boolean OooO0OO() {
            return (this.f5456OooO00o.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO0Oo(boolean z) {
            WindowInsetsController windowInsetsController = this.f5456OooO00o;
            Window window = this.f5457OooO0O0;
            if (z) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO0o() {
            this.f5456OooO00o.setSystemBarsBehavior(2);
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO0o0(boolean z) {
            WindowInsetsController windowInsetsController = this.f5456OooO00o;
            Window window = this.f5457OooO0O0;
            if (z) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.o0oOOo.OooO
        public final void OooO0oO(int i) {
            Window window = this.f5457OooO0O0;
            if (window != null && (i & 8) != 0 && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f5456OooO00o.show(i);
        }

        public OooO0o(@NonNull WindowInsetsController windowInsetsController) {
            new p188o00o0O.Oooo000();
            this.f5456OooO00o = windowInsetsController;
        }
    }

    public o0oOOo(@NonNull View view, @NonNull Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f5453OooO00o = new OooO0o(window);
        } else if (i >= 26) {
            this.f5453OooO00o = new OooO0OO(view, window);
        } else {
            this.f5453OooO00o = new OooO0O0(view, window);
        }
    }
}
