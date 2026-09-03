package p145o00Oo0;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import p036OoooOOO.o000000;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o00O00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f32112OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f32113OooO0OO = o000000.OooO00o(0.5f, 0.5f);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f32114OooO00o;

    public static final class OooO00o {
    }

    public static final float OooO00o(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float OooO0O0(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int OooO0OO(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String OooO0Oo(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00O00) && this.f32114OooO00o == ((o00O00) obj).f32114OooO00o;
    }

    public final int hashCode() {
        return OooO0OO(this.f32114OooO00o);
    }

    public final String toString() {
        return OooO0Oo(this.f32114OooO00o);
    }
}
