package p145o00Oo0;

import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0000Ooo implements Comparable<o0000Ooo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f32077Oooo0o = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final float f32078Oooo0oO;

    public static final class OooO00o {
    }

    static {
        OooO00o(1.0f);
        OooO00o(-1.0f);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        f32078Oooo0oO = Float.intBitsToFloat(1056964608);
    }

    public static short OooO00o(float f) {
        int i;
        int i2;
        Objects.requireNonNull(f32077Oooo0o);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i3 = iFloatToRawIntBits >>> 31;
        int i4 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i5 = iFloatToRawIntBits & 8388607;
        int i6 = 0;
        if (i4 == 255) {
            i = i5 != 0 ? 512 : 0;
            i6 = 31;
        } else {
            int i7 = (i4 - 127) + 15;
            if (i7 >= 31) {
                i = 0;
                i6 = 49;
            } else {
                if (i7 > 0) {
                    int i8 = i5 >> 13;
                    if ((i5 & 4096) != 0) {
                        i = ((i7 << 10) | i8) + 1;
                        i2 = i3 << 15;
                    } else {
                        i = i8;
                        i6 = i7;
                    }
                    return (short) (i | i2);
                }
                if (i7 >= -10) {
                    int i9 = (i5 | 8388608) >> (1 - i7);
                    if ((i9 & 4096) != 0) {
                        i9 += 8192;
                    }
                    i = i9 >> 13;
                } else {
                    i = 0;
                }
            }
        }
        i2 = (i3 << 15) | (i6 << 10);
        return (short) (i | i2);
    }

    public static final float OooO0O0(short s) {
        int i;
        int i2 = s & UShort.MAX_VALUE;
        int i3 = 32768 & i2;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & 1023;
        int i6 = 0;
        if (i4 != 0) {
            int i7 = i5 << 13;
            if (i4 == 31) {
                if (i7 != 0) {
                    i7 |= 4194304;
                }
                i = i7;
                i6 = KotlinVersion.MAX_COMPONENT_VALUE;
            } else {
                i6 = (i4 - 15) + 127;
                i = i7;
            }
        } else {
            if (i5 != 0) {
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                float fIntBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - f32078Oooo0oO;
                return i3 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i = 0;
        }
        int i8 = i | (i3 << 16) | (i6 << 23);
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i8);
    }
}
