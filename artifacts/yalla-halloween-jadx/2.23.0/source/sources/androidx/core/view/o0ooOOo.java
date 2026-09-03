package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class o0ooOOo {
    @DoNotInline
    public static MenuItem OooO(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    @DoNotInline
    public static int OooO00o(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    @DoNotInline
    public static CharSequence OooO0O0(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    @DoNotInline
    public static ColorStateList OooO0OO(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    @DoNotInline
    public static PorterDuff.Mode OooO0Oo(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    @DoNotInline
    public static CharSequence OooO0o(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    @DoNotInline
    public static int OooO0o0(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    @DoNotInline
    public static MenuItem OooO0oO(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    @DoNotInline
    public static MenuItem OooO0oo(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    @DoNotInline
    public static MenuItem OooOO0(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    @DoNotInline
    public static MenuItem OooOO0O(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    @DoNotInline
    public static MenuItem OooOO0o(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    @DoNotInline
    public static MenuItem OooOOO0(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
