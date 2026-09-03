package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertController;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    @StyleableRes
    public static final int[] f2845OooOO0o = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOOO0 f2846OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final androidx.appcompat.widget.OooO f2847OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OoOo0 f2848OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f2849OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public SpinnerAdapter f2850OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f2851OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f2852OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Rect f2853OooOO0O;

    @VisibleForTesting
    public class OooO implements OooOOO0, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @VisibleForTesting
        public androidx.appcompat.app.OooO0O0 f2854OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public CharSequence f2855OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ListAdapter f2856OooO0o0;

        public OooO() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final boolean OooO00o() {
            androidx.appcompat.app.OooO0O0 oooO0O0 = this.f2854OooO0Oo;
            if (oooO0O0 != null) {
                return oooO0O0.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final int OooO0O0() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO0Oo(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final Drawable OooO0o() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final CharSequence OooO0o0() {
            return this.f2855OooO0o;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO0oO(CharSequence charSequence) {
            this.f2855OooO0o = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO0oo(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOO0(int i, int i2) {
            if (this.f2856OooO0o0 == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            androidx.appcompat.app.OooO0O0.OooO00o oooO00o = new androidx.appcompat.app.OooO0O0.OooO00o(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f2855OooO0o;
            if (charSequence != null) {
                oooO00o.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f2856OooO0o0;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            AlertController.OooO0O0 oooO0O0 = oooO00o.f2394OooO00o;
            oooO0O0.f2279OooOO0O = listAdapter;
            oooO0O0.f2280OooOO0o = this;
            oooO0O0.f2283OooOOOO = selectedItemPosition;
            oooO0O0.f2281OooOOO = true;
            androidx.appcompat.app.OooO0O0 oooO0O0Create = oooO00o.create();
            this.f2854OooO0Oo = oooO0O0Create;
            AlertController.RecycleListView recycleListView = oooO0O0Create.f2393OooO0o.f2236OooO0o;
            OooO0OO.OooO0Oo(recycleListView, i);
            OooO0OO.OooO0OO(recycleListView, i2);
            this.f2854OooO0Oo.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final int OooOO0O() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOO0o(ListAdapter listAdapter) {
            this.f2856OooO0o0 = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOOOO(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void dismiss() {
            androidx.appcompat.app.OooO0O0 oooO0O0 = this.f2854OooO0Oo;
            if (oooO0O0 != null) {
                oooO0O0.dismiss();
                this.f2854OooO0Oo = null;
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i, this.f2856OooO0o0.getItemId(i));
            }
            dismiss();
        }
    }

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().OooO00o()) {
                appCompatSpinner.f2846OooO.OooOO0(OooO0OO.OooO0O0(appCompatSpinner), OooO0OO.OooO00o(appCompatSpinner));
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                OooO0O0.OooO00o(viewTreeObserver, this);
            }
        }
    }

    @RequiresApi(16)
    public static final class OooO0O0 {
        @DoNotInline
        public static void OooO00o(@NonNull ViewTreeObserver viewTreeObserver, @Nullable ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @RequiresApi(17)
    public static final class OooO0OO {
        @DoNotInline
        public static int OooO00o(@NonNull View view) {
            return view.getTextAlignment();
        }

        @DoNotInline
        public static int OooO0O0(@NonNull View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        public static void OooO0OO(@NonNull View view, int i) {
            view.setTextAlignment(i);
        }

        @DoNotInline
        public static void OooO0Oo(@NonNull View view, int i) {
            view.setTextDirection(i);
        }
    }

    @RequiresApi(23)
    public static final class OooO0o {
        @DoNotInline
        public static void OooO00o(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (o000OO.OooO0OO.OooO00o(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public static class OooOO0 implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final SpinnerAdapter f2859OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ListAdapter f2860OooO0o0;

        public OooOO0(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.f2859OooO0Oo = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2860OooO0o0 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    OooO0o.OooO00o((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof o0000OO0) {
                    o0000OO0 o0000oo1 = (o0000OO0) spinnerAdapter;
                    if (o0000oo1.getDropDownViewTheme() == null) {
                        o0000oo1.OooO00o();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2860OooO0o0;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2859OooO0Oo;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2859OooO0Oo;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2859OooO0Oo;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2859OooO0Oo;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2859OooO0Oo;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2860OooO0o0;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2859OooO0Oo;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2859OooO0Oo;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @VisibleForTesting
    public class OooOO0O extends ListPopupWindow implements OooOOO0 {

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final Rect f2861Oooo0;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public CharSequence f2862Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public ListAdapter f2863Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f2864Oooo0O0;

        public class OooO00o implements AdapterView.OnItemClickListener {
            public OooO00o() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                OooOO0O oooOO0O = OooOO0O.this;
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view, i, oooOO0O.f2863Oooo00o.getItemId(i));
                }
                oooOO0O.dismiss();
            }
        }

        public class OooO0O0 implements ViewTreeObserver.OnGlobalLayoutListener {
            public OooO0O0() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                OooOO0O oooOO0O = OooOO0O.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                oooOO0O.getClass();
                WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                if (!(ViewCompat.OooOO0O.OooO0O0(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(oooOO0O.f2861Oooo0))) {
                    oooOO0O.dismiss();
                } else {
                    oooOO0O.OooOOo();
                    oooOO0O.show();
                }
            }
        }

        public class OooO0OO implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2868OooO0Oo;

            public OooO0OO(OooO0O0 oooO0O0) {
                this.f2868OooO0Oo = oooO0O0;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2868OooO0Oo);
                }
            }
        }

        public OooOO0O(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2861Oooo0 = new Rect();
            this.f2925OooOOo = AppCompatSpinner.this;
            this.f2937OooOoo0 = true;
            this.f2936OooOoo.setFocusable(true);
            this.f2927OooOOoo = new OooO00o();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO(int i) {
            this.f2864Oooo0O0 = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final CharSequence OooO0o0() {
            return this.f2862Oooo00O;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO0oO(CharSequence charSequence) {
            this.f2862Oooo00O = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOO0(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zOooO00o = OooO00o();
            OooOOo();
            PopupWindow popupWindow = this.f2936OooOoo;
            popupWindow.setInputMethodMode(2);
            show();
            o000000O o000000o2 = this.f2914OooO0o;
            o000000o2.setChoiceMode(1);
            OooO0OO.OooO0Oo(o000000o2, i);
            OooO0OO.OooO0OO(o000000o2, i2);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            o000000O o000000o3 = this.f2914OooO0o;
            if (OooO00o() && o000000o3 != null) {
                o000000o3.setListSelectionHidden(false);
                o000000o3.setSelection(selectedItemPosition);
                if (o000000o3.getChoiceMode() != 0) {
                    o000000o3.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zOooO00o || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            viewTreeObserver.addOnGlobalLayoutListener(oooO0O0);
            popupWindow.setOnDismissListener(new OooO0OO(oooO0O0));
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOO0o(ListAdapter listAdapter) {
            super.OooOO0o(listAdapter);
            this.f2863Oooo00o = listAdapter;
        }

        public final void OooOOo() {
            int i;
            Drawable drawableOooO0o = OooO0o();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (drawableOooO0o != null) {
                drawableOooO0o.getPadding(appCompatSpinner.f2853OooOO0O);
                i = o0O0ooO.OooO00o(appCompatSpinner) ? appCompatSpinner.f2853OooOO0O.right : -appCompatSpinner.f2853OooOO0O.left;
            } else {
                Rect rect = appCompatSpinner.f2853OooOO0O;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i2 = appCompatSpinner.f2852OooOO0;
            if (i2 == -2) {
                int iOooO00o = appCompatSpinner.OooO00o((SpinnerAdapter) this.f2863Oooo00o, OooO0o());
                int i3 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = appCompatSpinner.f2853OooOO0O;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iOooO00o > i4) {
                    iOooO00o = i4;
                }
                OooOOo0(Math.max(iOooO00o, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                OooOOo0((width - paddingLeft) - paddingRight);
            } else {
                OooOOo0(i2);
            }
            this.f2912OooO = o0O0ooO.OooO00o(appCompatSpinner) ? (((width - paddingRight) - this.f2917OooO0oo) - this.f2864Oooo0O0) + i : paddingLeft + this.f2864Oooo0O0 + i;
        }
    }

    @VisibleForTesting
    public interface OooOOO0 {
        void OooO(int i);

        boolean OooO00o();

        int OooO0O0();

        void OooO0Oo(int i);

        Drawable OooO0o();

        CharSequence OooO0o0();

        void OooO0oO(CharSequence charSequence);

        void OooO0oo(int i);

        void OooOO0(int i, int i2);

        int OooOO0O();

        void OooOO0o(ListAdapter listAdapter);

        void OooOOOO(Drawable drawable);

        void dismiss();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f2870OooO0Oo;

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

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2870OooO0Oo = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f2870OooO0Oo ? (byte) 1 : (byte) 0);
        }
    }

    public AppCompatSpinner(@NonNull Context context) {
        this(context, null);
    }

    public final int OooO00o(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f2853OooOO0O;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.OooO oooO = this.f2847OooO0Oo;
        if (oooO != null) {
            oooO.OooO00o();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        OooOOO0 oooOOO0 = this.f2846OooO;
        return oooOOO0 != null ? oooOOO0.OooO0O0() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        OooOOO0 oooOOO0 = this.f2846OooO;
        return oooOOO0 != null ? oooOOO0.OooOO0O() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2846OooO != null ? this.f2852OooOO0 : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final OooOOO0 getInternalPopup() {
        return this.f2846OooO;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        OooOOO0 oooOOO0 = this.f2846OooO;
        return oooOOO0 != null ? oooOOO0.OooO0o() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2849OooO0o0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        OooOOO0 oooOOO0 = this.f2846OooO;
        return oooOOO0 != null ? oooOOO0.OooO0o0() : super.getPrompt();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.OooO oooO = this.f2847OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.OooO oooO = this.f2847OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOOO0 oooOOO0 = this.f2846OooO;
        if (oooOOO0 == null || !oooOOO0.OooO00o()) {
            return;
        }
        oooOOO0.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2846OooO == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), OooO00o(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f2870OooO0Oo || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new OooO00o());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        OooOOO0 oooOOO0 = this.f2846OooO;
        savedState.f2870OooO0Oo = oooOOO0 != null && oooOOO0.OooO00o();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o0OoOo0 o0oooo0 = this.f2848OooO0o;
        if (o0oooo0 == null || !o0oooo0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        OooOOO0 oooOOO0 = this.f2846OooO;
        if (oooOOO0 == null) {
            return super.performClick();
        }
        if (oooOOO0.OooO00o()) {
            return true;
        }
        oooOOO0.OooOO0(OooO0OO.OooO0O0(this), OooO0OO.OooO00o(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.OooO oooO = this.f2847OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.OooO oooO = this.f2847OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        OooOOO0 oooOOO0 = this.f2846OooO;
        if (oooOOO0 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            oooOOO0.OooO(i);
            oooOOO0.OooO0Oo(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        OooOOO0 oooOOO0 = this.f2846OooO;
        if (oooOOO0 != null) {
            oooOOO0.OooO0oo(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2846OooO != null) {
            this.f2852OooOO0 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        OooOOO0 oooOOO0 = this.f2846OooO;
        if (oooOOO0 != null) {
            oooOOO0.OooOOOO(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(p013OooOo0o.o00Oo0.OooO00o(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        OooOOO0 oooOOO0 = this.f2846OooO;
        if (oooOOO0 != null) {
            oooOOO0.OooO0oO(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        androidx.appcompat.widget.OooO oooO = this.f2847OooO0Oo;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        androidx.appcompat.widget.OooO oooO = this.f2847OooO0Oo;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.spinnerStyle);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2851OooO0oo) {
            this.f2850OooO0oO = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        OooOOO0 oooOOO0 = this.f2846OooO;
        if (oooOOO0 != null) {
            Context context = this.f2849OooO0o0;
            if (context == null) {
                context = getContext();
            }
            oooOOO0.OooOO0o(new OooOO0(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f2853OooOO0O = new Rect();
        o0000O.OooO00o(getContext(), this);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.Spinner, i, 0);
        this.f2847OooO0Oo = new androidx.appcompat.widget.OooO(this);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(p012OooOo0O.o00O0O.Spinner_popupTheme, 0);
        if (resourceId != 0) {
            this.f2849OooO0o0 = new p016OooOoOO.o00Oo0(context, resourceId);
        } else {
            this.f2849OooO0o0 = context;
        }
        ?? r2 = -1;
        ?? r3 = 0;
        try {
            if (i2 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2845OooOO0o, i, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r2 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r2 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r2 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i2 != 0) {
                            OooO oooO = new OooO();
                            this.f2846OooO = oooO;
                            oooO.f2855OooO0o = typedArrayObtainStyledAttributes2.getString(p012OooOo0O.o00O0O.Spinner_android_prompt);
                        } else if (i2 == 1) {
                            OooOO0O oooOO0O = new OooOO0O(this.f2849OooO0o0, attributeSet, i);
                            o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(this.f2849OooO0o0, attributeSet, p012OooOo0O.o00O0O.Spinner, i);
                            this.f2852OooOO0 = o000oo0OooOOO0.f3326OooO0O0.getLayoutDimension(p012OooOo0O.o00O0O.Spinner_android_dropDownWidth, -2);
                            oooOO0O.OooOOOO(o000oo0OooOOO0.OooO0o0(p012OooOo0O.o00O0O.Spinner_android_popupBackground));
                            oooOO0O.f2862Oooo00O = typedArrayObtainStyledAttributes2.getString(p012OooOo0O.o00O0O.Spinner_android_prompt);
                            o000oo0OooOOO0.OooOOO();
                            this.f2846OooO = oooOO0O;
                            this.f2848OooO0o = new o0OoOo0(this, this, oooOO0O);
                        }
                        textArray = typedArrayObtainStyledAttributes2.getTextArray(p012OooOo0O.o00O0O.Spinner_android_entries);
                        if (textArray != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                            arrayAdapter.setDropDownViewResource(p012OooOo0O.Oooo0.support_simple_spinner_dropdown_item);
                            setAdapter(arrayAdapter);
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        this.f2851OooO0oo = true;
                        spinnerAdapter = this.f2850OooO0oO;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f2850OooO0oO = null;
                        }
                        this.f2847OooO0Oo.OooO0Oo(attributeSet, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r3 != 0) {
                        r3.recycle();
                    }
                    throw th;
                }
                r2.recycle();
            }
            if (i2 != 0) {
                OooO oooO2 = new OooO();
                this.f2846OooO = oooO2;
                oooO2.f2855OooO0o = typedArrayObtainStyledAttributes2.getString(p012OooOo0O.o00O0O.Spinner_android_prompt);
            } else if (i2 == 1) {
                OooOO0O oooOO0O2 = new OooOO0O(this.f2849OooO0o0, attributeSet, i);
                o000Oo0 o000oo0OooOOO1 = o000Oo0.OooOOO0(this.f2849OooO0o0, attributeSet, p012OooOo0O.o00O0O.Spinner, i);
                this.f2852OooOO0 = o000oo0OooOOO1.f3326OooO0O0.getLayoutDimension(p012OooOo0O.o00O0O.Spinner_android_dropDownWidth, -2);
                oooOO0O2.OooOOOO(o000oo0OooOOO1.OooO0o0(p012OooOo0O.o00O0O.Spinner_android_popupBackground));
                oooOO0O2.f2862Oooo00O = typedArrayObtainStyledAttributes2.getString(p012OooOo0O.o00O0O.Spinner_android_prompt);
                o000oo0OooOOO1.OooOOO();
                this.f2846OooO = oooOO0O2;
                this.f2848OooO0o = new o0OoOo0(this, this, oooOO0O2);
            }
            textArray = typedArrayObtainStyledAttributes2.getTextArray(p012OooOo0O.o00O0O.Spinner_android_entries);
            if (textArray != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                arrayAdapter2.setDropDownViewResource(p012OooOo0O.Oooo0.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter2);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f2851OooO0oo = true;
            spinnerAdapter = this.f2850OooO0oO;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f2850OooO0oO = null;
            }
            this.f2847OooO0Oo.OooO0Oo(attributeSet, i);
        } catch (Throwable th2) {
            th = th2;
            r3 = r2;
        }
    }
}
