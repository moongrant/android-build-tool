package p352o0OOOOoO;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import p337o0OO0o0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f38289OooO00o = {R.attr.theme, OooO0o.theme};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f38290OooO0O0 = {OooO0o.materialThemeOverlay};

    @NonNull
    public static Context OooO00o(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f38290OooO0O0, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof p016OooOoO0.OooOOO0) && ((p016OooOoO0.OooOOO0) context).f307OooO00o == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        p016OooOoO0.OooOOO0 oooOOO0 = new p016OooOoO0.OooOOO0(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f38289OooO00o);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            oooOOO0.getTheme().applyStyle(resourceId2, true);
        }
        return oooOOO0;
    }
}
