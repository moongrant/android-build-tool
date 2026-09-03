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
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import o000O0O0.OooOO0;
import o000O0O0.o00000O;
import p072o000O0o0.o0000OO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o0ooOOo;
import p347o0OOO0o0.oo000o;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final int f16695OoooOOO = Oooo000.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Comparator<MaterialButton> f16696Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<OooO0OO> f16697Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO f16698Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final LinkedHashSet<OooO0o> f16699Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f16700OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f16701OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Integer[] f16702OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f16703OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @IdRes
    public final int f16704OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Set<Integer> f16705o000oOoO;

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
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    public class OooO0O0 extends androidx.core.view.OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            int i;
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i2 = MaterialButtonToggleGroup.f16695OoooOOO;
            Objects.requireNonNull(materialButtonToggleGroup);
            if (view instanceof MaterialButton) {
                i = 0;
                for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                    if (materialButtonToggleGroup.getChildAt(i3) != view) {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.OooO0Oo(i3)) {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            o0000oo1.Oooo0(o0000OO0.OooO0OO.OooO00o(0, 1, i, 1, ((MaterialButton) view).isChecked()));
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final oo000o f16709OooO0o0 = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0ooOOo f16710OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o0ooOOo f16711OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o0ooOOo f16712OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0ooOOo f16713OooO0Oo;

        public OooO0OO(o0ooOOo o0ooooo2, o0ooOOo o0ooooo3, o0ooOOo o0ooooo4, o0ooOOo o0ooooo5) {
            this.f16710OooO00o = o0ooooo2;
            this.f16711OooO0O0 = o0ooooo4;
            this.f16712OooO0OO = o0ooooo5;
            this.f16713OooO0Oo = o0ooooo3;
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
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            materialButton.setId(ViewCompat.OooO.OooO00o());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f16698Oooo0oO);
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
                OooOO0.OooO0oO(layoutParams2, 0);
                OooOO0.OooO0oo(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                OooOO0.OooO0oo(layoutParams2, 0);
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
            OooOO0.OooO0oO(layoutParams3, 0);
            OooOO0.OooO0oo(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void OooO0O0(@IdRes int i, boolean z) {
        if (i == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f16705o000oOoO);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f16703OoooO0O && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f16700OoooO || hashSet.size() > 1) {
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

    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$OooO0OO>] */
    @VisibleForTesting
    public final void OooO0o() {
        OooO0OO oooO0OO;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonOooO0OO = OooO0OO(i);
            if (materialButtonOooO0OO.getVisibility() != 8) {
                com.google.android.material.shape.OooO00o shapeAppearanceModel = materialButtonOooO0OO.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(shapeAppearanceModel);
                OooO0OO oooO0OO2 = (OooO0OO) this.f16697Oooo0o.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            o0ooOOo o0ooooo2 = oooO0OO2.f16710OooO00o;
                            oo000o oo000oVar = OooO0OO.f16709OooO0o0;
                            oooO0OO = new OooO0OO(o0ooooo2, oo000oVar, oooO0OO2.f16711OooO0O0, oo000oVar);
                        } else if (o00Ooo.OooO0o(this)) {
                            oo000o oo000oVar2 = OooO0OO.f16709OooO0o0;
                            oooO0OO = new OooO0OO(oo000oVar2, oo000oVar2, oooO0OO2.f16711OooO0O0, oooO0OO2.f16712OooO0OO);
                        } else {
                            o0ooOOo o0ooooo3 = oooO0OO2.f16710OooO00o;
                            o0ooOOo o0ooooo4 = oooO0OO2.f16713OooO0Oo;
                            oo000o oo000oVar3 = OooO0OO.f16709OooO0o0;
                            oooO0OO = new OooO0OO(o0ooooo3, o0ooooo4, oo000oVar3, oo000oVar3);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        oooO0OO2 = null;
                    } else if (!z) {
                        oo000o oo000oVar4 = OooO0OO.f16709OooO0o0;
                        oooO0OO = new OooO0OO(oo000oVar4, oooO0OO2.f16713OooO0Oo, oo000oVar4, oooO0OO2.f16712OooO0OO);
                    } else if (o00Ooo.OooO0o(this)) {
                        o0ooOOo o0ooooo5 = oooO0OO2.f16710OooO00o;
                        o0ooOOo o0ooooo6 = oooO0OO2.f16713OooO0Oo;
                        oo000o oo000oVar5 = OooO0OO.f16709OooO0o0;
                        oooO0OO = new OooO0OO(o0ooooo5, o0ooooo6, oo000oVar5, oo000oVar5);
                    } else {
                        oo000o oo000oVar6 = OooO0OO.f16709OooO0o0;
                        oooO0OO = new OooO0OO(oo000oVar6, oo000oVar6, oooO0OO2.f16711OooO0O0, oooO0OO2.f16712OooO0OO);
                    }
                    oooO0OO2 = oooO0OO;
                }
                if (oooO0OO2 == null) {
                    c0110OooO00o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                } else {
                    c0110OooO00o.f17573OooO0o0 = oooO0OO2.f16710OooO00o;
                    c0110OooO00o.f17575OooO0oo = oooO0OO2.f16713OooO0Oo;
                    c0110OooO00o.f17572OooO0o = oooO0OO2.f16711OooO0O0;
                    c0110OooO00o.f17574OooO0oO = oooO0OO2.f16712OooO0OO;
                }
                materialButtonOooO0OO.setShapeAppearanceModel(new com.google.android.material.shape.OooO00o(c0110OooO00o));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final void OooO0o0(Set<Integer> set) {
        ?? r0 = this.f16705o000oOoO;
        this.f16705o000oOoO = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = OooO0OO(i).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f16701OoooO0 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f16701OoooO0 = false;
            }
            if (r0.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<OooO0o> it = this.f16699Oooo0oo.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o();
                }
            }
        }
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$OooO0OO>] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        OooO0O0(materialButton.getId(), materialButton.isChecked());
        com.google.android.material.shape.OooO00o shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f16697Oooo0o.add(new OooO0OO(shapeAppearanceModel.f17561OooO0o0, shapeAppearanceModel.f17563OooO0oo, shapeAppearanceModel.f17560OooO0o, shapeAppearanceModel.f17562OooO0oO));
        ViewCompat.OooOo0o(materialButton, new OooO0O0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f16696Oooo);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(OooO0OO(i), Integer.valueOf(i));
        }
        this.f16702OoooO00 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    @IdRes
    public int getCheckedButtonId() {
        if (!this.f16703OoooO0O || this.f16705o000oOoO.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f16705o000oOoO.iterator().next()).intValue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = OooO0OO(i).getId();
            if (this.f16705o000oOoO.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f16702OoooO00;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f16704OoooOO0;
        if (i != -1) {
            OooO0o0(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0000OO0.OooO0O0.OooO00o(1, getVisibleButtonCount(), false, this.f16703OoooO0O ? 1 : 2).f28216OooO00o);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0o();
        OooO00o();
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$OooO0OO>] */
    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f16697Oooo0o.remove(iIndexOfChild);
        }
        OooO0o();
        OooO00o();
    }

    public void setSelectionRequired(boolean z) {
        this.f16700OoooO = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f16703OoooO0O != z) {
            this.f16703OoooO0O = z;
            OooO0o0(new HashSet());
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16695OoooOOO;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16697Oooo0o = new ArrayList();
        this.f16698Oooo0oO = new OooO();
        this.f16699Oooo0oo = new LinkedHashSet<>();
        this.f16696Oooo = new OooO00o();
        this.f16701OoooO0 = false;
        this.f16705o000oOoO = new HashSet();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(getContext(), attributeSet, Oooo0.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayOooO0Oo.getBoolean(Oooo0.MaterialButtonToggleGroup_singleSelection, false));
        this.f16704OoooOO0 = typedArrayOooO0Oo.getResourceId(Oooo0.MaterialButtonToggleGroup_checkedButton, -1);
        this.f16700OoooO = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayOooO0Oo.recycle();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 1);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
