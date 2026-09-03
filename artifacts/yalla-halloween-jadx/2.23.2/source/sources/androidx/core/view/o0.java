package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f5420OooO00o;

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
        public final Window f5421OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final o0000O00 f5422OooO0O0;

        public OooO00o(@NonNull Window window, @NonNull o0000O00 o0000o00) {
            this.f5421OooO00o = window;
            this.f5422OooO0O0 = o0000o00;
        }

        public final void OooO(int i) {
            View decorView = this.f5421OooO00o.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.o0.OooO
        public final void OooO00o(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        OooO0oo(4);
                    } else if (i2 == 2) {
                        OooO0oo(2);
                    } else if (i2 == 8) {
                        this.f5422OooO0O0.f5433OooO00o.OooO00o();
                    }
                }
            }
        }

        @Override // androidx.core.view.o0.OooO
        public final void OooO0o() {
            OooO(2048);
            OooO0oo(4096);
        }

        @Override // androidx.core.view.o0.OooO
        public final void OooO0oO(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        OooO(4);
                        this.f5421OooO00o.clearFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                    } else if (i2 == 2) {
                        OooO(2);
                    } else if (i2 == 8) {
                        this.f5422OooO0O0.f5433OooO00o.OooO0O0();
                    }
                }
            }
        }

        public final void OooO0oo(int i) {
            View decorView = this.f5421OooO00o.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }
    }

    @RequiresApi(23)
    public static class OooO0O0 extends OooO00o {
        @Override // androidx.core.view.o0.OooO
        public final boolean OooO0OO() {
            return (this.f5421OooO00o.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.o0.OooO
        public final void OooO0o0(boolean z) {
            if (!z) {
                OooO(8192);
                return;
            }
            Window window = this.f5421OooO00o;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            OooO0oo(8192);
        }
    }

    @RequiresApi(26)
    public static class OooO0OO extends OooO0O0 {
        @Override // androidx.core.view.o0.OooO
        public final boolean OooO0O0() {
            return (this.f5421OooO00o.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.o0.OooO
        public final void OooO0Oo(boolean z) {
            if (!z) {
                OooO(16);
                return;
            }
            Window window = this.f5421OooO00o;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            OooO0oo(16);
        }
    }

    @RequiresApi(30)
    @Deprecated
    public o0(@NonNull WindowInsetsController windowInsetsController) {
        this.f5420OooO00o = new OooO0o(windowInsetsController, new o0000O00(windowInsetsController));
    }

    public final void OooO00o(boolean z) {
        this.f5420OooO00o.OooO0o0(z);
    }

    @RequiresApi(30)
    public static class OooO0o extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowInsetsController f5423OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0000O00 f5424OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Window f5425OooO0OO;

        public OooO0o(@NonNull Window window, @NonNull o0000O00 o0000o00) {
            this(window.getInsetsController(), o0000o00);
            this.f5425OooO0OO = window;
        }

        @Override // androidx.core.view.o0.OooO
        public final void OooO00o(int i) {
            if ((i & 8) != 0) {
                this.f5424OooO0O0.f5433OooO00o.OooO00o();
            }
            this.f5423OooO00o.hide(i & (-9));
        }

        @Override // androidx.core.view.o0.OooO
        public final boolean OooO0O0() {
            return (this.f5423OooO00o.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.o0.OooO
        public final boolean OooO0OO() {
            return (this.f5423OooO00o.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.o0.OooO
        public final void OooO0Oo(boolean z) {
            WindowInsetsController windowInsetsController = this.f5423OooO00o;
            Window window = this.f5425OooO0OO;
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

        @Override // androidx.core.view.o0.OooO
        public final void OooO0o() {
            this.f5423OooO00o.setSystemBarsBehavior(2);
        }

        @Override // androidx.core.view.o0.OooO
        public final void OooO0o0(boolean z) {
            WindowInsetsController windowInsetsController = this.f5423OooO00o;
            Window window = this.f5425OooO0OO;
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

        @Override // androidx.core.view.o0.OooO
        public final void OooO0oO(int i) {
            if ((i & 8) != 0) {
                this.f5424OooO0O0.f5433OooO00o.OooO0O0();
            }
            this.f5423OooO00o.show(i & (-9));
        }

        public OooO0o(@NonNull WindowInsetsController windowInsetsController, @NonNull o0000O00 o0000o00) {
            new p190o00o0O.OooOo();
            this.f5423OooO00o = windowInsetsController;
            this.f5424OooO0O0 = o0000o00;
        }
    }

    public o0(@NonNull View view, @NonNull Window window) {
        o0000O00 o0000o00 = new o0000O00(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f5420OooO00o = new OooO0o(window, o0000o00);
        } else if (i >= 26) {
            this.f5420OooO00o = new OooO0OO(window, o0000o00);
        } else {
            this.f5420OooO00o = new OooO0O0(window, o0000o00);
        }
    }
}
