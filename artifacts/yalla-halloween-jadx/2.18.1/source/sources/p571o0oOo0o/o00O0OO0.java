package p571o0oOo0o;

import Oooo0.o000oOoO;
import Oooo0.o00OOO0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o00O0O.OooOO0;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.Nullable;
import p031OoooO.OooOOO;
import p031OoooO.OooOOOO;
import p031OoooO.o0OO00O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000OO;
import p191o00o0O.o000000;
import p191o00o0O.o000OOo;
import p191o00o0O.o0OOO0o;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f45594OooO00o = 40;

    public static final class OooO00o extends Lambda implements Function1<o0Oo0oo, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f45595Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000000 f45596Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f45597Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, o000000 o000000Var, long j) {
            super(1);
            this.f45595Oooo0o = f;
            this.f45596Oooo0oO = o000000Var;
            this.f45597Oooo0oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0Oo0oo o0oo0oo2) {
            o0Oo0oo Canvas = o0oo0oo2;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float f = this.f45595Oooo0o * 360.0f;
            float f2 = 2;
            float f3 = this.f45596Oooo0oO.f33060OooO00o / f2;
            float fOooO0Oo = OooOo00.OooO0Oo(Canvas.OooO0OO()) / f2;
            Canvas.o00oO0O(o00000OO.OooO0OO(4282730057L), (124 & 2) != 0 ? OooOo00.OooO0OO(Canvas.OooO0OO()) / 2.0f : fOooO0Oo - f3, (124 & 4) != 0 ? Canvas.o00Oo0() : OooOO0.OooO00o(fOooO0Oo, fOooO0Oo), (124 & 8) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (124 & 16) != 0 ? o000OOo.f33065OooO00o : this.f45596Oooo0oO, null, (124 & 64) != 0 ? 3 : 0);
            long j = this.f45597Oooo0oo;
            o000000 o000000Var = this.f45596Oooo0oO;
            float f4 = o000000Var.f33060OooO00o / f2;
            float fOooO0Oo2 = OooOo00.OooO0Oo(Canvas.OooO0OO()) - (f2 * f4);
            o0OOO0o.OooO0O0(Canvas, j, 270.0f, f, false, OooOO0.OooO00o(f4, f4), OooOo.OooO00o(fOooO0Oo2, fOooO0Oo2), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o000000Var, null, 0, 832, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f45598Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f45599Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f45600Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f45601Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f45602OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f45603OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(float f, o00OOOO0 o00oooo1, long j, float f2, int i, int i2) {
            super(2);
            this.f45599Oooo0o = f;
            this.f45600Oooo0oO = o00oooo1;
            this.f45601Oooo0oo = j;
            this.f45598Oooo = f2;
            this.f45603OoooO00 = i;
            this.f45602OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O0OO0.OooO00o(this.f45599Oooo0o, this.f45600Oooo0oO, this.f45601Oooo0oo, this.f45598Oooo, ooo00o, this.f45603OoooO00 | 1, this.f45602OoooO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(float f, @Nullable o00OOOO0 o00oooo1, long j, float f2, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        long j2;
        float f3;
        o00OOOO0 o00oooo3;
        long jOooO0Oo;
        oo0ooO oo0oooOooOo;
        int i4;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1457233336);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.OooO0oO(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                o00oooo2 = o00oooo1;
                i3 |= ooo00oOooOOo.Oooo0oo(o00oooo2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                j2 = j;
                if ((i2 & 4) == 0 || !ooo00oOooOOo.OooOO0(j2)) {
                    i4 = 128;
                } else {
                    i4 = 256;
                }
                i3 |= i4;
            } else {
                j2 = j;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    f3 = f2;
                    int i6 = ooo00oOooOOo.OooO0oO(f3) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
                    i3 |= i6;
                } else {
                    f3 = f2;
                }
                i3 |= i6;
            } else {
                f3 = f2;
            }
            if ((i3 & 5851) == 1170 || !ooo00oOooOOo.OooOo0()) {
                ooo00oOooOOo.OooOOo0();
                if ((i & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                    if (i5 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if ((i2 & 4) != 0) {
                        jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                    } else {
                        jOooO0Oo = j2;
                    }
                    if ((i2 & 8) != 0) {
                        o0OO00O o0oo00o2 = o0OO00O.f2888OooO00o;
                        f3 = o0OO00O.f2889OooO0O0;
                    }
                } else {
                    ooo00oOooOOo.OooOoo0();
                    o00oooo3 = o00oooo2;
                    jOooO0Oo = j2;
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                float f4 = 1 - f;
                o000oOoO.OooO00o(SizeKt.OooOO0(o00OOO0.OooO00o(GraphicsLayerModifierKt.OooO0O0(o00oooo3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 180.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, 65407), f4), f45594OooO00o), new OooO00o(f4, new o000000(((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).OoooOoo(f3), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, 0, null, 26), jOooO0Oo), ooo00oOooOOo, 0);
            } else {
                ooo00oOooOOo.OooOoo0();
                o00oooo3 = o00oooo2;
                jOooO0Oo = j2;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(f, o00oooo3, jOooO0Oo, f3, i, i2));
        }
        i3 |= 48;
        o00oooo2 = o00oooo1;
        if ((i & 896) == 0) {
            j2 = j;
            if ((i2 & 4) == 0) {
                i4 = 128;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                f3 = f2;
                if (ooo00oOooOOo.OooO0oO(f3)) {
                }
                i3 |= i6;
            } else {
                f3 = f2;
            }
            i3 |= i6;
        } else {
            f3 = f2;
        }
        if ((i3 & 5851) == 1170) {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if ((i2 & 4) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j2;
                }
                if ((i2 & 8) != 0) {
                    o0OO00O o0oo00o3 = o0OO00O.f2888OooO00o;
                    f3 = o0OO00O.f2889OooO0O0;
                }
            } else {
                if (i5 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if ((i2 & 4) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j2;
                }
                if ((i2 & 8) != 0) {
                    o0OO00O o0oo00o4 = o0OO00O.f2888OooO00o;
                    f3 = o0OO00O.f2889OooO0O0;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
            float f5 = 1 - f;
            o000oOoO.OooO00o(SizeKt.OooOO0(o00OOO0.OooO00o(GraphicsLayerModifierKt.OooO0O0(o00oooo3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 180.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, 65407), f5), f45594OooO00o), new OooO00o(f5, new o000000(((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).OoooOoo(f3), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, 0, null, 26), jOooO0Oo), ooo00oOooOOo, 0);
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if ((i2 & 4) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j2;
                }
                if ((i2 & 8) != 0) {
                    o0OO00O o0oo00o5 = o0OO00O.f2888OooO00o;
                    f3 = o0OO00O.f2889OooO0O0;
                }
            } else {
                if (i5 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if ((i2 & 4) != 0) {
                    jOooO0Oo = ((OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo();
                } else {
                    jOooO0Oo = j2;
                }
                if ((i2 & 8) != 0) {
                    o0OO00O o0oo00o6 = o0OO00O.f2888OooO00o;
                    f3 = o0OO00O.f2889OooO0O0;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
            float f6 = 1 - f;
            o000oOoO.OooO00o(SizeKt.OooOO0(o00OOO0.OooO00o(GraphicsLayerModifierKt.OooO0O0(o00oooo3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 180.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, 65407), f6), f45594OooO00o), new OooO00o(f6, new o000000(((OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0)).OoooOoo(f3), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, 0, null, 26), jOooO0Oo), ooo00oOooOOo, 0);
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(f, o00oooo3, jOooO0Oo, f3, i, i2));
    }
}
