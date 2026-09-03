package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final OooO0o f16347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final List<CalendarConstraints.DateValidator> f16348OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f16345OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0O0 f16346OooO0oO = new OooO0O0();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new OooO0OO();

    public class OooO00o implements OooO0o {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.OooO0o
        public final boolean OooO00o(long j, @NonNull List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.OoooO00(j)) {
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
        public final boolean OooO00o(long j, @NonNull List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.OoooO00(j)) {
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
            OooO0o oooO0o = CompositeDateValidator.f16346OooO0oO;
            if (i != 2 && i == 1) {
                oooO0o = CompositeDateValidator.f16345OooO0o;
            }
            arrayList.getClass();
            return new CompositeDateValidator(arrayList, oooO0o);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    public interface OooO0o {
        boolean OooO00o(long j, @NonNull List list);

        int getId();
    }

    public CompositeDateValidator() {
        throw null;
    }

    public CompositeDateValidator(ArrayList arrayList, OooO0o oooO0o) {
        this.f16348OooO0o0 = arrayList;
        this.f16347OooO0Oo = oooO0o;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean OoooO00(long j) {
        return this.f16347OooO0Oo.OooO00o(j, this.f16348OooO0o0);
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
        return this.f16348OooO0o0.equals(compositeDateValidator.f16348OooO0o0) && this.f16347OooO0Oo.getId() == compositeDateValidator.f16347OooO0Oo.getId();
    }

    public final int hashCode() {
        return this.f16348OooO0o0.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeList(this.f16348OooO0o0);
        parcel.writeInt(this.f16347OooO0Oo.getId());
    }
}
