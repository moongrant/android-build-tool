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
import android.os.Build;
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
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    @StyleableRes
    public static final int[] f4954OoooOO0 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public SpinnerAdapter f4955Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final androidx.appcompat.widget.OooO0o f4956Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Context f4957Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o000oOoO f4958Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Rect f4959OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooOOO0 f4960OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f4961OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f4962OoooO0O;

    @VisibleForTesting
    public class OooO implements OooOOO0, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @VisibleForTesting
        public androidx.appcompat.app.OooO0o f4964Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public ListAdapter f4965Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public CharSequence f4966Oooo0oo;

        public OooO() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO(CharSequence charSequence) {
            this.f4966Oooo0oo = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final boolean OooO0O0() {
            androidx.appcompat.app.OooO0o oooO0o = this.f4964Oooo0o;
            if (oooO0o != null) {
                return oooO0o.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final int OooO0OO() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final CharSequence OooO0o() {
            return this.f4966Oooo0oo;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO0o0(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final Drawable OooO0oo() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOO0O(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOO0o(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOOO(int i, int i2) {
            if (this.f4965Oooo0oO == null) {
                return;
            }
            androidx.appcompat.app.OooO0o.OooO00o oooO00o = new androidx.appcompat.app.OooO0o.OooO00o(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f4966Oooo0oo;
            if (charSequence != null) {
                oooO00o.f4518OooO00o.f4406OooO0Oo = charSequence;
            }
            ListAdapter listAdapter = this.f4965Oooo0oO;
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            AlertController.OooO0O0 oooO0O0 = oooO00o.f4518OooO00o;
            oooO0O0.f4409OooO0oO = listAdapter;
            oooO0O0.f4410OooO0oo = this;
            oooO0O0.f4412OooOO0O = selectedItemPosition;
            oooO0O0.f4411OooOO0 = true;
            androidx.appcompat.app.OooO0o oooO0oOooO00o = oooO00o.OooO00o();
            this.f4964Oooo0o = oooO0oOooO00o;
            AlertController.RecycleListView recycleListView = oooO0oOooO00o.f4517OoooO00.f4367OooO0o;
            OooO0OO.OooO0Oo(recycleListView, i);
            OooO0OO.OooO0OO(recycleListView, i2);
            this.f4964Oooo0o.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOOO0(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final int OooOOOO() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOOOo(ListAdapter listAdapter) {
            this.f4965Oooo0oO = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void dismiss() {
            androidx.appcompat.app.OooO0o oooO0o = this.f4964Oooo0o;
            if (oooO0o != null) {
                oooO0o.dismiss();
                this.f4964Oooo0o = null;
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f4965Oooo0oO.getItemId(i));
            }
            androidx.appcompat.app.OooO0o oooO0o = this.f4964Oooo0o;
            if (oooO0o != null) {
                oooO0o.dismiss();
                this.f4964Oooo0o = null;
            }
        }
    }

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().OooO0O0()) {
                AppCompatSpinner.this.OooO0O0();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
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
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public static class OooOO0 implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public SpinnerAdapter f4968Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public ListAdapter f4969Oooo0oO;

        public OooOO0(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.f4968Oooo0o = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f4969Oooo0oO = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    OooO0o.OooO00o((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof o0000Ooo) {
                    o0000Ooo o0000ooo = (o0000Ooo) spinnerAdapter;
                    if (o0000ooo.getDropDownViewTheme() == null) {
                        o0000ooo.OooO00o();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f4969Oooo0oO;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f4968Oooo0o;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f4968Oooo0o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f4968Oooo0o;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f4968Oooo0o;
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
            SpinnerAdapter spinnerAdapter = this.f4968Oooo0o;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f4969Oooo0oO;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f4968Oooo0o;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f4968Oooo0o;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @VisibleForTesting
    public class OooOO0O extends ListPopupWindow implements OooOOO0 {

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public CharSequence f4970o00Ooo;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public ListAdapter f4971o00o0O;

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public final Rect f4973o00ooo;

        /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
        public int f4974oo000o;

        public class OooO00o implements AdapterView.OnItemClickListener {
            public OooO00o() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    OooOO0O oooOO0O = OooOO0O.this;
                    AppCompatSpinner.this.performItemClick(view, i, oooOO0O.f4971o00o0O.getItemId(i));
                }
                OooOO0O.this.dismiss();
            }
        }

        public class OooO0O0 implements ViewTreeObserver.OnGlobalLayoutListener {
            public OooO0O0() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                OooOO0O oooOO0O = OooOO0O.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                Objects.requireNonNull(oooOO0O);
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (!(ViewCompat.OooOO0O.OooO0O0(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(oooOO0O.f4973o00ooo))) {
                    OooOO0O.this.dismiss();
                } else {
                    OooOO0O.this.OooOo0O();
                    OooOO0O.this.OooO00o();
                }
            }
        }

        public class OooO0OO implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f4977Oooo0o;

            public OooO0OO(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f4977Oooo0o = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f4977Oooo0o);
                }
            }
        }

        public OooOO0O(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f4973o00ooo = new Rect();
            this.f5033OoooOoo = AppCompatSpinner.this;
            OooOo00();
            this.f5034Ooooo00 = new OooO00o();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooO(CharSequence charSequence) {
            this.f4970o00Ooo = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final CharSequence OooO0o() {
            return this.f4970o00Ooo;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOOO(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zOooO0O0 = OooO0O0();
            OooOo0O();
            OooOOoo();
            OooO00o();
            o0OOO0o o0ooo0o2 = this.f5023Oooo0oo;
            o0ooo0o2.setChoiceMode(1);
            OooO0OO.OooO0Oo(o0ooo0o2, i);
            OooO0OO.OooO0OO(o0ooo0o2, i2);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            o0OOO0o o0ooo0o3 = this.f5023Oooo0oo;
            if (OooO0O0() && o0ooo0o3 != null) {
                o0ooo0o3.setListSelectionHidden(false);
                o0ooo0o3.setSelection(selectedItemPosition);
                if (o0ooo0o3.getChoiceMode() != 0) {
                    o0ooo0o3.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zOooO0O0 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            viewTreeObserver.addOnGlobalLayoutListener(oooO0O0);
            OooOo0(new OooO0OO(oooO0O0));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOOO0(int i) {
            this.f4974oo000o = i;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.OooOOO0
        public final void OooOOOo(ListAdapter listAdapter) {
            super.OooOOOo(listAdapter);
            this.f4971o00o0O = listAdapter;
        }

        public final void OooOo0O() {
            Drawable drawableOooO0oo = OooO0oo();
            int i = 0;
            if (drawableOooO0oo != null) {
                drawableOooO0oo.getPadding(AppCompatSpinner.this.f4959OoooO);
                i = o000O00O.OooO0O0(AppCompatSpinner.this) ? AppCompatSpinner.this.f4959OoooO.right : -AppCompatSpinner.this.f4959OoooO.left;
            } else {
                Rect rect = AppCompatSpinner.this.f4959OoooO;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.f4962OoooO0O;
            if (i2 == -2) {
                int iOooO00o = appCompatSpinner.OooO00o((SpinnerAdapter) this.f4971o00o0O, OooO0oo());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f4959OoooO;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iOooO00o > i4) {
                    iOooO00o = i4;
                }
                OooOOo(Math.max(iOooO00o, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                OooOOo((width - paddingLeft) - paddingRight);
            } else {
                OooOOo(i2);
            }
            this.f5025OoooO0 = o000O00O.OooO0O0(AppCompatSpinner.this) ? (((width - paddingRight) - this.f5026OoooO00) - this.f4974oo000o) + i : paddingLeft + this.f4974oo000o + i;
        }
    }

    @VisibleForTesting
    public interface OooOOO0 {
        void OooO(CharSequence charSequence);

        boolean OooO0O0();

        int OooO0OO();

        CharSequence OooO0o();

        void OooO0o0(int i);

        Drawable OooO0oo();

        void OooOO0O(Drawable drawable);

        void OooOO0o(int i);

        void OooOOO(int i, int i2);

        void OooOOO0(int i);

        int OooOOOO();

        void OooOOOo(ListAdapter listAdapter);

        void dismiss();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f4979Oooo0o;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f4979Oooo0o ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4979Oooo0o = parcel.readByte() != 0;
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
        drawable.getPadding(this.f4959OoooO);
        Rect rect = this.f4959OoooO;
        return iMax2 + rect.left + rect.right;
    }

    public final void OooO0O0() {
        this.f4960OoooO0.OooOOO(OooO0OO.OooO0O0(this), OooO0OO.OooO00o(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.OooO0o oooO0o = this.f4956Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        return oooOOO0 != null ? oooOOO0.OooO0OO() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        return oooOOO0 != null ? oooOOO0.OooOOOO() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4960OoooO0 != null ? this.f4962OoooO0O : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final OooOOO0 getInternalPopup() {
        return this.f4960OoooO0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        return oooOOO0 != null ? oooOOO0.OooO0oo() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4957Oooo0oO;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        return oooOOO0 != null ? oooOOO0.OooO0o() : super.getPrompt();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.OooO0o oooO0o = this.f4956Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.OooO0o oooO0o = this.f4956Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0OO();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        if (oooOOO0 == null || !oooOOO0.OooO0O0()) {
            return;
        }
        this.f4960OoooO0.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4960OoooO0 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), OooO00o(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f4979Oooo0o || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new OooO00o());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        savedState.f4979Oooo0o = oooOOO0 != null && oooOOO0.OooO0O0();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o000oOoO o000oooo2 = this.f4958Oooo0oo;
        if (o000oooo2 == null || !o000oooo2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        if (oooOOO0 == null) {
            return super.performClick();
        }
        if (oooOOO0.OooO0O0()) {
            return true;
        }
        OooO0O0();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.OooO0o oooO0o = this.f4956Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.OooO0o oooO0o = this.f4956Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        if (oooOOO0 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            oooOOO0.OooOOO0(i);
            this.f4960OoooO0.OooO0o0(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        if (oooOOO0 != null) {
            oooOOO0.OooOO0o(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f4960OoooO0 != null) {
            this.f4962OoooO0O = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        if (oooOOO0 != null) {
            oooOOO0.OooOO0O(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(p012OooOo0.OooOO0O.OooO0O0(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        OooOOO0 oooOOO0 = this.f4960OoooO0;
        if (oooOOO0 != null) {
            oooOOO0.OooO(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        androidx.appcompat.widget.OooO0o oooO0o = this.f4956Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        androidx.appcompat.widget.OooO0o oooO0o = this.f4956Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO(mode);
        }
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.spinnerStyle);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4961OoooO00) {
            this.f4955Oooo = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f4960OoooO0 != null) {
            Context context = this.f4957Oooo0oO;
            if (context == null) {
                context = getContext();
            }
            this.f4960OoooO0.OooOOOo(new OooOO0(spinnerAdapter, context.getTheme()));
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
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f4959OoooO = new Rect();
        o00000OO.OooO00o(this, getContext());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.Spinner, i, 0);
        this.f4956Oooo0o = new androidx.appcompat.widget.OooO0o(this);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(OooOo00.OooOOOO.Spinner_popupTheme, 0);
        if (resourceId != 0) {
            this.f4957Oooo0oO = new p016OooOoO0.OooOOO0(context, resourceId);
        } else {
            this.f4957Oooo0oO = context;
        }
        ?? r2 = -1;
        ?? r3 = 0;
        try {
            if (i2 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4954OoooOO0, i, 0);
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
                            this.f4960OoooO0 = oooO;
                            oooO.f4966Oooo0oo = typedArrayObtainStyledAttributes2.getString(OooOo00.OooOOOO.Spinner_android_prompt);
                        } else if (i2 == 1) {
                            OooOO0O oooOO0O = new OooOO0O(this.f4957Oooo0oO, attributeSet, i);
                            o0000O0 o0000o0OooOOo = o0000O0.OooOOo(this.f4957Oooo0oO, attributeSet, OooOo00.OooOOOO.Spinner, i);
                            this.f4962OoooO0O = o0000o0OooOOo.OooOO0o(OooOo00.OooOOOO.Spinner_android_dropDownWidth, -2);
                            oooOO0O.f5044o0OoOo0.setBackgroundDrawable(o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.Spinner_android_popupBackground));
                            oooOO0O.f4970o00Ooo = typedArrayObtainStyledAttributes2.getString(OooOo00.OooOOOO.Spinner_android_prompt);
                            o0000o0OooOOo.OooOOoo();
                            this.f4960OoooO0 = oooOO0O;
                            this.f4958Oooo0oo = new o000oOoO(this, this, oooOO0O);
                        }
                        textArray = typedArrayObtainStyledAttributes2.getTextArray(OooOo00.OooOOOO.Spinner_android_entries);
                        if (textArray != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                            arrayAdapter.setDropDownViewResource(OooOo00.OooOO0O.support_simple_spinner_dropdown_item);
                            setAdapter(arrayAdapter);
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        this.f4961OoooO00 = true;
                        spinnerAdapter = this.f4955Oooo;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f4955Oooo = null;
                        }
                        this.f4956Oooo0o.OooO0Oo(attributeSet, i);
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
                this.f4960OoooO0 = oooO2;
                oooO2.f4966Oooo0oo = typedArrayObtainStyledAttributes2.getString(OooOo00.OooOOOO.Spinner_android_prompt);
            } else if (i2 == 1) {
                OooOO0O oooOO0O2 = new OooOO0O(this.f4957Oooo0oO, attributeSet, i);
                o0000O0 o0000o0OooOOo2 = o0000O0.OooOOo(this.f4957Oooo0oO, attributeSet, OooOo00.OooOOOO.Spinner, i);
                this.f4962OoooO0O = o0000o0OooOOo2.OooOO0o(OooOo00.OooOOOO.Spinner_android_dropDownWidth, -2);
                oooOO0O2.f5044o0OoOo0.setBackgroundDrawable(o0000o0OooOOo2.OooO0oO(OooOo00.OooOOOO.Spinner_android_popupBackground));
                oooOO0O2.f4970o00Ooo = typedArrayObtainStyledAttributes2.getString(OooOo00.OooOOOO.Spinner_android_prompt);
                o0000o0OooOOo2.OooOOoo();
                this.f4960OoooO0 = oooOO0O2;
                this.f4958Oooo0oo = new o000oOoO(this, this, oooOO0O2);
            }
            textArray = typedArrayObtainStyledAttributes2.getTextArray(OooOo00.OooOOOO.Spinner_android_entries);
            if (textArray != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                arrayAdapter2.setDropDownViewResource(OooOo00.OooOO0O.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter2);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f4961OoooO00 = true;
            spinnerAdapter = this.f4955Oooo;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f4955Oooo = null;
            }
            this.f4956Oooo0o.OooO0Oo(attributeSet, i);
        } catch (Throwable th2) {
            th = th2;
            r3 = r2;
        }
    }
}
