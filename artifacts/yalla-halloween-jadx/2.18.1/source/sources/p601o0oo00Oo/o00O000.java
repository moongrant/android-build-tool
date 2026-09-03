package p601o0oo00Oo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.sqlcipher.database.SQLiteDatabase;
import o00000O.o0OOO0o;
import o00000O.oo0o0Oo;
import o0000O0.OooO;
import o0000O0.OooO0o;
import o0000O0O.o00O0O;
import o0000O0O.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o000O0O0;
import p048OoooooO.o00OOOO0;
import p053o00000oO.o0000O00;
import p053o00000oO.o0000Ooo;
import p053o00000oO.o000OOo;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p191o00o0O.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000 {

    public static final class OooO00o extends Lambda implements Function1<o00oO0o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f48089Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<Boolean> o0o00oo2) {
            super(1);
            this.f48089Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00oO0o o00oo0o2) {
            o00oO0o drawWithContent = o00oo0o2;
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            if (this.f48089Oooo0o.getValue().booleanValue()) {
                drawWithContent.o0ooOOo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0OOO0o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00O f48090Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f48091Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Float> f48092Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O00O o00o00o2, o0O00OO<Boolean> o0o00oo2, o0O00OO<Float> o0o00oo3) {
            super(1);
            this.f48090Oooo0o = o00o00o2;
            this.f48091Oooo0oO = o0o00oo2;
            this.f48092Oooo0oo = o0o00oo3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OOO0o o0ooo0o2) {
            o0OOO0o it = o0ooo0o2;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.OooO0Oo() || this.f48091Oooo0oO.getValue().booleanValue()) {
                this.f48091Oooo0oO.setValue(Boolean.TRUE);
            } else {
                float fFloatValue = this.f48092Oooo0oo.getValue().floatValue() - o00O0O.OooO0OO(this.f48090Oooo0o.f48117OooO0OO);
                if (fFloatValue <= o00O0O.OooO0OO(this.f48090Oooo0o.f48115OooO00o)) {
                    this.f48092Oooo0oo.setValue(Float.valueOf(o00O0O.OooO0OO(this.f48090Oooo0o.f48115OooO00o)));
                    this.f48091Oooo0oO.setValue(Boolean.TRUE);
                } else {
                    this.f48092Oooo0oo.setValue(Float.valueOf(fFloatValue));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f48093Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f48094Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00O f48095Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f48096Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ long f48097OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0000O00 f48098OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0000Ooo f48099OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o000OOo f48100OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ OooO f48101OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ long f48102OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ int f48103OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ boolean f48104OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ int f48105OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f48106OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public final /* synthetic */ int f48107Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public final /* synthetic */ int f48108Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public final /* synthetic */ int f48109OooooO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ OooO0o f48110o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, o00O00O o00o00o2, o00OOOO0 o00oooo1, long j, o0000Ooo o0000ooo, o0000O00 o0000o00, o000OOo o000ooo2, long j2, OooO oooO, OooO0o oooO0o, long j3, int i, boolean z, int i2, oo0o0Oo oo0o0oo, int i3, int i4, int i5) {
            super(2);
            this.f48094Oooo0o = str;
            this.f48095Oooo0oO = o00o00o2;
            this.f48096Oooo0oo = o00oooo1;
            this.f48093Oooo = j;
            this.f48099OoooO00 = o0000ooo;
            this.f48098OoooO0 = o0000o00;
            this.f48100OoooO0O = o000ooo2;
            this.f48097OoooO = j2;
            this.f48101OoooOO0 = oooO;
            this.f48110o000oOoO = oooO0o;
            this.f48102OoooOOO = j3;
            this.f48103OoooOOo = i;
            this.f48104OoooOo0 = z;
            this.f48105OoooOoO = i2;
            this.f48106OoooOoo = oo0o0oo;
            this.f48107Ooooo00 = i3;
            this.f48108Ooooo0o = i4;
            this.f48109OooooO0 = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O000.OooO00o(this.f48094Oooo0o, this.f48095Oooo0oO, this.f48096Oooo0oo, this.f48093Oooo, this.f48099OoooO00, this.f48098OoooO0, this.f48100OoooO0O, this.f48097OoooO, this.f48101OoooOO0, this.f48110o000oOoO, this.f48102OoooOOO, this.f48103OoooOOo, this.f48104OoooOo0, this.f48105OoooOoO, this.f48106OoooOoo, ooo00o, this.f48107Ooooo00 | 1, this.f48108Ooooo0o, this.f48109OooooO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0143  */
    /* JADX WARN: Code duplicated, block: B:102:0x0146  */
    /* JADX WARN: Code duplicated, block: B:106:0x014d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0154  */
    /* JADX WARN: Code duplicated, block: B:109:0x0158  */
    /* JADX WARN: Code duplicated, block: B:111:0x0162  */
    /* JADX WARN: Code duplicated, block: B:112:0x0165  */
    /* JADX WARN: Code duplicated, block: B:114:0x016a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0174  */
    /* JADX WARN: Code duplicated, block: B:119:0x0179  */
    /* JADX WARN: Code duplicated, block: B:121:0x017d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x0197  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:155:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x01df  */
    /* JADX WARN: Code duplicated, block: B:160:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:166:0x021b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0223  */
    /* JADX WARN: Code duplicated, block: B:175:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0253  */
    /* JADX WARN: Code duplicated, block: B:177:0x0256  */
    /* JADX WARN: Code duplicated, block: B:179:0x025a  */
    /* JADX WARN: Code duplicated, block: B:180:0x025f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0263  */
    /* JADX WARN: Code duplicated, block: B:183:0x0265  */
    /* JADX WARN: Code duplicated, block: B:185:0x0269  */
    /* JADX WARN: Code duplicated, block: B:186:0x026b  */
    /* JADX WARN: Code duplicated, block: B:188:0x026f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0272  */
    /* JADX WARN: Code duplicated, block: B:191:0x0276  */
    /* JADX WARN: Code duplicated, block: B:192:0x027b  */
    /* JADX WARN: Code duplicated, block: B:194:0x027f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0281  */
    /* JADX WARN: Code duplicated, block: B:198:0x0286  */
    /* JADX WARN: Code duplicated, block: B:200:0x028a  */
    /* JADX WARN: Code duplicated, block: B:201:0x028f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0294  */
    /* JADX WARN: Code duplicated, block: B:205:0x0296  */
    /* JADX WARN: Code duplicated, block: B:208:0x029b  */
    /* JADX WARN: Code duplicated, block: B:210:0x029f  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:215:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:219:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:222:0x0316 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x0318  */
    /* JADX WARN: Code duplicated, block: B:226:0x0344 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x0346  */
    /* JADX WARN: Code duplicated, block: B:230:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x0375  */
    /* JADX WARN: Code duplicated, block: B:236:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:96:0x012e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    /* JADX WARN: Instruction removed from duplicated block: B:166:0x021b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull String text, @NotNull o00O00O fontSizeRange, @Nullable o00OOOO0 o00oooo1, long j, @Nullable o0000Ooo o0000ooo, @Nullable o0000O00 o0000o00, @Nullable o000OOo o000ooo2, long j2, @Nullable OooO oooO, @Nullable OooO0o oooO0o, long j3, int i, boolean z, int i2, @Nullable oo0o0Oo oo0o0oo, @Nullable oOO00O ooo00o, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        o00OOOO0 o00oooo2;
        long j4;
        o0000Ooo o0000ooo2;
        o0000O00 o0000o01;
        o000OOo o000ooo3;
        long j5;
        OooO oooO2;
        long j6;
        int i31;
        boolean z2;
        int i32;
        oo0o0Oo oo0o0oo2;
        o0000O00 o0000o02;
        OooO0o oooO0o2;
        long j7;
        o000OOo o000ooo4;
        long j8;
        long j9;
        o00OOOO0 o00oooo3;
        o0000Ooo o0000ooo3;
        Object objOooO0o;
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o;
        o0O00OO o0o00oo2;
        boolean zOooo0oo;
        Object objOooO0o2;
        o0O00OO o0o00oo3;
        boolean zOooo0oo2;
        Object objOooO0o3;
        boolean zOooo0oo3;
        Object objOooO0o4;
        o0000Ooo o0000ooo4;
        o0000O00 o0000o03;
        o000OOo o000ooo5;
        oOO00O ooo00o2;
        long j10;
        OooO oooO3;
        OooO0o oooO0o3;
        long j11;
        int i33;
        boolean z3;
        int i34;
        long j12;
        o00OOOO0 o00oooo4;
        oo0o0Oo oo0o0oo3;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontSizeRange, "fontSizeRange");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1603295712);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (ooo00oOooOOo.Oooo0oo(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= ooo00oOooOOo.Oooo0oo(fontSizeRange) ? 32 : 16;
        }
        int i35 = i5 & 4;
        if (i35 == 0) {
            if ((i3 & 896) == 0) {
                i6 |= ooo00oOooOOo.Oooo0oo(o00oooo1) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                if (ooo00oOooOOo.OooOO0(j)) {
                    i8 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            i9 = i5 & 16;
            i10 = 8192;
            if (i9 != 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                if (ooo00oOooOOo.Oooo0oo(o0000ooo)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i6 |= i11;
            }
            i12 = i5 & 32;
            if (i12 != 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (ooo00oOooOOo.Oooo0oo(o0000o00)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i6 |= i13;
            }
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (ooo00oOooOOo.Oooo0oo(o000ooo2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (ooo00oOooOOo.OooOO0(j2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i6 |= i17;
            }
            i18 = i5 & 256;
            if (i18 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (ooo00oOooOOo.Oooo0oo(oooO)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i6 |= i19;
            }
            i20 = i5 & 512;
            if (i20 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (ooo00oOooOOo.Oooo0oo(oooO0o)) {
                    i21 = 536870912;
                } else {
                    i21 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i6 |= i21;
            }
            i22 = i5 & 1024;
            if (i22 != 0) {
                i23 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (ooo00oOooOOo.OooOO0(j3)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i4 | i24;
            } else {
                i23 = i4;
            }
            i25 = i5 & RecyclerView.oo0o0Oo.FLAG_MOVED;
            if (i25 != 0) {
                i23 |= 48;
            } else if ((i4 & 112) != 0) {
                if (ooo00oOooOOo.OooO(i)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i23 |= i26;
            }
            i27 = i23;
            i28 = i5 & 4096;
            if (i28 != 0) {
                if ((i4 & 896) == 0) {
                    if (ooo00oOooOOo.OooO0OO(z)) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                    i27 |= i29;
                }
                i30 = i5 & 8192;
                if (i30 != 0) {
                    if ((i4 & 7168) == 0) {
                        i27 |= ooo00oOooOOo.OooO(i2) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0 && ooo00oOooOOo.Oooo0oo(oo0o0oo)) {
                            i10 = 16384;
                        }
                        i27 |= i10;
                    }
                    if ((i6 & 1533916891) != 306783378 && (46811 & i27) == 9362 && ooo00oOooOOo.OooOo0()) {
                        ooo00oOooOOo.OooOoo0();
                        o00oooo4 = o00oooo1;
                        j12 = j;
                        o0000ooo4 = o0000ooo;
                        o0000o03 = o0000o00;
                        o000ooo5 = o000ooo2;
                        oooO3 = oooO;
                        oooO0o3 = oooO0o;
                        j11 = j3;
                        i33 = i;
                        z3 = z;
                        i34 = i2;
                        oo0o0oo3 = oo0o0oo;
                        ooo00o2 = ooo00oOooOOo;
                        j10 = j2;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                            if (i35 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if (i7 != 0) {
                                o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
                                j4 = o00000O0.f32062OooO;
                            } else {
                                j4 = j;
                            }
                            if (i9 != 0) {
                                o0000ooo2 = null;
                            } else {
                                o0000ooo2 = o0000ooo;
                            }
                            if (i12 != 0) {
                                o0000o01 = null;
                            } else {
                                o0000o01 = o0000o00;
                            }
                            if (i14 != 0) {
                                o000ooo3 = null;
                            } else {
                                o000ooo3 = o000ooo2;
                            }
                            if (i16 != 0) {
                                o00O0O.OooO00o oooO00o2 = o00O0O.f27323OooO0O0;
                                j5 = o00O0O.f27325OooO0Oo;
                            } else {
                                j5 = j2;
                            }
                            if (i18 != 0) {
                                oooO2 = null;
                            } else {
                                oooO2 = oooO;
                            }
                            OooO0o oooO0o4 = i20 == 0 ? oooO0o : null;
                            if (i22 != 0) {
                                o00O0O.OooO00o oooO00o3 = o00O0O.f27323OooO0O0;
                                j6 = o00O0O.f27325OooO0Oo;
                            } else {
                                j6 = j3;
                            }
                            if (i25 != 0) {
                                i31 = 1;
                            } else {
                                i31 = i;
                            }
                            z2 = i28 == 0 ? z : true;
                            if (i30 != 0) {
                                i32 = Integer.MAX_VALUE;
                            } else {
                                i32 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                i27 &= -57345;
                                oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                            } else {
                                oo0o0oo2 = oo0o0oo;
                            }
                            o0000o02 = o0000o01;
                            oooO0o2 = oooO0o4;
                            j7 = j4;
                            o000ooo4 = o000ooo3;
                            j8 = j5;
                            j9 = j6;
                            o00oooo3 = o00oooo2;
                            o0000ooo3 = o0000ooo2;
                        } else {
                            ooo00oOooOOo.OooOoo0();
                            if ((i5 & 16384) != 0) {
                                i27 &= -57345;
                            }
                            o00oooo3 = o00oooo1;
                            j7 = j;
                            o0000ooo3 = o0000ooo;
                            o0000o02 = o0000o00;
                            o000ooo4 = o000ooo2;
                            j8 = j2;
                            oooO2 = oooO;
                            oooO0o2 = oooO0o;
                            j9 = j3;
                            i31 = i;
                            z2 = z;
                            i32 = i2;
                            oo0o0oo2 = oo0o0oo;
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                        ooo00oOooOOo.OooO0o0(-492369756);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        int i36 = i6 & 14;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                            objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o0o00oo3 = (o0O00OO) objOooO0o2;
                        long jOooO0O0 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                        objOooO0o3 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2 || objOooO0o3 == c0323OooO00o) {
                            objOooO0o3 = new OooO00o(o0o00oo3);
                            ooo00oOooOOo.Oooo00o(objOooO0o3);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0OO = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                        objOooO0o4 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo3 || objOooO0o4 == c0323OooO00o) {
                            objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                            ooo00oOooOOo.Oooo00o(objOooO0o4);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o0000ooo4 = o0000ooo3;
                        o0000o03 = o0000o02;
                        o000ooo5 = o000ooo4;
                        ooo00o2 = ooo00oOooOOo;
                        j10 = j8;
                        oooO3 = oooO2;
                        oooO0o3 = oooO0o2;
                        j11 = j9;
                        o00OOOO0 o00oooo5 = o00oooo3;
                        i33 = i31;
                        z3 = z2;
                        i34 = i32;
                        o000O0O0.OooO0OO(text, o00oooo0OooO0OO, j7, jOooO0O0, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i36 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                        j12 = j7;
                        o00oooo4 = o00oooo5;
                        oo0o0oo3 = oo0o0oo2;
                    }
                    oo0oooOooOo = ooo00o2.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(text, fontSizeRange, o00oooo4, j12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, oo0o0oo3, i3, i4, i5));
                }
                i27 |= 3072;
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i27 |= i10;
                }
                if ((i6 & 1533916891) != 306783378) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o4 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o5 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o6 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    } else {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o7 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o8 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o9 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    int i37 = i6 & 14;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo3 = (o0O00OO) objOooO0o2;
                    long jOooO0O1 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                    objOooO0o3 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0OO2 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                    objOooO0o4 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0000ooo4 = o0000ooo3;
                    o0000o03 = o0000o02;
                    o000ooo5 = o000ooo4;
                    ooo00o2 = ooo00oOooOOo;
                    j10 = j8;
                    oooO3 = oooO2;
                    oooO0o3 = oooO0o2;
                    j11 = j9;
                    o00OOOO0 o00oooo6 = o00oooo3;
                    i33 = i31;
                    z3 = z2;
                    i34 = i32;
                    o000O0O0.OooO0OO(text, o00oooo0OooO0OO2, j7, jOooO0O1, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i37 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                    j12 = j7;
                    o00oooo4 = o00oooo6;
                    oo0o0oo3 = oo0o0oo2;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o10 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o11 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o12 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    } else {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o13 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o14 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o15 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    int i38 = i6 & 14;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo3 = (o0O00OO) objOooO0o2;
                    long jOooO0O2 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                    objOooO0o3 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0OO3 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                    objOooO0o4 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0000ooo4 = o0000ooo3;
                    o0000o03 = o0000o02;
                    o000ooo5 = o000ooo4;
                    ooo00o2 = ooo00oOooOOo;
                    j10 = j8;
                    oooO3 = oooO2;
                    oooO0o3 = oooO0o2;
                    j11 = j9;
                    o00OOOO0 o00oooo7 = o00oooo3;
                    i33 = i31;
                    z3 = z2;
                    i34 = i32;
                    o000O0O0.OooO0OO(text, o00oooo0OooO0OO3, j7, jOooO0O2, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i38 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                    j12 = j7;
                    o00oooo4 = o00oooo7;
                    oo0o0oo3 = oo0o0oo2;
                }
                oo0oooOooOo = ooo00o2.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(text, fontSizeRange, o00oooo4, j12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, oo0o0oo3, i3, i4, i5));
            }
            i27 |= 384;
            i30 = i5 & 8192;
            if (i30 != 0) {
                if ((i4 & 7168) == 0) {
                    i27 |= ooo00oOooOOo.OooO(i2) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i27 |= i10;
                }
                if ((i6 & 1533916891) != 306783378) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o16 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o17 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o18 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    } else {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o19 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o110 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o111 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function6 = oo0o0O0.f29705OooO00o;
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    int i39 = i6 & 14;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo3 = (o0O00OO) objOooO0o2;
                    long jOooO0O3 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                    objOooO0o3 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0OO4 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                    objOooO0o4 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0000ooo4 = o0000ooo3;
                    o0000o03 = o0000o02;
                    o000ooo5 = o000ooo4;
                    ooo00o2 = ooo00oOooOOo;
                    j10 = j8;
                    oooO3 = oooO2;
                    oooO0o3 = oooO0o2;
                    j11 = j9;
                    o00OOOO0 o00oooo8 = o00oooo3;
                    i33 = i31;
                    z3 = z2;
                    i34 = i32;
                    o000O0O0.OooO0OO(text, o00oooo0OooO0OO4, j7, jOooO0O3, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i39 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                    j12 = j7;
                    o00oooo4 = o00oooo8;
                    oo0o0oo3 = oo0o0oo2;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o112 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o113 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o114 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    } else {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o115 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o116 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o117 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function7 = oo0o0O0.f29705OooO00o;
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    int i310 = i6 & 14;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo3 = (o0O00OO) objOooO0o2;
                    long jOooO0O4 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                    objOooO0o3 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0OO5 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                    objOooO0o4 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0000ooo4 = o0000ooo3;
                    o0000o03 = o0000o02;
                    o000ooo5 = o000ooo4;
                    ooo00o2 = ooo00oOooOOo;
                    j10 = j8;
                    oooO3 = oooO2;
                    oooO0o3 = oooO0o2;
                    j11 = j9;
                    o00OOOO0 o00oooo9 = o00oooo3;
                    i33 = i31;
                    z3 = z2;
                    i34 = i32;
                    o000O0O0.OooO0OO(text, o00oooo0OooO0OO5, j7, jOooO0O4, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i310 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                    j12 = j7;
                    o00oooo4 = o00oooo9;
                    oo0o0oo3 = oo0o0oo2;
                }
                oo0oooOooOo = ooo00o2.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(text, fontSizeRange, o00oooo4, j12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, oo0o0oo3, i3, i4, i5));
            }
            i27 |= 3072;
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i10 = 16384;
                }
                i27 |= i10;
            }
            if ((i6 & 1533916891) != 306783378) {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o118 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o119 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o1110 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                } else {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o1111 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o1112 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o1113 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function8 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                int i311 = i6 & 14;
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo3 = (o0O00OO) objOooO0o2;
                long jOooO0O5 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                o00OOOO0 o00oooo0OooO0OO6 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                objOooO0o4 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo3) {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                } else {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000ooo4 = o0000ooo3;
                o0000o03 = o0000o02;
                o000ooo5 = o000ooo4;
                ooo00o2 = ooo00oOooOOo;
                j10 = j8;
                oooO3 = oooO2;
                oooO0o3 = oooO0o2;
                j11 = j9;
                o00OOOO0 o00oooo10 = o00oooo3;
                i33 = i31;
                z3 = z2;
                i34 = i32;
                o000O0O0.OooO0OO(text, o00oooo0OooO0OO6, j7, jOooO0O5, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i311 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                j12 = j7;
                o00oooo4 = o00oooo10;
                oo0o0oo3 = oo0o0oo2;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o1114 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o1115 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o1116 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                } else {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o1117 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o1118 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o1119 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function9 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                int i312 = i6 & 14;
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo3 = (o0O00OO) objOooO0o2;
                long jOooO0O6 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                o00OOOO0 o00oooo0OooO0OO7 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                objOooO0o4 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo3) {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                } else {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000ooo4 = o0000ooo3;
                o0000o03 = o0000o02;
                o000ooo5 = o000ooo4;
                ooo00o2 = ooo00oOooOOo;
                j10 = j8;
                oooO3 = oooO2;
                oooO0o3 = oooO0o2;
                j11 = j9;
                o00OOOO0 o00oooo11 = o00oooo3;
                i33 = i31;
                z3 = z2;
                i34 = i32;
                o000O0O0.OooO0OO(text, o00oooo0OooO0OO7, j7, jOooO0O6, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i312 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                j12 = j7;
                o00oooo4 = o00oooo11;
                oo0o0oo3 = oo0o0oo2;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(text, fontSizeRange, o00oooo4, j12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, oo0o0oo3, i3, i4, i5));
        }
        i6 |= 384;
        i7 = i5 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (ooo00oOooOOo.OooOO0(j)) {
                i8 = RecyclerView.oo0o0Oo.FLAG_MOVED;
            } else {
                i8 = 1024;
            }
            i6 |= i8;
        }
        i9 = i5 & 16;
        i10 = 8192;
        if (i9 != 0) {
            i6 |= 24576;
        } else if ((i3 & 57344) == 0) {
            if (ooo00oOooOOo.Oooo0oo(o0000ooo)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i6 |= i11;
        }
        i12 = i5 & 32;
        if (i12 != 0) {
            i6 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (ooo00oOooOOo.Oooo0oo(o0000o00)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i6 |= i13;
        }
        i14 = i5 & 64;
        if (i14 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (ooo00oOooOOo.Oooo0oo(o000ooo2)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i6 |= i15;
        }
        i16 = i5 & 128;
        if (i16 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (ooo00oOooOOo.OooOO0(j2)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i6 |= i17;
        }
        i18 = i5 & 256;
        if (i18 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (ooo00oOooOOo.Oooo0oo(oooO)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i6 |= i19;
        }
        i20 = i5 & 512;
        if (i20 != 0) {
            i6 |= 805306368;
        } else if ((i3 & 1879048192) == 0) {
            if (ooo00oOooOOo.Oooo0oo(oooO0o)) {
                i21 = 536870912;
            } else {
                i21 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i6 |= i21;
        }
        i22 = i5 & 1024;
        if (i22 != 0) {
            i23 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (ooo00oOooOOo.OooOO0(j3)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i23 = i4 | i24;
        } else {
            i23 = i4;
        }
        i25 = i5 & RecyclerView.oo0o0Oo.FLAG_MOVED;
        if (i25 != 0) {
            i23 |= 48;
        } else if ((i4 & 112) != 0) {
            if (ooo00oOooOOo.OooO(i)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i23 |= i26;
        }
        i27 = i23;
        i28 = i5 & 4096;
        if (i28 != 0) {
            if ((i4 & 896) == 0) {
                if (ooo00oOooOOo.OooO0OO(z)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i27 |= i29;
            }
            i30 = i5 & 8192;
            if (i30 != 0) {
                if ((i4 & 7168) == 0) {
                    i27 |= ooo00oOooOOo.OooO(i2) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i10 = 16384;
                    }
                    i27 |= i10;
                }
                if ((i6 & 1533916891) != 306783378) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o11110 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o11111 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o11112 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    } else {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o11113 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o11114 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o11115 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function10 = oo0o0O0.f29705OooO00o;
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    int i313 = i6 & 14;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo3 = (o0O00OO) objOooO0o2;
                    long jOooO0O7 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                    objOooO0o3 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0OO8 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                    objOooO0o4 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0000ooo4 = o0000ooo3;
                    o0000o03 = o0000o02;
                    o000ooo5 = o000ooo4;
                    ooo00o2 = ooo00oOooOOo;
                    j10 = j8;
                    oooO3 = oooO2;
                    oooO0o3 = oooO0o2;
                    j11 = j9;
                    o00OOOO0 o00oooo12 = o00oooo3;
                    i33 = i31;
                    z3 = z2;
                    i34 = i32;
                    o000O0O0.OooO0OO(text, o00oooo0OooO0OO8, j7, jOooO0O7, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i313 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                    j12 = j7;
                    o00oooo4 = o00oooo12;
                    oo0o0oo3 = oo0o0oo2;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o11116 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o11117 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o11118 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    } else {
                        if (i35 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if (i7 != 0) {
                            o00000O0.OooO00o oooO00o11119 = o00000O0.f32063OooO0O0;
                            j4 = o00000O0.f32062OooO;
                        } else {
                            j4 = j;
                        }
                        if (i9 != 0) {
                            o0000ooo2 = null;
                        } else {
                            o0000ooo2 = o0000ooo;
                        }
                        if (i12 != 0) {
                            o0000o01 = null;
                        } else {
                            o0000o01 = o0000o00;
                        }
                        if (i14 != 0) {
                            o000ooo3 = null;
                        } else {
                            o000ooo3 = o000ooo2;
                        }
                        if (i16 != 0) {
                            o00O0O.OooO00o oooO00o111110 = o00O0O.f27323OooO0O0;
                            j5 = o00O0O.f27325OooO0Oo;
                        } else {
                            j5 = j2;
                        }
                        if (i18 != 0) {
                            oooO2 = null;
                        } else {
                            oooO2 = oooO;
                        }
                        if (i20 == 0) {
                        }
                        if (i22 != 0) {
                            o00O0O.OooO00o oooO00o111111 = o00O0O.f27323OooO0O0;
                            j6 = o00O0O.f27325OooO0Oo;
                        } else {
                            j6 = j3;
                        }
                        if (i25 != 0) {
                            i31 = 1;
                        } else {
                            i31 = i;
                        }
                        if (i28 == 0) {
                        }
                        if (i30 != 0) {
                            i32 = Integer.MAX_VALUE;
                        } else {
                            i32 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            i27 &= -57345;
                            oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                        } else {
                            oo0o0oo2 = oo0o0oo;
                        }
                        o0000o02 = o0000o01;
                        oooO0o2 = oooO0o4;
                        j7 = j4;
                        o000ooo4 = o000ooo3;
                        j8 = j5;
                        j9 = j6;
                        o00oooo3 = o00oooo2;
                        o0000ooo3 = o0000ooo2;
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function11 = oo0o0O0.f29705OooO00o;
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    int i314 = i6 & 14;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo3 = (o0O00OO) objOooO0o2;
                    long jOooO0O8 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                    objOooO0o3 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooO00o(o0o00oo3);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0OO9 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                    objOooO0o4 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                        ooo00oOooOOo.Oooo00o(objOooO0o4);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0000ooo4 = o0000ooo3;
                    o0000o03 = o0000o02;
                    o000ooo5 = o000ooo4;
                    ooo00o2 = ooo00oOooOOo;
                    j10 = j8;
                    oooO3 = oooO2;
                    oooO0o3 = oooO0o2;
                    j11 = j9;
                    o00OOOO0 o00oooo13 = o00oooo3;
                    i33 = i31;
                    z3 = z2;
                    i34 = i32;
                    o000O0O0.OooO0OO(text, o00oooo0OooO0OO9, j7, jOooO0O8, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i314 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                    j12 = j7;
                    o00oooo4 = o00oooo13;
                    oo0o0oo3 = oo0o0oo2;
                }
                oo0oooOooOo = ooo00o2.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(text, fontSizeRange, o00oooo4, j12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, oo0o0oo3, i3, i4, i5));
            }
            i27 |= 3072;
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i10 = 16384;
                }
                i27 |= i10;
            }
            if ((i6 & 1533916891) != 306783378) {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o111112 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o111113 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o111114 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                } else {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o111115 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o111116 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o111117 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function12 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                int i315 = i6 & 14;
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo3 = (o0O00OO) objOooO0o2;
                long jOooO0O9 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                o00OOOO0 o00oooo0OooO0OO10 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                objOooO0o4 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo3) {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                } else {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000ooo4 = o0000ooo3;
                o0000o03 = o0000o02;
                o000ooo5 = o000ooo4;
                ooo00o2 = ooo00oOooOOo;
                j10 = j8;
                oooO3 = oooO2;
                oooO0o3 = oooO0o2;
                j11 = j9;
                o00OOOO0 o00oooo14 = o00oooo3;
                i33 = i31;
                z3 = z2;
                i34 = i32;
                o000O0O0.OooO0OO(text, o00oooo0OooO0OO10, j7, jOooO0O9, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i315 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                j12 = j7;
                o00oooo4 = o00oooo14;
                oo0o0oo3 = oo0o0oo2;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o111118 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o111119 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o1111110 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                } else {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o1111111 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o1111112 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o1111113 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function13 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                int i316 = i6 & 14;
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo3 = (o0O00OO) objOooO0o2;
                long jOooO0O10 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                o00OOOO0 o00oooo0OooO0OO11 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                objOooO0o4 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo3) {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                } else {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000ooo4 = o0000ooo3;
                o0000o03 = o0000o02;
                o000ooo5 = o000ooo4;
                ooo00o2 = ooo00oOooOOo;
                j10 = j8;
                oooO3 = oooO2;
                oooO0o3 = oooO0o2;
                j11 = j9;
                o00OOOO0 o00oooo15 = o00oooo3;
                i33 = i31;
                z3 = z2;
                i34 = i32;
                o000O0O0.OooO0OO(text, o00oooo0OooO0OO11, j7, jOooO0O10, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i316 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                j12 = j7;
                o00oooo4 = o00oooo15;
                oo0o0oo3 = oo0o0oo2;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(text, fontSizeRange, o00oooo4, j12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, oo0o0oo3, i3, i4, i5));
        }
        i27 |= 384;
        i30 = i5 & 8192;
        if (i30 != 0) {
            if ((i4 & 7168) == 0) {
                i27 |= ooo00oOooOOo.OooO(i2) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
            }
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i10 = 16384;
                }
                i27 |= i10;
            }
            if ((i6 & 1533916891) != 306783378) {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o1111114 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o1111115 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o1111116 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                } else {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o1111117 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o1111118 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o1111119 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function14 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                int i317 = i6 & 14;
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo3 = (o0O00OO) objOooO0o2;
                long jOooO0O11 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                o00OOOO0 o00oooo0OooO0OO12 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                objOooO0o4 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo3) {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                } else {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000ooo4 = o0000ooo3;
                o0000o03 = o0000o02;
                o000ooo5 = o000ooo4;
                ooo00o2 = ooo00oOooOOo;
                j10 = j8;
                oooO3 = oooO2;
                oooO0o3 = oooO0o2;
                j11 = j9;
                o00OOOO0 o00oooo16 = o00oooo3;
                i33 = i31;
                z3 = z2;
                i34 = i32;
                o000O0O0.OooO0OO(text, o00oooo0OooO0OO12, j7, jOooO0O11, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i317 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                j12 = j7;
                o00oooo4 = o00oooo16;
                oo0o0oo3 = oo0o0oo2;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o11111110 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o11111111 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o11111112 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                } else {
                    if (i35 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i7 != 0) {
                        o00000O0.OooO00o oooO00o11111113 = o00000O0.f32063OooO0O0;
                        j4 = o00000O0.f32062OooO;
                    } else {
                        j4 = j;
                    }
                    if (i9 != 0) {
                        o0000ooo2 = null;
                    } else {
                        o0000ooo2 = o0000ooo;
                    }
                    if (i12 != 0) {
                        o0000o01 = null;
                    } else {
                        o0000o01 = o0000o00;
                    }
                    if (i14 != 0) {
                        o000ooo3 = null;
                    } else {
                        o000ooo3 = o000ooo2;
                    }
                    if (i16 != 0) {
                        o00O0O.OooO00o oooO00o11111114 = o00O0O.f27323OooO0O0;
                        j5 = o00O0O.f27325OooO0Oo;
                    } else {
                        j5 = j2;
                    }
                    if (i18 != 0) {
                        oooO2 = null;
                    } else {
                        oooO2 = oooO;
                    }
                    if (i20 == 0) {
                    }
                    if (i22 != 0) {
                        o00O0O.OooO00o oooO00o11111115 = o00O0O.f27323OooO0O0;
                        j6 = o00O0O.f27325OooO0Oo;
                    } else {
                        j6 = j3;
                    }
                    if (i25 != 0) {
                        i31 = 1;
                    } else {
                        i31 = i;
                    }
                    if (i28 == 0) {
                    }
                    if (i30 != 0) {
                        i32 = Integer.MAX_VALUE;
                    } else {
                        i32 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        i27 &= -57345;
                        oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                    } else {
                        oo0o0oo2 = oo0o0oo;
                    }
                    o0000o02 = o0000o01;
                    oooO0o2 = oooO0o4;
                    j7 = j4;
                    o000ooo4 = o000ooo3;
                    j8 = j5;
                    j9 = j6;
                    o00oooo3 = o00oooo2;
                    o0000ooo3 = o0000ooo2;
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function15 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                int i318 = i6 & 14;
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo3 = (o0O00OO) objOooO0o2;
                long jOooO0O12 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(o0o00oo3);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                o00OOOO0 o00oooo0OooO0OO13 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
                objOooO0o4 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo3) {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                } else {
                    objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                    ooo00oOooOOo.Oooo00o(objOooO0o4);
                }
                ooo00oOooOOo.Oooo0o0();
                o0000ooo4 = o0000ooo3;
                o0000o03 = o0000o02;
                o000ooo5 = o000ooo4;
                ooo00o2 = ooo00oOooOOo;
                j10 = j8;
                oooO3 = oooO2;
                oooO0o3 = oooO0o2;
                j11 = j9;
                o00OOOO0 o00oooo17 = o00oooo3;
                i33 = i31;
                z3 = z2;
                i34 = i32;
                o000O0O0.OooO0OO(text, o00oooo0OooO0OO13, j7, jOooO0O12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i318 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
                j12 = j7;
                o00oooo4 = o00oooo17;
                oo0o0oo3 = oo0o0oo2;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(text, fontSizeRange, o00oooo4, j12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, oo0o0oo3, i3, i4, i5));
        }
        i27 |= 3072;
        if ((i4 & 57344) != 0) {
            if ((i5 & 16384) == 0) {
                i10 = 16384;
            }
            i27 |= i10;
        }
        if ((i6 & 1533916891) != 306783378) {
            ooo00oOooOOo.OooOOo0();
            if ((i3 & 1) != 0) {
                if (i35 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if (i7 != 0) {
                    o00000O0.OooO00o oooO00o11111116 = o00000O0.f32063OooO0O0;
                    j4 = o00000O0.f32062OooO;
                } else {
                    j4 = j;
                }
                if (i9 != 0) {
                    o0000ooo2 = null;
                } else {
                    o0000ooo2 = o0000ooo;
                }
                if (i12 != 0) {
                    o0000o01 = null;
                } else {
                    o0000o01 = o0000o00;
                }
                if (i14 != 0) {
                    o000ooo3 = null;
                } else {
                    o000ooo3 = o000ooo2;
                }
                if (i16 != 0) {
                    o00O0O.OooO00o oooO00o11111117 = o00O0O.f27323OooO0O0;
                    j5 = o00O0O.f27325OooO0Oo;
                } else {
                    j5 = j2;
                }
                if (i18 != 0) {
                    oooO2 = null;
                } else {
                    oooO2 = oooO;
                }
                if (i20 == 0) {
                }
                if (i22 != 0) {
                    o00O0O.OooO00o oooO00o11111118 = o00O0O.f27323OooO0O0;
                    j6 = o00O0O.f27325OooO0Oo;
                } else {
                    j6 = j3;
                }
                if (i25 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i28 == 0) {
                }
                if (i30 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i2;
                }
                if ((i5 & 16384) != 0) {
                    i27 &= -57345;
                    oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                o0000o02 = o0000o01;
                oooO0o2 = oooO0o4;
                j7 = j4;
                o000ooo4 = o000ooo3;
                j8 = j5;
                j9 = j6;
                o00oooo3 = o00oooo2;
                o0000ooo3 = o0000ooo2;
            } else {
                if (i35 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if (i7 != 0) {
                    o00000O0.OooO00o oooO00o11111119 = o00000O0.f32063OooO0O0;
                    j4 = o00000O0.f32062OooO;
                } else {
                    j4 = j;
                }
                if (i9 != 0) {
                    o0000ooo2 = null;
                } else {
                    o0000ooo2 = o0000ooo;
                }
                if (i12 != 0) {
                    o0000o01 = null;
                } else {
                    o0000o01 = o0000o00;
                }
                if (i14 != 0) {
                    o000ooo3 = null;
                } else {
                    o000ooo3 = o000ooo2;
                }
                if (i16 != 0) {
                    o00O0O.OooO00o oooO00o111111110 = o00O0O.f27323OooO0O0;
                    j5 = o00O0O.f27325OooO0Oo;
                } else {
                    j5 = j2;
                }
                if (i18 != 0) {
                    oooO2 = null;
                } else {
                    oooO2 = oooO;
                }
                if (i20 == 0) {
                }
                if (i22 != 0) {
                    o00O0O.OooO00o oooO00o111111111 = o00O0O.f27323OooO0O0;
                    j6 = o00O0O.f27325OooO0Oo;
                } else {
                    j6 = j3;
                }
                if (i25 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i28 == 0) {
                }
                if (i30 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i2;
                }
                if ((i5 & 16384) != 0) {
                    i27 &= -57345;
                    oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                o0000o02 = o0000o01;
                oooO0o2 = oooO0o4;
                j7 = j4;
                o000ooo4 = o000ooo3;
                j8 = j5;
                j9 = j6;
                o00oooo3 = o00oooo2;
                o0000ooo3 = o0000ooo2;
            }
            ooo00oOooOOo.Oooo0oO();
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function16 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(-492369756);
            objOooO0o = ooo00oOooOOo.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0o00oo2 = (o0O00OO) objOooO0o;
            int i319 = i6 & 14;
            ooo00oOooOOo.OooO0o0(1157296644);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
            objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            } else {
                objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o0o00oo3 = (o0O00OO) objOooO0o2;
            long jOooO0O13 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
            ooo00oOooOOo.OooO0o0(1157296644);
            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
            objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2) {
                objOooO0o3 = new OooO00o(o0o00oo3);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            } else {
                objOooO0o3 = new OooO00o(o0o00oo3);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            o00OOOO0 o00oooo0OooO0OO14 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
            ooo00oOooOOo.OooO0o0(1618982084);
            zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
            objOooO0o4 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo3) {
                objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o4);
            } else {
                objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o4);
            }
            ooo00oOooOOo.Oooo0o0();
            o0000ooo4 = o0000ooo3;
            o0000o03 = o0000o02;
            o000ooo5 = o000ooo4;
            ooo00o2 = ooo00oOooOOo;
            j10 = j8;
            oooO3 = oooO2;
            oooO0o3 = oooO0o2;
            j11 = j9;
            o00OOOO0 o00oooo18 = o00oooo3;
            i33 = i31;
            z3 = z2;
            i34 = i32;
            o000O0O0.OooO0OO(text, o00oooo0OooO0OO14, j7, jOooO0O13, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i319 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
            j12 = j7;
            o00oooo4 = o00oooo18;
            oo0o0oo3 = oo0o0oo2;
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i3 & 1) != 0) {
                if (i35 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if (i7 != 0) {
                    o00000O0.OooO00o oooO00o111111112 = o00000O0.f32063OooO0O0;
                    j4 = o00000O0.f32062OooO;
                } else {
                    j4 = j;
                }
                if (i9 != 0) {
                    o0000ooo2 = null;
                } else {
                    o0000ooo2 = o0000ooo;
                }
                if (i12 != 0) {
                    o0000o01 = null;
                } else {
                    o0000o01 = o0000o00;
                }
                if (i14 != 0) {
                    o000ooo3 = null;
                } else {
                    o000ooo3 = o000ooo2;
                }
                if (i16 != 0) {
                    o00O0O.OooO00o oooO00o111111113 = o00O0O.f27323OooO0O0;
                    j5 = o00O0O.f27325OooO0Oo;
                } else {
                    j5 = j2;
                }
                if (i18 != 0) {
                    oooO2 = null;
                } else {
                    oooO2 = oooO;
                }
                if (i20 == 0) {
                }
                if (i22 != 0) {
                    o00O0O.OooO00o oooO00o111111114 = o00O0O.f27323OooO0O0;
                    j6 = o00O0O.f27325OooO0Oo;
                } else {
                    j6 = j3;
                }
                if (i25 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i28 == 0) {
                }
                if (i30 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i2;
                }
                if ((i5 & 16384) != 0) {
                    i27 &= -57345;
                    oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                o0000o02 = o0000o01;
                oooO0o2 = oooO0o4;
                j7 = j4;
                o000ooo4 = o000ooo3;
                j8 = j5;
                j9 = j6;
                o00oooo3 = o00oooo2;
                o0000ooo3 = o0000ooo2;
            } else {
                if (i35 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if (i7 != 0) {
                    o00000O0.OooO00o oooO00o111111115 = o00000O0.f32063OooO0O0;
                    j4 = o00000O0.f32062OooO;
                } else {
                    j4 = j;
                }
                if (i9 != 0) {
                    o0000ooo2 = null;
                } else {
                    o0000ooo2 = o0000ooo;
                }
                if (i12 != 0) {
                    o0000o01 = null;
                } else {
                    o0000o01 = o0000o00;
                }
                if (i14 != 0) {
                    o000ooo3 = null;
                } else {
                    o000ooo3 = o000ooo2;
                }
                if (i16 != 0) {
                    o00O0O.OooO00o oooO00o111111116 = o00O0O.f27323OooO0O0;
                    j5 = o00O0O.f27325OooO0Oo;
                } else {
                    j5 = j2;
                }
                if (i18 != 0) {
                    oooO2 = null;
                } else {
                    oooO2 = oooO;
                }
                if (i20 == 0) {
                }
                if (i22 != 0) {
                    o00O0O.OooO00o oooO00o111111117 = o00O0O.f27323OooO0O0;
                    j6 = o00O0O.f27325OooO0Oo;
                } else {
                    j6 = j3;
                }
                if (i25 != 0) {
                    i31 = 1;
                } else {
                    i31 = i;
                }
                if (i28 == 0) {
                }
                if (i30 != 0) {
                    i32 = Integer.MAX_VALUE;
                } else {
                    i32 = i2;
                }
                if ((i5 & 16384) != 0) {
                    i27 &= -57345;
                    oo0o0oo2 = (oo0o0Oo) ooo00oOooOOo.OooOO0o(o000O0O0.f2748OooO00o);
                } else {
                    oo0o0oo2 = oo0o0oo;
                }
                o0000o02 = o0000o01;
                oooO0o2 = oooO0o4;
                j7 = j4;
                o000ooo4 = o000ooo3;
                j8 = j5;
                j9 = j6;
                o00oooo3 = o00oooo2;
                o0000ooo3 = o0000ooo2;
            }
            ooo00oOooOOo.Oooo0oO();
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function17 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(-492369756);
            objOooO0o = ooo00oOooOOo.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(Float.valueOf(o00O0O.OooO0OO(fontSizeRange.f48116OooO0O0)));
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0o00oo2 = (o0O00OO) objOooO0o;
            int i3110 = i6 & 14;
            ooo00oOooOOo.OooO0o0(1157296644);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(text);
            objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            } else {
                objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o0o00oo3 = (o0O00OO) objOooO0o2;
            long jOooO0O14 = o00Oo0.OooO0O0(((Number) o0o00oo2.getValue()).floatValue());
            ooo00oOooOOo.OooO0o0(1157296644);
            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
            objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2) {
                objOooO0o3 = new OooO00o(o0o00oo3);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            } else {
                objOooO0o3 = new OooO00o(o0o00oo3);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            o00OOOO0 o00oooo0OooO0OO15 = DrawModifierKt.OooO0OO(o00oooo3, (Function1) objOooO0o3);
            ooo00oOooOOo.OooO0o0(1618982084);
            zOooo0oo3 = ooo00oOooOOo.Oooo0oo(o0o00oo3) | ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(fontSizeRange);
            objOooO0o4 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo3) {
                objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o4);
            } else {
                objOooO0o4 = new OooO0O0(fontSizeRange, o0o00oo3, o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o4);
            }
            ooo00oOooOOo.Oooo0o0();
            o0000ooo4 = o0000ooo3;
            o0000o03 = o0000o02;
            o000ooo5 = o000ooo4;
            ooo00o2 = ooo00oOooOOo;
            j10 = j8;
            oooO3 = oooO2;
            oooO0o3 = oooO0o2;
            j11 = j9;
            o00OOOO0 o00oooo19 = o00oooo3;
            i33 = i31;
            z3 = z2;
            i34 = i32;
            o000O0O0.OooO0OO(text, o00oooo0OooO0OO15, j7, jOooO0O14, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, (Function1) objOooO0o4, oo0o0oo2, ooo00o2, ((i6 >> 3) & 896) | i3110 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (234881024 & i6) | (i6 & 1879048192), (i27 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i27 << 3) & 458752), 0);
            j12 = j7;
            o00oooo4 = o00oooo19;
            oo0o0oo3 = oo0o0oo2;
        }
        oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(text, fontSizeRange, o00oooo4, j12, o0000ooo4, o0000o03, o000ooo5, j10, oooO3, oooO0o3, j11, i33, z3, i34, oo0o0oo3, i3, i4, i5));
    }
}
