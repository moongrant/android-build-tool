package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f5433OooO00o;

    @RequiresApi(20)
    public static class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final View f5434OooO00o;

        public OooO00o(@Nullable View view) {
            this.f5434OooO00o = view;
        }

        public void OooO00o() {
            View view = this.f5434OooO00o;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void OooO0O0() {
            final View viewFindViewById;
            View view = this.f5434OooO00o;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.o0000
                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = viewFindViewById;
                    ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                }
            });
        }
    }

    public static class OooO0OO {
    }

    public o0000O00(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5433OooO00o = new OooO0O0(view);
        } else {
            this.f5433OooO00o = new OooO00o(view);
        }
    }

    @RequiresApi(30)
    public static class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final View f5435OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final WindowInsetsController f5436OooO0OO;

        public OooO0O0(@NonNull View view) {
            super(view);
            this.f5435OooO0O0 = view;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.o0000O0O] */
        @Override // androidx.core.view.o0000O00.OooO00o
        public final void OooO00o() {
            View view = this.f5435OooO0O0;
            WindowInsetsController windowInsetsController = this.f5436OooO0OO;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.OooO00o();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.o0000O0O
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r4);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r4);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.o0000O00.OooO00o
        public final void OooO0O0() {
            View view = this.f5435OooO0O0;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f5436OooO0OO;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            } else {
                super.OooO0O0();
            }
        }

        public OooO0O0(@Nullable WindowInsetsController windowInsetsController) {
            super(null);
            this.f5436OooO0OO = windowInsetsController;
        }
    }

    @RequiresApi(30)
    @Deprecated
    public o0000O00(@NonNull WindowInsetsController windowInsetsController) {
        this.f5433OooO00o = new OooO0O0(windowInsetsController);
    }
}
