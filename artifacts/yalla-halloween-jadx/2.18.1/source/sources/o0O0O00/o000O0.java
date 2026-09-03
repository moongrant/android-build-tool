package o0O0O00;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f35262OooO00o = o000O0Oo.OooO00o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f35263OooO0O0 = 0;

    public static final float OooO00o(long j) {
        if (!(j != f35262OooO00o)) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float OooO0O0(long j) {
        if (!(j != f35262OooO00o)) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
