package p015OooOoO;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.OooOO0;
import java.lang.reflect.Method;
import p016OooOoO0.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000oOoO extends Oooo0 implements MenuItem {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0O.OooO0O0 f285OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Method f286OooO0o0;

    public class OooO implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f287OooO00o;

        public OooO(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f287OooO00o = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f287OooO00o.onMenuItemClick(o000oOoO.this.OooO0OO(menuItem));
        }
    }

    public class OooO00o extends o000O0O0.OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ActionProvider f289OooO0OO;

        public OooO00o(Context context, ActionProvider actionProvider) {
            this.f289OooO0OO = actionProvider;
        }

        @Override // o000O0O0.OooO00o
        public final boolean OooO00o() {
            return this.f289OooO0OO.hasSubMenu();
        }

        @Override // o000O0O0.OooO00o
        public final View OooO0OO() {
            return this.f289OooO0OO.onCreateActionView();
        }

        @Override // o000O0O0.OooO00o
        public final void OooO0o(SubMenu subMenu) {
            this.f289OooO0OO.onPrepareSubMenu(o000oOoO.this.OooO0Oo(subMenu));
        }

        @Override // o000O0O0.OooO00o
        public final boolean OooO0o0() {
            return this.f289OooO0OO.onPerformDefaultAction();
        }
    }

    @RequiresApi(16)
    public class OooO0O0 extends OooO00o implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o000O0O0.OooO00o.OooO0O0 f291OooO0o0;

        public OooO0O0(o000oOoO o000oooo2, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // o000O0O0.OooO00o
        public final boolean OooO0O0() {
            return this.f289OooO0OO.isVisible();
        }

        @Override // o000O0O0.OooO00o
        public final View OooO0Oo(MenuItem menuItem) {
            return this.f289OooO0OO.onCreateActionView(menuItem);
        }

        @Override // o000O0O0.OooO00o
        public final boolean OooO0oO() {
            return this.f289OooO0OO.overridesItemVisibility();
        }

        @Override // o000O0O0.OooO00o
        public final void OooO0oo(o000O0O0.OooO00o.OooO0O0 oooO0O0) {
            this.f291OooO0o0 = oooO0O0;
            this.f289OooO0OO.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z) {
            o000O0O0.OooO00o.OooO0O0 oooO0O0 = this.f291OooO0o0;
            if (oooO0O0 != null) {
                androidx.appcompat.view.menu.OooO0o oooO0o = OooOO0.this.f4741OooOOO;
                oooO0o.f4713OooO0oo = true;
                oooO0o.OooOOo(true);
            }
        }
    }

    public static class OooO0OO extends FrameLayout implements OooOO0O {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final CollapsibleActionView f292Oooo0o;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(View view) {
            super(view.getContext());
            this.f292Oooo0o = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p016OooOoO0.OooOO0O
        public final void OooO0OO() {
            this.f292Oooo0o.onActionViewExpanded();
        }

        @Override // p016OooOoO0.OooOO0O
        public final void OooO0o0() {
            this.f292Oooo0o.onActionViewCollapsed();
        }
    }

    public class OooO0o implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f293OooO00o;

        public OooO0o(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f293OooO00o = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f293OooO00o.onMenuItemActionCollapse(o000oOoO.this.OooO0OO(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f293OooO00o.onMenuItemActionExpand(o000oOoO.this.OooO0OO(menuItem));
        }
    }

    public o000oOoO(Context context, o000O0O.OooO0O0 oooO0O0) {
        super(context);
        if (oooO0O0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f285OooO0Oo = oooO0O0;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f285OooO0Oo.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f285OooO0Oo.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        o000O0O0.OooO00o oooO00oOooO0O0 = this.f285OooO0Oo.OooO0O0();
        if (oooO00oOooO0O0 instanceof OooO00o) {
            return ((OooO00o) oooO00oOooO0O0).f289OooO0OO;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f285OooO0Oo.getActionView();
        return actionView instanceof OooO0OO ? (View) ((OooO0OO) actionView).f292Oooo0o : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f285OooO0Oo.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f285OooO0Oo.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f285OooO0Oo.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f285OooO0Oo.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f285OooO0Oo.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f285OooO0Oo.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f285OooO0Oo.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f285OooO0Oo.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f285OooO0Oo.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f285OooO0Oo.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f285OooO0Oo.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f285OooO0Oo.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f285OooO0Oo.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return OooO0Oo(this.f285OooO0Oo.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f285OooO0Oo.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f285OooO0Oo.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f285OooO0Oo.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f285OooO0Oo.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f285OooO0Oo.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f285OooO0Oo.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f285OooO0Oo.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f285OooO0Oo.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f285OooO0Oo.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        OooO0O0 oooO0O0 = new OooO0O0(this, this.f266OooO00o, actionProvider);
        o000O0O.OooO0O0 oooO0O1 = this.f285OooO0Oo;
        if (actionProvider == null) {
            oooO0O0 = null;
        }
        oooO0O1.OooO00o(oooO0O0);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new OooO0OO(view);
        }
        this.f285OooO0Oo.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f285OooO0Oo.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f285OooO0Oo.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f285OooO0Oo.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f285OooO0Oo.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f285OooO0Oo.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f285OooO0Oo.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f285OooO0Oo.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f285OooO0Oo.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f285OooO0Oo.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f285OooO0Oo.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f285OooO0Oo.setOnActionExpandListener(onActionExpandListener != null ? new OooO0o(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f285OooO0Oo.setOnMenuItemClickListener(onMenuItemClickListener != null ? new OooO(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f285OooO0Oo.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f285OooO0Oo.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f285OooO0Oo.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f285OooO0Oo.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f285OooO0Oo.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f285OooO0Oo.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f285OooO0Oo.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f285OooO0Oo.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f285OooO0Oo.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f285OooO0Oo.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f285OooO0Oo.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f285OooO0Oo.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        this.f285OooO0Oo.setActionView(i);
        View actionView = this.f285OooO0Oo.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f285OooO0Oo.setActionView(new OooO0OO(actionView));
        }
        return this;
    }
}
