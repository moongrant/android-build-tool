package p510o0o00oo0;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.common.ui.view.SVGAPlayState;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0O {

    public static final class OooO00o extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f41996Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f41997Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, Function0<Unit> function0) {
            super(1);
            this.f41996Oooo0o = i;
            this.f41997Oooo0oO = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            SVGAView sVGAView = new SVGAView(it, null, 0, 6, null);
            int i = this.f41996Oooo0o;
            sVGAView.setCallback(new o0O00oO0(this.f41997Oooo0oO));
            sVGAView.setLoops(i);
            return sVGAView;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<SVGAView, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f41998Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f41999Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f42000Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f42001Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, String str, LifecycleOwner lifecycleOwner, boolean z) {
            super(1);
            this.f41999Oooo0o = i;
            this.f42000Oooo0oO = str;
            this.f42001Oooo0oo = lifecycleOwner;
            this.f41998Oooo = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SVGAView sVGAView) {
            SVGAView it = sVGAView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setLoops(this.f41999Oooo0o);
            if (StringsKt.isBlank(this.f42000Oooo0oO)) {
                it.OooOO0(true);
            } else if (!Intrinsics.areEqual(this.f42000Oooo0oO, it.getCurrentAnim())) {
                it.OooO0oo(this.f42000Oooo0oO, this.f42001Oooo0oo);
                if (this.f41998Oooo) {
                    it.OooO();
                }
            } else if (!this.f41998Oooo) {
                SVGAPlayState playState = it.getPlayState();
                SVGAPlayState sVGAPlayState = SVGAPlayState.Pause;
                if (playState != sVGAPlayState) {
                    it.OooO0O0();
                    if (it.playState != sVGAPlayState) {
                        it.playState = sVGAPlayState;
                    }
                }
            } else if (it.getPlayState() != SVGAPlayState.Playing) {
                it.OooO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f42002Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f42003Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f42004Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f42005Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f42006OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f42007OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f42008OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, boolean z, int i, Function0<Unit> function0, o00OOOO0 o00oooo1, int i2, int i3) {
            super(2);
            this.f42003Oooo0o = str;
            this.f42004Oooo0oO = z;
            this.f42005Oooo0oo = i;
            this.f42002Oooo = function0;
            this.f42007OoooO00 = o00oooo1;
            this.f42006OoooO0 = i2;
            this.f42008OoooO0O = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O0O0O.OooO00o(this.f42003Oooo0o, this.f42004Oooo0oO, this.f42005Oooo0oo, this.f42002Oooo, this.f42007OoooO00, ooo00o, this.f42006OoooO0 | 1, this.f42008OoooO0O);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull String anim, boolean z, int i, @Nullable Function0<Unit> function0, @Nullable o00OOOO0 o00oooo1, @Nullable oOO00O ooo00o, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Function0<Unit> function1;
        int i7;
        int i8;
        o00OOOO0 o00oooo2;
        int i9;
        int i10;
        Function0<Unit> function2;
        o00OOOO0 o00oooo3;
        boolean zOooo0oo;
        Object objOooO0o;
        int i11;
        Function0<Unit> function3;
        o00OOOO0 o00oooo4;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(anim, "anim");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-749599292);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (ooo00oOooOOo.Oooo0oo(anim) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= ooo00oOooOOo.OooO0OO(z) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 == 0) {
            if ((i2 & 896) == 0) {
                i5 = i;
                i4 |= ooo00oOooOOo.OooO(i5) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    function1 = function0;
                    if (ooo00oOooOOo.Oooo0oo(function1)) {
                        i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i7 = 1024;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((57344 & i2) == 0) {
                        o00oooo2 = o00oooo1;
                        if (ooo00oOooOOo.Oooo0oo(o00oooo2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i4 |= i9;
                    }
                    if ((46811 & i4) == 9362 || !ooo00oOooOOo.OooOo0()) {
                        if (i12 != 0) {
                            i10 = 0;
                        } else {
                            i10 = i5;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo3 = o00oooo2;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                        Integer numValueOf = Integer.valueOf(i10);
                        int i13 = i4 >> 9;
                        ooo00oOooOOo.OooO0o0(511388516);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                            objOooO0o = new OooO00o(i10, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner, z), ooo00oOooOOo, i13 & 112, 0);
                        i11 = i10;
                        function3 = function2;
                        o00oooo4 = o00oooo3;
                    } else {
                        ooo00oOooOOo.OooOoo0();
                        i11 = i5;
                        function3 = function1;
                        o00oooo4 = o00oooo2;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0OO(anim, z, i11, function3, o00oooo4, i2, i3));
                }
                i4 |= 24576;
                o00oooo2 = o00oooo1;
                if ((46811 & i4) == 9362) {
                    if (i12 != 0) {
                        i10 = 0;
                    } else {
                        i10 = i5;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                    Integer numValueOf2 = Integer.valueOf(i10);
                    int i14 = i4 >> 9;
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf2) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner2, z), ooo00oOooOOo, i14 & 112, 0);
                    i11 = i10;
                    function3 = function2;
                    o00oooo4 = o00oooo3;
                } else {
                    if (i12 != 0) {
                        i10 = 0;
                    } else {
                        i10 = i5;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function6 = oo0o0O0.f29705OooO00o;
                    LifecycleOwner lifecycleOwner3 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                    Integer numValueOf3 = Integer.valueOf(i10);
                    int i15 = i4 >> 9;
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf3) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner3, z), ooo00oOooOOo, i15 & 112, 0);
                    i11 = i10;
                    function3 = function2;
                    o00oooo4 = o00oooo3;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(anim, z, i11, function3, o00oooo4, i2, i3));
            }
            i4 |= 3072;
            function1 = function0;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((57344 & i2) == 0) {
                    o00oooo2 = o00oooo1;
                    if (ooo00oOooOOo.Oooo0oo(o00oooo2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                if ((46811 & i4) == 9362) {
                    if (i12 != 0) {
                        i10 = 0;
                    } else {
                        i10 = i5;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function7 = oo0o0O0.f29705OooO00o;
                    LifecycleOwner lifecycleOwner4 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                    Integer numValueOf4 = Integer.valueOf(i10);
                    int i16 = i4 >> 9;
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf4) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner4, z), ooo00oOooOOo, i16 & 112, 0);
                    i11 = i10;
                    function3 = function2;
                    o00oooo4 = o00oooo3;
                } else {
                    if (i12 != 0) {
                        i10 = 0;
                    } else {
                        i10 = i5;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function8 = oo0o0O0.f29705OooO00o;
                    LifecycleOwner lifecycleOwner5 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                    Integer numValueOf5 = Integer.valueOf(i10);
                    int i17 = i4 >> 9;
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf5) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner5, z), ooo00oOooOOo, i17 & 112, 0);
                    i11 = i10;
                    function3 = function2;
                    o00oooo4 = o00oooo3;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(anim, z, i11, function3, o00oooo4, i2, i3));
            }
            i4 |= 24576;
            o00oooo2 = o00oooo1;
            if ((46811 & i4) == 9362) {
                if (i12 != 0) {
                    i10 = 0;
                } else {
                    i10 = i5;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function9 = oo0o0O0.f29705OooO00o;
                LifecycleOwner lifecycleOwner6 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                Integer numValueOf6 = Integer.valueOf(i10);
                int i18 = i4 >> 9;
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf6) | ooo00oOooOOo.Oooo0oo(function2);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner6, z), ooo00oOooOOo, i18 & 112, 0);
                i11 = i10;
                function3 = function2;
                o00oooo4 = o00oooo3;
            } else {
                if (i12 != 0) {
                    i10 = 0;
                } else {
                    i10 = i5;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function10 = oo0o0O0.f29705OooO00o;
                LifecycleOwner lifecycleOwner7 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                Integer numValueOf7 = Integer.valueOf(i10);
                int i19 = i4 >> 9;
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf7) | ooo00oOooOOo.Oooo0oo(function2);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner7, z), ooo00oOooOOo, i19 & 112, 0);
                i11 = i10;
                function3 = function2;
                o00oooo4 = o00oooo3;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(anim, z, i11, function3, o00oooo4, i2, i3));
        }
        i4 |= 384;
        i5 = i;
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 7168) == 0) {
                function1 = function0;
                if (ooo00oOooOOo.Oooo0oo(function1)) {
                    i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((57344 & i2) == 0) {
                    o00oooo2 = o00oooo1;
                    if (ooo00oOooOOo.Oooo0oo(o00oooo2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                if ((46811 & i4) == 9362) {
                    if (i12 != 0) {
                        i10 = 0;
                    } else {
                        i10 = i5;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11 = oo0o0O0.f29705OooO00o;
                    LifecycleOwner lifecycleOwner8 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                    Integer numValueOf8 = Integer.valueOf(i10);
                    int i110 = i4 >> 9;
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf8) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner8, z), ooo00oOooOOo, i110 & 112, 0);
                    i11 = i10;
                    function3 = function2;
                    o00oooo4 = o00oooo3;
                } else {
                    if (i12 != 0) {
                        i10 = 0;
                    } else {
                        i10 = i5;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function12 = oo0o0O0.f29705OooO00o;
                    LifecycleOwner lifecycleOwner9 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                    Integer numValueOf9 = Integer.valueOf(i10);
                    int i111 = i4 >> 9;
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf9) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(i10, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner9, z), ooo00oOooOOo, i111 & 112, 0);
                    i11 = i10;
                    function3 = function2;
                    o00oooo4 = o00oooo3;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0OO(anim, z, i11, function3, o00oooo4, i2, i3));
            }
            i4 |= 24576;
            o00oooo2 = o00oooo1;
            if ((46811 & i4) == 9362) {
                if (i12 != 0) {
                    i10 = 0;
                } else {
                    i10 = i5;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function13 = oo0o0O0.f29705OooO00o;
                LifecycleOwner lifecycleOwner10 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                Integer numValueOf10 = Integer.valueOf(i10);
                int i112 = i4 >> 9;
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf10) | ooo00oOooOOo.Oooo0oo(function2);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner10, z), ooo00oOooOOo, i112 & 112, 0);
                i11 = i10;
                function3 = function2;
                o00oooo4 = o00oooo3;
            } else {
                if (i12 != 0) {
                    i10 = 0;
                } else {
                    i10 = i5;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function14 = oo0o0O0.f29705OooO00o;
                LifecycleOwner lifecycleOwner11 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                Integer numValueOf11 = Integer.valueOf(i10);
                int i113 = i4 >> 9;
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf11) | ooo00oOooOOo.Oooo0oo(function2);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner11, z), ooo00oOooOOo, i113 & 112, 0);
                i11 = i10;
                function3 = function2;
                o00oooo4 = o00oooo3;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(anim, z, i11, function3, o00oooo4, i2, i3));
        }
        i4 |= 3072;
        function1 = function0;
        i8 = i3 & 16;
        if (i8 != 0) {
            if ((57344 & i2) == 0) {
                o00oooo2 = o00oooo1;
                if (ooo00oOooOOo.Oooo0oo(o00oooo2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            }
            if ((46811 & i4) == 9362) {
                if (i12 != 0) {
                    i10 = 0;
                } else {
                    i10 = i5;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function15 = oo0o0O0.f29705OooO00o;
                LifecycleOwner lifecycleOwner12 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                Integer numValueOf12 = Integer.valueOf(i10);
                int i114 = i4 >> 9;
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf12) | ooo00oOooOOo.Oooo0oo(function2);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner12, z), ooo00oOooOOo, i114 & 112, 0);
                i11 = i10;
                function3 = function2;
                o00oooo4 = o00oooo3;
            } else {
                if (i12 != 0) {
                    i10 = 0;
                } else {
                    i10 = i5;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function16 = oo0o0O0.f29705OooO00o;
                LifecycleOwner lifecycleOwner13 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
                Integer numValueOf13 = Integer.valueOf(i10);
                int i115 = i4 >> 9;
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf13) | ooo00oOooOOo.Oooo0oo(function2);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(i10, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner13, z), ooo00oOooOOo, i115 & 112, 0);
                i11 = i10;
                function3 = function2;
                o00oooo4 = o00oooo3;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(anim, z, i11, function3, o00oooo4, i2, i3));
        }
        i4 |= 24576;
        o00oooo2 = o00oooo1;
        if ((46811 & i4) == 9362) {
            if (i12 != 0) {
                i10 = 0;
            } else {
                i10 = i5;
            }
            if (i6 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (i8 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function17 = oo0o0O0.f29705OooO00o;
            LifecycleOwner lifecycleOwner14 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            Integer numValueOf14 = Integer.valueOf(i10);
            int i116 = i4 >> 9;
            ooo00oOooOOo.OooO0o0(511388516);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf14) | ooo00oOooOOo.Oooo0oo(function2);
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO00o(i10, function2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO00o(i10, function2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner14, z), ooo00oOooOOo, i116 & 112, 0);
            i11 = i10;
            function3 = function2;
            o00oooo4 = o00oooo3;
        } else {
            if (i12 != 0) {
                i10 = 0;
            } else {
                i10 = i5;
            }
            if (i6 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (i8 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function18 = oo0o0O0.f29705OooO00o;
            LifecycleOwner lifecycleOwner15 = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            Integer numValueOf15 = Integer.valueOf(i10);
            int i117 = i4 >> 9;
            ooo00oOooOOo.OooO0o0(511388516);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf15) | ooo00oOooOOo.Oooo0oo(function2);
            objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO00o(i10, function2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO00o(i10, function2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            AndroidView_androidKt.OooO00o((Function1) objOooO0o, o00oooo3, new OooO0O0(i10, anim, lifecycleOwner15, z), ooo00oOooOOo, i117 & 112, 0);
            i11 = i10;
            function3 = function2;
            o00oooo4 = o00oooo3;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(anim, z, i11, function3, o00oooo4, i2, i3));
    }
}
