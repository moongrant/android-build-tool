package o00OO0O;

import android.graphics.Matrix;
import androidx.annotation.FloatRange;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f37104OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.OooOO0 f37105OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f37106OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f37107OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f37108OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f37109OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ OooOOOO f37110OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Alignment f37111OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ ContentScale f37112OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f37113OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f37114OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.airbnb.lottie.OooOO0 oooOO1, float f, Modifier modifier, boolean z, boolean z2, boolean z3, OooOOOO oooOOOO, Alignment alignment, ContentScale contentScale, int i, int i2) {
            super(2);
            this.f37105OooO0Oo = oooOO1;
            this.f37107OooO0o0 = f;
            this.f37106OooO0o = modifier;
            this.f37108OooO0oO = z;
            this.f37109OooO0oo = z2;
            this.f37104OooO = z3;
            this.f37110OooOO0 = oooOOOO;
            this.f37111OooOO0O = alignment;
            this.f37112OooOO0o = contentScale;
            this.f37114OooOOO0 = i;
            this.f37113OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO.OooO00o(this.f37105OooO0Oo, this.f37107OooO0o0, this.f37106OooO0o, this.f37108OooO0oO, this.f37109OooO0oo, this.f37104OooO, this.f37110OooOO0, this.f37111OooOO0O, this.f37112OooOO0o, composer, this.f37114OooOOO0 | 1, this.f37113OooOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ OooOOOO f37115OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.OooOO0 f37116OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Alignment f37117OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ContentScale f37118OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Matrix f37119OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LottieDrawable f37120OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f37121OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f37122OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f37123OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<OooOOOO> f37124OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ float f37125OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(com.airbnb.lottie.OooOO0 oooOO1, ContentScale contentScale, Alignment alignment, Matrix matrix, LottieDrawable lottieDrawable, OooOOOO oooOOOO, boolean z, boolean z2, boolean z3, float f, MutableState<OooOOOO> mutableState) {
            super(1);
            this.f37116OooO0Oo = oooOO1;
            this.f37118OooO0o0 = contentScale;
            this.f37117OooO0o = alignment;
            this.f37119OooO0oO = matrix;
            this.f37120OooO0oo = lottieDrawable;
            this.f37115OooO = oooOOOO;
            this.f37121OooOO0 = z;
            this.f37122OooOO0O = z2;
            this.f37123OooOO0o = z3;
            this.f37125OooOOO0 = f;
            this.f37124OooOOO = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Alignment alignment = this.f37117OooO0o;
            Canvas canvas = Canvas.getDrawContext().getCanvas();
            com.airbnb.lottie.OooOO0 oooOO1 = this.f37116OooO0Oo;
            long jSize = SizeKt.Size(oooOO1.f11821OooOO0.width(), oooOO1.f11821OooOO0.height());
            long jIntSize = IntSizeKt.IntSize(MathKt.roundToInt(Size.m1516getWidthimpl(Canvas.mo2118getSizeNHjbRc())), MathKt.roundToInt(Size.m1513getHeightimpl(Canvas.mo2118getSizeNHjbRc())));
            long jMo2795computeScaleFactorH7hwNQA = this.f37118OooO0o0.mo2795computeScaleFactorH7hwNQA(jSize, Canvas.mo2118getSizeNHjbRc());
            long jMo1337alignKFBX0sM = alignment.mo1337alignKFBX0sM(IntSizeKt.IntSize((int) (ScaleFactor.m2867getScaleXimpl(jMo2795computeScaleFactorH7hwNQA) * Size.m1516getWidthimpl(jSize)), (int) (ScaleFactor.m2868getScaleYimpl(jMo2795computeScaleFactorH7hwNQA) * Size.m1513getHeightimpl(jSize))), jIntSize, Canvas.getLayoutDirection());
            Matrix matrix = this.f37119OooO0oO;
            matrix.reset();
            matrix.preTranslate(IntOffset.m3893getXimpl(jMo1337alignKFBX0sM), IntOffset.m3894getYimpl(jMo1337alignKFBX0sM));
            matrix.preScale(ScaleFactor.m2867getScaleXimpl(jMo2795computeScaleFactorH7hwNQA), ScaleFactor.m2868getScaleYimpl(jMo2795computeScaleFactorH7hwNQA));
            LottieDrawable drawable = this.f37120OooO0oo;
            drawable.OooO0oo(oooOO1);
            MutableState<OooOOOO> mutableState = this.f37124OooOOO;
            OooOOOO value = mutableState.getValue();
            OooOOOO oooOOOO = this.f37115OooO;
            if (oooOOOO != value) {
                if (mutableState.getValue() != null) {
                    Intrinsics.checkNotNullParameter(drawable, "drawable");
                    throw null;
                }
                if (oooOOOO != null) {
                    Intrinsics.checkNotNullParameter(drawable, "drawable");
                    throw null;
                }
                mutableState.setValue(oooOOOO);
            }
            boolean z = drawable.f11775OooOOoo;
            boolean z2 = this.f37121OooOO0;
            if (z != z2) {
                drawable.f11775OooOOoo = z2;
                com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = drawable.f11772OooOOOo;
                if (oooO0O0 != null) {
                    oooO0O0.OooOOo(z2);
                }
            }
            drawable.f11777OooOo00 = this.f37122OooOO0O;
            boolean z3 = drawable.f11771OooOOOO;
            boolean z4 = this.f37123OooOO0o;
            if (z3 != z4) {
                drawable.f11771OooOOOO = z4;
                if (drawable.f11763OooO0o0 != null) {
                    drawable.OooO0OO();
                }
            }
            drawable.OooOOo0(this.f37125OooOOO0);
            android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
            com.airbnb.lottie.model.layer.OooO0O0 oooO0O1 = drawable.f11772OooOOOo;
            if (oooO0O1 != null) {
                oooO0O1.OooO0oo(nativeCanvas, matrix, drawable.f11774OooOOo0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f37126OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.OooOO0 f37127OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f37128OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f37129OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f37130OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f37131OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ OooOOOO f37132OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Alignment f37133OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ ContentScale f37134OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f37135OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f37136OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(com.airbnb.lottie.OooOO0 oooOO1, float f, Modifier modifier, boolean z, boolean z2, boolean z3, OooOOOO oooOOOO, Alignment alignment, ContentScale contentScale, int i, int i2) {
            super(2);
            this.f37127OooO0Oo = oooOO1;
            this.f37129OooO0o0 = f;
            this.f37128OooO0o = modifier;
            this.f37130OooO0oO = z;
            this.f37131OooO0oo = z2;
            this.f37126OooO = z3;
            this.f37132OooOO0 = oooOOOO;
            this.f37133OooOO0O = alignment;
            this.f37134OooOO0o = contentScale;
            this.f37136OooOOO0 = i;
            this.f37135OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO.OooO00o(this.f37127OooO0Oo, this.f37129OooO0o0, this.f37128OooO0o, this.f37130OooO0oO, this.f37131OooO0oo, this.f37126OooO, this.f37132OooOO0, this.f37133OooOO0O, this.f37134OooOO0o, composer, this.f37136OooOOO0 | 1, this.f37135OooOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f37137OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.OooOO0 f37138OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f37139OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37140OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f37141OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f37142OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f37143OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f37144OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f37145OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ OooOOOO f37146OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f37147OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ Alignment f37148OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ ContentScale f37149OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ int f37150OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f37151OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ int f37152OooOOoo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(com.airbnb.lottie.OooOO0 oooOO1, Modifier modifier, boolean z, boolean z2, OooOO0O oooOO0O, float f, int i, boolean z3, boolean z4, boolean z5, OooOOOO oooOOOO, Alignment alignment, ContentScale contentScale, int i2, int i3, int i4) {
            super(2);
            this.f37138OooO0Oo = oooOO1;
            this.f37140OooO0o0 = modifier;
            this.f37139OooO0o = z;
            this.f37141OooO0oO = z2;
            this.f37142OooO0oo = oooOO0O;
            this.f37137OooO = f;
            this.f37143OooOO0 = i;
            this.f37144OooOO0O = z3;
            this.f37145OooOO0o = z4;
            this.f37147OooOOO0 = z5;
            this.f37146OooOOO = oooOOOO;
            this.f37148OooOOOO = alignment;
            this.f37149OooOOOo = contentScale;
            this.f37151OooOOo0 = i2;
            this.f37150OooOOo = i3;
            this.f37152OooOOoo = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO.OooO0O0(this.f37138OooO0Oo, this.f37140OooO0o0, this.f37139OooO0o, this.f37141OooO0oO, this.f37142OooO0oo, this.f37137OooO, this.f37143OooOO0, this.f37144OooOO0O, this.f37145OooOO0o, this.f37147OooOOO0, this.f37146OooOOO, this.f37148OooOOOO, this.f37149OooOOOo, composer, this.f37151OooOOo0 | 1, this.f37150OooOOo, this.f37152OooOOoo);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@Nullable com.airbnb.lottie.OooOO0 oooOO1, @FloatRange(from = 0.0d, to = 1.0d) float f, @Nullable Modifier modifier, boolean z, boolean z2, boolean z3, @Nullable OooOOOO oooOOOO, @Nullable Alignment alignment, @Nullable ContentScale contentScale, @Nullable Composer composer, int i, int i2) {
        Alignment center;
        int i3;
        ContentScale fit;
        Composer composerStartRestartGroup = composer.startRestartGroup(185149665);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z4 = (i2 & 8) != 0 ? false : z;
        boolean z5 = (i2 & 16) != 0 ? false : z2;
        boolean z6 = (i2 & 32) != 0 ? false : z3;
        OooOOOO oooOOOO2 = (i2 & 64) != 0 ? null : oooOOOO;
        if ((i2 & 128) != 0) {
            i3 = i & (-29360129);
            center = Alignment.INSTANCE.getCenter();
        } else {
            center = alignment;
            i3 = i;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            i3 &= -234881025;
            fit = ContentScale.INSTANCE.getFit();
        } else {
            fit = contentScale;
        }
        int i4 = i3;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new LottieDrawable();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LottieDrawable lottieDrawable = (LottieDrawable) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Matrix();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Matrix matrix = (Matrix) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue3;
        if (oooOO1 != null) {
            if (!(oooOO1.OooO0O0() == 0.0f)) {
                composerStartRestartGroup.startReplaceableGroup(185150355);
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier3 = modifier2;
                CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m527sizeVpY3zN4(modifier2, Dp.m3775constructorimpl(oooOO1.f11821OooOO0.width() / o00OOO0.OooOOOO.OooO0OO()), Dp.m3775constructorimpl(oooOO1.f11821OooOO0.height() / o00OOO0.OooOOOO.OooO0OO())), new OooO0O0(oooOO1, fit, center, matrix, lottieDrawable, oooOOOO2, z4, z5, z6, f, mutableState), composerStartRestartGroup, 0);
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(oooOO1, f, modifier3, z4, z5, z6, oooOOOO2, center, fit, i, i2));
                return;
            }
        }
        Modifier modifier4 = modifier2;
        composerStartRestartGroup.startReplaceableGroup(185150335);
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new OooO00o(oooOO1, f, modifier4, z4, z5, z6, oooOOOO2, center, fit, i, i2));
        }
        BoxKt.Box(modifier4, composerStartRestartGroup, (i4 >> 6) & 14);
    }

    @Composable
    public static final void OooO0O0(@Nullable com.airbnb.lottie.OooOO0 oooOO1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable OooOO0O oooOO0O, float f, int i, boolean z3, boolean z4, boolean z5, @Nullable OooOOOO oooOOOO, @Nullable Alignment alignment, @Nullable ContentScale contentScale, @Nullable Composer composer, int i2, int i3, int i4) {
        Alignment center;
        int i5;
        ContentScale fit;
        Composer composerStartRestartGroup = composer.startRestartGroup(185151982);
        Modifier modifier2 = (i4 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z6 = (i4 & 4) != 0 ? true : z;
        boolean z7 = (i4 & 8) != 0 ? true : z2;
        OooOO0O oooOO0O2 = (i4 & 16) != 0 ? null : oooOO0O;
        float f2 = (i4 & 32) != 0 ? 1.0f : f;
        int i6 = (i4 & 64) != 0 ? 1 : i;
        boolean z8 = (i4 & 128) != 0 ? false : z3;
        boolean z9 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z4;
        boolean z10 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? false : z5;
        OooOOOO oooOOOO2 = (i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : oooOOOO;
        if ((i4 & 2048) != 0) {
            i5 = i3 & (-113);
            center = Alignment.INSTANCE.getCenter();
        } else {
            center = alignment;
            i5 = i3;
        }
        if ((i4 & 4096) != 0) {
            i5 &= -897;
            fit = ContentScale.INSTANCE.getFit();
        } else {
            fit = contentScale;
        }
        composerStartRestartGroup.startReplaceableGroup(-180608448);
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.Immediately;
        if (!(i6 > 0)) {
            throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("Iterations must be a positive number (", i6, ").").toString());
        }
        if (!((Float.isInfinite(f2) || Float.isNaN(f2)) ? false : true)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f2 + '.').toString());
        }
        ContentScale contentScale2 = fit;
        Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, -610207972, -3687241);
        Composer.Companion companion = Composer.INSTANCE;
        Alignment alignment2 = center;
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = new o00OO0O.OooO0OO();
            composerStartRestartGroup.updateRememberedValue(objOooO00o);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o00OO0O.OooO0O0 oooO0O0 = (o00OO0O.OooO0O0) objOooO00o;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        OooOOOO oooOOOO3 = oooOOOO2;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z6), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(new Object[]{oooOO1, Boolean.valueOf(z6), oooOO0O2, Float.valueOf(f2), Integer.valueOf(i6)}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new o00OO0O.OooO00o(z6, z7, oooO0O0, oooOO1, i6, f2, oooOO0O2, lottieCancellationBehavior, (MutableState) objRememberedValue, null), composerStartRestartGroup, 8);
        composerStartRestartGroup.endReplaceableGroup();
        int i7 = i2 >> 12;
        int i8 = i5 << 18;
        OooO00o(oooOO1, oooO0O0.getValue().floatValue(), modifier2, z8, z9, z10, oooOOOO3, alignment2, contentScale2, composerStartRestartGroup, ((i2 << 3) & 896) | 2097160 | (i7 & 7168) | (57344 & i7) | (i7 & 458752) | (29360128 & i8) | (i8 & 234881024), 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(oooOO1, modifier2, z6, z7, oooOO0O2, f2, i6, z8, z9, z10, oooOOOO3, alignment2, contentScale2, i2, i3, i4));
    }
}
