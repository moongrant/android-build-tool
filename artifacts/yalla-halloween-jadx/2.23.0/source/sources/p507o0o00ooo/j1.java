package p507o0o00ooo;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000OO0O;
import com.code.android.util.o0O0O00;
import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSearchComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchComp.kt\ncom/yalla/yalla/ui/composable/common/SearchComp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,227:1\n154#2:228\n154#2:243\n154#2:278\n154#2:314\n154#2:315\n154#2:316\n154#2:354\n154#2:355\n154#2:356\n154#2:357\n36#3:229\n25#3:236\n456#3,8:260\n464#3,3:274\n456#3,8:296\n464#3,3:310\n25#3:321\n25#3:332\n25#3:339\n50#3:346\n49#3:347\n467#3,3:358\n467#3,3:363\n1097#4,6:230\n1097#4,6:237\n1097#4,3:322\n1100#4,3:328\n1097#4,6:333\n1097#4,6:340\n1097#4,6:348\n67#5,5:244\n72#5:277\n76#5:367\n78#6,11:249\n78#6,11:285\n91#6:361\n91#6:366\n4144#7,6:268\n4144#7,6:304\n73#8,6:279\n79#8:313\n83#8:362\n486#9,4:317\n490#9,2:325\n494#9:331\n486#10:327\n81#11:368\n107#11,2:369\n81#11:371\n107#11,2:372\n81#11:374\n*S KotlinDebug\n*F\n+ 1 SearchComp.kt\ncom/yalla/yalla/ui/composable/common/SearchComp\n*L\n93#1:228\n121#1:243\n128#1:278\n132#1:314\n137#1:315\n139#1:316\n205#1:354\n207#1:355\n212#1:356\n222#1:357\n94#1:229\n107#1:236\n117#1:260,8\n117#1:274,3\n125#1:296,8\n125#1:310,3\n140#1:321\n141#1:332\n142#1:339\n143#1:346\n143#1:347\n125#1:358,3\n117#1:363,3\n94#1:230,6\n107#1:237,6\n140#1:322,3\n140#1:328,3\n141#1:333,6\n142#1:340,6\n143#1:348,6\n117#1:244,5\n117#1:277\n117#1:367\n117#1:249,11\n125#1:285,11\n125#1:361\n117#1:366\n117#1:268,6\n125#1:304,6\n125#1:279,6\n125#1:313\n125#1:362\n140#1:317,4\n140#1:325,2\n140#1:331\n140#1:327\n106#1:368\n106#1:369,2\n141#1:371\n141#1:372,2\n142#1:374\n*E\n"})
public final class j1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final j1 f49943OooO00o = new j1();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f49944OooO0O0 = LazyKt.lazy(OooOo00.f49997OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f49945OooO0OO = 8;

    public static final class OooO extends Lambda implements Function1<KeyboardActionScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f49946OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49947OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Job> f49948OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49949OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f49950OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState mutableState, MutableState mutableState2, Function1 function1, Function1 function2, CoroutineScope coroutineScope) {
            super(1);
            this.f49946OooO0Oo = coroutineScope;
            this.f49948OooO0o0 = mutableState;
            this.f49947OooO0o = function1;
            this.f49949OooO0oO = function2;
            this.f49950OooO0oo = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyboardActionScope keyboardActionScope) {
            KeyboardActionScope $receiver = keyboardActionScope;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            CoroutineScope coroutineScope = this.f49946OooO0Oo;
            l1 listener = new l1(this.f49948OooO0o0, this.f49950OooO0oo, this.f49947OooO0o, this.f49949OooO0oO, coroutineScope);
            Intrinsics.checkNotNullParameter(listener, "listener");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - o000OO0O.f10369OooO00o) > 500) {
                o000OO0O.f10369OooO00o = jCurrentTimeMillis;
                listener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Function1<? super String, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f49951OooO0Oo = new OooO00o();

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

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49952OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(0);
            this.f49952OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000O00O.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Input_a_maximum_of_xxx_characters), String.valueOf(this.f49952OooO0Oo)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49953OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f49954OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49955OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, MutableState<TextFieldValue> mutableState) {
            super(1);
            this.f49953OooO0Oo = function1;
            this.f49955OooO0o0 = function2;
            this.f49954OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String text = str;
            Intrinsics.checkNotNullParameter(text, "text");
            MutableState<TextFieldValue> mutableState = this.f49954OooO0o;
            if (!Intrinsics.areEqual(j1.OooO0O0(mutableState).getText(), text)) {
                mutableState.setValue(new TextFieldValue(text, TextRangeKt.TextRange(text.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                Function1<String, Unit> function1 = this.f49953OooO0Oo;
                if (function1 != null) {
                    function1.invoke(text);
                }
                Function1<String, Unit> function2 = this.f49955OooO0o0;
                if (function2 != null) {
                    function2.invoke(text);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.common.SearchComp$SearchView$4$1$1$1", f = "SearchComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f49956OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<FocusRequester> f49957OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, MutableState<FocusRequester> mutableState, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f49956OooO0Oo = z;
            this.f49957OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f49956OooO0Oo, this.f49957OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f49956OooO0Oo) {
                j1 j1Var = j1.f49943OooO00o;
                this.f49957OooO0o0.getValue().requestFocus();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<TextFieldValue, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Job> f49958OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49959OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49960OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49961OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f49962OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f49963OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ long f49964OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49965OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(int i, Function0<Unit> function0, Function1<? super String, Unit> function1, CoroutineScope coroutineScope, MutableState<TextFieldValue> mutableState, MutableState<Job> mutableState2, long j, Function1<? super String, Unit> function2) {
            super(1);
            this.f49959OooO0Oo = i;
            this.f49961OooO0o0 = function0;
            this.f49960OooO0o = function1;
            this.f49962OooO0oO = coroutineScope;
            this.f49963OooO0oo = mutableState;
            this.f49958OooO = mutableState2;
            this.f49964OooOO0 = j;
            this.f49965OooOO0O = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextFieldValue textFieldValue) {
            TextFieldValue it = textFieldValue;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<TextFieldValue> mutableState = this.f49963OooO0oo;
            if (Intrinsics.areEqual(j1.OooO0O0(mutableState).getText(), it.getText())) {
                mutableState.setValue(it);
            } else {
                String strOooOoO = StringsKt.OooOoO(it.getText(), "\n", "");
                int length = it.getText().length() - strOooOoO.length();
                TextFieldValue textFieldValueM3523copy3r_uNRQ$default = length == 0 ? it : TextFieldValue.m3523copy3r_uNRQ$default(it, strOooOoO, TextRangeKt.TextRange(TextRange.m3310getStartimpl(it.getSelection()) - length), (TextRange) null, 4, (Object) null);
                int length2 = textFieldValueM3523copy3r_uNRQ$default.getText().length() - this.f49959OooO0Oo;
                if (length2 > 0) {
                    long selection = textFieldValueM3523copy3r_uNRQ$default.getSelection();
                    String string = StringsKt.removeRange((CharSequence) textFieldValueM3523copy3r_uNRQ$default.getText(), TextRange.m3310getStartimpl(selection) - length2, TextRange.m3310getStartimpl(selection)).toString();
                    this.f49961OooO0o0.invoke();
                    textFieldValueM3523copy3r_uNRQ$default = TextFieldValue.m3523copy3r_uNRQ$default(textFieldValueM3523copy3r_uNRQ$default, string, TextRangeKt.TextRange(TextRange.m3310getStartimpl(it.getSelection()) - length2), (TextRange) null, 4, (Object) null);
                }
                mutableState.setValue(textFieldValueM3523copy3r_uNRQ$default);
                Function1<String, Unit> function1 = this.f49960OooO0o;
                if (function1 != null) {
                    function1.invoke(mutableState.getValue().getText());
                }
                MutableState<Job> mutableState2 = this.f49958OooO;
                Job value = mutableState2.getValue();
                if (value != null) {
                    Job.DefaultImpls.cancel$default(value, (CancellationException) null, 1, (Object) null);
                }
                mutableState2.setValue(BuildersKt__Builders_commonKt.launch$default(this.f49962OooO0oO, null, null, new m1(this.f49964OooOO0, this.f49965OooOO0O, this.f49963OooO0oo, null), 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f49966OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49967OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f49968OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49969OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f49970OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, long j, int i, int i2, MutableState<TextFieldValue> mutableState) {
            super(3);
            this.f49966OooO0Oo = str;
            this.f49968OooO0o0 = j;
            this.f49967OooO0o = i;
            this.f49969OooO0oO = i2;
            this.f49970OooO0oo = mutableState;
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
                    ComposerKt.traceEventStart(-1136961697, i, -1, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView.<anonymous>.<anonymous>.<anonymous> (SearchComp.kt:195)");
                }
                composer3.startReplaceableGroup(702214295);
                if (j1.OooO0O0(this.f49970OooO0oo).getText().length() == 0) {
                    composer2 = composer3;
                    TextKt.m1251Text4IGK_g(this.f49966OooO0Oo, (Modifier) null, this.f49968OooO0o0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((this.f49967OooO0o >> 12) & 14) | 3072 | ((this.f49969OooO0oO >> 3) & 896), 3072, 122866);
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

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f49971OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49973OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49974OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49975OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Function1<? super String, Unit>, Unit> f49976OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ long f49977OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f49978OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ long f49979OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f49980OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Shape f49981OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f49982OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49983OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ long f49984OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ Modifier f49985OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ long f49986OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final /* synthetic */ int f49987OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final /* synthetic */ int f49988OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public final /* synthetic */ int f49989OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ int f49990OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO(Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, Function1<? super String, Unit> function3, Function1<? super Function1<? super String, Unit>, Unit> function4, String str, long j, boolean z, long j2, Shape shape, int i, PaddingValues paddingValues, Function0<Unit> function0, Modifier modifier, long j3, long j4, int i2, int i3, int i4, int i5) {
            super(2);
            this.f49974OooO0o0 = function1;
            this.f49973OooO0o = function2;
            this.f49975OooO0oO = function3;
            this.f49976OooO0oo = function4;
            this.f49971OooO = str;
            this.f49977OooOO0 = j;
            this.f49978OooOO0O = z;
            this.f49979OooOO0o = j2;
            this.f49981OooOOO0 = shape;
            this.f49980OooOOO = i;
            this.f49982OooOOOO = paddingValues;
            this.f49983OooOOOo = function0;
            this.f49985OooOOo0 = modifier;
            this.f49984OooOOo = j3;
            this.f49986OooOOoo = j4;
            this.f49988OooOo00 = i2;
            this.f49987OooOo0 = i3;
            this.f49989OooOo0O = i4;
            this.f49990OooOo0o = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            j1.this.OooO00o(this.f49974OooO0o0, this.f49973OooO0o, this.f49975OooO0oO, this.f49976OooO0oo, this.f49971OooO, this.f49977OooOO0, this.f49978OooOO0O, this.f49979OooOO0o, this.f49981OooOOO0, this.f49980OooOOO, this.f49982OooOOOO, this.f49983OooOOOo, this.f49985OooOOo0, this.f49984OooOOo, this.f49986OooOOoo, this.f49988OooOo00, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49987OooOo0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.f49989OooOo0O), this.f49990OooOo0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f49991OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Job> f49992OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f49993OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49994OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f49995OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState mutableState, MutableState mutableState2, Function1 function1, Function1 function2, CoroutineScope coroutineScope) {
            super(0);
            this.f49991OooO0Oo = coroutineScope;
            this.f49993OooO0o0 = mutableState;
            this.f49992OooO0o = mutableState2;
            this.f49994OooO0oO = function1;
            this.f49995OooO0oo = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TextFieldValue textFieldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
            MutableState<TextFieldValue> mutableState = this.f49993OooO0o0;
            mutableState.setValue(textFieldValue);
            MutableState<Job> mutableState2 = this.f49992OooO0o;
            Job value = mutableState2.getValue();
            if (value != null) {
                Job.DefaultImpls.cancel$default(value, (CancellationException) null, 1, (Object) null);
            }
            mutableState2.setValue(BuildersKt__Builders_commonKt.launch$default(this.f49991OooO0Oo, null, null, new n1(this.f49994OooO0oO, this.f49995OooO0oo, mutableState, null), 3, null));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<MutableState<TextFieldValue>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f49996OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<TextFieldValue> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f49997OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "[^\\u0030-\\u0039\\u0041-\\u005A\\u0061-\\u007A\\u0621-\\u063A\\u0641-\\u0652\\u0654-\\u0656\\u0660-\\u0669\\u00C7\\u00E7\\u00D6\\u00F6\\u00DC\\u00FC\\u015E\\u015F\\u01E6\\u01E7\\u0130\\u0131\\u011e\\u011f\\u3041-\\u3096\\u30A1-\\u30FA\\u31F0-\\u31FF\\u4E00-\\u9FCF\\u9FD1-\\u9FE6\\uF900-\\uFA6D\\uFA70-\\uFAD9\\u00C1\\u00C9\\u00CD\\u00D3\\u00DA\\u00E1\\u00E9\\u00ED\\u00F3\\u00FA\\u00C7\\u00E7\\u00C2\\u00CA\\u00E3\\u00F5\\u00C0\\u00E0\\u01E6\\u01E7\\u00A1\\u00BF\\u00C1\\u00C7\\u00C9\\u00CD\\u00D1\\u00D3\\u00DA\\u00DC\\u00E1\\u00E7\\u00E9\\u00ED\\u00F1\\u00F3\\u00FA\\u00FC\\u0902\\u0904-\\u090F\\u0910-\\u091F\\u0920-\\u092F\\u0930-\\u093F\\u0940-\\u094F\\u0950-\\u095F\\u0960-\\u096F\\u0970-\\u0977\\u0979-\\u097F\\u0981\\u0985-\\u098B\\u098F\\u0990\\u0993-\\u099F\\u09A0-\\u09A8\\u09AA-\\u09AF\\u09B0\\u09B2\\u09B6-\\u09B9\\u09BC\\u09BE\\u09BF\\u09C0\\u09C1\\u09C3\\u09C7\\u09C8\\u09CB\\u09CC\\u09CE\\u09D7\\u09DC\\u09DD\\u09DF\\u0982\\u0983\\u09E6-\\u09EF\\u0A01\\u0A03\\u0A05-\\u0A0A\\u0A0F\\u0A10\\u0A13-\\u0A1F\\u0A20-\\u0A28\\u0A2A-\\u0A2F\\u0A30\\u0A32\\u0A33\\u0A35\\u0A36\\u0A38\\u0A39\\u0A3E\\u0A3F\\u0A40-\\u0A42\\u0A47\\u0A4B\\u0A4D\\u0A51\\u0A59\\u0A5A-\\u0A5C\\u0A5E\\u0A66-\\u0A6F\\u0A70-\\u0A75\\u0A81-\\u0A83\\u0A85-\\u0A8D\\u0A8F\\u0A90\\u0A91\\u0A93-\\u0A9F\\u0AA0-\\u0AA8\\u0AAA-\\u0AAF\\u0AB0\\u0AB2\\u0AB3\\u0AB5-\\u0AB9\\u0ABD-\\u0ABF\\u0AC0-\\u0AC5\\u0AC7-\\u0AC9\\u0ACB-\\u0ACD\\u0AE0-\\u0AE3\\u0AE6-\\u0AED\\u0AEF\\u0AF0\\u0AF1\\u0AF9-\\u0AFF\\u0B83\\u0B85-\\u0B8A\\u0B8E\\u0B8F\\u0B90\\u0B92-\\u0B95\\u0B99\\u0B9A\\u0B9C\\u0B9E\\u0B9F\\u0BA3\\u0BA4\\u0BA8\\u0BA9\\u0BAF\\u0BB0-\\u0BB9\\u0BBE\\u0BBF\\u0BC0-\\u0BC2\\u0BC6-\\u0BC8\\u0BCA-\\u0BCD\\u0BD0\\u0BD7\\u0BF3-\\u0BFA\\u0613\\u0619-\\u061B\\u061F\\u0621\\u0622\\u0624\\u0627-\\u062F\\u0630-\\u063A\\u0641\\u0642\\u0644-\\u0648\\u064A\\u0660-\\u0669\\u0679\\u067E\\u0686\\u0688\\u0691\\u0698\\u06A9\\u06AF\\u06BA\\u06CC\\u06D2\\u06D5\\u0647\\u06BE\\u06C1_]*";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TextFieldValue OooO0O0(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:125:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0174  */
    /* JADX WARN: Code duplicated, block: B:131:0x017c  */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0183  */
    /* JADX WARN: Code duplicated, block: B:136:0x018b  */
    /* JADX WARN: Code duplicated, block: B:137:0x018e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0198  */
    /* JADX WARN: Code duplicated, block: B:144:0x019c  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:165:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:170:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:179:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x022f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0286 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0288  */
    /* JADX WARN: Code duplicated, block: B:205:0x028a  */
    /* JADX WARN: Code duplicated, block: B:207:0x028e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0290  */
    /* JADX WARN: Code duplicated, block: B:210:0x0294  */
    /* JADX WARN: Code duplicated, block: B:211:0x0296  */
    /* JADX WARN: Code duplicated, block: B:213:0x029a  */
    /* JADX WARN: Code duplicated, block: B:214:0x029d  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:220:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:223:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:226:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:230:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:231:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:234:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:236:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:237:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:240:0x030a  */
    /* JADX WARN: Code duplicated, block: B:242:0x031e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0326  */
    /* JADX WARN: Code duplicated, block: B:246:0x0337  */
    /* JADX WARN: Code duplicated, block: B:248:0x033b  */
    /* JADX WARN: Code duplicated, block: B:249:0x033e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0344  */
    /* JADX WARN: Code duplicated, block: B:253:0x0351  */
    /* JADX WARN: Code duplicated, block: B:256:0x035b  */
    /* JADX WARN: Code duplicated, block: B:257:0x0368  */
    /* JADX WARN: Code duplicated, block: B:260:0x0370  */
    /* JADX WARN: Code duplicated, block: B:261:0x0377  */
    /* JADX WARN: Code duplicated, block: B:265:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:274:0x044e  */
    /* JADX WARN: Code duplicated, block: B:277:0x045a  */
    /* JADX WARN: Code duplicated, block: B:278:0x045e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:281:0x046f  */
    /* JADX WARN: Code duplicated, block: B:283:0x047d  */
    /* JADX WARN: Code duplicated, block: B:286:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:289:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:290:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:293:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:295:0x0504  */
    /* JADX WARN: Code duplicated, block: B:298:0x0575  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:301:0x0595  */
    /* JADX WARN: Code duplicated, block: B:304:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:307:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:309:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:313:0x0732  */
    /* JADX WARN: Code duplicated, block: B:315:0x0735  */
    /* JADX WARN: Code duplicated, block: B:316:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:319:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:324:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super String, Unit> function2, @Nullable Function1<? super String, Unit> function3, @Nullable Function1<? super Function1<? super String, Unit>, Unit> function4, @Nullable String str, long j, boolean z, long j2, @Nullable Shape shape, int i, @Nullable PaddingValues paddingValues, @Nullable Function0<Unit> function0, @Nullable Modifier modifier, long j3, long j4, int i2, @Nullable Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Function1<? super Function1<? super String, Unit>, Unit> function5;
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
        Function1<? super String, Unit> function6;
        Function1<? super String, Unit> function7;
        Function1<? super String, Unit> function8;
        Function1<? super Function1<? super String, Unit>, Unit> function9;
        String str2;
        long j5;
        boolean z2;
        long j6;
        Shape shapeRoundedCornerShape;
        int i26;
        PaddingValues paddingValuesM471PaddingValuesYgX7TsA$default;
        Function0<Unit> function10;
        Modifier modifier2;
        long j7;
        long j8;
        int i27;
        String str3;
        Shape shape2;
        PaddingValues paddingValues2;
        long j9;
        long j10;
        Function0<Unit> function11;
        Modifier modifier3;
        int i28;
        boolean z3;
        Function1<? super String, Unit> function12;
        Function1<? super String, Unit> function13;
        int i29;
        long j11;
        int i30;
        boolean zChanged;
        Object objRememberedValue;
        MutableState mutableStateRememberSaveable;
        Object objRememberedValue2;
        Composer.Companion companion;
        int i31;
        Modifier.Companion companion2;
        Function1<? super String, Unit> function14;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1309constructorimpl2;
        Function2 function2OooO00o2;
        Object objRememberedValue3;
        CoroutineScope coroutineScopeOooO00o;
        Object objRememberedValue4;
        MutableState mutableState;
        Object objRememberedValue5;
        MutableState mutableState2;
        boolean zOooO00o;
        Object objRememberedValue6;
        int i32;
        Function1<? super String, Unit> function15;
        int i33;
        long j12;
        Function0<Unit> function16;
        long j13;
        boolean z4;
        long j14;
        String str4;
        long j15;
        Function1<? super Function1<? super String, Unit>, Unit> function17;
        Modifier modifier4;
        Function1<? super String, Unit> function18;
        int i34;
        PaddingValues paddingValues3;
        Function1<? super String, Unit> function19;
        Shape shape3;
        OooO0OO oooO0OO;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i35;
        int i36;
        Composer composerStartRestartGroup = composer.startRestartGroup(575199723);
        int i37 = i5 & 1;
        if (i37 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i38 = i5 & 2;
        if (i38 == 0) {
            if ((i3 & 112) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 != 0) {
                if ((i3 & 896) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i8 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i8 = 128;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    if ((i3 & 7168) == 0) {
                        function5 = function4;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i10 = 2048;
                        } else {
                            i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i6 |= i10;
                    }
                    i11 = i5 & 16;
                    i12 = 8192;
                    if (i11 != 0) {
                        i6 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(str)) {
                            i13 = 16384;
                        } else {
                            i13 = 8192;
                        }
                        i6 |= i13;
                    }
                    i14 = i5 & 32;
                    if (i14 != 0) {
                        i6 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(j)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i6 |= i15;
                    }
                    i16 = i5 & 64;
                    if (i16 != 0) {
                        i6 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i17 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i17 = 524288;
                        }
                        i6 |= i17;
                    }
                    if ((i3 & 29360128) != 0) {
                        if ((i5 & 128) == 0 || !composerStartRestartGroup.changed(j2)) {
                            i36 = Configuration.BLOCK_SIZE;
                        } else {
                            i36 = 8388608;
                        }
                        i6 |= i36;
                    }
                    if ((234881024 & i3) != 0) {
                        i6 |= ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(shape)) ? 33554432 : 67108864;
                    }
                    i18 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                    if (i18 != 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i19 = 536870912;
                        } else {
                            i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    if (i20 != 0) {
                        i21 = i4 | 6;
                    } else if ((i4 & 14) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i22 = 4;
                        } else {
                            i22 = 2;
                        }
                        i21 = i4 | i22;
                    } else {
                        i21 = i4;
                    }
                    if ((i4 & 112) != 0) {
                        i21 |= ((i5 & 2048) == 0 || !composerStartRestartGroup.changedInstance(function0)) ? 16 : 32;
                    }
                    i23 = i21;
                    i24 = i5 & 4096;
                    if (i24 != 0) {
                        if ((i4 & 896) == 0) {
                            if (composerStartRestartGroup.changed(modifier)) {
                                i25 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            } else {
                                i25 = 128;
                            }
                            i23 |= i25;
                        }
                        if ((i4 & 7168) != 0) {
                            i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                        }
                        if ((i4 & 57344) != 0) {
                            if ((i5 & 16384) == 0 && composerStartRestartGroup.changed(j4)) {
                                i12 = 16384;
                            }
                            i23 |= i12;
                        }
                        if ((i4 & 458752) != 0) {
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0 || !composerStartRestartGroup.changed(i2)) {
                                i35 = 65536;
                            } else {
                                i35 = 131072;
                            }
                            i23 |= i35;
                        }
                        if ((1533916891 & i6) != 306783378 && (374491 & i23) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function15 = function1;
                            function18 = function2;
                            function19 = function3;
                            str4 = str;
                            j15 = j;
                            z4 = z;
                            j12 = j2;
                            i34 = i;
                            paddingValues3 = paddingValues;
                            function16 = function0;
                            modifier4 = modifier;
                            j13 = j3;
                            j14 = j4;
                            i33 = i2;
                            function17 = function5;
                            shape3 = shape;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i37 != 0) {
                                    function6 = null;
                                } else {
                                    function6 = function1;
                                }
                                if (i38 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i7 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i9 != 0) {
                                    function9 = OooO00o.f49951OooO0Oo;
                                } else {
                                    function9 = function5;
                                }
                                if (i11 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i14 != 0) {
                                    j5 = 600;
                                } else {
                                    j5 = j;
                                }
                                if (i16 != 0) {
                                    z2 = false;
                                } else {
                                    z2 = z;
                                }
                                Function1<? super String, Unit> function20 = function6;
                                if ((i5 & 128) != 0) {
                                    j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                    i6 &= -29360129;
                                } else {
                                    j6 = j2;
                                }
                                if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                    shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                    i6 &= -234881025;
                                } else {
                                    shapeRoundedCornerShape = shape;
                                }
                                if (i18 != 0) {
                                    i26 = 24;
                                } else {
                                    i26 = i;
                                }
                                if (i20 != 0) {
                                    paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                                } else {
                                    paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                                }
                                if ((i5 & 2048) != 0) {
                                    Integer numValueOf = Integer.valueOf(i26);
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged = composerStartRestartGroup.changed(numValueOf);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new OooO0O0(i26);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    function10 = (Function0) objRememberedValue;
                                    i23 &= -113;
                                } else {
                                    function10 = function0;
                                }
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if ((i5 & 8192) != 0) {
                                    j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                    i23 &= -7169;
                                } else {
                                    j7 = j3;
                                }
                                if ((i5 & 16384) != 0) {
                                    j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                    i23 &= -57345;
                                } else {
                                    j8 = j4;
                                }
                                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                    i27 = oO00OOO.ic_search_clear;
                                    i23 &= -458753;
                                } else {
                                    i27 = i2;
                                }
                                str3 = str2;
                                shape2 = shapeRoundedCornerShape;
                                paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                                j9 = j7;
                                j10 = j8;
                                function11 = function10;
                                modifier3 = modifier2;
                                i28 = i23;
                                z3 = z2;
                                function12 = function20;
                                i6 = i6;
                                function13 = function7;
                                i29 = i27;
                                j11 = j5;
                                function5 = function9;
                                i30 = i26;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 128) != 0) {
                                    i6 &= -29360129;
                                }
                                if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                    i6 &= -234881025;
                                }
                                if ((i5 & 2048) != 0) {
                                    i23 &= -113;
                                }
                                if ((i5 & 8192) != 0) {
                                    i23 &= -7169;
                                }
                                if ((i5 & 16384) != 0) {
                                    i23 &= -57345;
                                }
                                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                    i23 &= -458753;
                                }
                                function12 = function1;
                                function13 = function2;
                                function8 = function3;
                                str3 = str;
                                j11 = j;
                                j6 = j2;
                                shape2 = shape;
                                i30 = i;
                                paddingValues2 = paddingValues;
                                function11 = function0;
                                modifier3 = modifier;
                                j9 = j3;
                                j10 = j4;
                                i29 = i2;
                                i28 = i23;
                                z3 = z;
                            }
                            composerStartRestartGroup.endDefaults();
                            long j16 = j11;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                            }
                            mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            i31 = i28;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                                if (function5 != null) {
                                    function5.invoke(oooO0OO);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.updateRememberedValue(oooO0OO);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            Alignment center = companion3.getCenter();
                            Function1<? super Function1<? super String, Unit>, Unit> function21 = function5;
                            companion2 = Modifier.INSTANCE;
                            int i39 = i6;
                            Modifier modifier5 = modifier3;
                            function14 = function13;
                            int i40 = i30;
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            PaddingValues paddingValues4 = paddingValues2;
                            constructor = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                            Function1<? super String, Unit> function22 = function8;
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Alignment.Vertical centerVertically = companion3.getCenterVertically();
                            Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor2 = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            float f = 12;
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                            float f2 = 8;
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue4;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue5;
                            Unit unit2 = Unit.INSTANCE;
                            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                            Shape shape4 = shape2;
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zOooO00o || objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                            boolean z5 = z3;
                            BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i40, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j16, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function22, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i39, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
                            composerStartRestartGroup.startReplaceableGroup(-616911648);
                            if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                                i32 = i29;
                                ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            } else {
                                i32 = i29;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function15 = function12;
                            i33 = i32;
                            j12 = j6;
                            function16 = function11;
                            j13 = j9;
                            z4 = z5;
                            j14 = j10;
                            str4 = str3;
                            j15 = j16;
                            function17 = function21;
                            modifier4 = modifier5;
                            function18 = function14;
                            i34 = i40;
                            paddingValues3 = paddingValues4;
                            function19 = function22;
                            shape3 = shape4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
                    }
                    i23 |= 384;
                    if ((i4 & 7168) != 0) {
                        i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i12 = 16384;
                        }
                        i23 |= i12;
                    }
                    if ((i4 & 458752) != 0) {
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                            i35 = 65536;
                        } else {
                            i35 = 65536;
                        }
                        i23 |= i35;
                    }
                    if ((1533916891 & i6) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function23 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf2 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function23;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        } else {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function24 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf3 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf3);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function24;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        }
                        composerStartRestartGroup.endDefaults();
                        long j17 = j11;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                        }
                        mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        i31 = i28;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                            if (function5 != null) {
                                function5.invoke(oooO0OO);
                                Unit unit3 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.updateRememberedValue(oooO0OO);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        Alignment center2 = companion5.getCenter();
                        Function1<? super Function1<? super String, Unit>, Unit> function25 = function5;
                        companion2 = Modifier.INSTANCE;
                        int i310 = i6;
                        Modifier modifier6 = modifier3;
                        function14 = function13;
                        int i41 = i30;
                        Modifier modifierPadding2 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        PaddingValues paddingValues5 = paddingValues2;
                        constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierPadding2);
                        Function1<? super String, Unit> function26 = function8;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl, currentCompositionLocalMap3);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
                        Modifier modifierM168backgroundbw27NRU2 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically2, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap4);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        float f3 = 12;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                        float f4 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f4), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue5;
                        Unit unit4 = Unit.INSTANCE;
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                        Shape shape5 = shape2;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        boolean z6 = z3;
                        BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i41, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j17, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance2, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function26, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i310, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f4), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(-616911648);
                        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                            i32 = i29;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i32 = i29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function12;
                        i33 = i32;
                        j12 = j6;
                        function16 = function11;
                        j13 = j9;
                        z4 = z6;
                        j14 = j10;
                        str4 = str3;
                        j15 = j17;
                        function17 = function25;
                        modifier4 = modifier6;
                        function18 = function14;
                        i34 = i41;
                        paddingValues3 = paddingValues5;
                        function19 = function26;
                        shape3 = shape5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function27 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf4 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function27;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        } else {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function28 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf5 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf5);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function28;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        }
                        composerStartRestartGroup.endDefaults();
                        long j18 = j11;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                        }
                        mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        i31 = i28;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                            if (function5 != null) {
                                function5.invoke(oooO0OO);
                                Unit unit5 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.updateRememberedValue(oooO0OO);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        Alignment center3 = companion7.getCenter();
                        Function1<? super Function1<? super String, Unit>, Unit> function29 = function5;
                        companion2 = Modifier.INSTANCE;
                        int i311 = i6;
                        Modifier modifier7 = modifier3;
                        function14 = function13;
                        int i42 = i30;
                        Modifier modifierPadding3 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        PaddingValues paddingValues6 = paddingValues2;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierPadding3);
                        Function1<? super String, Unit> function210 = function8;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl, currentCompositionLocalMap5);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically3 = companion7.getCenterVertically();
                        Modifier modifierM168backgroundbw27NRU3 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically3, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion8, composerM1309constructorimpl2, measurePolicyOooO00o3, composerM1309constructorimpl2, currentCompositionLocalMap6);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        float f5 = 12;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f5), null, composerStartRestartGroup, 6, 2);
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                        float f6 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue5;
                        Unit unit6 = Unit.INSTANCE;
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                        Shape shape6 = shape2;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        boolean z7 = z3;
                        BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i42, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j18, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance3, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function210, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i311, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(-616911648);
                        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                            i32 = i29;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i32 = i29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f5), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function12;
                        i33 = i32;
                        j12 = j6;
                        function16 = function11;
                        j13 = j9;
                        z4 = z7;
                        j14 = j10;
                        str4 = str3;
                        j15 = j18;
                        function17 = function29;
                        modifier4 = modifier7;
                        function18 = function14;
                        i34 = i42;
                        paddingValues3 = paddingValues6;
                        function19 = function210;
                        shape3 = shape6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
                }
                i6 |= 3072;
                function5 = function4;
                i11 = i5 & 16;
                i12 = 8192;
                if (i11 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(str)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i6 |= i13;
                }
                i14 = i5 & 32;
                if (i14 != 0) {
                    i6 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(j)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 64;
                if (i16 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i17 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i17 = 524288;
                    }
                    i6 |= i17;
                }
                if ((i3 & 29360128) != 0) {
                    if ((i5 & 128) == 0) {
                        i36 = Configuration.BLOCK_SIZE;
                    } else {
                        i36 = Configuration.BLOCK_SIZE;
                    }
                    i6 |= i36;
                }
                if ((234881024 & i3) != 0) {
                    i6 |= ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(shape)) ? 33554432 : 67108864;
                }
                i18 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i18 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i19 = 536870912;
                    } else {
                        i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i6 |= i19;
                }
                i20 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i20 != 0) {
                    i21 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i22 = 4;
                    } else {
                        i22 = 2;
                    }
                    i21 = i4 | i22;
                } else {
                    i21 = i4;
                }
                if ((i4 & 112) != 0) {
                    i21 |= ((i5 & 2048) == 0 || !composerStartRestartGroup.changedInstance(function0)) ? 16 : 32;
                }
                i23 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                    if ((i4 & 896) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i25 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            i25 = 128;
                        }
                        i23 |= i25;
                    }
                    if ((i4 & 7168) != 0) {
                        i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i12 = 16384;
                        }
                        i23 |= i12;
                    }
                    if ((i4 & 458752) != 0) {
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                            i35 = 65536;
                        } else {
                            i35 = 65536;
                        }
                        i23 |= i35;
                    }
                    if ((1533916891 & i6) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function211 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf6 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf6);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function211;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        } else {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function212 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf7 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf7);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function212;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        }
                        composerStartRestartGroup.endDefaults();
                        long j19 = j11;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                        }
                        mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        i31 = i28;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                            if (function5 != null) {
                                function5.invoke(oooO0OO);
                                Unit unit7 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.updateRememberedValue(oooO0OO);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Companion companion9 = Alignment.INSTANCE;
                        Alignment center4 = companion9.getCenter();
                        Function1<? super Function1<? super String, Unit>, Unit> function213 = function5;
                        companion2 = Modifier.INSTANCE;
                        int i312 = i6;
                        Modifier modifier8 = modifier3;
                        function14 = function13;
                        int i43 = i30;
                        Modifier modifierPadding4 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        PaddingValues paddingValues7 = paddingValues2;
                        constructor = companion10.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierPadding4);
                        Function1<? super String, Unit> function214 = function8;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion10, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM1309constructorimpl, currentCompositionLocalMap7);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically4 = companion9.getCenterVertically();
                        Modifier modifierM168backgroundbw27NRU4 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically4, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion10.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion10, composerM1309constructorimpl2, measurePolicyOooO00o4, composerM1309constructorimpl2, currentCompositionLocalMap8);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                        float f7 = 12;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f7), null, composerStartRestartGroup, 6, 2);
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                        float f8 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f8), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue5;
                        Unit unit8 = Unit.INSTANCE;
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                        Shape shape7 = shape2;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        boolean z8 = z3;
                        BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i43, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j19, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance4, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function214, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i312, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f8), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(-616911648);
                        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                            i32 = i29;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i32 = i29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f7), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function12;
                        i33 = i32;
                        j12 = j6;
                        function16 = function11;
                        j13 = j9;
                        z4 = z8;
                        j14 = j10;
                        str4 = str3;
                        j15 = j19;
                        function17 = function213;
                        modifier4 = modifier8;
                        function18 = function14;
                        i34 = i43;
                        paddingValues3 = paddingValues7;
                        function19 = function214;
                        shape3 = shape7;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function215 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf8 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf8);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function215;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        } else {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function216 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf9 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf9);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function216;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        }
                        composerStartRestartGroup.endDefaults();
                        long j110 = j11;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                        }
                        mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        i31 = i28;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                            if (function5 != null) {
                                function5.invoke(oooO0OO);
                                Unit unit9 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.updateRememberedValue(oooO0OO);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Companion companion11 = Alignment.INSTANCE;
                        Alignment center5 = companion11.getCenter();
                        Function1<? super Function1<? super String, Unit>, Unit> function217 = function5;
                        companion2 = Modifier.INSTANCE;
                        int i313 = i6;
                        Modifier modifier9 = modifier3;
                        function14 = function13;
                        int i44 = i30;
                        Modifier modifierPadding5 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        PaddingValues paddingValues8 = paddingValues2;
                        constructor = companion12.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierPadding5);
                        Function1<? super String, Unit> function218 = function8;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM1309constructorimpl, currentCompositionLocalMap9);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically5 = companion11.getCenterVertically();
                        Modifier modifierM168backgroundbw27NRU5 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically5, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion12.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion12, composerM1309constructorimpl2, measurePolicyOooO00o5, composerM1309constructorimpl2, currentCompositionLocalMap10);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                        float f9 = 12;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f9), null, composerStartRestartGroup, 6, 2);
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                        float f10 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f10), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue5;
                        Unit unit10 = Unit.INSTANCE;
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                        Shape shape8 = shape2;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        boolean z9 = z3;
                        BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i44, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j110, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance5, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function218, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i313, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f10), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(-616911648);
                        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                            i32 = i29;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i32 = i29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f9), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function12;
                        i33 = i32;
                        j12 = j6;
                        function16 = function11;
                        j13 = j9;
                        z4 = z9;
                        j14 = j10;
                        str4 = str3;
                        j15 = j110;
                        function17 = function217;
                        modifier4 = modifier9;
                        function18 = function14;
                        i34 = i44;
                        paddingValues3 = paddingValues8;
                        function19 = function218;
                        shape3 = shape8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
                }
                i23 |= 384;
                if ((i4 & 7168) != 0) {
                    i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i12 = 16384;
                    }
                    i23 |= i12;
                }
                if ((i4 & 458752) != 0) {
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i23 |= i35;
                }
                if ((1533916891 & i6) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function219 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf10 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf10);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function219;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function2110 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf11 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf11);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function2110;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j111 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit11 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion13 = Alignment.INSTANCE;
                    Alignment center6 = companion13.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function2111 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i314 = i6;
                    Modifier modifier10 = modifier3;
                    function14 = function13;
                    int i45 = i30;
                    Modifier modifierPadding6 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues9 = paddingValues2;
                    constructor = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierPadding6);
                    Function1<? super String, Unit> function2112 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion14, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM1309constructorimpl, currentCompositionLocalMap11);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically6 = companion13.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU6 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically6, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion14, composerM1309constructorimpl2, measurePolicyOooO00o6, composerM1309constructorimpl2, currentCompositionLocalMap12);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                    float f11 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f12 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f12), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit12 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape9 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z10 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i45, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j111, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance6, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2112, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i314, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f12), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z10;
                    j14 = j10;
                    str4 = str3;
                    j15 = j111;
                    function17 = function2111;
                    modifier4 = modifier10;
                    function18 = function14;
                    i34 = i45;
                    paddingValues3 = paddingValues9;
                    function19 = function2112;
                    shape3 = shape9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function2113 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf12 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf12);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function2113;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function2114 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf13 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf13);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function2114;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j112 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit13 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion15 = Alignment.INSTANCE;
                    Alignment center7 = companion15.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function2115 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i315 = i6;
                    Modifier modifier11 = modifier3;
                    function14 = function13;
                    int i46 = i30;
                    Modifier modifierPadding7 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues10 = paddingValues2;
                    constructor = companion16.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierPadding7);
                    Function1<? super String, Unit> function2116 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion16, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM1309constructorimpl, currentCompositionLocalMap13);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically7 = companion15.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU7 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically7, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion16.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion16, composerM1309constructorimpl2, measurePolicyOooO00o7, composerM1309constructorimpl2, currentCompositionLocalMap14);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                    float f13 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f13), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f14 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f14), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit14 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape10 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit14, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z11 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i46, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j112, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance7, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2116, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i315, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f14), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f13), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z11;
                    j14 = j10;
                    str4 = str3;
                    j15 = j112;
                    function17 = function2115;
                    modifier4 = modifier11;
                    function18 = function14;
                    i34 = i46;
                    paddingValues3 = paddingValues10;
                    function19 = function2116;
                    shape3 = shape10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
            }
            i6 |= 384;
            i9 = i5 & 8;
            if (i9 != 0) {
                if ((i3 & 7168) == 0) {
                    function5 = function4;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i10 = 2048;
                    } else {
                        i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 16;
                i12 = 8192;
                if (i11 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(str)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i6 |= i13;
                }
                i14 = i5 & 32;
                if (i14 != 0) {
                    i6 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(j)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 64;
                if (i16 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i17 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i17 = 524288;
                    }
                    i6 |= i17;
                }
                if ((i3 & 29360128) != 0) {
                    if ((i5 & 128) == 0) {
                        i36 = Configuration.BLOCK_SIZE;
                    } else {
                        i36 = Configuration.BLOCK_SIZE;
                    }
                    i6 |= i36;
                }
                if ((234881024 & i3) != 0) {
                    i6 |= ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(shape)) ? 33554432 : 67108864;
                }
                i18 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i18 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i19 = 536870912;
                    } else {
                        i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i6 |= i19;
                }
                i20 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i20 != 0) {
                    i21 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i22 = 4;
                    } else {
                        i22 = 2;
                    }
                    i21 = i4 | i22;
                } else {
                    i21 = i4;
                }
                if ((i4 & 112) != 0) {
                    i21 |= ((i5 & 2048) == 0 || !composerStartRestartGroup.changedInstance(function0)) ? 16 : 32;
                }
                i23 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                    if ((i4 & 896) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i25 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            i25 = 128;
                        }
                        i23 |= i25;
                    }
                    if ((i4 & 7168) != 0) {
                        i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i12 = 16384;
                        }
                        i23 |= i12;
                    }
                    if ((i4 & 458752) != 0) {
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                            i35 = 65536;
                        } else {
                            i35 = 65536;
                        }
                        i23 |= i35;
                    }
                    if ((1533916891 & i6) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function2117 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf14 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf14);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function2117;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        } else {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function2118 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf15 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf15);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function2118;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        }
                        composerStartRestartGroup.endDefaults();
                        long j113 = j11;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                        }
                        mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        i31 = i28;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                            if (function5 != null) {
                                function5.invoke(oooO0OO);
                                Unit unit15 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.updateRememberedValue(oooO0OO);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Companion companion17 = Alignment.INSTANCE;
                        Alignment center8 = companion17.getCenter();
                        Function1<? super Function1<? super String, Unit>, Unit> function2119 = function5;
                        companion2 = Modifier.INSTANCE;
                        int i316 = i6;
                        Modifier modifier12 = modifier3;
                        function14 = function13;
                        int i47 = i30;
                        Modifier modifierPadding8 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        PaddingValues paddingValues11 = paddingValues2;
                        constructor = companion18.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierPadding8);
                        Function1<? super String, Unit> function21110 = function8;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion18, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM1309constructorimpl, currentCompositionLocalMap15);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically8 = companion17.getCenterVertically();
                        Modifier modifierM168backgroundbw27NRU8 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o8 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically8, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion18.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion18, composerM1309constructorimpl2, measurePolicyOooO00o8, composerM1309constructorimpl2, currentCompositionLocalMap16);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                        float f15 = 12;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f15), null, composerStartRestartGroup, 6, 2);
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                        float f16 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f16), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue5;
                        Unit unit16 = Unit.INSTANCE;
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                        Shape shape11 = shape2;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit16, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        boolean z12 = z3;
                        BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i47, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j113, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance8, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21110, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i316, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f16), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(-616911648);
                        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                            i32 = i29;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i32 = i29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f15), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function12;
                        i33 = i32;
                        j12 = j6;
                        function16 = function11;
                        j13 = j9;
                        z4 = z12;
                        j14 = j10;
                        str4 = str3;
                        j15 = j113;
                        function17 = function2119;
                        modifier4 = modifier12;
                        function18 = function14;
                        i34 = i47;
                        paddingValues3 = paddingValues11;
                        function19 = function21110;
                        shape3 = shape11;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function21111 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf16 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf16);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function21111;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        } else {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function21112 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf17 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf17);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function21112;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        }
                        composerStartRestartGroup.endDefaults();
                        long j114 = j11;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                        }
                        mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        i31 = i28;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                            if (function5 != null) {
                                function5.invoke(oooO0OO);
                                Unit unit17 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.updateRememberedValue(oooO0OO);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Companion companion19 = Alignment.INSTANCE;
                        Alignment center9 = companion19.getCenter();
                        Function1<? super Function1<? super String, Unit>, Unit> function21113 = function5;
                        companion2 = Modifier.INSTANCE;
                        int i317 = i6;
                        Modifier modifier13 = modifier3;
                        function14 = function13;
                        int i48 = i30;
                        Modifier modifierPadding9 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                        PaddingValues paddingValues12 = paddingValues2;
                        constructor = companion110.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierPadding9);
                        Function1<? super String, Unit> function21114 = function8;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion110, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM1309constructorimpl, currentCompositionLocalMap17);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically9 = companion19.getCenterVertically();
                        Modifier modifierM168backgroundbw27NRU9 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o9 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically9, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion110.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion110, composerM1309constructorimpl2, measurePolicyOooO00o9, composerM1309constructorimpl2, currentCompositionLocalMap18);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf18, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                        float f17 = 12;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f17), null, composerStartRestartGroup, 6, 2);
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                        float f18 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f18), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue5;
                        Unit unit18 = Unit.INSTANCE;
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                        Shape shape12 = shape2;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit18, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        boolean z13 = z3;
                        BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i48, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j114, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance9, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21114, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i317, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f18), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(-616911648);
                        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                            i32 = i29;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i32 = i29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f17), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function12;
                        i33 = i32;
                        j12 = j6;
                        function16 = function11;
                        j13 = j9;
                        z4 = z13;
                        j14 = j10;
                        str4 = str3;
                        j15 = j114;
                        function17 = function21113;
                        modifier4 = modifier13;
                        function18 = function14;
                        i34 = i48;
                        paddingValues3 = paddingValues12;
                        function19 = function21114;
                        shape3 = shape12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
                }
                i23 |= 384;
                if ((i4 & 7168) != 0) {
                    i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i12 = 16384;
                    }
                    i23 |= i12;
                }
                if ((i4 & 458752) != 0) {
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i23 |= i35;
                }
                if ((1533916891 & i6) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21115 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf18 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf18);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21115;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21116 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf19 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf19);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21116;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j115 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit19 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion111 = Alignment.INSTANCE;
                    Alignment center10 = companion111.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function21117 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i318 = i6;
                    Modifier modifier14 = modifier3;
                    function14 = function13;
                    int i49 = i30;
                    Modifier modifierPadding10 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues13 = paddingValues2;
                    constructor = companion112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierPadding10);
                    Function1<? super String, Unit> function21118 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion112, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM1309constructorimpl, currentCompositionLocalMap19);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically10 = companion111.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU10 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o10 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically10, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion112, composerM1309constructorimpl2, measurePolicyOooO00o10, composerM1309constructorimpl2, currentCompositionLocalMap110);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance10 = RowScopeInstance.INSTANCE;
                    float f19 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f19), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f110 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f110), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit110 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape13 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z14 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i49, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j115, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance10, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21118, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i318, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f110), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f19), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z14;
                    j14 = j10;
                    str4 = str3;
                    j15 = j115;
                    function17 = function21117;
                    modifier4 = modifier14;
                    function18 = function14;
                    i34 = i49;
                    paddingValues3 = paddingValues13;
                    function19 = function21118;
                    shape3 = shape13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21119 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf110 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf110);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21119;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211110 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf111 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf111);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211110;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j116 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit111 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion113 = Alignment.INSTANCE;
                    Alignment center11 = companion113.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function211111 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i319 = i6;
                    Modifier modifier15 = modifier3;
                    function14 = function13;
                    int i410 = i30;
                    Modifier modifierPadding11 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues14 = paddingValues2;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierPadding11);
                    Function1<? super String, Unit> function211112 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion114, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM1309constructorimpl, currentCompositionLocalMap111);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically11 = companion113.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU11 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o11 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically11, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion114, composerM1309constructorimpl2, measurePolicyOooO00o11, composerM1309constructorimpl2, currentCompositionLocalMap112);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance11 = RowScopeInstance.INSTANCE;
                    float f111 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f112 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f112), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit112 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape14 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z15 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i410, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j116, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance11, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function211112, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i319, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f112), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z15;
                    j14 = j10;
                    str4 = str3;
                    j15 = j116;
                    function17 = function211111;
                    modifier4 = modifier15;
                    function18 = function14;
                    i34 = i410;
                    paddingValues3 = paddingValues14;
                    function19 = function211112;
                    shape3 = shape14;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
            }
            i6 |= 3072;
            function5 = function4;
            i11 = i5 & 16;
            i12 = 8192;
            if (i11 != 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i6 |= i13;
            }
            i14 = i5 & 32;
            if (i14 != 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i6 |= i15;
            }
            i16 = i5 & 64;
            if (i16 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i17 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i17 = 524288;
                }
                i6 |= i17;
            }
            if ((i3 & 29360128) != 0) {
                if ((i5 & 128) == 0) {
                    i36 = Configuration.BLOCK_SIZE;
                } else {
                    i36 = Configuration.BLOCK_SIZE;
                }
                i6 |= i36;
            }
            if ((234881024 & i3) != 0) {
                i6 |= ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(shape)) ? 33554432 : 67108864;
            }
            i18 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i18 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i19 = 536870912;
                } else {
                    i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i6 |= i19;
            }
            i20 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i20 != 0) {
                i21 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i22 = 4;
                } else {
                    i22 = 2;
                }
                i21 = i4 | i22;
            } else {
                i21 = i4;
            }
            if ((i4 & 112) != 0) {
                i21 |= ((i5 & 2048) == 0 || !composerStartRestartGroup.changedInstance(function0)) ? 16 : 32;
            }
            i23 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
                if ((i4 & 896) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i25 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                if ((i4 & 7168) != 0) {
                    i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i12 = 16384;
                    }
                    i23 |= i12;
                }
                if ((i4 & 458752) != 0) {
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i23 |= i35;
                }
                if ((1533916891 & i6) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211113 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf112 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf112);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211113;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211114 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf113 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf113);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211114;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j117 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit113 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion115 = Alignment.INSTANCE;
                    Alignment center12 = companion115.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function211115 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i3110 = i6;
                    Modifier modifier16 = modifier3;
                    function14 = function13;
                    int i411 = i30;
                    Modifier modifierPadding12 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues15 = paddingValues2;
                    constructor = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierPadding12);
                    Function1<? super String, Unit> function211116 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion116, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM1309constructorimpl, currentCompositionLocalMap113);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically12 = companion115.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU12 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o12 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically12, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion116, composerM1309constructorimpl2, measurePolicyOooO00o12, composerM1309constructorimpl2, currentCompositionLocalMap114);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance12 = RowScopeInstance.INSTANCE;
                    float f113 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f113), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f114 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f114), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit114 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape15 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit114, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z16 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i411, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j117, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance12, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function211116, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3110, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f114), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f113), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z16;
                    j14 = j10;
                    str4 = str3;
                    j15 = j117;
                    function17 = function211115;
                    modifier4 = modifier16;
                    function18 = function14;
                    i34 = i411;
                    paddingValues3 = paddingValues15;
                    function19 = function211116;
                    shape3 = shape15;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211117 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf114 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf114);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211117;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211118 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf115 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf115);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211118;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j118 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit115 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion117 = Alignment.INSTANCE;
                    Alignment center13 = companion117.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function211119 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i3111 = i6;
                    Modifier modifier17 = modifier3;
                    function14 = function13;
                    int i412 = i30;
                    Modifier modifierPadding13 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues16 = paddingValues2;
                    constructor = companion118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierPadding13);
                    Function1<? super String, Unit> function2111110 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion118, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM1309constructorimpl, currentCompositionLocalMap115);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically13 = companion117.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU13 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o13 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically13, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion118, composerM1309constructorimpl2, measurePolicyOooO00o13, composerM1309constructorimpl2, currentCompositionLocalMap116);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance13 = RowScopeInstance.INSTANCE;
                    float f115 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f115), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f116 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f116), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit116 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape16 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit116, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z17 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i412, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j118, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance13, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2111110, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3111, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f116), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f115), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z17;
                    j14 = j10;
                    str4 = str3;
                    j15 = j118;
                    function17 = function211119;
                    modifier4 = modifier17;
                    function18 = function14;
                    i34 = i412;
                    paddingValues3 = paddingValues16;
                    function19 = function2111110;
                    shape3 = shape16;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
            }
            i23 |= 384;
            if ((i4 & 7168) != 0) {
                i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i12 = 16384;
                }
                i23 |= i12;
            }
            if ((i4 & 458752) != 0) {
                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                    i35 = 65536;
                } else {
                    i35 = 65536;
                }
                i23 |= i35;
            }
            if ((1533916891 & i6) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111111 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf116 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf116);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111111;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                } else {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111112 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf117 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf117);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111112;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                }
                composerStartRestartGroup.endDefaults();
                long j119 = j11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                }
                mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                i31 = i28;
                if (objRememberedValue2 == companion.getEmpty()) {
                    oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                    if (function5 != null) {
                        function5.invoke(oooO0OO);
                        Unit unit117 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.updateRememberedValue(oooO0OO);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Companion companion119 = Alignment.INSTANCE;
                Alignment center14 = companion119.getCenter();
                Function1<? super Function1<? super String, Unit>, Unit> function2111113 = function5;
                companion2 = Modifier.INSTANCE;
                int i3112 = i6;
                Modifier modifier18 = modifier3;
                function14 = function13;
                int i413 = i30;
                Modifier modifierPadding14 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                PaddingValues paddingValues17 = paddingValues2;
                constructor = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierPadding14);
                Function1<? super String, Unit> function2111114 = function8;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1110, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM1309constructorimpl, currentCompositionLocalMap117);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically14 = companion119.getCenterVertically();
                Modifier modifierM168backgroundbw27NRU14 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o14 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically14, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1110, composerM1309constructorimpl2, measurePolicyOooO00o14, composerM1309constructorimpl2, currentCompositionLocalMap118);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance14 = RowScopeInstance.INSTANCE;
                float f117 = 12;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f117), null, composerStartRestartGroup, 6, 2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                float f118 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f118), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue5;
                Unit unit118 = Unit.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                Shape shape17 = shape2;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit118, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                boolean z18 = z3;
                BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i413, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j119, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance14, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2111114, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3112, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f118), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(-616911648);
                if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                    i32 = i29;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i32 = i29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f117), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function12;
                i33 = i32;
                j12 = j6;
                function16 = function11;
                j13 = j9;
                z4 = z18;
                j14 = j10;
                str4 = str3;
                j15 = j119;
                function17 = function2111113;
                modifier4 = modifier18;
                function18 = function14;
                i34 = i413;
                paddingValues3 = paddingValues17;
                function19 = function2111114;
                shape3 = shape17;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111115 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf118 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf118);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111115;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                } else {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111116 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf119 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf119);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111116;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                }
                composerStartRestartGroup.endDefaults();
                long j1110 = j11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                }
                mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                i31 = i28;
                if (objRememberedValue2 == companion.getEmpty()) {
                    oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                    if (function5 != null) {
                        function5.invoke(oooO0OO);
                        Unit unit119 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.updateRememberedValue(oooO0OO);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Companion companion1111 = Alignment.INSTANCE;
                Alignment center15 = companion1111.getCenter();
                Function1<? super Function1<? super String, Unit>, Unit> function2111117 = function5;
                companion2 = Modifier.INSTANCE;
                int i3113 = i6;
                Modifier modifier19 = modifier3;
                function14 = function13;
                int i414 = i30;
                Modifier modifierPadding15 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                PaddingValues paddingValues18 = paddingValues2;
                constructor = companion1112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierPadding15);
                Function1<? super String, Unit> function2111118 = function8;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1112, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM1309constructorimpl, currentCompositionLocalMap119);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically15 = companion1111.getCenterVertically();
                Modifier modifierM168backgroundbw27NRU15 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o15 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically15, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion1112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1112, composerM1309constructorimpl2, measurePolicyOooO00o15, composerM1309constructorimpl2, currentCompositionLocalMap1110);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance15 = RowScopeInstance.INSTANCE;
                float f119 = 12;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f119), null, composerStartRestartGroup, 6, 2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                float f1110 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1110), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue5;
                Unit unit1110 = Unit.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                Shape shape18 = shape2;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit1110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                boolean z19 = z3;
                BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i414, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1110, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance15, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2111118, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3113, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1110), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(-616911648);
                if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                    i32 = i29;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i32 = i29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f119), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function12;
                i33 = i32;
                j12 = j6;
                function16 = function11;
                j13 = j9;
                z4 = z19;
                j14 = j10;
                str4 = str3;
                j15 = j1110;
                function17 = function2111117;
                modifier4 = modifier19;
                function18 = function14;
                i34 = i414;
                paddingValues3 = paddingValues18;
                function19 = function2111118;
                shape3 = shape18;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
        }
        i6 |= 48;
        i7 = i5 & 4;
        if (i7 != 0) {
            if ((i3 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i8 = 128;
                }
                i6 |= i8;
            }
            i9 = i5 & 8;
            if (i9 != 0) {
                if ((i3 & 7168) == 0) {
                    function5 = function4;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i10 = 2048;
                    } else {
                        i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 16;
                i12 = 8192;
                if (i11 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(str)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i6 |= i13;
                }
                i14 = i5 & 32;
                if (i14 != 0) {
                    i6 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(j)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 64;
                if (i16 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i17 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i17 = 524288;
                    }
                    i6 |= i17;
                }
                if ((i3 & 29360128) != 0) {
                    if ((i5 & 128) == 0) {
                        i36 = Configuration.BLOCK_SIZE;
                    } else {
                        i36 = Configuration.BLOCK_SIZE;
                    }
                    i6 |= i36;
                }
                if ((234881024 & i3) != 0) {
                    i6 |= ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(shape)) ? 33554432 : 67108864;
                }
                i18 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i18 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i19 = 536870912;
                    } else {
                        i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i6 |= i19;
                }
                i20 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i20 != 0) {
                    i21 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i22 = 4;
                    } else {
                        i22 = 2;
                    }
                    i21 = i4 | i22;
                } else {
                    i21 = i4;
                }
                if ((i4 & 112) != 0) {
                    i21 |= ((i5 & 2048) == 0 || !composerStartRestartGroup.changedInstance(function0)) ? 16 : 32;
                }
                i23 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                    if ((i4 & 896) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i25 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            i25 = 128;
                        }
                        i23 |= i25;
                    }
                    if ((i4 & 7168) != 0) {
                        i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i12 = 16384;
                        }
                        i23 |= i12;
                    }
                    if ((i4 & 458752) != 0) {
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                            i35 = 65536;
                        } else {
                            i35 = 65536;
                        }
                        i23 |= i35;
                    }
                    if ((1533916891 & i6) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function2111119 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf1110 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf1110);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function2111119;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        } else {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function21111110 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf1111 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf1111);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function21111110;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        }
                        composerStartRestartGroup.endDefaults();
                        long j1111 = j11;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                        }
                        mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        i31 = i28;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                            if (function5 != null) {
                                function5.invoke(oooO0OO);
                                Unit unit1111 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.updateRememberedValue(oooO0OO);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Companion companion1113 = Alignment.INSTANCE;
                        Alignment center16 = companion1113.getCenter();
                        Function1<? super Function1<? super String, Unit>, Unit> function21111111 = function5;
                        companion2 = Modifier.INSTANCE;
                        int i3114 = i6;
                        Modifier modifier110 = modifier3;
                        function14 = function13;
                        int i415 = i30;
                        Modifier modifierPadding16 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(center16, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
                        PaddingValues paddingValues19 = paddingValues2;
                        constructor = companion1114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierPadding16);
                        Function1<? super String, Unit> function21111112 = function8;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1114, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy16, composerM1309constructorimpl, currentCompositionLocalMap1111);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically16 = companion1113.getCenterVertically();
                        Modifier modifierM168backgroundbw27NRU16 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o16 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically16, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion1114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1112 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU16);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1114, composerM1309constructorimpl2, measurePolicyOooO00o16, composerM1309constructorimpl2, currentCompositionLocalMap1112);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance16 = RowScopeInstance.INSTANCE;
                        float f1111 = 12;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1111), null, composerStartRestartGroup, 6, 2);
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                        float f1112 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1112), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue5;
                        Unit unit1112 = Unit.INSTANCE;
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                        Shape shape19 = shape2;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit1112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        boolean z110 = z3;
                        BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i415, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1111, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance16, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21111112, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3114, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1112), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(-616911648);
                        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                            i32 = i29;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i32 = i29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1111), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function12;
                        i33 = i32;
                        j12 = j6;
                        function16 = function11;
                        j13 = j9;
                        z4 = z110;
                        j14 = j10;
                        str4 = str3;
                        j15 = j1111;
                        function17 = function21111111;
                        modifier4 = modifier110;
                        function18 = function14;
                        i34 = i415;
                        paddingValues3 = paddingValues19;
                        function19 = function21111112;
                        shape3 = shape19;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function21111113 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf1112 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf1112);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function21111113;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        } else {
                            if (i37 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i38 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i7 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i9 != 0) {
                                function9 = OooO00o.f49951OooO0Oo;
                            } else {
                                function9 = function5;
                            }
                            if (i11 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                j5 = 600;
                            } else {
                                j5 = j;
                            }
                            if (i16 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            Function1<? super String, Unit> function21111114 = function6;
                            if ((i5 & 128) != 0) {
                                j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                                i6 &= -234881025;
                            } else {
                                shapeRoundedCornerShape = shape;
                            }
                            if (i18 != 0) {
                                i26 = 24;
                            } else {
                                i26 = i;
                            }
                            if (i20 != 0) {
                                paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                            } else {
                                paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                            }
                            if ((i5 & 2048) != 0) {
                                Integer numValueOf1113 = Integer.valueOf(i26);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(numValueOf1113);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO0O0(i26);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function10 = (Function0) objRememberedValue;
                                i23 &= -113;
                            } else {
                                function10 = function0;
                            }
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i5 & 8192) != 0) {
                                j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                                i23 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i5 & 16384) != 0) {
                                j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                                i23 &= -57345;
                            } else {
                                j8 = j4;
                            }
                            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                i27 = oO00OOO.ic_search_clear;
                                i23 &= -458753;
                            } else {
                                i27 = i2;
                            }
                            str3 = str2;
                            shape2 = shapeRoundedCornerShape;
                            paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                            j9 = j7;
                            j10 = j8;
                            function11 = function10;
                            modifier3 = modifier2;
                            i28 = i23;
                            z3 = z2;
                            function12 = function21111114;
                            i6 = i6;
                            function13 = function7;
                            i29 = i27;
                            j11 = j5;
                            function5 = function9;
                            i30 = i26;
                        }
                        composerStartRestartGroup.endDefaults();
                        long j1112 = j11;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                        }
                        mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        i31 = i28;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                            if (function5 != null) {
                                function5.invoke(oooO0OO);
                                Unit unit1113 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.updateRememberedValue(oooO0OO);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Companion companion1115 = Alignment.INSTANCE;
                        Alignment center17 = companion1115.getCenter();
                        Function1<? super Function1<? super String, Unit>, Unit> function21111115 = function5;
                        companion2 = Modifier.INSTANCE;
                        int i3115 = i6;
                        Modifier modifier111 = modifier3;
                        function14 = function13;
                        int i416 = i30;
                        Modifier modifierPadding17 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(center17, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                        PaddingValues paddingValues110 = paddingValues2;
                        constructor = companion1116.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1113 = LayoutKt.modifierMaterializerOf(modifierPadding17);
                        Function1<? super String, Unit> function21111116 = function8;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1116, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy17, composerM1309constructorimpl, currentCompositionLocalMap1113);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically17 = companion1115.getCenterVertically();
                        Modifier modifierM168backgroundbw27NRU17 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o17 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically17, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion1116.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1114 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU17);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1116, composerM1309constructorimpl2, measurePolicyOooO00o17, composerM1309constructorimpl2, currentCompositionLocalMap1114);
                        if (composerM1309constructorimpl2.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance17 = RowScopeInstance.INSTANCE;
                        float f1113 = 12;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1113), null, composerStartRestartGroup, 6, 2);
                        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                        float f1114 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1114), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue5;
                        Unit unit1114 = Unit.INSTANCE;
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                        Shape shape110 = shape2;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit1114, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        boolean z111 = z3;
                        BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i416, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1112, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance17, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21111116, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3115, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1114), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceableGroup(-616911648);
                        if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                            i32 = i29;
                            ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i32 = i29;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1113), null, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function12;
                        i33 = i32;
                        j12 = j6;
                        function16 = function11;
                        j13 = j9;
                        z4 = z111;
                        j14 = j10;
                        str4 = str3;
                        j15 = j1112;
                        function17 = function21111115;
                        modifier4 = modifier111;
                        function18 = function14;
                        i34 = i416;
                        paddingValues3 = paddingValues110;
                        function19 = function21111116;
                        shape3 = shape110;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
                }
                i23 |= 384;
                if ((i4 & 7168) != 0) {
                    i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i12 = 16384;
                    }
                    i23 |= i12;
                }
                if ((i4 & 458752) != 0) {
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i23 |= i35;
                }
                if ((1533916891 & i6) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21111117 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf1114 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf1114);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21111117;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21111118 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf1115 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf1115);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21111118;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j1113 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit1115 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion1117 = Alignment.INSTANCE;
                    Alignment center18 = companion1117.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function21111119 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i3116 = i6;
                    Modifier modifier112 = modifier3;
                    function14 = function13;
                    int i417 = i30;
                    Modifier modifierPadding18 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(center18, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1118 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues111 = paddingValues2;
                    constructor = companion1118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1115 = LayoutKt.modifierMaterializerOf(modifierPadding18);
                    Function1<? super String, Unit> function211111110 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1118, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy18, composerM1309constructorimpl, currentCompositionLocalMap1115);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically18 = companion1117.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU18 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o18 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically18, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1116 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU18);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1118, composerM1309constructorimpl2, measurePolicyOooO00o18, composerM1309constructorimpl2, currentCompositionLocalMap1116);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance18 = RowScopeInstance.INSTANCE;
                    float f1115 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1115), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f1116 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1116), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit1116 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape111 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit1116, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z112 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i417, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1113, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance18, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function211111110, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3116, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1116), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1115), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z112;
                    j14 = j10;
                    str4 = str3;
                    j15 = j1113;
                    function17 = function21111119;
                    modifier4 = modifier112;
                    function18 = function14;
                    i34 = i417;
                    paddingValues3 = paddingValues111;
                    function19 = function211111110;
                    shape3 = shape111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211111111 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf1116 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf1116);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211111111;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211111112 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf1117 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf1117);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211111112;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j1114 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit1117 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion1119 = Alignment.INSTANCE;
                    Alignment center19 = companion1119.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function211111113 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i3117 = i6;
                    Modifier modifier113 = modifier3;
                    function14 = function13;
                    int i418 = i30;
                    Modifier modifierPadding19 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(center19, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11110 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues112 = paddingValues2;
                    constructor = companion11110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1117 = LayoutKt.modifierMaterializerOf(modifierPadding19);
                    Function1<? super String, Unit> function211111114 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11110, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy19, composerM1309constructorimpl, currentCompositionLocalMap1117);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically19 = companion1119.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU19 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o19 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically19, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion11110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1118 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11110, composerM1309constructorimpl2, measurePolicyOooO00o19, composerM1309constructorimpl2, currentCompositionLocalMap1118);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance19 = RowScopeInstance.INSTANCE;
                    float f1117 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1117), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f1118 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1118), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit1118 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape112 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit1118, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z113 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i418, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1114, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance19, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function211111114, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3117, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1118), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1117), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z113;
                    j14 = j10;
                    str4 = str3;
                    j15 = j1114;
                    function17 = function211111113;
                    modifier4 = modifier113;
                    function18 = function14;
                    i34 = i418;
                    paddingValues3 = paddingValues112;
                    function19 = function211111114;
                    shape3 = shape112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
            }
            i6 |= 3072;
            function5 = function4;
            i11 = i5 & 16;
            i12 = 8192;
            if (i11 != 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i6 |= i13;
            }
            i14 = i5 & 32;
            if (i14 != 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i6 |= i15;
            }
            i16 = i5 & 64;
            if (i16 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i17 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i17 = 524288;
                }
                i6 |= i17;
            }
            if ((i3 & 29360128) != 0) {
                if ((i5 & 128) == 0) {
                    i36 = Configuration.BLOCK_SIZE;
                } else {
                    i36 = Configuration.BLOCK_SIZE;
                }
                i6 |= i36;
            }
            if ((234881024 & i3) != 0) {
                i6 |= ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(shape)) ? 33554432 : 67108864;
            }
            i18 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i18 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i19 = 536870912;
                } else {
                    i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i6 |= i19;
            }
            i20 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i20 != 0) {
                i21 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i22 = 4;
                } else {
                    i22 = 2;
                }
                i21 = i4 | i22;
            } else {
                i21 = i4;
            }
            if ((i4 & 112) != 0) {
                i21 |= ((i5 & 2048) == 0 || !composerStartRestartGroup.changedInstance(function0)) ? 16 : 32;
            }
            i23 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
                if ((i4 & 896) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i25 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                if ((i4 & 7168) != 0) {
                    i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i12 = 16384;
                    }
                    i23 |= i12;
                }
                if ((i4 & 458752) != 0) {
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i23 |= i35;
                }
                if ((1533916891 & i6) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211111115 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf1118 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf1118);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211111115;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211111116 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf1119 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf1119);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211111116;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j1115 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit1119 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion11111 = Alignment.INSTANCE;
                    Alignment center110 = companion11111.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function211111117 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i3118 = i6;
                    Modifier modifier114 = modifier3;
                    function14 = function13;
                    int i419 = i30;
                    Modifier modifierPadding110 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(center110, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues113 = paddingValues2;
                    constructor = companion11112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1119 = LayoutKt.modifierMaterializerOf(modifierPadding110);
                    Function1<? super String, Unit> function211111118 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11112, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy110, composerM1309constructorimpl, currentCompositionLocalMap1119);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically110 = companion11111.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU110 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o110 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically110, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion11112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11110 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11112, composerM1309constructorimpl2, measurePolicyOooO00o110, composerM1309constructorimpl2, currentCompositionLocalMap11110);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance110 = RowScopeInstance.INSTANCE;
                    float f1119 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1119), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f11110 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11110), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit11110 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape113 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit11110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z114 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i419, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1115, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance110, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function211111118, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3118, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11110), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1119), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z114;
                    j14 = j10;
                    str4 = str3;
                    j15 = j1115;
                    function17 = function211111117;
                    modifier4 = modifier114;
                    function18 = function14;
                    i34 = i419;
                    paddingValues3 = paddingValues113;
                    function19 = function211111118;
                    shape3 = shape113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function211111119 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf11110 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf11110);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function211111119;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function2111111110 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf11111 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf11111);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function2111111110;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j1116 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit11111 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion11113 = Alignment.INSTANCE;
                    Alignment center111 = companion11113.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function2111111111 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i3119 = i6;
                    Modifier modifier115 = modifier3;
                    function14 = function13;
                    int i4110 = i30;
                    Modifier modifierPadding111 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(center111, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11114 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues114 = paddingValues2;
                    constructor = companion11114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11111 = LayoutKt.modifierMaterializerOf(modifierPadding111);
                    Function1<? super String, Unit> function2111111112 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11114, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy111, composerM1309constructorimpl, currentCompositionLocalMap11111);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically111 = companion11113.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU111 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o111 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically111, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion11114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11112 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11114, composerM1309constructorimpl2, measurePolicyOooO00o111, composerM1309constructorimpl2, currentCompositionLocalMap11112);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance111 = RowScopeInstance.INSTANCE;
                    float f11111 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11111), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f11112 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11112), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit11112 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape114 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit11112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z115 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4110, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1116, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance111, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2111111112, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i3119, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11112), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11111), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z115;
                    j14 = j10;
                    str4 = str3;
                    j15 = j1116;
                    function17 = function2111111111;
                    modifier4 = modifier115;
                    function18 = function14;
                    i34 = i4110;
                    paddingValues3 = paddingValues114;
                    function19 = function2111111112;
                    shape3 = shape114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
            }
            i23 |= 384;
            if ((i4 & 7168) != 0) {
                i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i12 = 16384;
                }
                i23 |= i12;
            }
            if ((i4 & 458752) != 0) {
                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                    i35 = 65536;
                } else {
                    i35 = 65536;
                }
                i23 |= i35;
            }
            if ((1533916891 & i6) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111111113 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf11112 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf11112);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111111113;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                } else {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111111114 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf11113 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf11113);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111111114;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                }
                composerStartRestartGroup.endDefaults();
                long j1117 = j11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                }
                mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                i31 = i28;
                if (objRememberedValue2 == companion.getEmpty()) {
                    oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                    if (function5 != null) {
                        function5.invoke(oooO0OO);
                        Unit unit11113 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.updateRememberedValue(oooO0OO);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Companion companion11115 = Alignment.INSTANCE;
                Alignment center112 = companion11115.getCenter();
                Function1<? super Function1<? super String, Unit>, Unit> function2111111115 = function5;
                companion2 = Modifier.INSTANCE;
                int i31110 = i6;
                Modifier modifier116 = modifier3;
                function14 = function13;
                int i4111 = i30;
                Modifier modifierPadding112 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(center112, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11116 = ComposeUiNode.INSTANCE;
                PaddingValues paddingValues115 = paddingValues2;
                constructor = companion11116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11113 = LayoutKt.modifierMaterializerOf(modifierPadding112);
                Function1<? super String, Unit> function2111111116 = function8;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11116, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy112, composerM1309constructorimpl, currentCompositionLocalMap11113);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically112 = companion11115.getCenterVertically();
                Modifier modifierM168backgroundbw27NRU112 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o112 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically112, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion11116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11114 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11116, composerM1309constructorimpl2, measurePolicyOooO00o112, composerM1309constructorimpl2, currentCompositionLocalMap11114);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance112 = RowScopeInstance.INSTANCE;
                float f11113 = 12;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11113), null, composerStartRestartGroup, 6, 2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                float f11114 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11114), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue5;
                Unit unit11114 = Unit.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                Shape shape115 = shape2;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit11114, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                boolean z116 = z3;
                BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4111, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1117, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance112, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2111111116, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31110, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11114), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(-616911648);
                if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                    i32 = i29;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i32 = i29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11113), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function12;
                i33 = i32;
                j12 = j6;
                function16 = function11;
                j13 = j9;
                z4 = z116;
                j14 = j10;
                str4 = str3;
                j15 = j1117;
                function17 = function2111111115;
                modifier4 = modifier116;
                function18 = function14;
                i34 = i4111;
                paddingValues3 = paddingValues115;
                function19 = function2111111116;
                shape3 = shape115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111111117 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf11114 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf11114);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111111117;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                } else {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111111118 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf11115 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf11115);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111111118;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                }
                composerStartRestartGroup.endDefaults();
                long j1118 = j11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                }
                mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                i31 = i28;
                if (objRememberedValue2 == companion.getEmpty()) {
                    oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                    if (function5 != null) {
                        function5.invoke(oooO0OO);
                        Unit unit11115 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.updateRememberedValue(oooO0OO);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Companion companion11117 = Alignment.INSTANCE;
                Alignment center113 = companion11117.getCenter();
                Function1<? super Function1<? super String, Unit>, Unit> function2111111119 = function5;
                companion2 = Modifier.INSTANCE;
                int i31111 = i6;
                Modifier modifier117 = modifier3;
                function14 = function13;
                int i4112 = i30;
                Modifier modifierPadding113 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(center113, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11118 = ComposeUiNode.INSTANCE;
                PaddingValues paddingValues116 = paddingValues2;
                constructor = companion11118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11115 = LayoutKt.modifierMaterializerOf(modifierPadding113);
                Function1<? super String, Unit> function21111111110 = function8;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11118, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy113, composerM1309constructorimpl, currentCompositionLocalMap11115);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically113 = companion11117.getCenterVertically();
                Modifier modifierM168backgroundbw27NRU113 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o113 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically113, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion11118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11116 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11118, composerM1309constructorimpl2, measurePolicyOooO00o113, composerM1309constructorimpl2, currentCompositionLocalMap11116);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance113 = RowScopeInstance.INSTANCE;
                float f11115 = 12;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11115), null, composerStartRestartGroup, 6, 2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                float f11116 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11116), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue5;
                Unit unit11116 = Unit.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                Shape shape116 = shape2;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit11116, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                boolean z117 = z3;
                BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4112, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1118, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance113, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21111111110, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31111, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11116), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(-616911648);
                if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                    i32 = i29;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i32 = i29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11115), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function12;
                i33 = i32;
                j12 = j6;
                function16 = function11;
                j13 = j9;
                z4 = z117;
                j14 = j10;
                str4 = str3;
                j15 = j1118;
                function17 = function2111111119;
                modifier4 = modifier117;
                function18 = function14;
                i34 = i4112;
                paddingValues3 = paddingValues116;
                function19 = function21111111110;
                shape3 = shape116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
        }
        i6 |= 384;
        i9 = i5 & 8;
        if (i9 != 0) {
            if ((i3 & 7168) == 0) {
                function5 = function4;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i10 = 2048;
                } else {
                    i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i6 |= i10;
            }
            i11 = i5 & 16;
            i12 = 8192;
            if (i11 != 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i6 |= i13;
            }
            i14 = i5 & 32;
            if (i14 != 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i6 |= i15;
            }
            i16 = i5 & 64;
            if (i16 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i17 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i17 = 524288;
                }
                i6 |= i17;
            }
            if ((i3 & 29360128) != 0) {
                if ((i5 & 128) == 0) {
                    i36 = Configuration.BLOCK_SIZE;
                } else {
                    i36 = Configuration.BLOCK_SIZE;
                }
                i6 |= i36;
            }
            if ((234881024 & i3) != 0) {
                i6 |= ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(shape)) ? 33554432 : 67108864;
            }
            i18 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i18 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i19 = 536870912;
                } else {
                    i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i6 |= i19;
            }
            i20 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i20 != 0) {
                i21 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i22 = 4;
                } else {
                    i22 = 2;
                }
                i21 = i4 | i22;
            } else {
                i21 = i4;
            }
            if ((i4 & 112) != 0) {
                i21 |= ((i5 & 2048) == 0 || !composerStartRestartGroup.changedInstance(function0)) ? 16 : 32;
            }
            i23 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
                if ((i4 & 896) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i25 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                if ((i4 & 7168) != 0) {
                    i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i12 = 16384;
                    }
                    i23 |= i12;
                }
                if ((i4 & 458752) != 0) {
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i23 |= i35;
                }
                if ((1533916891 & i6) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21111111111 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf11116 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf11116);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21111111111;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21111111112 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf11117 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf11117);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21111111112;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j1119 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit11117 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion11119 = Alignment.INSTANCE;
                    Alignment center114 = companion11119.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function21111111113 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i31112 = i6;
                    Modifier modifier118 = modifier3;
                    function14 = function13;
                    int i4113 = i30;
                    Modifier modifierPadding114 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(center114, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111110 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues117 = paddingValues2;
                    constructor = companion111110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11117 = LayoutKt.modifierMaterializerOf(modifierPadding114);
                    Function1<? super String, Unit> function21111111114 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111110, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy114, composerM1309constructorimpl, currentCompositionLocalMap11117);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically114 = companion11119.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU114 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o114 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically114, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion111110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11118 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111110, composerM1309constructorimpl2, measurePolicyOooO00o114, composerM1309constructorimpl2, currentCompositionLocalMap11118);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance114 = RowScopeInstance.INSTANCE;
                    float f11117 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11117), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f11118 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11118), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit11118 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape117 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit11118, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z118 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4113, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j1119, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance114, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21111111114, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31112, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11118), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11117), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z118;
                    j14 = j10;
                    str4 = str3;
                    j15 = j1119;
                    function17 = function21111111113;
                    modifier4 = modifier118;
                    function18 = function14;
                    i34 = i4113;
                    paddingValues3 = paddingValues117;
                    function19 = function21111111114;
                    shape3 = shape117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21111111115 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf11118 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf11118);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21111111115;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    } else {
                        if (i37 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i38 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i7 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i9 != 0) {
                            function9 = OooO00o.f49951OooO0Oo;
                        } else {
                            function9 = function5;
                        }
                        if (i11 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            j5 = 600;
                        } else {
                            j5 = j;
                        }
                        if (i16 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        Function1<? super String, Unit> function21111111116 = function6;
                        if ((i5 & 128) != 0) {
                            j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                            i6 &= -29360129;
                        } else {
                            j6 = j2;
                        }
                        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                            i6 &= -234881025;
                        } else {
                            shapeRoundedCornerShape = shape;
                        }
                        if (i18 != 0) {
                            i26 = 24;
                        } else {
                            i26 = i;
                        }
                        if (i20 != 0) {
                            paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                        } else {
                            paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                        }
                        if ((i5 & 2048) != 0) {
                            Integer numValueOf11119 = Integer.valueOf(i26);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf11119);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(i26);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function10 = (Function0) objRememberedValue;
                            i23 &= -113;
                        } else {
                            function10 = function0;
                        }
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i5 & 8192) != 0) {
                            j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                            i23 &= -7169;
                        } else {
                            j7 = j3;
                        }
                        if ((i5 & 16384) != 0) {
                            j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                            i23 &= -57345;
                        } else {
                            j8 = j4;
                        }
                        if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                            i27 = oO00OOO.ic_search_clear;
                            i23 &= -458753;
                        } else {
                            i27 = i2;
                        }
                        str3 = str2;
                        shape2 = shapeRoundedCornerShape;
                        paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                        j9 = j7;
                        j10 = j8;
                        function11 = function10;
                        modifier3 = modifier2;
                        i28 = i23;
                        z3 = z2;
                        function12 = function21111111116;
                        i6 = i6;
                        function13 = function7;
                        i29 = i27;
                        j11 = j5;
                        function5 = function9;
                        i30 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    long j11110 = j11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                    }
                    mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    i31 = i28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                        if (function5 != null) {
                            function5.invoke(oooO0OO);
                            Unit unit11119 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.updateRememberedValue(oooO0OO);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Companion companion111111 = Alignment.INSTANCE;
                    Alignment center115 = companion111111.getCenter();
                    Function1<? super Function1<? super String, Unit>, Unit> function21111111117 = function5;
                    companion2 = Modifier.INSTANCE;
                    int i31113 = i6;
                    Modifier modifier119 = modifier3;
                    function14 = function13;
                    int i4114 = i30;
                    Modifier modifierPadding115 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(center115, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111112 = ComposeUiNode.INSTANCE;
                    PaddingValues paddingValues118 = paddingValues2;
                    constructor = companion111112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11119 = LayoutKt.modifierMaterializerOf(modifierPadding115);
                    Function1<? super String, Unit> function21111111118 = function8;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111112, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy115, composerM1309constructorimpl, currentCompositionLocalMap11119);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically115 = companion111111.getCenterVertically();
                    Modifier modifierM168backgroundbw27NRU115 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o115 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically115, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion111112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111110 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111112, composerM1309constructorimpl2, measurePolicyOooO00o115, composerM1309constructorimpl2, currentCompositionLocalMap111110);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance115 = RowScopeInstance.INSTANCE;
                    float f11119 = 12;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11119), null, composerStartRestartGroup, 6, 2);
                    IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                    float f111110 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111110), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue5;
                    Unit unit111110 = Unit.INSTANCE;
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                    Shape shape118 = shape2;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit111110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                    boolean z119 = z3;
                    BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4114, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j11110, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance115, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21111111118, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31113, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111110), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceableGroup(-616911648);
                    if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                        i32 = i29;
                        ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i32 = i29;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f11119), null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function15 = function12;
                    i33 = i32;
                    j12 = j6;
                    function16 = function11;
                    j13 = j9;
                    z4 = z119;
                    j14 = j10;
                    str4 = str3;
                    j15 = j11110;
                    function17 = function21111111117;
                    modifier4 = modifier119;
                    function18 = function14;
                    i34 = i4114;
                    paddingValues3 = paddingValues118;
                    function19 = function21111111118;
                    shape3 = shape118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
            }
            i23 |= 384;
            if ((i4 & 7168) != 0) {
                i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i12 = 16384;
                }
                i23 |= i12;
            }
            if ((i4 & 458752) != 0) {
                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                    i35 = 65536;
                } else {
                    i35 = 65536;
                }
                i23 |= i35;
            }
            if ((1533916891 & i6) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function21111111119 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf111110 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf111110);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function21111111119;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                } else {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function211111111110 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf111111 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf111111);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function211111111110;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                }
                composerStartRestartGroup.endDefaults();
                long j11111 = j11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                }
                mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                i31 = i28;
                if (objRememberedValue2 == companion.getEmpty()) {
                    oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                    if (function5 != null) {
                        function5.invoke(oooO0OO);
                        Unit unit111111 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.updateRememberedValue(oooO0OO);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Companion companion111113 = Alignment.INSTANCE;
                Alignment center116 = companion111113.getCenter();
                Function1<? super Function1<? super String, Unit>, Unit> function211111111111 = function5;
                companion2 = Modifier.INSTANCE;
                int i31114 = i6;
                Modifier modifier1110 = modifier3;
                function14 = function13;
                int i4115 = i30;
                Modifier modifierPadding116 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(center116, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111114 = ComposeUiNode.INSTANCE;
                PaddingValues paddingValues119 = paddingValues2;
                constructor = companion111114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111111 = LayoutKt.modifierMaterializerOf(modifierPadding116);
                Function1<? super String, Unit> function211111111112 = function8;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111114, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy116, composerM1309constructorimpl, currentCompositionLocalMap111111);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically116 = companion111113.getCenterVertically();
                Modifier modifierM168backgroundbw27NRU116 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o116 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically116, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111112 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111114, composerM1309constructorimpl2, measurePolicyOooO00o116, composerM1309constructorimpl2, currentCompositionLocalMap111112);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance116 = RowScopeInstance.INSTANCE;
                float f111111 = 12;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111111), null, composerStartRestartGroup, 6, 2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                float f111112 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111112), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue5;
                Unit unit111112 = Unit.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                Shape shape119 = shape2;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit111112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                boolean z1110 = z3;
                BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4115, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j11111, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance116, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function211111111112, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31114, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111112), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(-616911648);
                if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                    i32 = i29;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i32 = i29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111111), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function12;
                i33 = i32;
                j12 = j6;
                function16 = function11;
                j13 = j9;
                z4 = z1110;
                j14 = j10;
                str4 = str3;
                j15 = j11111;
                function17 = function211111111111;
                modifier4 = modifier1110;
                function18 = function14;
                i34 = i4115;
                paddingValues3 = paddingValues119;
                function19 = function211111111112;
                shape3 = shape119;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function211111111113 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf111112 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf111112);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function211111111113;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                } else {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function211111111114 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf111113 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf111113);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function211111111114;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                }
                composerStartRestartGroup.endDefaults();
                long j11112 = j11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                }
                mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                i31 = i28;
                if (objRememberedValue2 == companion.getEmpty()) {
                    oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                    if (function5 != null) {
                        function5.invoke(oooO0OO);
                        Unit unit111113 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.updateRememberedValue(oooO0OO);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Companion companion111115 = Alignment.INSTANCE;
                Alignment center117 = companion111115.getCenter();
                Function1<? super Function1<? super String, Unit>, Unit> function211111111115 = function5;
                companion2 = Modifier.INSTANCE;
                int i31115 = i6;
                Modifier modifier1111 = modifier3;
                function14 = function13;
                int i4116 = i30;
                Modifier modifierPadding117 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(center117, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111116 = ComposeUiNode.INSTANCE;
                PaddingValues paddingValues1110 = paddingValues2;
                constructor = companion111116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111113 = LayoutKt.modifierMaterializerOf(modifierPadding117);
                Function1<? super String, Unit> function211111111116 = function8;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111116, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy117, composerM1309constructorimpl, currentCompositionLocalMap111113);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically117 = companion111115.getCenterVertically();
                Modifier modifierM168backgroundbw27NRU117 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o117 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically117, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111114 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111116, composerM1309constructorimpl2, measurePolicyOooO00o117, composerM1309constructorimpl2, currentCompositionLocalMap111114);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111114, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance117 = RowScopeInstance.INSTANCE;
                float f111113 = 12;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111113), null, composerStartRestartGroup, 6, 2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                float f111114 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111114), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue5;
                Unit unit111114 = Unit.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                Shape shape1110 = shape2;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit111114, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                boolean z1111 = z3;
                BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4116, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j11112, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance117, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function211111111116, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31115, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111114), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(-616911648);
                if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                    i32 = i29;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i32 = i29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111113), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function12;
                i33 = i32;
                j12 = j6;
                function16 = function11;
                j13 = j9;
                z4 = z1111;
                j14 = j10;
                str4 = str3;
                j15 = j11112;
                function17 = function211111111115;
                modifier4 = modifier1111;
                function18 = function14;
                i34 = i4116;
                paddingValues3 = paddingValues1110;
                function19 = function211111111116;
                shape3 = shape1110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
        }
        i6 |= 3072;
        function5 = function4;
        i11 = i5 & 16;
        i12 = 8192;
        if (i11 != 0) {
            i6 |= 24576;
        } else if ((i3 & 57344) == 0) {
            if (composerStartRestartGroup.changed(str)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i6 |= i13;
        }
        i14 = i5 & 32;
        if (i14 != 0) {
            i6 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (composerStartRestartGroup.changed(j)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i6 |= i15;
        }
        i16 = i5 & 64;
        if (i16 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i17 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i17 = 524288;
            }
            i6 |= i17;
        }
        if ((i3 & 29360128) != 0) {
            if ((i5 & 128) == 0) {
                i36 = Configuration.BLOCK_SIZE;
            } else {
                i36 = Configuration.BLOCK_SIZE;
            }
            i6 |= i36;
        }
        if ((234881024 & i3) != 0) {
            i6 |= ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(shape)) ? 33554432 : 67108864;
        }
        i18 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i18 != 0) {
            i6 |= 805306368;
        } else if ((i3 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(i)) {
                i19 = 536870912;
            } else {
                i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i6 |= i19;
        }
        i20 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i20 != 0) {
            i21 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (composerStartRestartGroup.changed(paddingValues)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i21 = i4 | i22;
        } else {
            i21 = i4;
        }
        if ((i4 & 112) != 0) {
            i21 |= ((i5 & 2048) == 0 || !composerStartRestartGroup.changedInstance(function0)) ? 16 : 32;
        }
        i23 = i21;
        i24 = i5 & 4096;
        if (i24 != 0) {
            if ((i4 & 896) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i25 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i25 = 128;
                }
                i23 |= i25;
            }
            if ((i4 & 7168) != 0) {
                i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i12 = 16384;
                }
                i23 |= i12;
            }
            if ((i4 & 458752) != 0) {
                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                    i35 = 65536;
                } else {
                    i35 = 65536;
                }
                i23 |= i35;
            }
            if ((1533916891 & i6) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function211111111117 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf111114 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf111114);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function211111111117;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                } else {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function211111111118 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf111115 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf111115);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function211111111118;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                }
                composerStartRestartGroup.endDefaults();
                long j11113 = j11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                }
                mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                i31 = i28;
                if (objRememberedValue2 == companion.getEmpty()) {
                    oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                    if (function5 != null) {
                        function5.invoke(oooO0OO);
                        Unit unit111115 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.updateRememberedValue(oooO0OO);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Companion companion111117 = Alignment.INSTANCE;
                Alignment center118 = companion111117.getCenter();
                Function1<? super Function1<? super String, Unit>, Unit> function211111111119 = function5;
                companion2 = Modifier.INSTANCE;
                int i31116 = i6;
                Modifier modifier1112 = modifier3;
                function14 = function13;
                int i4117 = i30;
                Modifier modifierPadding118 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(center118, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111118 = ComposeUiNode.INSTANCE;
                PaddingValues paddingValues1111 = paddingValues2;
                constructor = companion111118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111115 = LayoutKt.modifierMaterializerOf(modifierPadding118);
                Function1<? super String, Unit> function2111111111110 = function8;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111118, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy118, composerM1309constructorimpl, currentCompositionLocalMap111115);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically118 = companion111117.getCenterVertically();
                Modifier modifierM168backgroundbw27NRU118 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o118 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically118, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111116 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111118, composerM1309constructorimpl2, measurePolicyOooO00o118, composerM1309constructorimpl2, currentCompositionLocalMap111116);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111116, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance118 = RowScopeInstance.INSTANCE;
                float f111115 = 12;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111115), null, composerStartRestartGroup, 6, 2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                float f111116 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111116), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue5;
                Unit unit111116 = Unit.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                Shape shape1111 = shape2;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit111116, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                boolean z1112 = z3;
                BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4117, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j11113, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance118, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2111111111110, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31116, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111116), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(-616911648);
                if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                    i32 = i29;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i32 = i29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111115), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function12;
                i33 = i32;
                j12 = j6;
                function16 = function11;
                j13 = j9;
                z4 = z1112;
                j14 = j10;
                str4 = str3;
                j15 = j11113;
                function17 = function211111111119;
                modifier4 = modifier1112;
                function18 = function14;
                i34 = i4117;
                paddingValues3 = paddingValues1111;
                function19 = function2111111111110;
                shape3 = shape1111;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111111111111 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf111116 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf111116);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111111111111;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                } else {
                    if (i37 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i38 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i7 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i9 != 0) {
                        function9 = OooO00o.f49951OooO0Oo;
                    } else {
                        function9 = function5;
                    }
                    if (i11 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        j5 = 600;
                    } else {
                        j5 = j;
                    }
                    if (i16 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    Function1<? super String, Unit> function2111111111112 = function6;
                    if ((i5 & 128) != 0) {
                        j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                        i6 &= -29360129;
                    } else {
                        j6 = j2;
                    }
                    if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        i6 &= -234881025;
                    } else {
                        shapeRoundedCornerShape = shape;
                    }
                    if (i18 != 0) {
                        i26 = 24;
                    } else {
                        i26 = i;
                    }
                    if (i20 != 0) {
                        paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                    } else {
                        paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                    }
                    if ((i5 & 2048) != 0) {
                        Integer numValueOf111117 = Integer.valueOf(i26);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf111117);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(i26);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function10 = (Function0) objRememberedValue;
                        i23 &= -113;
                    } else {
                        function10 = function0;
                    }
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i5 & 8192) != 0) {
                        j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                        i23 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i5 & 16384) != 0) {
                        j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                        i23 &= -57345;
                    } else {
                        j8 = j4;
                    }
                    if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                        i27 = oO00OOO.ic_search_clear;
                        i23 &= -458753;
                    } else {
                        i27 = i2;
                    }
                    str3 = str2;
                    shape2 = shapeRoundedCornerShape;
                    paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                    j9 = j7;
                    j10 = j8;
                    function11 = function10;
                    modifier3 = modifier2;
                    i28 = i23;
                    z3 = z2;
                    function12 = function2111111111112;
                    i6 = i6;
                    function13 = function7;
                    i29 = i27;
                    j11 = j5;
                    function5 = function9;
                    i30 = i26;
                }
                composerStartRestartGroup.endDefaults();
                long j11114 = j11;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
                }
                mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                i31 = i28;
                if (objRememberedValue2 == companion.getEmpty()) {
                    oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                    if (function5 != null) {
                        function5.invoke(oooO0OO);
                        Unit unit111117 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.updateRememberedValue(oooO0OO);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Companion companion111119 = Alignment.INSTANCE;
                Alignment center119 = companion111119.getCenter();
                Function1<? super Function1<? super String, Unit>, Unit> function2111111111113 = function5;
                companion2 = Modifier.INSTANCE;
                int i31117 = i6;
                Modifier modifier1113 = modifier3;
                function14 = function13;
                int i4118 = i30;
                Modifier modifierPadding119 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(center119, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1111110 = ComposeUiNode.INSTANCE;
                PaddingValues paddingValues1112 = paddingValues2;
                constructor = companion1111110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111117 = LayoutKt.modifierMaterializerOf(modifierPadding119);
                Function1<? super String, Unit> function2111111111114 = function8;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111110, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy119, composerM1309constructorimpl, currentCompositionLocalMap111117);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically119 = companion111119.getCenterVertically();
                Modifier modifierM168backgroundbw27NRU119 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o119 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically119, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion1111110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111118 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111110, composerM1309constructorimpl2, measurePolicyOooO00o119, composerM1309constructorimpl2, currentCompositionLocalMap111118);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111118, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance119 = RowScopeInstance.INSTANCE;
                float f111117 = 12;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111117), null, composerStartRestartGroup, 6, 2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
                float f111118 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111118), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue5;
                Unit unit111118 = Unit.INSTANCE;
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
                Shape shape1112 = shape2;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit111118, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                boolean z1113 = z3;
                BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4118, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j11114, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance119, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2111111111114, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31117, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111118), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.startReplaceableGroup(-616911648);
                if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                    i32 = i29;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i32 = i29;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111117), null, composerStartRestartGroup, 6, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function12;
                i33 = i32;
                j12 = j6;
                function16 = function11;
                j13 = j9;
                z4 = z1113;
                j14 = j10;
                str4 = str3;
                j15 = j11114;
                function17 = function2111111111113;
                modifier4 = modifier1113;
                function18 = function14;
                i34 = i4118;
                paddingValues3 = paddingValues1112;
                function19 = function2111111111114;
                shape3 = shape1112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
        }
        i23 |= 384;
        if ((i4 & 7168) != 0) {
            i23 |= ((i5 & 8192) == 0 || !composerStartRestartGroup.changed(j3)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
        }
        if ((i4 & 57344) != 0) {
            if ((i5 & 16384) == 0) {
                i12 = 16384;
            }
            i23 |= i12;
        }
        if ((i4 & 458752) != 0) {
            if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                i35 = 65536;
            } else {
                i35 = 65536;
            }
            i23 |= i35;
        }
        if ((1533916891 & i6) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i37 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i38 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i7 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                if (i9 != 0) {
                    function9 = OooO00o.f49951OooO0Oo;
                } else {
                    function9 = function5;
                }
                if (i11 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    j5 = 600;
                } else {
                    j5 = j;
                }
                if (i16 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                Function1<? super String, Unit> function2111111111115 = function6;
                if ((i5 & 128) != 0) {
                    j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                    i6 &= -29360129;
                } else {
                    j6 = j2;
                }
                if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                    i6 &= -234881025;
                } else {
                    shapeRoundedCornerShape = shape;
                }
                if (i18 != 0) {
                    i26 = 24;
                } else {
                    i26 = i;
                }
                if (i20 != 0) {
                    paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                } else {
                    paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                }
                if ((i5 & 2048) != 0) {
                    Integer numValueOf111118 = Integer.valueOf(i26);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf111118);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(i26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(i26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = (Function0) objRememberedValue;
                    i23 &= -113;
                } else {
                    function10 = function0;
                }
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 8192) != 0) {
                    j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                    i23 &= -7169;
                } else {
                    j7 = j3;
                }
                if ((i5 & 16384) != 0) {
                    j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                    i23 &= -57345;
                } else {
                    j8 = j4;
                }
                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                    i27 = oO00OOO.ic_search_clear;
                    i23 &= -458753;
                } else {
                    i27 = i2;
                }
                str3 = str2;
                shape2 = shapeRoundedCornerShape;
                paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                j9 = j7;
                j10 = j8;
                function11 = function10;
                modifier3 = modifier2;
                i28 = i23;
                z3 = z2;
                function12 = function2111111111115;
                i6 = i6;
                function13 = function7;
                i29 = i27;
                j11 = j5;
                function5 = function9;
                i30 = i26;
            } else {
                if (i37 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i38 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i7 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                if (i9 != 0) {
                    function9 = OooO00o.f49951OooO0Oo;
                } else {
                    function9 = function5;
                }
                if (i11 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    j5 = 600;
                } else {
                    j5 = j;
                }
                if (i16 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                Function1<? super String, Unit> function2111111111116 = function6;
                if ((i5 & 128) != 0) {
                    j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                    i6 &= -29360129;
                } else {
                    j6 = j2;
                }
                if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                    i6 &= -234881025;
                } else {
                    shapeRoundedCornerShape = shape;
                }
                if (i18 != 0) {
                    i26 = 24;
                } else {
                    i26 = i;
                }
                if (i20 != 0) {
                    paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                } else {
                    paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                }
                if ((i5 & 2048) != 0) {
                    Integer numValueOf111119 = Integer.valueOf(i26);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf111119);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(i26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(i26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = (Function0) objRememberedValue;
                    i23 &= -113;
                } else {
                    function10 = function0;
                }
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 8192) != 0) {
                    j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                    i23 &= -7169;
                } else {
                    j7 = j3;
                }
                if ((i5 & 16384) != 0) {
                    j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                    i23 &= -57345;
                } else {
                    j8 = j4;
                }
                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                    i27 = oO00OOO.ic_search_clear;
                    i23 &= -458753;
                } else {
                    i27 = i2;
                }
                str3 = str2;
                shape2 = shapeRoundedCornerShape;
                paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                j9 = j7;
                j10 = j8;
                function11 = function10;
                modifier3 = modifier2;
                i28 = i23;
                z3 = z2;
                function12 = function2111111111116;
                i6 = i6;
                function13 = function7;
                i29 = i27;
                j11 = j5;
                function5 = function9;
                i30 = i26;
            }
            composerStartRestartGroup.endDefaults();
            long j11115 = j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
            }
            mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            i31 = i28;
            if (objRememberedValue2 == companion.getEmpty()) {
                oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                if (function5 != null) {
                    function5.invoke(oooO0OO);
                    Unit unit111119 = Unit.INSTANCE;
                }
                composerStartRestartGroup.updateRememberedValue(oooO0OO);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Companion companion1111111 = Alignment.INSTANCE;
            Alignment center1110 = companion1111111.getCenter();
            Function1<? super Function1<? super String, Unit>, Unit> function2111111111117 = function5;
            companion2 = Modifier.INSTANCE;
            int i31118 = i6;
            Modifier modifier1114 = modifier3;
            function14 = function13;
            int i4119 = i30;
            Modifier modifierPadding1110 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(center1110, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111112 = ComposeUiNode.INSTANCE;
            PaddingValues paddingValues1113 = paddingValues2;
            constructor = companion1111112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111119 = LayoutKt.modifierMaterializerOf(modifierPadding1110);
            Function1<? super String, Unit> function2111111111118 = function8;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111112, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy1110, composerM1309constructorimpl, currentCompositionLocalMap111119);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically1110 = companion1111111.getCenterVertically();
            Modifier modifierM168backgroundbw27NRU1110 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o1110 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically1110, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion1111112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111110 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU1110);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111112, composerM1309constructorimpl2, measurePolicyOooO00o1110, composerM1309constructorimpl2, currentCompositionLocalMap1111110);
            if (composerM1309constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111110, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance1110 = RowScopeInstance.INSTANCE;
            float f111119 = 12;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111119), null, composerStartRestartGroup, 6, 2);
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
            float f1111110 = 8;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1111110), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue5;
            Unit unit1111110 = Unit.INSTANCE;
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
            Shape shape1113 = shape2;
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit1111110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
            boolean z1114 = z3;
            BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i4119, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j11115, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance1110, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function2111111111118, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31118, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1111110), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceableGroup(-616911648);
            if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                i32 = i29;
                ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            } else {
                i32 = i29;
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f111119), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function15 = function12;
            i33 = i32;
            j12 = j6;
            function16 = function11;
            j13 = j9;
            z4 = z1114;
            j14 = j10;
            str4 = str3;
            j15 = j11115;
            function17 = function2111111111117;
            modifier4 = modifier1114;
            function18 = function14;
            i34 = i4119;
            paddingValues3 = paddingValues1113;
            function19 = function2111111111118;
            shape3 = shape1113;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i37 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i38 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i7 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                if (i9 != 0) {
                    function9 = OooO00o.f49951OooO0Oo;
                } else {
                    function9 = function5;
                }
                if (i11 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    j5 = 600;
                } else {
                    j5 = j;
                }
                if (i16 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                Function1<? super String, Unit> function2111111111119 = function6;
                if ((i5 & 128) != 0) {
                    j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                    i6 &= -29360129;
                } else {
                    j6 = j2;
                }
                if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                    i6 &= -234881025;
                } else {
                    shapeRoundedCornerShape = shape;
                }
                if (i18 != 0) {
                    i26 = 24;
                } else {
                    i26 = i;
                }
                if (i20 != 0) {
                    paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                } else {
                    paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                }
                if ((i5 & 2048) != 0) {
                    Integer numValueOf1111110 = Integer.valueOf(i26);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf1111110);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(i26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(i26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = (Function0) objRememberedValue;
                    i23 &= -113;
                } else {
                    function10 = function0;
                }
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 8192) != 0) {
                    j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                    i23 &= -7169;
                } else {
                    j7 = j3;
                }
                if ((i5 & 16384) != 0) {
                    j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                    i23 &= -57345;
                } else {
                    j8 = j4;
                }
                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                    i27 = oO00OOO.ic_search_clear;
                    i23 &= -458753;
                } else {
                    i27 = i2;
                }
                str3 = str2;
                shape2 = shapeRoundedCornerShape;
                paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                j9 = j7;
                j10 = j8;
                function11 = function10;
                modifier3 = modifier2;
                i28 = i23;
                z3 = z2;
                function12 = function2111111111119;
                i6 = i6;
                function13 = function7;
                i29 = i27;
                j11 = j5;
                function5 = function9;
                i30 = i26;
            } else {
                if (i37 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i38 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i7 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                if (i9 != 0) {
                    function9 = OooO00o.f49951OooO0Oo;
                } else {
                    function9 = function5;
                }
                if (i11 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    j5 = 600;
                } else {
                    j5 = j;
                }
                if (i16 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                Function1<? super String, Unit> function21111111111110 = function6;
                if ((i5 & 128) != 0) {
                    j6 = o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO;
                    i6 &= -29360129;
                } else {
                    j6 = j2;
                }
                if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                    i6 &= -234881025;
                } else {
                    shapeRoundedCornerShape = shape;
                }
                if (i18 != 0) {
                    i26 = 24;
                } else {
                    i26 = i;
                }
                if (i20 != 0) {
                    paddingValuesM471PaddingValuesYgX7TsA$default = PaddingKt.m471PaddingValuesYgX7TsA$default(Dp.m3765constructorimpl(12), 0.0f, 2, null);
                } else {
                    paddingValuesM471PaddingValuesYgX7TsA$default = paddingValues;
                }
                if ((i5 & 2048) != 0) {
                    Integer numValueOf1111111 = Integer.valueOf(i26);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf1111111);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(i26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(i26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function10 = (Function0) objRememberedValue;
                    i23 &= -113;
                } else {
                    function10 = function0;
                }
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i5 & 8192) != 0) {
                    j7 = o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
                    i23 &= -7169;
                } else {
                    j7 = j3;
                }
                if ((i5 & 16384) != 0) {
                    j8 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                    i23 &= -57345;
                } else {
                    j8 = j4;
                }
                if ((i5 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                    i27 = oO00OOO.ic_search_clear;
                    i23 &= -458753;
                } else {
                    i27 = i2;
                }
                str3 = str2;
                shape2 = shapeRoundedCornerShape;
                paddingValues2 = paddingValuesM471PaddingValuesYgX7TsA$default;
                j9 = j7;
                j10 = j8;
                function11 = function10;
                modifier3 = modifier2;
                i28 = i23;
                z3 = z2;
                function12 = function21111111111110;
                i6 = i6;
                function13 = function7;
                i29 = i27;
                j11 = j5;
                function5 = function9;
                i30 = i26;
            }
            composerStartRestartGroup.endDefaults();
            long j11116 = j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(575199723, i6, i28, "com.yalla.yalla.ui.composable.common.SearchComp.SearchView (SearchComp.kt:81)");
            }
            mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.INSTANCE.getSaver(), (String) null, (Function0) OooOOOO.f49996OooO0Oo, composerStartRestartGroup, 3144, 4);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            i31 = i28;
            if (objRememberedValue2 == companion.getEmpty()) {
                oooO0OO = new OooO0OO(function13, function12, mutableStateRememberSaveable);
                if (function5 != null) {
                    function5.invoke(oooO0OO);
                    Unit unit1111111 = Unit.INSTANCE;
                }
                composerStartRestartGroup.updateRememberedValue(oooO0OO);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Companion companion1111113 = Alignment.INSTANCE;
            Alignment center1111 = companion1111113.getCenter();
            Function1<? super Function1<? super String, Unit>, Unit> function21111111111111 = function5;
            companion2 = Modifier.INSTANCE;
            int i31119 = i6;
            Modifier modifier1115 = modifier3;
            function14 = function13;
            int i41110 = i30;
            Modifier modifierPadding1111 = PaddingKt.padding(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2.then(modifier3), Dp.m3765constructorimpl(48)), 0.0f, 1, null), paddingValues2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(center1111, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111114 = ComposeUiNode.INSTANCE;
            PaddingValues paddingValues1114 = paddingValues2;
            constructor = companion1111114.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111111 = LayoutKt.modifierMaterializerOf(modifierPadding1111);
            Function1<? super String, Unit> function21111111111112 = function8;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111114, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy1111, composerM1309constructorimpl, currentCompositionLocalMap1111111);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically1111 = companion1111113.getCenterVertically();
            Modifier modifierM168backgroundbw27NRU1111 = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(36)), 0.0f, 1, null), j6, shape2);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o1111 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically1111, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion1111114.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111112 = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU1111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111114, composerM1309constructorimpl2, measurePolicyOooO00o1111, composerM1309constructorimpl2, currentCompositionLocalMap1111112);
            if (composerM1309constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111112, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance1111 = RowScopeInstance.INSTANCE;
            float f1111111 = 12;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1111111), null, composerStartRestartGroup, 6, 2);
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_search, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(16)), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, composerStartRestartGroup, 440, 0);
            float f1111112 = 8;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1111112), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScopeOooO00o = androidx.compose.foundation.text.OooO00o.OooO00o((CompositionScopedCoroutineScopeCanceller) objRememberedValue3, composerStartRestartGroup, -492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FocusRequester(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue5;
            Unit unit1111112 = Unit.INSTANCE;
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z3, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(mutableState2);
            Shape shape1114 = shape2;
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new OooO0o(z3, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit1111112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
            boolean z1115 = z3;
            BasicTextFieldKt.BasicTextField((TextFieldValue) mutableStateRememberSaveable.getValue(), (Function1<? super TextFieldValue, Unit>) new OooOO0(i41110, function11, function14, coroutineScopeOooO00o, mutableStateRememberSaveable, mutableState, j11116, function12), PaddingKt.m478paddingVpY3zN4$default(FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance1111, companion2, 1.0f, false, 2, null), (FocusRequester) mutableState2.getValue()), 0.0f, Dp.m3765constructorimpl(4), 1, null), false, false, new TextStyle(j10, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m3473getSearcheUduSuo(), 7, null), new KeyboardActions(null, null, null, null, new OooO(mutableState, mutableStateRememberSaveable, function12, function21111111111112, coroutineScopeOooO00o), null, 47, null), true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1136961697, true, new OooOO0O(str3, j9, i31119, i31, mutableStateRememberSaveable)), composerStartRestartGroup, 907542528, 196608, 15384);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1111112), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceableGroup(-616911648);
            if (((TextFieldValue) mutableStateRememberSaveable.getValue()).getText().length() > 0) {
                i32 = i29;
                ImageKt.Image(PainterResources_androidKt.painterResource(i32, composerStartRestartGroup, (i31 >> 15) & 14), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(19)), false, false, 0L, false, null, null, null, new OooOOO0(mutableStateRememberSaveable, mutableState, function14, function12, coroutineScopeOooO00o), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            } else {
                i32 = i29;
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f1111111), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function15 = function12;
            i33 = i32;
            j12 = j6;
            function16 = function11;
            j13 = j9;
            z4 = z1115;
            j14 = j10;
            str4 = str3;
            j15 = j11116;
            function17 = function21111111111111;
            modifier4 = modifier1115;
            function18 = function14;
            i34 = i41110;
            paddingValues3 = paddingValues1114;
            function19 = function21111111111112;
            shape3 = shape1114;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(function15, function18, function19, function17, str4, j15, z4, j12, shape3, i34, paddingValues3, function16, modifier4, j13, j14, i33, i3, i4, i5));
    }
}
