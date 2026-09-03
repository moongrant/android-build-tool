package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.o0O0O00;
import androidx.appcompat.widget.o0OOO0o;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p015OooOoO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class CascadingMenuPopup extends o0OoOo0 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final int f4621o00Oo0 = OooOo00.OooOO0O.abc_cascading_menu_item_layout;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f4622Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Context f4623Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f4624Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final boolean f4626OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f4627OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Handler f4628OoooO0O;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public View f4634OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public View f4635Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f4636Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f4637OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f4638OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f4639OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f4641Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f4642OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public OooOOO0.OooO00o f4643Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f4645o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public ViewTreeObserver f4646o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4647ooOO;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final List<androidx.appcompat.view.menu.OooO0o> f4625OoooO = new ArrayList();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final List<OooO0o> f4629OoooOO0 = new ArrayList();

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final OooO00o f4644o000oOoO = new OooO00o();

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final OooO0O0 f4630OoooOOO = new OooO0O0();

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final OooO0OO f4631OoooOOo = new OooO0OO();

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f4632OoooOo0 = 0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f4633OoooOoO = 0;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f4640Oooooo = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!CascadingMenuPopup.this.OooO0O0() || CascadingMenuPopup.this.f4629OoooOO0.size() <= 0 || ((OooO0o) CascadingMenuPopup.this.f4629OoooOO0.get(0)).f4655OooO00o.f5042Ooooooo) {
                return;
            }
            View view = CascadingMenuPopup.this.f4635Ooooo00;
            if (view == null || !view.isShown()) {
                CascadingMenuPopup.this.dismiss();
                return;
            }
            Iterator it = CascadingMenuPopup.this.f4629OoooOO0.iterator();
            while (it.hasNext()) {
                ((OooO0o) it.next()).f4655OooO00o.OooO00o();
            }
        }
    }

    public class OooO0O0 implements View.OnAttachStateChangeListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f4646o0OoOo0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f4646o0OoOo0 = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.f4646o0OoOo0.removeGlobalOnLayoutListener(cascadingMenuPopup.f4644o000oOoO);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class OooO0OO implements o0O0O00 {

        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ OooO0o f4652Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ MenuItem f4653Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.view.menu.OooO0o f4654Oooo0oo;

            public OooO00o(OooO0o oooO0o, MenuItem menuItem, androidx.appcompat.view.menu.OooO0o oooO0o2) {
                this.f4652Oooo0o = oooO0o;
                this.f4653Oooo0oO = menuItem;
                this.f4654Oooo0oo = oooO0o2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0o oooO0o = this.f4652Oooo0o;
                if (oooO0o != null) {
                    CascadingMenuPopup.this.f4645o00O0O = true;
                    oooO0o.f4656OooO0O0.OooO0Oo(false);
                    CascadingMenuPopup.this.f4645o00O0O = false;
                }
                if (this.f4653Oooo0oO.isEnabled() && this.f4653Oooo0oO.hasSubMenu()) {
                    this.f4654Oooo0oo.OooOOoo(this.f4653Oooo0oO, 4);
                }
            }
        }

        public OooO0OO() {
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
        @Override // androidx.appcompat.widget.o0O0O00
        public final void OooO0Oo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.f4628OoooO0O.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f4629OoooOO0.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (oooO0o == ((OooO0o) CascadingMenuPopup.this.f4629OoooOO0.get(i)).f4656OooO0O0) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            CascadingMenuPopup.this.f4628OoooO0O.postAtTime(new OooO00o(i2 < CascadingMenuPopup.this.f4629OoooOO0.size() ? (OooO0o) CascadingMenuPopup.this.f4629OoooOO0.get(i2) : null, menuItem, oooO0o), oooO0o, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.o0O0O00
        public final void OooO0oO(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.f4628OoooO0O.removeCallbacksAndMessages(oooO0o);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuPopupWindow f4655OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final androidx.appcompat.view.menu.OooO0o f4656OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f4657OooO0OO;

        public OooO0o(@NonNull MenuPopupWindow menuPopupWindow, @NonNull androidx.appcompat.view.menu.OooO0o oooO0o, int i) {
            this.f4655OooO00o = menuPopupWindow;
            this.f4656OooO0O0 = oooO0o;
            this.f4657OooO0OO = i;
        }
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i, @StyleRes int i2, boolean z) {
        this.f4623Oooo0oO = context;
        this.f4634OoooOoo = view;
        this.f4622Oooo = i;
        this.f4627OoooO00 = i2;
        this.f4626OoooO0 = z;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        this.f4636Ooooo0o = ViewCompat.OooO.OooO0Oo(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4624Oooo0oo = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(OooOo00.OooO0o.abc_config_prefDialogWidth));
        this.f4628OoooO0O = new Handler();
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO(Parcelable parcelable) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.OooO0o>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.OooO0o>] */
    @Override // p015OooOoO.o00Oo0
    public final void OooO00o() {
        if (OooO0O0()) {
            return;
        }
        Iterator it = this.f4625OoooO.iterator();
        while (it.hasNext()) {
            OooOo((androidx.appcompat.view.menu.OooO0o) it.next());
        }
        this.f4625OoooO.clear();
        View view = this.f4634OoooOoo;
        this.f4635Ooooo00 = view;
        if (view != null) {
            boolean z = this.f4646o0OoOo0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4646o0OoOo0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4644o000oOoO);
            }
            this.f4635Ooooo00.addOnAttachStateChangeListener(this.f4630OoooOOO);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    @Override // p015OooOoO.o00Oo0
    public final boolean OooO0O0() {
        return this.f4629OoooOO0.size() > 0 && ((OooO0o) this.f4629OoooOO0.get(0)).f4655OooO00o.OooO0O0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0OO(androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
        int size = this.f4629OoooOO0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (oooO0o == ((OooO0o) this.f4629OoooOO0.get(i)).f4656OooO0O0) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.f4629OoooOO0.size()) {
            ((OooO0o) this.f4629OoooOO0.get(i2)).f4656OooO0O0.OooO0Oo(false);
        }
        OooO0o oooO0o2 = (OooO0o) this.f4629OoooOO0.remove(i);
        oooO0o2.f4656OooO0O0.OooOo0O(this);
        if (this.f4645o00O0O) {
            MenuPopupWindow menuPopupWindow = oooO0o2.f4655OooO00o;
            Objects.requireNonNull(menuPopupWindow);
            if (Build.VERSION.SDK_INT >= 23) {
                MenuPopupWindow.OooO00o.OooO0O0(menuPopupWindow.f5044o0OoOo0, null);
            }
            oooO0o2.f4655OooO00o.f5044o0OoOo0.setAnimationStyle(0);
        }
        oooO0o2.f4655OooO00o.dismiss();
        int size2 = this.f4629OoooOO0.size();
        if (size2 > 0) {
            this.f4636Ooooo0o = ((OooO0o) this.f4629OoooOO0.get(size2 - 1)).f4657OooO0OO;
        } else {
            View view = this.f4634OoooOoo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            this.f4636Ooooo0o = ViewCompat.OooO.OooO0Oo(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((OooO0o) this.f4629OoooOO0.get(0)).f4656OooO0O0.OooO0Oo(false);
                return;
            }
            return;
        }
        dismiss();
        OooOOO0.OooO00o oooO00o = this.f4643Ooooooo;
        if (oooO00o != null) {
            oooO00o.OooO0OO(oooO0o, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4646o0OoOo0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4646o0OoOo0.removeGlobalOnLayoutListener(this.f4644o000oOoO);
            }
            this.f4646o0OoOo0 = null;
        }
        this.f4635Ooooo00.removeOnAttachStateChangeListener(this.f4630OoooOOO);
        this.f4647ooOO.onDismiss();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0Oo(boolean z) {
        Iterator it = this.f4629OoooOO0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((OooO0o) it.next()).f4655OooO00o.f5023Oooo0oo.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.OooO0OO) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0o(OooOOO0.OooO00o oooO00o) {
        this.f4643Ooooooo = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0o0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    @Override // p015OooOoO.o00Oo0
    public final ListView OooOO0() {
        if (this.f4629OoooOO0.isEmpty()) {
            return null;
        }
        ?? r0 = this.f4629OoooOO0;
        return ((OooO0o) r0.get(r0.size() - 1)).f4655OooO00o.f5023Oooo0oo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOO0O(OooOo00 oooOo00) {
        for (OooO0o oooO0o : this.f4629OoooOO0) {
            if (oooOo00 == oooO0o.f4656OooO0O0) {
                oooO0o.f4655OooO00o.f5023Oooo0oo.requestFocus();
                return true;
            }
        }
        if (!oooOo00.hasVisibleItems()) {
            return false;
        }
        OooOOO(oooOo00);
        OooOOO0.OooO00o oooO00o = this.f4643Ooooooo;
        if (oooO00o != null) {
            oooO00o.OooO0Oo(oooOo00);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final Parcelable OooOO0o() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.OooO0o>] */
    @Override // p015OooOoO.o0OoOo0
    public final void OooOOO(androidx.appcompat.view.menu.OooO0o oooO0o) {
        oooO0o.OooO0OO(this, this.f4623Oooo0oO);
        if (OooO0O0()) {
            OooOo(oooO0o);
        } else {
            this.f4625OoooO.add(oooO0o);
        }
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOOo(@NonNull View view) {
        if (this.f4634OoooOoo != view) {
            this.f4634OoooOoo = view;
            int i = this.f4632OoooOo0;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            this.f4633OoooOoO = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(view));
        }
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOo(int i) {
        if (this.f4632OoooOo0 != i) {
            this.f4632OoooOo0 = i;
            View view = this.f4634OoooOoo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            this.f4633OoooOoO = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(view));
        }
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOo0(boolean z) {
        this.f4640Oooooo = z;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOoo(int i) {
        this.f4637OooooO0 = true;
        this.f4639OooooOo = i;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2 A[PHI: r4
      0x01a2: PHI (r4v14 int) = (r4v5 int), (r4v15 int) binds: [B:81:0x019a, B:80:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c8  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    public final void OooOo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
        OooO0o oooO0o2;
        View childAt;
        Rect rect;
        Rect rect2;
        int i;
        int i2;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i3;
        int i4;
        int width;
        Method method;
        MenuItem item;
        androidx.appcompat.view.menu.OooO0OO oooO0OO;
        int headersCount;
        int firstVisiblePosition;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4623Oooo0oO);
        androidx.appcompat.view.menu.OooO0OO oooO0OO2 = new androidx.appcompat.view.menu.OooO0OO(oooO0o, layoutInflaterFrom, this.f4626OoooO0, f4621o00Oo0);
        if (!OooO0O0() && this.f4640Oooooo) {
            oooO0OO2.f4701Oooo0oo = true;
        } else if (OooO0O0()) {
            oooO0OO2.f4701Oooo0oo = o0OoOo0.OooOo0o(oooO0o);
        }
        int iOooOOOO = o0OoOo0.OooOOOO(oooO0OO2, this.f4623Oooo0oO, this.f4624Oooo0oo);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f4623Oooo0oO, this.f4622Oooo, this.f4627OoooO00);
        menuPopupWindow.f5051o00Ooo = this.f4631OoooOOo;
        menuPopupWindow.f5034Ooooo00 = this;
        menuPopupWindow.OooOo0(this);
        menuPopupWindow.f5033OoooOoo = this.f4634OoooOoo;
        menuPopupWindow.f5030OoooOOo = this.f4633OoooOoO;
        menuPopupWindow.OooOo00();
        menuPopupWindow.OooOOoo();
        menuPopupWindow.OooOOOo(oooO0OO2);
        menuPopupWindow.OooOOo(iOooOOOO);
        menuPopupWindow.f5030OoooOOo = this.f4633OoooOoO;
        if (this.f4629OoooOO0.size() > 0) {
            ?? r3 = this.f4629OoooOO0;
            oooO0o2 = (OooO0o) r3.get(r3.size() - 1);
            androidx.appcompat.view.menu.OooO0o oooO0o3 = oooO0o2.f4656OooO0O0;
            int size = oooO0o3.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    item = null;
                    break;
                }
                item = oooO0o3.getItem(i5);
                if (item.hasSubMenu() && oooO0o == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item != null) {
                o0OOO0o o0ooo0o2 = oooO0o2.f4655OooO00o.f5023Oooo0oo;
                ListAdapter adapter = o0ooo0o2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    oooO0OO = (androidx.appcompat.view.menu.OooO0OO) headerViewListAdapter.getWrappedAdapter();
                } else {
                    oooO0OO = (androidx.appcompat.view.menu.OooO0OO) adapter;
                    headersCount = 0;
                }
                int count = oooO0OO.getCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == oooO0OO.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - o0ooo0o2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < o0ooo0o2.getChildCount()) ? o0ooo0o2.getChildAt(firstVisiblePosition) : null;
            }
            if (childAt != null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    method = MenuPopupWindow.f5050o00o0O;
                    if (method != null) {
                        try {
                            method.invoke(menuPopupWindow.f5044o0OoOo0, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    MenuPopupWindow.OooO0O0.OooO00o(menuPopupWindow.f5044o0OoOo0, false);
                }
                i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    MenuPopupWindow.OooO00o.OooO00o(menuPopupWindow.f5044o0OoOo0, null);
                }
                ?? r10 = this.f4629OoooOO0;
                o0OOO0o o0ooo0o3 = ((OooO0o) r10.get(r10.size() - 1)).f4655OooO00o.f5023Oooo0oo;
                int[] iArr3 = new int[2];
                o0ooo0o3.getLocationOnScreen(iArr3);
                Rect rect3 = new Rect();
                this.f4635Ooooo00.getWindowVisibleDisplayFrame(rect3);
                i2 = (this.f4636Ooooo0o == 1 ? iArr3[0] - iOooOOOO >= 0 : (o0ooo0o3.getWidth() + iArr3[0]) + iOooOOOO > rect3.right) ? 0 : 1;
                if (i2 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f4636Ooooo0o = i2;
                if (i >= 26) {
                    menuPopupWindow.f5033OoooOoo = childAt;
                    i4 = 0;
                    i3 = 0;
                } else {
                    iArr = new int[2];
                    this.f4634OoooOoo.getLocationOnScreen(iArr);
                    iArr2 = new int[2];
                    childAt.getLocationOnScreen(iArr2);
                    if ((this.f4633OoooOoO & 7) == 5) {
                        iArr[0] = this.f4634OoooOoo.getWidth() + iArr[0];
                        iArr2[0] = childAt.getWidth() + iArr2[0];
                    }
                    i3 = iArr2[0] - iArr[0];
                    i4 = iArr2[1] - iArr[1];
                }
                if ((this.f4633OoooOoO & 5) == 5) {
                    if (z) {
                        width = i3 + iOooOOOO;
                    } else {
                        iOooOOOO = childAt.getWidth();
                        width = i3 - iOooOOOO;
                    }
                } else if (z) {
                    width = i3 + childAt.getWidth();
                } else {
                    width = i3 - iOooOOOO;
                }
                menuPopupWindow.f5025OoooO0 = width;
                menuPopupWindow.f5029OoooOOO = true;
                menuPopupWindow.f5043o000oOoO = true;
                menuPopupWindow.OooOO0o(i4);
            } else {
                if (this.f4637OooooO0) {
                    menuPopupWindow.f5025OoooO0 = this.f4639OooooOo;
                }
                if (this.f4638OooooOO) {
                    menuPopupWindow.OooOO0o(this.f4641Oooooo0);
                }
                rect = this.f297Oooo0o;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                menuPopupWindow.f5041OoooooO = rect2;
            }
            this.f4629OoooOO0.add(new OooO0o(menuPopupWindow, oooO0o, this.f4636Ooooo0o));
            menuPopupWindow.OooO00o();
            o0OOO0o o0ooo0o4 = menuPopupWindow.f5023Oooo0oo;
            o0ooo0o4.setOnKeyListener(this);
            if (oooO0o2 == null || !this.f4642OoooooO || oooO0o.f4718OooOOO0 == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(OooOo00.OooOO0O.abc_popup_menu_header_item_layout, (ViewGroup) o0ooo0o4, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(oooO0o.f4718OooOOO0);
            o0ooo0o4.addHeaderView(frameLayout, null, false);
            menuPopupWindow.OooO00o();
            return;
        }
        oooO0o2 = null;
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                method = MenuPopupWindow.f5050o00o0O;
                if (method != null) {
                    method.invoke(menuPopupWindow.f5044o0OoOo0, Boolean.FALSE);
                }
            } else {
                MenuPopupWindow.OooO0O0.OooO00o(menuPopupWindow.f5044o0OoOo0, false);
            }
            i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                MenuPopupWindow.OooO00o.OooO00o(menuPopupWindow.f5044o0OoOo0, null);
            }
            ?? r11 = this.f4629OoooOO0;
            o0OOO0o o0ooo0o5 = ((OooO0o) r11.get(r11.size() - 1)).f4655OooO00o.f5023Oooo0oo;
            int[] iArr4 = new int[2];
            o0ooo0o5.getLocationOnScreen(iArr4);
            Rect rect4 = new Rect();
            this.f4635Ooooo00.getWindowVisibleDisplayFrame(rect4);
            if (this.f4636Ooooo0o == 1) {
            }
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f4636Ooooo0o = i2;
            if (i >= 26) {
                menuPopupWindow.f5033OoooOoo = childAt;
                i4 = 0;
                i3 = 0;
            } else {
                iArr = new int[2];
                this.f4634OoooOoo.getLocationOnScreen(iArr);
                iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                if ((this.f4633OoooOoO & 7) == 5) {
                    iArr[0] = this.f4634OoooOoo.getWidth() + iArr[0];
                    iArr2[0] = childAt.getWidth() + iArr2[0];
                }
                i3 = iArr2[0] - iArr[0];
                i4 = iArr2[1] - iArr[1];
            }
            if ((this.f4633OoooOoO & 5) == 5) {
                if (z) {
                    width = i3 + iOooOOOO;
                } else {
                    iOooOOOO = childAt.getWidth();
                    width = i3 - iOooOOOO;
                }
            } else if (z) {
                width = i3 + childAt.getWidth();
            } else {
                width = i3 - iOooOOOO;
            }
            menuPopupWindow.f5025OoooO0 = width;
            menuPopupWindow.f5029OoooOOO = true;
            menuPopupWindow.f5043o000oOoO = true;
            menuPopupWindow.OooOO0o(i4);
        } else {
            if (this.f4637OooooO0) {
                menuPopupWindow.f5025OoooO0 = this.f4639OooooOo;
            }
            if (this.f4638OooooOO) {
                menuPopupWindow.OooOO0o(this.f4641Oooooo0);
            }
            rect = this.f297Oooo0o;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            menuPopupWindow.f5041OoooooO = rect2;
        }
        this.f4629OoooOO0.add(new OooO0o(menuPopupWindow, oooO0o, this.f4636Ooooo0o));
        menuPopupWindow.OooO00o();
        o0OOO0o o0ooo0o6 = menuPopupWindow.f5023Oooo0oo;
        o0ooo0o6.setOnKeyListener(this);
        if (oooO0o2 == null) {
        }
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOo0(boolean z) {
        this.f4642OoooooO = z;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOo00(PopupWindow.OnDismissListener onDismissListener) {
        this.f4647ooOO = onDismissListener;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOo0O(int i) {
        this.f4638OooooOO = true;
        this.f4641Oooooo0 = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    @Override // p015OooOoO.o00Oo0
    public final void dismiss() {
        int size = this.f4629OoooOO0.size();
        if (size <= 0) {
            return;
        }
        OooO0o[] oooO0oArr = (OooO0o[]) this.f4629OoooOO0.toArray(new OooO0o[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            OooO0o oooO0o = oooO0oArr[size];
            if (oooO0o.f4655OooO00o.OooO0O0()) {
                oooO0o.f4655OooO00o.dismiss();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$OooO0o>] */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        OooO0o oooO0o;
        int size = this.f4629OoooOO0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                oooO0o = null;
                break;
            }
            oooO0o = (OooO0o) this.f4629OoooOO0.get(i);
            if (!oooO0o.f4655OooO00o.OooO0O0()) {
                break;
            } else {
                i++;
            }
        }
        if (oooO0o != null) {
            oooO0o.f4656OooO0O0.OooO0Oo(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
