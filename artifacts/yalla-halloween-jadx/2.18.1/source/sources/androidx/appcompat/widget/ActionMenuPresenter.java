package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMenuPresenter extends androidx.appcompat.view.menu.OooO00o implements o000O0O0.OooO00o.InterfaceC0294OooO00o {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Drawable f4851OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f4852OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f4853OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f4854OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f4855OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f4856Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f4857Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f4858OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final SparseBooleanArray f4859OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public OooO f4860OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public OooO0OO f4861Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public OooO00o f4862Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public OooO0O0 f4863OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final OooOO0 f4864Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public OooO0o f4865o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f4866o0OoOo0;

    public class OooO extends androidx.appcompat.view.menu.OooOO0O {
        public OooO(Context context, androidx.appcompat.view.menu.OooO0o oooO0o, View view) {
            super(context, oooO0o, view, true, OooOo00.OooO00o.actionOverflowMenuStyle, 0);
            this.f4766OooO0oO = 8388613;
            OooO0Oo(ActionMenuPresenter.this.f4864Ooooooo);
        }

        @Override // androidx.appcompat.view.menu.OooOO0O
        public final void OooO0OO() {
            androidx.appcompat.view.menu.OooO0o oooO0o = ActionMenuPresenter.this.f4683Oooo0oo;
            if (oooO0o != null) {
                oooO0o.OooO0Oo(true);
            }
            ActionMenuPresenter.this.f4860OooooOo = null;
            super.OooO0OO();
        }
    }

    public class OooO00o extends androidx.appcompat.view.menu.OooOO0O {
        public OooO00o(Context context, androidx.appcompat.view.menu.OooOo00 oooOo00, View view) {
            super(context, oooOo00, view, false, OooOo00.OooO00o.actionOverflowMenuStyle, 0);
            if (!oooOo00.f4796OooOoOO.OooO0oO()) {
                View view2 = ActionMenuPresenter.this.f4865o000oOoO;
                this.f4764OooO0o = view2 == null ? (View) ActionMenuPresenter.this.f4684OoooO : view2;
            }
            OooO0Oo(ActionMenuPresenter.this.f4864Ooooooo);
        }

        @Override // androidx.appcompat.view.menu.OooOO0O
        public final void OooO0OO() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f4862Oooooo0 = null;
            actionMenuPresenter.f4866o0OoOo0 = 0;
            super.OooO0OO();
        }
    }

    public class OooO0O0 extends ActionMenuItemView.OooO0O0 {
        public OooO0O0() {
        }
    }

    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO f4870Oooo0o;

        public OooO0OO(OooO oooO) {
            this.f4870Oooo0o = oooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.OooO0o.OooO00o oooO00o;
            androidx.appcompat.view.menu.OooO0o oooO0o = ActionMenuPresenter.this.f4683Oooo0oo;
            if (oooO0o != null && (oooO00o = oooO0o.f4711OooO0o0) != null) {
                oooO00o.OooO0O0(oooO0o);
            }
            View view = (View) ActionMenuPresenter.this.f4684OoooO;
            if (view != null && view.getWindowToken() != null) {
                OooO oooO = this.f4870Oooo0o;
                boolean z = true;
                if (!oooO.OooO0O0()) {
                    if (oooO.f4764OooO0o == null) {
                        z = false;
                    } else {
                        oooO.OooO0o0(0, 0, false, false);
                    }
                }
                if (z) {
                    ActionMenuPresenter.this.f4860OooooOo = this.f4870Oooo0o;
                }
            }
            ActionMenuPresenter.this.f4861Oooooo = null;
        }
    }

    public class OooO0o extends AppCompatImageView implements ActionMenuView.OooO00o {

        public class OooO00o extends o0OO00O {
            public OooO00o(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.o0OO00O
            public final p015OooOoO.o00Oo0 OooO0O0() {
                OooO oooO = ActionMenuPresenter.this.f4860OooooOo;
                if (oooO == null) {
                    return null;
                }
                return oooO.OooO00o();
            }

            @Override // androidx.appcompat.widget.o0OO00O
            public final boolean OooO0OO() {
                ActionMenuPresenter.this.OooOOOO();
                return true;
            }

            @Override // androidx.appcompat.widget.o0OO00O
            public final boolean OooO0Oo() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f4861Oooooo != null) {
                    return false;
                }
                actionMenuPresenter.OooOO0();
                return true;
            }
        }

        public OooO0o(Context context) {
            super(context, null, OooOo00.OooO00o.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            o0000OO0.OooO00o(this, getContentDescription());
            setOnTouchListener(new OooO00o(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
        public final boolean OooO00o() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
        public final boolean OooO0O0() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.OooOOOO();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                o000Ooo.o0OOO0o.OooO0O0.OooO0o(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class OooOO0 implements androidx.appcompat.view.menu.OooOOO0.OooO00o {
        public OooOO0() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final void OooO0OO(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
            if (oooO0o instanceof androidx.appcompat.view.menu.OooOo00) {
                oooO0o.OooOO0o().OooO0Oo(false);
            }
            androidx.appcompat.view.menu.OooOOO0.OooO00o oooO00o = ActionMenuPresenter.this.f4686OoooO00;
            if (oooO00o != null) {
                oooO00o.OooO0OO(oooO0o, z);
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final boolean OooO0Oo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (oooO0o == actionMenuPresenter.f4683Oooo0oo) {
                return false;
            }
            actionMenuPresenter.f4866o0OoOo0 = ((androidx.appcompat.view.menu.OooOo00) oooO0o).f4796OooOoOO.f4730OooO00o;
            androidx.appcompat.view.menu.OooOOO0.OooO00o oooO00o = actionMenuPresenter.f4686OoooO00;
            if (oooO00o != null) {
                return oooO00o.OooO0Oo(oooO0o);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f4875Oooo0o;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4875Oooo0o);
        }

        public SavedState(Parcel parcel) {
            this.f4875Oooo0o = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, OooOo00.OooOO0O.abc_action_menu_layout, OooOo00.OooOO0O.abc_action_menu_item_layout);
        this.f4859OooooOO = new SparseBooleanArray();
        this.f4864Ooooooo = new OooOO0();
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f4875Oooo0o) > 0 && (menuItemFindItem = this.f4683Oooo0oo.findItem(i)) != null) {
            OooOO0O((androidx.appcompat.view.menu.OooOo00) menuItemFindItem.getSubMenu());
        }
    }

    public final boolean OooO00o() {
        boolean z;
        boolean zOooOO0 = OooOO0();
        OooO00o oooO00o = this.f4862Oooooo0;
        if (oooO00o != null) {
            if (oooO00o.OooO0O0()) {
                oooO00o.f4768OooOO0.dismiss();
            }
            z = true;
        } else {
            z = false;
        }
        return zOooOO0 | z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0O0(androidx.appcompat.view.menu.OooOO0 oooOO1, View view, ViewGroup viewGroup) {
        View actionView = oooOO1.getActionView();
        if (actionView == null || oooOO1.OooO0o()) {
            androidx.appcompat.view.menu.OooOOO.OooO00o oooO00o = view instanceof androidx.appcompat.view.menu.OooOOO.OooO00o ? (androidx.appcompat.view.menu.OooOOO.OooO00o) view : (androidx.appcompat.view.menu.OooOOO.OooO00o) this.f4680Oooo.inflate(this.f4687OoooO0O, viewGroup, false);
            oooO00o.OooO0Oo(oooOO1);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) oooO00o;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f4684OoooO);
            if (this.f4863OoooooO == null) {
                this.f4863OoooooO = new OooO0O0();
            }
            actionMenuItemView.setPopupCallback(this.f4863OoooooO);
            actionView = (View) oooO00o;
        }
        actionView.setVisibility(oooOO1.f4756OooOoo ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0OO(androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
        OooO00o();
        androidx.appcompat.view.menu.OooOOO0.OooO00o oooO00o = this.f4686OoooO00;
        if (oooO00o != null) {
            oooO00o.OooO0OO(oooO0o, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0Oo(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f4684OoooO;
        boolean z3 = false;
        ArrayList<androidx.appcompat.view.menu.OooOO0> arrayList = null;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.OooO0o oooO0o = this.f4683Oooo0oo;
            if (oooO0o != null) {
                oooO0o.OooOO0();
                ArrayList<androidx.appcompat.view.menu.OooOO0> arrayListOooOOO0 = this.f4683Oooo0oo.OooOOO0();
                int size = arrayListOooOOO0.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.appcompat.view.menu.OooOO0 oooOO1 = arrayListOooOOO0.get(i2);
                    if (oooOO1.OooO0oO()) {
                        View childAt = viewGroup.getChildAt(i);
                        androidx.appcompat.view.menu.OooOO0 itemData = childAt instanceof androidx.appcompat.view.menu.OooOOO.OooO00o ? ((androidx.appcompat.view.menu.OooOOO.OooO00o) childAt).getItemData() : null;
                        View viewOooO0O0 = OooO0O0(oooOO1, childAt, viewGroup);
                        if (oooOO1 != itemData) {
                            viewOooO0O0.setPressed(false);
                            viewOooO0O0.jumpDrawablesToCurrentState();
                        }
                        if (viewOooO0O0 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewOooO0O0.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewOooO0O0);
                            }
                            ((ViewGroup) this.f4684OoooO).addView(viewOooO0O0, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f4865o000oOoO) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f4684OoooO).requestLayout();
        androidx.appcompat.view.menu.OooO0o oooO0o2 = this.f4683Oooo0oo;
        if (oooO0o2 != null) {
            oooO0o2.OooOO0();
            ArrayList<androidx.appcompat.view.menu.OooOO0> arrayList2 = oooO0o2.f4705OooO;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                o000O0O0.OooO00o oooO00o = arrayList2.get(i3).f4755OooOoOO;
                if (oooO00o != null) {
                    oooO00o.f28101OooO00o = this;
                }
            }
        }
        androidx.appcompat.view.menu.OooO0o oooO0o3 = this.f4683Oooo0oo;
        if (oooO0o3 != null) {
            oooO0o3.OooOO0();
            arrayList = oooO0o3.f4714OooOO0;
        }
        if (this.f4853OoooOo0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f4756OooOoo;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f4865o000oOoO == null) {
                this.f4865o000oOoO = new OooO0o(this.f4681Oooo0o);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f4865o000oOoO.getParent();
            if (viewGroup3 != this.f4684OoooO) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f4865o000oOoO);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4684OoooO;
                OooO0o oooO0o4 = this.f4865o000oOoO;
                ActionMenuView.LayoutParams layoutParamsOooOO0o = actionMenuView.generateDefaultLayoutParams();
                layoutParamsOooOO0o.f4888OooO00o = true;
                actionMenuView.addView(oooO0o4, layoutParamsOooOO0o);
            }
        } else {
            OooO0o oooO0o5 = this.f4865o000oOoO;
            if (oooO0o5 != null) {
                Object parent = oooO0o5.getParent();
                Object obj = this.f4684OoooO;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f4865o000oOoO);
                }
            }
        }
        ((ActionMenuView) this.f4684OoooO).setOverflowReserved(this.f4853OoooOo0);
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0o0() {
        ArrayList<androidx.appcompat.view.menu.OooOO0> arrayListOooOOO0;
        int size;
        int i;
        boolean z;
        androidx.appcompat.view.menu.OooO0o oooO0o = this.f4683Oooo0oo;
        if (oooO0o != null) {
            arrayListOooOOO0 = oooO0o.OooOOO0();
            size = arrayListOooOOO0.size();
        } else {
            arrayListOooOOO0 = null;
            size = 0;
        }
        int i2 = this.f4857Ooooo0o;
        int i3 = this.f4856Ooooo00;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f4684OoooO;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            androidx.appcompat.view.menu.OooOO0 oooOO1 = arrayListOooOOO0.get(i4);
            int i7 = oooOO1.f4754OooOoO0;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.f4858OooooO0 && oooOO1.f4756OooOoo) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f4853OoooOo0 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.f4859OooooOO;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            androidx.appcompat.view.menu.OooOO0 oooOO2 = arrayListOooOOO0.get(i9);
            int i11 = oooOO2.f4754OooOoO0;
            if ((i11 & 2) == i) {
                View viewOooO0O0 = OooO0O0(oooOO2, null, viewGroup);
                viewOooO0O0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewOooO0O0.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i12 = oooOO2.f4731OooO0O0;
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                oooOO2.OooOO0o(z);
            } else {
                if ((i11 & 1) == z) {
                    int i13 = oooOO2.f4731OooO0O0;
                    boolean z3 = sparseBooleanArray.get(i13);
                    boolean z4 = (i8 > 0 || z3) && i3 > 0;
                    if (z4) {
                        View viewOooO0O1 = OooO0O0(oooOO2, null, viewGroup);
                        viewOooO0O1.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewOooO0O1.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z4 &= i3 + i10 > 0;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i9; i14++) {
                            androidx.appcompat.view.menu.OooOO0 oooOO3 = arrayListOooOOO0.get(i14);
                            if (oooOO3.f4731OooO0O0 == i13) {
                                if (oooOO3.OooO0oO()) {
                                    i8++;
                                }
                                oooOO3.OooOO0o(false);
                            }
                        }
                    }
                    if (z4) {
                        i8--;
                    }
                    oooOO2.OooOO0o(z4);
                } else {
                    oooOO2.OooOO0o(false);
                }
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oo(@NonNull Context context, @Nullable androidx.appcompat.view.menu.OooO0o oooO0o) {
        this.f4682Oooo0oO = context;
        LayoutInflater.from(context);
        this.f4683Oooo0oo = oooO0o;
        Resources resources = context.getResources();
        if (!this.f4854OoooOoO) {
            this.f4853OoooOo0 = true;
        }
        int i = 2;
        this.f4855OoooOoo = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f4857Ooooo0o = i;
        int measuredWidth = this.f4855OoooOoo;
        if (this.f4853OoooOo0) {
            if (this.f4865o000oOoO == null) {
                OooO0o oooO0o2 = new OooO0o(this.f4681Oooo0o);
                this.f4865o000oOoO = oooO0o2;
                if (this.f4852OoooOOo) {
                    oooO0o2.setImageDrawable(this.f4851OoooOOO);
                    this.f4851OoooOOO = null;
                    this.f4852OoooOOo = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4865o000oOoO.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f4865o000oOoO.getMeasuredWidth();
        } else {
            this.f4865o000oOoO = null;
        }
        this.f4856Ooooo00 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean OooOO0() {
        Object obj;
        OooO0OO oooO0OO = this.f4861Oooooo;
        if (oooO0OO != null && (obj = this.f4684OoooO) != null) {
            ((View) obj).removeCallbacks(oooO0OO);
            this.f4861Oooooo = null;
            return true;
        }
        OooO oooO = this.f4860OooooOo;
        if (oooO == null) {
            return false;
        }
        if (oooO.OooO0O0()) {
            oooO.f4768OooOO0.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOO0O(androidx.appcompat.view.menu.OooOo00 oooOo00) {
        boolean z;
        boolean z2 = false;
        if (!oooOo00.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.OooOo00 oooOo01 = oooOo00;
        while (true) {
            androidx.appcompat.view.menu.OooO0o oooO0o = oooOo01.f4795OooOoO;
            if (oooO0o == this.f4683Oooo0oo) {
                break;
            }
            oooOo01 = (androidx.appcompat.view.menu.OooOo00) oooO0o;
        }
        androidx.appcompat.view.menu.OooOO0 oooOO1 = oooOo01.f4796OooOoOO;
        ViewGroup viewGroup = (ViewGroup) this.f4684OoooO;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof androidx.appcompat.view.menu.OooOOO.OooO00o) && ((androidx.appcompat.view.menu.OooOOO.OooO00o) childAt).getItemData() == oooOO1) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.f4866o0OoOo0 = oooOo00.f4796OooOoOO.f4730OooO00o;
        int size = oooOo00.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = oooOo00.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        OooO00o oooO00o = new OooO00o(this.f4682Oooo0oO, oooOo00, view);
        this.f4862Oooooo0 = oooO00o;
        oooO00o.f4767OooO0oo = z;
        p015OooOoO.o0OoOo0 o0oooo1 = oooO00o.f4768OooOO0;
        if (o0oooo1 != null) {
            o0oooo1.OooOOo0(z);
        }
        OooO00o oooO00o2 = this.f4862Oooooo0;
        if (oooO00o2.OooO0O0()) {
            z2 = true;
        } else if (oooO00o2.f4764OooO0o != null) {
            oooO00o2.OooO0o0(0, 0, false, false);
            z2 = true;
        }
        if (!z2) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        androidx.appcompat.view.menu.OooOOO0.OooO00o oooO00o3 = this.f4686OoooO00;
        if (oooO00o3 != null) {
            oooO00o3.OooO0Oo(oooOo00);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final Parcelable OooOO0o() {
        SavedState savedState = new SavedState();
        savedState.f4875Oooo0o = this.f4866o0OoOo0;
        return savedState;
    }

    public final boolean OooOOO() {
        OooO oooO = this.f4860OooooOo;
        return oooO != null && oooO.OooO0O0();
    }

    public final boolean OooOOOO() {
        androidx.appcompat.view.menu.OooO0o oooO0o;
        if (!this.f4853OoooOo0 || OooOOO() || (oooO0o = this.f4683Oooo0oo) == null || this.f4684OoooO == null || this.f4861Oooooo != null) {
            return false;
        }
        oooO0o.OooOO0();
        if (oooO0o.f4714OooOO0.isEmpty()) {
            return false;
        }
        OooO0OO oooO0OO = new OooO0OO(new OooO(this.f4682Oooo0oO, this.f4683Oooo0oo, this.f4865o000oOoO));
        this.f4861Oooooo = oooO0OO;
        ((View) this.f4684OoooO).post(oooO0OO);
        return true;
    }
}
