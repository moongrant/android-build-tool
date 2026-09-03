package p571o0oOo0o;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.framework.view.marqueeText.MarqueeText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.o00O0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0 {

    public static final class OooO00o extends Lambda implements Function1<Context, MarqueeText> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f45547Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MarqueeText invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            MarqueeText marqueeText = new MarqueeText(it);
            marqueeText.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            marqueeText.setMarqueeRepeatLimit(-1);
            marqueeText.setSingleLine(true);
            return marqueeText;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<MarqueeText, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f45548Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f45549Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f45550Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f45551Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, long j, long j2, boolean z) {
            super(1);
            this.f45549Oooo0o = str;
            this.f45550Oooo0oO = j;
            this.f45551Oooo0oo = j2;
            this.f45548Oooo = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MarqueeText marqueeText) {
            MarqueeText it = marqueeText;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setText(this.f45549Oooo0o);
            it.setTextColor(o00000OO.OooO0oO(this.f45550Oooo0oO));
            it.setTextSize(o00O0O.OooO0OO(this.f45551Oooo0oo));
            if (this.f45548Oooo) {
                it.getPaint().setFakeBoldText(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f45552Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f45553Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f45554Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f45555Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f45556OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f45557OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f45558OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, long j, long j2, o00OOOO0 o00oooo1, boolean z, int i, int i2) {
            super(2);
            this.f45553Oooo0o = str;
            this.f45554Oooo0oO = j;
            this.f45555Oooo0oo = j2;
            this.f45552Oooo = o00oooo1;
            this.f45557OoooO00 = z;
            this.f45556OoooO0 = i;
            this.f45558OoooO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O0O0.OooO00o(this.f45553Oooo0o, this.f45554Oooo0oO, this.f45555Oooo0oo, this.f45552Oooo, this.f45557OoooO00, ooo00o, this.f45556OoooO0 | 1, this.f45558OoooO0O);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8 A[LOOP:0: B:70:0x00e6->B:71:0x00e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull String text, long j, long j2, @Nullable o00OOOO0 o00oooo1, boolean z, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        long j3;
        int i4;
        o00OOOO0 o00oooo2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        Object[] objArr;
        boolean zOooo0oo;
        Object objOooO0o;
        o00OOOO0 o00oooo3;
        boolean z3;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(text, "text");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(2101905018);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= ooo00oOooOOo.OooOO0(j) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 896) == 0) {
                j3 = j2;
                i3 |= ooo00oOooOOo.OooOO0(j3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    o00oooo2 = o00oooo1;
                    if (ooo00oOooOOo.Oooo0oo(o00oooo2)) {
                        i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        z2 = z;
                        if (ooo00oOooOOo.OooO0OO(z2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((46811 & i8) == 9362 || !ooo00oOooOOo.OooOo0()) {
                        if (i10 != 0) {
                            o00O0O.OooO00o oooO00o = o00O0O.f27323OooO0O0;
                            j3 = o00O0O.f27325OooO0Oo;
                        }
                        if (i4 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                        OooO00o oooO00o2 = OooO00o.f45547Oooo0o;
                        objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                        ooo00oOooOOo.OooO0o0(-568225417);
                        zOooo0oo = false;
                        for (i9 = 0; i9 < 4; i9++) {
                            zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                        }
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                            OooO0O0 oooO0O0 = new OooO0O0(text, j, j3, z2);
                            ooo00oOooOOo.Oooo00o(oooO0O0);
                            objOooO0o = oooO0O0;
                        }
                        ooo00oOooOOo.Oooo0o0();
                        AndroidView_androidKt.OooO00o(oooO00o2, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
                        o00oooo3 = o00oooo2;
                        z3 = z2;
                        j3 = j3;
                    } else {
                        ooo00oOooOOo.OooOoo0();
                        o00oooo3 = o00oooo2;
                        z3 = z2;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(text, j, j3, o00oooo3, z3, i, i2));
                }
                i3 |= 24576;
                z2 = z;
                i8 = i3;
                if ((46811 & i8) == 9362) {
                    if (i10 != 0) {
                        o00O0O.OooO00o oooO00o3 = o00O0O.f27323OooO0O0;
                        j3 = o00O0O.f27325OooO0Oo;
                    }
                    if (i4 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
                    OooO00o oooO00o4 = OooO00o.f45547Oooo0o;
                    objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                    ooo00oOooOOo.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i9 < 4) {
                        zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                    }
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        OooO0O0 oooO0O1 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O1);
                        objOooO0o = oooO0O1;
                    } else {
                        OooO0O0 oooO0O2 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O2);
                        objOooO0o = oooO0O2;
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o(oooO00o4, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function6 = oo0o0O0.f29705OooO00o;
                    o00oooo3 = o00oooo2;
                    z3 = z2;
                    j3 = j3;
                } else {
                    if (i10 != 0) {
                        o00O0O.OooO00o oooO00o5 = o00O0O.f27323OooO0O0;
                        j3 = o00O0O.f27325OooO0Oo;
                    }
                    if (i4 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function7 = oo0o0O0.f29705OooO00o;
                    OooO00o oooO00o6 = OooO00o.f45547Oooo0o;
                    objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                    ooo00oOooOOo.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i9 < 4) {
                        zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                    }
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        OooO0O0 oooO0O3 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O3);
                        objOooO0o = oooO0O3;
                    } else {
                        OooO0O0 oooO0O4 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O4);
                        objOooO0o = oooO0O4;
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o(oooO00o6, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function8 = oo0o0O0.f29705OooO00o;
                    o00oooo3 = o00oooo2;
                    z3 = z2;
                    j3 = j3;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(text, j, j3, o00oooo3, z3, i, i2));
            }
            i3 |= 3072;
            o00oooo2 = o00oooo1;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (ooo00oOooOOo.OooO0OO(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((46811 & i8) == 9362) {
                    if (i10 != 0) {
                        o00O0O.OooO00o oooO00o7 = o00O0O.f27323OooO0O0;
                        j3 = o00O0O.f27325OooO0Oo;
                    }
                    if (i4 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function9 = oo0o0O0.f29705OooO00o;
                    OooO00o oooO00o8 = OooO00o.f45547Oooo0o;
                    objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                    ooo00oOooOOo.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i9 < 4) {
                        zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                    }
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        OooO0O0 oooO0O5 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O5);
                        objOooO0o = oooO0O5;
                    } else {
                        OooO0O0 oooO0O6 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O6);
                        objOooO0o = oooO0O6;
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o(oooO00o8, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function10 = oo0o0O0.f29705OooO00o;
                    o00oooo3 = o00oooo2;
                    z3 = z2;
                    j3 = j3;
                } else {
                    if (i10 != 0) {
                        o00O0O.OooO00o oooO00o9 = o00O0O.f27323OooO0O0;
                        j3 = o00O0O.f27325OooO0Oo;
                    }
                    if (i4 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11 = oo0o0O0.f29705OooO00o;
                    OooO00o oooO00o10 = OooO00o.f45547Oooo0o;
                    objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                    ooo00oOooOOo.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i9 < 4) {
                        zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                    }
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        OooO0O0 oooO0O7 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O7);
                        objOooO0o = oooO0O7;
                    } else {
                        OooO0O0 oooO0O8 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O8);
                        objOooO0o = oooO0O8;
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o(oooO00o10, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function12 = oo0o0O0.f29705OooO00o;
                    o00oooo3 = o00oooo2;
                    z3 = z2;
                    j3 = j3;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(text, j, j3, o00oooo3, z3, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            i8 = i3;
            if ((46811 & i8) == 9362) {
                if (i10 != 0) {
                    o00O0O.OooO00o oooO00o11 = o00O0O.f27323OooO0O0;
                    j3 = o00O0O.f27325OooO0Oo;
                }
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function13 = oo0o0O0.f29705OooO00o;
                OooO00o oooO00o12 = OooO00o.f45547Oooo0o;
                objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                ooo00oOooOOo.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i9 < 4) {
                    zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                }
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    OooO0O0 oooO0O9 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O9);
                    objOooO0o = oooO0O9;
                } else {
                    OooO0O0 oooO0O10 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O10);
                    objOooO0o = oooO0O10;
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o(oooO00o12, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function14 = oo0o0O0.f29705OooO00o;
                o00oooo3 = o00oooo2;
                z3 = z2;
                j3 = j3;
            } else {
                if (i10 != 0) {
                    o00O0O.OooO00o oooO00o13 = o00O0O.f27323OooO0O0;
                    j3 = o00O0O.f27325OooO0Oo;
                }
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function15 = oo0o0O0.f29705OooO00o;
                OooO00o oooO00o14 = OooO00o.f45547Oooo0o;
                objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                ooo00oOooOOo.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i9 < 4) {
                    zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                }
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    OooO0O0 oooO0O11 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O11);
                    objOooO0o = oooO0O11;
                } else {
                    OooO0O0 oooO0O12 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O12);
                    objOooO0o = oooO0O12;
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o(oooO00o14, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function16 = oo0o0O0.f29705OooO00o;
                o00oooo3 = o00oooo2;
                z3 = z2;
                j3 = j3;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(text, j, j3, o00oooo3, z3, i, i2));
        }
        i3 |= 384;
        j3 = j2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                o00oooo2 = o00oooo1;
                if (ooo00oOooOOo.Oooo0oo(o00oooo2)) {
                    i5 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (ooo00oOooOOo.OooO0OO(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((46811 & i8) == 9362) {
                    if (i10 != 0) {
                        o00O0O.OooO00o oooO00o15 = o00O0O.f27323OooO0O0;
                        j3 = o00O0O.f27325OooO0Oo;
                    }
                    if (i4 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function17 = oo0o0O0.f29705OooO00o;
                    OooO00o oooO00o16 = OooO00o.f45547Oooo0o;
                    objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                    ooo00oOooOOo.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i9 < 4) {
                        zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                    }
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        OooO0O0 oooO0O13 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O13);
                        objOooO0o = oooO0O13;
                    } else {
                        OooO0O0 oooO0O14 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O14);
                        objOooO0o = oooO0O14;
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o(oooO00o16, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function18 = oo0o0O0.f29705OooO00o;
                    o00oooo3 = o00oooo2;
                    z3 = z2;
                    j3 = j3;
                } else {
                    if (i10 != 0) {
                        o00O0O.OooO00o oooO00o17 = o00O0O.f27323OooO0O0;
                        j3 = o00O0O.f27325OooO0Oo;
                    }
                    if (i4 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function19 = oo0o0O0.f29705OooO00o;
                    OooO00o oooO00o18 = OooO00o.f45547Oooo0o;
                    objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                    ooo00oOooOOo.OooO0o0(-568225417);
                    zOooo0oo = false;
                    while (i9 < 4) {
                        zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                    }
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        OooO0O0 oooO0O15 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O15);
                        objOooO0o = oooO0O15;
                    } else {
                        OooO0O0 oooO0O16 = new OooO0O0(text, j, j3, z2);
                        ooo00oOooOOo.Oooo00o(oooO0O16);
                        objOooO0o = oooO0O16;
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o(oooO00o18, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function110 = oo0o0O0.f29705OooO00o;
                    o00oooo3 = o00oooo2;
                    z3 = z2;
                    j3 = j3;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(text, j, j3, o00oooo3, z3, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            i8 = i3;
            if ((46811 & i8) == 9362) {
                if (i10 != 0) {
                    o00O0O.OooO00o oooO00o19 = o00O0O.f27323OooO0O0;
                    j3 = o00O0O.f27325OooO0Oo;
                }
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111 = oo0o0O0.f29705OooO00o;
                OooO00o oooO00o110 = OooO00o.f45547Oooo0o;
                objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                ooo00oOooOOo.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i9 < 4) {
                    zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                }
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    OooO0O0 oooO0O17 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O17);
                    objOooO0o = oooO0O17;
                } else {
                    OooO0O0 oooO0O18 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O18);
                    objOooO0o = oooO0O18;
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o(oooO00o110, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function112 = oo0o0O0.f29705OooO00o;
                o00oooo3 = o00oooo2;
                z3 = z2;
                j3 = j3;
            } else {
                if (i10 != 0) {
                    o00O0O.OooO00o oooO00o111 = o00O0O.f27323OooO0O0;
                    j3 = o00O0O.f27325OooO0Oo;
                }
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function113 = oo0o0O0.f29705OooO00o;
                OooO00o oooO00o112 = OooO00o.f45547Oooo0o;
                objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                ooo00oOooOOo.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i9 < 4) {
                    zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                }
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    OooO0O0 oooO0O19 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O19);
                    objOooO0o = oooO0O19;
                } else {
                    OooO0O0 oooO0O110 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O110);
                    objOooO0o = oooO0O110;
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o(oooO00o112, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function114 = oo0o0O0.f29705OooO00o;
                o00oooo3 = o00oooo2;
                z3 = z2;
                j3 = j3;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(text, j, j3, o00oooo3, z3, i, i2));
        }
        i3 |= 3072;
        o00oooo2 = o00oooo1;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                z2 = z;
                if (ooo00oOooOOo.OooO0OO(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((46811 & i8) == 9362) {
                if (i10 != 0) {
                    o00O0O.OooO00o oooO00o113 = o00O0O.f27323OooO0O0;
                    j3 = o00O0O.f27325OooO0Oo;
                }
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function115 = oo0o0O0.f29705OooO00o;
                OooO00o oooO00o114 = OooO00o.f45547Oooo0o;
                objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                ooo00oOooOOo.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i9 < 4) {
                    zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                }
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    OooO0O0 oooO0O111 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O111);
                    objOooO0o = oooO0O111;
                } else {
                    OooO0O0 oooO0O112 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O112);
                    objOooO0o = oooO0O112;
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o(oooO00o114, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function116 = oo0o0O0.f29705OooO00o;
                o00oooo3 = o00oooo2;
                z3 = z2;
                j3 = j3;
            } else {
                if (i10 != 0) {
                    o00O0O.OooO00o oooO00o115 = o00O0O.f27323OooO0O0;
                    j3 = o00O0O.f27325OooO0Oo;
                }
                if (i4 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function117 = oo0o0O0.f29705OooO00o;
                OooO00o oooO00o116 = OooO00o.f45547Oooo0o;
                objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
                ooo00oOooOOo.OooO0o0(-568225417);
                zOooo0oo = false;
                while (i9 < 4) {
                    zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
                }
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    OooO0O0 oooO0O113 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O113);
                    objOooO0o = oooO0O113;
                } else {
                    OooO0O0 oooO0O114 = new OooO0O0(text, j, j3, z2);
                    ooo00oOooOOo.Oooo00o(oooO0O114);
                    objOooO0o = oooO0O114;
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o(oooO00o116, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function118 = oo0o0O0.f29705OooO00o;
                o00oooo3 = o00oooo2;
                z3 = z2;
                j3 = j3;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(text, j, j3, o00oooo3, z3, i, i2));
        }
        i3 |= 24576;
        z2 = z;
        i8 = i3;
        if ((46811 & i8) == 9362) {
            if (i10 != 0) {
                o00O0O.OooO00o oooO00o117 = o00O0O.f27323OooO0O0;
                j3 = o00O0O.f27325OooO0Oo;
            }
            if (i4 != 0) {
                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            if (i6 != 0) {
                z2 = false;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function119 = oo0o0O0.f29705OooO00o;
            OooO00o oooO00o118 = OooO00o.f45547Oooo0o;
            objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
            ooo00oOooOOo.OooO0o0(-568225417);
            zOooo0oo = false;
            while (i9 < 4) {
                zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
            }
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                OooO0O0 oooO0O115 = new OooO0O0(text, j, j3, z2);
                ooo00oOooOOo.Oooo00o(oooO0O115);
                objOooO0o = oooO0O115;
            } else {
                OooO0O0 oooO0O116 = new OooO0O0(text, j, j3, z2);
                ooo00oOooOOo.Oooo00o(oooO0O116);
                objOooO0o = oooO0O116;
            }
            ooo00oOooOOo.Oooo0o0();
            AndroidView_androidKt.OooO00o(oooO00o118, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1110 = oo0o0O0.f29705OooO00o;
            o00oooo3 = o00oooo2;
            z3 = z2;
            j3 = j3;
        } else {
            if (i10 != 0) {
                o00O0O.OooO00o oooO00o119 = o00O0O.f27323OooO0O0;
                j3 = o00O0O.f27325OooO0Oo;
            }
            if (i4 != 0) {
                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            if (i6 != 0) {
                z2 = false;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111 = oo0o0O0.f29705OooO00o;
            OooO00o oooO00o1110 = OooO00o.f45547Oooo0o;
            objArr = new Object[]{text, new o00000O0(j), new o00O0O(j3), Boolean.valueOf(z2)};
            ooo00oOooOOo.OooO0o0(-568225417);
            zOooo0oo = false;
            while (i9 < 4) {
                zOooo0oo |= ooo00oOooOOo.Oooo0oo(objArr[i9]);
            }
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                OooO0O0 oooO0O117 = new OooO0O0(text, j, j3, z2);
                ooo00oOooOOo.Oooo00o(oooO0O117);
                objOooO0o = oooO0O117;
            } else {
                OooO0O0 oooO0O118 = new OooO0O0(text, j, j3, z2);
                ooo00oOooOOo.Oooo00o(oooO0O118);
                objOooO0o = oooO0O118;
            }
            ooo00oOooOOo.Oooo0o0();
            AndroidView_androidKt.OooO00o(oooO00o1110, o00oooo2, (Function1) objOooO0o, ooo00oOooOOo, ((i8 >> 6) & 112) | 6, 0);
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1112 = oo0o0O0.f29705OooO00o;
            o00oooo3 = o00oooo2;
            z3 = z2;
            j3 = j3;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(text, j, j3, o00oooo3, z3, i, i2));
    }
}
