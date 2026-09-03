package p018OooOoo0;

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
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.view.menu.OooOo;
import java.lang.reflect.Method;
import p016OooOoOO.o00O0O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOOOO extends OooOOO0 implements MenuItem {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000.OooO0O0 f376OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Method f377OooO0o0;

    public class OooO implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f378OooO00o;

        public OooO(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f378OooO00o = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f378OooO00o.onMenuItemClick(OooOOOO.this.OooO0OO(menuItem));
        }
    }

    public class OooO00o extends androidx.core.view.OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ActionProvider f380OooO0OO;

        public OooO00o(ActionProvider actionProvider) {
            this.f380OooO0OO = actionProvider;
        }

        @Override // androidx.core.view.OooO0O0
        public final boolean OooO00o() {
            return this.f380OooO0OO.hasSubMenu();
        }

        @Override // androidx.core.view.OooO0O0
        public final View OooO0OO() {
            return this.f380OooO0OO.onCreateActionView();
        }

        @Override // androidx.core.view.OooO0O0
        public final void OooO0o(OooOo oooOo) {
            this.f380OooO0OO.onPrepareSubMenu(OooOOOO.this.OooO0Oo(oooOo));
        }

        @Override // androidx.core.view.OooO0O0
        public final boolean OooO0o0() {
            return this.f380OooO0OO.onPerformDefaultAction();
        }
    }

    @RequiresApi(16)
    public class OooO0O0 extends OooO00o implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public androidx.core.view.OooO0O0.InterfaceC0124OooO0O0 f382OooO0o0;

        @Override // androidx.core.view.OooO0O0
        public final boolean OooO0O0() {
            return this.f380OooO0OO.isVisible();
        }

        @Override // androidx.core.view.OooO0O0
        public final View OooO0Oo(MenuItem menuItem) {
            return this.f380OooO0OO.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.OooO0O0
        public final boolean OooO0oO() {
            return this.f380OooO0OO.overridesItemVisibility();
        }

        @Override // androidx.core.view.OooO0O0
        public final void OooO0oo(OooOO0O.OooO00o oooO00o) {
            this.f382OooO0o0 = oooO00o;
            this.f380OooO0OO.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z) {
            androidx.core.view.OooO0O0.InterfaceC0124OooO0O0 interfaceC0124OooO0O0 = this.f382OooO0o0;
            if (interfaceC0124OooO0O0 != null) {
                androidx.appcompat.view.menu.OooO oooO = OooOO0O.this.f2636OooOOO;
                oooO.f2577OooO0oo = true;
                oooO.OooOOOo(true);
            }
        }
    }

    public static class OooO0OO extends FrameLayout implements o00O0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final CollapsibleActionView f383OooO0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(View view) {
            super(view.getContext());
            this.f383OooO0Oo = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p016OooOoOO.o00O0O
        public final void OooO0O0() {
            this.f383OooO0Oo.onActionViewExpanded();
        }

        @Override // p016OooOoOO.o00O0O
        public final void OooO0o0() {
            this.f383OooO0Oo.onActionViewCollapsed();
        }
    }

    public class OooO0o implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f384OooO00o;

        public OooO0o(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f384OooO00o = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f384OooO00o.onMenuItemActionCollapse(OooOOOO.this.OooO0OO(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f384OooO00o.onMenuItemActionExpand(OooOOOO.this.OooO0OO(menuItem));
        }
    }

    public OooOOOO(Context context, o0000.OooO0O0 oooO0O0) {
        super(context);
        if (oooO0O0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f376OooO0Oo = oooO0O0;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f376OooO0Oo.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f376OooO0Oo.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        androidx.core.view.OooO0O0 oooO0O0OooO00o = this.f376OooO0Oo.OooO00o();
        if (oooO0O0OooO00o instanceof OooO00o) {
            return ((OooO00o) oooO0O0OooO00o).f380OooO0OO;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f376OooO0Oo.getActionView();
        return actionView instanceof OooO0OO ? (View) ((OooO0OO) actionView).f383OooO0Oo : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f376OooO0Oo.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f376OooO0Oo.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f376OooO0Oo.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f376OooO0Oo.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f376OooO0Oo.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f376OooO0Oo.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f376OooO0Oo.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f376OooO0Oo.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f376OooO0Oo.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f376OooO0Oo.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f376OooO0Oo.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f376OooO0Oo.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f376OooO0Oo.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return OooO0Oo(this.f376OooO0Oo.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f376OooO0Oo.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f376OooO0Oo.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f376OooO0Oo.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f376OooO0Oo.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f376OooO0Oo.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f376OooO0Oo.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f376OooO0Oo.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f376OooO0Oo.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f376OooO0Oo.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        OooO0O0 oooO0O0 = new OooO0O0(actionProvider);
        if (actionProvider == null) {
            oooO0O0 = null;
        }
        this.f376OooO0Oo.OooO0O0(oooO0O0);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new OooO0OO(view);
        }
        this.f376OooO0Oo.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f376OooO0Oo.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f376OooO0Oo.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f376OooO0Oo.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f376OooO0Oo.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f376OooO0Oo.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f376OooO0Oo.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f376OooO0Oo.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f376OooO0Oo.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f376OooO0Oo.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f376OooO0Oo.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f376OooO0Oo.setOnActionExpandListener(onActionExpandListener != null ? new OooO0o(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f376OooO0Oo.setOnMenuItemClickListener(onMenuItemClickListener != null ? new OooO(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f376OooO0Oo.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f376OooO0Oo.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f376OooO0Oo.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f376OooO0Oo.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f376OooO0Oo.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f376OooO0Oo.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f376OooO0Oo.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f376OooO0Oo.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f376OooO0Oo.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f376OooO0Oo.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f376OooO0Oo.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f376OooO0Oo.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        o0000.OooO0O0 oooO0O0 = this.f376OooO0Oo;
        oooO0O0.setActionView(i);
        View actionView = oooO0O0.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            oooO0O0.setActionView(new OooO0OO(actionView));
        }
        return this;
    }
}
