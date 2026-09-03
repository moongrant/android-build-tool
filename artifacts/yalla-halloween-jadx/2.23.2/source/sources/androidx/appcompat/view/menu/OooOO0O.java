package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import p013OooOo0o.o00Oo0;
import p053o00000oo.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOO0O implements o0000.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f2625OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2626OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f2627OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f2628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CharSequence f2629OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f2630OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Intent f2631OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public char f2632OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public char f2633OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Drawable f2635OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO f2636OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooOo f2638OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2639OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public CharSequence f2640OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public CharSequence f2641OooOOo0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f2648OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f2649OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public androidx.core.view.OooO0O0 f2650OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2652OooOoo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f2624OooO = 4096;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f2634OooOO0O = 4096;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f2637OooOOO0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ColorStateList f2642OooOOoo = null;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public PorterDuff.Mode f2645OooOo00 = null;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f2644OooOo0 = false;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f2646OooOo0O = false;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f2647OooOo0o = false;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f2643OooOo = 16;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f2651OooOoo = false;

    public class OooO00o implements androidx.core.view.OooO0O0.InterfaceC0124OooO0O0 {
        public OooO00o() {
        }
    }

    public OooOO0O(OooO oooO, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2636OooOOO = oooO;
        this.f2625OooO00o = i2;
        this.f2626OooO0O0 = i;
        this.f2627OooO0OO = i3;
        this.f2628OooO0Oo = i4;
        this.f2630OooO0o0 = charSequence;
        this.f2649OooOoO0 = i5;
    }

    public static void OooO0OO(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // o0000.OooO0O0
    public final androidx.core.view.OooO0O0 OooO00o() {
        return this.f2650OooOoOO;
    }

    @Override // o0000.OooO0O0
    @NonNull
    public final o0000.OooO0O0 OooO0O0(androidx.core.view.OooO0O0 oooO0O0) {
        androidx.core.view.OooO0O0 oooO0O1 = this.f2650OooOoOO;
        if (oooO0O1 != null) {
            oooO0O1.f5337OooO0O0 = null;
            oooO0O1.f5336OooO00o = null;
        }
        this.f2648OooOoO = null;
        this.f2650OooOoOO = oooO0O0;
        this.f2636OooOOO.OooOOOo(true);
        androidx.core.view.OooO0O0 oooO0O2 = this.f2650OooOoOO;
        if (oooO0O2 != null) {
            oooO0O2.OooO0oo(new OooO00o());
        }
        return this;
    }

    public final Drawable OooO0Oo(Drawable drawable) {
        if (drawable != null && this.f2647OooOo0o && (this.f2644OooOo0 || this.f2646OooOo0O)) {
            drawable = drawable.mutate();
            if (this.f2644OooOo0) {
                o00Ooo.OooO0O0.OooO0oo(drawable, this.f2642OooOOoo);
            }
            if (this.f2646OooOo0O) {
                o00Ooo.OooO0O0.OooO(drawable, this.f2645OooOo00);
            }
            this.f2647OooOo0o = false;
        }
        return drawable;
    }

    public final void OooO0o(boolean z) {
        this.f2643OooOo = (z ? 4 : 0) | (this.f2643OooOo & (-5));
    }

    public final boolean OooO0o0() {
        androidx.core.view.OooO0O0 oooO0O0;
        if ((this.f2649OooOoO0 & 8) == 0) {
            return false;
        }
        if (this.f2648OooOoO == null && (oooO0O0 = this.f2650OooOoOO) != null) {
            this.f2648OooOoO = oooO0O0.OooO0Oo(this);
        }
        return this.f2648OooOoO != null;
    }

    public final void OooO0oO(boolean z) {
        if (z) {
            this.f2643OooOo |= 32;
        } else {
            this.f2643OooOo &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2649OooOoO0 & 8) == 0) {
            return false;
        }
        if (this.f2648OooOoO == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2652OooOoo0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2636OooOOO.OooO0Oo(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!OooO0o0()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2652OooOoo0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2636OooOOO.OooO0o(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2648OooOoO;
        if (view != null) {
            return view;
        }
        androidx.core.view.OooO0O0 oooO0O0 = this.f2650OooOoOO;
        if (oooO0O0 == null) {
            return null;
        }
        View viewOooO0Oo = oooO0O0.OooO0Oo(this);
        this.f2648OooOoO = viewOooO0Oo;
        return viewOooO0Oo;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2634OooOO0O;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2633OooOO0;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2641OooOOo0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2626OooO0O0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2635OooOO0o;
        if (drawable != null) {
            return OooO0Oo(drawable);
        }
        int i = this.f2637OooOOO0;
        if (i == 0) {
            return null;
        }
        Drawable drawableOooO00o = o00Oo0.OooO00o(this.f2636OooOOO.f2570OooO00o, i);
        this.f2637OooOOO0 = 0;
        this.f2635OooOO0o = drawableOooO00o;
        return OooO0Oo(drawableOooO00o);
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2642OooOOoo;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2645OooOo00;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2631OooO0oO;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f2625OooO00o;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2624OooO;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2632OooO0oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2627OooO0OO;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2638OooOOOO;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f2630OooO0o0;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2629OooO0o;
        return charSequence != null ? charSequence : this.f2630OooO0o0;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2640OooOOo;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2638OooOOOO != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2651OooOoo;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2643OooOo & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2643OooOo & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2643OooOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        androidx.core.view.OooO0O0 oooO0O0 = this.f2650OooOoOO;
        if (oooO0O0 == null || !oooO0O0.OooO0oO()) {
            return (this.f2643OooOo & 8) == 0;
        }
        return (this.f2643OooOo & 8) == 0 && this.f2650OooOoOO.OooO0O0();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(View view) {
        int i;
        this.f2648OooOoO = view;
        this.f2650OooOoOO = null;
        if (view != null && view.getId() == -1 && (i = this.f2625OooO00o) > 0) {
            view.setId(i);
        }
        OooO oooO = this.f2636OooOOO;
        oooO.f2579OooOO0O = true;
        oooO.OooOOOo(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f2633OooOO0 == c) {
            return this;
        }
        this.f2633OooOO0 = Character.toLowerCase(c);
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f2643OooOo;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f2643OooOo = i2;
        if (i != i2) {
            this.f2636OooOOO.OooOOOo(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f2643OooOo;
        int i2 = i & 4;
        OooO oooO = this.f2636OooOOO;
        if (i2 != 0) {
            oooO.getClass();
            ArrayList<OooOO0O> arrayList = oooO.f2574OooO0o;
            int size = arrayList.size();
            oooO.OooOoO0();
            for (int i3 = 0; i3 < size; i3++) {
                OooOO0O oooOO0O = arrayList.get(i3);
                if (oooOO0O.f2626OooO0O0 == this.f2626OooO0O0) {
                    if (((oooOO0O.f2643OooOo & 4) != 0) && oooOO0O.isCheckable()) {
                        boolean z2 = oooOO0O == this;
                        int i4 = oooOO0O.f2643OooOo;
                        int i5 = (z2 ? 2 : 0) | (i4 & (-3));
                        oooOO0O.f2643OooOo = i5;
                        if (i4 != i5) {
                            oooOO0O.f2636OooOOO.OooOOOo(false);
                        }
                    }
                }
            }
            oooO.OooOo();
        } else {
            int i6 = (z ? 2 : 0) | (i & (-3));
            this.f2643OooOo = i6;
            if (i != i6) {
                oooO.OooOOOo(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f2643OooOo |= 16;
        } else {
            this.f2643OooOo &= -17;
        }
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2637OooOOO0 = 0;
        this.f2635OooOO0o = drawable;
        this.f2647OooOo0o = true;
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f2642OooOOoo = colorStateList;
        this.f2644OooOo0 = true;
        this.f2647OooOo0o = true;
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2645OooOo00 = mode;
        this.f2646OooOo0O = true;
        this.f2647OooOo0o = true;
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2631OooO0oO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f2632OooO0oo == c) {
            return this;
        }
        this.f2632OooO0oo = c;
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2652OooOoo0 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2639OooOOOo = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f2632OooO0oo = c;
        this.f2633OooOO0 = Character.toLowerCase(c2);
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2649OooOoO0 = i;
        OooO oooO = this.f2636OooOOO;
        oooO.f2579OooOO0O = true;
        oooO.OooOOOo(true);
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2630OooO0o0 = charSequence;
        this.f2636OooOOO.OooOOOo(false);
        OooOo oooOo = this.f2638OooOOOO;
        if (oooOo != null) {
            oooOo.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2629OooO0o = charSequence;
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f2643OooOo;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f2643OooOo = i2;
        if (i != i2) {
            OooO oooO = this.f2636OooOOO;
            oooO.f2577OooO0oo = true;
            oooO.OooOOOo(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2630OooO0o0;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final o0000.OooO0O0 setContentDescription(CharSequence charSequence) {
        this.f2641OooOOo0 = charSequence;
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final o0000.OooO0O0 setTooltipText(CharSequence charSequence) {
        this.f2640OooOOo = charSequence;
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2633OooOO0 == c && this.f2634OooOO0O == i) {
            return this;
        }
        this.f2633OooOO0 = Character.toLowerCase(c);
        this.f2634OooOO0O = KeyEvent.normalizeMetaState(i);
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f2632OooO0oo == c && this.f2624OooO == i) {
            return this;
        }
        this.f2632OooO0oo = c;
        this.f2624OooO = KeyEvent.normalizeMetaState(i);
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2632OooO0oo = c;
        this.f2624OooO = KeyEvent.normalizeMetaState(i);
        this.f2633OooOO0 = Character.toLowerCase(c2);
        this.f2634OooOO0O = KeyEvent.normalizeMetaState(i2);
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f2635OooOO0o = null;
        this.f2637OooOOO0 = i;
        this.f2647OooOo0o = true;
        this.f2636OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f2636OooOOO.f2570OooO00o.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(int i) {
        int i2;
        OooO oooO = this.f2636OooOOO;
        Context context = oooO.f2570OooO00o;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f2648OooOoO = viewInflate;
        this.f2650OooOoOO = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f2625OooO00o) > 0) {
            viewInflate.setId(i2);
        }
        oooO.f2579OooOO0O = true;
        oooO.OooOOOo(true);
        return this;
    }
}
