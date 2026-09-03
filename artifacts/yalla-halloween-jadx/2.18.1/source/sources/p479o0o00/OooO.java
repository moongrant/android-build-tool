package p479o0o00;

import Oooo0.o0oOOo;
import Oooo0.oo00oO;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo.OooOO0;
import p023Oooo00O.o0000O0;
import p023Oooo00O.o00oO0o;
import p023Oooo00O.oo000o;
import p031OoooO.OooOOO;
import p031OoooO.OooOOOO;
import p031OoooO.o00000O;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p442o0OoOo0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo000o<Float> f40674OooO00o = o00oO0o.OooO0Oo(SQLiteDatabase.MAX_SQL_CACHE_SIZE, 0, o0000O0.f1051OooO00o, 2);

    public static final class OooO00o extends Lambda implements Function3<List<? extends OooOo00>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f40675Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(3);
            this.f40675Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends OooOo00> list, oOO00O ooo00o, Integer num) {
            List<? extends OooOo00> tabPositions = list;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            OooOo oooOo = OooOo.f40725OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            OooOo00 currentTabPosition = tabPositions.get(this.f40675Oooo0o);
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            oooOo.OooO0O0(o00OOO0O.OooO00o(oooO00o, o00oOoo.f6560OooO00o, new OooOOOO(currentTabPosition)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 0L, false, null, ooo00o2, 12582912, 126);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f40676Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f40677Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f40678Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f40679Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f40680OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function3<List<OooOo00>, oOO00O, Integer, Unit> f40681OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(float f, Function2<? super oOO00O, ? super Integer, Unit> function2, Function2<? super oOO00O, ? super Integer, Unit> function3, int i, Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function4, int i2) {
            super(2);
            this.f40677Oooo0o = f;
            this.f40678Oooo0oO = function2;
            this.f40679Oooo0oo = function3;
            this.f40676Oooo = i;
            this.f40681OoooO00 = function4;
            this.f40680OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0oOOo o0ooooOooO0O0 = oo00oO.OooO0O0(ooo00o2, 1);
                ooo00o2.OooO0o0(773894976);
                ooo00o2.OooO0o0(-492369756);
                Object objOooO0o = ooo00o2.OooO0o();
                oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = Oooo000.o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, ooo00o2), ooo00o2);
                }
                ooo00o2.Oooo0o0();
                CoroutineScope coroutineScope = ((o00OO0OO) objOooO0o).f29498Oooo0o;
                ooo00o2.Oooo0o0();
                ooo00o2.OooO0o0(511388516);
                boolean zOooo0oo = ooo00o2.Oooo0oo(o0ooooOooO0O0) | ooo00o2.Oooo0oo(coroutineScope);
                Object objOooO0o2 = ooo00o2.OooO0o();
                if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new OooO0o(o0ooooOooO0O0, coroutineScope);
                    ooo00o2.Oooo00o(objOooO0o2);
                }
                ooo00o2.Oooo0o0();
                o00OOOO0 o00oooo0OooO00o = oo00oO.OooO00o(SizeKt.OooOOOO(SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o), o00OO0O0.OooO00o.f4176OooO0o0, 2), o0ooooOooO0O0);
                Intrinsics.checkNotNullParameter(o00oooo0OooO00o, "<this>");
                SubcomposeLayoutKt.OooO00o(Oooo000.OooO0O0(SemanticsModifierKt.OooO00o(o00oooo0OooO00o, false, OooOO0.f447Oooo0o)), new OooOOO0(this.f40677Oooo0o, this.f40678Oooo0oO, this.f40679Oooo0oo, (OooO0o) objOooO0o2, this.f40676Oooo, this.f40681OoooO00, this.f40680OoooO0), ooo00o2, 0, 0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f40682Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f40683Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f40684Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f40685Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f40686OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<OooOo00>, oOO00O, Integer, Unit> f40687OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ float f40688OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f40689OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f40690OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f40691o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(int i, o00OOOO0 o00oooo1, long j, long j2, float f, Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function3, Function2<? super oOO00O, ? super Integer, Unit> function2, Function2<? super oOO00O, ? super Integer, Unit> function4, int i2, int i3) {
            super(2);
            this.f40683Oooo0o = i;
            this.f40684Oooo0oO = o00oooo1;
            this.f40685Oooo0oo = j;
            this.f40682Oooo = j2;
            this.f40688OoooO00 = f;
            this.f40687OoooO0 = function3;
            this.f40689OoooO0O = function2;
            this.f40686OoooO = function4;
            this.f40690OoooOO0 = i2;
            this.f40691o000oOoO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooO.OooO00o(this.f40683Oooo0o, this.f40684Oooo0oO, this.f40685Oooo0oo, this.f40682Oooo, this.f40688OoooO00, this.f40687OoooO0, this.f40689OoooO0O, this.f40686OoooO, ooo00o, this.f40690OoooOO0 | 1, this.f40691o000oOoO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:120:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0194 A[PHI: r2 r3 r4 r6 r8 r9
      0x0194: PHI (r2v28 int) = (r2v22 int), (r2v31 int) binds: [B:127:0x0188, B:105:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r3v6 OoooooO.o00OOOO0) = (r3v2 OoooooO.o00OOOO0), (r3v9 OoooooO.o00OOOO0) binds: [B:127:0x0188, B:105:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r4v22 long) = (r4v14 long), (r4v24 long) binds: [B:127:0x0188, B:105:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r6v5 long) = (r6v2 long), (r6v6 long) binds: [B:127:0x0188, B:105:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r8v6 float) = (r8v1 float), (r8v7 float) binds: [B:127:0x0188, B:105:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r9v7 kotlin.jvm.functions.Function3<? super java.util.List<o0o00.OooOo00>, ? super o000oOoO.oOO00O, ? super java.lang.Integer, kotlin.Unit>) = 
      (r9v2 kotlin.jvm.functions.Function3<? super java.util.List<o0o00.OooOo00>, ? super o000oOoO.oOO00O, ? super java.lang.Integer, kotlin.Unit>)
      (r9v8 kotlin.jvm.functions.Function3<? super java.util.List<o0o00.OooOo00>, ? super o000oOoO.oOO00O, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:127:0x0188, B:105:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void OooO00o(int i, @Nullable o00OOOO0 o00oooo1, long j, long j2, float f, @Nullable Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function3, @Nullable Function2<? super oOO00O, ? super Integer, Unit> function2, @NotNull Function2<? super oOO00O, ? super Integer, Unit> tabs, @Nullable oOO00O ooo00o, int i2, int i3) {
        int i4;
        long j3;
        int i5;
        float f2;
        int i6;
        int i7;
        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function4;
        int i8;
        int i9;
        int i10;
        int i11;
        o00OOOO0 o00oooo2;
        long jOooO0o;
        long jOooO00o;
        float f3;
        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function3OooO00o;
        int i12;
        Function2<? super oOO00O, ? super Integer, Unit> function5;
        OooOOO oooOOO;
        Function2<? super oOO00O, ? super Integer, Unit> function6;
        o00OOOO0 o00oooo3;
        long j4;
        long j5;
        float f4;
        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function7;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-472490893);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (ooo00oOooOOo.OooO(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 == 0) {
            if ((i2 & 112) == 0) {
                i4 |= ooo00oOooOOo.Oooo0oo(o00oooo1) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                i4 |= ((i3 & 4) == 0 || !ooo00oOooOOo.OooOO0(j)) ? 128 : 256;
            }
            if ((i2 & 7168) == 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i14 = ooo00oOooOOo.OooOO0(j3) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
                    i4 |= i14;
                } else {
                    j3 = j2;
                }
                i4 |= i14;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((57344 & i2) == 0) {
                    f2 = f;
                    if (ooo00oOooOOo.OooO0oO(f2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((458752 & i2) == 0) {
                        function4 = function3;
                        if (ooo00oOooOOo.Oooo0oo(function4)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(function2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 128) != 0) {
                        if ((29360128 & i2) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(tabs)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                        }
                        if ((23967451 & i4) == 4793490 || !ooo00oOooOOo.OooOo0()) {
                            ooo00oOooOOo.OooOOo0();
                            if ((i2 & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                                if (i13 != 0) {
                                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                                } else {
                                    o00oooo2 = o00oooo1;
                                }
                                if ((i3 & 4) != 0) {
                                    oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                    Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                    if (oooOOO.OooO0oO()) {
                                        jOooO0o = oooOOO.OooO0Oo();
                                    } else {
                                        jOooO0o = oooOOO.OooO0o();
                                    }
                                    i4 &= -897;
                                } else {
                                    jOooO0o = j;
                                }
                                if ((i3 & 8) != 0) {
                                    jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                    i4 &= -7169;
                                } else {
                                    jOooO00o = j3;
                                }
                                if (i5 != 0) {
                                    OooOo oooOo = OooOo.f40725OooO00o;
                                    f3 = OooOo.f40729OooO0o0;
                                } else {
                                    f3 = f2;
                                }
                                if (i7 != 0) {
                                    function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                                } else {
                                    function3OooO00o = function4;
                                }
                                if (i9 != 0) {
                                    p479o0o00.OooO0O0 oooO0O0 = p479o0o00.OooO0O0.f40692OooO00o;
                                    i12 = i4;
                                    function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                                }
                                ooo00oOooOOo.Oooo0oO();
                                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function8 = oo0o0O0.f29705OooO00o;
                                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function9 = function3OooO00o;
                                function6 = function5;
                                o00oooo3 = o00oooo2;
                                j4 = jOooO0o;
                                j5 = jOooO00o;
                                f4 = f3;
                                function7 = function9;
                            } else {
                                ooo00oOooOOo.OooOoo0();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                o00oooo2 = o00oooo1;
                                jOooO0o = j;
                                jOooO00o = j3;
                                f3 = f2;
                                function3OooO00o = function4;
                            }
                            i12 = i4;
                            function5 = function2;
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function10 = oo0o0O0.f29705OooO00o;
                            o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                            Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function11 = function3OooO00o;
                            function6 = function5;
                            o00oooo3 = o00oooo2;
                            j4 = jOooO0o;
                            j5 = jOooO00o;
                            f4 = f3;
                            function7 = function11;
                        } else {
                            ooo00oOooOOo.OooOoo0();
                            o00oooo3 = o00oooo1;
                            j4 = j;
                            function6 = function2;
                            j5 = j3;
                            f4 = f2;
                            function7 = function4;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
                    }
                    i11 = 12582912;
                    i4 |= i11;
                    if ((23967451 & i4) == 4793490) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo2 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O1 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        } else {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo3 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O2 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function12 = oo0o0O0.f29705OooO00o;
                        o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function13 = function3OooO00o;
                        function6 = function5;
                        o00oooo3 = o00oooo2;
                        j4 = jOooO0o;
                        j5 = jOooO00o;
                        f4 = f3;
                        function7 = function13;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo4 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O3 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        } else {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo5 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O4 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function14 = oo0o0O0.f29705OooO00o;
                        o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function15 = function3OooO00o;
                        function6 = function5;
                        o00oooo3 = o00oooo2;
                        j4 = jOooO0o;
                        j5 = jOooO00o;
                        f4 = f3;
                        function7 = function15;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
                }
                i4 |= 196608;
                function4 = function3;
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(function2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                if ((i3 & 128) != 0) {
                    if ((29360128 & i2) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(tabs)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i4) == 4793490) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo6 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O5 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        } else {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo7 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O6 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function16 = oo0o0O0.f29705OooO00o;
                        o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function17 = function3OooO00o;
                        function6 = function5;
                        o00oooo3 = o00oooo2;
                        j4 = jOooO0o;
                        j5 = jOooO00o;
                        f4 = f3;
                        function7 = function17;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo8 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O7 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        } else {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo9 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O8 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function18 = oo0o0O0.f29705OooO00o;
                        o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function19 = function3OooO00o;
                        function6 = function5;
                        o00oooo3 = o00oooo2;
                        j4 = jOooO0o;
                        j5 = jOooO00o;
                        f4 = f3;
                        function7 = function19;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
                }
                i11 = 12582912;
                i4 |= i11;
                if ((23967451 & i4) == 4793490) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo10 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O9 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo11 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O10 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function110 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function111 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function111;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo12 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O11 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo13 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O12 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function112 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function113 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function113;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
            }
            i4 |= 24576;
            f2 = f;
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    function4 = function3;
                    if (ooo00oOooOOo.Oooo0oo(function4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(function2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                if ((i3 & 128) != 0) {
                    if ((29360128 & i2) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(tabs)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i4) == 4793490) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo14 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O13 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        } else {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo15 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O14 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function114 = oo0o0O0.f29705OooO00o;
                        o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function115 = function3OooO00o;
                        function6 = function5;
                        o00oooo3 = o00oooo2;
                        j4 = jOooO0o;
                        j5 = jOooO00o;
                        f4 = f3;
                        function7 = function115;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo16 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O15 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        } else {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo17 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O16 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function116 = oo0o0O0.f29705OooO00o;
                        o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function117 = function3OooO00o;
                        function6 = function5;
                        o00oooo3 = o00oooo2;
                        j4 = jOooO0o;
                        j5 = jOooO00o;
                        f4 = f3;
                        function7 = function117;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
                }
                i11 = 12582912;
                i4 |= i11;
                if ((23967451 & i4) == 4793490) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo18 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O17 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo19 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O18 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function118 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function119 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function119;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo110 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O19 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo111 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O110 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1110 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1111 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function1111;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
            }
            i4 |= 196608;
            function4 = function3;
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (ooo00oOooOOo.Oooo0oo(function2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(tabs)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i4) == 4793490) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo112 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O111 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo113 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O112 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1112 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1113 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function1113;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo114 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O113 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo115 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O114 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1114 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1115 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function1115;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
            }
            i11 = 12582912;
            i4 |= i11;
            if ((23967451 & i4) == 4793490) {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo116 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O115 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                } else {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo117 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O116 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1116 = oo0o0O0.f29705OooO00o;
                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1117 = function3OooO00o;
                function6 = function5;
                o00oooo3 = o00oooo2;
                j4 = jOooO0o;
                j5 = jOooO00o;
                f4 = f3;
                function7 = function1117;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo118 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O117 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                } else {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo119 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O118 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1118 = oo0o0O0.f29705OooO00o;
                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1119 = function3OooO00o;
                function6 = function5;
                o00oooo3 = o00oooo2;
                j4 = jOooO0o;
                j5 = jOooO00o;
                f4 = f3;
                function7 = function1119;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
        }
        i4 |= 48;
        if ((i2 & 896) != 0) {
            i4 |= ((i3 & 4) == 0 || !ooo00oOooOOo.OooOO0(j)) ? 128 : 256;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                j3 = j2;
                if (ooo00oOooOOo.OooOO0(j3)) {
                }
                i4 |= i14;
            } else {
                j3 = j2;
            }
            i4 |= i14;
        } else {
            j3 = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((57344 & i2) == 0) {
                f2 = f;
                if (ooo00oOooOOo.OooO0oO(f2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((458752 & i2) == 0) {
                    function4 = function3;
                    if (ooo00oOooOOo.Oooo0oo(function4)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(function2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                if ((i3 & 128) != 0) {
                    if ((29360128 & i2) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(tabs)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i4) == 4793490) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo1110 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O119 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        } else {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo1111 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O1110 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11110 = oo0o0O0.f29705OooO00o;
                        o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function11111 = function3OooO00o;
                        function6 = function5;
                        o00oooo3 = o00oooo2;
                        j4 = jOooO0o;
                        j5 = jOooO00o;
                        f4 = f3;
                        function7 = function11111;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0) {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo1112 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O1111 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        } else {
                            if (i13 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            if ((i3 & 4) != 0) {
                                oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                                Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                                if (oooOOO.OooO0oO()) {
                                    jOooO0o = oooOOO.OooO0Oo();
                                } else {
                                    jOooO0o = oooOOO.OooO0o();
                                }
                                i4 &= -897;
                            } else {
                                jOooO0o = j;
                            }
                            if ((i3 & 8) != 0) {
                                jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                                i4 &= -7169;
                            } else {
                                jOooO00o = j3;
                            }
                            if (i5 != 0) {
                                OooOo oooOo1113 = OooOo.f40725OooO00o;
                                f3 = OooOo.f40729OooO0o0;
                            } else {
                                f3 = f2;
                            }
                            if (i7 != 0) {
                                function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                            } else {
                                function3OooO00o = function4;
                            }
                            if (i9 != 0) {
                                p479o0o00.OooO0O0 oooO0O1112 = p479o0o00.OooO0O0.f40692OooO00o;
                                i12 = i4;
                                function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                            } else {
                                i12 = i4;
                                function5 = function2;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11112 = oo0o0O0.f29705OooO00o;
                        o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                        Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function11113 = function3OooO00o;
                        function6 = function5;
                        o00oooo3 = o00oooo2;
                        j4 = jOooO0o;
                        j5 = jOooO00o;
                        f4 = f3;
                        function7 = function11113;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
                }
                i11 = 12582912;
                i4 |= i11;
                if ((23967451 & i4) == 4793490) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo1114 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O1113 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo1115 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O1114 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11114 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function11115 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function11115;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo1116 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O1115 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo1117 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O1116 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11116 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function11117 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function11117;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
            }
            i4 |= 196608;
            function4 = function3;
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (ooo00oOooOOo.Oooo0oo(function2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(tabs)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i4) == 4793490) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo1118 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O1117 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo1119 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O1118 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11118 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function11119 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function11119;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo11110 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O1119 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo11111 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O11110 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111110 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function111111 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function111111;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
            }
            i11 = 12582912;
            i4 |= i11;
            if ((23967451 & i4) == 4793490) {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo11112 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O11111 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                } else {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo11113 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O11112 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111112 = oo0o0O0.f29705OooO00o;
                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function111113 = function3OooO00o;
                function6 = function5;
                o00oooo3 = o00oooo2;
                j4 = jOooO0o;
                j5 = jOooO00o;
                f4 = f3;
                function7 = function111113;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo11114 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O11113 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                } else {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo11115 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O11114 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111114 = oo0o0O0.f29705OooO00o;
                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function111115 = function3OooO00o;
                function6 = function5;
                o00oooo3 = o00oooo2;
                j4 = jOooO0o;
                j5 = jOooO00o;
                f4 = f3;
                function7 = function111115;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
        }
        i4 |= 24576;
        f2 = f;
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((458752 & i2) == 0) {
                function4 = function3;
                if (ooo00oOooOOo.Oooo0oo(function4)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (ooo00oOooOOo.Oooo0oo(function2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            if ((i3 & 128) != 0) {
                if ((29360128 & i2) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(tabs)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i4) == 4793490) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo11116 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O11115 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo11117 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O11116 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111116 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function111117 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function111117;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo11118 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O11117 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    } else {
                        if (i13 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        if ((i3 & 4) != 0) {
                            oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                            Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                            if (oooOOO.OooO0oO()) {
                                jOooO0o = oooOOO.OooO0Oo();
                            } else {
                                jOooO0o = oooOOO.OooO0o();
                            }
                            i4 &= -897;
                        } else {
                            jOooO0o = j;
                        }
                        if ((i3 & 8) != 0) {
                            jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                            i4 &= -7169;
                        } else {
                            jOooO00o = j3;
                        }
                        if (i5 != 0) {
                            OooOo oooOo11119 = OooOo.f40725OooO00o;
                            f3 = OooOo.f40729OooO0o0;
                        } else {
                            f3 = f2;
                        }
                        if (i7 != 0) {
                            function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                        } else {
                            function3OooO00o = function4;
                        }
                        if (i9 != 0) {
                            p479o0o00.OooO0O0 oooO0O11118 = p479o0o00.OooO0O0.f40692OooO00o;
                            i12 = i4;
                            function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                        } else {
                            i12 = i4;
                            function5 = function2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111118 = oo0o0O0.f29705OooO00o;
                    o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                    Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function111119 = function3OooO00o;
                    function6 = function5;
                    o00oooo3 = o00oooo2;
                    j4 = jOooO0o;
                    j5 = jOooO00o;
                    f4 = f3;
                    function7 = function111119;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
            }
            i11 = 12582912;
            i4 |= i11;
            if ((23967451 & i4) == 4793490) {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo111110 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O11119 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                } else {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo111111 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O111110 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111110 = oo0o0O0.f29705OooO00o;
                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1111111 = function3OooO00o;
                function6 = function5;
                o00oooo3 = o00oooo2;
                j4 = jOooO0o;
                j5 = jOooO00o;
                f4 = f3;
                function7 = function1111111;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo111112 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O111111 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                } else {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo111113 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O111112 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111112 = oo0o0O0.f29705OooO00o;
                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1111113 = function3OooO00o;
                function6 = function5;
                o00oooo3 = o00oooo2;
                j4 = jOooO0o;
                j5 = jOooO00o;
                f4 = f3;
                function7 = function1111113;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
        }
        i4 |= 196608;
        function4 = function3;
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (ooo00oOooOOo.Oooo0oo(function2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        }
        if ((i3 & 128) != 0) {
            if ((29360128 & i2) == 0) {
                if (ooo00oOooOOo.Oooo0oo(tabs)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
            }
            if ((23967451 & i4) == 4793490) {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo111114 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O111113 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                } else {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo111115 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O111114 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111114 = oo0o0O0.f29705OooO00o;
                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1111115 = function3OooO00o;
                function6 = function5;
                o00oooo3 = o00oooo2;
                j4 = jOooO0o;
                j5 = jOooO00o;
                f4 = f3;
                function7 = function1111115;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo111116 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O111115 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                } else {
                    if (i13 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if ((i3 & 4) != 0) {
                        oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                        Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                        if (oooOOO.OooO0oO()) {
                            jOooO0o = oooOOO.OooO0Oo();
                        } else {
                            jOooO0o = oooOOO.OooO0o();
                        }
                        i4 &= -897;
                    } else {
                        jOooO0o = j;
                    }
                    if ((i3 & 8) != 0) {
                        jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                        i4 &= -7169;
                    } else {
                        jOooO00o = j3;
                    }
                    if (i5 != 0) {
                        OooOo oooOo111117 = OooOo.f40725OooO00o;
                        f3 = OooOo.f40729OooO0o0;
                    } else {
                        f3 = f2;
                    }
                    if (i7 != 0) {
                        function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                    } else {
                        function3OooO00o = function4;
                    }
                    if (i9 != 0) {
                        p479o0o00.OooO0O0 oooO0O111116 = p479o0o00.OooO0O0.f40692OooO00o;
                        i12 = i4;
                        function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                    } else {
                        i12 = i4;
                        function5 = function2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111116 = oo0o0O0.f29705OooO00o;
                o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
                Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1111117 = function3OooO00o;
                function6 = function5;
                o00oooo3 = o00oooo2;
                j4 = jOooO0o;
                j5 = jOooO00o;
                f4 = f3;
                function7 = function1111117;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
        }
        i11 = 12582912;
        i4 |= i11;
        if ((23967451 & i4) == 4793490) {
            ooo00oOooOOo.OooOOo0();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i3 & 4) != 0) {
                    oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                    Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                    if (oooOOO.OooO0oO()) {
                        jOooO0o = oooOOO.OooO0Oo();
                    } else {
                        jOooO0o = oooOOO.OooO0o();
                    }
                    i4 &= -897;
                } else {
                    jOooO0o = j;
                }
                if ((i3 & 8) != 0) {
                    jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                    i4 &= -7169;
                } else {
                    jOooO00o = j3;
                }
                if (i5 != 0) {
                    OooOo oooOo111118 = OooOo.f40725OooO00o;
                    f3 = OooOo.f40729OooO0o0;
                } else {
                    f3 = f2;
                }
                if (i7 != 0) {
                    function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                } else {
                    function3OooO00o = function4;
                }
                if (i9 != 0) {
                    p479o0o00.OooO0O0 oooO0O111117 = p479o0o00.OooO0O0.f40692OooO00o;
                    i12 = i4;
                    function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                } else {
                    i12 = i4;
                    function5 = function2;
                }
            } else {
                if (i13 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i3 & 4) != 0) {
                    oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                    Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                    if (oooOOO.OooO0oO()) {
                        jOooO0o = oooOOO.OooO0Oo();
                    } else {
                        jOooO0o = oooOOO.OooO0o();
                    }
                    i4 &= -897;
                } else {
                    jOooO0o = j;
                }
                if ((i3 & 8) != 0) {
                    jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                    i4 &= -7169;
                } else {
                    jOooO00o = j3;
                }
                if (i5 != 0) {
                    OooOo oooOo111119 = OooOo.f40725OooO00o;
                    f3 = OooOo.f40729OooO0o0;
                } else {
                    f3 = f2;
                }
                if (i7 != 0) {
                    function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                } else {
                    function3OooO00o = function4;
                }
                if (i9 != 0) {
                    p479o0o00.OooO0O0 oooO0O111118 = p479o0o00.OooO0O0.f40692OooO00o;
                    i12 = i4;
                    function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                } else {
                    i12 = i4;
                    function5 = function2;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111118 = oo0o0O0.f29705OooO00o;
            o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
            Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function1111119 = function3OooO00o;
            function6 = function5;
            o00oooo3 = o00oooo2;
            j4 = jOooO0o;
            j5 = jOooO00o;
            f4 = f3;
            function7 = function1111119;
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i3 & 4) != 0) {
                    oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                    Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                    if (oooOOO.OooO0oO()) {
                        jOooO0o = oooOOO.OooO0Oo();
                    } else {
                        jOooO0o = oooOOO.OooO0o();
                    }
                    i4 &= -897;
                } else {
                    jOooO0o = j;
                }
                if ((i3 & 8) != 0) {
                    jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                    i4 &= -7169;
                } else {
                    jOooO00o = j3;
                }
                if (i5 != 0) {
                    OooOo oooOo1111110 = OooOo.f40725OooO00o;
                    f3 = OooOo.f40729OooO0o0;
                } else {
                    f3 = f2;
                }
                if (i7 != 0) {
                    function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                } else {
                    function3OooO00o = function4;
                }
                if (i9 != 0) {
                    p479o0o00.OooO0O0 oooO0O111119 = p479o0o00.OooO0O0.f40692OooO00o;
                    i12 = i4;
                    function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                } else {
                    i12 = i4;
                    function5 = function2;
                }
            } else {
                if (i13 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if ((i3 & 4) != 0) {
                    oooOOO = (OooOOO) ooo00oOooOOo.OooOO0o(OooOOOO.f2586OooO00o);
                    Intrinsics.checkNotNullParameter(oooOOO, "<this>");
                    if (oooOOO.OooO0oO()) {
                        jOooO0o = oooOOO.OooO0Oo();
                    } else {
                        jOooO0o = oooOOO.OooO0o();
                    }
                    i4 &= -897;
                } else {
                    jOooO0o = j;
                }
                if ((i3 & 8) != 0) {
                    jOooO00o = OooOOOO.OooO00o(jOooO0o, ooo00oOooOOo);
                    i4 &= -7169;
                } else {
                    jOooO00o = j3;
                }
                if (i5 != 0) {
                    OooOo oooOo1111111 = OooOo.f40725OooO00o;
                    f3 = OooOo.f40729OooO0o0;
                } else {
                    f3 = f2;
                }
                if (i7 != 0) {
                    function3OooO00o = o00O0000.OooO00o(ooo00oOooOOo, -291864008, new OooO00o(i));
                } else {
                    function3OooO00o = function4;
                }
                if (i9 != 0) {
                    p479o0o00.OooO0O0 oooO0O1111110 = p479o0o00.OooO0O0.f40692OooO00o;
                    i12 = i4;
                    function5 = p479o0o00.OooO0O0.f40693OooO0O0;
                } else {
                    i12 = i4;
                    function5 = function2;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111110 = oo0o0O0.f29705OooO00o;
            o00000O.OooO00o(o00oooo2, null, jOooO0o, jOooO00o, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1542367151, new OooO0O0(f3, tabs, function5, i, function3OooO00o, i12)), ooo00oOooOOo, ((i12 >> 3) & 14) | 1572864 | (i12 & 896) | (i12 & 7168), 50);
            Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function11111111 = function3OooO00o;
            function6 = function5;
            o00oooo3 = o00oooo2;
            j4 = jOooO0o;
            j5 = jOooO00o;
            f4 = f3;
            function7 = function11111111;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(i, o00oooo3, j4, j5, f4, function7, function6, tabs, i2, i3));
    }
}
