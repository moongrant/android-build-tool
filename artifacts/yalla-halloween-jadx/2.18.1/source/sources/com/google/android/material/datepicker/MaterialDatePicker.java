package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000O0O0.o0000O00;
import p341o0OO0oOo.o0OOOO00;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialDatePicker<S> extends androidx.fragment.app.OooOo00 {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final /* synthetic */ int f16887OoooooO = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f16892OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f16893OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @StyleRes
    public int f16894OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public o0ooOOo<S> f16895OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooOO0O<S> f16896OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public CharSequence f16897OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f16898OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f16899OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @StringRes
    public int f16900OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public CharSequence f16901OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @StringRes
    public int f16902Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public CharSequence f16903Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public TextView f16904OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public CheckableImageButton f16905OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f16906OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f16907Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public Button f16908Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @StringRes
    public int f16909o000oOoO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final LinkedHashSet<o0OoOo0<? super S>> f16889Oooo0o = new LinkedHashSet<>();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f16890Oooo0oO = new LinkedHashSet<>();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f16891Oooo0oo = new LinkedHashSet<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f16888Oooo = new LinkedHashSet<>();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface InputMode {
    }

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            for (o0OoOo0<? super S> o0oooo1 : MaterialDatePicker.this.f16889Oooo0o) {
                MaterialDatePicker.this.OooO00o().o000000O();
                o0oooo1.OooO00o();
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Iterator<View.OnClickListener> it = MaterialDatePicker.this.f16890Oooo0oO.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    public class OooO0OO extends o00oO0o<S> {
        public OooO0OO() {
        }

        @Override // com.google.android.material.datepicker.o00oO0o
        public final void OooO00o() {
            MaterialDatePicker.this.f16908Oooooo0.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.o00oO0o
        public final void OooO0O0(S s) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            int i = MaterialDatePicker.f16887OoooooO;
            materialDatePicker.OooO0o();
            MaterialDatePicker materialDatePicker2 = MaterialDatePicker.this;
            materialDatePicker2.f16908Oooooo0.setEnabled(materialDatePicker2.OooO00o().o00oO0O());
        }
    }

    public static int OooO0O0(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_calendar_content_padding);
        int i = new Month(o000OOo.OooO0oo()).f16913Oooo;
        return ((i - 1) * resources.getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_calendar_month_horizontal_padding)) + (resources.getDimensionPixelSize(p337o0OO0o0.OooOO0.mtrl_calendar_day_width) * i) + (dimensionPixelOffset * 2);
    }

    public static boolean OooO0OO(@NonNull Context context) {
        return OooO0Oo(context, R.attr.windowFullscreen);
    }

    public static boolean OooO0Oo(@NonNull Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(o0OOO0O.OooO0O0.OooO0O0(context, p337o0OO0o0.OooO0o.materialCalendarStyle, OooOO0O.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final DateSelector<S> OooO00o() {
        if (this.f16893OoooO0 == null) {
            this.f16893OoooO0 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f16893OoooO0;
    }

    public final void OooO0o() {
        String strOooOOoo = OooO00o().OooOOoo(getContext());
        this.f16904OooooO0.setContentDescription(String.format(getString(p337o0OO0o0.OooOo.mtrl_picker_announce_current_selection), strOooOOoo));
        this.f16904OooooO0.setText(strOooOOoo);
    }

    public final void OooO0o0() {
        o0ooOOo<S> o00o0o2;
        Context contextRequireContext = requireContext();
        int iO00Oo0 = this.f16894OoooO00;
        if (iO00Oo0 == 0) {
            iO00Oo0 = OooO00o().o00Oo0(contextRequireContext);
        }
        DateSelector<S> dateSelectorOooO00o = OooO00o();
        CalendarConstraints calendarConstraints = this.f16892OoooO;
        OooOO0O<S> oooOO0O = new OooOO0O<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iO00Oo0);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorOooO00o);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f16867Oooo);
        oooOO0O.setArguments(bundle);
        this.f16896OoooOO0 = oooOO0O;
        if (this.f16905OooooOO.isChecked()) {
            DateSelector<S> dateSelectorOooO00o2 = OooO00o();
            CalendarConstraints calendarConstraints2 = this.f16892OoooO;
            o00o0o2 = new o00O0O<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iO00Oo0);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorOooO00o2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            o00o0o2.setArguments(bundle2);
        } else {
            o00o0o2 = this.f16896OoooOO0;
        }
        this.f16895OoooO0O = o00o0o2;
        OooO0o();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(getChildFragmentManager());
        int i = p337o0OO0o0.OooOOO0.mtrl_calendar_frame;
        o0ooOOo<S> o0ooooo2 = this.f16895OoooO0O;
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        oooO00o.OooO0Oo(i, o0ooooo2, null, 2);
        oooO00o.OooO0OO();
        this.f16895OoooO0O.OooO00o(new OooO0OO());
    }

    public final void OooO0oO(@NonNull CheckableImageButton checkableImageButton) {
        this.f16905OooooOO.setContentDescription(this.f16905OooooOO.isChecked() ? checkableImageButton.getContext().getString(p337o0OO0o0.OooOo.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(p337o0OO0o0.OooOo.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.OooOo00, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f16891Oooo0oo.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16894OoooO00 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f16893OoooO0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f16892OoooO = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f16909o000oOoO = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f16897OoooOOO = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f16899OoooOo0 = bundle.getInt("INPUT_MODE_KEY");
        this.f16900OoooOoO = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16901OoooOoo = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f16902Ooooo00 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16903Ooooo0o = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.OooOo00
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iO00Oo0 = this.f16894OoooO00;
        if (iO00Oo0 == 0) {
            iO00Oo0 = OooO00o().o00Oo0(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iO00Oo0);
        Context context = dialog.getContext();
        this.f16898OoooOOo = OooO0OO(context);
        int iOooO0O0 = o0OOO0O.OooO0O0.OooO0O0(context, p337o0OO0o0.OooO0o.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, p337o0OO0o0.OooO0o.materialCalendarStyle, p337o0OO0o0.Oooo000.Widget_MaterialComponents_MaterialCalendar);
        this.f16906OooooOo = materialShapeDrawable;
        materialShapeDrawable.OooOOO0(context);
        this.f16906OooooOo.OooOOOo(ColorStateList.valueOf(iOooO0O0));
        MaterialShapeDrawable materialShapeDrawable2 = this.f16906OooooOo;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        materialShapeDrawable2.OooOOOO(ViewCompat.OooOOO.OooO(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f16898OoooOOo ? p337o0OO0o0.OooOOOO.mtrl_picker_fullscreen : p337o0OO0o0.OooOOOO.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f16898OoooOOo) {
            viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(OooO0O0(context), -2));
        } else {
            viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(OooO0O0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_picker_header_selection_text);
        this.f16904OooooO0 = textView;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOO0O.OooO0o(textView, 1);
        this.f16905OooooOO = (CheckableImageButton) viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_picker_title_text);
        CharSequence charSequence = this.f16897OoooOOO;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f16909o000oOoO);
        }
        this.f16905OooooOO.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f16905OooooOO;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, p012OooOo0.OooOO0O.OooO0O0(context, p337o0OO0o0.OooOO0O.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], p012OooOo0.OooOO0O.OooO0O0(context, p337o0OO0o0.OooOO0O.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f16905OooooOO.setChecked(this.f16899OoooOo0 != 0);
        ViewCompat.OooOo0o(this.f16905OooooOO, null);
        OooO0oO(this.f16905OooooOO);
        this.f16905OooooOO.setOnClickListener(new o000oOoO(this));
        this.f16908Oooooo0 = (Button) viewInflate.findViewById(p337o0OO0o0.OooOOO0.confirm_button);
        if (OooO00o().o00oO0O()) {
            this.f16908Oooooo0.setEnabled(true);
        } else {
            this.f16908Oooooo0.setEnabled(false);
        }
        this.f16908Oooooo0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.f16901OoooOoo;
        if (charSequence2 != null) {
            this.f16908Oooooo0.setText(charSequence2);
        } else {
            int i = this.f16900OoooOoO;
            if (i != 0) {
                this.f16908Oooooo0.setText(i);
            }
        }
        this.f16908Oooooo0.setOnClickListener(new OooO00o());
        Button button = (Button) viewInflate.findViewById(p337o0OO0o0.OooOOO0.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f16903Ooooo0o;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.f16902Ooooo00;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new OooO0O0());
        return viewInflate;
    }

    @Override // androidx.fragment.app.OooOo00, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f16888Oooo.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f16894OoooO00);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f16893OoooO0);
        CalendarConstraints.OooO0O0 oooO0O0 = new CalendarConstraints.OooO0O0(this.f16892OoooO);
        Month month = this.f16896OoooOO0.f16954OoooO00;
        if (month != null) {
            oooO0O0.f16877OooO0OO = Long.valueOf(month.f16917OoooO0);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", oooO0O0.f16878OooO0Oo);
        Month monthOooO0Oo = Month.OooO0Oo(oooO0O0.f16875OooO00o);
        Month monthOooO0Oo2 = Month.OooO0Oo(oooO0O0.f16876OooO0O0);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = oooO0O0.f16877OooO0OO;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthOooO0Oo, monthOooO0Oo2, dateValidator, l == null ? null : Month.OooO0Oo(l.longValue())));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f16909o000oOoO);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f16897OoooOOO);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f16900OoooOoO);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f16901OoooOoo);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f16902Ooooo00);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f16903Ooooo0o);
    }

    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onStart() {
        androidx.core.view.OooOO0.OooO oooO0O0;
        androidx.core.view.OooOO0.OooO oooO0o;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f16898OoooOOo) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f16906OooooOo);
            if (!this.f16907Oooooo) {
                View viewFindViewById = requireView().findViewById(p337o0OO0o0.OooOOO0.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iOooO0O0 = o0O0000O.OooO0O0(window.getContext(), R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iOooO0O0);
                }
                Integer numValueOf2 = Integer.valueOf(iOooO0O0);
                o0000O00.OooO00o(window, false);
                int iOooO0o0 = i < 23 ? p071o000O0o.OooO0o.OooO0o0(o0O0000O.OooO0O0(window.getContext(), R.attr.statusBarColor, -16777216), 128) : 0;
                int iOooO0o1 = i < 27 ? p071o000O0o.OooO0o.OooO0o0(o0O0000O.OooO0O0(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(iOooO0o0);
                window.setNavigationBarColor(iOooO0o1);
                boolean z3 = o0O0000O.OooO0Oo(iOooO0o0) || (iOooO0o0 == 0 && o0O0000O.OooO0Oo(numValueOf.intValue()));
                boolean zOooO0Oo = o0O0000O.OooO0Oo(numValueOf2.intValue());
                if (o0O0000O.OooO0Oo(iOooO0o1) || (iOooO0o1 == 0 && zOooO0Oo)) {
                    z = true;
                }
                View decorView = window.getDecorView();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    oooO0o = new androidx.core.view.OooOO0.OooO0o(window);
                } else {
                    if (i2 >= 26) {
                        oooO0O0 = new androidx.core.view.OooOO0.OooO0OO(window, decorView);
                    } else {
                        oooO0O0 = i2 >= 23 ? new androidx.core.view.OooOO0.OooO0O0(window, decorView) : new androidx.core.view.OooOO0.OooO00o(window, decorView);
                    }
                    oooO0o = oooO0O0;
                }
                oooO0o.OooO0OO(z3);
                oooO0o.OooO0O0(z);
                Oooo0 oooo0 = new Oooo0(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop());
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooOOO.OooOo0(viewFindViewById, oooo0);
                this.f16907Oooooo = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f16906OooooOo, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new o0OOOO00(requireDialog(), rect));
        }
        OooO0o0();
    }

    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f16895OoooO0O.f17016Oooo0o.clear();
        super.onStop();
    }
}
