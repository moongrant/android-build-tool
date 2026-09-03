package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f4914OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f4915OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f4916OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f4917OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public oo0o0Oo.OooO0O0 f4918OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f4919OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public View[] f4920OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final HashMap<Integer, String> f4921OooOO0O;

    public ConstraintHelper(Context context) {
        super(context);
        this.f4915OooO0Oo = new int[32];
        this.f4920OooOO0 = null;
        this.f4921OooOO0O = new HashMap<>();
        this.f4916OooO0o = context;
        OooOOO(null);
    }

    public final void OooO(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f4917OooO0o0; i++) {
            View viewById = constraintLayout.getViewById(this.f4915OooO0Oo[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void OooO0o(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f4917OooO0o0 + 1;
        int[] iArr = this.f4915OooO0Oo;
        if (i2 > iArr.length) {
            this.f4915OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f4915OooO0Oo;
        int i3 = this.f4917OooO0o0;
        iArr2[i3] = i;
        this.f4917OooO0o0 = i3 + 1;
    }

    public final void OooO0o0(String str) {
        if (str == null || str.length() == 0 || this.f4916OooO0o == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iOooOO0o = OooOO0o(strTrim);
        if (iOooOO0o != 0) {
            this.f4921OooOO0O.put(Integer.valueOf(iOooOO0o), strTrim);
            OooO0o(iOooOO0o);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void OooO0oO(String str) {
        if (str == null || str.length() == 0 || this.f4916OooO0o == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).f4971OoooOo0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    OooO0o(childAt.getId());
                }
            }
        }
    }

    public final void OooO0oo() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        OooO((ConstraintLayout) parent);
    }

    public void OooOO0(ConstraintLayout constraintLayout) {
    }

    public final int OooOO0O(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f4916OooO0o.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int OooOO0o(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iOooOO0O = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iOooOO0O = ((Integer) designInformation).intValue();
            }
        }
        if (iOooOO0O == 0 && constraintLayout != null) {
            iOooOO0O = OooOO0O(constraintLayout, str);
        }
        if (iOooOO0O == 0) {
            try {
                iOooOO0O = OooO0o.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iOooOO0O != 0) {
            return iOooOO0O;
        }
        Context context = this.f4916OooO0o;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public void OooOOO(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f4919OooO0oo = string;
                    setIds(string);
                } else if (index == OooO.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f4914OooO = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final View[] OooOOO0(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f4920OooOO0;
        if (viewArr == null || viewArr.length != this.f4917OooO0o0) {
            this.f4920OooOO0 = new View[this.f4917OooO0o0];
        }
        for (int i = 0; i < this.f4917OooO0o0; i++) {
            this.f4920OooOO0[i] = constraintLayout.getViewById(this.f4915OooO0Oo[i]);
        }
        return this.f4920OooOO0;
    }

    public void OooOOOO(OooO0O0.OooO00o oooO00o, oo0o0Oo.OooO0O0 oooO0O0, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        OooO0O0.C0117OooO0O0 c0117OooO0O0 = oooO00o.f5060OooO0o0;
        int[] iArr = c0117OooO0O0.f5136Ooooooo;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c0117OooO0O0.f5142o0OoOo0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = c0117OooO0O0.f5142o0OoOo0.split(",");
                    getContext();
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int iOooOO0o = OooOO0o(str2.trim());
                        if (iOooOO0o != 0) {
                            iArrCopyOf[i2] = iOooOO0o;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    c0117OooO0O0.f5136Ooooooo = iArrCopyOf;
                } else {
                    c0117OooO0O0.f5136Ooooooo = null;
                }
            }
        }
        oooO0O0.OooO0O0();
        if (c0117OooO0O0.f5136Ooooooo == null) {
            return;
        }
        while (true) {
            int[] iArr2 = c0117OooO0O0.f5136Ooooooo;
            if (i >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr2[i]);
            if (constraintWidget != null) {
                oooO0O0.OooO00o(constraintWidget);
            }
            i++;
        }
    }

    public void OooOOOo(ConstraintWidget constraintWidget, boolean z) {
    }

    public void OooOOo(ConstraintLayout constraintLayout) {
    }

    public void OooOOo0() {
    }

    public void OooOOoo(oo0o0Oo.OooO00o oooO00o, SparseArray sparseArray) {
        oooO00o.OooO0O0();
        for (int i = 0; i < this.f4917OooO0o0; i++) {
            oooO00o.OooO00o((ConstraintWidget) sparseArray.get(this.f4915OooO0Oo[i]));
        }
    }

    public final void OooOo00() {
        if (this.f4918OooO0oO == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f4988o00ooo = this.f4918OooO0oO;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4915OooO0Oo, this.f4917OooO0o0);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4919OooO0oo;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f4914OooO;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4919OooO0oo = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f4917OooO0o0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooO0o0(str.substring(i));
                return;
            } else {
                OooO0o0(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f4914OooO = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f4917OooO0o0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooO0oO(str.substring(i));
                return;
            } else {
                OooO0oO(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4919OooO0oo = null;
        this.f4917OooO0o0 = 0;
        for (int i : iArr) {
            OooO0o(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f4919OooO0oo == null) {
            OooO0o(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4915OooO0Oo = new int[32];
        this.f4920OooOO0 = null;
        this.f4921OooOO0O = new HashMap<>();
        this.f4916OooO0o = context;
        OooOOO(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4915OooO0Oo = new int[32];
        this.f4920OooOO0 = null;
        this.f4921OooOO0O = new HashMap<>();
        this.f4916OooO0o = context;
        OooOOO(attributeSet);
    }
}
