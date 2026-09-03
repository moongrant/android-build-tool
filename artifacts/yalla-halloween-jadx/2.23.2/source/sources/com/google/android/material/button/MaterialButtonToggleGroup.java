package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00O0O;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p280o0O00o0O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int f16079OooOOO = o0000O0O.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f16080OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f16081OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedHashSet<OooO0o> f16082OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO f16083OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f16084OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Integer[] f16085OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f16086OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f16087OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @IdRes
    public final int f16088OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public HashSet f16089OooOOO0;

    public class OooO implements MaterialButton.OooO0O0 {
        public OooO() {
        }
    }

    public class OooO00o implements Comparator<MaterialButton> {
        public OooO00o() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class OooO0O0 extends androidx.core.view.OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0O0O00 o0o0o00) {
            int i;
            super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
            int i2 = MaterialButtonToggleGroup.f16079OooOOO;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i3 = 0;
                for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                    if (materialButtonToggleGroup.getChildAt(i4) == view) {
                        i = i3;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.OooO0Oo(i4)) {
                            i3++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            o0o0o00.OooOOO0(o0O0O00.OooOO0O.OooO00o(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final p280o0O00o0O.OooO0OO f16093OooO0o0 = new p280o0O00o0O.OooO0OO(0.0f);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0 f16094OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOO0 f16095OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOO0 f16096OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOO0 f16097OooO0Oo;

        public OooO0OO(OooOO0 oooOO1, OooOO0 oooOO2, OooOO0 oooOO3, OooOO0 oooOO4) {
            this.f16094OooO00o = oooOO1;
            this.f16095OooO0O0 = oooOO3;
            this.f16096OooO0OO = oooOO4;
            this.f16097OooO0Oo = oooOO2;
        }
    }

    public interface OooO0o {
        void OooO00o();
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (OooO0Oo(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (OooO0Oo(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && OooO0Oo(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            materialButton.setId(ViewCompat.OooO.OooO00o());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f16083OooO0o0);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void OooO00o() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonOooO0OO = OooO0OO(i);
            int iMin = Math.min(materialButtonOooO0OO.getStrokeWidth(), OooO0OO(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButtonOooO0OO.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                o00O0O.OooO0oO(layoutParams2, 0);
                o00O0O.OooO0oo(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                o00O0O.OooO0oo(layoutParams2, 0);
            }
            materialButtonOooO0OO.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) OooO0OO(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            o00O0O.OooO0oO(layoutParams3, 0);
            o00O0O.OooO0oo(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void OooO0O0(@IdRes int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f16089OooOOO0);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f16086OooOO0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f16087OooOO0O || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        OooO0o0(hashSet);
    }

    public final MaterialButton OooO0OO(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final boolean OooO0Oo(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @VisibleForTesting
    public final void OooO0o() {
        OooO0OO oooO0OO;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonOooO0OO = OooO0OO(i);
            if (materialButtonOooO0OO.getVisibility() != 8) {
                com.google.android.material.shape.OooO0O0 shapeAppearanceModel = materialButtonOooO0OO.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o(shapeAppearanceModel);
                OooO0OO oooO0OO2 = (OooO0OO) this.f16081OooO0Oo.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    p280o0O00o0O.OooO0OO oooO0OO3 = OooO0OO.f16093OooO0o0;
                    if (i == firstVisibleChildIndex) {
                        oooO0OO = z ? oo0o0Oo.OooO0o(this) ? new OooO0OO(oooO0OO3, oooO0OO3, oooO0OO2.f16095OooO0O0, oooO0OO2.f16096OooO0OO) : new OooO0OO(oooO0OO2.f16094OooO00o, oooO0OO2.f16097OooO0Oo, oooO0OO3, oooO0OO3) : new OooO0OO(oooO0OO2.f16094OooO00o, oooO0OO3, oooO0OO2.f16095OooO0O0, oooO0OO3);
                    } else if (i != lastVisibleChildIndex) {
                        oooO0OO2 = null;
                    } else if (z) {
                        oooO0OO = oo0o0Oo.OooO0o(this) ? new OooO0OO(oooO0OO2.f16094OooO00o, oooO0OO2.f16097OooO0Oo, oooO0OO3, oooO0OO3) : new OooO0OO(oooO0OO3, oooO0OO3, oooO0OO2.f16095OooO0O0, oooO0OO2.f16096OooO0OO);
                    } else {
                        oooO0OO = new OooO0OO(oooO0OO3, oooO0OO2.f16097OooO0Oo, oooO0OO3, oooO0OO2.f16096OooO0OO);
                    }
                    oooO0OO2 = oooO0OO;
                }
                if (oooO0OO2 == null) {
                    oooO00o.OooO0O0(0.0f);
                } else {
                    oooO00o.f17168OooO0o0 = oooO0OO2.f16094OooO00o;
                    oooO00o.f17170OooO0oo = oooO0OO2.f16097OooO0Oo;
                    oooO00o.f17167OooO0o = oooO0OO2.f16095OooO0O0;
                    oooO00o.f17169OooO0oO = oooO0OO2.f16096OooO0OO;
                }
                materialButtonOooO0OO.setShapeAppearanceModel(new com.google.android.material.shape.OooO0O0(oooO00o));
            }
        }
    }

    public final void OooO0o0(Set<Integer> set) {
        HashSet hashSet = this.f16089OooOOO0;
        this.f16089OooOOO0 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = OooO0OO(i).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f16080OooO = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f16080OooO = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<OooO0o> it = this.f16082OooO0o.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        OooO0O0(materialButton.getId(), materialButton.isChecked());
        com.google.android.material.shape.OooO0O0 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f16081OooO0Oo.add(new OooO0OO(shapeAppearanceModel.f17156OooO0o0, shapeAppearanceModel.f17158OooO0oo, shapeAppearanceModel.f17155OooO0o, shapeAppearanceModel.f17157OooO0oO));
        materialButton.setEnabled(isEnabled());
        ViewCompat.OooOOOO(materialButton, new OooO0O0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f16084OooO0oO);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(OooO0OO(i), Integer.valueOf(i));
        }
        this.f16085OooO0oo = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.f16086OooOO0 || this.f16089OooOOO0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f16089OooOOO0.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = OooO0OO(i).getId();
            if (this.f16089OooOOO0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f16085OooO0oo;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f16088OooOO0o;
        if (i != -1) {
            OooO0o0(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0O0O00.OooOO0.OooO00o(1, getVisibleButtonCount(), this.f16086OooOO0 ? 1 : 2, false).f33532OooO00o);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0o();
        OooO00o();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f16081OooO0Oo.remove(iIndexOfChild);
        }
        OooO0o();
        OooO00o();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            OooO0OO(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f16087OooOO0O = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f16086OooOO0 != z) {
            this.f16086OooOO0 = z;
            OooO0o0(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            OooO0OO(i).setA11yClassName((this.f16086OooOO0 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16079OooOOO;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16081OooO0Oo = new ArrayList();
        this.f16083OooO0o0 = new OooO();
        this.f16082OooO0o = new LinkedHashSet<>();
        this.f16084OooO0oO = new OooO00o();
        this.f16080OooO = false;
        this.f16089OooOOO0 = new HashSet();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(getContext(), attributeSet, o000OO.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayOooO0Oo.getBoolean(o000OO.MaterialButtonToggleGroup_singleSelection, false));
        this.f16088OooOO0o = typedArrayOooO0Oo.getResourceId(o000OO.MaterialButtonToggleGroup_checkedButton, -1);
        this.f16087OooOO0O = typedArrayOooO0Oo.getBoolean(o000OO.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayOooO0Oo.getBoolean(o000OO.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayOooO0Oo.recycle();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 1);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
