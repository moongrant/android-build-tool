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
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMenuPresenter extends androidx.appcompat.view.menu.OooO00o implements androidx.core.view.OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Drawable f2748OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooO0o f2749OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f2750OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f2751OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f2752OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f2753OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f2754OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO00o f2755OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f2756OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f2757OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final SparseBooleanArray f2758OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO f2759OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO0O0 f2760OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO0OO f2761OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooOO0 f2762OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f2763OooOoo0;

    public class OooO extends androidx.appcompat.view.menu.OooOOO0 {
        public OooO(Context context, androidx.appcompat.view.menu.OooO oooO, OooO0o oooO0o) {
            super(context, oooO, oooO0o, true, p012OooOo0O.OooOOO0.actionOverflowMenuStyle);
            this.f2663OooO0oO = 8388613;
            OooOO0 oooOO1 = ActionMenuPresenter.this.f2762OooOoOO;
            this.f2656OooO = oooOO1;
            p018OooOoo0.OooOo00 oooOo00 = this.f2665OooOO0;
            if (oooOo00 != null) {
                oooOo00.OooO0OO(oooOO1);
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final void OooO0OO() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.OooO oooO = actionMenuPresenter.f2597OooO0o;
            if (oooO != null) {
                oooO.OooO0OO(true);
            }
            actionMenuPresenter.f2759OooOo0o = null;
            super.OooO0OO();
        }
    }

    public class OooO00o extends androidx.appcompat.view.menu.OooOOO0 {
        public OooO00o(Context context, androidx.appcompat.view.menu.OooOo oooOo, View view) {
            super(context, oooOo, view, false, p012OooOo0O.OooOOO0.actionOverflowMenuStyle);
            if (!((oooOo.f2670OooOoOO.f2645OooOo & 32) == 32)) {
                View view2 = ActionMenuPresenter.this.f2749OooOOO0;
                this.f2661OooO0o = view2 == null ? (View) ActionMenuPresenter.this.f2602OooOO0O : view2;
            }
            OooOO0 oooOO1 = ActionMenuPresenter.this.f2762OooOoOO;
            this.f2656OooO = oooOO1;
            p018OooOoo0.OooOo00 oooOo00 = this.f2665OooOO0;
            if (oooOo00 != null) {
                oooOo00.OooO0OO(oooOO1);
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final void OooO0OO() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f2755OooOo = null;
            actionMenuPresenter.f2763OooOoo0 = 0;
            super.OooO0OO();
        }
    }

    public class OooO0O0 extends ActionMenuItemView.OooO0O0 {
        public OooO0O0() {
        }
    }

    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO f2767OooO0Oo;

        public OooO0OO(OooO oooO) {
            this.f2767OooO0Oo = oooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.OooO.OooO00o oooO00o;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.OooO oooO = actionMenuPresenter.f2597OooO0o;
            if (oooO != null && (oooO00o = oooO.f2577OooO0o0) != null) {
                oooO00o.OooO0O0(oooO);
            }
            View view = (View) actionMenuPresenter.f2602OooOO0O;
            if (view != null && view.getWindowToken() != null) {
                OooO oooO2 = this.f2767OooO0Oo;
                boolean z = true;
                if (!oooO2.OooO0O0()) {
                    if (oooO2.f2661OooO0o == null) {
                        z = false;
                    } else {
                        oooO2.OooO0Oo(0, 0, false, false);
                    }
                }
                if (z) {
                    actionMenuPresenter.f2759OooOo0o = oooO2;
                }
            }
            actionMenuPresenter.f2761OooOoO0 = null;
        }
    }

    public class OooO0o extends AppCompatImageView implements ActionMenuView.OooO00o {

        public class OooO00o extends o00000O0 {
            public OooO00o(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.o00000O0
            public final p018OooOoo0.Oooo000 OooO0O0() {
                OooO oooO = ActionMenuPresenter.this.f2759OooOo0o;
                if (oooO == null) {
                    return null;
                }
                return oooO.OooO00o();
            }

            @Override // androidx.appcompat.widget.o00000O0
            public final boolean OooO0OO() {
                ActionMenuPresenter.this.OooOOOO();
                return true;
            }

            @Override // androidx.appcompat.widget.o00000O0
            public final boolean OooO0Oo() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f2761OooOoO0 != null) {
                    return false;
                }
                actionMenuPresenter.OooOO0o();
                return true;
            }
        }

        public OooO0o(Context context) {
            super(context, null, p012OooOo0O.OooOOO0.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            o000O0O0.OooO00o(this, getContentDescription());
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
                o00000oo.o00Ooo.OooO0O0.OooO0o(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class OooOO0 implements androidx.appcompat.view.menu.OooOOO.OooO00o {
        public OooOO0() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO, boolean z) {
            if (oooO instanceof androidx.appcompat.view.menu.OooOo) {
                oooO.OooOO0O().OooO0OO(false);
            }
            androidx.appcompat.view.menu.OooOOO.OooO00o oooO00o = ActionMenuPresenter.this.f2600OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0O0(oooO, z);
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final boolean OooO0OO(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (oooO == actionMenuPresenter.f2597OooO0o) {
                return false;
            }
            actionMenuPresenter.f2763OooOoo0 = ((androidx.appcompat.view.menu.OooOo) oooO).f2670OooOoOO.f2627OooO00o;
            androidx.appcompat.view.menu.OooOOO.OooO00o oooO00o = actionMenuPresenter.f2600OooO0oo;
            if (oooO00o != null) {
                return oooO00o.OooO0OO(oooO);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f2772OooO0Oo;

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
            parcel.writeInt(this.f2772OooO0Oo);
        }

        public SavedState(Parcel parcel) {
            this.f2772OooO0Oo = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, p012OooOo0O.Oooo0.abc_action_menu_layout, p012OooOo0O.Oooo0.abc_action_menu_item_layout);
        this.f2758OooOo0O = new SparseBooleanArray();
        this.f2762OooOoOO = new OooOO0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f2602OooOO0O;
        ArrayList<androidx.appcompat.view.menu.OooOO0O> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.OooO oooO = this.f2597OooO0o;
            if (oooO != null) {
                oooO.OooO();
                ArrayList<androidx.appcompat.view.menu.OooOO0O> arrayListOooOO0o = this.f2597OooO0o.OooOO0o();
                int size = arrayListOooOO0o.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.appcompat.view.menu.OooOO0O oooOO0O = arrayListOooOO0o.get(i2);
                    if ((oooOO0O.f2645OooOo & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        androidx.appcompat.view.menu.OooOO0O itemData = childAt instanceof androidx.appcompat.view.menu.OooOOOO.OooO00o ? ((androidx.appcompat.view.menu.OooOOOO.OooO00o) childAt).getItemData() : null;
                        View viewOooO00o = OooO00o(oooOO0O, childAt, viewGroup);
                        if (oooOO0O != itemData) {
                            viewOooO00o.setPressed(false);
                            viewOooO00o.jumpDrawablesToCurrentState();
                        }
                        if (viewOooO00o != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewOooO00o.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewOooO00o);
                            }
                            ((ViewGroup) this.f2602OooOO0O).addView(viewOooO00o, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f2749OooOOO0) {
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
        ((View) this.f2602OooOO0O).requestLayout();
        androidx.appcompat.view.menu.OooO oooO2 = this.f2597OooO0o;
        if (oooO2 != null) {
            oooO2.OooO();
            ArrayList<androidx.appcompat.view.menu.OooOO0O> arrayList2 = oooO2.f2571OooO;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                androidx.core.view.OooO0O0 oooO0O0 = arrayList2.get(i3).f2652OooOoOO;
                if (oooO0O0 != null) {
                    oooO0O0.f5329OooO00o = this;
                }
            }
        }
        androidx.appcompat.view.menu.OooO oooO3 = this.f2597OooO0o;
        if (oooO3 != null) {
            oooO3.OooO();
            arrayList = oooO3.f2580OooOO0;
        }
        if (this.f2751OooOOOo && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f2653OooOoo;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f2749OooOOO0 == null) {
                this.f2749OooOOO0 = new OooO0o(this.f2596OooO0Oo);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2749OooOOO0.getParent();
            if (viewGroup3 != this.f2602OooOO0O) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2749OooOOO0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2602OooOO0O;
                OooO0o oooO0o = this.f2749OooOOO0;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParams = new ActionMenuView.LayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
                layoutParams.f2785OooO00o = true;
                actionMenuView.addView(oooO0o, layoutParams);
            }
        } else {
            OooO0o oooO0o2 = this.f2749OooOOO0;
            if (oooO0o2 != null) {
                Object parent = oooO0o2.getParent();
                Object obj = this.f2602OooOO0O;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2749OooOOO0);
                }
            }
        }
        ((ActionMenuView) this.f2602OooOO0O).setOverflowReserved(this.f2751OooOOOo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO00o(androidx.appcompat.view.menu.OooOO0O oooOO0O, View view, ViewGroup viewGroup) {
        androidx.appcompat.view.menu.OooOOOO.OooO00o oooO00o;
        View actionView = oooOO0O.getActionView();
        if (actionView == null || oooOO0O.OooO0o0()) {
            if (view instanceof androidx.appcompat.view.menu.OooOOOO.OooO00o) {
                oooO00o = (androidx.appcompat.view.menu.OooOOOO.OooO00o) view;
            } else {
                oooO00o = (androidx.appcompat.view.menu.OooOOOO.OooO00o) this.f2599OooO0oO.inflate(this.f2601OooOO0, viewGroup, false);
            }
            oooO00o.OooO0OO(oooOO0O);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) oooO00o;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f2602OooOO0O);
            if (this.f2760OooOoO == null) {
                this.f2760OooOoO = new OooO0O0();
            }
            actionMenuItemView.setPopupCallback(this.f2760OooOoO);
            actionView = (View) oooO00o;
        }
        actionView.setVisibility(oooOO0O.f2653OooOoo ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.OooOO0o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0O0(androidx.appcompat.view.menu.OooO oooO, boolean z) {
        OooOO0o();
        OooO00o oooO00o = this.f2755OooOo;
        if (oooO00o != null && oooO00o.OooO0O0()) {
            oooO00o.f2665OooOO0.dismiss();
        }
        androidx.appcompat.view.menu.OooOOO.OooO00o oooO00o2 = this.f2600OooO0oo;
        if (oooO00o2 != null) {
            oooO00o2.OooO0O0(oooO, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0o(androidx.appcompat.view.menu.OooOo oooOo) {
        View childAt;
        boolean z;
        boolean z2 = false;
        if (!oooOo.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.OooOo oooOo2 = oooOo;
        while (true) {
            androidx.appcompat.view.menu.OooO oooO = oooOo2.f2669OooOoO;
            if (oooO == this.f2597OooO0o) {
                break;
            }
            oooOo2 = (androidx.appcompat.view.menu.OooOo) oooO;
        }
        ViewGroup viewGroup = (ViewGroup) this.f2602OooOO0O;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    childAt = 0;
                    break;
                }
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof androidx.appcompat.view.menu.OooOOOO.OooO00o) && ((androidx.appcompat.view.menu.OooOOOO.OooO00o) childAt).getItemData() == oooOo2.f2670OooOoOO) {
                    break;
                }
                i++;
            }
        } else {
            childAt = 0;
            break;
        }
        if (childAt == 0) {
            return false;
        }
        this.f2763OooOoo0 = oooOo.f2670OooOoOO.f2627OooO00o;
        int size = oooOo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = oooOo.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        OooO00o oooO00o = new OooO00o(this.f2598OooO0o0, oooOo, childAt);
        this.f2755OooOo = oooO00o;
        oooO00o.f2664OooO0oo = z;
        p018OooOoo0.OooOo00 oooOo00 = oooO00o.f2665OooOO0;
        if (oooOo00 != null) {
            oooOo00.OooOOOo(z);
        }
        OooO00o oooO00o2 = this.f2755OooOo;
        if (oooO00o2.OooO0O0()) {
            z2 = true;
        } else if (oooO00o2.f2661OooO0o != null) {
            oooO00o2.OooO0Oo(0, 0, false, false);
            z2 = true;
        }
        if (!z2) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        androidx.appcompat.view.menu.OooOOO.OooO00o oooO00o3 = this.f2600OooO0oo;
        if (oooO00o3 != null) {
            oooO00o3.OooO0OO(oooOo);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0o0(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f2772OooO0Oo) > 0 && (menuItemFindItem = this.f2597OooO0o.findItem(i)) != null) {
            OooO0o((androidx.appcompat.view.menu.OooOo) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final Parcelable OooO0oO() {
        SavedState savedState = new SavedState();
        savedState.f2772OooO0Oo = this.f2763OooOoo0;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooOO0() {
        int size;
        ArrayList<androidx.appcompat.view.menu.OooOO0O> arrayListOooOO0o;
        int i;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.OooO oooO = actionMenuPresenter.f2597OooO0o;
        if (oooO != null) {
            arrayListOooOO0o = oooO.OooOO0o();
            size = arrayListOooOO0o.size();
        } else {
            size = 0;
            arrayListOooOO0o = null;
        }
        int i2 = actionMenuPresenter.f2757OooOo00;
        int i3 = actionMenuPresenter.f2754OooOOoo;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f2602OooOO0O;
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
            androidx.appcompat.view.menu.OooOO0O oooOO0O = arrayListOooOO0o.get(i4);
            int i7 = oooOO0O.f2651OooOoO0;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f2756OooOo0 && oooOO0O.f2653OooOoo) {
                i2 = 0;
            }
            i4++;
        }
        if (actionMenuPresenter.f2751OooOOOo && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f2758OooOo0O;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            androidx.appcompat.view.menu.OooOO0O oooOO0O2 = arrayListOooOO0o.get(i9);
            int i11 = oooOO0O2.f2651OooOoO0;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = oooOO0O2.f2628OooO0O0;
            if (z3) {
                View viewOooO00o = actionMenuPresenter.OooO00o(oooOO0O2, null, viewGroup);
                viewOooO00o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewOooO00o.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                oooOO0O2.OooO0oO(z);
            } else {
                if ((i11 & 1) == z ? z : false) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewOooO00o2 = actionMenuPresenter.OooO00o(oooOO0O2, null, viewGroup);
                        viewOooO00o2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewOooO00o2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            androidx.appcompat.view.menu.OooOO0O oooOO0O3 = arrayListOooOO0o.get(i13);
                            if (oooOO0O3.f2628OooO0O0 == i12) {
                                if ((oooOO0O3.f2645OooOo & 32) == 32) {
                                    i8++;
                                }
                                oooOO0O3.OooO0oO(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    oooOO0O2.OooO0oO(z5);
                } else {
                    oooOO0O2.OooO0oO(false);
                }
                i9++;
                i = 2;
                actionMenuPresenter = this;
                z = true;
            }
            i9++;
            i = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooOO0O(@NonNull Context context, @Nullable androidx.appcompat.view.menu.OooO oooO) {
        this.f2598OooO0o0 = context;
        LayoutInflater.from(context);
        this.f2597OooO0o = oooO;
        Resources resources = context.getResources();
        if (!this.f2753OooOOo0) {
            this.f2751OooOOOo = true;
        }
        int i = 2;
        this.f2752OooOOo = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f2757OooOo00 = i;
        int measuredWidth = this.f2752OooOOo;
        if (this.f2751OooOOOo) {
            if (this.f2749OooOOO0 == null) {
                OooO0o oooO0o = new OooO0o(this.f2596OooO0Oo);
                this.f2749OooOOO0 = oooO0o;
                if (this.f2750OooOOOO) {
                    oooO0o.setImageDrawable(this.f2748OooOOO);
                    this.f2748OooOOO = null;
                    this.f2750OooOOOO = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2749OooOOO0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2749OooOOO0.getMeasuredWidth();
        } else {
            this.f2749OooOOO0 = null;
        }
        this.f2754OooOOoo = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean OooOO0o() {
        Object obj;
        OooO0OO oooO0OO = this.f2761OooOoO0;
        if (oooO0OO != null && (obj = this.f2602OooOO0O) != null) {
            ((View) obj).removeCallbacks(oooO0OO);
            this.f2761OooOoO0 = null;
            return true;
        }
        OooO oooO = this.f2759OooOo0o;
        if (oooO == null) {
            return false;
        }
        if (oooO.OooO0O0()) {
            oooO.f2665OooOO0.dismiss();
        }
        return true;
    }

    public final void OooOOO(boolean z) {
        if (z) {
            androidx.appcompat.view.menu.OooOOO.OooO00o oooO00o = this.f2600OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0OO(this.f2597OooO0o);
                return;
            }
            return;
        }
        androidx.appcompat.view.menu.OooO oooO = this.f2597OooO0o;
        if (oooO != null) {
            oooO.OooO0OO(false);
        }
    }

    public final boolean OooOOO0() {
        OooO oooO = this.f2759OooOo0o;
        return oooO != null && oooO.OooO0O0();
    }

    public final boolean OooOOOO() {
        androidx.appcompat.view.menu.OooO oooO;
        if (!this.f2751OooOOOo || OooOOO0() || (oooO = this.f2597OooO0o) == null || this.f2602OooOO0O == null || this.f2761OooOoO0 != null) {
            return false;
        }
        oooO.OooO();
        if (oooO.f2580OooOO0.isEmpty()) {
            return false;
        }
        OooO0OO oooO0OO = new OooO0OO(new OooO(this.f2598OooO0o0, this.f2597OooO0o, this.f2749OooOOO0));
        this.f2761OooOoO0 = oooO0OO;
        ((View) this.f2602OooOO0O).post(oooO0OO);
        return true;
    }
}
