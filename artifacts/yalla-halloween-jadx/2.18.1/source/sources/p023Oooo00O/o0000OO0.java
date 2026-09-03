package p023Oooo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000OO0 implements o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f1053OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O000 f1054OooO0O0;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0000OO0() {
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this(f, f, 7);
    }

    public o0000OO0(float f, float f2, float f3) {
        this.f1053OooO00o = f3;
        o00O000 o00o001 = new o00O000();
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        o00o001.f1123OooO0oO = f;
        o00o001.f1119OooO0OO = false;
        double d = o00o001.f1118OooO0O0;
        if (((float) (d * d)) <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        o00o001.f1118OooO0O0 = Math.sqrt(f2);
        o00o001.f1119OooO0OO = false;
        this.f1054OooO0O0 = o00o001;
    }

    @Override // p023Oooo00O.o000OO
    public final float OooO0O0(long j, float f, float f2, float f3) {
        o00O000 o00o001 = this.f1054OooO0O0;
        o00o001.f1117OooO00o = f2;
        long jOooO00o = o00o001.OooO00o(f, f3, j / 1000000);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (jOooO00o & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0282  */
    /* JADX WARN: Code duplicated, block: B:13:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0078  */
    /* JADX WARN: Code duplicated, block: B:17:0x008d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x017e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01af  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01db  */
    /* JADX WARN: Code duplicated, block: B:68:0x0202 A[LOOP:1: B:66:0x01ff->B:68:0x0202, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0223  */
    /* JADX WARN: Code duplicated, block: B:77:0x0227  */
    /* JADX WARN: Code duplicated, block: B:78:0x0229  */
    /* JADX WARN: Code duplicated, block: B:83:0x0237  */
    /* JADX WARN: Code duplicated, block: B:87:0x023c  */
    @Override // p023Oooo00O.o000OO
    public final long OooO0OO(float f, float f2, float f3) {
        double dAbs;
        double dAbs2;
        double d;
        double d2;
        double dLog;
        double dLog2;
        double dLog3;
        int i;
        double d3;
        boolean z;
        boolean z2;
        double d4;
        double d5;
        double dLog4;
        o00 o00Var;
        o00O0000 o00o0001;
        int i2;
        long j;
        double dLog5;
        double dLog6;
        boolean z3;
        boolean z4;
        double dLog7;
        double d6;
        double d7;
        o0O0ooO o0o0ooo;
        o00oOoo o00oooo2;
        int i3;
        o00O000 o00o001 = this.f1054OooO0O0;
        double d8 = o00o001.f1118OooO0O0;
        float f4 = o00o001.f1123OooO0oO;
        float f5 = this.f1053OooO00o;
        double d9 = (float) (d8 * d8);
        double d10 = f4;
        double d11 = f3 / f5;
        double d12 = (f - f2) / f5;
        double d13 = 1.0f;
        double dSqrt = d10 * 2.0d * Math.sqrt(d9);
        double d14 = -dSqrt;
        double d15 = (dSqrt * dSqrt) - (d9 * 4.0d);
        o000000O o000000oOooO00o = o00000.OooO00o(d15);
        o000000oOooO00o.f1037OooO00o = (o000000oOooO00o.f1037OooO00o + d14) / 2.0d;
        o000000oOooO00o.f1038OooO0O0 /= 2.0d;
        o000000O o000000oOooO00o2 = o00000.OooO00o(d15);
        double d16 = -1;
        double d17 = o000000oOooO00o2.f1037OooO00o * d16;
        double d18 = o000000oOooO00o2.f1038OooO0O0 * d16;
        o000000oOooO00o2.f1037OooO00o = (d17 + d14) / 2.0d;
        o000000oOooO00o2.f1038OooO0O0 = d18 / 2.0d;
        Pair pair = TuplesKt.to(o000000oOooO00o, o000000oOooO00o2);
        if (!(d12 == 0.0d)) {
            if (d12 < 0.0d) {
                d11 = -d11;
            }
            dAbs = Math.abs(d12);
            dAbs2 = Double.MAX_VALUE;
            if (d10 > 1.0d) {
                double d19 = ((o000000O) pair.getFirst()).f1037OooO00o;
                double d20 = ((o000000O) pair.getSecond()).f1037OooO00o;
                double d21 = (d19 * dAbs) - d11;
                double d22 = d19 - d20;
                double d23 = d21 / d22;
                double d24 = dAbs - d23;
                dLog5 = Math.log(Math.abs(d13 / d24)) / d19;
                dLog6 = Math.log(Math.abs(d13 / d23)) / d20;
                if (Double.isInfinite(dLog5) || Double.isNaN(dLog5)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    dLog5 = dLog6;
                } else {
                    if (Double.isInfinite(dLog6) || Double.isNaN(dLog6)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!(!z4)) {
                        dLog5 = Math.max(dLog5, dLog6);
                    }
                }
                double d25 = d24 * d19;
                dLog7 = Math.log(d25 / ((-d23) * d20)) / (d20 - d19);
                if (Double.isNaN(dLog7) || dLog7 <= 0.0d) {
                    d6 = dLog5;
                    d7 = -d13;
                    dLog4 = d6;
                } else {
                    if (dLog7 > 0.0d) {
                        if ((-((Math.exp(dLog7 * d20) * d23) + (Math.exp(d19 * dLog7) * d24))) < d13) {
                            if (d23 <= 0.0d || d24 >= 0.0d) {
                                d6 = dLog5;
                            } else {
                                d6 = 0.0d;
                            }
                            d7 = -d13;
                            dLog4 = d6;
                        }
                    }
                    dLog4 = Math.log((-((d23 * d20) * d20)) / (d25 * d19)) / d22;
                    d7 = d13;
                }
                o0o0ooo = new o0O0ooO(d24, d19, d23, d20, d7);
                o00oooo2 = new o00oOoo(d24, d19, d23, d20);
                if (Math.abs(((Number) o0o0ooo.invoke(Double.valueOf(dLog4))).doubleValue()) >= 1.0E-4d) {
                    i3 = 0;
                    while (dAbs2 > 0.001d && i3 < 100) {
                        i3++;
                        double dDoubleValue = dLog4 - (((Number) o0o0ooo.invoke(Double.valueOf(dLog4))).doubleValue() / ((Number) o00oooo2.invoke(Double.valueOf(dLog4))).doubleValue());
                        dAbs2 = Math.abs(dLog4 - dDoubleValue);
                        dLog4 = dDoubleValue;
                    }
                }
            } else if (d10 < 1.0d) {
                d = d13;
                double d26 = ((o000000O) pair.getFirst()).f1037OooO00o;
                double d27 = (d11 - (d26 * dAbs)) / ((o000000O) pair.getFirst()).f1038OooO0O0;
                dLog4 = Math.log(d / Math.sqrt((d27 * d27) + (dAbs * dAbs))) / d26;
            } else {
                d = d13;
                d2 = ((o000000O) pair.getFirst()).f1037OooO00o;
                double d28 = d2 * dAbs;
                double d29 = d11 - d28;
                dLog = Math.log(Math.abs(d / dAbs)) / d2;
                dLog2 = Math.log(Math.abs(d / d29));
                dLog3 = dLog2;
                while (i < 6) {
                    dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d2));
                }
                d3 = dLog3 / d2;
                if (Double.isInfinite(dLog) || Double.isNaN(dLog)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    dLog = d3;
                } else {
                    if (Double.isInfinite(d3) || Double.isNaN(d3)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!(!z2)) {
                        dLog = Math.max(dLog, d3);
                    }
                }
                d4 = (-(d28 + d29)) / (d2 * d29);
                if (Double.isNaN(d4) || d4 <= 0.0d) {
                    d5 = dLog;
                    d = -d;
                    dLog4 = d5;
                } else {
                    if (d4 > 0.0d) {
                        double d30 = d2 * d4;
                        if ((-((Math.exp(d30) * d4 * d29) + (Math.exp(d30) * dAbs))) < d) {
                            if (d29 >= 0.0d || dAbs <= 0.0d) {
                                d5 = dLog;
                            } else {
                                d5 = 0.0d;
                            }
                            d = -d;
                            dLog4 = d5;
                        }
                    }
                    dLog4 = (-(2.0d / d2)) - (dAbs / d29);
                }
                o00Var = new o00(dAbs, d29, d2, d);
                o00o0001 = new o00O0000(d29, d2, dAbs);
                i2 = 0;
                while (dAbs2 > 0.001d && i2 < 100) {
                    i2++;
                    double dDoubleValue2 = dLog4 - (((Number) o00Var.invoke(Double.valueOf(dLog4))).doubleValue() / ((Number) o00o0001.invoke(Double.valueOf(dLog4))).doubleValue());
                    dAbs2 = Math.abs(dLog4 - dDoubleValue2);
                    dLog4 = dDoubleValue2;
                }
            }
            j = (long) (dLog4 * 1000.0d);
        } else if (d11 == 0.0d) {
            j = 0;
        } else {
            if (d12 < 0.0d) {
                d11 = -d11;
            }
            dAbs = Math.abs(d12);
            dAbs2 = Double.MAX_VALUE;
            if (d10 > 1.0d) {
                double d110 = ((o000000O) pair.getFirst()).f1037OooO00o;
                double d210 = ((o000000O) pair.getSecond()).f1037OooO00o;
                double d211 = (d110 * dAbs) - d11;
                double d212 = d110 - d210;
                double d213 = d211 / d212;
                double d214 = dAbs - d213;
                dLog5 = Math.log(Math.abs(d13 / d214)) / d110;
                dLog6 = Math.log(Math.abs(d13 / d213)) / d210;
                if (Double.isInfinite(dLog5)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    dLog5 = dLog6;
                } else {
                    if (Double.isInfinite(dLog6)) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (!(!z4)) {
                        dLog5 = Math.max(dLog5, dLog6);
                    }
                }
                double d215 = d214 * d110;
                dLog7 = Math.log(d215 / ((-d213) * d210)) / (d210 - d110);
                if (Double.isNaN(dLog7)) {
                    d6 = dLog5;
                    d7 = -d13;
                    dLog4 = d6;
                } else {
                    d6 = dLog5;
                    d7 = -d13;
                    dLog4 = d6;
                }
                o0o0ooo = new o0O0ooO(d214, d110, d213, d210, d7);
                o00oooo2 = new o00oOoo(d214, d110, d213, d210);
                if (Math.abs(((Number) o0o0ooo.invoke(Double.valueOf(dLog4))).doubleValue()) >= 1.0E-4d) {
                    i3 = 0;
                    while (dAbs2 > 0.001d) {
                        i3++;
                        double dDoubleValue3 = dLog4 - (((Number) o0o0ooo.invoke(Double.valueOf(dLog4))).doubleValue() / ((Number) o00oooo2.invoke(Double.valueOf(dLog4))).doubleValue());
                        dAbs2 = Math.abs(dLog4 - dDoubleValue3);
                        dLog4 = dDoubleValue3;
                    }
                }
            } else if (d10 < 1.0d) {
                d = d13;
                double d216 = ((o000000O) pair.getFirst()).f1037OooO00o;
                double d217 = (d11 - (d216 * dAbs)) / ((o000000O) pair.getFirst()).f1038OooO0O0;
                dLog4 = Math.log(d / Math.sqrt((d217 * d217) + (dAbs * dAbs))) / d216;
            } else {
                d = d13;
                d2 = ((o000000O) pair.getFirst()).f1037OooO00o;
                double d218 = d2 * dAbs;
                double d219 = d11 - d218;
                dLog = Math.log(Math.abs(d / dAbs)) / d2;
                dLog2 = Math.log(Math.abs(d / d219));
                dLog3 = dLog2;
                for (i = 0; i < 6; i++) {
                    dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d2));
                }
                d3 = dLog3 / d2;
                if (Double.isInfinite(dLog)) {
                    z = false;
                } else {
                    z = false;
                }
                if (!z) {
                    dLog = d3;
                } else {
                    if (Double.isInfinite(d3)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!(!z2)) {
                        dLog = Math.max(dLog, d3);
                    }
                }
                d4 = (-(d218 + d219)) / (d2 * d219);
                if (Double.isNaN(d4)) {
                    d5 = dLog;
                    d = -d;
                    dLog4 = d5;
                } else {
                    d5 = dLog;
                    d = -d;
                    dLog4 = d5;
                }
                o00Var = new o00(dAbs, d219, d2, d);
                o00o0001 = new o00O0000(d219, d2, dAbs);
                i2 = 0;
                while (dAbs2 > 0.001d) {
                    i2++;
                    double dDoubleValue4 = dLog4 - (((Number) o00Var.invoke(Double.valueOf(dLog4))).doubleValue() / ((Number) o00o0001.invoke(Double.valueOf(dLog4))).doubleValue());
                    dAbs2 = Math.abs(dLog4 - dDoubleValue4);
                    dLog4 = dDoubleValue4;
                }
            }
            j = (long) (dLog4 * 1000.0d);
        }
        return j * 1000000;
    }

    @Override // p023Oooo00O.o000OO
    public final float OooO0Oo(float f, float f2, float f3) {
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // p023Oooo00O.oo000o
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final o0oOO OooO00o(o00OO0O0 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new o0oOO(this);
    }

    @Override // p023Oooo00O.o000OO
    public final float OooO0o0(long j, float f, float f2, float f3) {
        o00O000 o00o001 = this.f1054OooO0O0;
        o00o001.f1117OooO00o = f2;
        long jOooO00o = o00o001.OooO00o(f, f3, j / 1000000);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (jOooO00o >> 32));
    }

    public /* synthetic */ o0000OO0(float f, float f2, int i) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }
}
