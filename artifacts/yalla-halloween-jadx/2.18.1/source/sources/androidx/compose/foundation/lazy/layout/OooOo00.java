package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000000O;
import o0O0O00.o000O;
import o0O0O00.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045OooooOo.o00O0O00;
import p045OooooOo.oo0o0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    public static final class OooO00o extends Lambda implements Function2<o000O, o0000O0O.OooO0O0, o000000O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f5813Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<OooOo, o0000O0O.OooO0O0, o000000O> f5814Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(OooOOO0 oooOOO0, Function2<? super OooOo, ? super o0000O0O.OooO0O0, ? extends o000000O> function2) {
            super(2);
            this.f5813Oooo0o = oooOOO0;
            this.f5814Oooo0oO = function2;
        }

        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, androidx.compose.foundation.lazy.layout.OooOOO0$OooO00o>] */
        @Override // kotlin.jvm.functions.Function2
        public final o000000O invoke(o000O o000o, o0000O0O.OooO0O0 oooO0O0) {
            o000O density = o000o;
            long j = oooO0O0.f27302OooO00o;
            Intrinsics.checkNotNullParameter(density, "$this$null");
            OooOOO0 oooOOO0 = this.f5813Oooo0o;
            Objects.requireNonNull(oooOOO0);
            Intrinsics.checkNotNullParameter(density, "density");
            if (!Intrinsics.areEqual(density, oooOOO0.f5804OooO0Oo) || !o0000O0O.OooO0O0.OooO0O0(j, oooOOO0.f5805OooO0o0)) {
                oooOOO0.f5804OooO0Oo = density;
                oooOOO0.f5805OooO0o0 = j;
                oooOOO0.f5803OooO0OO.clear();
            }
            return this.f5814Oooo0oO.invoke(new Oooo000(this.f5813Oooo0o, density), new o0000O0O.OooO0O0(j));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function2<OooOo, o0000O0O.OooO0O0, o000000O> f5815Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOOO f5816Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f5817Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0 f5818Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f5819OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f5820OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(OooOOO oooOOO, o00OOOO0 o00oooo1, Oooo0 oooo0, Function2<? super OooOo, ? super o0000O0O.OooO0O0, ? extends o000000O> function2, int i, int i2) {
            super(2);
            this.f5816Oooo0o = oooOOO;
            this.f5817Oooo0oO = o00oooo1;
            this.f5818Oooo0oo = oooo0;
            this.f5815Oooo = function2;
            this.f5820OoooO00 = i;
            this.f5819OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooOo00.OooO00o(this.f5816Oooo0o, this.f5817Oooo0oO, this.f5818Oooo0oo, this.f5815Oooo, ooo00o, this.f5820OoooO00 | 1, this.f5819OoooO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<OooOOO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<OooOOO> f5821Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(oO0Oo<? extends OooOOO> oo0oo) {
            super(0);
            this.f5821Oooo0o = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOOO invoke() {
            return this.f5821Oooo0o.getValue();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:75:0x012d  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull OooOOO itemProvider, @Nullable o00OOOO0 o00oooo1, @Nullable Oooo0 oooo0, @NotNull Function2<? super OooOo, ? super o0000O0O.OooO0O0, ? extends o000000O> measurePolicy, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        o00OOOO0 o00oooo2;
        Oooo0 oooo1;
        oO0Oo oo0ooOooO0o;
        o00O0O00 o00o0o00OooO00o;
        Object objOooO0o;
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o;
        OooOOO0 oooOOO0;
        Object objOooO0o2;
        o000O0O0 o000o0o1;
        boolean zOooo0oo;
        Object objOooO0o3;
        o00OOOO0 o00oooo3;
        Oooo0 oooo2;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(852831187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(itemProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                i3 |= ooo00oOooOOo.Oooo0oo(o00oooo1) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(oooo0)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(measurePolicy)) {
                        i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 5851) == 1170 || !ooo00oOooOOo.OooOo0()) {
                    if (i7 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    if (i4 != 0) {
                        oooo1 = null;
                    } else {
                        oooo1 = oooo0;
                    }
                    oo0ooOooO0o = o0OOO00.OooO0o(itemProvider, ooo00oOooOOo);
                    o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = new OooOOO0(o00o0o00OooO00o, new OooO0OO(oo0ooOooO0o));
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    oooOOO0 = (OooOOO0) objOooO0o;
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (objOooO0o2 == c0323OooO00o) {
                        objOooO0o2 = new o000O0O0(new OooOOOO(oooOOO0));
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o000o0o1 = (o000O0O0) objOooO0o2;
                    ooo00oOooOOo.OooO0o0(617316839);
                    if (oooo1 != null) {
                        o0OoOo0.OooO00o(oooo1, oooOOO0, o000o0o1, ooo00oOooOOo, ((i3 >> 6) & 14) | 64 | 512);
                        Unit unit = Unit.INSTANCE;
                    }
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOOO0) | ooo00oOooOOo.Oooo0oo(measurePolicy);
                    objOooO0o3 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo || objOooO0o3 == c0323OooO00o) {
                        objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    SubcomposeLayoutKt.OooO0O0(o000o0o1, o00oooo2, (Function2) objOooO0o3, ooo00oOooOOo, (i3 & 112) | 8, 0);
                    o00oooo3 = o00oooo2;
                    oooo2 = oooo1;
                } else {
                    ooo00oOooOOo.OooOoo0();
                    o00oooo3 = o00oooo1;
                    oooo2 = oooo0;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0O0(itemProvider, o00oooo3, oooo2, measurePolicy, i, i2));
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (ooo00oOooOOo.Oooo0oo(measurePolicy)) {
                    i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if (i4 != 0) {
                    oooo1 = null;
                } else {
                    oooo1 = oooo0;
                }
                oo0ooOooO0o = o0OOO00.OooO0o(itemProvider, ooo00oOooOOo);
                o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = new OooOOO0(o00o0o00OooO00o, new OooO0OO(oo0ooOooO0o));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oooOOO0 = (OooOOO0) objOooO0o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new o000O0O0(new OooOOOO(oooOOO0));
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o000o0o1 = (o000O0O0) objOooO0o2;
                ooo00oOooOOo.OooO0o0(617316839);
                if (oooo1 != null) {
                    o0OoOo0.OooO00o(oooo1, oooOOO0, o000o0o1, ooo00oOooOOo, ((i3 >> 6) & 14) | 64 | 512);
                    Unit unit2 = Unit.INSTANCE;
                }
                ooo00oOooOOo.Oooo0o0();
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOOO0) | ooo00oOooOOo.Oooo0oo(measurePolicy);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                SubcomposeLayoutKt.OooO0O0(o000o0o1, o00oooo2, (Function2) objOooO0o3, ooo00oOooOOo, (i3 & 112) | 8, 0);
                o00oooo3 = o00oooo2;
                oooo2 = oooo1;
            } else {
                if (i7 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if (i4 != 0) {
                    oooo1 = null;
                } else {
                    oooo1 = oooo0;
                }
                oo0ooOooO0o = o0OOO00.OooO0o(itemProvider, ooo00oOooOOo);
                o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = new OooOOO0(o00o0o00OooO00o, new OooO0OO(oo0ooOooO0o));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oooOOO0 = (OooOOO0) objOooO0o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new o000O0O0(new OooOOOO(oooOOO0));
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o000o0o1 = (o000O0O0) objOooO0o2;
                ooo00oOooOOo.OooO0o0(617316839);
                if (oooo1 != null) {
                    o0OoOo0.OooO00o(oooo1, oooOOO0, o000o0o1, ooo00oOooOOo, ((i3 >> 6) & 14) | 64 | 512);
                    Unit unit3 = Unit.INSTANCE;
                }
                ooo00oOooOOo.Oooo0o0();
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOOO0) | ooo00oOooOOo.Oooo0oo(measurePolicy);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                SubcomposeLayoutKt.OooO0O0(o000o0o1, o00oooo2, (Function2) objOooO0o3, ooo00oOooOOo, (i3 & 112) | 8, 0);
                o00oooo3 = o00oooo2;
                oooo2 = oooo1;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(itemProvider, o00oooo3, oooo2, measurePolicy, i, i2));
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (ooo00oOooOOo.Oooo0oo(oooo0)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (ooo00oOooOOo.Oooo0oo(measurePolicy)) {
                    i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if (i4 != 0) {
                    oooo1 = null;
                } else {
                    oooo1 = oooo0;
                }
                oo0ooOooO0o = o0OOO00.OooO0o(itemProvider, ooo00oOooOOo);
                o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = new OooOOO0(o00o0o00OooO00o, new OooO0OO(oo0ooOooO0o));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oooOOO0 = (OooOOO0) objOooO0o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new o000O0O0(new OooOOOO(oooOOO0));
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o000o0o1 = (o000O0O0) objOooO0o2;
                ooo00oOooOOo.OooO0o0(617316839);
                if (oooo1 != null) {
                    o0OoOo0.OooO00o(oooo1, oooOOO0, o000o0o1, ooo00oOooOOo, ((i3 >> 6) & 14) | 64 | 512);
                    Unit unit4 = Unit.INSTANCE;
                }
                ooo00oOooOOo.Oooo0o0();
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOOO0) | ooo00oOooOOo.Oooo0oo(measurePolicy);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                SubcomposeLayoutKt.OooO0O0(o000o0o1, o00oooo2, (Function2) objOooO0o3, ooo00oOooOOo, (i3 & 112) | 8, 0);
                o00oooo3 = o00oooo2;
                oooo2 = oooo1;
            } else {
                if (i7 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                if (i4 != 0) {
                    oooo1 = null;
                } else {
                    oooo1 = oooo0;
                }
                oo0ooOooO0o = o0OOO00.OooO0o(itemProvider, ooo00oOooOOo);
                o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = new OooOOO0(o00o0o00OooO00o, new OooO0OO(oo0ooOooO0o));
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                oooOOO0 = (OooOOO0) objOooO0o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new o000O0O0(new OooOOOO(oooOOO0));
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o000o0o1 = (o000O0O0) objOooO0o2;
                ooo00oOooOOo.OooO0o0(617316839);
                if (oooo1 != null) {
                    o0OoOo0.OooO00o(oooo1, oooOOO0, o000o0o1, ooo00oOooOOo, ((i3 >> 6) & 14) | 64 | 512);
                    Unit unit5 = Unit.INSTANCE;
                }
                ooo00oOooOOo.Oooo0o0();
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOOO0) | ooo00oOooOOo.Oooo0oo(measurePolicy);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                SubcomposeLayoutKt.OooO0O0(o000o0o1, o00oooo2, (Function2) objOooO0o3, ooo00oOooOOo, (i3 & 112) | 8, 0);
                o00oooo3 = o00oooo2;
                oooo2 = oooo1;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0O0(itemProvider, o00oooo3, oooo2, measurePolicy, i, i2));
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (ooo00oOooOOo.Oooo0oo(measurePolicy)) {
                i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170) {
            if (i7 != 0) {
                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo2 = o00oooo1;
            }
            if (i4 != 0) {
                oooo1 = null;
            } else {
                oooo1 = oooo0;
            }
            oo0ooOooO0o = o0OOO00.OooO0o(itemProvider, ooo00oOooOOo);
            o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(-492369756);
            objOooO0o = ooo00oOooOOo.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = new OooOOO0(o00o0o00OooO00o, new OooO0OO(oo0ooOooO0o));
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            oooOOO0 = (OooOOO0) objOooO0o;
            ooo00oOooOOo.OooO0o0(-492369756);
            objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new o000O0O0(new OooOOOO(oooOOO0));
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o000o0o1 = (o000O0O0) objOooO0o2;
            ooo00oOooOOo.OooO0o0(617316839);
            if (oooo1 != null) {
                o0OoOo0.OooO00o(oooo1, oooOOO0, o000o0o1, ooo00oOooOOo, ((i3 >> 6) & 14) | 64 | 512);
                Unit unit6 = Unit.INSTANCE;
            }
            ooo00oOooOOo.Oooo0o0();
            ooo00oOooOOo.OooO0o0(511388516);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOOO0) | ooo00oOooOOo.Oooo0oo(measurePolicy);
            objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            } else {
                objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            SubcomposeLayoutKt.OooO0O0(o000o0o1, o00oooo2, (Function2) objOooO0o3, ooo00oOooOOo, (i3 & 112) | 8, 0);
            o00oooo3 = o00oooo2;
            oooo2 = oooo1;
        } else {
            if (i7 != 0) {
                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo2 = o00oooo1;
            }
            if (i4 != 0) {
                oooo1 = null;
            } else {
                oooo1 = oooo0;
            }
            oo0ooOooO0o = o0OOO00.OooO0o(itemProvider, ooo00oOooOOo);
            o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(-492369756);
            objOooO0o = ooo00oOooOOo.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = new OooOOO0(o00o0o00OooO00o, new OooO0OO(oo0ooOooO0o));
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            oooOOO0 = (OooOOO0) objOooO0o;
            ooo00oOooOOo.OooO0o0(-492369756);
            objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new o000O0O0(new OooOOOO(oooOOO0));
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o000o0o1 = (o000O0O0) objOooO0o2;
            ooo00oOooOOo.OooO0o0(617316839);
            if (oooo1 != null) {
                o0OoOo0.OooO00o(oooo1, oooOOO0, o000o0o1, ooo00oOooOOo, ((i3 >> 6) & 14) | 64 | 512);
                Unit unit7 = Unit.INSTANCE;
            }
            ooo00oOooOOo.Oooo0o0();
            ooo00oOooOOo.OooO0o0(511388516);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOOO0) | ooo00oOooOOo.Oooo0oo(measurePolicy);
            objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            } else {
                objOooO0o3 = new OooO00o(oooOOO0, measurePolicy);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            SubcomposeLayoutKt.OooO0O0(o000o0o1, o00oooo2, (Function2) objOooO0o3, ooo00oOooOOo, (i3 & 112) | 8, 0);
            o00oooo3 = o00oooo2;
            oooo2 = oooo1;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(itemProvider, o00oooo3, oooo2, measurePolicy, i, i2));
    }
}
