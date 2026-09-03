package p154o00OoO00;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAPlayState;
import com.code.android.uikit.svga.SVGAView;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSVGACompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGACompose.kt\ncom/code/android/uikit/svga/SVGAComposeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,157:1\n76#2:158\n67#3,3:159\n66#3:162\n25#3:169\n36#3:176\n83#3,3:183\n36#3:192\n1097#4,6:163\n1097#4,6:170\n1097#4,6:177\n1097#4,6:186\n1097#4,6:193\n81#5:199\n107#5,2:200\n*S KotlinDebug\n*F\n+ 1 SVGACompose.kt\ncom/code/android/uikit/svga/SVGAComposeKt\n*L\n28#1:158\n31#1:159,3\n31#1:162\n90#1:169\n101#1:176\n119#1:183,3\n153#1:192\n31#1:163,6\n90#1:170,6\n101#1:177,6\n119#1:186,6\n153#1:193,6\n90#1:199\n90#1:200,2\n*E\n"})
public final class OooOo00 {

    public static final class OooO extends Lambda implements Function1<SVGAView, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38149OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f38150OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f38151OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f38152OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f38153OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f38154OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, String str, boolean z, boolean z2, MutableState<Float> mutableState, Function0<Unit> function0) {
            super(1);
            this.f38150OooO0Oo = i;
            this.f38152OooO0o0 = str;
            this.f38151OooO0o = z;
            this.f38153OooO0oO = z2;
            this.f38154OooO0oo = mutableState;
            this.f38149OooO = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SVGAView sVGAView) {
            Object objM4213constructorimpl;
            SVGAView it = sVGAView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setLoops(this.f38150OooO0Oo);
            String str = this.f38152OooO0o0;
            if (StringsKt.isBlank(str)) {
                it.OooOOO0(true);
            } else {
                boolean zAreEqual = Intrinsics.areEqual(str, it.getCurrentAnim());
                boolean z = this.f38151OooO0o;
                if (!zAreEqual) {
                    Context context = it.getContext();
                    File path = new File(str);
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    Oooo000 oooo000 = new Oooo000(this.f38154OooO0oo, this.f38153OooO0oO);
                    Oooo0 oooo0 = new Oooo0(this.f38149OooO);
                    String key = path.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(key, "path.absolutePath");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(path, "path");
                    Intrinsics.checkNotNullParameter(key, "key");
                    it.f10166OooOo0o = true;
                    it.currentAnim = path.getAbsolutePath();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        com.opensource.svgaplayer.OooO0OO.OooO0Oo(new com.opensource.svgaplayer.OooO0OO(context), new FileInputStream(path), key, new o0OoOo0(it, oooo000, oooo0), true, 48);
                        objM4213constructorimpl = Result.m4213constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m4216exceptionOrNullimpl(objM4213constructorimpl) != null) {
                        oooo0.invoke();
                    }
                    if (z) {
                        it.OooOO0o();
                    }
                } else if (!z) {
                    SVGAPlayState playState = it.getPlayState();
                    SVGAPlayState sVGAPlayState = SVGAPlayState.Pause;
                    if (playState != sVGAPlayState) {
                        it.OooO0oO(false);
                        o0OO0O0.OooO0OO oooO0OO = it.callback;
                        if (oooO0OO != null) {
                            oooO0OO.onPause();
                        }
                        if (it.playState != sVGAPlayState) {
                            it.playState = sVGAPlayState;
                        }
                    }
                } else if (it.getPlayState() != SVGAPlayState.Playing) {
                    it.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f38155OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38156OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38157OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, Function0<Unit> function0, Function0<Unit> function1) {
            super(1);
            this.f38155OooO0Oo = i;
            this.f38157OooO0o0 = function0;
            this.f38156OooO0o = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            SVGAView sVGAView = new SVGAView(it, null, 6, 0);
            sVGAView.setCallback(new OooOOOO(this.f38157OooO0o0, this.f38156OooO0o));
            sVGAView.setLoops(this.f38155OooO0Oo);
            return sVGAView;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<SVGAView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f38158OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f38159OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f38160OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f38161OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, String str, LifecycleOwner lifecycleOwner, boolean z) {
            super(1);
            this.f38158OooO0Oo = i;
            this.f38160OooO0o0 = str;
            this.f38159OooO0o = lifecycleOwner;
            this.f38161OooO0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SVGAView sVGAView) {
            SVGAView it = sVGAView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setLoops(this.f38158OooO0Oo);
            String str = this.f38160OooO0o0;
            if (StringsKt.isBlank(str)) {
                it.OooOOO0(true);
            } else {
                boolean zAreEqual = Intrinsics.areEqual(str, it.getCurrentAnim());
                boolean z = this.f38161OooO0oO;
                if (!zAreEqual) {
                    it.OooOO0O(str, this.f38159OooO0o);
                    if (z) {
                        it.OooOO0o();
                    }
                } else if (!z) {
                    SVGAPlayState playState = it.getPlayState();
                    SVGAPlayState sVGAPlayState = SVGAPlayState.Pause;
                    if (playState != sVGAPlayState) {
                        it.OooO0oO(false);
                        o0OO0O0.OooO0OO oooO0OO = it.callback;
                        if (oooO0OO != null) {
                            oooO0OO.onPause();
                        }
                        if (it.playState != sVGAPlayState) {
                            it.playState = sVGAPlayState;
                        }
                    }
                } else if (it.getPlayState() != SVGAPlayState.Playing) {
                    it.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Modifier f38162OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f38163OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f38164OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f38165OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38166OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38167OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f38168OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f38169OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, boolean z, int i, Function0<Unit> function0, Function0<Unit> function1, Modifier modifier, int i2, int i3) {
            super(2);
            this.f38163OooO0Oo = str;
            this.f38165OooO0o0 = z;
            this.f38164OooO0o = i;
            this.f38166OooO0oO = function0;
            this.f38167OooO0oo = function1;
            this.f38162OooO = modifier;
            this.f38168OooOO0 = i2;
            this.f38169OooOO0O = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOo00.OooO00o(this.f38163OooO0Oo, this.f38165OooO0o0, this.f38164OooO0o, this.f38166OooO0oO, this.f38167OooO0oo, this.f38162OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38168OooOO0 | 1), this.f38169OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38170OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Function0<Unit> function0) {
            super(1);
            this.f38170OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            SVGAView sVGAView = new SVGAView(it, null, 6, 0);
            sVGAView.setCallback(new OooOo(this.f38170OooO0Oo));
            return sVGAView;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38171OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f38172OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f38173OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f38174OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f38175OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38176OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Modifier f38177OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f38178OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f38179OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, boolean z, int i, boolean z2, Function0<Unit> function0, Function0<Unit> function1, Modifier modifier, int i2, int i3) {
            super(2);
            this.f38172OooO0Oo = str;
            this.f38174OooO0o0 = z;
            this.f38173OooO0o = i;
            this.f38175OooO0oO = z2;
            this.f38176OooO0oo = function0;
            this.f38171OooO = function1;
            this.f38177OooOO0 = modifier;
            this.f38178OooOO0O = i2;
            this.f38179OooOO0o = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOo00.OooO0O0(this.f38172OooO0Oo, this.f38174OooO0o0, this.f38173OooO0o, this.f38175OooO0oO, this.f38176OooO0oo, this.f38171OooO, this.f38177OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38178OooOO0O | 1), this.f38179OooOO0o);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x011a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull String anim, boolean z, int i, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Modifier modifier, @Nullable Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Function0<Unit> function2;
        int i7;
        int i8;
        Function0<Unit> function3;
        int i9;
        int i10;
        Modifier modifier2;
        int i11;
        int i12;
        Function0<Unit> function4;
        Function0<Unit> function5;
        Modifier modifier3;
        boolean zChanged;
        Object objRememberedValue;
        Function0<Unit> function6;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(anim, "anim");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1019688829);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(anim) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i2 & 896) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((57344 & i2) == 0) {
                        function3 = function1;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        if ((458752 & i2) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i4 |= i11;
                        }
                        if ((374491 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i13 != 0) {
                                i12 = 0;
                            } else {
                                i12 = i5;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            function5 = i8 == 0 ? function3 : null;
                            if (i10 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                            }
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            Integer numValueOf = Integer.valueOf(i12);
                            int i14 = i4 >> 12;
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged = composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new OooO00o(i12, function5, function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner, z), composerStartRestartGroup, i14 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function3 = function5;
                            function6 = function4;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i12 = i5;
                            function6 = function2;
                            modifier4 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
                    }
                    i4 |= 196608;
                    modifier2 = modifier;
                    if ((374491 & i4) == 74898) {
                        if (i13 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i5;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                        }
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        Integer numValueOf2 = Integer.valueOf(i12);
                        int i15 = i4 >> 12;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(numValueOf2) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner2, z), composerStartRestartGroup, i15 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function5;
                        function6 = function4;
                        modifier4 = modifier3;
                    } else {
                        if (i13 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i5;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                        }
                        LifecycleOwner lifecycleOwner3 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        Integer numValueOf3 = Integer.valueOf(i12);
                        int i16 = i4 >> 12;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(numValueOf3) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner3, z), composerStartRestartGroup, i16 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function5;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
                }
                i4 |= 24576;
                function3 = function1;
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((458752 & i2) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    if ((374491 & i4) == 74898) {
                        if (i13 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i5;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                        }
                        LifecycleOwner lifecycleOwner4 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        Integer numValueOf4 = Integer.valueOf(i12);
                        int i17 = i4 >> 12;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(numValueOf4) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner4, z), composerStartRestartGroup, i17 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function5;
                        function6 = function4;
                        modifier4 = modifier3;
                    } else {
                        if (i13 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i5;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                        }
                        LifecycleOwner lifecycleOwner5 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        Integer numValueOf5 = Integer.valueOf(i12);
                        int i18 = i4 >> 12;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(numValueOf5) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner5, z), composerStartRestartGroup, i18 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function5;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
                }
                i4 |= 196608;
                modifier2 = modifier;
                if ((374491 & i4) == 74898) {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner6 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf6 = Integer.valueOf(i12);
                    int i19 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf6) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner6, z), composerStartRestartGroup, i19 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                } else {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner7 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf7 = Integer.valueOf(i12);
                    int i110 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf7) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner7, z), composerStartRestartGroup, i110 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
            }
            i4 |= 3072;
            function2 = function0;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((57344 & i2) == 0) {
                    function3 = function1;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((458752 & i2) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    if ((374491 & i4) == 74898) {
                        if (i13 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i5;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                        }
                        LifecycleOwner lifecycleOwner8 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        Integer numValueOf8 = Integer.valueOf(i12);
                        int i111 = i4 >> 12;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(numValueOf8) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner8, z), composerStartRestartGroup, i111 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function5;
                        function6 = function4;
                        modifier4 = modifier3;
                    } else {
                        if (i13 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i5;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                        }
                        LifecycleOwner lifecycleOwner9 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        Integer numValueOf9 = Integer.valueOf(i12);
                        int i112 = i4 >> 12;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(numValueOf9) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner9, z), composerStartRestartGroup, i112 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function5;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
                }
                i4 |= 196608;
                modifier2 = modifier;
                if ((374491 & i4) == 74898) {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner10 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf10 = Integer.valueOf(i12);
                    int i113 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf10) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner10, z), composerStartRestartGroup, i113 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                } else {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner11 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf11 = Integer.valueOf(i12);
                    int i114 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf11) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner11, z), composerStartRestartGroup, i114 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
            }
            i4 |= 24576;
            function3 = function1;
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((458752 & i2) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                if ((374491 & i4) == 74898) {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner12 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf12 = Integer.valueOf(i12);
                    int i115 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf12) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner12, z), composerStartRestartGroup, i115 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                } else {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner13 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf13 = Integer.valueOf(i12);
                    int i116 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf13) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner13, z), composerStartRestartGroup, i116 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
            }
            i4 |= 196608;
            modifier2 = modifier;
            if ((374491 & i4) == 74898) {
                if (i13 != 0) {
                    i12 = 0;
                } else {
                    i12 = i5;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                }
                LifecycleOwner lifecycleOwner14 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Integer numValueOf14 = Integer.valueOf(i12);
                int i117 = i4 >> 12;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(numValueOf14) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner14, z), composerStartRestartGroup, i117 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function5;
                function6 = function4;
                modifier4 = modifier3;
            } else {
                if (i13 != 0) {
                    i12 = 0;
                } else {
                    i12 = i5;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                }
                LifecycleOwner lifecycleOwner15 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Integer numValueOf15 = Integer.valueOf(i12);
                int i118 = i4 >> 12;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(numValueOf15) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner15, z), composerStartRestartGroup, i118 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function5;
                function6 = function4;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
        }
        i4 |= 384;
        i5 = i;
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 7168) == 0) {
                function2 = function0;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i7;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((57344 & i2) == 0) {
                    function3 = function1;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((458752 & i2) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    if ((374491 & i4) == 74898) {
                        if (i13 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i5;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                        }
                        LifecycleOwner lifecycleOwner16 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        Integer numValueOf16 = Integer.valueOf(i12);
                        int i119 = i4 >> 12;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(numValueOf16) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner16, z), composerStartRestartGroup, i119 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function5;
                        function6 = function4;
                        modifier4 = modifier3;
                    } else {
                        if (i13 != 0) {
                            i12 = 0;
                        } else {
                            i12 = i5;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                        }
                        LifecycleOwner lifecycleOwner17 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        Integer numValueOf17 = Integer.valueOf(i12);
                        int i1110 = i4 >> 12;
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(numValueOf17) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(i12, function5, function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner17, z), composerStartRestartGroup, i1110 & 112, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function5;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
                }
                i4 |= 196608;
                modifier2 = modifier;
                if ((374491 & i4) == 74898) {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner18 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf18 = Integer.valueOf(i12);
                    int i1111 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf18) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner18, z), composerStartRestartGroup, i1111 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                } else {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner19 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf19 = Integer.valueOf(i12);
                    int i1112 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf19) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner19, z), composerStartRestartGroup, i1112 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
            }
            i4 |= 24576;
            function3 = function1;
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((458752 & i2) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                if ((374491 & i4) == 74898) {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner110 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf110 = Integer.valueOf(i12);
                    int i1113 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf110) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner110, z), composerStartRestartGroup, i1113 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                } else {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner111 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf111 = Integer.valueOf(i12);
                    int i1114 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf111) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner111, z), composerStartRestartGroup, i1114 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
            }
            i4 |= 196608;
            modifier2 = modifier;
            if ((374491 & i4) == 74898) {
                if (i13 != 0) {
                    i12 = 0;
                } else {
                    i12 = i5;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                }
                LifecycleOwner lifecycleOwner112 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Integer numValueOf112 = Integer.valueOf(i12);
                int i1115 = i4 >> 12;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(numValueOf112) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner112, z), composerStartRestartGroup, i1115 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function5;
                function6 = function4;
                modifier4 = modifier3;
            } else {
                if (i13 != 0) {
                    i12 = 0;
                } else {
                    i12 = i5;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                }
                LifecycleOwner lifecycleOwner113 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Integer numValueOf113 = Integer.valueOf(i12);
                int i1116 = i4 >> 12;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(numValueOf113) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner113, z), composerStartRestartGroup, i1116 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function5;
                function6 = function4;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
        }
        i4 |= 3072;
        function2 = function0;
        i8 = i3 & 16;
        if (i8 != 0) {
            if ((57344 & i2) == 0) {
                function3 = function1;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            }
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((458752 & i2) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                if ((374491 & i4) == 74898) {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner114 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf114 = Integer.valueOf(i12);
                    int i1117 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf114) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner114, z), composerStartRestartGroup, i1117 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                } else {
                    if (i13 != 0) {
                        i12 = 0;
                    } else {
                        i12 = i5;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                    }
                    LifecycleOwner lifecycleOwner115 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Integer numValueOf115 = Integer.valueOf(i12);
                    int i1118 = i4 >> 12;
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(numValueOf115) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(i12, function5, function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner115, z), composerStartRestartGroup, i1118 & 112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function5;
                    function6 = function4;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
            }
            i4 |= 196608;
            modifier2 = modifier;
            if ((374491 & i4) == 74898) {
                if (i13 != 0) {
                    i12 = 0;
                } else {
                    i12 = i5;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                }
                LifecycleOwner lifecycleOwner116 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Integer numValueOf116 = Integer.valueOf(i12);
                int i1119 = i4 >> 12;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(numValueOf116) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner116, z), composerStartRestartGroup, i1119 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function5;
                function6 = function4;
                modifier4 = modifier3;
            } else {
                if (i13 != 0) {
                    i12 = 0;
                } else {
                    i12 = i5;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                }
                LifecycleOwner lifecycleOwner117 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Integer numValueOf117 = Integer.valueOf(i12);
                int i11110 = i4 >> 12;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(numValueOf117) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner117, z), composerStartRestartGroup, i11110 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function5;
                function6 = function4;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
        }
        i4 |= 24576;
        function3 = function1;
        i10 = i3 & 32;
        if (i10 != 0) {
            if ((458752 & i2) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            }
            if ((374491 & i4) == 74898) {
                if (i13 != 0) {
                    i12 = 0;
                } else {
                    i12 = i5;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                }
                LifecycleOwner lifecycleOwner118 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Integer numValueOf118 = Integer.valueOf(i12);
                int i11111 = i4 >> 12;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(numValueOf118) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner118, z), composerStartRestartGroup, i11111 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function5;
                function6 = function4;
                modifier4 = modifier3;
            } else {
                if (i13 != 0) {
                    i12 = 0;
                } else {
                    i12 = i5;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
                }
                LifecycleOwner lifecycleOwner119 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Integer numValueOf119 = Integer.valueOf(i12);
                int i11112 = i4 >> 12;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(numValueOf119) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(i12, function5, function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner119, z), composerStartRestartGroup, i11112 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function5;
                function6 = function4;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
        }
        i4 |= 196608;
        modifier2 = modifier;
        if ((374491 & i4) == 74898) {
            if (i13 != 0) {
                i12 = 0;
            } else {
                i12 = i5;
            }
            if (i6 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i8 == 0) {
            }
            if (i10 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
            }
            LifecycleOwner lifecycleOwner1110 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Integer numValueOf1110 = Integer.valueOf(i12);
            int i11113 = i4 >> 12;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(numValueOf1110) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(i12, function5, function4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(i12, function5, function4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner1110, z), composerStartRestartGroup, i11113 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function5;
            function6 = function4;
            modifier4 = modifier3;
        } else {
            if (i13 != 0) {
                i12 = 0;
            } else {
                i12 = i5;
            }
            if (i6 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i8 == 0) {
            }
            if (i10 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1019688829, i4, -1, "com.code.android.uikit.svga.SVGACompose (SVGACompose.kt:18)");
            }
            LifecycleOwner lifecycleOwner1111 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Integer numValueOf1111 = Integer.valueOf(i12);
            int i11114 = i4 >> 12;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(numValueOf1111) | composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(function4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(i12, function5, function4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(i12, function5, function4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifier3, new OooO0O0(i12, anim, lifecycleOwner1111, z), composerStartRestartGroup, i11114 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function5;
            function6 = function4;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(anim, z, i12, function6, function3, modifier4, i2, i3));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v6 ??, still in use, count: 1, list:
          (r11v6 ?? I:java.lang.Object) from 0x01ea: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r11v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:491)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    public static final void OooO0O0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v6 ??, still in use, count: 1, list:
          (r11v6 ?? I:java.lang.Object) from 0x01ea: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r11v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:491)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
}
