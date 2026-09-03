package o0O0O0O;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import p016OooOoOO.o00Oo0;
import p272o0O0000o.o00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f41150OooO00o = {R.attr.theme, o00000.theme};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f41151OooO0O0 = {o00000.materialThemeOverlay};

    @NonNull
    public static Context OooO00o(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f41151OooO0O0, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof o00Oo0) && ((o00Oo0) context).f288OooO00o == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        o00Oo0 o00oo1 = new o00Oo0(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f41150OooO00o);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            o00oo1.getTheme().applyStyle(resourceId2, true);
        }
        return o00oo1;
    }
}
