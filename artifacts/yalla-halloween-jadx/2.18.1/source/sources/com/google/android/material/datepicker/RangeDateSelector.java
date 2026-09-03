package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
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
import java.util.Calendar;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<o000OO0O.OooO0o<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f16980Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Long f16981Oooo0oO = null;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Long f16982Oooo0oo = null;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Long f16979Oooo = null;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Long f16983OoooO00 = null;

    public class OooO00o implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f16981Oooo0oO = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f16982Oooo0oo = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    public static void OooO00o(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, o00oO0o o00oo0o2) {
        Long l = rangeDateSelector.f16979Oooo;
        if (l == null || rangeDateSelector.f16983OoooO00 == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f16980Oooo0o.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && ZegoConstants.ZegoVideoDataAuxPublishingStream.contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            o00oo0o2.OooO00o();
            return;
        }
        if (!rangeDateSelector.OooO0O0(l.longValue(), rangeDateSelector.f16983OoooO00.longValue())) {
            textInputLayout.setError(rangeDateSelector.f16980Oooo0o);
            textInputLayout2.setError(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            o00oo0o2.OooO00o();
        } else {
            Long l2 = rangeDateSelector.f16979Oooo;
            rangeDateSelector.f16981Oooo0oO = l2;
            Long l3 = rangeDateSelector.f16983OoooO00;
            rangeDateSelector.f16982Oooo0oo = l3;
            o00oo0o2.OooO0O0(new o000OO0O.OooO0o(l2, l3));
        }
    }

    public final boolean OooO0O0(long j, long j2) {
        return j <= j2;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final String OooOOoo(@NonNull Context context) {
        o000OO0O.OooO0o oooO0o;
        Resources resources = context.getResources();
        Long l = this.f16981Oooo0oO;
        if (l == null && this.f16982Oooo0oo == null) {
            return resources.getString(p337o0OO0o0.OooOo.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f16982Oooo0oo;
        if (l2 == null) {
            return resources.getString(p337o0OO0o0.OooOo.mtrl_picker_range_header_only_start_selected, OooO.OooO00o(l.longValue()));
        }
        if (l == null) {
            return resources.getString(p337o0OO0o0.OooOo.mtrl_picker_range_header_only_end_selected, OooO.OooO00o(l2.longValue()));
        }
        Calendar calendarOooO0oo = o000OOo.OooO0oo();
        Calendar calendarOooO = o000OOo.OooO(null);
        calendarOooO.setTimeInMillis(l.longValue());
        Calendar calendarOooO2 = o000OOo.OooO(null);
        calendarOooO2.setTimeInMillis(l2.longValue());
        if (calendarOooO.get(1) == calendarOooO2.get(1)) {
            oooO0o = calendarOooO.get(1) == calendarOooO0oo.get(1) ? new o000OO0O.OooO0o(OooO.OooO0O0(l.longValue(), Locale.getDefault()), OooO.OooO0O0(l2.longValue(), Locale.getDefault())) : new o000OO0O.OooO0o(OooO.OooO0O0(l.longValue(), Locale.getDefault()), OooO.OooO0Oo(l2.longValue(), Locale.getDefault()));
        } else {
            oooO0o = new o000OO0O.OooO0o(OooO.OooO0Oo(l.longValue(), Locale.getDefault()), OooO.OooO0Oo(l2.longValue(), Locale.getDefault()));
        }
        return resources.getString(p337o0OO0o0.OooOo.mtrl_picker_range_header_selected, oooO0o.f28234OooO00o, oooO0o.f28235OooO0O0);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final Collection<o000OO0O.OooO0o<Long, Long>> OooOo0O() {
        if (this.f16981Oooo0oO == null || this.f16982Oooo0oo == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o000OO0O.OooO0o(this.f16981Oooo0oO, this.f16982Oooo0oo));
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final o000OO0O.OooO0o<Long, Long> o000000O() {
        return new o000OO0O.OooO0o<>(this.f16981Oooo0oO, this.f16982Oooo0oo);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void o0000O00(long j) {
        Long l = this.f16981Oooo0oO;
        if (l == null) {
            this.f16981Oooo0oO = Long.valueOf(j);
        } else if (this.f16982Oooo0oo == null && OooO0O0(l.longValue(), j)) {
            this.f16982Oooo0oo = Long.valueOf(j);
        } else {
            this.f16982Oooo0oo = null;
            this.f16981Oooo0oO = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View o0000Ooo(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, CalendarConstraints calendarConstraints, @NonNull o00oO0o o00oo0o2) {
        View viewInflate = layoutInflater.inflate(p337o0OO0o0.OooOOOO.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(p337o0OO0o0.OooOOO0.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.OooO.OooO00o()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f16980Oooo0o = viewInflate.getResources().getString(p337o0OO0o0.OooOo.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatOooO0o0 = o000OOo.OooO0o0();
        Long l = this.f16981Oooo0oO;
        if (l != null) {
            editText.setText(simpleDateFormatOooO0o0.format(l));
            this.f16979Oooo = this.f16981Oooo0oO;
        }
        Long l2 = this.f16982Oooo0oo;
        if (l2 != null) {
            editText2.setText(simpleDateFormatOooO0o0.format(l2));
            this.f16983OoooO00 = this.f16982Oooo0oo;
        }
        String strOooO0o = o000OOo.OooO0o(viewInflate.getResources(), simpleDateFormatOooO0o0);
        textInputLayout.setPlaceholderText(strOooO0o);
        textInputLayout2.setPlaceholderText(strOooO0o);
        editText.addTextChangedListener(new o0OOO0o(this, strOooO0o, simpleDateFormatOooO0o0, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, o00oo0o2));
        editText2.addTextChangedListener(new o0Oo0oo(this, strOooO0o, simpleDateFormatOooO0o0, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, o00oo0o2));
        com.google.android.material.internal.o00Ooo.OooO0oo(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int o00Oo0(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return o0OOO0O.OooO0O0.OooO0O0(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(p337o0OO0o0.OooOO0.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? p337o0OO0o0.OooO0o.materialCalendarTheme : p337o0OO0o0.OooO0o.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean o00oO0O() {
        Long l = this.f16981Oooo0oO;
        return (l == null || this.f16982Oooo0oo == null || !OooO0O0(l.longValue(), this.f16982Oooo0oo.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final Collection<Long> oo0o0Oo() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f16981Oooo0oO;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f16982Oooo0oo;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.f16981Oooo0oO);
        parcel.writeValue(this.f16982Oooo0oo);
    }
}
