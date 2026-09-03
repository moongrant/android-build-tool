package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final OooO0o f16881Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final List<CalendarConstraints.DateValidator> f16882Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final OooO00o f16880Oooo0oo = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final OooO0O0 f16879Oooo = new OooO0O0();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new OooO0OO();

    public class OooO00o implements OooO0o {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.OooO0o
        public final boolean OooO00o(@NonNull List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.oo000o(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.OooO0o
        public final int getId() {
            return 1;
        }
    }

    public class OooO0O0 implements OooO0o {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.OooO0o
        public final boolean OooO00o(@NonNull List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.oo000o(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.OooO0o
        public final int getId() {
            return 2;
        }
    }

    public class OooO0OO implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            OooO0o oooO0o = (i != 2 && i == 1) ? CompositeDateValidator.f16880Oooo0oo : CompositeDateValidator.f16879Oooo;
            Objects.requireNonNull(arrayList);
            return new CompositeDateValidator(arrayList, oooO0o, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    public interface OooO0o {
        boolean OooO00o(@NonNull List<CalendarConstraints.DateValidator> list, long j);

        int getId();
    }

    public CompositeDateValidator(List list, OooO0o oooO0o, OooO00o oooO00o) {
        this.f16882Oooo0oO = list;
        this.f16881Oooo0o = oooO0o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f16882Oooo0oO.equals(compositeDateValidator.f16882Oooo0oO) && this.f16881Oooo0o.getId() == compositeDateValidator.f16881Oooo0o.getId();
    }

    public final int hashCode() {
        return this.f16882Oooo0oO.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean oo000o(long j) {
        return this.f16881Oooo0o.OooO00o(this.f16882Oooo0oO, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeList(this.f16882Oooo0oO);
        parcel.writeInt(this.f16881Oooo0o.getId());
    }
}
