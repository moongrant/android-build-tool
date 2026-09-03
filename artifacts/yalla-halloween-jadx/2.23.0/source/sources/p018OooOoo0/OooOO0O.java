package p018OooOoo0;

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
import androidx.core.content.ContextCompat;
import o0000.OooO0O0;
import p053o00000oo.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOO0O implements OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Context f358OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public CharSequence f359OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public CharSequence f360OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Intent f361OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public char f362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public char f363OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Drawable f366OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f367OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public CharSequence f368OooOO0O;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f364OooO0o0 = 4096;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f365OooO0oO = 4096;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ColorStateList f369OooOO0o = null;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public PorterDuff.Mode f371OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f370OooOOO = false;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f372OooOOOO = false;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f373OooOOOo = 16;

    public OooOO0O(Context context, CharSequence charSequence) {
        this.f358OooO = context;
        this.f359OooO00o = charSequence;
    }

    @Override // o0000.OooO0O0
    public final androidx.core.view.OooO0O0 OooO00o() {
        return null;
    }

    @Override // o0000.OooO0O0
    @NonNull
    public final OooO0O0 OooO0O0(androidx.core.view.OooO0O0 oooO0O0) {
        throw new UnsupportedOperationException();
    }

    public final void OooO0OO() {
        Drawable drawable = this.f366OooO0oo;
        if (drawable != null) {
            if (this.f370OooOOO || this.f372OooOOOO) {
                this.f366OooO0oo = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f366OooO0oo = drawableMutate;
                if (this.f370OooOOO) {
                    o00Ooo.OooO0O0.OooO0oo(drawableMutate, this.f369OooOO0o);
                }
                if (this.f372OooOOOO) {
                    o00Ooo.OooO0O0.OooO(this.f366OooO0oo, this.f371OooOOO0);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f365OooO0oO;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f363OooO0o;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f367OooOO0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f366OooO0oo;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f369OooOO0o;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f371OooOOO0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f361OooO0OO;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f364OooO0o0;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f362OooO0Oo;
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
        return this.f359OooO00o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f360OooO0O0;
        return charSequence != null ? charSequence : this.f359OooO00o;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f368OooOO0O;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f373OooOOOo & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f373OooOOOo & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f373OooOOOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f373OooOOOo & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f363OooO0o = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f373OooOOOo = (z ? 1 : 0) | (this.f373OooOOOo & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f373OooOOOo = (z ? 2 : 0) | (this.f373OooOOOo & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f367OooOO0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f373OooOOOo = (z ? 16 : 0) | (this.f373OooOOOo & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f366OooO0oo = drawable;
        OooO0OO();
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f369OooOO0o = colorStateList;
        this.f370OooOOO = true;
        OooO0OO();
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f371OooOOO0 = mode;
        this.f372OooOOOO = true;
        OooO0OO();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f361OooO0OO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f362OooO0Oo = c;
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
        this.f362OooO0Oo = c;
        this.f363OooO0o = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f359OooO00o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f360OooO0O0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f368OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f373OooOOOo = (this.f373OooOOOo & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f363OooO0o = Character.toLowerCase(c);
        this.f365OooO0oO = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final OooO0O0 setContentDescription(CharSequence charSequence) {
        this.f367OooOO0 = charSequence;
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f362OooO0Oo = c;
        this.f364OooO0o0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f359OooO00o = this.f358OooO.getResources().getString(i);
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final OooO0O0 setTooltipText(CharSequence charSequence) {
        this.f368OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        Object obj = ContextCompat.f5271OooO00o;
        this.f366OooO0oo = ContextCompat.OooO0OO.OooO0O0(this.f358OooO, i);
        OooO0OO();
        return this;
    }

    @Override // o0000.OooO0O0, android.view.MenuItem
    @NonNull
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f362OooO0Oo = c;
        this.f364OooO0o0 = KeyEvent.normalizeMetaState(i);
        this.f363OooO0o = Character.toLowerCase(c2);
        this.f365OooO0oO = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
