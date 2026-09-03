package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
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
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public Long f16984Oooo0o;

    public class OooO00o implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f16984Oooo0o = (Long) parcel.readValue(Long.class.getClassLoader());
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
    public final String OooOOoo(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f16984Oooo0o;
        if (l == null) {
            return resources.getString(p337o0OO0o0.OooOo.mtrl_picker_date_header_unselected);
        }
        return resources.getString(p337o0OO0o0.OooOo.mtrl_picker_date_header_selected, OooO.OooO0Oo(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final Collection<o000OO0O.OooO0o<Long, Long>> OooOo0O() {
        return new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public final Long o000000O() {
        return this.f16984Oooo0o;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void o0000O00(long j) {
        this.f16984Oooo0o = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View o0000Ooo(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, CalendarConstraints calendarConstraints, @NonNull o00oO0o o00oo0o2) {
        View viewInflate = layoutInflater.inflate(p337o0OO0o0.OooOOOO.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.OooO.OooO00o()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatOooO0o0 = o000OOo.OooO0o0();
        String strOooO0o = o000OOo.OooO0o(viewInflate.getResources(), simpleDateFormatOooO0o0);
        textInputLayout.setPlaceholderText(strOooO0o);
        Long l = this.f16984Oooo0o;
        if (l != null) {
            editText.setText(simpleDateFormatOooO0o0.format(l));
        }
        editText.addTextChangedListener(new o0OO00O(this, strOooO0o, simpleDateFormatOooO0o0, textInputLayout, calendarConstraints, o00oo0o2));
        com.google.android.material.internal.o00Ooo.OooO0oo(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int o00Oo0(Context context) {
        return o0OOO0O.OooO0O0.OooO0O0(context, p337o0OO0o0.OooO0o.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean o00oO0O() {
        return this.f16984Oooo0o != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final Collection<Long> oo0o0Oo() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f16984Oooo0o;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f16984Oooo0o);
    }
}
