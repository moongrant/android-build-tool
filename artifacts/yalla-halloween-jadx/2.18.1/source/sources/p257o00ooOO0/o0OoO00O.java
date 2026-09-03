package p257o00ooOO0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.FloatRange;
import androidx.annotation.StyleRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.platform.o0O0O00;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000OO0.o00O0O;
import o0000OO0.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o0000oo;
import p255o00ooO0o.o00O0OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoO00O {

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f34541Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(1);
            this.f34541Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0O00(this.f34541Oooo0o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f34542Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f34543Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f34544Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, o0O00OO<Boolean> o0o00oo2, Function0<Unit> function0) {
            super(0);
            this.f34542Oooo0o = z;
            this.f34543Oooo0oO = o0o00oo2;
            this.f34544Oooo0oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f34542Oooo0o) {
                this.f34543Oooo0oO.setValue(Boolean.FALSE);
                Function0<Unit> function0 = this.f34544Oooo0oo;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f34545Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f34546Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f34547Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f34548Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ float f34549OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2, int i3, float f) {
            super(2);
            this.f34546Oooo0o = function2;
            this.f34547Oooo0oO = i;
            this.f34548Oooo0oo = i2;
            this.f34545Oooo = i3;
            this.f34549OoooO00 = f;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            Window window;
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                View view = (View) ooo00o2.OooOO0o(o0O0O00.f6594OooO0o);
                ooo00o2.OooO0o0(1157296644);
                boolean zOooo0oo = ooo00o2.Oooo0oo(view);
                Object objOooO0o = ooo00o2.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    ViewParent parent = view.getParent();
                    Window window2 = null;
                    o00Oo0 o00oo1 = parent instanceof o00Oo0 ? (o00Oo0) parent : null;
                    if (o00oo1 == null || (window = o00oo1.getWindow()) == null) {
                        Context baseContext = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(baseContext, "currentView.context");
                        while (true) {
                            if (!(baseContext instanceof Activity)) {
                                if (!(baseContext instanceof ContextWrapper)) {
                                    break;
                                }
                                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                                Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
                            } else {
                                window2 = ((Activity) baseContext).getWindow();
                                break;
                            }
                        }
                        objOooO0o = window2;
                    } else {
                        objOooO0o = window;
                    }
                    ooo00o2.Oooo00o(objOooO0o);
                }
                ooo00o2.Oooo0o0();
                Window window3 = (Window) objOooO0o;
                if (window3 != null) {
                    int i = this.f34548Oooo0oo;
                    int i2 = this.f34545Oooo;
                    float f = this.f34549OoooO00;
                    window3.setGravity(i);
                    window3.setWindowAnimations(i2);
                    if (!(window3.getAttributes().dimAmount == f)) {
                        window3.setDimAmount(f);
                    }
                }
                o0000oo.OooO00o(ooo00o2, 0);
                this.f34546Oooo0o.invoke(ooo00o2, Integer.valueOf((this.f34547Oooo0oO >> 24) & 14));
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f34550Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f34551Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f34552Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f34553Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ float f34554OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f34555OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f34556OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f34557OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f34558OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ int f34559OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f34560o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(o0O00OO<Boolean> o0o00oo2, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function1, int i, int i2, float f, Function2<? super oOO00O, ? super Integer, Unit> function2, int i3, int i4) {
            super(2);
            this.f34551Oooo0o = o0o00oo2;
            this.f34552Oooo0oO = z;
            this.f34553Oooo0oo = z2;
            this.f34550Oooo = function0;
            this.f34556OoooO00 = function1;
            this.f34555OoooO0 = i;
            this.f34557OoooO0O = i2;
            this.f34554OoooO = f;
            this.f34558OoooOO0 = function2;
            this.f34560o000oOoO = i3;
            this.f34559OoooOOO = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0OoO00O.OooO00o(this.f34551Oooo0o, this.f34552Oooo0oO, this.f34553Oooo0oo, this.f34550Oooo, this.f34556OoooO00, this.f34555OoooO0, this.f34557OoooO0O, this.f34554OoooO, this.f34558OoooOO0, ooo00o, this.f34560o000oOoO | 1, this.f34559OoooOOO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:116:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0166  */
    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:120:0x016c  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:127:0x0177  */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0180  */
    /* JADX WARN: Code duplicated, block: B:134:0x0185  */
    /* JADX WARN: Code duplicated, block: B:135:0x018a  */
    /* JADX WARN: Code duplicated, block: B:137:0x018e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0192  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:153:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0205  */
    /* JADX WARN: Code duplicated, block: B:161:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull o0O00OO<Boolean> show, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, int i, @StyleRes int i2, @FloatRange(from = 0.0d, to = 1.0d) float f, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function2;
        int i9;
        int i10;
        Function0<Unit> function3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        boolean z4;
        Function0<Unit> function4;
        int i16;
        int i17;
        float f2;
        boolean z5;
        Function0<Unit> function5;
        float f3;
        boolean z6;
        Function0<Unit> function6;
        int i18;
        boolean zOooo0oo;
        Object objOooO0o;
        boolean zOooo0oo2;
        Object objOooO0o2;
        int i19;
        oo0ooO oo0oooOooOo;
        int i20;
        Intrinsics.checkNotNullParameter(show, "show");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1600703499);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (ooo00oOooOOo.Oooo0oo(show) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i21 = i4 & 2;
        if (i21 == 0) {
            if ((i3 & 112) == 0) {
                i5 |= ooo00oOooOOo.OooO0OO(z) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 896) == 0) {
                    if (ooo00oOooOOo.OooO0OO(z2)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 7168) == 0) {
                        function2 = function0;
                        if (ooo00oOooOOo.Oooo0oo(function2)) {
                            i9 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((57344 & i3) == 0) {
                            function3 = function1;
                            if (ooo00oOooOOo.Oooo0oo(function3)) {
                                i11 = 16384;
                            } else {
                                i11 = 8192;
                            }
                            i5 |= i11;
                        }
                        if ((458752 & i3) == 0) {
                            if ((i4 & 32) == 0) {
                                i12 = i;
                                int i22 = ooo00oOooOOo.OooO(i12) ? 131072 : 65536;
                                i5 |= i22;
                            } else {
                                i12 = i;
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        if ((i3 & 3670016) != 0) {
                            if ((i4 & 64) == 0 || !ooo00oOooOOo.OooO(i2)) {
                                i20 = 524288;
                            } else {
                                i20 = 1048576;
                            }
                            i5 |= i20;
                        }
                        i13 = i4 & 128;
                        if (i13 != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 29360128) == 0) {
                            if (ooo00oOooOOo.OooO0oO(f)) {
                                i14 = 8388608;
                            } else {
                                i14 = 4194304;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & 256) != 0) {
                            if ((234881024 & i3) == 0) {
                                if (ooo00oOooOOo.Oooo0oo(content)) {
                                    i15 = 67108864;
                                } else {
                                    i15 = 33554432;
                                }
                            }
                            if ((191739611 & i5) == 38347922 || !ooo00oOooOOo.OooOo0()) {
                                ooo00oOooOOo.OooOOo0();
                                if ((i3 & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                                    if (i21 != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = z;
                                    }
                                    if (i6 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = z2;
                                    }
                                    if (i8 != 0) {
                                        function2 = null;
                                    }
                                    function4 = i10 == 0 ? function3 : null;
                                    if ((i4 & 32) != 0) {
                                        i16 = 17;
                                        i5 &= -458753;
                                    } else {
                                        i16 = i12;
                                    }
                                    if ((i4 & 64) != 0) {
                                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                        i5 &= -3670017;
                                    } else {
                                        i17 = i2;
                                    }
                                    if (i13 != 0) {
                                        f2 = 0.3f;
                                    } else {
                                        f2 = f;
                                    }
                                } else {
                                    ooo00oOooOOo.OooOoo0();
                                    if ((i4 & 32) != 0) {
                                        i5 &= -458753;
                                    }
                                    if ((i4 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    z3 = z;
                                    z4 = z2;
                                    i17 = i2;
                                    f2 = f;
                                    function4 = function3;
                                    i16 = i12;
                                }
                                ooo00oOooOOo.Oooo0oO();
                                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function7 = oo0o0O0.f29705OooO00o;
                                if (show.getValue().booleanValue()) {
                                    Unit unit = Unit.INSTANCE;
                                    ooo00oOooOOo.OooO0o0(1157296644);
                                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                    objOooO0o = ooo00oOooOOo.OooO0o();
                                    if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                                        objOooO0o = new OooO00o(function4);
                                        ooo00oOooOOo.Oooo00o(objOooO0o);
                                    }
                                    ooo00oOooOOo.Oooo0o0();
                                    boolean z7 = false;
                                    o00Oo00.OooO0O0(unit, (Function1) objOooO0o, ooo00oOooOOo);
                                    Boolean boolValueOf = Boolean.valueOf(z3);
                                    ooo00oOooOOo.OooO0o0(1618982084);
                                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                                    if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                                        objOooO0o2 = new OooO0O0(z3, show, function2);
                                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                                    }
                                    ooo00oOooOOo.Oooo0o0();
                                    Function0 function8 = (Function0) objOooO0o2;
                                    if (z3 || !z4) {
                                        i19 = 4;
                                    } else {
                                        i19 = 4;
                                        z7 = true;
                                    }
                                    o0000OO0.OooO0OO.OooO00o(function8, new o00O0O(z3, z7, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                                }
                                z5 = z3;
                                function5 = function2;
                                int i23 = i16;
                                f3 = f2;
                                z6 = z4;
                                function6 = function4;
                                i18 = i23;
                            } else {
                                ooo00oOooOOo.OooOoo0();
                                z5 = z;
                                z6 = z2;
                                i17 = i2;
                                f3 = f;
                                function5 = function2;
                                function6 = function3;
                                i18 = i12;
                            }
                            oo0oooOooOo = ooo00oOooOOo.OooOo();
                            if (oo0oooOooOo == null) {
                                return;
                            }
                            oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                        }
                        i15 = 100663296;
                        i5 |= i15;
                        if ((191739611 & i5) == 38347922) {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function9 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit2 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z8 = false;
                                o00Oo00.OooO0O0(unit2, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf2 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf2) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function10 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function10, new o00O0O(z3, z8, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i24 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i24;
                        } else {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit3 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z9 = false;
                                o00Oo00.OooO0O0(unit3, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf3 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf3) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function12 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function12, new o00O0O(z3, z9, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i25 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i25;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                    }
                    i5 |= 24576;
                    function3 = function1;
                    if ((458752 & i3) == 0) {
                        if ((i4 & 32) == 0) {
                            i12 = i;
                            if (ooo00oOooOOo.OooO(i12)) {
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i5 |= i20;
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (ooo00oOooOOo.OooO0oO(f)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 256) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function13 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit4 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z10 = false;
                                o00Oo00.OooO0O0(unit4, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf4 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf4) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function14 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function14, new o00O0O(z3, z10, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i26 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i26;
                        } else {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function15 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit5 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z11 = false;
                                o00Oo00.OooO0O0(unit5, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf5 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf5) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function16 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function16, new o00O0O(z3, z11, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i27 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i27;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                    }
                    i15 = 100663296;
                    i5 |= i15;
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function17 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit6 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z12 = false;
                            o00Oo00.OooO0O0(unit6, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf6 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf6) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function18 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function18, new o00O0O(z3, z12, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i28 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i28;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function19 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit7 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z13 = false;
                            o00Oo00.OooO0O0(unit7, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf7 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf7) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function110 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function110, new o00O0O(z3, z13, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i29 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i29;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i5 |= 3072;
                function2 = function0;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function1;
                        if (ooo00oOooOOo.Oooo0oo(function3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    if ((458752 & i3) == 0) {
                        if ((i4 & 32) == 0) {
                            i12 = i;
                            if (ooo00oOooOOo.OooO(i12)) {
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i5 |= i20;
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (ooo00oOooOOo.OooO0oO(f)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 256) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit8 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z14 = false;
                                o00Oo00.OooO0O0(unit8, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf8 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf8) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function112 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function112, new o00O0O(z3, z14, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i210 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i210;
                        } else {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function113 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit9 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z15 = false;
                                o00Oo00.OooO0O0(unit9, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf9 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf9) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function114 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function114, new o00O0O(z3, z15, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i211 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i211;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                    }
                    i15 = 100663296;
                    i5 |= i15;
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function115 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit10 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z16 = false;
                            o00Oo00.OooO0O0(unit10, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf10 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf10) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function116 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function116, new o00O0O(z3, z16, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i212 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i212;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function117 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit11 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z17 = false;
                            o00Oo00.OooO0O0(unit11, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf11 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function118 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function118, new o00O0O(z3, z17, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i213 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i213;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (ooo00oOooOOo.OooO(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (ooo00oOooOOo.OooO0oO(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i5 |= i14;
                }
                if ((i4 & 256) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function119 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit12 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z18 = false;
                            o00Oo00.OooO0O0(unit12, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf12 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf12) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function1110 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function1110, new o00O0O(z3, z18, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i214 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i214;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit13 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z19 = false;
                            o00Oo00.OooO0O0(unit13, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf13 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf13) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function1112 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function1112, new o00O0O(z3, z19, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i215 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i215;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1113 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit14 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z110 = false;
                        o00Oo00.OooO0O0(unit14, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf14 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf14) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1114 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1114, new o00O0O(z3, z110, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i216 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i216;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1115 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit15 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z111 = false;
                        o00Oo00.OooO0O0(unit15, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf15 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf15) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1116 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1116, new o00O0O(z3, z111, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i217 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i217;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i5 |= 384;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    function2 = function0;
                    if (ooo00oOooOOo.Oooo0oo(function2)) {
                        i9 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function1;
                        if (ooo00oOooOOo.Oooo0oo(function3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    if ((458752 & i3) == 0) {
                        if ((i4 & 32) == 0) {
                            i12 = i;
                            if (ooo00oOooOOo.OooO(i12)) {
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i5 |= i20;
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (ooo00oOooOOo.OooO0oO(f)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 256) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1117 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit16 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z112 = false;
                                o00Oo00.OooO0O0(unit16, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf16 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf16) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function1118 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function1118, new o00O0O(z3, z112, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i218 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i218;
                        } else {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1119 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit17 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z113 = false;
                                o00Oo00.OooO0O0(unit17, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf17 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf17) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function11110 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function11110, new o00O0O(z3, z113, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i219 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i219;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                    }
                    i15 = 100663296;
                    i5 |= i15;
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit18 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z114 = false;
                            o00Oo00.OooO0O0(unit18, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf18 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf18) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11112 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11112, new o00O0O(z3, z114, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i2110 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i2110;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11113 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit19 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z115 = false;
                            o00Oo00.OooO0O0(unit19, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf19 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf19) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11114 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11114, new o00O0O(z3, z115, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i2111 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i2111;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (ooo00oOooOOo.OooO(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (ooo00oOooOOo.OooO0oO(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i5 |= i14;
                }
                if ((i4 & 256) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11115 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit110 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z116 = false;
                            o00Oo00.OooO0O0(unit110, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf110 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf110) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11116 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11116, new o00O0O(z3, z116, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i2112 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i2112;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11117 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit111 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z117 = false;
                            o00Oo00.OooO0O0(unit111, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf111 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11118 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11118, new o00O0O(z3, z117, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i2113 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i2113;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11119 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit112 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z118 = false;
                        o00Oo00.OooO0O0(unit112, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf112 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf112) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function111110 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function111110, new o00O0O(z3, z118, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2114 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2114;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit113 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z119 = false;
                        o00Oo00.OooO0O0(unit113, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf113 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf113) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function111112 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function111112, new o00O0O(z3, z119, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2115 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2115;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i5 |= 3072;
            function2 = function0;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function1;
                    if (ooo00oOooOOo.Oooo0oo(function3)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (ooo00oOooOOo.OooO(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (ooo00oOooOOo.OooO0oO(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i5 |= i14;
                }
                if ((i4 & 256) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111113 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit114 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z1110 = false;
                            o00Oo00.OooO0O0(unit114, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf114 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf114) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function111114 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function111114, new o00O0O(z3, z1110, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i2116 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i2116;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111115 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit115 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z1111 = false;
                            o00Oo00.OooO0O0(unit115, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf115 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf115) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function111116 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function111116, new o00O0O(z3, z1111, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i2117 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i2117;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111117 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit116 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z1112 = false;
                        o00Oo00.OooO0O0(unit116, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf116 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf116) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function111118 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function111118, new o00O0O(z3, z1112, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2118 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2118;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111119 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit117 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z1113 = false;
                        o00Oo00.OooO0O0(unit117, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf117 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf117) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1111110 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1111110, new o00O0O(z3, z1113, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2119 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2119;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            if ((458752 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    i12 = i;
                    if (ooo00oOooOOo.OooO(i12)) {
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (ooo00oOooOOo.OooO0oO(f)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i5 |= i14;
            }
            if ((i4 & 256) != 0) {
                if ((234881024 & i3) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit118 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z1114 = false;
                        o00Oo00.OooO0O0(unit118, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf118 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf118) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1111112 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1111112, new o00O0O(z3, z1114, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i21110 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i21110;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111113 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit119 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z1115 = false;
                        o00Oo00.OooO0O0(unit119, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf119 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf119) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1111114 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1111114, new o00O0O(z3, z1115, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i21111 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i21111;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i15 = 100663296;
            i5 |= i15;
            if ((191739611 & i5) == 38347922) {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111115 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit1110 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z1116 = false;
                    o00Oo00.OooO0O0(unit1110, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf1110 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1110) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function1111116 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function1111116, new o00O0O(z3, z1116, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i21112 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i21112;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111117 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit1111 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z1117 = false;
                    o00Oo00.OooO0O0(unit1111, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf1111 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1111) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function1111118 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function1111118, new o00O0O(z3, z1117, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i21113 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i21113;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
        }
        i5 |= 48;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 896) == 0) {
                if (ooo00oOooOOo.OooO0OO(z2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    function2 = function0;
                    if (ooo00oOooOOo.Oooo0oo(function2)) {
                        i9 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function1;
                        if (ooo00oOooOOo.Oooo0oo(function3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    if ((458752 & i3) == 0) {
                        if ((i4 & 32) == 0) {
                            i12 = i;
                            if (ooo00oOooOOo.OooO(i12)) {
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i5 |= i20;
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (ooo00oOooOOo.OooO0oO(f)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & 256) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111119 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit1112 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z1118 = false;
                                o00Oo00.OooO0O0(unit1112, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf1112 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1112) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function11111110 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function11111110, new o00O0O(z3, z1118, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i21114 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i21114;
                        } else {
                            ooo00oOooOOo.OooOOo0();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i16 = 17;
                                    i5 &= -458753;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            ooo00oOooOOo.Oooo0oO();
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111 = oo0o0O0.f29705OooO00o;
                            if (show.getValue().booleanValue()) {
                                Unit unit1113 = Unit.INSTANCE;
                                ooo00oOooOOo.OooO0o0(1157296644);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo) {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                } else {
                                    objOooO0o = new OooO00o(function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                boolean z1119 = false;
                                o00Oo00.OooO0O0(unit1113, (Function1) objOooO0o, ooo00oOooOOo);
                                Boolean boolValueOf1113 = Boolean.valueOf(z3);
                                ooo00oOooOOo.OooO0o0(1618982084);
                                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1113) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2) {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                } else {
                                    objOooO0o2 = new OooO0O0(z3, show, function2);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                Function0 function11111112 = (Function0) objOooO0o2;
                                if (z3) {
                                    i19 = 4;
                                } else {
                                    i19 = 4;
                                }
                                o0000OO0.OooO0OO.OooO00o(function11111112, new o00O0O(z3, z1119, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                            }
                            z5 = z3;
                            function5 = function2;
                            int i21115 = i16;
                            f3 = f2;
                            z6 = z4;
                            function6 = function4;
                            i18 = i21115;
                        }
                        oo0oooOooOo = ooo00oOooOOo.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                    }
                    i15 = 100663296;
                    i5 |= i15;
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111113 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit1114 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z11110 = false;
                            o00Oo00.OooO0O0(unit1114, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf1114 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1114) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11111114 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11111114, new o00O0O(z3, z11110, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i21116 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i21116;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111115 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit1115 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z11111 = false;
                            o00Oo00.OooO0O0(unit1115, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf1115 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1115) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11111116 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11111116, new o00O0O(z3, z11111, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i21117 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i21117;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (ooo00oOooOOo.OooO(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (ooo00oOooOOo.OooO0oO(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i5 |= i14;
                }
                if ((i4 & 256) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111117 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit1116 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z11112 = false;
                            o00Oo00.OooO0O0(unit1116, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf1116 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1116) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11111118 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11111118, new o00O0O(z3, z11112, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i21118 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i21118;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111119 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit1117 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z11113 = false;
                            o00Oo00.OooO0O0(unit1117, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf1117 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1117) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function111111110 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function111111110, new o00O0O(z3, z11113, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i21119 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i21119;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit1118 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z11114 = false;
                        o00Oo00.OooO0O0(unit1118, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf1118 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1118) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function111111112 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function111111112, new o00O0O(z3, z11114, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i211110 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i211110;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111113 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit1119 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z11115 = false;
                        o00Oo00.OooO0O0(unit1119, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf1119 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1119) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function111111114 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function111111114, new o00O0O(z3, z11115, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i211111 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i211111;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i5 |= 3072;
            function2 = function0;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function1;
                    if (ooo00oOooOOo.Oooo0oo(function3)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (ooo00oOooOOo.OooO(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (ooo00oOooOOo.OooO0oO(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i5 |= i14;
                }
                if ((i4 & 256) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111115 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit11110 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z11116 = false;
                            o00Oo00.OooO0O0(unit11110, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf11110 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11110) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function111111116 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function111111116, new o00O0O(z3, z11116, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i211112 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i211112;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111117 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit11111 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z11117 = false;
                            o00Oo00.OooO0O0(unit11111, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf11111 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11111) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function111111118 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function111111118, new o00O0O(z3, z11117, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i211113 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i211113;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111119 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit11112 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z11118 = false;
                        o00Oo00.OooO0O0(unit11112, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf11112 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11112) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1111111110 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1111111110, new o00O0O(z3, z11118, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i211114 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i211114;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit11113 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z11119 = false;
                        o00Oo00.OooO0O0(unit11113, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf11113 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11113) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1111111112 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1111111112, new o00O0O(z3, z11119, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i211115 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i211115;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            if ((458752 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    i12 = i;
                    if (ooo00oOooOOo.OooO(i12)) {
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (ooo00oOooOOo.OooO0oO(f)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i5 |= i14;
            }
            if ((i4 & 256) != 0) {
                if ((234881024 & i3) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111113 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit11114 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z111110 = false;
                        o00Oo00.OooO0O0(unit11114, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf11114 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11114) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1111111114 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1111111114, new o00O0O(z3, z111110, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i211116 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i211116;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111115 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit11115 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z111111 = false;
                        o00Oo00.OooO0O0(unit11115, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf11115 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11115) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1111111116 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1111111116, new o00O0O(z3, z111111, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i211117 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i211117;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i15 = 100663296;
            i5 |= i15;
            if ((191739611 & i5) == 38347922) {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111117 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit11116 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z111112 = false;
                    o00Oo00.OooO0O0(unit11116, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf11116 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11116) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function1111111118 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function1111111118, new o00O0O(z3, z111112, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i211118 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i211118;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111119 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit11117 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z111113 = false;
                    o00Oo00.OooO0O0(unit11117, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf11117 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11117) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function11111111110 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function11111111110, new o00O0O(z3, z111113, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i211119 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i211119;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
        }
        i5 |= 384;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 7168) == 0) {
                function2 = function0;
                if (ooo00oOooOOo.Oooo0oo(function2)) {
                    i9 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function1;
                    if (ooo00oOooOOo.Oooo0oo(function3)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (ooo00oOooOOo.OooO(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (ooo00oOooOOo.OooO0oO(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i5 |= i14;
                }
                if ((i4 & 256) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111111 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit11118 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z111114 = false;
                            o00Oo00.OooO0O0(unit11118, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf11118 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11118) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11111111112 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11111111112, new o00O0O(z3, z111114, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i2111110 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i2111110;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i16 = 17;
                                i5 &= -458753;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o00O0OO.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        ooo00oOooOOo.Oooo0oO();
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111113 = oo0o0O0.f29705OooO00o;
                        if (show.getValue().booleanValue()) {
                            Unit unit11119 = Unit.INSTANCE;
                            ooo00oOooOOo.OooO0o0(1157296644);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new OooO00o(function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            boolean z111115 = false;
                            o00Oo00.OooO0O0(unit11119, (Function1) objOooO0o, ooo00oOooOOo);
                            Boolean boolValueOf11119 = Boolean.valueOf(z3);
                            ooo00oOooOOo.OooO0o0(1618982084);
                            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf11119) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new OooO0O0(z3, show, function2);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            Function0 function11111111114 = (Function0) objOooO0o2;
                            if (z3) {
                                i19 = 4;
                            } else {
                                i19 = 4;
                            }
                            o0000OO0.OooO0OO.OooO00o(function11111111114, new o00O0O(z3, z111115, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                        }
                        z5 = z3;
                        function5 = function2;
                        int i2111111 = i16;
                        f3 = f2;
                        z6 = z4;
                        function6 = function4;
                        i18 = i2111111;
                    }
                    oo0oooOooOo = ooo00oOooOOo.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111115 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit111110 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z111116 = false;
                        o00Oo00.OooO0O0(unit111110, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf111110 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111110) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function11111111116 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function11111111116, new o00O0O(z3, z111116, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2111112 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2111112;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111117 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit111111 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z111117 = false;
                        o00Oo00.OooO0O0(unit111111, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf111111 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111111) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function11111111118 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function11111111118, new o00O0O(z3, z111117, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2111113 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2111113;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            if ((458752 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    i12 = i;
                    if (ooo00oOooOOo.OooO(i12)) {
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (ooo00oOooOOo.OooO0oO(f)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i5 |= i14;
            }
            if ((i4 & 256) != 0) {
                if ((234881024 & i3) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111119 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit111112 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z111118 = false;
                        o00Oo00.OooO0O0(unit111112, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf111112 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111112) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function111111111110 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function111111111110, new o00O0O(z3, z111118, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2111114 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2111114;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111111 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit111113 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z111119 = false;
                        o00Oo00.OooO0O0(unit111113, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf111113 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111113) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function111111111112 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function111111111112, new o00O0O(z3, z111119, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2111115 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2111115;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i15 = 100663296;
            i5 |= i15;
            if ((191739611 & i5) == 38347922) {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111113 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit111114 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z1111110 = false;
                    o00Oo00.OooO0O0(unit111114, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf111114 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111114) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function111111111114 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function111111111114, new o00O0O(z3, z1111110, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i2111116 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i2111116;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111115 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit111115 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z1111111 = false;
                    o00Oo00.OooO0O0(unit111115, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf111115 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111115) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function111111111116 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function111111111116, new o00O0O(z3, z1111111, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i2111117 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i2111117;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
        }
        i5 |= 3072;
        function2 = function0;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((57344 & i3) == 0) {
                function3 = function1;
                if (ooo00oOooOOo.Oooo0oo(function3)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i5 |= i11;
            }
            if ((458752 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    i12 = i;
                    if (ooo00oOooOOo.OooO(i12)) {
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (ooo00oOooOOo.OooO0oO(f)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i5 |= i14;
            }
            if ((i4 & 256) != 0) {
                if ((234881024 & i3) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111117 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit111116 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z1111112 = false;
                        o00Oo00.OooO0O0(unit111116, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf111116 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111116) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function111111111118 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function111111111118, new o00O0O(z3, z1111112, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2111118 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2111118;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i16 = 17;
                            i5 &= -458753;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o00O0OO.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111119 = oo0o0O0.f29705OooO00o;
                    if (show.getValue().booleanValue()) {
                        Unit unit111117 = Unit.INSTANCE;
                        ooo00oOooOOo.OooO0o0(1157296644);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new OooO00o(function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        boolean z1111113 = false;
                        o00Oo00.OooO0O0(unit111117, (Function1) objOooO0o, ooo00oOooOOo);
                        Boolean boolValueOf111117 = Boolean.valueOf(z3);
                        ooo00oOooOOo.OooO0o0(1618982084);
                        zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111117) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooO0O0(z3, show, function2);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        Function0 function1111111111110 = (Function0) objOooO0o2;
                        if (z3) {
                            i19 = 4;
                        } else {
                            i19 = 4;
                        }
                        o0000OO0.OooO0OO.OooO00o(function1111111111110, new o00O0O(z3, z1111113, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                    }
                    z5 = z3;
                    function5 = function2;
                    int i2111119 = i16;
                    f3 = f2;
                    z6 = z4;
                    function6 = function4;
                    i18 = i2111119;
                }
                oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
            }
            i15 = 100663296;
            i5 |= i15;
            if ((191739611 & i5) == 38347922) {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111111 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit111118 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z1111114 = false;
                    o00Oo00.OooO0O0(unit111118, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf111118 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111118) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function1111111111112 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function1111111111112, new o00O0O(z3, z1111114, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i21111110 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i21111110;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111113 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit111119 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z1111115 = false;
                    o00Oo00.OooO0O0(unit111119, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf111119 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf111119) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function1111111111114 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function1111111111114, new o00O0O(z3, z1111115, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i21111111 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i21111111;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
        }
        i5 |= 24576;
        function3 = function1;
        if ((458752 & i3) == 0) {
            if ((i4 & 32) == 0) {
                i12 = i;
                if (ooo00oOooOOo.OooO(i12)) {
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            i5 |= i22;
        } else {
            i12 = i;
        }
        if ((i3 & 3670016) != 0) {
            if ((i4 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i5 |= i20;
        }
        i13 = i4 & 128;
        if (i13 != 0) {
            i5 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (ooo00oOooOOo.OooO0oO(f)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i5 |= i14;
        }
        if ((i4 & 256) != 0) {
            if ((234881024 & i3) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
            }
            if ((191739611 & i5) == 38347922) {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111115 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit1111110 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z1111116 = false;
                    o00Oo00.OooO0O0(unit1111110, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf1111110 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1111110) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function1111111111116 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function1111111111116, new o00O0O(z3, z1111116, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i21111112 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i21111112;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i16 = 17;
                        i5 &= -458753;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o00O0OO.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111117 = oo0o0O0.f29705OooO00o;
                if (show.getValue().booleanValue()) {
                    Unit unit1111111 = Unit.INSTANCE;
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new OooO00o(function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    boolean z1111117 = false;
                    o00Oo00.OooO0O0(unit1111111, (Function1) objOooO0o, ooo00oOooOOo);
                    Boolean boolValueOf1111111 = Boolean.valueOf(z3);
                    ooo00oOooOOo.OooO0o0(1618982084);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1111111) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooO0O0(z3, show, function2);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function1111111111118 = (Function0) objOooO0o2;
                    if (z3) {
                        i19 = 4;
                    } else {
                        i19 = 4;
                    }
                    o0000OO0.OooO0OO.OooO00o(function1111111111118, new o00O0O(z3, z1111117, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
                }
                z5 = z3;
                function5 = function2;
                int i21111113 = i16;
                f3 = f2;
                z6 = z4;
                function6 = function4;
                i18 = i21111113;
            }
            oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
        }
        i15 = 100663296;
        i5 |= i15;
        if ((191739611 & i5) == 38347922) {
            ooo00oOooOOo.OooOOo0();
            if ((i3 & 1) != 0) {
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i8 != 0) {
                    function2 = null;
                }
                if (i10 == 0) {
                }
                if ((i4 & 32) != 0) {
                    i16 = 17;
                    i5 &= -458753;
                } else {
                    i16 = i12;
                }
                if ((i4 & 64) != 0) {
                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i17 = i2;
                }
                if (i13 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            } else {
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i8 != 0) {
                    function2 = null;
                }
                if (i10 == 0) {
                }
                if ((i4 & 32) != 0) {
                    i16 = 17;
                    i5 &= -458753;
                } else {
                    i16 = i12;
                }
                if ((i4 & 64) != 0) {
                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i17 = i2;
                }
                if (i13 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111119 = oo0o0O0.f29705OooO00o;
            if (show.getValue().booleanValue()) {
                Unit unit1111112 = Unit.INSTANCE;
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(function4);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(function4);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                boolean z1111118 = false;
                o00Oo00.OooO0O0(unit1111112, (Function1) objOooO0o, ooo00oOooOOo);
                Boolean boolValueOf1111112 = Boolean.valueOf(z3);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1111112) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o2 = new OooO0O0(z3, show, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooO0O0(z3, show, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                Function0 function11111111111110 = (Function0) objOooO0o2;
                if (z3) {
                    i19 = 4;
                } else {
                    i19 = 4;
                }
                o0000OO0.OooO0OO.OooO00o(function11111111111110, new o00O0O(z3, z1111118, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
            }
            z5 = z3;
            function5 = function2;
            int i21111114 = i16;
            f3 = f2;
            z6 = z4;
            function6 = function4;
            i18 = i21111114;
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i3 & 1) != 0) {
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i8 != 0) {
                    function2 = null;
                }
                if (i10 == 0) {
                }
                if ((i4 & 32) != 0) {
                    i16 = 17;
                    i5 &= -458753;
                } else {
                    i16 = i12;
                }
                if ((i4 & 64) != 0) {
                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i17 = i2;
                }
                if (i13 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            } else {
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i8 != 0) {
                    function2 = null;
                }
                if (i10 == 0) {
                }
                if ((i4 & 32) != 0) {
                    i16 = 17;
                    i5 &= -458753;
                } else {
                    i16 = i12;
                }
                if ((i4 & 64) != 0) {
                    i17 = o00O0OO.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i17 = i2;
                }
                if (i13 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111111111 = oo0o0O0.f29705OooO00o;
            if (show.getValue().booleanValue()) {
                Unit unit1111113 = Unit.INSTANCE;
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(function4);
                objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o = new OooO00o(function4);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                } else {
                    objOooO0o = new OooO00o(function4);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                boolean z1111119 = false;
                o00Oo00.OooO0O0(unit1111113, (Function1) objOooO0o, ooo00oOooOOo);
                Boolean boolValueOf1111113 = Boolean.valueOf(z3);
                ooo00oOooOOo.OooO0o0(1618982084);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(boolValueOf1111113) | ooo00oOooOOo.Oooo0oo(show) | ooo00oOooOOo.Oooo0oo(function2);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o2 = new OooO0O0(z3, show, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooO0O0(z3, show, function2);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                Function0 function11111111111112 = (Function0) objOooO0o2;
                if (z3) {
                    i19 = 4;
                } else {
                    i19 = 4;
                }
                o0000OO0.OooO0OO.OooO00o(function11111111111112, new o00O0O(z3, z1111119, i19), o00O0000.OooO00o(ooo00oOooOOo, 981233981, new OooO0OO(content, i5, i16, i17, f2)), ooo00oOooOOo, 384, 0);
            }
            z5 = z3;
            function5 = function2;
            int i21111115 = i16;
            f3 = f2;
            z6 = z4;
            function6 = function4;
            i18 = i21111115;
        }
        oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(show, z5, z6, function5, function6, i18, i17, f3, content, i3, i4));
    }
}
