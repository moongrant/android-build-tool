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
import java.util.Objects;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOO0 implements o000O0O.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f4730OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f4731OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f4732OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f4733OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CharSequence f4734OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f4735OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Intent f4736OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public char f4737OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public char f4738OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Drawable f4740OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO0o f4741OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooOo00 f4743OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4744OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public CharSequence f4745OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public CharSequence f4746OooOOo0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f4753OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f4754OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o000O0O0.OooO00o f4755OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4757OooOoo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f4729OooO = 4096;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f4739OooOO0O = 4096;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f4742OooOOO0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ColorStateList f4747OooOOoo = null;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public PorterDuff.Mode f4750OooOo00 = null;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f4749OooOo0 = false;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f4751OooOo0O = false;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f4752OooOo0o = false;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f4748OooOo = 16;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f4756OooOoo = false;

    public class OooO00o implements o000O0O0.OooO00o.OooO0O0 {
        public OooO00o() {
        }
    }

    public OooOO0(OooO0o oooO0o, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f4741OooOOO = oooO0o;
        this.f4730OooO00o = i2;
        this.f4731OooO0O0 = i;
        this.f4732OooO0OO = i3;
        this.f4733OooO0Oo = i4;
        this.f4735OooO0o0 = charSequence;
        this.f4754OooOoO0 = i5;
    }

    public static void OooO0OO(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @NonNull
    public final o000O0O.OooO0O0 OooO(View view) {
        int i;
        this.f4753OooOoO = view;
        this.f4755OooOoOO = null;
        if (view != null && view.getId() == -1 && (i = this.f4730OooO00o) > 0) {
            view.setId(i);
        }
        this.f4741OooOOO.OooOOo0();
        return this;
    }

    @Override // o000O0O.OooO0O0
    @NonNull
    public final o000O0O.OooO0O0 OooO00o(o000O0O0.OooO00o oooO00o) {
        o000O0O0.OooO00o oooO00o2 = this.f4755OooOoOO;
        if (oooO00o2 != null) {
            oooO00o2.f28102OooO0O0 = null;
            oooO00o2.f28101OooO00o = null;
        }
        this.f4753OooOoO = null;
        this.f4755OooOoOO = oooO00o;
        this.f4741OooOOO.OooOOo(true);
        o000O0O0.OooO00o oooO00o3 = this.f4755OooOoOO;
        if (oooO00o3 != null) {
            oooO00o3.OooO0oo(new OooO00o());
        }
        return this;
    }

    @Override // o000O0O.OooO0O0
    public final o000O0O0.OooO00o OooO0O0() {
        return this.f4755OooOoOO;
    }

    public final Drawable OooO0Oo(Drawable drawable) {
        if (drawable != null && this.f4752OooOo0o && (this.f4749OooOo0 || this.f4751OooOo0O)) {
            drawable = o0OOO0o.OooO0o0(drawable).mutate();
            if (this.f4749OooOo0) {
                o0OOO0o.OooO0O0.OooO0oo(drawable, this.f4747OooOOoo);
            }
            if (this.f4751OooOo0O) {
                o0OOO0o.OooO0O0.OooO(drawable, this.f4750OooOo00);
            }
            this.f4752OooOo0o = false;
        }
        return drawable;
    }

    public final boolean OooO0o() {
        o000O0O0.OooO00o oooO00o;
        if ((this.f4754OooOoO0 & 8) == 0) {
            return false;
        }
        if (this.f4753OooOoO == null && (oooO00o = this.f4755OooOoOO) != null) {
            this.f4753OooOoO = oooO00o.OooO0Oo(this);
        }
        return this.f4753OooOoO != null;
    }

    public final char OooO0o0() {
        return this.f4741OooOOO.OooOOOO() ? this.f4738OooOO0 : this.f4737OooO0oo;
    }

    public final boolean OooO0oO() {
        return (this.f4748OooOo & 32) == 32;
    }

    public final boolean OooO0oo() {
        return (this.f4748OooOo & 4) != 0;
    }

    public final void OooOO0(boolean z) {
        int i = this.f4748OooOo;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f4748OooOo = i2;
        if (i != i2) {
            this.f4741OooOOO.OooOOo(false);
        }
    }

    public final void OooOO0O(boolean z) {
        this.f4748OooOo = (z ? 4 : 0) | (this.f4748OooOo & (-5));
    }

    public final void OooOO0o(boolean z) {
        if (z) {
            this.f4748OooOo |= 32;
        } else {
            this.f4748OooOo &= -33;
        }
    }

    public final void OooOOO0(OooOo00 oooOo00) {
        this.f4743OooOOOO = oooOo00;
        oooOo00.setHeaderTitle(this.f4735OooO0o0);
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4754OooOoO0 & 8) == 0) {
            return false;
        }
        if (this.f4753OooOoO == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4757OooOoo0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4741OooOOO.OooO0o0(this);
        }
        return false;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final boolean expandActionView() {
        if (!OooO0o()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4757OooOoo0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4741OooOOO.OooO0oO(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final View getActionView() {
        View view = this.f4753OooOoO;
        if (view != null) {
            return view;
        }
        o000O0O0.OooO00o oooO00o = this.f4755OooOoOO;
        if (oooO00o == null) {
            return null;
        }
        View viewOooO0Oo = oooO00o.OooO0Oo(this);
        this.f4753OooOoO = viewOooO0Oo;
        return viewOooO0Oo;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4739OooOO0O;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4738OooOO0;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4746OooOOo0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4731OooO0O0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4740OooOO0o;
        if (drawable != null) {
            return OooO0Oo(drawable);
        }
        int i = this.f4742OooOOO0;
        if (i == 0) {
            return null;
        }
        Drawable drawableOooO0O0 = p012OooOo0.OooOO0O.OooO0O0(this.f4741OooOOO.f4706OooO00o, i);
        this.f4742OooOOO0 = 0;
        this.f4740OooOO0o = drawableOooO0O0;
        return OooO0Oo(drawableOooO0O0);
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4747OooOOoo;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4750OooOo00;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4736OooO0oO;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f4730OooO00o;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4729OooO;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4737OooO0oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4732OooO0OO;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4743OooOOOO;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f4735OooO0o0;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4734OooO0o;
        return charSequence != null ? charSequence : this.f4735OooO0o0;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4745OooOOo;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4743OooOOOO != null;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4756OooOoo;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4748OooOo & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4748OooOo & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4748OooOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o000O0O0.OooO00o oooO00o = this.f4755OooOoOO;
        if (oooO00o == null || !oooO00o.OooO0oO()) {
            return (this.f4748OooOo & 8) == 0;
        }
        return (this.f4748OooOo & 8) == 0 && this.f4755OooOoOO.OooO0O0();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        OooO(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f4738OooOO0 == c) {
            return this;
        }
        this.f4738OooOO0 = Character.toLowerCase(c);
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f4748OooOo;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f4748OooOo = i2;
        if (i != i2) {
            this.f4741OooOOO.OooOOo(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.f4748OooOo & 4) != 0) {
            OooO0o oooO0o = this.f4741OooOOO;
            Objects.requireNonNull(oooO0o);
            int groupId = getGroupId();
            int size = oooO0o.f4710OooO0o.size();
            oooO0o.OooOooO();
            for (int i = 0; i < size; i++) {
                OooOO0 oooOO1 = oooO0o.f4710OooO0o.get(i);
                if (oooOO1.f4731OooO0O0 == groupId && oooOO1.OooO0oo() && oooOO1.isCheckable()) {
                    oooOO1.OooOO0(oooOO1 == this);
                }
            }
            oooO0o.OooOoo();
        } else {
            OooOO0(z);
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
            this.f4748OooOo |= 16;
        } else {
            this.f4748OooOo &= -17;
        }
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4742OooOOO0 = 0;
        this.f4740OooOO0o = drawable;
        this.f4752OooOo0o = true;
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f4747OooOOoo = colorStateList;
        this.f4749OooOo0 = true;
        this.f4752OooOo0o = true;
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4750OooOo00 = mode;
        this.f4751OooOo0O = true;
        this.f4752OooOo0o = true;
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4736OooO0oO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f4737OooO0oo == c) {
            return this;
        }
        this.f4737OooO0oo = c;
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4757OooOoo0 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4744OooOOOo = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f4737OooO0oo = c;
        this.f4738OooOO0 = Character.toLowerCase(c2);
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4754OooOoO0 = i;
        this.f4741OooOOO.OooOOo0();
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4735OooO0o0 = charSequence;
        this.f4741OooOOO.OooOOo(false);
        OooOo00 oooOo00 = this.f4743OooOOOO;
        if (oooOo00 != null) {
            oooOo00.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4734OooO0o = charSequence;
        this.f4741OooOOO.OooOOo(false);
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
        int i = this.f4748OooOo;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f4748OooOo = i2;
        if (i != i2) {
            OooO0o oooO0o = this.f4741OooOOO;
            oooO0o.f4713OooO0oo = true;
            oooO0o.OooOOo(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4735OooO0o0;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(int i) {
        Context context = this.f4741OooOOO.f4706OooO00o;
        OooO(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final o000O0O.OooO0O0 setContentDescription(CharSequence charSequence) {
        this.f4746OooOOo0 = charSequence;
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final o000O0O.OooO0O0 setTooltipText(CharSequence charSequence) {
        this.f4745OooOOo = charSequence;
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f4738OooOO0 == c && this.f4739OooOO0O == i) {
            return this;
        }
        this.f4738OooOO0 = Character.toLowerCase(c);
        this.f4739OooOO0O = KeyEvent.normalizeMetaState(i);
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f4737OooO0oo == c && this.f4729OooO == i) {
            return this;
        }
        this.f4737OooO0oo = c;
        this.f4729OooO = KeyEvent.normalizeMetaState(i);
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4737OooO0oo = c;
        this.f4729OooO = KeyEvent.normalizeMetaState(i);
        this.f4738OooOO0 = Character.toLowerCase(c2);
        this.f4739OooOO0O = KeyEvent.normalizeMetaState(i2);
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f4740OooOO0o = null;
        this.f4742OooOOO0 = i;
        this.f4752OooOo0o = true;
        this.f4741OooOOO.OooOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f4741OooOOO.f4706OooO00o.getString(i));
        return this;
    }
}
