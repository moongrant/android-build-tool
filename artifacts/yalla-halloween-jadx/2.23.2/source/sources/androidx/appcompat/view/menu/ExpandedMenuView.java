package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import p013OooOo0o.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements OooO.OooO0O0, OooOOOO, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f2549OooO0o0 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO f2550OooO0Oo;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void OooO00o(OooO oooO) {
        this.f2550OooO0Oo = oooO;
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO0O0
    public final boolean OooO0Oo(OooOO0O oooOO0O) {
        return this.f2550OooO0Oo.OooOOo0(oooOO0O, null, 0);
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
        OooO0Oo((OooOO0O) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet);
        setOnItemClickListener(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2549OooO0o0, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : o00Oo0.OooO00o(context, resourceId2));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider((!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(1) : o00Oo0.OooO00o(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
