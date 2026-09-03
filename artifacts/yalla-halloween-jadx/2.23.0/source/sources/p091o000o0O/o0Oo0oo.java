package p091o000o0O;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.work.BackoffPolicy;
import androidx.work.OooO0O0;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import kotlin.ULong;
import p028Oooo0oO.o0O00o0;
import p069o0000ooO.o0OO00O;
import p084o000Ooo0.OooO;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"period_start_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @ColumnInfo(name = "flex_duration")
    public long f35261OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "id")
    public String f35262OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "state")
    public WorkInfo$State f35263OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "worker_class_name")
    public String f35264OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ColumnInfo(name = "input_merger_class_name")
    public String f35265OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "output")
    public OooO0O0 f35266OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "input")
    public OooO0O0 f35267OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @ColumnInfo(name = "initial_delay")
    public long f35268OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @ColumnInfo(name = "interval_duration")
    public long f35269OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    @Embedded
    public OooO f35270OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    @ColumnInfo(name = "run_attempt_count")
    public int f35271OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy f35272OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @ColumnInfo(name = "period_start_time")
    public long f35273OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @ColumnInfo(name = "backoff_delay_duration")
    public long f35274OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @ColumnInfo(name = "minimum_retention_duration")
    public long f35275OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @ColumnInfo(name = "schedule_requested_at")
    public long f35276OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy f35277OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @ColumnInfo(name = "run_in_foreground")
    public boolean f35278OooOOo0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @ColumnInfo(name = "id")
        public String f35279OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @ColumnInfo(name = "state")
        public WorkInfo$State f35280OooO0O0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (this.f35280OooO0O0 != oooO00o.f35280OooO0O0) {
                return false;
            }
            return this.f35279OooO00o.equals(oooO00o.f35279OooO00o);
        }

        public final int hashCode() {
            return this.f35280OooO0O0.hashCode() + (this.f35279OooO00o.hashCode() * 31);
        }
    }

    static {
        o000oOoO.OooO0o0("WorkSpec");
    }

    public o0Oo0oo(@NonNull String str, @NonNull String str2) {
        this.f35263OooO0O0 = WorkInfo$State.ENQUEUED;
        OooO0O0 oooO0O0 = OooO0O0.f8387OooO0OO;
        this.f35267OooO0o0 = oooO0O0;
        this.f35266OooO0o = oooO0O0;
        this.f35270OooOO0 = OooO.f35082OooO;
        this.f35272OooOO0o = BackoffPolicy.EXPONENTIAL;
        this.f35274OooOOO0 = 30000L;
        this.f35276OooOOOo = -1L;
        this.f35277OooOOo = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f35262OooO00o = str;
        this.f35264OooO0OO = str2;
    }

    public final long OooO00o() {
        long jCurrentTimeMillis;
        long j;
        if (this.f35263OooO0O0 == WorkInfo$State.ENQUEUED && this.f35271OooOO0O > 0) {
            long jScalb = this.f35272OooOO0o == BackoffPolicy.LINEAR ? this.f35274OooOOO0 * ((long) this.f35271OooOO0O) : (long) Math.scalb(this.f35274OooOOO0, this.f35271OooOO0O - 1);
            j = this.f35273OooOOO;
            jCurrentTimeMillis = Math.min(18000000L, jScalb);
        } else {
            if (OooO0OO()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j2 = this.f35273OooOOO;
                if (j2 == 0) {
                    j2 = this.f35268OooO0oO + jCurrentTimeMillis2;
                }
                long j3 = this.f35261OooO;
                long j4 = this.f35269OooO0oo;
                if (j3 != j4) {
                    return j2 + j4 + (j2 == 0 ? j3 * (-1) : 0L);
                }
                return j2 + (j2 != 0 ? j4 : 0L);
            }
            jCurrentTimeMillis = this.f35273OooOOO;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            j = this.f35268OooO0oO;
        }
        return jCurrentTimeMillis + j;
    }

    public final boolean OooO0O0() {
        return !OooO.f35082OooO.equals(this.f35270OooOO0);
    }

    public final boolean OooO0OO() {
        return this.f35269OooO0oo != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0Oo0oo.class != obj.getClass()) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        if (this.f35268OooO0oO != o0oo0oo2.f35268OooO0oO || this.f35269OooO0oo != o0oo0oo2.f35269OooO0oo || this.f35261OooO != o0oo0oo2.f35261OooO || this.f35271OooOO0O != o0oo0oo2.f35271OooOO0O || this.f35274OooOOO0 != o0oo0oo2.f35274OooOOO0 || this.f35273OooOOO != o0oo0oo2.f35273OooOOO || this.f35275OooOOOO != o0oo0oo2.f35275OooOOOO || this.f35276OooOOOo != o0oo0oo2.f35276OooOOOo || this.f35278OooOOo0 != o0oo0oo2.f35278OooOOo0 || !this.f35262OooO00o.equals(o0oo0oo2.f35262OooO00o) || this.f35263OooO0O0 != o0oo0oo2.f35263OooO0O0 || !this.f35264OooO0OO.equals(o0oo0oo2.f35264OooO0OO)) {
            return false;
        }
        String str = this.f35265OooO0Oo;
        if (str == null ? o0oo0oo2.f35265OooO0Oo == null : str.equals(o0oo0oo2.f35265OooO0Oo)) {
            return this.f35267OooO0o0.equals(o0oo0oo2.f35267OooO0o0) && this.f35266OooO0o.equals(o0oo0oo2.f35266OooO0o) && this.f35270OooOO0.equals(o0oo0oo2.f35270OooOO0) && this.f35272OooOO0o == o0oo0oo2.f35272OooOO0o && this.f35277OooOOo == o0oo0oo2.f35277OooOOo;
        }
        return false;
    }

    public final int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.f35264OooO0OO, (this.f35263OooO0O0.hashCode() + (this.f35262OooO00o.hashCode() * 31)) * 31, 31);
        String str = this.f35265OooO0Oo;
        int iHashCode = (this.f35266OooO0o.hashCode() + ((this.f35267OooO0o0.hashCode() + ((iOooO00o + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f35268OooO0oO;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f35269OooO0oo;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f35261OooO;
        int iHashCode2 = (this.f35272OooOO0o.hashCode() + ((((this.f35270OooOO0.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f35271OooOO0O) * 31)) * 31;
        long j4 = this.f35274OooOOO0;
        int i3 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f35273OooOOO;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f35275OooOOOO;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f35276OooOOOo;
        return this.f35277OooOOo.hashCode() + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f35278OooOOo0 ? 1 : 0)) * 31);
    }

    @NonNull
    public final String toString() {
        return o0O00o0.OooO0O0(new StringBuilder("{WorkSpec: "), this.f35262OooO00o, "}");
    }

    public o0Oo0oo(@NonNull o0Oo0oo o0oo0oo2) {
        this.f35263OooO0O0 = WorkInfo$State.ENQUEUED;
        OooO0O0 oooO0O0 = OooO0O0.f8387OooO0OO;
        this.f35267OooO0o0 = oooO0O0;
        this.f35266OooO0o = oooO0O0;
        this.f35270OooOO0 = OooO.f35082OooO;
        this.f35272OooOO0o = BackoffPolicy.EXPONENTIAL;
        this.f35274OooOOO0 = 30000L;
        this.f35276OooOOOo = -1L;
        this.f35277OooOOo = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f35262OooO00o = o0oo0oo2.f35262OooO00o;
        this.f35264OooO0OO = o0oo0oo2.f35264OooO0OO;
        this.f35263OooO0O0 = o0oo0oo2.f35263OooO0O0;
        this.f35265OooO0Oo = o0oo0oo2.f35265OooO0Oo;
        this.f35267OooO0o0 = new OooO0O0(o0oo0oo2.f35267OooO0o0);
        this.f35266OooO0o = new OooO0O0(o0oo0oo2.f35266OooO0o);
        this.f35268OooO0oO = o0oo0oo2.f35268OooO0oO;
        this.f35269OooO0oo = o0oo0oo2.f35269OooO0oo;
        this.f35261OooO = o0oo0oo2.f35261OooO;
        this.f35270OooOO0 = new OooO(o0oo0oo2.f35270OooOO0);
        this.f35271OooOO0O = o0oo0oo2.f35271OooOO0O;
        this.f35272OooOO0o = o0oo0oo2.f35272OooOO0o;
        this.f35274OooOOO0 = o0oo0oo2.f35274OooOOO0;
        this.f35273OooOOO = o0oo0oo2.f35273OooOOO;
        this.f35275OooOOOO = o0oo0oo2.f35275OooOOOO;
        this.f35276OooOOOo = o0oo0oo2.f35276OooOOOo;
        this.f35278OooOOo0 = o0oo0oo2.f35278OooOOo0;
        this.f35277OooOOo = o0oo0oo2.f35277OooOOo;
    }
}
