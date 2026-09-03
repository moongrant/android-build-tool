package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f16331OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Month f16332OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final DateValidator f16333OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Month f16334OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Month f16335OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f16336OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f16337OooOO0;

    public interface DateValidator extends Parcelable {
        boolean OoooO00(long j);
    }

    public class OooO00o implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final long f16338OooO0o = o0000.OooO00o(Month.OooO00o(1900, 0).f16384OooO);

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final long f16339OooO0oO = o0000.OooO00o(Month.OooO00o(2100, 11).f16384OooO);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f16340OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f16341OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f16342OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f16343OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final DateValidator f16344OooO0o0;

        public OooO0O0(@NonNull CalendarConstraints calendarConstraints) {
            this.f16340OooO00o = f16338OooO0o;
            this.f16341OooO0O0 = f16339OooO0oO;
            this.f16344OooO0o0 = new DateValidatorPointForward(Long.MIN_VALUE);
            this.f16340OooO00o = calendarConstraints.f16332OooO0Oo.f16384OooO;
            this.f16341OooO0O0 = calendarConstraints.f16334OooO0o0.f16384OooO;
            this.f16342OooO0OO = Long.valueOf(calendarConstraints.f16335OooO0oO.f16384OooO);
            this.f16343OooO0Oo = calendarConstraints.f16336OooO0oo;
            this.f16344OooO0o0 = calendarConstraints.f16333OooO0o;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f16332OooO0Oo = month;
        this.f16334OooO0o0 = month2;
        this.f16335OooO0oO = month3;
        this.f16336OooO0oo = i;
        this.f16333OooO0o = dateValidator;
        Calendar calendar = month.f16385OooO0Oo;
        if (month3 != null && calendar.compareTo(month3.f16385OooO0Oo) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f16385OooO0Oo.compareTo(month2.f16385OooO0Oo) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > o0000.OooO(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i2 = month2.f16386OooO0o;
        int i3 = month.f16386OooO0o;
        this.f16337OooOO0 = (month2.f16387OooO0o0 - month.f16387OooO0o0) + ((i2 - i3) * 12) + 1;
        this.f16331OooO = (i2 - i3) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f16332OooO0Oo.equals(calendarConstraints.f16332OooO0Oo) && this.f16334OooO0o0.equals(calendarConstraints.f16334OooO0o0) && o000OO.OooO0OO.OooO00o(this.f16335OooO0oO, calendarConstraints.f16335OooO0oO) && this.f16336OooO0oo == calendarConstraints.f16336OooO0oo && this.f16333OooO0o.equals(calendarConstraints.f16333OooO0o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16332OooO0Oo, this.f16334OooO0o0, this.f16335OooO0oO, Integer.valueOf(this.f16336OooO0oo), this.f16333OooO0o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f16332OooO0Oo, 0);
        parcel.writeParcelable(this.f16334OooO0o0, 0);
        parcel.writeParcelable(this.f16335OooO0oO, 0);
        parcel.writeParcelable(this.f16333OooO0o, 0);
        parcel.writeInt(this.f16336OooO0oo);
    }
}
