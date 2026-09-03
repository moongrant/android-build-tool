package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final View f2949OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000O000 f2952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000O000 f2953OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000O000 f2954OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f2951OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f2950OooO0O0 = OooOOO0.OooO00o();

    public OooO(@NonNull View view) {
        this.f2949OooO00o = view;
    }

    public final void OooO(PorterDuff.Mode mode) {
        if (this.f2954OooO0o0 == null) {
            this.f2954OooO0o0 = new o000O000();
        }
        o000O000 o000o001 = this.f2954OooO0o0;
        o000o001.f3266OooO0O0 = mode;
        o000o001.f3267OooO0OO = true;
        OooO00o();
    }

    public final void OooO00o() {
        View view = this.f2949OooO00o;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z = false;
            if (this.f2952OooO0Oo != null) {
                if (this.f2953OooO0o == null) {
                    this.f2953OooO0o = new o000O000();
                }
                o000O000 o000o001 = this.f2953OooO0o;
                o000o001.f3265OooO00o = null;
                o000o001.f3268OooO0Oo = false;
                o000o001.f3266OooO0O0 = null;
                o000o001.f3267OooO0OO = false;
                WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ColorStateList colorStateListOooO0oO = ViewCompat.OooOOO.OooO0oO(view);
                if (colorStateListOooO0oO != null) {
                    o000o001.f3268OooO0Oo = true;
                    o000o001.f3265OooO00o = colorStateListOooO0oO;
                }
                PorterDuff.Mode modeOooO0oo = ViewCompat.OooOOO.OooO0oo(view);
                if (modeOooO0oo != null) {
                    o000o001.f3267OooO0OO = true;
                    o000o001.f3266OooO0O0 = modeOooO0oo;
                }
                if (o000o001.f3268OooO0Oo || o000o001.f3267OooO0OO) {
                    OooOOO0.OooO0o0(background, o000o001, view.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            o000O000 o000o002 = this.f2954OooO0o0;
            if (o000o002 != null) {
                OooOOO0.OooO0o0(background, o000o002, view.getDrawableState());
                return;
            }
            o000O000 o000o003 = this.f2952OooO0Oo;
            if (o000o003 != null) {
                OooOOO0.OooO0o0(background, o000o003, view.getDrawableState());
            }
        }
    }

    public final ColorStateList OooO0O0() {
        o000O000 o000o001 = this.f2954OooO0o0;
        if (o000o001 != null) {
            return o000o001.f3265OooO00o;
        }
        return null;
    }

    public final PorterDuff.Mode OooO0OO() {
        o000O000 o000o001 = this.f2954OooO0o0;
        if (o000o001 != null) {
            return o000o001.f3266OooO0O0;
        }
        return null;
    }

    public final void OooO0Oo(@Nullable AttributeSet attributeSet, int i) {
        ColorStateList colorStateListOooO;
        View view = this.f2949OooO00o;
        Context context = view.getContext();
        int[] iArr = p012OooOo0O.o00O0O.ViewBackgroundHelper;
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(context, attributeSet, iArr, i);
        View view2 = this.f2949OooO00o;
        ViewCompat.OooOOO(view2, view2.getContext(), iArr, attributeSet, o000oo0OooOOO0.f3326OooO0O0, i, 0);
        try {
            int i2 = p012OooOo0O.o00O0O.ViewBackgroundHelper_android_background;
            if (o000oo0OooOOO0.OooOO0o(i2)) {
                this.f2951OooO0OO = o000oo0OooOOO0.OooO(i2, -1);
                OooOOO0 oooOOO0 = this.f2950OooO0O0;
                Context context2 = view.getContext();
                int i3 = this.f2951OooO0OO;
                synchronized (oooOOO0) {
                    colorStateListOooO = oooOOO0.f2983OooO00o.OooO(i3, context2);
                }
                if (colorStateListOooO != null) {
                    OooO0oO(colorStateListOooO);
                }
            }
            int i4 = p012OooOo0O.o00O0O.ViewBackgroundHelper_backgroundTint;
            if (o000oo0OooOOO0.OooOO0o(i4)) {
                ViewCompat.OooOOO.OooOOo0(view, o000oo0OooOOO0.OooO0O0(i4));
            }
            int i5 = p012OooOo0O.o00O0O.ViewBackgroundHelper_backgroundTintMode;
            if (o000oo0OooOOO0.OooOO0o(i5)) {
                ViewCompat.OooOOO.OooOOo(view, o000000.OooO0OO(o000oo0OooOOO0.OooO0oo(i5, -1), null));
            }
            o000oo0OooOOO0.OooOOO();
        } catch (Throwable th) {
            o000oo0OooOOO0.OooOOO();
            throw th;
        }
    }

    public final void OooO0o(int i) {
        ColorStateList colorStateListOooO;
        this.f2951OooO0OO = i;
        OooOOO0 oooOOO0 = this.f2950OooO0O0;
        if (oooOOO0 != null) {
            Context context = this.f2949OooO00o.getContext();
            synchronized (oooOOO0) {
                colorStateListOooO = oooOOO0.f2983OooO00o.OooO(i, context);
            }
        } else {
            colorStateListOooO = null;
        }
        OooO0oO(colorStateListOooO);
        OooO00o();
    }

    public final void OooO0o0() {
        this.f2951OooO0OO = -1;
        OooO0oO(null);
        OooO00o();
    }

    public final void OooO0oO(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2952OooO0Oo == null) {
                this.f2952OooO0Oo = new o000O000();
            }
            o000O000 o000o001 = this.f2952OooO0Oo;
            o000o001.f3265OooO00o = colorStateList;
            o000o001.f3268OooO0Oo = true;
        } else {
            this.f2952OooO0Oo = null;
        }
        OooO00o();
    }

    public final void OooO0oo(ColorStateList colorStateList) {
        if (this.f2954OooO0o0 == null) {
            this.f2954OooO0o0 = new o000O000();
        }
        o000O000 o000o001 = this.f2954OooO0o0;
        o000o001.f3265OooO00o = colorStateList;
        o000o001.f3268OooO0Oo = true;
        OooO00o();
    }
}
