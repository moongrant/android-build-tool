package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f7865OooO00o;

    public static class OooO {
        public boolean OooO00o() {
            return false;
        }

        public void OooO0O0(boolean z) {
        }

        public void OooO0OO(boolean z) {
        }
    }

    @RequiresApi(20)
    public static class OooO00o extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Window f7866OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final View f7867OooO0O0;

        public OooO00o(@NonNull Window window, @NonNull View view) {
            this.f7866OooO00o = window;
            this.f7867OooO0O0 = view;
        }
    }

    @RequiresApi(23)
    public static class OooO0O0 extends OooO00o {
        public OooO0O0(@NonNull Window window, @Nullable View view) {
            super(window, view);
        }

        @Override // androidx.core.view.OooOO0.OooO
        public final boolean OooO00o() {
            return (this.f7866OooO00o.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.OooOO0.OooO
        public final void OooO0OO(boolean z) {
            if (!z) {
                View decorView = this.f7866OooO00o.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            } else {
                this.f7866OooO00o.clearFlags(67108864);
                this.f7866OooO00o.addFlags(Integer.MIN_VALUE);
                View decorView2 = this.f7866OooO00o.getDecorView();
                decorView2.setSystemUiVisibility(8192 | decorView2.getSystemUiVisibility());
            }
        }
    }

    @RequiresApi(26)
    public static class OooO0OO extends OooO0O0 {
        public OooO0OO(@NonNull Window window, @Nullable View view) {
            super(window, view);
        }

        @Override // androidx.core.view.OooOO0.OooO
        public final void OooO0O0(boolean z) {
            if (!z) {
                View decorView = this.f7866OooO00o.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
            } else {
                this.f7866OooO00o.clearFlags(134217728);
                this.f7866OooO00o.addFlags(Integer.MIN_VALUE);
                View decorView2 = this.f7866OooO00o.getDecorView();
                decorView2.setSystemUiVisibility(16 | decorView2.getSystemUiVisibility());
            }
        }
    }

    @RequiresApi(30)
    public static class OooO0o extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowInsetsController f7868OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Window f7869OooO0O0;

        public OooO0o(@NonNull Window window) {
            this.f7868OooO00o = window.getInsetsController();
            this.f7869OooO0O0 = window;
        }

        @Override // androidx.core.view.OooOO0.OooO
        public final boolean OooO00o() {
            return (this.f7868OooO00o.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.OooOO0.OooO
        public final void OooO0O0(boolean z) {
            if (z) {
                Window window = this.f7869OooO0O0;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                this.f7868OooO00o.setSystemBarsAppearance(16, 16);
                return;
            }
            Window window2 = this.f7869OooO0O0;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            this.f7868OooO00o.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.OooOO0.OooO
        public final void OooO0OO(boolean z) {
            if (z) {
                Window window = this.f7869OooO0O0;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
                }
                this.f7868OooO00o.setSystemBarsAppearance(8, 8);
                return;
            }
            Window window2 = this.f7869OooO0O0;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            this.f7868OooO00o.setSystemBarsAppearance(0, 8);
        }
    }

    public OooOO0(@NonNull Window window, @NonNull View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f7865OooO00o = new OooO0o(window);
            return;
        }
        if (i >= 26) {
            this.f7865OooO00o = new OooO0OO(window, view);
        } else if (i >= 23) {
            this.f7865OooO00o = new OooO0O0(window, view);
        } else {
            this.f7865OooO00o = new OooO00o(window, view);
        }
    }
}
