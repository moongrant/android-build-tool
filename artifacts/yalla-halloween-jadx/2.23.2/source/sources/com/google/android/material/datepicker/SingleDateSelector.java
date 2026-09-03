package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import p272o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public CharSequence f16454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Long f16455OooO0o0;

    public class OooO00o implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f16455OooO0o0 = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final String Oooo0OO(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f16455OooO0o0;
        return resources.getString(o0000O0.mtrl_picker_announce_current_selection, l == null ? resources.getString(o0000O0.mtrl_picker_announce_current_selection_none) : OooOO0O.OooO0Oo(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int Oooo0oO(Context context) {
        return p276o0O00OoO.OooO0OO.OooO0OO(p272o0O0000o.o00000.materialCalendarTheme, context, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final String OoooooO(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f16455OooO0o0;
        if (l == null) {
            return resources.getString(o0000O0.mtrl_picker_date_header_unselected);
        }
        return resources.getString(o0000O0.mtrl_picker_date_header_selected, OooOO0O.OooO0Oo(l.longValue(), Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public final String getError() {
        if (TextUtils.isEmpty(this.f16454OooO0Oo)) {
            return null;
        }
        return this.f16454OooO0Oo.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final ArrayList o0000() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f16455OooO0o0;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean o00000o0() {
        return this.f16455OooO0o0 != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void o0000OOO(long j) {
        this.f16455OooO0o0 = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public final Long o0000oO() {
        return this.f16455OooO0o0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final ArrayList o00O0O() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View o00oO0o(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, CalendarConstraints calendarConstraints, @NonNull o00oO0o.OooO00o oooO00o) {
        View viewInflate = layoutInflater.inflate(p272o0O0000o.o0000O00.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(p272o0O0000o.o0000Ooo.mtrl_picker_text_input_date);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.OooOO0O.OooO00o()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatOooO0o0 = o0000.OooO0o0();
        String strOooO0o = o0000.OooO0o(viewInflate.getResources(), simpleDateFormatOooO0o0);
        textInputLayout.setPlaceholderText(strOooO0o);
        Long l = this.f16455OooO0o0;
        if (l != null) {
            editText.setText(simpleDateFormatOooO0o0.format(l));
        }
        editText.addTextChangedListener(new o000OOo(this, strOooO0o, simpleDateFormatOooO0o0, textInputLayout, calendarConstraints, oooO00o, textInputLayout));
        EditText[] editTextArr = {editText};
        editText.setOnFocusChangeListener(new OooO(editTextArr));
        EditText editText2 = editTextArr[0];
        editText2.requestFocus();
        editText2.post(new com.google.android.material.internal.o0Oo0oo(editText2));
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f16455OooO0o0);
    }
}
