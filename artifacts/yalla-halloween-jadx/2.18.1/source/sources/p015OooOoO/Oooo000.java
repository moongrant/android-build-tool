package p015OooOoO;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import o000O0O.OooO0O0;
import o000O0O0.OooO00o;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class Oooo000 implements OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Context f269OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public CharSequence f270OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public CharSequence f271OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Intent f272OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public char f273OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public char f274OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Drawable f277OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f278OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public CharSequence f279OooOO0O;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f275OooO0o0 = 4096;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f276OooO0oO = 4096;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ColorStateList f280OooOO0o = null;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public PorterDuff.Mode f282OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f281OooOOO = false;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f283OooOOOO = false;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f284OooOOOo = 16;

    public Oooo000(Context context, CharSequence charSequence) {
        this.f269OooO = context;
        this.f270OooO00o = charSequence;
    }

    @Override // o000O0O.OooO0O0
    @NonNull
    public final OooO0O0 OooO00o(OooO00o oooO00o) {
        throw new UnsupportedOperationException();
    }

    @Override // o000O0O.OooO0O0
    public final OooO00o OooO0O0() {
        return null;
    }

    public final void OooO0OO() {
        Drawable drawable = this.f277OooO0oo;
        if (drawable != null) {
            if (this.f281OooOOO || this.f283OooOOOO) {
                Drawable drawableOooO0o0 = o0OOO0o.OooO0o0(drawable);
                this.f277OooO0oo = drawableOooO0o0;
                Drawable drawableMutate = drawableOooO0o0.mutate();
                this.f277OooO0oo = drawableMutate;
                if (this.f281OooOOO) {
                    o0OOO0o.OooO0O0.OooO0oo(drawableMutate, this.f280OooOO0o);
                }
                if (this.f283OooOOOO) {
                    o0OOO0o.OooO0O0.OooO(this.f277OooO0oo, this.f282OooOOO0);
                }
            }
        }
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f276OooO0oO;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f274OooO0o;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f278OooOO0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f277OooO0oo;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f280OooOO0o;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f282OooOOO0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f272OooO0OO;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f275OooO0o0;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f273OooO0Oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f270OooO00o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f271OooO0O0;
        return charSequence != null ? charSequence : this.f270OooO00o;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f279OooOO0O;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f284OooOOOo & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f284OooOOOo & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f284OooOOOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f284OooOOOo & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f274OooO0o = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f284OooOOOo = (z ? 1 : 0) | (this.f284OooOOOo & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f284OooOOOo = (z ? 2 : 0) | (this.f284OooOOOo & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f278OooOO0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f284OooOOOo = (z ? 16 : 0) | (this.f284OooOOOo & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f277OooO0oo = drawable;
        OooO0OO();
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f280OooOO0o = colorStateList;
        this.f281OooOOO = true;
        OooO0OO();
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f282OooOOO0 = mode;
        this.f283OooOOOO = true;
        OooO0OO();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f272OooO0OO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f273OooO0Oo = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f273OooO0Oo = c;
        this.f274OooO0o = Character.toLowerCase(c2);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f270OooO00o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f271OooO0O0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f279OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f284OooOOOo = (this.f284OooOOOo & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f274OooO0o = Character.toLowerCase(c);
        this.f276OooO0oO = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final OooO0O0 setContentDescription(CharSequence charSequence) {
        this.f278OooOO0 = charSequence;
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f273OooO0Oo = c;
        this.f275OooO0o0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f270OooO00o = this.f269OooO.getResources().getString(i);
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final OooO0O0 setTooltipText(CharSequence charSequence) {
        this.f279OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        Context context = this.f269OooO;
        Object obj = o000O000.OooO00o.f28085OooO00o;
        this.f277OooO0oo = o000O000.OooO00o.OooO0OO.OooO0O0(context, i);
        OooO0OO();
        return this;
    }

    @Override // o000O0O.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f273OooO0Oo = c;
        this.f275OooO0o0 = KeyEvent.normalizeMetaState(i);
        this.f274OooO0o = Character.toLowerCase(c2);
        this.f276OooO0oO = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
