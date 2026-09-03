package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.Locale;
import java.util.WeakHashMap;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f17944OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ListPopupWindow f17945OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final Rect f17946OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @LayoutRes
    public final int f17947OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float f17948OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17949OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f17950OooOOO0;

    public class OooO00o implements AdapterView.OnItemClickListener {
        public OooO00o() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object item;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i < 0) {
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f17945OooO0oo;
                item = !listPopupWindow.OooO00o() ? null : listPopupWindow.f2914OooO0o.getSelectedItem();
            } else {
                item = materialAutoCompleteTextView.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.OooO00o(materialAutoCompleteTextView, item);
            AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
            ListPopupWindow listPopupWindow2 = materialAutoCompleteTextView.f17945OooO0oo;
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = listPopupWindow2.OooO00o() ? listPopupWindow2.f2914OooO0o.getSelectedView() : null;
                    i = !listPopupWindow2.OooO00o() ? -1 : listPopupWindow2.f2914OooO0o.getSelectedItemPosition();
                    j = !listPopupWindow2.OooO00o() ? Long.MIN_VALUE : listPopupWindow2.f2914OooO0o.getSelectedItemId();
                }
                onItemClickListener.onItemClick(listPopupWindow2.f2914OooO0o, view, i, j);
            }
            listPopupWindow2.dismiss();
        }
    }

    public class OooO0O0<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public ColorStateList f17952OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public ColorStateList f17954OooO0o0;

        public OooO0O0(Context context, @NonNull int i, String[] strArr) {
            super(context, i, strArr);
            OooO0O0();
        }

        public final void OooO0O0() {
            ColorStateList colorStateList;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            ColorStateList colorStateList2 = materialAutoCompleteTextView.f17949OooOOO;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f17954OooO0o0 = colorStateList;
            if (materialAutoCompleteTextView.f17950OooOOO0 != 0) {
                if (materialAutoCompleteTextView.f17949OooOOO != null) {
                    int[] iArr2 = {R.attr.state_hovered, -16842919};
                    int[] iArr3 = {R.attr.state_selected, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{p052o00000oO.OooOO0.OooO0OO(materialAutoCompleteTextView.f17949OooOOO.getColorForState(iArr3, 0), materialAutoCompleteTextView.f17950OooOOO0), p052o00000oO.OooOO0.OooO0OO(materialAutoCompleteTextView.f17949OooOOO.getColorForState(iArr2, 0), materialAutoCompleteTextView.f17950OooOOO0), materialAutoCompleteTextView.f17950OooOOO0});
                }
            }
            this.f17952OooO0Oo = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, @Nullable View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                Drawable rippleDrawable = null;
                if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText())) {
                    if (materialAutoCompleteTextView.f17950OooOOO0 != 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.f17950OooOOO0);
                        if (this.f17954OooO0o0 != null) {
                            o00000oo.o00Ooo.OooO0O0.OooO0oo(colorDrawable, this.f17952OooO0Oo);
                            rippleDrawable = new RippleDrawable(this.f17954OooO0o0, colorDrawable, null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooO0o.OooOOo0(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    public static void OooO00o(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    @Nullable
    public final TextInputLayout OooO0O0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f17944OooO;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f17945OooO0oo.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        return (textInputLayoutOooO0O0 == null || !textInputLayoutOooO0O0.f18012Oooo000) ? super.getHint() : textInputLayoutOooO0O0.getHint();
    }

    public float getPopupElevation() {
        return this.f17948OooOO0o;
    }

    public int getSimpleItemSelectedColor() {
        return this.f17950OooOOO0;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f17949OooOOO;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        if (textInputLayoutOooO0O0 != null && textInputLayoutOooO0O0.f18012Oooo000 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17945OooO0oo.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutOooO0O0 != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f17945OooO0oo;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.OooO00o() ? -1 : listPopupWindow.f2914OooO0o.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutOooO0O0);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable drawableOooO0o = listPopupWindow.OooO0o();
                if (drawableOooO0o != null) {
                    Rect rect = this.f17946OooOO0;
                    drawableOooO0o.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutOooO0O0.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        AccessibilityManager accessibilityManager = this.f17944OooO;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f17945OooO0oo.OooOO0o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f17945OooO0oo;
        if (listPopupWindow != null) {
            listPopupWindow.OooOOOO(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f17945OooO0oo.f2930OooOo00 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        if (textInputLayoutOooO0O0 != null) {
            textInputLayoutOooO0O0.OooOOo();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f17950OooOOO0 = i;
        if (getAdapter() instanceof OooO0O0) {
            ((OooO0O0) getAdapter()).OooO0O0();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f17949OooOOO = colorStateList;
        if (getAdapter() instanceof OooO0O0) {
            ((OooO0O0) getAdapter()).OooO0O0();
        }
    }

    public void setSimpleItems(@ArrayRes int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f17944OooO;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f17945OooO0oo.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new OooO0O0(getContext(), this.f17947OooOO0O, strArr));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, 0), attributeSet, i);
        this.f17946OooOO0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = com.google.android.material.internal.o00oO0o.OooO0Oo(context2, attributeSet, o000OO.MaterialAutoCompleteTextView, i, o0000O0O.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = o000OO.MaterialAutoCompleteTextView_android_inputType;
        if (typedArrayOooO0Oo.hasValue(i2) && typedArrayOooO0Oo.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f17947OooOO0O = typedArrayOooO0Oo.getResourceId(o000OO.MaterialAutoCompleteTextView_simpleItemLayout, o0000O00.mtrl_auto_complete_simple_item);
        this.f17948OooOO0o = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialAutoCompleteTextView_android_popupElevation, o00000O.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f17950OooOOO0 = typedArrayOooO0Oo.getColor(o000OO.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f17949OooOOO = c1.OooO00o(context2, typedArrayOooO0Oo, o000OO.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f17944OooO = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f17945OooO0oo = listPopupWindow;
        listPopupWindow.f2937OooOoo0 = true;
        PopupWindow popupWindow = listPopupWindow.f2936OooOoo;
        popupWindow.setFocusable(true);
        listPopupWindow.f2925OooOOo = this;
        popupWindow.setInputMethodMode(2);
        listPopupWindow.OooOO0o(getAdapter());
        listPopupWindow.f2927OooOOoo = new OooO00o();
        int i3 = o000OO.MaterialAutoCompleteTextView_simpleItems;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            setSimpleItems(typedArrayOooO0Oo.getResourceId(i3, 0));
        }
        typedArrayOooO0Oo.recycle();
    }
}
