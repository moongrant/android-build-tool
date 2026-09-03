package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import p272o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<o000OO.OooO0o<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public CharSequence f16449OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f16451OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Long f16450OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Long f16452OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Long f16453OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Long f16448OooO = null;

    public class OooO00o implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f16450OooO0o = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f16452OooO0oO = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    public static void OooO00o(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, o0Oo0oo o0oo0oo2) {
        Long l = rangeDateSelector.f16453OooO0oo;
        if (l == null || rangeDateSelector.f16448OooO == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f16451OooO0o0.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && ZegoConstants.ZegoVideoDataAuxPublishingStream.contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            o0oo0oo2.OooO00o();
        } else {
            if (l.longValue() <= rangeDateSelector.f16448OooO.longValue()) {
                Long l2 = rangeDateSelector.f16453OooO0oo;
                rangeDateSelector.f16450OooO0o = l2;
                Long l3 = rangeDateSelector.f16448OooO;
                rangeDateSelector.f16452OooO0oO = l3;
                o0oo0oo2.OooO0O0(new o000OO.OooO0o(l2, l3));
            } else {
                textInputLayout.setError(rangeDateSelector.f16451OooO0o0);
                textInputLayout2.setError(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o0oo0oo2.OooO00o();
            }
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            rangeDateSelector.f16449OooO0Oo = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            rangeDateSelector.f16449OooO0Oo = null;
        } else {
            rangeDateSelector.f16449OooO0Oo = textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final String Oooo0OO(@NonNull Context context) {
        Resources resources = context.getResources();
        o000OO.OooO0o<String, String> oooO0oOooO00o = OooOO0O.OooO00o(this.f16450OooO0o, this.f16452OooO0oO);
        String str = oooO0oOooO00o.f34374OooO00o;
        String string = str == null ? resources.getString(o0000O0.mtrl_picker_announce_current_selection_none) : str;
        String str2 = oooO0oOooO00o.f34375OooO0O0;
        return resources.getString(o0000O0.mtrl_picker_announce_current_range_selection, string, str2 == null ? resources.getString(o0000O0.mtrl_picker_announce_current_selection_none) : str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int Oooo0oO(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return p276o0O00OoO.OooO0OO.OooO0OO(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(p272o0O0000o.o00000O.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? p272o0O0000o.o00000.materialCalendarTheme : p272o0O0000o.o00000.materialCalendarFullscreenTheme, context, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final String OoooooO(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.f16450OooO0o;
        if (l == null && this.f16452OooO0oO == null) {
            return resources.getString(o0000O0.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f16452OooO0oO;
        if (l2 == null) {
            return resources.getString(o0000O0.mtrl_picker_range_header_only_start_selected, OooOO0O.OooO0O0(l.longValue()));
        }
        if (l == null) {
            return resources.getString(o0000O0.mtrl_picker_range_header_only_end_selected, OooOO0O.OooO0O0(l2.longValue()));
        }
        o000OO.OooO0o<String, String> oooO0oOooO00o = OooOO0O.OooO00o(l, l2);
        return resources.getString(o0000O0.mtrl_picker_range_header_selected, oooO0oOooO00o.f34374OooO00o, oooO0oOooO00o.f34375OooO0O0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public final String getError() {
        if (TextUtils.isEmpty(this.f16449OooO0Oo)) {
            return null;
        }
        return this.f16449OooO0Oo.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final ArrayList o0000() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f16450OooO0o;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f16452OooO0oO;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean o00000o0() {
        Long l = this.f16450OooO0o;
        if (l == null || this.f16452OooO0oO == null) {
            return false;
        }
        return (l.longValue() > this.f16452OooO0oO.longValue() ? 1 : (l.longValue() == this.f16452OooO0oO.longValue() ? 0 : -1)) <= 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void o0000OOO(long j) {
        Long l = this.f16450OooO0o;
        if (l == null) {
            this.f16450OooO0o = Long.valueOf(j);
            return;
        }
        if (this.f16452OooO0oO == null) {
            if (l.longValue() <= j) {
                this.f16452OooO0oO = Long.valueOf(j);
                return;
            }
        }
        this.f16452OooO0oO = null;
        this.f16450OooO0o = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final o000OO.OooO0o<Long, Long> o0000oO() {
        return new o000OO.OooO0o<>(this.f16450OooO0o, this.f16452OooO0oO);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final ArrayList o00O0O() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o000OO.OooO0o(this.f16450OooO0o, this.f16452OooO0oO));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View o00oO0o(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, CalendarConstraints calendarConstraints, @NonNull o00oO0o.OooO00o oooO00o) {
        View viewInflate = layoutInflater.inflate(p272o0O0000o.o0000O00.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(p272o0O0000o.o0000Ooo.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(p272o0O0000o.o0000Ooo.mtrl_picker_text_input_range_end);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        textInputLayout2.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.OooOO0O.OooO00o()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f16451OooO0o0 = viewInflate.getResources().getString(o0000O0.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatOooO0o0 = o0000.OooO0o0();
        Long l = this.f16450OooO0o;
        if (l != null) {
            editText.setText(simpleDateFormatOooO0o0.format(l));
            this.f16453OooO0oo = this.f16450OooO0o;
        }
        Long l2 = this.f16452OooO0oO;
        if (l2 != null) {
            editText2.setText(simpleDateFormatOooO0o0.format(l2));
            this.f16448OooO = this.f16452OooO0oO;
        }
        String strOooO0o = o0000.OooO0o(viewInflate.getResources(), simpleDateFormatOooO0o0);
        textInputLayout.setPlaceholderText(strOooO0o);
        textInputLayout2.setPlaceholderText(strOooO0o);
        editText.addTextChangedListener(new oo0o0Oo(this, strOooO0o, simpleDateFormatOooO0o0, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, oooO00o));
        editText2.addTextChangedListener(new o0O0O00(this, strOooO0o, simpleDateFormatOooO0o0, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, oooO00o));
        EditText[] editTextArr = {editText, editText2};
        OooO oooO = new OooO(editTextArr);
        for (int i = 0; i < 2; i++) {
            editTextArr[i].setOnFocusChangeListener(oooO);
        }
        EditText editText3 = editTextArr[0];
        editText3.requestFocus();
        editText3.post(new com.google.android.material.internal.o0Oo0oo(editText3));
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f16450OooO0o);
        parcel.writeValue(this.f16452OooO0oO);
    }
}
