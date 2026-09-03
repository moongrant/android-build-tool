package o00O0OO;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.facebook.appevents.AppEventsConstants;
import kotlin.ULong;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "flex_duration")
    public final long f36215OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @PrimaryKey
    @JvmField
    @ColumnInfo(name = "id")
    @NotNull
    public final String f36216OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "state")
    @NotNull
    public WorkInfo$State f36217OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "worker_class_name")
    @NotNull
    public final String f36218OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "input_merger_class_name")
    @Nullable
    public String f36219OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "output")
    @NotNull
    public final androidx.work.OooO0O0 f36220OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "input")
    @NotNull
    public androidx.work.OooO0O0 f36221OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "initial_delay")
    public final long f36222OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "interval_duration")
    public final long f36223OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Embedded
    @JvmField
    @NotNull
    public p115o00O00oO.Oooo0 f36224OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "run_attempt_count")
    public final int f36225OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "backoff_policy")
    @NotNull
    public final BackoffPolicy f36226OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "last_enqueue_time")
    public long f36227OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "backoff_delay_duration")
    public final long f36228OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "minimum_retention_duration")
    public final long f36229OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "schedule_requested_at")
    public final long f36230OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "out_of_quota_policy")
    @NotNull
    public final OutOfQuotaPolicy f36231OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "run_in_foreground")
    public boolean f36232OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @ColumnInfo(defaultValue = AppEventsConstants.EVENT_PARAM_VALUE_NO, name = "period_count")
    public final int f36233OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @ColumnInfo(defaultValue = AppEventsConstants.EVENT_PARAM_VALUE_NO)
    public final int f36234OooOo00;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @ColumnInfo(name = "id")
        @NotNull
        public final String f36235OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @JvmField
        @ColumnInfo(name = "state")
        @NotNull
        public final WorkInfo$State f36236OooO0O0;

        public OooO00o(@NotNull WorkInfo$State state, @NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f36235OooO00o = id;
            this.f36236OooO0O0 = state;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f36235OooO00o, oooO00o.f36235OooO00o) && this.f36236OooO0O0 == oooO00o.f36236OooO0O0;
        }

        public final int hashCode() {
            return this.f36236OooO0O0.hashCode() + (this.f36235OooO00o.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "IdAndState(id=" + this.f36235OooO00o + ", state=" + this.f36236OooO0O0 + ')';
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue(p115o00O00oO.o0Oo0oo.OooO0o("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public o00Ooo(@NotNull String id, @NotNull WorkInfo$State state, @NotNull String workerClassName, @Nullable String str, @NotNull androidx.work.OooO0O0 input, @NotNull androidx.work.OooO0O0 output, long j, long j2, long j3, @NotNull p115o00O00oO.Oooo0 constraints, @IntRange(from = ULong.MIN_VALUE) int i, @NotNull BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f36216OooO00o = id;
        this.f36217OooO0O0 = state;
        this.f36218OooO0OO = workerClassName;
        this.f36219OooO0Oo = str;
        this.f36221OooO0o0 = input;
        this.f36220OooO0o = output;
        this.f36222OooO0oO = j;
        this.f36223OooO0oo = j2;
        this.f36215OooO = j3;
        this.f36224OooOO0 = constraints;
        this.f36225OooOO0O = i;
        this.f36226OooOO0o = backoffPolicy;
        this.f36228OooOOO0 = j4;
        this.f36227OooOOO = j5;
        this.f36229OooOOOO = j6;
        this.f36230OooOOOo = j7;
        this.f36232OooOOo0 = z;
        this.f36231OooOOo = outOfQuotaPolicy;
        this.f36233OooOOoo = i2;
        this.f36234OooOo00 = i3;
    }

    public final long OooO00o() {
        WorkInfo$State workInfo$State = this.f36217OooO0O0;
        WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
        int i = this.f36225OooOO0O;
        if (workInfo$State == workInfo$State2 && i > 0) {
            boolean z = this.f36226OooOO0o == BackoffPolicy.LINEAR;
            long j = this.f36228OooOOO0;
            return RangesKt.coerceAtMost(z ? j * ((long) i) : (long) Math.scalb(j, i - 1), 18000000L) + this.f36227OooOOO;
        }
        boolean zOooO0OO = OooO0OO();
        long j2 = this.f36222OooO0oO;
        long j3 = 0;
        if (!zOooO0OO) {
            long jCurrentTimeMillis = this.f36227OooOOO;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + j2;
        }
        long j4 = this.f36227OooOOO;
        int i2 = this.f36233OooOOoo;
        if (i2 == 0) {
            j4 += j2;
        }
        long j5 = this.f36215OooO;
        long j6 = this.f36223OooO0oo;
        if (j5 != j6) {
            j3 = i2 == 0 ? ((long) (-1)) * j5 : 0L;
            j4 += j6;
        } else if (i2 != 0) {
            j3 = j6;
        }
        return j4 + j3;
    }

    public final boolean OooO0O0() {
        return !Intrinsics.areEqual(p115o00O00oO.Oooo0.f36130OooO, this.f36224OooOO0);
    }

    public final boolean OooO0OO() {
        return this.f36223OooO0oo != 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return Intrinsics.areEqual(this.f36216OooO00o, o00ooo2.f36216OooO00o) && this.f36217OooO0O0 == o00ooo2.f36217OooO0O0 && Intrinsics.areEqual(this.f36218OooO0OO, o00ooo2.f36218OooO0OO) && Intrinsics.areEqual(this.f36219OooO0Oo, o00ooo2.f36219OooO0Oo) && Intrinsics.areEqual(this.f36221OooO0o0, o00ooo2.f36221OooO0o0) && Intrinsics.areEqual(this.f36220OooO0o, o00ooo2.f36220OooO0o) && this.f36222OooO0oO == o00ooo2.f36222OooO0oO && this.f36223OooO0oo == o00ooo2.f36223OooO0oo && this.f36215OooO == o00ooo2.f36215OooO && Intrinsics.areEqual(this.f36224OooOO0, o00ooo2.f36224OooOO0) && this.f36225OooOO0O == o00ooo2.f36225OooOO0O && this.f36226OooOO0o == o00ooo2.f36226OooOO0o && this.f36228OooOOO0 == o00ooo2.f36228OooOOO0 && this.f36227OooOOO == o00ooo2.f36227OooOOO && this.f36229OooOOOO == o00ooo2.f36229OooOOOO && this.f36230OooOOOo == o00ooo2.f36230OooOOOo && this.f36232OooOOo0 == o00ooo2.f36232OooOOo0 && this.f36231OooOOo == o00ooo2.f36231OooOOo && this.f36233OooOOoo == o00ooo2.f36233OooOOoo && this.f36234OooOo00 == o00ooo2.f36234OooOo00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v49 */
    public final int hashCode() {
        int iOooO00o = androidx.compose.animation.OooO0O0.OooO00o(this.f36218OooO0OO, (this.f36217OooO0O0.hashCode() + (this.f36216OooO00o.hashCode() * 31)) * 31, 31);
        String str = this.f36219OooO0Oo;
        int iHashCode = (this.f36220OooO0o.hashCode() + ((this.f36221OooO0o0.hashCode() + ((iOooO00o + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        long j = this.f36222OooO0oO;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f36223OooO0oo;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f36215OooO;
        int iHashCode2 = (this.f36226OooOO0o.hashCode() + ((((this.f36224OooOO0.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f36225OooOO0O) * 31)) * 31;
        long j4 = this.f36228OooOOO0;
        int i3 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f36227OooOOO;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f36229OooOOOO;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f36230OooOOOo;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        boolean z = this.f36232OooOOo0;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((this.f36231OooOOo.hashCode() + ((i6 + r1) * 31)) * 31) + this.f36233OooOOoo) * 31) + this.f36234OooOo00;
    }

    @NotNull
    public final String toString() {
        return androidx.compose.foundation.layout.oo000o.OooO0O0(new StringBuilder("{WorkSpec: "), this.f36216OooO00o, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o00Ooo(String str, WorkInfo$State workInfo$State, String str2, String str3, androidx.work.OooO0O0 oooO0O0, androidx.work.OooO0O0 oooO0O1, long j, long j2, long j3, p115o00O00oO.Oooo0 oooo0, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, int i4) {
        androidx.work.OooO0O0 oooO0O2;
        androidx.work.OooO0O0 oooO0O3;
        WorkInfo$State workInfo$State2 = (i3 & 2) != 0 ? WorkInfo$State.ENQUEUED : workInfo$State;
        String str4 = (i3 & 8) != 0 ? null : str3;
        if ((i3 & 16) != 0) {
            androidx.work.OooO0O0 EMPTY = androidx.work.OooO0O0.f11473OooO0OO;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            oooO0O2 = EMPTY;
        } else {
            oooO0O2 = oooO0O0;
        }
        if ((i3 & 32) != 0) {
            androidx.work.OooO0O0 EMPTY2 = androidx.work.OooO0O0.f11473OooO0OO;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            oooO0O3 = EMPTY2;
        } else {
            oooO0O3 = oooO0O1;
        }
        this(str, workInfo$State2, str2, str4, oooO0O2, oooO0O3, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? 0L : j2, (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0L : j3, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? p115o00O00oO.Oooo0.f36130OooO : oooo0, (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i, (i3 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i3 & 4096) != 0 ? 30000L : j4, (i3 & 8192) != 0 ? 0L : j5, (i3 & 16384) != 0 ? 0L : j6, (32768 & i3) != 0 ? -1L : j7, (65536 & i3) != 0 ? false : z, (131072 & i3) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (i3 & 262144) != 0 ? 0 : i2, 0);
    }
}
