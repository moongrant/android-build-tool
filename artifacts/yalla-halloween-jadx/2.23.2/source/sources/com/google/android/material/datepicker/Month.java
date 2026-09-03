package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f16384OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Calendar f16385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f16386OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f16387OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f16388OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f16389OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public String f16390OooOO0;

    public class OooO00o implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Month createFromParcel(@NonNull Parcel parcel) {
            return Month.OooO00o(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarOooO0Oo = o0000.OooO0Oo(calendar);
        this.f16385OooO0Oo = calendarOooO0Oo;
        this.f16387OooO0o0 = calendarOooO0Oo.get(2);
        this.f16386OooO0o = calendarOooO0Oo.get(1);
        this.f16388OooO0oO = calendarOooO0Oo.getMaximum(7);
        this.f16389OooO0oo = calendarOooO0Oo.getActualMaximum(5);
        this.f16384OooO = calendarOooO0Oo.getTimeInMillis();
    }

    @NonNull
    public static Month OooO00o(int i, int i2) {
        Calendar calendarOooO = o0000.OooO(null);
        calendarOooO.set(1, i);
        calendarOooO.set(2, i2);
        return new Month(calendarOooO);
    }

    @NonNull
    public static Month OooO0O0(long j) {
        Calendar calendarOooO = o0000.OooO(null);
        calendarOooO.setTimeInMillis(j);
        return new Month(calendarOooO);
    }

    @NonNull
    public final String OooO0OO() {
        if (this.f16390OooOO0 == null) {
            long timeInMillis = this.f16385OooO0Oo.getTimeInMillis();
            this.f16390OooOO0 = Build.VERSION.SDK_INT >= 24 ? o0000.OooO0OO("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        return this.f16390OooOO0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull Month month) {
        return this.f16385OooO0Oo.compareTo(month.f16385OooO0Oo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f16387OooO0o0 == month.f16387OooO0o0 && this.f16386OooO0o == month.f16386OooO0o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16387OooO0o0), Integer.valueOf(this.f16386OooO0o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.f16386OooO0o);
        parcel.writeInt(this.f16387OooO0o0);
    }
}
