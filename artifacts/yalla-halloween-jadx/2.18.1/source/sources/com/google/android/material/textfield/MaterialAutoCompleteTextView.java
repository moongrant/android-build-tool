package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import androidx.annotation.ArrayRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @LayoutRes
    public final int f17838OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f17839OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NonNull
    public final ListPopupWindow f17840OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NonNull
    public final Rect f17841OoooO0O;

    public class OooO00o implements AdapterView.OnItemClickListener {
        public OooO00o() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object item;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i < 0) {
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f17840OoooO00;
                item = !listPopupWindow.OooO0O0() ? null : listPopupWindow.f5023Oooo0oo.getSelectedItem();
            } else {
                item = materialAutoCompleteTextView.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.OooO00o(MaterialAutoCompleteTextView.this, item);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    ListPopupWindow listPopupWindow2 = MaterialAutoCompleteTextView.this.f17840OoooO00;
                    view = !listPopupWindow2.OooO0O0() ? null : listPopupWindow2.f5023Oooo0oo.getSelectedView();
                    ListPopupWindow listPopupWindow3 = MaterialAutoCompleteTextView.this.f17840OoooO00;
                    i = !listPopupWindow3.OooO0O0() ? -1 : listPopupWindow3.f5023Oooo0oo.getSelectedItemPosition();
                    ListPopupWindow listPopupWindow4 = MaterialAutoCompleteTextView.this.f17840OoooO00;
                    j = !listPopupWindow4.OooO0O0() ? Long.MIN_VALUE : listPopupWindow4.f5023Oooo0oo.getSelectedItemId();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f17840OoooO00.f5023Oooo0oo, view, i, j);
            }
            MaterialAutoCompleteTextView.this.f17840OoooO00.dismiss();
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

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        return (textInputLayoutOooO0O0 == null || !textInputLayoutOooO0O0.f17998o00ooo) ? super.getHint() : textInputLayoutOooO0O0.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        if (textInputLayoutOooO0O0 != null && textInputLayoutOooO0O0.f17998o00ooo && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
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
                ListPopupWindow listPopupWindow = this.f17840OoooO00;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.OooO0O0() ? -1 : listPopupWindow.f5023Oooo0oo.getSelectedItemPosition()) + 15);
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
                Drawable drawableOooO0oo = this.f17840OoooO00.OooO0oo();
                if (drawableOooO0oo != null) {
                    drawableOooO0oo.getPadding(this.f17841OoooO0O);
                    Rect rect = this.f17841OoooO0O;
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutOooO0O0.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f17840OoooO00.OooOOOo(getAdapter());
    }

    public void setSimpleItems(@ArrayRes int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f17839OoooO0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f17840OoooO00.OooO00o();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f17838OoooO, strArr));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(p352o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, 0), attributeSet, i);
        this.f17841OoooO0O = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = com.google.android.material.internal.o000oOoO.OooO0Oo(context2, attributeSet, p337o0OO0o0.Oooo0.MaterialAutoCompleteTextView, i, p337o0OO0o0.Oooo000.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = p337o0OO0o0.Oooo0.MaterialAutoCompleteTextView_android_inputType;
        if (typedArrayOooO0Oo.hasValue(i2) && typedArrayOooO0Oo.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f17838OoooO = typedArrayOooO0Oo.getResourceId(p337o0OO0o0.Oooo0.MaterialAutoCompleteTextView_simpleItemLayout, p337o0OO0o0.OooOOOO.mtrl_auto_complete_simple_item);
        this.f17839OoooO0 = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2, null, OooOo00.OooO00o.listPopupWindowStyle);
        this.f17840OoooO00 = listPopupWindow;
        listPopupWindow.OooOo00();
        listPopupWindow.f5033OoooOoo = this;
        listPopupWindow.OooOOoo();
        listPopupWindow.OooOOOo(getAdapter());
        listPopupWindow.f5034Ooooo00 = new OooO00o();
        int i3 = p337o0OO0o0.Oooo0.MaterialAutoCompleteTextView_simpleItems;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            setSimpleItems(typedArrayOooO0Oo.getResourceId(i3, 0));
        }
        typedArrayOooO0Oo.recycle();
    }
}
