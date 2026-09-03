package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        OooO00o(context, attributeSet, i, 0);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.PopupWindow, i, i2);
        int i3 = OooOo00.OooOOOO.PopupWindow_overlapAnchor;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            androidx.core.widget.OooOOOO.OooO00o(this, typedArrayObtainStyledAttributes.getBoolean(i3, false));
        }
        int i4 = OooOo00.OooOOOO.PopupWindow_android_popupBackground;
        setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(i4) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i4, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i4) : p012OooOo0.OooOO0O.OooO0O0(context, resourceId));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        OooO00o(context, attributeSet, i, i2);
    }
}
