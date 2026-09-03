package p273o0O00Oo;

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
import com.google.android.material.internal.o00oO0o;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o000OO;
import p272o0O000oo.OooOOO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Px
    public int f41701OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Px
    public int f41702OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public int[] f41703OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ColorInt
    public int f41704OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f41705OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f41706OooO0o0;

    public OooO0OO(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.f41703OooO0OO = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(o00000O.mtrl_progress_track_thickness);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context, attributeSet, o000OO.BaseProgressIndicator, i, i2, new int[0]);
        this.f41701OooO00o = c1.OooO0OO(context, typedArrayOooO0Oo, o000OO.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f41702OooO0O0 = Math.min(c1.OooO0OO(context, typedArrayOooO0Oo, o000OO.BaseProgressIndicator_trackCornerRadius, 0), this.f41701OooO00o / 2);
        this.f41706OooO0o0 = typedArrayOooO0Oo.getInt(o000OO.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f41705OooO0o = typedArrayOooO0Oo.getInt(o000OO.BaseProgressIndicator_hideAnimationBehavior, 0);
        int i3 = o000OO.BaseProgressIndicator_indicatorColor;
        if (!typedArrayOooO0Oo.hasValue(i3)) {
            this.f41703OooO0OO = new int[]{OooOOO.OooO0O0(o00000.colorPrimary, context, -1)};
        } else if (typedArrayOooO0Oo.peekValue(i3).type != 1) {
            this.f41703OooO0OO = new int[]{typedArrayOooO0Oo.getColor(i3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayOooO0Oo.getResourceId(i3, -1));
            this.f41703OooO0OO = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        int i4 = o000OO.BaseProgressIndicator_trackColor;
        if (typedArrayOooO0Oo.hasValue(i4)) {
            this.f41704OooO0Oo = typedArrayOooO0Oo.getColor(i4, -1);
        } else {
            this.f41704OooO0Oo = this.f41703OooO0OO[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.f41704OooO0Oo = OooOOO.OooO00o(this.f41704OooO0Oo, (int) (f * 255.0f));
        }
        typedArrayOooO0Oo.recycle();
    }

    public abstract void OooO00o();
}
