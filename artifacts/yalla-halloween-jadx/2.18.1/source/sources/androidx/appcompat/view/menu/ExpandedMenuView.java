package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements OooO0o.OooO0O0, OooOOO, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final int[] f4658Oooo0oO = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0o f4659Oooo0o;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.OooO0o.OooO0O0
    public final boolean OooO00o(OooOO0 oooOO1) {
        return this.f4659Oooo0o.OooOo00(oooOO1, null, 0);
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0O0(OooO0o oooO0o) {
        this.f4659Oooo0o = oooO0o;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OooO00o((OooOO0) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet);
        setOnItemClickListener(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4658Oooo0oO, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : p012OooOo0.OooOO0O.OooO0O0(context, resourceId2));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider((!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(1) : p012OooOo0.OooOO0O.OooO0O0(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
