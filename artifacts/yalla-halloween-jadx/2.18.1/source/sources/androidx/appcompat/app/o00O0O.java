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
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o0000O;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends ActionBar {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0O0 f4541OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O f4542OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Window.Callback f4543OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f4544OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f4545OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f4546OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f4547OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ArrayList<ActionBar.OooO00o> f4548OooO0oO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f4549OooO0oo = new OooO00o();

    public class OooO implements AppCompatDelegateImpl.OooO0O0 {
        public OooO() {
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00O0O o00o0o2 = o00O0O.this;
            Menu menuOooOOo0 = o00o0o2.OooOOo0();
            androidx.appcompat.view.menu.OooO0o oooO0o = menuOooOOo0 instanceof androidx.appcompat.view.menu.OooO0o ? (androidx.appcompat.view.menu.OooO0o) menuOooOOo0 : null;
            if (oooO0o != null) {
                oooO0o.OooOooO();
            }
            try {
                menuOooOOo0.clear();
                if (!o00o0o2.f4543OooO0O0.onCreatePanelMenu(0, menuOooOOo0) || !o00o0o2.f4543OooO0O0.onPreparePanel(0, null, menuOooOOo0)) {
                    menuOooOOo0.clear();
                }
            } finally {
                if (oooO0o != null) {
                    oooO0o.OooOoo();
                }
            }
        }
    }

    public class OooO0O0 implements Toolbar.OooO {
        public OooO0O0() {
        }
    }

    public final class OooO0OO implements androidx.appcompat.view.menu.OooOOO0.OooO00o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f4553Oooo0o;

        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final void OooO0OO(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
            ActionMenuPresenter actionMenuPresenter;
            if (this.f4553Oooo0o) {
                return;
            }
            this.f4553Oooo0o = true;
            ActionMenuView actionMenuView = o00O0O.this.f4542OooO00o.f5348OooO00o.f5252Oooo0o;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.f4880OooooOo) != null) {
                actionMenuPresenter.OooO00o();
            }
            o00O0O.this.f4543OooO0O0.onPanelClosed(108, oooO0o);
            this.f4553Oooo0o = false;
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final boolean OooO0Oo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
            o00O0O.this.f4543OooO0O0.onMenuOpened(108, oooO0o);
            return true;
        }
    }

    public final class OooO0o implements androidx.appcompat.view.menu.OooO0o.OooO00o {
        public OooO0o() {
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
            if (o00O0O.this.f4542OooO00o.f5348OooO00o.OooOOo0()) {
                o00O0O.this.f4543OooO0O0.onPanelClosed(108, oooO0o);
            } else if (o00O0O.this.f4543OooO0O0.onPreparePanel(0, null, oooO0o)) {
                o00O0O.this.f4543OooO0O0.onMenuOpened(108, oooO0o);
            }
        }
    }

    public o00O0O(@NonNull Toolbar toolbar, @Nullable CharSequence charSequence, @NonNull Window.Callback callback) {
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f4541OooO = oooO0O0;
        Objects.requireNonNull(toolbar);
        o0000O o0000o2 = new o0000O(toolbar, false);
        this.f4542OooO00o = o0000o2;
        Objects.requireNonNull(callback);
        this.f4543OooO0O0 = callback;
        o0000o2.f5358OooOO0o = callback;
        toolbar.setOnMenuItemClickListener(oooO0O0);
        o0000o2.setWindowTitle(charSequence);
        this.f4544OooO0OO = new OooO();
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
        return this.f4542OooO00o.OooO0o();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO0O0() {
        Toolbar.OooO0o oooO0o = this.f4542OooO00o.f5348OooO00o.f5286o0Oo0oo;
        if (!((oooO0o == null || oooO0o.f5299Oooo0oO == null) ? false : true)) {
            return false;
        }
        androidx.appcompat.view.menu.OooOO0 oooOO1 = oooO0o == null ? null : oooO0o.f5299Oooo0oO;
        if (oooOO1 != null) {
            oooOO1.collapseActionView();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0OO(boolean z) {
        if (z == this.f4546OooO0o) {
            return;
        }
        this.f4546OooO0o = z;
        int size = this.f4548OooO0oO.size();
        for (int i = 0; i < size; i++) {
            this.f4548OooO0oO.get(i).OooO00o();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int OooO0Oo() {
        return this.f4542OooO00o.f5349OooO0O0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO0o() {
        this.f4542OooO00o.f5348OooO00o.removeCallbacks(this.f4549OooO0oo);
        Toolbar toolbar = this.f4542OooO00o.f5348OooO00o;
        OooO00o oooO00o = this.f4549OooO0oo;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOO0(toolbar, oooO00o);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context OooO0o0() {
        return this.f4542OooO00o.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0oO() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0oo() {
        this.f4542OooO00o.f5348OooO00o.removeCallbacks(this.f4549OooO0oo);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooOO0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f4542OooO00o.f5348OooO00o.OooOo();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooOO0O() {
        return this.f4542OooO00o.f5348OooO00o.OooOo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOO0o(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO0(boolean z) {
        o0000O o0000o2 = this.f4542OooO00o;
        o0000o2.OooOO0O((o0000o2.f5349OooO0O0 & (-5)) | 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOOO(CharSequence charSequence) {
        this.f4542OooO00o.setWindowTitle(charSequence);
    }

    public final Menu OooOOo0() {
        if (!this.f4547OooO0o0) {
            o0000O o0000o2 = this.f4542OooO00o;
            OooO0OO oooO0OO = new OooO0OO();
            OooO0o oooO0o = new OooO0o();
            Toolbar toolbar = o0000o2.f5348OooO00o;
            toolbar.f5284o0OO00O = oooO0OO;
            toolbar.f5292oo0o0Oo = oooO0o;
            ActionMenuView actionMenuView = toolbar.f5252Oooo0o;
            if (actionMenuView != null) {
                actionMenuView.f4882Oooooo0 = oooO0OO;
                actionMenuView.f4881Oooooo = oooO0o;
            }
            this.f4547OooO0o0 = true;
        }
        return this.f4542OooO00o.f5348OooO00o.getMenu();
    }
}
