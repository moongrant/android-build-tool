package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.OooOOO0;
import com.google.android.material.internal.o00oO0o;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class ChipGroup extends FlowLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int f16239OooOOO = o0000O0O.Widget_MaterialComponents_ChipGroup;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Dimension
    public int f16240OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Dimension
    public int f16241OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public OooO0o f16242OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final com.google.android.material.internal.OooO0O0<Chip> f16243OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f16244OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final OooO f16245OooOOO0;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            super(-2, -2);
        }
    }

    public class OooO implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f16246OooO0Oo;

        public OooO() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    view2.setId(ViewCompat.OooO.OooO00o());
                }
                com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = chipGroup.f16243OooOO0O;
                Chip chip = (Chip) view2;
                oooO0O0.f16730OooO00o.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    oooO0O0.OooO00o(chip);
                }
                chip.setInternalOnCheckedChangeListener(new com.google.android.material.internal.OooO00o(oooO0O0));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16246OooO0Oo;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = chipGroup.f16243OooOO0O;
                Chip chip = (Chip) view2;
                oooO0O0.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                oooO0O0.f16730OooO00o.remove(Integer.valueOf(chip.getId()));
                oooO0O0.f16731OooO0O0.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16246OooO0Oo;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class OooO00o implements com.google.android.material.internal.OooO0O0.OooO00o {
        public OooO00o() {
        }
    }

    public class OooO0O0 implements OooO0o {
        public OooO0O0() {
        }
    }

    @Deprecated
    public interface OooO0OO {
    }

    public interface OooO0o {
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (getChildAt(i2).getVisibility() == 0) {
                    i++;
                }
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean OooO00o() {
        return this.f16666OooO0o;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.f16243OooOO0O.OooO0OO();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f16243OooOO0O.OooO0O0(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f16241OooO0oo;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f16240OooO;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f16244OooOO0o;
        if (i != -1) {
            com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = this.f16243OooOO0O;
            OooOOO0<T> oooOOO0 = (OooOOO0) oooO0O0.f16730OooO00o.get(Integer.valueOf(i));
            if (oooOOO0 != 0 && oooO0O0.OooO00o(oooOOO0)) {
                oooO0O0.OooO0Oo();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0O0O00.OooOO0.OooO00o(getRowCount(), this.f16666OooO0o ? getVisibleChipCount() : -1, this.f16243OooOO0O.f16733OooO0Oo ? 1 : 2, false).f33532OooO00o);
    }

    public void setChipSpacing(@Dimension int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@Dimension int i) {
        if (this.f16241OooO0oo != i) {
            this.f16241OooO0oo = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@DimenRes int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@Dimension int i) {
        if (this.f16240OooO != i) {
            this.f16240OooO = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable OooO0OO oooO0OO) {
        if (oooO0OO == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new OooO0O0());
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable OooO0o oooO0o) {
        this.f16242OooOO0 = oooO0o;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f16245OooOOO0.f16246OooO0Oo = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f16243OooOO0O.f16734OooO0o0 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = this.f16243OooOO0O;
        if (oooO0O0.f16733OooO0Oo != z) {
            oooO0O0.f16733OooO0Oo = z;
            boolean z2 = !oooO0O0.f16731OooO0O0.isEmpty();
            Iterator it = oooO0O0.f16730OooO00o.values().iterator();
            while (it.hasNext()) {
                oooO0O0.OooO0o0((OooOOO0) it.next(), false);
            }
            if (z2) {
                oooO0O0.OooO0Oo();
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o00000.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(@BoolRes int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = f16239OooOOO;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = new com.google.android.material.internal.OooO0O0<>();
        this.f16243OooOO0O = oooO0O0;
        OooO oooO = new OooO();
        this.f16245OooOOO0 = oooO;
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(getContext(), attributeSet, o000OO.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayOooO0Oo.getBoolean(o000OO.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayOooO0Oo.getBoolean(o000OO.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayOooO0Oo.getBoolean(o000OO.ChipGroup_selectionRequired, false));
        this.f16244OooOO0o = typedArrayOooO0Oo.getResourceId(o000OO.ChipGroup_checkedChip, -1);
        typedArrayOooO0Oo.recycle();
        oooO0O0.f16732OooO0OO = new OooO00o();
        super.setOnHierarchyChangeListener(oooO);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 1);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
