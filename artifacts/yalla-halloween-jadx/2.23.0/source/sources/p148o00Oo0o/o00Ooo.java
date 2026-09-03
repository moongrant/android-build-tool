package p148o00Oo0o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ArrayRes;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;
import p013OooOo0o.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFrameAnimations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameAnimations.kt\ncom/code/android/uikit/FrameAnimationsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,306:1\n76#2:307\n76#2:323\n36#3:308\n50#3:315\n49#3:316\n25#3:324\n1097#4,6:309\n1097#4,6:317\n1097#4,6:325\n*S KotlinDebug\n*F\n+ 1 FrameAnimations.kt\ncom/code/android/uikit/FrameAnimationsKt\n*L\n81#1:307\n142#1:323\n82#1:308\n89#1:315\n89#1:316\n144#1:324\n82#1:309,6\n89#1:317,6\n144#1:325,6\n*E\n"})
public final class o00Ooo {

    public static final class OooO00o extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Drawable> f37854OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ContentScale f37855OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState mutableState, ContentScale contentScale) {
            super(1);
            this.f37854OooO0Oo = mutableState;
            this.f37855OooO0o0 = contentScale;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            long jScaleFactor;
            Bitmap bitmap;
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Drawable value = this.f37854OooO0Oo.getValue();
            if (value != null) {
                long jSize = SizeKt.Size(value.getIntrinsicWidth(), value.getIntrinsicHeight());
                long jSize2 = SizeKt.Size(Size.m1505getWidthimpl(Canvas.mo2108getSizeNHjbRc()), Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc()));
                ContentScale.Companion companion = ContentScale.INSTANCE;
                ContentScale inside = companion.getInside();
                ContentScale contentScale = this.f37855OooO0o0;
                if (Intrinsics.areEqual(contentScale, inside)) {
                    if (Size.m1505getWidthimpl(jSize) > Size.m1505getWidthimpl(jSize2) || Size.m1502getHeightimpl(jSize) > Size.m1502getHeightimpl(jSize2)) {
                        float fMin = Math.min(Size.m1505getWidthimpl(jSize2) / Size.m1505getWidthimpl(jSize), Size.m1502getHeightimpl(jSize2) / Size.m1502getHeightimpl(jSize));
                        jScaleFactor = ScaleFactorKt.ScaleFactor(fMin, fMin);
                    } else {
                        jScaleFactor = ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
                    }
                } else if (Intrinsics.areEqual(contentScale, companion.getCrop())) {
                    float fMax = Math.max(Size.m1505getWidthimpl(jSize2) / Size.m1505getWidthimpl(jSize), Size.m1502getHeightimpl(jSize2) / Size.m1502getHeightimpl(jSize));
                    jScaleFactor = ScaleFactorKt.ScaleFactor(fMax, fMax);
                } else {
                    float fMin2 = Math.min(Size.m1505getWidthimpl(jSize2) / Size.m1505getWidthimpl(jSize), Size.m1502getHeightimpl(jSize2) / Size.m1502getHeightimpl(jSize));
                    jScaleFactor = ScaleFactorKt.ScaleFactor(fMin2, fMin2);
                }
                long jSize3 = SizeKt.Size(ScaleFactor.m2857getScaleXimpl(jScaleFactor) * Size.m1505getWidthimpl(jSize), ScaleFactor.m2858getScaleYimpl(jScaleFactor) * Size.m1502getHeightimpl(jSize));
                float f = 2;
                long jOffset = OffsetKt.Offset((Size.m1505getWidthimpl(jSize2) - Size.m1505getWidthimpl(jSize3)) / f, (Size.m1502getHeightimpl(jSize2) - Size.m1502getHeightimpl(jSize3)) / f);
                int iM1505getWidthimpl = (int) Size.m1505getWidthimpl(jSize3);
                int iM1502getHeightimpl = (int) Size.m1502getHeightimpl(jSize3);
                Intrinsics.checkNotNullParameter(value, "<this>");
                if (value instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) value;
                    if (bitmapDrawable.getBitmap() == null) {
                        throw new IllegalArgumentException("bitmap is null");
                    }
                    if (iM1505getWidthimpl == bitmapDrawable.getBitmap().getWidth() && iM1502getHeightimpl == bitmapDrawable.getBitmap().getHeight()) {
                        bitmap = bitmapDrawable.getBitmap();
                        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                    } else {
                        bitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), iM1505getWidthimpl, iM1502getHeightimpl, true);
                        Intrinsics.checkNotNullExpressionValue(bitmap, "createScaledBitmap(bitmap, width, height, true)");
                    }
                } else {
                    Rect bounds = value.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
                    int i = bounds.left;
                    int i2 = bounds.top;
                    int i3 = bounds.right;
                    int i4 = bounds.bottom;
                    Bitmap bitmap2 = Bitmap.createBitmap(iM1505getWidthimpl, iM1502getHeightimpl, Bitmap.Config.ARGB_8888);
                    value.setBounds(0, 0, iM1505getWidthimpl, iM1502getHeightimpl);
                    value.draw(new Canvas(bitmap2));
                    value.setBounds(i, i2, i3, i4);
                    Intrinsics.checkNotNullExpressionValue(bitmap2, "bitmap");
                    bitmap = bitmap2;
                }
                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoOO(Canvas, AndroidImageBitmap_androidKt.asImageBitmap(bitmap), jOffset, 0.0f, null, null, 0, 60, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37856OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f37857OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ContentScale f37858OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f37859OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f37860OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37861OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f37862OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Modifier f37863OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f37864OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f37865OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(int i, long j, ContentScale contentScale, int i2, Function0<Unit> function0, Function0<Unit> function1, Function1<? super Integer, Unit> function2, Modifier modifier, int i3, int i4) {
            super(2);
            this.f37857OooO0Oo = i;
            this.f37859OooO0o0 = j;
            this.f37858OooO0o = contentScale;
            this.f37860OooO0oO = i2;
            this.f37861OooO0oo = function0;
            this.f37856OooO = function1;
            this.f37862OooOO0 = function2;
            this.f37863OooOO0O = modifier;
            this.f37864OooOO0o = i3;
            this.f37865OooOOO0 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00Ooo.OooO00o(this.f37857OooO0Oo, this.f37859OooO0o0, this.f37858OooO0o, this.f37860OooO0oO, this.f37861OooO0oo, this.f37856OooO, this.f37862OooOO0, this.f37863OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37864OooOO0o | 1), this.f37865OooOOO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0177  */
    /* JADX WARN: Code duplicated, block: B:121:0x0193 A[Catch: Exception -> 0x01a0, LOOP:0: B:120:0x0191->B:121:0x0193, LOOP_END, TryCatch #0 {Exception -> 0x01a0, blocks: (B:119:0x017e, B:121:0x0193, B:122:0x019c), top: B:152:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:137:0x022b  */
    /* JADX WARN: Code duplicated, block: B:140:0x024a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0250  */
    /* JADX WARN: Code duplicated, block: B:145:0x0267  */
    /* JADX WARN: Code duplicated, block: B:150:0x0273  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@ArrayRes int i, long j, @Nullable ContentScale contentScale, int i2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function1<? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Composer composer, int i3, int i4) {
        int i5;
        int i6;
        ContentScale contentScale2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Function0<Unit> function3;
        int i12;
        int i13;
        int i14;
        int i15;
        Function1<? super Integer, Unit> function4;
        int i16;
        int i17;
        int i18;
        ContentScale fit;
        int i19;
        Function0<Unit> function5;
        Function0<Unit> function6;
        Function1<? super Integer, Unit> function7;
        Modifier modifier2;
        Context context;
        boolean zChanged;
        Object objRememberedValue;
        int i20;
        int[] iArr;
        TypedArray typedArrayObtainTypedArray;
        int length;
        int[] iArr2;
        int i21;
        Context context2;
        Object objRememberedValue2;
        Composer.Companion companion;
        MutableState mutableState;
        boolean zChanged2;
        Object objRememberedValue3;
        int i22;
        ContentScale contentScale3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1670476034);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) == 0) {
            if ((i3 & 112) == 0) {
                i5 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 896) == 0) {
                    contentScale2 = contentScale;
                    if (composerStartRestartGroup.changed(contentScale2)) {
                        i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 7168) == 0) {
                        i9 = i2;
                        if (composerStartRestartGroup.changed(i9)) {
                            i10 = 2048;
                        } else {
                            i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i5 |= i10;
                    }
                    i11 = i4 & 16;
                    if (i11 != 0) {
                        if ((i3 & 57344) == 0) {
                            function3 = function0;
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i12 = 16384;
                            } else {
                                i12 = 8192;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 32;
                        if (i13 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i5 |= i14;
                        }
                        i15 = i4 & 64;
                        if (i15 != 0) {
                            i5 |= 1572864;
                            function4 = function2;
                        } else {
                            function4 = function2;
                            if ((i3 & 3670016) == 0) {
                                if (composerStartRestartGroup.changedInstance(function4)) {
                                    i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                                } else {
                                    i16 = 524288;
                                }
                                i5 |= i16;
                            }
                        }
                        i17 = i4 & 128;
                        if (i17 != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(modifier)) {
                                i18 = 8388608;
                            } else {
                                i18 = Configuration.BLOCK_SIZE;
                            }
                            i5 |= i18;
                        }
                        if ((i5 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i6 != 0) {
                                fit = ContentScale.INSTANCE.getFit();
                            } else {
                                fit = contentScale2;
                            }
                            if (i8 != 0) {
                                i19 = 2147483646;
                            } else {
                                i19 = i9;
                            }
                            if (i11 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i13 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i15 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                            }
                            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            Integer numValueOf = Integer.valueOf(i);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Intrinsics.checkNotNullParameter(context, "<this>");
                                iArr = new int[0];
                                try {
                                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                                    length = typedArrayObtainTypedArray.length();
                                    iArr = new int[length];
                                    for (i20 = 0; i20 < length; i20++) {
                                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                                    }
                                    typedArrayObtainTypedArray.recycle();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                objRememberedValue = iArr;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            iArr2 = (int[]) objRememberedValue;
                            int i23 = (i5 & 112) | 8;
                            int i24 = i5 >> 3;
                            i21 = (i24 & 458752) | i23 | (i24 & 896) | (i24 & 7168) | (57344 & i24);
                            composerStartRestartGroup.startReplaceableGroup(409503362);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                            }
                            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                if (function5 != null) {
                                    function5.invoke();
                                }
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierClipToBounds = ClipKt.clipToBounds(modifier2);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new OooO00o(mutableState, fit);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierClipToBounds, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i22 = i19;
                            contentScale3 = fit;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            contentScale3 = contentScale2;
                            i22 = i9;
                            function7 = function4;
                            function5 = function3;
                            function6 = function1;
                            modifier2 = modifier;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
                    }
                    i5 |= 24576;
                    function3 = function0;
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                        function4 = function2;
                    } else {
                        function4 = function2;
                        if ((i3 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i16 = 524288;
                            }
                            i5 |= i16;
                        }
                    }
                    i17 = i4 & 128;
                    if (i17 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i18 = 8388608;
                        } else {
                            i18 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i18;
                    }
                    if ((i5 & 23967451) == 4793490) {
                        if (i6 != 0) {
                            fit = ContentScale.INSTANCE.getFit();
                        } else {
                            fit = contentScale2;
                        }
                        if (i8 != 0) {
                            i19 = 2147483646;
                        } else {
                            i19 = i9;
                        }
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Integer numValueOf2 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iArr2 = (int[]) objRememberedValue;
                        int i25 = (i5 & 112) | 8;
                        int i26 = i5 >> 3;
                        i21 = (i26 & 458752) | i25 | (i26 & 896) | (i26 & 7168) | (57344 & i26);
                        composerStartRestartGroup.startReplaceableGroup(409503362);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                        }
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            if (function5 != null) {
                                function5.invoke();
                            }
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClipToBounds2 = ClipKt.clipToBounds(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierClipToBounds2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i22 = i19;
                        contentScale3 = fit;
                    } else {
                        if (i6 != 0) {
                            fit = ContentScale.INSTANCE.getFit();
                        } else {
                            fit = contentScale2;
                        }
                        if (i8 != 0) {
                            i19 = 2147483646;
                        } else {
                            i19 = i9;
                        }
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Integer numValueOf3 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iArr2 = (int[]) objRememberedValue;
                        int i27 = (i5 & 112) | 8;
                        int i28 = i5 >> 3;
                        i21 = (i28 & 458752) | i27 | (i28 & 896) | (i28 & 7168) | (57344 & i28);
                        composerStartRestartGroup.startReplaceableGroup(409503362);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                        }
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            if (function5 != null) {
                                function5.invoke();
                            }
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClipToBounds3 = ClipKt.clipToBounds(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierClipToBounds3, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i22 = i19;
                        contentScale3 = fit;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
                }
                i5 |= 3072;
                i9 = i2;
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((i3 & 57344) == 0) {
                        function3 = function0;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                        function4 = function2;
                    } else {
                        function4 = function2;
                        if ((i3 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i16 = 524288;
                            }
                            i5 |= i16;
                        }
                    }
                    i17 = i4 & 128;
                    if (i17 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i18 = 8388608;
                        } else {
                            i18 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i18;
                    }
                    if ((i5 & 23967451) == 4793490) {
                        if (i6 != 0) {
                            fit = ContentScale.INSTANCE.getFit();
                        } else {
                            fit = contentScale2;
                        }
                        if (i8 != 0) {
                            i19 = 2147483646;
                        } else {
                            i19 = i9;
                        }
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Integer numValueOf4 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iArr2 = (int[]) objRememberedValue;
                        int i29 = (i5 & 112) | 8;
                        int i210 = i5 >> 3;
                        i21 = (i210 & 458752) | i29 | (i210 & 896) | (i210 & 7168) | (57344 & i210);
                        composerStartRestartGroup.startReplaceableGroup(409503362);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                        }
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            if (function5 != null) {
                                function5.invoke();
                            }
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClipToBounds4 = ClipKt.clipToBounds(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierClipToBounds4, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i22 = i19;
                        contentScale3 = fit;
                    } else {
                        if (i6 != 0) {
                            fit = ContentScale.INSTANCE.getFit();
                        } else {
                            fit = contentScale2;
                        }
                        if (i8 != 0) {
                            i19 = 2147483646;
                        } else {
                            i19 = i9;
                        }
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Integer numValueOf5 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf5);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iArr2 = (int[]) objRememberedValue;
                        int i211 = (i5 & 112) | 8;
                        int i212 = i5 >> 3;
                        i21 = (i212 & 458752) | i211 | (i212 & 896) | (i212 & 7168) | (57344 & i212);
                        composerStartRestartGroup.startReplaceableGroup(409503362);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                        }
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            if (function5 != null) {
                                function5.invoke();
                            }
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClipToBounds5 = ClipKt.clipToBounds(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierClipToBounds5, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i22 = i19;
                        contentScale3 = fit;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
                }
                i5 |= 24576;
                function3 = function0;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                }
                i17 = i4 & 128;
                if (i17 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i18 = 8388608;
                    } else {
                        i18 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i18;
                }
                if ((i5 & 23967451) == 4793490) {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf6 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf6);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i213 = (i5 & 112) | 8;
                    int i214 = i5 >> 3;
                    i21 = (i214 & 458752) | i213 | (i214 & 896) | (i214 & 7168) | (57344 & i214);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds6 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds6, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                } else {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf7 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf7);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i215 = (i5 & 112) | 8;
                    int i216 = i5 >> 3;
                    i21 = (i216 & 458752) | i215 | (i216 & 896) | (i216 & 7168) | (57344 & i216);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds7 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds7, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
            }
            i5 |= 384;
            contentScale2 = contentScale;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    i9 = i2;
                    if (composerStartRestartGroup.changed(i9)) {
                        i10 = 2048;
                    } else {
                        i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i10;
                }
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((i3 & 57344) == 0) {
                        function3 = function0;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                        function4 = function2;
                    } else {
                        function4 = function2;
                        if ((i3 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i16 = 524288;
                            }
                            i5 |= i16;
                        }
                    }
                    i17 = i4 & 128;
                    if (i17 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i18 = 8388608;
                        } else {
                            i18 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i18;
                    }
                    if ((i5 & 23967451) == 4793490) {
                        if (i6 != 0) {
                            fit = ContentScale.INSTANCE.getFit();
                        } else {
                            fit = contentScale2;
                        }
                        if (i8 != 0) {
                            i19 = 2147483646;
                        } else {
                            i19 = i9;
                        }
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Integer numValueOf8 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf8);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iArr2 = (int[]) objRememberedValue;
                        int i217 = (i5 & 112) | 8;
                        int i218 = i5 >> 3;
                        i21 = (i218 & 458752) | i217 | (i218 & 896) | (i218 & 7168) | (57344 & i218);
                        composerStartRestartGroup.startReplaceableGroup(409503362);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                        }
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            if (function5 != null) {
                                function5.invoke();
                            }
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClipToBounds8 = ClipKt.clipToBounds(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierClipToBounds8, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i22 = i19;
                        contentScale3 = fit;
                    } else {
                        if (i6 != 0) {
                            fit = ContentScale.INSTANCE.getFit();
                        } else {
                            fit = contentScale2;
                        }
                        if (i8 != 0) {
                            i19 = 2147483646;
                        } else {
                            i19 = i9;
                        }
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Integer numValueOf9 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf9);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iArr2 = (int[]) objRememberedValue;
                        int i219 = (i5 & 112) | 8;
                        int i2110 = i5 >> 3;
                        i21 = (i2110 & 458752) | i219 | (i2110 & 896) | (i2110 & 7168) | (57344 & i2110);
                        composerStartRestartGroup.startReplaceableGroup(409503362);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                        }
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            if (function5 != null) {
                                function5.invoke();
                            }
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClipToBounds9 = ClipKt.clipToBounds(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierClipToBounds9, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i22 = i19;
                        contentScale3 = fit;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
                }
                i5 |= 24576;
                function3 = function0;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                }
                i17 = i4 & 128;
                if (i17 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i18 = 8388608;
                    } else {
                        i18 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i18;
                }
                if ((i5 & 23967451) == 4793490) {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf10 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf10);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i2111 = (i5 & 112) | 8;
                    int i2112 = i5 >> 3;
                    i21 = (i2112 & 458752) | i2111 | (i2112 & 896) | (i2112 & 7168) | (57344 & i2112);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds10 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds10, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                } else {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf11 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf11);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i2113 = (i5 & 112) | 8;
                    int i2114 = i5 >> 3;
                    i21 = (i2114 & 458752) | i2113 | (i2114 & 896) | (i2114 & 7168) | (57344 & i2114);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds11 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds11, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
            }
            i5 |= 3072;
            i9 = i2;
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((i3 & 57344) == 0) {
                    function3 = function0;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                }
                i17 = i4 & 128;
                if (i17 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i18 = 8388608;
                    } else {
                        i18 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i18;
                }
                if ((i5 & 23967451) == 4793490) {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf12 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf12);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i2115 = (i5 & 112) | 8;
                    int i2116 = i5 >> 3;
                    i21 = (i2116 & 458752) | i2115 | (i2116 & 896) | (i2116 & 7168) | (57344 & i2116);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds12 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds12, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                } else {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf13 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf13);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i2117 = (i5 & 112) | 8;
                    int i2118 = i5 >> 3;
                    i21 = (i2118 & 458752) | i2117 | (i2118 & 896) | (i2118 & 7168) | (57344 & i2118);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds13 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds13, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
            }
            i5 |= 24576;
            function3 = function0;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
            }
            i17 = i4 & 128;
            if (i17 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i18 = 8388608;
                } else {
                    i18 = Configuration.BLOCK_SIZE;
                }
                i5 |= i18;
            }
            if ((i5 & 23967451) == 4793490) {
                if (i6 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (i8 != 0) {
                    i19 = 2147483646;
                } else {
                    i19 = i9;
                }
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Integer numValueOf14 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf14);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iArr2 = (int[]) objRememberedValue;
                int i2119 = (i5 & 112) | 8;
                int i21110 = i5 >> 3;
                i21 = (i21110 & 458752) | i2119 | (i21110 & 896) | (i21110 & 7168) | (57344 & i21110);
                composerStartRestartGroup.startReplaceableGroup(409503362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                }
                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    if (function5 != null) {
                        function5.invoke();
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClipToBounds14 = ClipKt.clipToBounds(modifier2);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierClipToBounds14, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i22 = i19;
                contentScale3 = fit;
            } else {
                if (i6 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (i8 != 0) {
                    i19 = 2147483646;
                } else {
                    i19 = i9;
                }
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Integer numValueOf15 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf15);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iArr2 = (int[]) objRememberedValue;
                int i21111 = (i5 & 112) | 8;
                int i21112 = i5 >> 3;
                i21 = (i21112 & 458752) | i21111 | (i21112 & 896) | (i21112 & 7168) | (57344 & i21112);
                composerStartRestartGroup.startReplaceableGroup(409503362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                }
                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    if (function5 != null) {
                        function5.invoke();
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClipToBounds15 = ClipKt.clipToBounds(modifier2);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierClipToBounds15, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i22 = i19;
                contentScale3 = fit;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
        }
        i5 |= 48;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 896) == 0) {
                contentScale2 = contentScale;
                if (composerStartRestartGroup.changed(contentScale2)) {
                    i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    i9 = i2;
                    if (composerStartRestartGroup.changed(i9)) {
                        i10 = 2048;
                    } else {
                        i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i10;
                }
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((i3 & 57344) == 0) {
                        function3 = function0;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                        function4 = function2;
                    } else {
                        function4 = function2;
                        if ((i3 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i16 = 524288;
                            }
                            i5 |= i16;
                        }
                    }
                    i17 = i4 & 128;
                    if (i17 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i18 = 8388608;
                        } else {
                            i18 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i18;
                    }
                    if ((i5 & 23967451) == 4793490) {
                        if (i6 != 0) {
                            fit = ContentScale.INSTANCE.getFit();
                        } else {
                            fit = contentScale2;
                        }
                        if (i8 != 0) {
                            i19 = 2147483646;
                        } else {
                            i19 = i9;
                        }
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Integer numValueOf16 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf16);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iArr2 = (int[]) objRememberedValue;
                        int i21113 = (i5 & 112) | 8;
                        int i21114 = i5 >> 3;
                        i21 = (i21114 & 458752) | i21113 | (i21114 & 896) | (i21114 & 7168) | (57344 & i21114);
                        composerStartRestartGroup.startReplaceableGroup(409503362);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                        }
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            if (function5 != null) {
                                function5.invoke();
                            }
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClipToBounds16 = ClipKt.clipToBounds(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierClipToBounds16, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i22 = i19;
                        contentScale3 = fit;
                    } else {
                        if (i6 != 0) {
                            fit = ContentScale.INSTANCE.getFit();
                        } else {
                            fit = contentScale2;
                        }
                        if (i8 != 0) {
                            i19 = 2147483646;
                        } else {
                            i19 = i9;
                        }
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i15 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Integer numValueOf17 = Integer.valueOf(i);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf17);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            Intrinsics.checkNotNullParameter(context, "<this>");
                            iArr = new int[0];
                            typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                            length = typedArrayObtainTypedArray.length();
                            iArr = new int[length];
                            while (i20 < length) {
                                iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                            }
                            typedArrayObtainTypedArray.recycle();
                            objRememberedValue = iArr;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iArr2 = (int[]) objRememberedValue;
                        int i21115 = (i5 & 112) | 8;
                        int i21116 = i5 >> 3;
                        i21 = (i21116 & 458752) | i21115 | (i21116 & 896) | (i21116 & 7168) | (57344 & i21116);
                        composerStartRestartGroup.startReplaceableGroup(409503362);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                        }
                        context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            if (function5 != null) {
                                function5.invoke();
                            }
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClipToBounds17 = ClipKt.clipToBounds(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState, fit);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierClipToBounds17, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i22 = i19;
                        contentScale3 = fit;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
                }
                i5 |= 24576;
                function3 = function0;
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                }
                i17 = i4 & 128;
                if (i17 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i18 = 8388608;
                    } else {
                        i18 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i18;
                }
                if ((i5 & 23967451) == 4793490) {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf18 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf18);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i21117 = (i5 & 112) | 8;
                    int i21118 = i5 >> 3;
                    i21 = (i21118 & 458752) | i21117 | (i21118 & 896) | (i21118 & 7168) | (57344 & i21118);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds18 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds18, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                } else {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf19 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf19);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i21119 = (i5 & 112) | 8;
                    int i211110 = i5 >> 3;
                    i21 = (i211110 & 458752) | i21119 | (i211110 & 896) | (i211110 & 7168) | (57344 & i211110);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds19 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds19, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
            }
            i5 |= 3072;
            i9 = i2;
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((i3 & 57344) == 0) {
                    function3 = function0;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                }
                i17 = i4 & 128;
                if (i17 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i18 = 8388608;
                    } else {
                        i18 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i18;
                }
                if ((i5 & 23967451) == 4793490) {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf110 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf110);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i211111 = (i5 & 112) | 8;
                    int i211112 = i5 >> 3;
                    i21 = (i211112 & 458752) | i211111 | (i211112 & 896) | (i211112 & 7168) | (57344 & i211112);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds110 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds110, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                } else {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf111 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf111);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i211113 = (i5 & 112) | 8;
                    int i211114 = i5 >> 3;
                    i21 = (i211114 & 458752) | i211113 | (i211114 & 896) | (i211114 & 7168) | (57344 & i211114);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds111 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds111, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
            }
            i5 |= 24576;
            function3 = function0;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
            }
            i17 = i4 & 128;
            if (i17 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i18 = 8388608;
                } else {
                    i18 = Configuration.BLOCK_SIZE;
                }
                i5 |= i18;
            }
            if ((i5 & 23967451) == 4793490) {
                if (i6 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (i8 != 0) {
                    i19 = 2147483646;
                } else {
                    i19 = i9;
                }
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Integer numValueOf112 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf112);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iArr2 = (int[]) objRememberedValue;
                int i211115 = (i5 & 112) | 8;
                int i211116 = i5 >> 3;
                i21 = (i211116 & 458752) | i211115 | (i211116 & 896) | (i211116 & 7168) | (57344 & i211116);
                composerStartRestartGroup.startReplaceableGroup(409503362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                }
                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    if (function5 != null) {
                        function5.invoke();
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClipToBounds112 = ClipKt.clipToBounds(modifier2);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierClipToBounds112, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i22 = i19;
                contentScale3 = fit;
            } else {
                if (i6 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (i8 != 0) {
                    i19 = 2147483646;
                } else {
                    i19 = i9;
                }
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Integer numValueOf113 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf113);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iArr2 = (int[]) objRememberedValue;
                int i211117 = (i5 & 112) | 8;
                int i211118 = i5 >> 3;
                i21 = (i211118 & 458752) | i211117 | (i211118 & 896) | (i211118 & 7168) | (57344 & i211118);
                composerStartRestartGroup.startReplaceableGroup(409503362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                }
                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    if (function5 != null) {
                        function5.invoke();
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClipToBounds113 = ClipKt.clipToBounds(modifier2);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierClipToBounds113, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i22 = i19;
                contentScale3 = fit;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
        }
        i5 |= 384;
        contentScale2 = contentScale;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 7168) == 0) {
                i9 = i2;
                if (composerStartRestartGroup.changed(i9)) {
                    i10 = 2048;
                } else {
                    i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i5 |= i10;
            }
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((i3 & 57344) == 0) {
                    function3 = function0;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                }
                i17 = i4 & 128;
                if (i17 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i18 = 8388608;
                    } else {
                        i18 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i18;
                }
                if ((i5 & 23967451) == 4793490) {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf114 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf114);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i211119 = (i5 & 112) | 8;
                    int i2111110 = i5 >> 3;
                    i21 = (i2111110 & 458752) | i211119 | (i2111110 & 896) | (i2111110 & 7168) | (57344 & i2111110);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds114 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds114, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                } else {
                    if (i6 != 0) {
                        fit = ContentScale.INSTANCE.getFit();
                    } else {
                        fit = contentScale2;
                    }
                    if (i8 != 0) {
                        i19 = 2147483646;
                    } else {
                        i19 = i9;
                    }
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i15 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Integer numValueOf115 = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf115);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        iArr = new int[0];
                        typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                        length = typedArrayObtainTypedArray.length();
                        iArr = new int[length];
                        while (i20 < length) {
                            iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                        }
                        typedArrayObtainTypedArray.recycle();
                        objRememberedValue = iArr;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iArr2 = (int[]) objRememberedValue;
                    int i2111111 = (i5 & 112) | 8;
                    int i2111112 = i5 >> 3;
                    i21 = (i2111112 & 458752) | i2111111 | (i2111112 & 896) | (i2111112 & 7168) | (57344 & i2111112);
                    composerStartRestartGroup.startReplaceableGroup(409503362);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                    }
                    context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        if (function5 != null) {
                            function5.invoke();
                        }
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClipToBounds115 = ClipKt.clipToBounds(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState, fit);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierClipToBounds115, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i22 = i19;
                    contentScale3 = fit;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
            }
            i5 |= 24576;
            function3 = function0;
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
            }
            i17 = i4 & 128;
            if (i17 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i18 = 8388608;
                } else {
                    i18 = Configuration.BLOCK_SIZE;
                }
                i5 |= i18;
            }
            if ((i5 & 23967451) == 4793490) {
                if (i6 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (i8 != 0) {
                    i19 = 2147483646;
                } else {
                    i19 = i9;
                }
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Integer numValueOf116 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf116);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iArr2 = (int[]) objRememberedValue;
                int i2111113 = (i5 & 112) | 8;
                int i2111114 = i5 >> 3;
                i21 = (i2111114 & 458752) | i2111113 | (i2111114 & 896) | (i2111114 & 7168) | (57344 & i2111114);
                composerStartRestartGroup.startReplaceableGroup(409503362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                }
                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    if (function5 != null) {
                        function5.invoke();
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClipToBounds116 = ClipKt.clipToBounds(modifier2);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierClipToBounds116, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i22 = i19;
                contentScale3 = fit;
            } else {
                if (i6 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (i8 != 0) {
                    i19 = 2147483646;
                } else {
                    i19 = i9;
                }
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Integer numValueOf117 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf117);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iArr2 = (int[]) objRememberedValue;
                int i2111115 = (i5 & 112) | 8;
                int i2111116 = i5 >> 3;
                i21 = (i2111116 & 458752) | i2111115 | (i2111116 & 896) | (i2111116 & 7168) | (57344 & i2111116);
                composerStartRestartGroup.startReplaceableGroup(409503362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                }
                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    if (function5 != null) {
                        function5.invoke();
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClipToBounds117 = ClipKt.clipToBounds(modifier2);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierClipToBounds117, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i22 = i19;
                contentScale3 = fit;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
        }
        i5 |= 3072;
        i9 = i2;
        i11 = i4 & 16;
        if (i11 != 0) {
            if ((i3 & 57344) == 0) {
                function3 = function0;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i5 |= i12;
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
            }
            i17 = i4 & 128;
            if (i17 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i18 = 8388608;
                } else {
                    i18 = Configuration.BLOCK_SIZE;
                }
                i5 |= i18;
            }
            if ((i5 & 23967451) == 4793490) {
                if (i6 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (i8 != 0) {
                    i19 = 2147483646;
                } else {
                    i19 = i9;
                }
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Integer numValueOf118 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf118);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iArr2 = (int[]) objRememberedValue;
                int i2111117 = (i5 & 112) | 8;
                int i2111118 = i5 >> 3;
                i21 = (i2111118 & 458752) | i2111117 | (i2111118 & 896) | (i2111118 & 7168) | (57344 & i2111118);
                composerStartRestartGroup.startReplaceableGroup(409503362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                }
                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    if (function5 != null) {
                        function5.invoke();
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClipToBounds118 = ClipKt.clipToBounds(modifier2);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierClipToBounds118, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i22 = i19;
                contentScale3 = fit;
            } else {
                if (i6 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (i8 != 0) {
                    i19 = 2147483646;
                } else {
                    i19 = i9;
                }
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i15 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Integer numValueOf119 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf119);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    iArr = new int[0];
                    typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                    length = typedArrayObtainTypedArray.length();
                    iArr = new int[length];
                    while (i20 < length) {
                        iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                    }
                    typedArrayObtainTypedArray.recycle();
                    objRememberedValue = iArr;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iArr2 = (int[]) objRememberedValue;
                int i2111119 = (i5 & 112) | 8;
                int i21111110 = i5 >> 3;
                i21 = (i21111110 & 458752) | i2111119 | (i21111110 & 896) | (i21111110 & 7168) | (57344 & i21111110);
                composerStartRestartGroup.startReplaceableGroup(409503362);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
                }
                context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    if (function5 != null) {
                        function5.invoke();
                    }
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClipToBounds119 = ClipKt.clipToBounds(modifier2);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState, fit);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierClipToBounds119, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i22 = i19;
                contentScale3 = fit;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
        }
        i5 |= 24576;
        function3 = function0;
        i13 = i4 & 32;
        if (i13 != 0) {
            i5 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        }
        i15 = i4 & 64;
        if (i15 != 0) {
            i5 |= 1572864;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
        }
        i17 = i4 & 128;
        if (i17 != 0) {
            i5 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(modifier)) {
                i18 = 8388608;
            } else {
                i18 = Configuration.BLOCK_SIZE;
            }
            i5 |= i18;
        }
        if ((i5 & 23967451) == 4793490) {
            if (i6 != 0) {
                fit = ContentScale.INSTANCE.getFit();
            } else {
                fit = contentScale2;
            }
            if (i8 != 0) {
                i19 = 2147483646;
            } else {
                i19 = i9;
            }
            if (i11 != 0) {
                function5 = null;
            } else {
                function5 = function3;
            }
            if (i13 != 0) {
                function6 = null;
            } else {
                function6 = function1;
            }
            if (i15 != 0) {
                function7 = null;
            } else {
                function7 = function4;
            }
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Integer numValueOf1110 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf1110);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                Intrinsics.checkNotNullParameter(context, "<this>");
                iArr = new int[0];
                typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                length = typedArrayObtainTypedArray.length();
                iArr = new int[length];
                while (i20 < length) {
                    iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                }
                typedArrayObtainTypedArray.recycle();
                objRememberedValue = iArr;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                Intrinsics.checkNotNullParameter(context, "<this>");
                iArr = new int[0];
                typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                length = typedArrayObtainTypedArray.length();
                iArr = new int[length];
                while (i20 < length) {
                    iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                }
                typedArrayObtainTypedArray.recycle();
                objRememberedValue = iArr;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            iArr2 = (int[]) objRememberedValue;
            int i21111111 = (i5 & 112) | 8;
            int i21111112 = i5 >> 3;
            i21 = (i21111112 & 458752) | i21111111 | (i21111112 & 896) | (i21111112 & 7168) | (57344 & i21111112);
            composerStartRestartGroup.startReplaceableGroup(409503362);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
            }
            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                if (function5 != null) {
                    function5.invoke();
                }
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClipToBounds1110 = ClipKt.clipToBounds(modifier2);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new OooO00o(mutableState, fit);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new OooO00o(mutableState, fit);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierClipToBounds1110, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i22 = i19;
            contentScale3 = fit;
        } else {
            if (i6 != 0) {
                fit = ContentScale.INSTANCE.getFit();
            } else {
                fit = contentScale2;
            }
            if (i8 != 0) {
                i19 = 2147483646;
            } else {
                i19 = i9;
            }
            if (i11 != 0) {
                function5 = null;
            } else {
                function5 = function3;
            }
            if (i13 != 0) {
                function6 = null;
            } else {
                function6 = function1;
            }
            if (i15 != 0) {
                function7 = null;
            } else {
                function7 = function4;
            }
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1670476034, i5, -1, "com.code.android.uikit.FrameAnim (FrameAnimations.kt:70)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Integer numValueOf1111 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf1111);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                Intrinsics.checkNotNullParameter(context, "<this>");
                iArr = new int[0];
                typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                length = typedArrayObtainTypedArray.length();
                iArr = new int[length];
                while (i20 < length) {
                    iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                }
                typedArrayObtainTypedArray.recycle();
                objRememberedValue = iArr;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                Intrinsics.checkNotNullParameter(context, "<this>");
                iArr = new int[0];
                typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
                length = typedArrayObtainTypedArray.length();
                iArr = new int[length];
                while (i20 < length) {
                    iArr[i20] = typedArrayObtainTypedArray.getResourceId(i20, -1);
                }
                typedArrayObtainTypedArray.recycle();
                objRememberedValue = iArr;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            iArr2 = (int[]) objRememberedValue;
            int i21111113 = (i5 & 112) | 8;
            int i21111114 = i5 >> 3;
            i21 = (i21111114 & 458752) | i21111113 | (i21111114 & 896) | (i21111114 & 7168) | (57344 & i21111114);
            composerStartRestartGroup.startReplaceableGroup(409503362);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(409503362, i21, -1, "com.code.android.uikit.frameAnimWithDrawable (FrameAnimations.kt:133)");
            }
            context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                if (function5 != null) {
                    function5.invoke();
                }
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o00Oo0.OooO00o(context2, iArr2[0]), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            EffectsKt.LaunchedEffect(iArr2, new oo000o(j, iArr2, i19, function7, function6, mutableState, context2, null), composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClipToBounds1111 = ClipKt.clipToBounds(modifier2);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fit);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new OooO00o(mutableState, fit);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new OooO00o(mutableState, fit);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierClipToBounds1111, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i22 = i19;
            contentScale3 = fit;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, j, contentScale3, i22, function5, function6, function7, modifier2, i3, i4));
    }
}
