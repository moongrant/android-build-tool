package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Month f16867Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final Month f16868Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final Month f16869Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public final DateValidator f16870Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f16871OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f16872OoooO00;

    public interface DateValidator extends Parcelable {
        boolean oo000o(long j);
    }

    public class OooO00o implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f16875OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f16876OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Long f16877OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public DateValidator f16878OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final long f16874OooO0o0 = o000OOo.OooO00o(Month.OooO0O0(1900, 0).f16917OoooO0);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final long f16873OooO0o = o000OOo.OooO00o(Month.OooO0O0(2100, 11).f16917OoooO0);

        public OooO0O0(@NonNull CalendarConstraints calendarConstraints) {
            this.f16875OooO00o = f16874OooO0o0;
            this.f16876OooO0O0 = f16873OooO0o;
            this.f16878OooO0Oo = new DateValidatorPointForward();
            this.f16875OooO00o = calendarConstraints.f16868Oooo0o.f16917OoooO0;
            this.f16876OooO0O0 = calendarConstraints.f16869Oooo0oO.f16917OoooO0;
            this.f16877OooO0OO = Long.valueOf(calendarConstraints.f16867Oooo.f16917OoooO0);
            this.f16878OooO0Oo = calendarConstraints.f16870Oooo0oo;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f16868Oooo0o = month;
        this.f16869Oooo0oO = month2;
        this.f16867Oooo = month3;
        this.f16870Oooo0oo = dateValidator;
        if (month3 != null && month.f16914Oooo0o.compareTo(month3.f16914Oooo0o) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f16914Oooo0o.compareTo(month2.f16914Oooo0o) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f16871OoooO0 = month.OooO(month2) + 1;
        this.f16872OoooO00 = (month2.f16916Oooo0oo - month.f16916Oooo0oo) + 1;
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
        return this.f16868Oooo0o.equals(calendarConstraints.f16868Oooo0o) && this.f16869Oooo0oO.equals(calendarConstraints.f16869Oooo0oO) && o000OO0O.OooO0OO.OooO00o(this.f16867Oooo, calendarConstraints.f16867Oooo) && this.f16870Oooo0oo.equals(calendarConstraints.f16870Oooo0oo);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16868Oooo0o, this.f16869Oooo0oO, this.f16867Oooo, this.f16870Oooo0oo});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f16868Oooo0o, 0);
        parcel.writeParcelable(this.f16869Oooo0oO, 0);
        parcel.writeParcelable(this.f16867Oooo, 0);
        parcel.writeParcelable(this.f16870Oooo0oo, 0);
    }
}
