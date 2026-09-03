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
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.OooOO0;
import com.google.android.material.internal.o000oOoO;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p072o000O0o0.o0000OO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class ChipGroup extends FlowLayout {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final int f16775OoooOOO = Oooo000.Widget_MaterialComponents_ChipGroup;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final com.google.android.material.internal.OooO0O0<Chip> f16776OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Dimension
    public int f16777OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Dimension
    public int f16778OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public OooO0o f16779OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f16780OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NonNull
    public final OooO f16781o000oOoO;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams() {
            super(-2, -2);
        }
    }

    public class OooO implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f16782Oooo0o;

        public OooO() {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    view2.setId(ViewCompat.OooO.OooO00o());
                }
                com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = ChipGroup.this.f16776OoooO;
                Chip chip = (Chip) view2;
                oooO0O0.f17202OooO00o.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    oooO0O0.OooO00o(chip);
                }
                chip.setInternalOnCheckedChangeListener(new com.google.android.material.internal.OooO00o(oooO0O0));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16782Oooo0o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.OooOO0<T>>] */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = chipGroup.f16776OoooO;
                Chip chip = (Chip) view2;
                Objects.requireNonNull(oooO0O0);
                chip.setInternalOnCheckedChangeListener(null);
                oooO0O0.f17202OooO00o.remove(Integer.valueOf(chip.getId()));
                oooO0O0.f17203OooO0O0.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16782Oooo0o;
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

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f16785OooO00o;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f16785OooO00o = oooO0OO;
        }
    }

    @Deprecated
    public interface OooO0OO {
        void OooO00o();
    }

    public interface OooO0o {
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean OooO00o() {
        return this.f17182Oooo0oo;
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
        return this.f16776OoooO.OooO0OO();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f16776OoooO.OooO0O0(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f16778OoooO00;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f16777OoooO0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.OooOO0<T>>] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f16780OoooOO0;
        if (i != -1) {
            com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = this.f16776OoooO;
            OooOO0<T> oooOO1 = (OooOO0) oooO0O0.f17202OooO00o.get(Integer.valueOf(i));
            if (oooOO1 != 0 && oooO0O0.OooO00o(oooOO1)) {
                oooO0O0.OooO0Oo();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0000OO0.OooO0O0.OooO00o(getRowCount(), this.f17182Oooo0oo ? getChipCount() : -1, false, this.f16776OoooO.f17205OooO0Oo ? 1 : 2).f28216OooO00o);
    }

    public void setChipSpacing(@Dimension int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@Dimension int i) {
        if (this.f16778OoooO00 != i) {
            this.f16778OoooO00 = i;
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
        if (this.f16777OoooO0 != i) {
            this.f16777OoooO0 = i;
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
            setOnCheckedStateChangeListener(new OooO0O0(oooO0OO));
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable OooO0o oooO0o) {
        this.f16779OoooO0O = oooO0o;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f16781o000oOoO.f16782Oooo0o = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f16776OoooO.f17206OooO0o0 = z;
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

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.OooOO0<T>>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public void setSingleSelection(boolean z) {
        com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = this.f16776OoooO;
        if (oooO0O0.f17205OooO0Oo != z) {
            oooO0O0.f17205OooO0Oo = z;
            boolean z2 = !oooO0O0.f17203OooO0O0.isEmpty();
            Iterator it = oooO0O0.f17202OooO00o.values().iterator();
            while (it.hasNext()) {
                oooO0O0.OooO0o0((OooOO0) it.next(), false);
            }
            if (z2) {
                oooO0O0.OooO0Oo();
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.chipGroupStyle);
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
        int i2 = f16775OoooOOO;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        com.google.android.material.internal.OooO0O0<Chip> oooO0O0 = new com.google.android.material.internal.OooO0O0<>();
        this.f16776OoooO = oooO0O0;
        OooO oooO = new OooO();
        this.f16781o000oOoO = oooO;
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(getContext(), attributeSet, Oooo0.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayOooO0Oo.getBoolean(Oooo0.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayOooO0Oo.getBoolean(Oooo0.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayOooO0Oo.getBoolean(Oooo0.ChipGroup_selectionRequired, false));
        this.f16780OoooOO0 = typedArrayOooO0Oo.getResourceId(Oooo0.ChipGroup_checkedChip, -1);
        typedArrayOooO0Oo.recycle();
        oooO0O0.f17204OooO0OO = new OooO00o();
        super.setOnHierarchyChangeListener(oooO);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 1);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
