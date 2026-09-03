package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o000OO0O;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 extends ActionBar {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO0O f2423OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Window.Callback f2424OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f2425OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f2426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f2427OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f2428OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList<ActionBar.OooO00o> f2429OooO0oO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f2430OooO0oo = new OooO00o();

    public class OooO implements AppCompatDelegateImpl.OooO0O0 {
        public OooO() {
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00000O0 o00000o1 = o00000O0.this;
            Window.Callback callback = o00000o1.f2424OooO0O0;
            Menu menuOooOOo0 = o00000o1.OooOOo0();
            androidx.appcompat.view.menu.OooO oooO = menuOooOOo0 instanceof androidx.appcompat.view.menu.OooO ? (androidx.appcompat.view.menu.OooO) menuOooOOo0 : null;
            if (oooO != null) {
                oooO.OooOoO0();
            }
            try {
                menuOooOOo0.clear();
                if (!callback.onCreatePanelMenu(0, menuOooOOo0) || !callback.onPreparePanel(0, null, menuOooOOo0)) {
                    menuOooOOo0.clear();
                }
            } finally {
                if (oooO != null) {
                    oooO.OooOo();
                }
            }
        }
    }

    public class OooO0O0 implements Toolbar.OooOO0O {
        public OooO0O0() {
        }
    }

    public final class OooO0OO implements androidx.appcompat.view.menu.OooOOO.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f2434OooO0Oo;

        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO, boolean z) {
            if (this.f2434OooO0Oo) {
                return;
            }
            this.f2434OooO0Oo = true;
            o00000O0 o00000o1 = o00000O0.this;
            o00000o1.f2423OooO00o.OooOOO();
            o00000o1.f2424OooO0O0.onPanelClosed(108, oooO);
            this.f2434OooO0Oo = false;
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final boolean OooO0OO(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            o00000O0.this.f2424OooO0O0.onMenuOpened(108, oooO);
            return true;
        }
    }

    public final class OooO0o implements androidx.appcompat.view.menu.OooO.OooO00o {
        public OooO0o() {
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO oooO, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            o00000O0 o00000o1 = o00000O0.this;
            boolean zOooO0o0 = o00000o1.f2423OooO00o.OooO0o0();
            Window.Callback callback = o00000o1.f2424OooO0O0;
            if (zOooO0o0) {
                callback.onPanelClosed(108, oooO);
            } else if (callback.onPreparePanel(0, null, oooO)) {
                callback.onMenuOpened(108, oooO);
            }
        }
    }

    public o00000O0(@NonNull Toolbar toolbar, @Nullable CharSequence charSequence, @NonNull AppCompatDelegateImpl.OooOOO oooOOO) {
        OooO0O0 oooO0O0 = new OooO0O0();
        toolbar.getClass();
        o000OO0O o000oo0o2 = new o000OO0O(toolbar, false);
        this.f2423OooO00o = o000oo0o2;
        oooOOO.getClass();
        this.f2424OooO0O0 = oooOOO;
        o000oo0o2.f3305OooOO0o = oooOOO;
        toolbar.setOnMenuItemClickListener(oooO0O0);
        o000oo0o2.setWindowTitle(charSequence);
        this.f2425OooO0OO = new OooO();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO(int i, KeyEvent keyEvent) {
        Menu menuOooOOo0 = OooOOo0();
        if (menuOooOOo0 == null) {
            return false;
        }
        menuOooOOo0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuOooOOo0.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO00o() {
        return this.f2423OooO00o.OooO0OO();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO0O0() {
        o000OO0O o000oo0o2 = this.f2423OooO00o;
        if (!o000oo0o2.OooO0oo()) {
            return false;
        }
        o000oo0o2.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0OO(boolean z) {
        if (z == this.f2427OooO0o) {
            return;
        }
        this.f2427OooO0o = z;
        ArrayList<ActionBar.OooO00o> arrayList = this.f2429OooO0oO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooO00o();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int OooO0Oo() {
        return this.f2423OooO00o.f3296OooO0O0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO0o() {
        o000OO0O o000oo0o2 = this.f2423OooO00o;
        Toolbar toolbar = o000oo0o2.f3295OooO00o;
        OooO00o oooO00o = this.f2430OooO0oo;
        toolbar.removeCallbacks(oooO00o);
        Toolbar toolbar2 = o000oo0o2.f3295OooO00o;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOO0(toolbar2, oooO00o);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context OooO0o0() {
        return this.f2423OooO00o.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0oO() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0oo() {
        this.f2423OooO00o.f3295OooO00o.removeCallbacks(this.f2430OooO0oo);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooOO0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            OooOO0O();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooOO0O() {
        return this.f2423OooO00o.OooO0Oo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOO0o(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO0(boolean z) {
        o000OO0O o000oo0o2 = this.f2423OooO00o;
        o000oo0o2.OooO((o000oo0o2.f3296OooO0O0 & (-5)) | 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOOO(CharSequence charSequence) {
        this.f2423OooO00o.setWindowTitle(charSequence);
    }

    public final Menu OooOOo0() {
        boolean z = this.f2428OooO0o0;
        o000OO0O o000oo0o2 = this.f2423OooO00o;
        if (!z) {
            OooO0OO oooO0OO = new OooO0OO();
            OooO0o oooO0o = new OooO0o();
            Toolbar toolbar = o000oo0o2.f3295OooO00o;
            toolbar.f3167OoooO00 = oooO0OO;
            toolbar.f3166OoooO0 = oooO0o;
            ActionMenuView actionMenuView = toolbar.f3127OooO0Oo;
            if (actionMenuView != null) {
                actionMenuView.f2774OooOo = oooO0OO;
                actionMenuView.f2780OooOoO0 = oooO0o;
            }
            this.f2428OooO0o0 = true;
        }
        return o000oo0o2.f3295OooO00o.getMenu();
    }
}
