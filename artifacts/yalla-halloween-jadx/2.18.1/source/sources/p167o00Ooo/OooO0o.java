package p167o00Ooo;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f32561OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f32562OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f32563OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f32564OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f32565OooO0o0;

    public static final class OooO00o {
    }

    static {
        long j = 3;
        long j2 = j << 32;
        f32562OooO0O0 = (((long) 0) & 4294967295L) | j2;
        f32563OooO0OO = (((long) 1) & 4294967295L) | j2;
        f32564OooO0Oo = j2 | (((long) 2) & 4294967295L);
        f32565OooO0o0 = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    @NotNull
    public static String OooO0O0(long j) {
        if (OooO00o(j, f32562OooO0O0)) {
            return "Rgb";
        }
        if (OooO00o(j, f32563OooO0OO)) {
            return "Xyz";
        }
        if (OooO00o(j, f32564OooO0Oo)) {
            return "Lab";
        }
        return OooO00o(j, f32565OooO0o0) ? "Cmyk" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
