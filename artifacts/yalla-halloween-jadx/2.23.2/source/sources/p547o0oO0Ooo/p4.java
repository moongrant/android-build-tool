package p547o0oO0Ooo;

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
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o000OO;
import p274o0O000oo.OooOOO0;
import p276o0O00OoO.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p4 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Px
    public int f55805OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Px
    public int f55806OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public int[] f55807OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ColorInt
    public int f55808OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f55809OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f55810OooO0o0;

    public p4(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.f55807OooO0OO = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(o00000O.mtrl_progress_track_thickness);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context, attributeSet, o000OO.BaseProgressIndicator, i, i2, new int[0]);
        this.f55805OooO00o = OooO0o.OooO0OO(context, typedArrayOooO0Oo, o000OO.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f55806OooO0O0 = Math.min(OooO0o.OooO0OO(context, typedArrayOooO0Oo, o000OO.BaseProgressIndicator_trackCornerRadius, 0), this.f55805OooO00o / 2);
        this.f55810OooO0o0 = typedArrayOooO0Oo.getInt(o000OO.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f55809OooO0o = typedArrayOooO0Oo.getInt(o000OO.BaseProgressIndicator_hideAnimationBehavior, 0);
        int i3 = o000OO.BaseProgressIndicator_indicatorColor;
        if (!typedArrayOooO0Oo.hasValue(i3)) {
            this.f55807OooO0OO = new int[]{OooOOO0.OooO0O0(o00000.colorPrimary, context, -1)};
        } else if (typedArrayOooO0Oo.peekValue(i3).type != 1) {
            this.f55807OooO0OO = new int[]{typedArrayOooO0Oo.getColor(i3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayOooO0Oo.getResourceId(i3, -1));
            this.f55807OooO0OO = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        int i4 = o000OO.BaseProgressIndicator_trackColor;
        if (typedArrayOooO0Oo.hasValue(i4)) {
            this.f55808OooO0Oo = typedArrayOooO0Oo.getColor(i4, -1);
        } else {
            this.f55808OooO0Oo = this.f55807OooO0OO[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.f55808OooO0Oo = OooOOO0.OooO00o(this.f55808OooO0Oo, (int) (f * 255.0f));
        }
        typedArrayOooO0Oo.recycle();
    }

    public abstract void OooO00o();
}
