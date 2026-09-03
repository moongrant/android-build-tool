package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CompoundButton f2971OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f2975OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ColorStateList f2972OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PorterDuff.Mode f2973OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f2974OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f2976OooO0o0 = false;

    public OooOO0O(@NonNull CompoundButton compoundButton) {
        this.f2971OooO00o = compoundButton;
    }

    public final void OooO00o() {
        CompoundButton compoundButton = this.f2971OooO00o;
        Drawable drawableOooO00o = androidx.core.widget.OooO0OO.OooO00o(compoundButton);
        if (drawableOooO00o != null) {
            if (this.f2974OooO0Oo || this.f2976OooO0o0) {
                Drawable drawableMutate = drawableOooO00o.mutate();
                if (this.f2974OooO0Oo) {
                    o00000oo.o00Ooo.OooO0O0.OooO0oo(drawableMutate, this.f2972OooO0O0);
                }
                if (this.f2976OooO0o0) {
                    o00000oo.o00Ooo.OooO0O0.OooO(drawableMutate, this.f2973OooO0OO);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void OooO0O0(@Nullable AttributeSet attributeSet, int i) {
        boolean z;
        int iOooO;
        int iOooO2;
        CompoundButton compoundButton = this.f2971OooO00o;
        Context context = compoundButton.getContext();
        int[] iArr = p012OooOo0O.o00O0O.CompoundButton;
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(context, attributeSet, iArr, i);
        ViewCompat.OooOOO(compoundButton, compoundButton.getContext(), iArr, attributeSet, o000oo0OooOOO0.f3324OooO0O0, i, 0);
        try {
            int i2 = p012OooOo0O.o00O0O.CompoundButton_buttonCompat;
            if (!o000oo0OooOOO0.OooOO0o(i2) || (iOooO2 = o000oo0OooOOO0.OooO(i2, 0)) == 0) {
                z = false;
            } else {
                try {
                    compoundButton.setButtonDrawable(p013OooOo0o.o00Oo0.OooO00o(compoundButton.getContext(), iOooO2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z) {
                int i3 = p012OooOo0O.o00O0O.CompoundButton_android_button;
                if (o000oo0OooOOO0.OooOO0o(i3) && (iOooO = o000oo0OooOOO0.OooO(i3, 0)) != 0) {
                    compoundButton.setButtonDrawable(p013OooOo0o.o00Oo0.OooO00o(compoundButton.getContext(), iOooO));
                }
            }
            int i4 = p012OooOo0O.o00O0O.CompoundButton_buttonTint;
            if (o000oo0OooOOO0.OooOO0o(i4)) {
                androidx.core.widget.OooO0O0.OooO0OO(compoundButton, o000oo0OooOOO0.OooO0O0(i4));
            }
            int i5 = p012OooOo0O.o00O0O.CompoundButton_buttonTintMode;
            if (o000oo0OooOOO0.OooOO0o(i5)) {
                androidx.core.widget.OooO0O0.OooO0Oo(compoundButton, o000000.OooO0OO(o000oo0OooOOO0.OooO0oo(i5, -1), null));
            }
        } finally {
            o000oo0OooOOO0.OooOOO();
        }
    }
}
