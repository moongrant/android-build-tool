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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import java.util.HashMap;
import p058o0000OoO.OooOO0;
import p058o0000OoO.OooOO0O;
import p065o0000oO0.o000O00;
import p065o0000oO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooOO0O f7489Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int[] f7490Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f7491Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Context f7492Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public HashMap<Integer, String> f7493OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f7494OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f7495OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View[] f7496OoooO0O;

    public ConstraintHelper(Context context) {
        super(context);
        this.f7490Oooo0o = new int[32];
        this.f7496OoooO0O = null;
        this.f7493OoooO = new HashMap<>();
        this.f7492Oooo0oo = context;
        OooOOO(null);
    }

    public final void OooO(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f7491Oooo0oO; i++) {
            View viewById = constraintLayout.getViewById(this.f7490Oooo0o[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void OooO0o(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f7491Oooo0oO + 1;
        int[] iArr = this.f7490Oooo0o;
        if (i2 > iArr.length) {
            this.f7490Oooo0o = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f7490Oooo0o;
        int i3 = this.f7491Oooo0oO;
        iArr2[i3] = i;
        this.f7491Oooo0oO = i3 + 1;
    }

    public final void OooO0o0(String str) {
        if (str == null || str.length() == 0 || this.f7492Oooo0oo == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iOooOO0o = OooOO0o(strTrim);
        if (iOooOO0o != 0) {
            this.f7493OoooO.put(Integer.valueOf(iOooOO0o), strTrim);
            OooO0o(iOooOO0o);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    public final void OooO0oO(String str) {
        if (str == null || str.length() == 0 || this.f7492Oooo0oo == null) {
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
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).f7546OoooOo0)) {
                if (childAt.getId() == -1) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("to use ConstraintTag view ");
                    sbOooO0o0.append(childAt.getClass().getSimpleName());
                    sbOooO0o0.append(" must have an ID");
                    Log.w("ConstraintHelper", sbOooO0o0.toString());
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
        if (str == null || constraintLayout == null || (resources = this.f7492Oooo0oo.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
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
                iOooOO0O = o000Oo0.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iOooOO0O == 0 ? this.f7492Oooo0oo.getResources().getIdentifier(str, "id", this.f7492Oooo0oo.getPackageName()) : iOooOO0O;
    }

    public void OooOOO(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f7495OoooO00 = string;
                    setIds(string);
                } else if (index == o000O00.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f7494OoooO0 = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final View[] OooOOO0(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f7496OoooO0O;
        if (viewArr == null || viewArr.length != this.f7491Oooo0oO) {
            this.f7496OoooO0O = new View[this.f7491Oooo0oO];
        }
        for (int i = 0; i < this.f7491Oooo0oO; i++) {
            this.f7496OoooO0O[i] = constraintLayout.getViewById(this.f7490Oooo0o[i]);
        }
        return this.f7496OoooO0O;
    }

    public void OooOOOO(OooO00o.C0043OooO00o c0043OooO00o, OooOO0O oooOO0O, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        OooO00o.OooO0O0 oooO0O0 = c0043OooO00o.f7620OooO0o0;
        int[] iArr = oooO0O0.f7696Ooooooo;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = oooO0O0.f7702o0OoOo0;
            if (str != null) {
                if (str.length() > 0) {
                    OooO00o.OooO0O0 oooO0O1 = c0043OooO00o.f7620OooO0o0;
                    String[] strArrSplit = oooO0O1.f7702o0OoOo0.split(",");
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
                    oooO0O1.f7696Ooooooo = iArrCopyOf;
                } else {
                    c0043OooO00o.f7620OooO0o0.f7696Ooooooo = null;
                }
            }
        }
        oooOO0O.OooO00o();
        if (c0043OooO00o.f7620OooO0o0.f7696Ooooooo == null) {
            return;
        }
        while (true) {
            int[] iArr2 = c0043OooO00o.f7620OooO0o0.f7696Ooooooo;
            if (i >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = sparseArray.get(iArr2[i]);
            if (constraintWidget != null) {
                oooOO0O.OooO0O0(constraintWidget);
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

    public void OooOOoo(OooOO0 oooOO1, SparseArray sparseArray) {
        oooOO1.OooO00o();
        for (int i = 0; i < this.f7491Oooo0oO; i++) {
            oooOO1.OooO0O0((ConstraintWidget) sparseArray.get(this.f7490Oooo0o[i]));
        }
    }

    public final void OooOo00() {
        if (this.f7489Oooo == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f7563o00ooo = this.f7489Oooo;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f7490Oooo0o, this.f7491Oooo0oO);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f7495OoooO00;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f7494OoooO0;
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
        this.f7495OoooO00 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f7491Oooo0oO = 0;
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
        this.f7494OoooO0 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f7491Oooo0oO = 0;
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
        this.f7495OoooO00 = null;
        this.f7491Oooo0oO = 0;
        for (int i : iArr) {
            OooO0o(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f7495OoooO00 == null) {
            OooO0o(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7490Oooo0o = new int[32];
        this.f7496OoooO0O = null;
        this.f7493OoooO = new HashMap<>();
        this.f7492Oooo0oo = context;
        OooOOO(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7490Oooo0o = new int[32];
        this.f7496OoooO0O = null;
        this.f7493OoooO = new HashMap<>();
        this.f7492Oooo0oo = context;
        OooOOO(attributeSet);
    }
}
