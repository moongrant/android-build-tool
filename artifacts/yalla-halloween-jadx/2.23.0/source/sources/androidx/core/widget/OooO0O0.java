package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO0O0 {
    @DoNotInline
    public static ColorStateList OooO00o(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    @DoNotInline
    public static PorterDuff.Mode OooO0O0(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    @DoNotInline
    public static void OooO0OO(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    @DoNotInline
    public static void OooO0Oo(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
