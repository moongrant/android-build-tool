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
import android.text.TextUtils;
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
import androidx.core.view.o000O0Oo;
import androidx.core.view.o000OO00;
import androidx.core.view.o0oOOo;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p270o0O0000o.o0000O0;
import p270o0O0000o.o0000O0O;
import p545o0oO0Ooo.b1;

/* JADX INFO: loaded from: classes3.dex */
public final class MaterialDatePicker<S> extends androidx.fragment.app.OooOo {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ int f16826OooOooO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f16827OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @StyleRes
    public int f16832OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o0OO00O<S> f16833OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f16834OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public DayViewDecorator f16835OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @StringRes
    public int f16836OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooOo00<S> f16837OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public CharSequence f16838OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f16839OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @StringRes
    public int f16840OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f16841OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public CharSequence f16842OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public CheckableImageButton f16843OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public CharSequence f16844OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @StringRes
    public int f16845OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public TextView f16846OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f16847OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Button f16848OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f16849OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f16850OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public CharSequence f16851OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public CharSequence f16852OooOoo0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashSet<oo000o<? super S>> f16828OooO0Oo = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f16830OooO0o0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f16829OooO0o = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f16831OooO0oO = new LinkedHashSet<>();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface InputMode {
    }

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            for (oo000o<? super S> oo000oVar : materialDatePicker.f16828OooO0Oo) {
                materialDatePicker.OooO0O0().o0000oo();
                oo000oVar.OooO00o();
            }
            materialDatePicker.dismiss();
        }
    }

    public class OooO0O0 extends androidx.core.view.OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            StringBuilder sb = new StringBuilder();
            int i = MaterialDatePicker.f16826OooOooO;
            sb.append(MaterialDatePicker.this.OooO0O0().getError());
            sb.append(", ");
            sb.append((Object) o0oo0oo2.OooO0o());
            o0oo0oo2.OooOOO0(sb.toString());
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator<View.OnClickListener> it = materialDatePicker.f16830OooO0o0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            materialDatePicker.dismiss();
        }
    }

    public class OooO0o extends o0Oo0oo<S> {
        public OooO0o() {
        }

        @Override // com.google.android.material.datepicker.o0Oo0oo
        public final void OooO00o() {
            MaterialDatePicker.this.f16848OooOoO.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.o0Oo0oo
        public final void OooO0O0(S s) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            String strOoooooO = materialDatePicker.OooO0O0().OoooooO(materialDatePicker.getContext());
            materialDatePicker.f16847OooOo0o.setContentDescription(materialDatePicker.OooO0O0().Oooo0OO(materialDatePicker.requireContext()));
            materialDatePicker.f16847OooOo0o.setText(strOoooooO);
            materialDatePicker.f16848OooOoO.setEnabled(materialDatePicker.OooO0O0().o00000o0());
        }
    }

    public static int OooO0OO(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(p270o0O0000o.o00000O.mtrl_calendar_content_padding);
        Month month = new Month(o0000.OooO0oo());
        int dimensionPixelSize = resources.getDimensionPixelSize(p270o0O0000o.o00000O.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(p270o0O0000o.o00000O.mtrl_calendar_month_horizontal_padding);
        int i = month.f16861OooO0oO;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    public static boolean OooO0Oo(@NonNull Context context) {
        return OooO0o0(R.attr.windowFullscreen, context);
    }

    public static boolean OooO0o0(int i, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(b1.OooO0OO(p270o0O0000o.o00000.materialCalendarStyle, context, OooOo00.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final DateSelector<S> OooO0O0() {
        if (this.f16827OooO == null) {
            this.f16827OooO = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f16827OooO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    public final void OooO0o() {
        o0OO00O<S> o00oo0o2;
        CharSequence charSequence;
        Context contextRequireContext = requireContext();
        int iOooo0o = this.f16832OooO0oo;
        if (iOooo0o == 0) {
            iOooo0o = OooO0O0().Oooo0o(contextRequireContext);
        }
        DateSelector<S> dateSelectorOooO0O0 = OooO0O0();
        CalendarConstraints calendarConstraints = this.f16834OooOO0O;
        DayViewDecorator dayViewDecorator = this.f16835OooOO0o;
        OooOo00<S> oooOo00 = new OooOo00<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iOooo0o);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorOooO0O0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f16808OooO0oO);
        oooOo00.setArguments(bundle);
        this.f16837OooOOO0 = oooOo00;
        boolean zIsChecked = this.f16843OooOo.isChecked();
        if (zIsChecked) {
            DateSelector<S> dateSelectorOooO0O1 = OooO0O0();
            CalendarConstraints calendarConstraints2 = this.f16834OooOO0O;
            o00oo0o2 = new o00oO0o<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iOooo0o);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorOooO0O1);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            o00oo0o2.setArguments(bundle2);
        } else {
            o00oo0o2 = this.f16837OooOOO0;
        }
        this.f16833OooOO0 = o00oo0o2;
        TextView textView = this.f16846OooOo0O;
        if (zIsChecked) {
            if (getResources().getConfiguration().orientation == 2) {
                charSequence = this.f16851OooOoo;
            } else {
                charSequence = this.f16852OooOoo0;
            }
        } else {
            charSequence = this.f16852OooOoo0;
        }
        textView.setText(charSequence);
        String strOoooooO = OooO0O0().OoooooO(getContext());
        this.f16847OooOo0o.setContentDescription(OooO0O0().Oooo0OO(requireContext()));
        this.f16847OooOo0o.setText(strOoooooO);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
        int i = p270o0O0000o.o0000Ooo.mtrl_calendar_frame;
        o0OO00O<S> o0oo00o2 = this.f16833OooOO0;
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        oooO00o.OooO0OO(i, o0oo00o2, null, 2);
        oooO00o.OooO0oo();
        this.f16833OooOO0.OooO0O0(new OooO0o());
    }

    public final void OooO0oO(@NonNull CheckableImageButton checkableImageButton) {
        this.f16843OooOo.setContentDescription(this.f16843OooOo.isChecked() ? checkableImageButton.getContext().getString(o0000O0.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(o0000O0.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.OooOo, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f16829OooO0o.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.OooOo, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16832OooO0oo = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f16827OooO = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f16834OooOO0O = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f16835OooOO0o = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f16836OooOOO = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f16838OooOOOO = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f16841OooOOo0 = bundle.getInt("INPUT_MODE_KEY");
        this.f16840OooOOo = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16842OooOOoo = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f16845OooOo00 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16844OooOo0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.f16838OooOOOO;
        if (text == null) {
            text = requireContext().getResources().getText(this.f16836OooOOO);
        }
        this.f16852OooOoo0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f16851OooOoo = text;
    }

    @Override // androidx.fragment.app.OooOo
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iOooo0o = this.f16832OooO0oo;
        if (iOooo0o == 0) {
            iOooo0o = OooO0O0().Oooo0o(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iOooo0o);
        Context context = dialog.getContext();
        this.f16839OooOOOo = OooO0Oo(context);
        int i = b1.OooO0OO(p270o0O0000o.o00000.colorSurface, context, MaterialDatePicker.class.getCanonicalName()).data;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, p270o0O0000o.o00000.materialCalendarStyle, o0000O0O.Widget_MaterialComponents_MaterialCalendar);
        this.f16849OooOoO0 = materialShapeDrawable;
        materialShapeDrawable.OooOO0O(context);
        this.f16849OooOoO0.OooOOO(ColorStateList.valueOf(i));
        MaterialShapeDrawable materialShapeDrawable2 = this.f16849OooOoO0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        materialShapeDrawable2.OooOOO0(ViewCompat.OooOOO.OooO(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f16839OooOOOo ? p270o0O0000o.o0000O00.mtrl_picker_fullscreen : p270o0O0000o.o0000O00.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f16835OooOO0o;
        if (dayViewDecorator != null) {
            dayViewDecorator.getClass();
        }
        if (this.f16839OooOOOo) {
            viewInflate.findViewById(p270o0O0000o.o0000Ooo.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(OooO0OO(context), -2));
        } else {
            viewInflate.findViewById(p270o0O0000o.o0000Ooo.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(OooO0OO(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(p270o0O0000o.o0000Ooo.mtrl_picker_header_selection_text);
        this.f16847OooOo0o = textView;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOO0O.OooO0o(textView, 1);
        this.f16843OooOo = (CheckableImageButton) viewInflate.findViewById(p270o0O0000o.o0000Ooo.mtrl_picker_header_toggle);
        this.f16846OooOo0O = (TextView) viewInflate.findViewById(p270o0O0000o.o0000Ooo.mtrl_picker_title_text);
        this.f16843OooOo.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f16843OooOo;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, p013OooOo0o.o00Oo0.OooO00o(context, p270o0O0000o.o00000OO.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], p013OooOo0o.o00Oo0.OooO00o(context, p270o0O0000o.o00000OO.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f16843OooOo.setChecked(this.f16841OooOOo0 != 0);
        ViewCompat.OooOOOO(this.f16843OooOo, null);
        OooO0oO(this.f16843OooOo);
        this.f16843OooOo.setOnClickListener(new o00Ooo(this));
        this.f16848OooOoO = (Button) viewInflate.findViewById(p270o0O0000o.o0000Ooo.confirm_button);
        if (OooO0O0().o00000o0()) {
            this.f16848OooOoO.setEnabled(true);
        } else {
            this.f16848OooOoO.setEnabled(false);
        }
        this.f16848OooOoO.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f16842OooOOoo;
        if (charSequence != null) {
            this.f16848OooOoO.setText(charSequence);
        } else {
            int i = this.f16840OooOOo;
            if (i != 0) {
                this.f16848OooOoO.setText(i);
            }
        }
        this.f16848OooOoO.setOnClickListener(new OooO00o());
        ViewCompat.OooOOOO(this.f16848OooOoO, new OooO0O0());
        Button button = (Button) viewInflate.findViewById(p270o0O0000o.o0000Ooo.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.f16844OooOo0;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i2 = this.f16845OooOo00;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new OooO0OO());
        return viewInflate;
    }

    @Override // androidx.fragment.app.OooOo, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f16831OooO0oO.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.OooOo, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f16832OooO0oo);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f16827OooO);
        CalendarConstraints.OooO0O0 oooO0O0 = new CalendarConstraints.OooO0O0(this.f16834OooOO0O);
        OooOo00<S> oooOo00 = this.f16837OooOOO0;
        Month month = oooOo00 == null ? null : oooOo00.f16901OooO;
        if (month != null) {
            oooO0O0.f16815OooO0OO = Long.valueOf(month.f16857OooO);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", oooO0O0.f16817OooO0o0);
        Month monthOooO0O0 = Month.OooO0O0(oooO0O0.f16813OooO00o);
        Month monthOooO0O1 = Month.OooO0O0(oooO0O0.f16814OooO0O0);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = oooO0O0.f16815OooO0OO;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthOooO0O0, monthOooO0O1, dateValidator, l != null ? Month.OooO0O0(l.longValue()) : null, oooO0O0.f16816OooO0Oo));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f16835OooOO0o);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f16836OooOOO);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f16838OooOOOO);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f16840OooOOo);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f16842OooOOoo);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f16845OooOo00);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f16844OooOo0);
    }

    @Override // androidx.fragment.app.OooOo, androidx.fragment.app.Fragment
    public final void onStart() {
        o0oOOo.OooO oooO0OO;
        o0oOOo.OooO oooO0OO2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f16839OooOOOo) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f16849OooOoO0);
            if (!this.f16850OooOoOO) {
                View viewFindViewById = requireView().findViewById(p270o0O0000o.o0000Ooo.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iOooO0O0 = p272o0O000oo.OooOOO.OooO0O0(R.attr.colorBackground, window.getContext(), -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iOooO0O0);
                }
                Integer numValueOf2 = Integer.valueOf(iOooO0O0);
                o000OO00.OooO00o(window, false);
                window.getContext();
                int iOooO0Oo = i < 27 ? p052o00000oO.OooOO0.OooO0Oo(p272o0O000oo.OooOOO.OooO0O0(R.attr.navigationBarColor, window.getContext(), -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iOooO0Oo);
                boolean z3 = p272o0O000oo.OooOOO.OooO0Oo(0) || p272o0O000oo.OooOOO.OooO0Oo(numValueOf.intValue());
                View decorView = window.getDecorView();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    oooO0OO = new o0oOOo.OooO0o(window);
                } else {
                    oooO0OO = i2 >= 26 ? new o0oOOo.OooO0OO(decorView, window) : new o0oOOo.OooO0O0(decorView, window);
                }
                oooO0OO.OooO0o0(z3);
                boolean zOooO0Oo = p272o0O000oo.OooOOO.OooO0Oo(numValueOf2.intValue());
                if (p272o0O000oo.OooOOO.OooO0Oo(iOooO0Oo) || (iOooO0Oo == 0 && zOooO0Oo)) {
                    z = true;
                }
                View decorView2 = window.getDecorView();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    oooO0OO2 = new o0oOOo.OooO0o(window);
                } else {
                    oooO0OO2 = i3 >= 26 ? new o0oOOo.OooO0OO(decorView2, window) : new o0oOOo.OooO0O0(decorView2, window);
                }
                oooO0OO2.OooO0Oo(z);
                o00Oo0 o00oo1 = new o00Oo0(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop());
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooOOO.OooOo0(viewFindViewById, o00oo1);
                this.f16850OooOoOO = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(p270o0O0000o.o00000O.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f16849OooOoO0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new o0O00.OooO00o(requireDialog(), rect));
        }
        OooO0o();
    }

    @Override // androidx.fragment.app.OooOo, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f16833OooOO0.f16956OooO0Oo.clear();
        super.onStop();
    }
}
