package o0OOO0O0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Px
    public int f38052OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Px
    public int f38053OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public int[] f38054OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ColorInt
    public int f38055OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f38056OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38057OooO0o0;

    public OooO0O0(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.f38054OooO0OO = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.mtrl_progress_track_thickness);
        TypedArray typedArrayOooO0Oo = com.google.android.material.internal.o000oOoO.OooO0Oo(context, attributeSet, p337o0OO0o0.Oooo0.BaseProgressIndicator, i, i2, new int[0]);
        this.f38052OooO00o = o0OOO0O.OooO0OO.OooO0OO(context, typedArrayOooO0Oo, p337o0OO0o0.Oooo0.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f38053OooO0O0 = Math.min(o0OOO0O.OooO0OO.OooO0OO(context, typedArrayOooO0Oo, p337o0OO0o0.Oooo0.BaseProgressIndicator_trackCornerRadius, 0), this.f38052OooO00o / 2);
        this.f38057OooO0o0 = typedArrayOooO0Oo.getInt(p337o0OO0o0.Oooo0.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f38056OooO0o = typedArrayOooO0Oo.getInt(p337o0OO0o0.Oooo0.BaseProgressIndicator_hideAnimationBehavior, 0);
        int i3 = p337o0OO0o0.Oooo0.BaseProgressIndicator_indicatorColor;
        if (!typedArrayOooO0Oo.hasValue(i3)) {
            this.f38054OooO0OO = new int[]{o0O0000O.OooO0O0(context, p337o0OO0o0.OooO0o.colorPrimary, -1)};
        } else if (typedArrayOooO0Oo.peekValue(i3).type != 1) {
            this.f38054OooO0OO = new int[]{typedArrayOooO0Oo.getColor(i3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayOooO0Oo.getResourceId(i3, -1));
            this.f38054OooO0OO = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        int i4 = p337o0OO0o0.Oooo0.BaseProgressIndicator_trackColor;
        if (typedArrayOooO0Oo.hasValue(i4)) {
            this.f38055OooO0Oo = typedArrayOooO0Oo.getColor(i4, -1);
        } else {
            this.f38055OooO0Oo = this.f38054OooO0OO[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.f38055OooO0Oo = o0O0000O.OooO00o(this.f38055OooO0Oo, (int) (f * 255.0f));
        }
        typedArrayOooO0Oo.recycle();
    }

    public abstract void OooO00o();
}
