package p507o0o00ooo;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o000OO0O;
import com.code.android.util.o0O0O00;
import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p417o0OoO0.o0000Ooo;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEditComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditComp.kt\ncom/yalla/yalla/ui/composable/common/EditComp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,209:1\n154#2:210\n154#2:211\n154#2:276\n154#2:286\n154#2:287\n25#3:212\n456#3,8:235\n464#3,3:249\n25#3:253\n50#3:260\n49#3:261\n50#3:268\n49#3:269\n83#3,3:277\n50#3:288\n49#3:289\n467#3,3:296\n1097#4,6:213\n1097#4,6:254\n1097#4,6:262\n1097#4,6:270\n1097#4,6:280\n1097#4,6:290\n67#5,5:219\n72#5:252\n76#5:300\n78#6,11:224\n91#6:299\n4144#7,6:243\n81#8:301\n107#8,2:302\n81#8:304\n*S KotlinDebug\n*F\n+ 1 EditComp.kt\ncom/yalla/yalla/ui/composable/common/EditComp\n*L\n101#1:210\n103#1:211\n193#1:276\n199#1:286\n200#1:287\n106#1:212\n115#1:235,8\n115#1:249,3\n129#1:253\n130#1:260\n130#1:261\n162#1:268\n162#1:269\n135#1:277,3\n202#1:288\n202#1:289\n115#1:296,3\n106#1:213,6\n129#1:254,6\n130#1:262,6\n162#1:270,6\n135#1:280,6\n202#1:290,6\n115#1:219,5\n115#1:252\n115#1:300\n115#1:224,11\n115#1:299\n115#1:243,6\n105#1:301\n105#1:302,2\n129#1:304\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final x f50308OooO00o = new x();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f50309OooO0O0 = LazyKt.lazy(OooOOOO.f50362OooO0Oo);

    public static final class OooO extends Lambda implements Function1<TextFieldValue, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f50310OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50311OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50312OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f50313OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f50314OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(String str, int i, Function0<Unit> function0, Function1<? super String, Unit> function1, MutableState<TextFieldValue> mutableState) {
            super(1);
            this.f50310OooO0Oo = str;
            this.f50312OooO0o0 = i;
            this.f50311OooO0o = function0;
            this.f50313OooO0oO = function1;
            this.f50314OooO0oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextFieldValue textFieldValue) {
            TextFieldValue it = textFieldValue;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<TextFieldValue> mutableState = this.f50314OooO0oo;
            if (Intrinsics.areEqual(x.OooO0O0(mutableState).getText(), it.getText())) {
                mutableState.setValue(it);
            } else {
                String strOooOoO = StringsKt.OooOoO(new Regex(this.f50310OooO0Oo).replace(it.getText(), ""), "\n", "");
                int length = it.getText().length() - strOooOoO.length();
                TextFieldValue textFieldValueM3523copy3r_uNRQ$default = length == 0 ? it : TextFieldValue.m3523copy3r_uNRQ$default(it, strOooOoO, TextRangeKt.TextRange(TextRange.m3310getStartimpl(it.getSelection()) - length), (TextRange) null, 4, (Object) null);
                int length2 = textFieldValueM3523copy3r_uNRQ$default.getText().length() - this.f50312OooO0o0;
                if (length2 > 0) {
                    long selection = textFieldValueM3523copy3r_uNRQ$default.getSelection();
                    String string = StringsKt.removeRange((CharSequence) textFieldValueM3523copy3r_uNRQ$default.getText(), TextRange.m3310getStartimpl(selection) - length2, TextRange.m3310getStartimpl(selection)).toString();
                    Function0<Unit> function0 = this.f50311OooO0o;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    textFieldValueM3523copy3r_uNRQ$default = TextFieldValue.m3523copy3r_uNRQ$default(textFieldValueM3523copy3r_uNRQ$default, string, TextRangeKt.TextRange(TextRange.m3310getStartimpl(it.getSelection()) - length2), (TextRange) null, 4, (Object) null);
                }
                mutableState.setValue(textFieldValueM3523copy3r_uNRQ$default);
                Function1<String, Unit> function1 = this.f50313OooO0oO;
                if (function1 != null) {
                    function1.invoke(mutableState.getValue().getText());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Function1<? super String, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f50315OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function1<? super String, ? extends Unit> function1) {
            Function1<? super String, ? extends Unit> it = function1;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f50316OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f50317OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super String, Unit> function1, MutableState<TextFieldValue> mutableState) {
            super(1);
            this.f50316OooO0Oo = function1;
            this.f50317OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String text = str;
            Intrinsics.checkNotNullParameter(text, "text");
            MutableState<TextFieldValue> mutableState = this.f50317OooO0o0;
            if (!Intrinsics.areEqual(x.OooO0O0(mutableState).getText(), text)) {
                mutableState.setValue(new TextFieldValue(text, TextRangeKt.TextRange(text.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                Function1<String, Unit> function1 = this.f50316OooO0Oo;
                if (function1 != null) {
                    function1.invoke(text);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.common.EditComp$EditView$3$2$1", f = "EditComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f50318OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<FocusRequester> f50319OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, MutableState<FocusRequester> mutableState, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f50318OooO0Oo = z;
            this.f50319OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f50318OooO0Oo, this.f50319OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f50318OooO0Oo) {
                x xVar = x.f50308OooO00o;
                this.f50319OooO0o0.getValue().requestFocus();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<KeyboardActionScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f50320OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f50321OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function1<? super String, Unit> function1, MutableState<TextFieldValue> mutableState) {
            super(1);
            this.f50320OooO0Oo = function1;
            this.f50321OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyboardActionScope keyboardActionScope) {
            KeyboardActionScope $receiver = keyboardActionScope;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            y listener = new y(this.f50320OooO0Oo, this.f50321OooO0o0);
            Intrinsics.checkNotNullParameter(listener, "listener");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - o000OO0O.f10369OooO00o) > 500) {
                o000OO0O.f10369OooO00o = jCurrentTimeMillis;
                listener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50322OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f50323OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f50324OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f50325OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f50326OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ TextDecoration f50327OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f50328OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f50329OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f50330OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(BoxScopeInstance boxScopeInstance, String str, long j, long j2, TextDecoration textDecoration, int i, int i2, int i3, MutableState mutableState) {
            super(3);
            this.f50323OooO0Oo = boxScopeInstance;
            this.f50325OooO0o0 = str;
            this.f50324OooO0o = j;
            this.f50326OooO0oO = j2;
            this.f50327OooO0oo = textDecoration;
            this.f50322OooO = i;
            this.f50328OooOO0 = i2;
            this.f50329OooOO0O = i3;
            this.f50330OooOO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Composer composer2;
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer3.changedInstance(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1984258957, i, -1, "com.yalla.yalla.ui.composable.common.EditComp.EditView.<anonymous>.<anonymous> (EditComp.kt:175)");
                }
                composer3.startReplaceableGroup(1265178848);
                if (x.OooO0O0(this.f50330OooOO0o).getText().length() == 0) {
                    Modifier modifierAlign = this.f50323OooO0Oo.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                    String str = this.f50325OooO0o0;
                    long j = this.f50324OooO0o;
                    long j2 = this.f50326OooO0oO;
                    TextDecoration textDecoration = this.f50327OooO0oo;
                    TextAlign textAlignM3664boximpl = TextAlign.m3664boximpl(this.f50322OooO);
                    int i2 = this.f50328OooOO0;
                    int i3 = this.f50329OooOO0O;
                    int i4 = i3 >> 9;
                    int i5 = i3 >> 6;
                    composer2 = composer3;
                    TextKt.m1251Text4IGK_g(str, modifierAlign, j, j2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, textDecoration, textAlignM3664boximpl, 0L, 0, false, i2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 896) | (i4 & 14) | (i5 & 7168) | (234881024 & i3) | ((i3 << 6) & 1879048192), i4 & 7168, 122096);
                } else {
                    composer2 = composer3;
                }
                composer2.endReplaceableGroup();
                if (androidx.compose.animation.OooOO0O.OooO00o(i & 14, innerTextField, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f50331OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f50332OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(Function1<? super String, Unit> function1, MutableState<TextFieldValue> mutableState) {
            super(0);
            this.f50331OooO0Oo = function1;
            this.f50332OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TextFieldValue textFieldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
            MutableState<TextFieldValue> mutableState = this.f50332OooO0o0;
            mutableState.setValue(textFieldValue);
            Function1<String, Unit> function1 = this.f50331OooO0Oo;
            if (function1 != null) {
                function1.invoke(x.OooO0O0(mutableState).getText());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<MutableState<TextFieldValue>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f50333OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<TextFieldValue> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f50334OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f50336OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f50337OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Function1<? super String, Unit>, Unit> f50338OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f50339OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ long f50340OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f50341OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f50342OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ long f50343OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ TextDecoration f50344OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ long f50345OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f50346OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ TextDirection f50347OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f50348OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ Drawable f50349OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Shape f50350OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final /* synthetic */ KeyboardOptions f50351OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final /* synthetic */ boolean f50352OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public final /* synthetic */ String f50353OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ long f50354OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50355OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f50356OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Modifier f50357OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ int f50358OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ int f50359OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ int f50360OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final /* synthetic */ int f50361OooOooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, Function1<? super Function1<? super String, Unit>, Unit> function3, String str, long j, long j2, int i, int i2, TextDecoration textDecoration, long j3, long j4, int i3, int i4, TextDirection textDirection, Drawable drawable, boolean z, KeyboardOptions keyboardOptions, String str2, long j5, Shape shape, int i5, Function0<Unit> function0, Modifier modifier, int i6, int i7, int i8, int i9) {
            super(2);
            this.f50337OooO0o0 = function1;
            this.f50336OooO0o = function2;
            this.f50338OooO0oO = function3;
            this.f50339OooO0oo = str;
            this.f50334OooO = j;
            this.f50340OooOO0 = j2;
            this.f50341OooOO0O = i;
            this.f50342OooOO0o = i2;
            this.f50344OooOOO0 = textDecoration;
            this.f50343OooOOO = j3;
            this.f50345OooOOOO = j4;
            this.f50346OooOOOo = i3;
            this.f50348OooOOo0 = i4;
            this.f50347OooOOo = textDirection;
            this.f50349OooOOoo = drawable;
            this.f50352OooOo00 = z;
            this.f50351OooOo0 = keyboardOptions;
            this.f50353OooOo0O = str2;
            this.f50354OooOo0o = j5;
            this.f50350OooOo = shape;
            this.f50356OooOoO0 = i5;
            this.f50355OooOoO = function0;
            this.f50357OooOoOO = modifier;
            this.f50359OooOoo0 = i6;
            this.f50358OooOoo = i7;
            this.f50360OooOooO = i8;
            this.f50361OooOooo = i9;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            x.this.OooO00o(this.f50337OooO0o0, this.f50336OooO0o, this.f50338OooO0oO, this.f50339OooO0oo, this.f50334OooO, this.f50340OooOO0, this.f50341OooOO0O, this.f50342OooOO0o, this.f50344OooOOO0, this.f50343OooOOO, this.f50345OooOOOO, this.f50346OooOOOo, this.f50348OooOOo0, this.f50347OooOOo, this.f50349OooOOoo, this.f50352OooOo00, this.f50351OooOo0, this.f50353OooOo0O, this.f50354OooOo0o, this.f50350OooOo, this.f50356OooOoO0, this.f50355OooOoO, this.f50357OooOoOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50359OooOoo0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.f50358OooOoo), RecomposeScopeImplKt.updateChangedFlags(this.f50360OooOooO), this.f50361OooOooo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f50362OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "[^\\u0030-\\u0039\\u0041-\\u005A\\u0061-\\u007A]*";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TextFieldValue OooO0O0(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super String, Unit> function2, @Nullable Function1<? super Function1<? super String, Unit>, Unit> function3, @Nullable String str, long j, long j2, int i, int i2, @Nullable TextDecoration textDecoration, long j3, long j4, int i3, int i4, @Nullable TextDirection textDirection, @Nullable Drawable drawable, boolean z, @Nullable KeyboardOptions keyboardOptions, @Nullable String str2, long j5, @Nullable Shape shape, int i5, @Nullable Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Composer composer, int i6, int i7, int i8, int i9) {
        long j6;
        int i10;
        int i11;
        int iM3676getStarte0LSkKk;
        long j7;
        int iM3676getStarte0LSkKk2;
        int i12;
        String str3;
        long j8;
        Shape shapeRoundedCornerShape;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1133710339);
        Function1<? super String, Unit> function4 = (i9 & 1) != 0 ? null : function1;
        Function1<? super String, Unit> function5 = (i9 & 2) != 0 ? null : function2;
        Function1<? super Function1<? super String, Unit>, Unit> function6 = (i9 & 4) != 0 ? OooO00o.f50315OooO0Oo : function3;
        String str4 = (i9 & 8) != 0 ? "" : str;
        if ((i9 & 16) != 0) {
            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
            i10 = i6 & (-57345);
        } else {
            j6 = j;
            i10 = i6;
        }
        long sp = (i9 & 32) != 0 ? TextUnitKt.getSp(14) : j2;
        if ((i9 & 64) != 0) {
            i10 &= -3670017;
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = i;
        }
        if ((i9 & 128) != 0) {
            iM3676getStarte0LSkKk = TextAlign.INSTANCE.m3676getStarte0LSkKk();
            i10 &= -29360129;
        } else {
            iM3676getStarte0LSkKk = i2;
        }
        TextDecoration textDecoration2 = (i9 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : textDecoration;
        if ((i9 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            i10 &= -1879048193;
            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
        } else {
            j7 = j3;
        }
        long sp2 = (i9 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? TextUnitKt.getSp(21) : j4;
        int i13 = (i9 & 2048) != 0 ? 1 : i3;
        if ((i9 & 4096) != 0) {
            iM3676getStarte0LSkKk2 = TextAlign.INSTANCE.m3676getStarte0LSkKk();
            i12 = i7 & (-897);
        } else {
            iM3676getStarte0LSkKk2 = i4;
            i12 = i7;
        }
        TextDirection textDirection2 = (i9 & 8192) != 0 ? null : textDirection;
        Drawable drawable2 = (i9 & 16384) != 0 ? null : drawable;
        boolean z2 = (i9 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? false : z;
        KeyboardOptions keyboardOptions2 = (i9 & 65536) != 0 ? new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3468getDoneeUduSuo(), 7, null) : keyboardOptions;
        if ((i9 & 131072) != 0) {
            i12 &= -29360129;
            str3 = (String) f50309OooO0O0.getValue();
        } else {
            str3 = str2;
        }
        if ((i9 & 262144) != 0) {
            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
            i12 &= -234881025;
        } else {
            j8 = j5;
        }
        if ((524288 & i9) != 0) {
            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
            i12 &= -1879048193;
        } else {
            shapeRoundedCornerShape = shape;
        }
        int i14 = (i9 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? 15 : i5;
        Function0<Unit> function7 = (i9 & 2097152) != 0 ? null : function0;
        Modifier modifierPadding = (i9 & Configuration.BLOCK_SIZE) != 0 ? PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(48)), 0.0f, 1, null), PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null)) : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1133710339, i10, i12, "com.yalla.yalla.ui.composable.common.EditComp.EditView (EditComp.kt:76)");
        }
        MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOO.f50333OooO0Oo, composerStartRestartGroup, 3144, 4);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            OooO0O0 oooO0O0 = new OooO0O0(function4, mutableStateRememberSaveable);
            if (function6 != null) {
                function6.invoke(oooO0O0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.updateRememberedValue(oooO0O0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Alignment center = Alignment.INSTANCE.getCenter();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Function1<? super Function1<? super String, Unit>, Unit> function8 = function6;
        Modifier modifier2 = modifierPadding;
        int i15 = i12;
        int i16 = i10;
        Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(companion2.then(modifierPadding), 0.0f, 1, null), 0.0f, 1, null), j8, shapeRoundedCornerShape);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        long j9 = j8;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1878384518);
        if (drawable2 != null) {
            BoxKt.Box(o0000Ooo.OooO00o(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), drawable2, composerStartRestartGroup, 70), composerStartRestartGroup, 0);
            Unit unit2 = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue2;
        Unit unit3 = Unit.INSTANCE;
        boolean zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z2, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zOooO00o || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new OooO0OO(z2, mutableState, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 70);
        TextFieldValue textFieldValue = (TextFieldValue) mutableStateRememberSaveable.getValue();
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(function5) | composerStartRestartGroup.changed(mutableStateRememberSaveable);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new OooO0o(function5, mutableStateRememberSaveable);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        KeyboardActions keyboardActions = new KeyboardActions(null, null, null, null, (Function1) objRememberedValue4, null, 47, null);
        TextStyle textStyle = new TextStyle(j7, sp2, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m3664boximpl(iM3676getStarte0LSkKk2), textDirection2, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16678908, (DefaultConstructorMarker) null);
        Shape shape2 = shapeRoundedCornerShape;
        SolidColor solidColor = new SolidColor(o0oO0O0o.f46993OoooOo0, null);
        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (FocusRequester) mutableState.getValue());
        int i17 = iM3676getStarte0LSkKk2;
        Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(modifierFocusRequester, Dp.m3765constructorimpl(TextAlign.m3667equalsimpl0(i17, TextAlign.INSTANCE.m3671getCentere0LSkKk()) ? 52 : 16), 0.0f, 2, null);
        Object[] objArr = {mutableStateRememberSaveable, str3, Integer.valueOf(i14), function7, function4};
        composerStartRestartGroup.startReplaceableGroup(-568225417);
        int i18 = 0;
        boolean zChanged2 = false;
        for (int i19 = 5; i18 < i19; i19 = 5) {
            zChanged2 |= composerStartRestartGroup.changed(objArr[i18]);
            i18++;
        }
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new OooO(str3, i14, function7, function4, mutableStateRememberSaveable);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue5, modifierM478paddingVpY3zN4$default, false, false, textStyle, keyboardOptions2, keyboardActions, true, i13, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1984258957, true, new OooOO0(boxScopeInstance, str4, j6, sp, textDecoration2, iM3676getStarte0LSkKk, i11, i16, mutableStateRememberSaveable)), composerStartRestartGroup, (i15 & 3670016) | 100663296 | ((i15 << 24) & 1879048192), 196608, 15384);
        composerStartRestartGroup.startReplaceableGroup(-1249520578);
        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
            Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_search_clear, composerStartRestartGroup, 0);
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(16), 0.0f, 11, null), Dp.m3765constructorimpl(20)), Alignment.INSTANCE.getCenterEnd());
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged3 = composerStartRestartGroup.changed(mutableStateRememberSaveable) | composerStartRestartGroup.changed(function4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new OooOO0O(function4, mutableStateRememberSaveable);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0O0(modifierAlign, false, false, 0L, false, null, null, null, (Function0) objRememberedValue6, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(function4, function5, function8, str4, j6, sp, i11, iM3676getStarte0LSkKk, textDecoration2, j7, sp2, i13, i17, textDirection2, drawable2, z2, keyboardOptions2, str3, j9, shape2, i14, function7, modifier2, i6, i7, i8, i9));
    }
}
