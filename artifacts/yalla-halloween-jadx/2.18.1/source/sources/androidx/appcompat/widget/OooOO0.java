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
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CompoundButton f5080OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f5084OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ColorStateList f5081OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PorterDuff.Mode f5082OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f5083OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f5085OooO0o0 = false;

    public OooOO0(@NonNull CompoundButton compoundButton) {
        this.f5080OooO00o = compoundButton;
    }

    public final void OooO00o() {
        Drawable drawableOooO00o = androidx.core.widget.OooO0OO.OooO00o(this.f5080OooO00o);
        if (drawableOooO00o != null) {
            if (this.f5083OooO0Oo || this.f5085OooO0o0) {
                Drawable drawableMutate = p084o000Ooo.o0OOO0o.OooO0o0(drawableOooO00o).mutate();
                if (this.f5083OooO0Oo) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO0oo(drawableMutate, this.f5081OooO0O0);
                }
                if (this.f5085OooO0o0) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO(drawableMutate, this.f5082OooO0OO);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f5080OooO00o.getDrawableState());
                }
                this.f5080OooO00o.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void OooO0O0(@Nullable AttributeSet attributeSet, int i) {
        boolean z;
        int iOooOOO0;
        int iOooOOO1;
        Context context = this.f5080OooO00o.getContext();
        int[] iArr = OooOo00.OooOOOO.CompoundButton;
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(context, attributeSet, iArr, i);
        CompoundButton compoundButton = this.f5080OooO00o;
        ViewCompat.OooOo0O(compoundButton, compoundButton.getContext(), iArr, attributeSet, o0000o0OooOOo.f5367OooO0O0, i);
        try {
            int i2 = OooOo00.OooOOOO.CompoundButton_buttonCompat;
            if (!o0000o0OooOOo.OooOOOo(i2) || (iOooOOO1 = o0000o0OooOOo.OooOOO0(i2, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f5080OooO00o;
                    compoundButton2.setButtonDrawable(p012OooOo0.OooOO0O.OooO0O0(compoundButton2.getContext(), iOooOOO1));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z) {
                int i3 = OooOo00.OooOOOO.CompoundButton_android_button;
                if (o0000o0OooOOo.OooOOOo(i3) && (iOooOOO0 = o0000o0OooOOo.OooOOO0(i3, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f5080OooO00o;
                    compoundButton3.setButtonDrawable(p012OooOo0.OooOO0O.OooO0O0(compoundButton3.getContext(), iOooOOO0));
                }
            }
            int i4 = OooOo00.OooOOOO.CompoundButton_buttonTint;
            if (o0000o0OooOOo.OooOOOo(i4)) {
                androidx.core.widget.OooO0OO.OooO00o.OooO0OO(this.f5080OooO00o, o0000o0OooOOo.OooO0OO(i4));
            }
            int i5 = OooOo00.OooOOOO.CompoundButton_buttonTintMode;
            if (o0000o0OooOOo.OooOOOo(i5)) {
                androidx.core.widget.OooO0OO.OooO00o.OooO0Oo(this.f5080OooO00o, o0ooOOo.OooO0Oo(o0000o0OooOOo.OooOO0(i5, -1), null));
            }
        } finally {
            o0000o0OooOOo.OooOOoo();
        }
    }
}
