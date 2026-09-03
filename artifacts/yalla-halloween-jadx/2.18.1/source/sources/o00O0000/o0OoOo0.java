package o00O0000;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.facebook.internal.ServerProtocol;
import kotlin.ULong;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"period_start_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @ColumnInfo(name = "flex_duration")
    public long f30151OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "id")
    public String f30152OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = ServerProtocol.DIALOG_PARAM_STATE)
    public WorkInfo$State f30153OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "worker_class_name")
    public String f30154OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ColumnInfo(name = "input_merger_class_name")
    public String f30155OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "output")
    public androidx.work.OooO0O0 f30156OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "input")
    public androidx.work.OooO0O0 f30157OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @ColumnInfo(name = "initial_delay")
    public long f30158OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @ColumnInfo(name = "interval_duration")
    public long f30159OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    @Embedded
    public p102o000oo.OooOO0O f30160OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    @ColumnInfo(name = "run_attempt_count")
    public int f30161OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy f30162OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @ColumnInfo(name = "period_start_time")
    public long f30163OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @ColumnInfo(name = "backoff_delay_duration")
    public long f30164OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @ColumnInfo(name = "minimum_retention_duration")
    public long f30165OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @ColumnInfo(name = "schedule_requested_at")
    public long f30166OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy f30167OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @ColumnInfo(name = "run_in_foreground")
    public boolean f30168OooOOo0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @ColumnInfo(name = "id")
        public String f30169OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @ColumnInfo(name = ServerProtocol.DIALOG_PARAM_STATE)
        public WorkInfo$State f30170OooO0O0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (this.f30170OooO0O0 != oooO00o.f30170OooO0O0) {
                return false;
            }
            return this.f30169OooO00o.equals(oooO00o.f30169OooO00o);
        }

        public final int hashCode() {
            return this.f30170OooO0O0.hashCode() + (this.f30169OooO00o.hashCode() * 31);
        }
    }

    static {
        p102o000oo.o0OoOo0.OooO0o0("WorkSpec");
    }

    public o0OoOo0(@NonNull String str, @NonNull String str2) {
        this.f30153OooO0O0 = WorkInfo$State.ENQUEUED;
        androidx.work.OooO0O0 oooO0O0 = androidx.work.OooO0O0.f9742OooO0OO;
        this.f30157OooO0o0 = oooO0O0;
        this.f30156OooO0o = oooO0O0;
        this.f30160OooOO0 = p102o000oo.OooOO0O.f29788OooO;
        this.f30162OooOO0o = BackoffPolicy.EXPONENTIAL;
        this.f30164OooOOO0 = 30000L;
        this.f30166OooOOOo = -1L;
        this.f30167OooOOo = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f30152OooO00o = str;
        this.f30154OooO0OO = str2;
    }

    public final long OooO00o() {
        if (this.f30153OooO0O0 == WorkInfo$State.ENQUEUED && this.f30161OooOO0O > 0) {
            return Math.min(18000000L, this.f30162OooOO0o == BackoffPolicy.LINEAR ? this.f30164OooOOO0 * ((long) this.f30161OooOO0O) : (long) Math.scalb(this.f30164OooOOO0, this.f30161OooOO0O - 1)) + this.f30163OooOOO;
        }
        if (!OooO0OO()) {
            long jCurrentTimeMillis = this.f30163OooOOO;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f30158OooO0oO;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.f30163OooOOO;
        long j2 = j == 0 ? jCurrentTimeMillis2 + this.f30158OooO0oO : j;
        long j3 = this.f30151OooO;
        long j4 = this.f30159OooO0oo;
        if (j3 != j4) {
            return j2 + j4 + (j == 0 ? j3 * (-1) : 0L);
        }
        return j2 + (j != 0 ? j4 : 0L);
    }

    public final boolean OooO0O0() {
        return !p102o000oo.OooOO0O.f29788OooO.equals(this.f30160OooOO0);
    }

    public final boolean OooO0OO() {
        return this.f30159OooO0oo != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0OoOo0.class != obj.getClass()) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        if (this.f30158OooO0oO != o0oooo1.f30158OooO0oO || this.f30159OooO0oo != o0oooo1.f30159OooO0oo || this.f30151OooO != o0oooo1.f30151OooO || this.f30161OooOO0O != o0oooo1.f30161OooOO0O || this.f30164OooOOO0 != o0oooo1.f30164OooOOO0 || this.f30163OooOOO != o0oooo1.f30163OooOOO || this.f30165OooOOOO != o0oooo1.f30165OooOOOO || this.f30166OooOOOo != o0oooo1.f30166OooOOOo || this.f30168OooOOo0 != o0oooo1.f30168OooOOo0 || !this.f30152OooO00o.equals(o0oooo1.f30152OooO00o) || this.f30153OooO0O0 != o0oooo1.f30153OooO0O0 || !this.f30154OooO0OO.equals(o0oooo1.f30154OooO0OO)) {
            return false;
        }
        String str = this.f30155OooO0Oo;
        if (str == null ? o0oooo1.f30155OooO0Oo == null : str.equals(o0oooo1.f30155OooO0Oo)) {
            return this.f30157OooO0o0.equals(o0oooo1.f30157OooO0o0) && this.f30156OooO0o.equals(o0oooo1.f30156OooO0o) && this.f30160OooOO0.equals(o0oooo1.f30160OooOO0) && this.f30162OooOO0o == o0oooo1.f30162OooOO0o && this.f30167OooOOo == o0oooo1.f30167OooOOo;
        }
        return false;
    }

    public final int hashCode() {
        int iOooO00o = o0O0O00.OooO00o(this.f30154OooO0OO, (this.f30153OooO0O0.hashCode() + (this.f30152OooO00o.hashCode() * 31)) * 31, 31);
        String str = this.f30155OooO0Oo;
        int iHashCode = (this.f30156OooO0o.hashCode() + ((this.f30157OooO0o0.hashCode() + ((iOooO00o + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f30158OooO0oO;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f30159OooO0oo;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f30151OooO;
        int iHashCode2 = (this.f30162OooOO0o.hashCode() + ((((this.f30160OooOO0.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f30161OooOO0O) * 31)) * 31;
        long j4 = this.f30164OooOOO0;
        int i3 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f30163OooOOO;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f30165OooOOOO;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f30166OooOOOo;
        return this.f30167OooOOo.hashCode() + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f30168OooOOo0 ? 1 : 0)) * 31);
    }

    @NonNull
    public final String toString() {
        return p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("{WorkSpec: "), this.f30152OooO00o, "}");
    }

    public o0OoOo0(@NonNull o0OoOo0 o0oooo1) {
        this.f30153OooO0O0 = WorkInfo$State.ENQUEUED;
        androidx.work.OooO0O0 oooO0O0 = androidx.work.OooO0O0.f9742OooO0OO;
        this.f30157OooO0o0 = oooO0O0;
        this.f30156OooO0o = oooO0O0;
        this.f30160OooOO0 = p102o000oo.OooOO0O.f29788OooO;
        this.f30162OooOO0o = BackoffPolicy.EXPONENTIAL;
        this.f30164OooOOO0 = 30000L;
        this.f30166OooOOOo = -1L;
        this.f30167OooOOo = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f30152OooO00o = o0oooo1.f30152OooO00o;
        this.f30154OooO0OO = o0oooo1.f30154OooO0OO;
        this.f30153OooO0O0 = o0oooo1.f30153OooO0O0;
        this.f30155OooO0Oo = o0oooo1.f30155OooO0Oo;
        this.f30157OooO0o0 = new androidx.work.OooO0O0(o0oooo1.f30157OooO0o0);
        this.f30156OooO0o = new androidx.work.OooO0O0(o0oooo1.f30156OooO0o);
        this.f30158OooO0oO = o0oooo1.f30158OooO0oO;
        this.f30159OooO0oo = o0oooo1.f30159OooO0oo;
        this.f30151OooO = o0oooo1.f30151OooO;
        this.f30160OooOO0 = new p102o000oo.OooOO0O(o0oooo1.f30160OooOO0);
        this.f30161OooOO0O = o0oooo1.f30161OooOO0O;
        this.f30162OooOO0o = o0oooo1.f30162OooOO0o;
        this.f30164OooOOO0 = o0oooo1.f30164OooOOO0;
        this.f30163OooOOO = o0oooo1.f30163OooOOO;
        this.f30165OooOOOO = o0oooo1.f30165OooOOOO;
        this.f30166OooOOOo = o0oooo1.f30166OooOOOo;
        this.f30168OooOOo0 = o0oooo1.f30168OooOOo0;
        this.f30167OooOOo = o0oooo1.f30167OooOOo;
    }
}
