package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final View f5074OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000O00 f5077OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0000O00 f5078OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0000O00 f5079OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f5076OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f5075OooO0O0 = OooOO0O.OooO00o();

    public OooO0o(@NonNull View view) {
        this.f5074OooO00o = view;
    }

    public final void OooO(PorterDuff.Mode mode) {
        if (this.f5079OooO0o0 == null) {
            this.f5079OooO0o0 = new o0000O00();
        }
        o0000O00 o0000o00 = this.f5079OooO0o0;
        o0000o00.f5370OooO0O0 = mode;
        o0000o00.f5371OooO0OO = true;
        OooO00o();
    }

    public final void OooO00o() {
        Drawable background = this.f5074OooO00o.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f5077OooO0Oo != null) {
                if (this.f5078OooO0o == null) {
                    this.f5078OooO0o = new o0000O00();
                }
                o0000O00 o0000o00 = this.f5078OooO0o;
                o0000o00.f5369OooO00o = null;
                o0000o00.f5372OooO0Oo = false;
                o0000o00.f5370OooO0O0 = null;
                o0000o00.f5371OooO0OO = false;
                View view = this.f5074OooO00o;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ColorStateList colorStateListOooO0oO = ViewCompat.OooOOO.OooO0oO(view);
                if (colorStateListOooO0oO != null) {
                    o0000o00.f5372OooO0Oo = true;
                    o0000o00.f5369OooO00o = colorStateListOooO0oO;
                }
                PorterDuff.Mode modeOooO0oo = ViewCompat.OooOOO.OooO0oo(this.f5074OooO00o);
                if (modeOooO0oo != null) {
                    o0000o00.f5371OooO0OO = true;
                    o0000o00.f5370OooO0O0 = modeOooO0oo;
                }
                if (o0000o00.f5372OooO0Oo || o0000o00.f5371OooO0OO) {
                    OooOO0O.OooO0o(background, o0000o00, this.f5074OooO00o.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            o0000O00 o0000o01 = this.f5079OooO0o0;
            if (o0000o01 != null) {
                OooOO0O.OooO0o(background, o0000o01, this.f5074OooO00o.getDrawableState());
                return;
            }
            o0000O00 o0000o02 = this.f5077OooO0Oo;
            if (o0000o02 != null) {
                OooOO0O.OooO0o(background, o0000o02, this.f5074OooO00o.getDrawableState());
            }
        }
    }

    public final ColorStateList OooO0O0() {
        o0000O00 o0000o00 = this.f5079OooO0o0;
        if (o0000o00 != null) {
            return o0000o00.f5369OooO00o;
        }
        return null;
    }

    public final PorterDuff.Mode OooO0OO() {
        o0000O00 o0000o00 = this.f5079OooO0o0;
        if (o0000o00 != null) {
            return o0000o00.f5370OooO0O0;
        }
        return null;
    }

    public final void OooO0Oo(@Nullable AttributeSet attributeSet, int i) {
        Context context = this.f5074OooO00o.getContext();
        int[] iArr = OooOo00.OooOOOO.ViewBackgroundHelper;
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(context, attributeSet, iArr, i);
        View view = this.f5074OooO00o;
        ViewCompat.OooOo0O(view, view.getContext(), iArr, attributeSet, o0000o0OooOOo.f5367OooO0O0, i);
        try {
            int i2 = OooOo00.OooOOOO.ViewBackgroundHelper_android_background;
            if (o0000o0OooOOo.OooOOOo(i2)) {
                this.f5076OooO0OO = o0000o0OooOOo.OooOOO0(i2, -1);
                ColorStateList colorStateListOooO0Oo = this.f5075OooO0O0.OooO0Oo(this.f5074OooO00o.getContext(), this.f5076OooO0OO);
                if (colorStateListOooO0Oo != null) {
                    OooO0oO(colorStateListOooO0Oo);
                }
            }
            int i3 = OooOo00.OooOOOO.ViewBackgroundHelper_backgroundTint;
            if (o0000o0OooOOo.OooOOOo(i3)) {
                ViewCompat.OooOoO0(this.f5074OooO00o, o0000o0OooOOo.OooO0OO(i3));
            }
            int i4 = OooOo00.OooOOOO.ViewBackgroundHelper_backgroundTintMode;
            if (o0000o0OooOOo.OooOOOo(i4)) {
                View view2 = this.f5074OooO00o;
                PorterDuff.Mode modeOooO0Oo = o0ooOOo.OooO0Oo(o0000o0OooOOo.OooOO0(i4, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                ViewCompat.OooOOO.OooOOo(view2, modeOooO0Oo);
                if (i5 == 21) {
                    Drawable background = view2.getBackground();
                    boolean z = (ViewCompat.OooOOO.OooO0oO(view2) == null && ViewCompat.OooOOO.OooO0oo(view2) == null) ? false : true;
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view2.getDrawableState());
                        }
                        ViewCompat.OooO0o.OooOOo0(view2, background);
                    }
                }
            }
        } finally {
            o0000o0OooOOo.OooOOoo();
        }
    }

    public final void OooO0o(int i) {
        this.f5076OooO0OO = i;
        OooOO0O oooOO0O = this.f5075OooO0O0;
        OooO0oO(oooOO0O != null ? oooOO0O.OooO0Oo(this.f5074OooO00o.getContext(), i) : null);
        OooO00o();
    }

    public final void OooO0o0() {
        this.f5076OooO0OO = -1;
        OooO0oO(null);
        OooO00o();
    }

    public final void OooO0oO(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5077OooO0Oo == null) {
                this.f5077OooO0Oo = new o0000O00();
            }
            o0000O00 o0000o00 = this.f5077OooO0Oo;
            o0000o00.f5369OooO00o = colorStateList;
            o0000o00.f5372OooO0Oo = true;
        } else {
            this.f5077OooO0Oo = null;
        }
        OooO00o();
    }

    public final void OooO0oo(ColorStateList colorStateList) {
        if (this.f5079OooO0o0 == null) {
            this.f5079OooO0o0 = new o0000O00();
        }
        o0000O00 o0000o00 = this.f5079OooO0o0;
        o0000o00.f5369OooO00o = colorStateList;
        o0000o00.f5372OooO0Oo = true;
        OooO00o();
    }
}
