package p031OoooO;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f2872Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f2873Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f2874Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f2875Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f2876OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f2877OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOOO0 o00oooo1, long j, float f, float f2, int i, int i2) {
            super(2);
            this.f2873Oooo0o = o00oooo1;
            this.f2874Oooo0oO = j;
            this.f2875Oooo0oo = f;
            this.f2872Oooo = f2;
            this.f2877OoooO00 = i;
            this.f2876OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO00o(this.f2873Oooo0o, this.f2874Oooo0oO, this.f2875Oooo0oo, this.f2872Oooo, ooo00o, this.f2877OoooO00 | 1, this.f2876OoooO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:85:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x008c, please report this as an issue */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable o00OOOO0 o00oooo1, long j, float f, float f2, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        int i5;
        o00OOOO0 o00oooo2;
        long jOooO0OO;
        o00OOOO0 o00oooo0OooO;
        float density;
        float f5;
        float f6;
        oo0ooO oo0oooOooOo;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1249392198);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(o00oooo1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i7 = ooo00oOooOOo.OooOO0(j2) ? 32 : 16;
                i3 |= i7;
            } else {
                j2 = j;
            }
            i3 |= i7;
        } else {
            j2 = j;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 896) == 0) {
                f3 = f;
                i3 |= ooo00oOooOOo.OooO0oO(f3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    f4 = f2;
                    if (ooo00oOooOOo.OooO0oO(f4)) {
                        i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !ooo00oOooOOo.OooOo0()) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                        if (i6 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i2 & 2) != 0) {
                            jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                        } else {
                            jOooO0OO = j2;
                        }
                        if (i8 != 0) {
                            f3 = 1;
                        }
                        if (i4 != 0) {
                            f4 = 0;
                        }
                    } else {
                        ooo00oOooOOo.OooOoo0();
                        o00oooo2 = o00oooo1;
                        jOooO0OO = j2;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        o00oooo0OooO = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo0OooO = PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
                    }
                    ooo00oOooOOo.OooO0o0(1228914189);
                    if (OooOOO0.OooO00o(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                        density = 1.0f / ((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).getDensity();
                    } else {
                        density = f3;
                    }
                    ooo00oOooOOo.Oooo0o0();
                    p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(o00oooo2.OooOOoo(o00oooo0OooO)), density), jOooO0OO, o000O0Oo.f32099OooO00o), ooo00oOooOOo, 0);
                } else {
                    ooo00oOooOOo.OooOoo0();
                    o00oooo2 = o00oooo1;
                    jOooO0OO = j2;
                }
                f5 = f3;
                f6 = f4;
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO00o(o00oooo2, jOooO0OO, f5, f6, i, i2));
            }
            i3 |= 3072;
            f4 = f2;
            if ((i3 & 5851) == 1170) {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                    } else {
                        jOooO0OO = j2;
                    }
                    if (i8 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                } else {
                    if (i6 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                    } else {
                        jOooO0OO = j2;
                    }
                    if (i8 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    o00oooo0OooO = PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
                } else {
                    o00oooo0OooO = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                ooo00oOooOOo.OooO0o0(1228914189);
                if (OooOOO0.OooO00o(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    density = 1.0f / ((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).getDensity();
                } else {
                    density = f3;
                }
                ooo00oOooOOo.Oooo0o0();
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(o00oooo2.OooOOoo(o00oooo0OooO)), density), jOooO0OO, o000O0Oo.f32099OooO00o), ooo00oOooOOo, 0);
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                    } else {
                        jOooO0OO = j2;
                    }
                    if (i8 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                } else {
                    if (i6 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                    } else {
                        jOooO0OO = j2;
                    }
                    if (i8 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    o00oooo0OooO = PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
                } else {
                    o00oooo0OooO = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                ooo00oOooOOo.OooO0o0(1228914189);
                if (OooOOO0.OooO00o(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    density = 1.0f / ((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).getDensity();
                } else {
                    density = f3;
                }
                ooo00oOooOOo.Oooo0o0();
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(o00oooo2.OooOOoo(o00oooo0OooO)), density), jOooO0OO, o000O0Oo.f32099OooO00o), ooo00oOooOOo, 0);
            }
            f5 = f3;
            f6 = f4;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO00o(o00oooo2, jOooO0OO, f5, f6, i, i2));
        }
        i3 |= 384;
        f3 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                f4 = f2;
                if (ooo00oOooOOo.OooO0oO(f4)) {
                    i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                    } else {
                        jOooO0OO = j2;
                    }
                    if (i8 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                } else {
                    if (i6 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                    } else {
                        jOooO0OO = j2;
                    }
                    if (i8 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    o00oooo0OooO = PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
                } else {
                    o00oooo0OooO = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                ooo00oOooOOo.OooO0o0(1228914189);
                if (OooOOO0.OooO00o(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    density = 1.0f / ((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).getDensity();
                } else {
                    density = f3;
                }
                ooo00oOooOOo.Oooo0o0();
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(o00oooo2.OooOOoo(o00oooo0OooO)), density), jOooO0OO, o000O0Oo.f32099OooO00o), ooo00oOooOOo, 0);
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                    } else {
                        jOooO0OO = j2;
                    }
                    if (i8 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                } else {
                    if (i6 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i2 & 2) != 0) {
                        jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                    } else {
                        jOooO0OO = j2;
                    }
                    if (i8 != 0) {
                        f3 = 1;
                    }
                    if (i4 != 0) {
                        f4 = 0;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    o00oooo0OooO = PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
                } else {
                    o00oooo0OooO = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                ooo00oOooOOo.OooO0o0(1228914189);
                if (OooOOO0.OooO00o(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    density = 1.0f / ((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).getDensity();
                } else {
                    density = f3;
                }
                ooo00oOooOOo.Oooo0o0();
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(o00oooo2.OooOOoo(o00oooo0OooO)), density), jOooO0OO, o000O0Oo.f32099OooO00o), ooo00oOooOOo, 0);
            }
            f5 = f3;
            f6 = f4;
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO00o(o00oooo2, jOooO0OO, f5, f6, i, i2));
        }
        i3 |= 3072;
        f4 = f2;
        if ((i3 & 5851) == 1170) {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i2 & 2) != 0) {
                    jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                } else {
                    jOooO0OO = j2;
                }
                if (i8 != 0) {
                    f3 = 1;
                }
                if (i4 != 0) {
                    f4 = 0;
                }
            } else {
                if (i6 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i2 & 2) != 0) {
                    jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                } else {
                    jOooO0OO = j2;
                }
                if (i8 != 0) {
                    f3 = 1;
                }
                if (i4 != 0) {
                    f4 = 0;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                o00oooo0OooO = PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
            } else {
                o00oooo0OooO = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            ooo00oOooOOo.OooO0o0(1228914189);
            if (OooOOO0.OooO00o(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                density = 1.0f / ((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).getDensity();
            } else {
                density = f3;
            }
            ooo00oOooOOo.Oooo0o0();
            p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(o00oooo2.OooOOoo(o00oooo0OooO)), density), jOooO0OO, o000O0Oo.f32099OooO00o), ooo00oOooOOo, 0);
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i2 & 2) != 0) {
                    jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                } else {
                    jOooO0OO = j2;
                }
                if (i8 != 0) {
                    f3 = 1;
                }
                if (i4 != 0) {
                    f4 = 0;
                }
            } else {
                if (i6 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i2 & 2) != 0) {
                    jOooO0OO = o00000O0.OooO0OO(((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), 0.12f);
                } else {
                    jOooO0OO = j2;
                }
                if (i8 != 0) {
                    f3 = 1;
                }
                if (i4 != 0) {
                    f4 = 0;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                o00oooo0OooO = PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
            } else {
                o00oooo0OooO = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            ooo00oOooOOo.OooO0o0(1228914189);
            if (OooOOO0.OooO00o(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                density = 1.0f / ((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).getDensity();
            } else {
                density = f3;
            }
            ooo00oOooOOo.Oooo0o0();
            p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(o00oooo2.OooOOoo(o00oooo0OooO)), density), jOooO0OO, o000O0Oo.f32099OooO00o), ooo00oOooOOo, 0);
        }
        f5 = f3;
        f6 = f4;
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00oooo2, jOooO0OO, f5, f6, i, i2));
    }
}
