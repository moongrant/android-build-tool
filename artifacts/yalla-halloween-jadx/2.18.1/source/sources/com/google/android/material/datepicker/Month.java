package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f16913Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final Calendar f16914Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f16915Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f16916Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final long f16917OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f16918OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public String f16919OoooO0O;

    public class OooO00o implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Month createFromParcel(@NonNull Parcel parcel) {
            return Month.OooO0O0(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarOooO0Oo = o000OOo.OooO0Oo(calendar);
        this.f16914Oooo0o = calendarOooO0Oo;
        this.f16915Oooo0oO = calendarOooO0Oo.get(2);
        this.f16916Oooo0oo = calendarOooO0Oo.get(1);
        this.f16913Oooo = calendarOooO0Oo.getMaximum(7);
        this.f16918OoooO00 = calendarOooO0Oo.getActualMaximum(5);
        this.f16917OoooO0 = calendarOooO0Oo.getTimeInMillis();
    }

    @NonNull
    public static Month OooO0O0(int i, int i2) {
        Calendar calendarOooO = o000OOo.OooO(null);
        calendarOooO.set(1, i);
        calendarOooO.set(2, i2);
        return new Month(calendarOooO);
    }

    @NonNull
    public static Month OooO0Oo(long j) {
        Calendar calendarOooO = o000OOo.OooO(null);
        calendarOooO.setTimeInMillis(j);
        return new Month(calendarOooO);
    }

    public final int OooO(@NonNull Month month) {
        if (!(this.f16914Oooo0o instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f16915Oooo0oO - this.f16915Oooo0oO) + ((month.f16916Oooo0oo - this.f16916Oooo0oo) * 12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull Month month) {
        return this.f16914Oooo0o.compareTo(month.f16914Oooo0o);
    }

    public final long OooO0o(int i) {
        Calendar calendarOooO0Oo = o000OOo.OooO0Oo(this.f16914Oooo0o);
        calendarOooO0Oo.set(5, i);
        return calendarOooO0Oo.getTimeInMillis();
    }

    public final int OooO0o0() {
        int firstDayOfWeek = this.f16914Oooo0o.get(7) - this.f16914Oooo0o.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f16913Oooo : firstDayOfWeek;
    }

    @NonNull
    public final String OooO0oO() {
        if (this.f16919OoooO0O == null) {
            this.f16919OoooO0O = DateUtils.formatDateTime(null, this.f16914Oooo0o.getTimeInMillis(), 8228);
        }
        return this.f16919OoooO0O;
    }

    @NonNull
    public final Month OooO0oo(int i) {
        Calendar calendarOooO0Oo = o000OOo.OooO0Oo(this.f16914Oooo0o);
        calendarOooO0Oo.add(2, i);
        return new Month(calendarOooO0Oo);
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
        return this.f16915Oooo0oO == month.f16915Oooo0oO && this.f16916Oooo0oo == month.f16916Oooo0oo;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16915Oooo0oO), Integer.valueOf(this.f16916Oooo0oo)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.f16916Oooo0oo);
        parcel.writeInt(this.f16915Oooo0oO);
    }
}
