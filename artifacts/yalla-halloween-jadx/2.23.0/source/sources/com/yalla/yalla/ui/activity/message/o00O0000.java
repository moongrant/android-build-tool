package com.yalla.yalla.ui.activity.message;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.MutableLiveData;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.data.cache.SharedGifFaceManager;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p539o0o0OoOO.y0;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPrivateChatBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatBottomCompKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,424:1\n73#2,6:425\n79#2:459\n73#2,6:496\n79#2:530\n83#2:535\n83#2:545\n73#2,6:592\n79#2:626\n83#2:633\n73#2,6:664\n79#2:698\n83#2:703\n78#3,11:431\n78#3,11:466\n78#3,11:502\n91#3:534\n91#3:539\n91#3:544\n78#3,11:553\n91#3:585\n78#3,11:598\n91#3:632\n78#3,11:670\n91#3:702\n456#4,8:442\n464#4,3:456\n456#4,8:477\n464#4,3:491\n456#4,8:513\n464#4,3:527\n467#4,3:531\n467#4,3:536\n467#4,3:541\n456#4,8:564\n464#4,3:578\n467#4,3:582\n456#4,8:609\n464#4,3:623\n467#4,3:629\n25#4:644\n456#4,8:681\n464#4,3:695\n467#4,3:699\n4144#5,6:450\n4144#5,6:485\n4144#5,6:521\n4144#5,6:572\n4144#5,6:617\n4144#5,6:689\n72#6,6:460\n78#6:494\n82#6:540\n154#7:495\n154#7:546\n154#7:587\n154#7:588\n154#7:589\n154#7:590\n154#7:591\n154#7:627\n154#7:628\n154#7:634\n154#7:635\n154#7:636\n154#7:637\n154#7:638\n154#7:639\n164#7:655\n154#7:656\n154#7:657\n154#7:658\n154#7:660\n154#7:661\n154#7:663\n66#8,6:547\n72#8:581\n76#8:586\n486#9,4:640\n490#9,2:648\n494#9:654\n1097#10,3:645\n1100#10,3:651\n486#11:650\n76#12:659\n76#12:662\n*S KotlinDebug\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatBottomCompKt\n*L\n52#1:425,6\n52#1:459\n68#1:496,6\n68#1:530\n68#1:535\n52#1:545\n136#1:592,6\n136#1:626\n136#1:633\n415#1:664,6\n415#1:698\n415#1:703\n52#1:431,11\n67#1:466,11\n68#1:502,11\n68#1:534\n67#1:539\n52#1:544\n88#1:553,11\n88#1:585\n136#1:598,11\n136#1:632\n415#1:670,11\n415#1:702\n52#1:442,8\n52#1:456,3\n67#1:477,8\n67#1:491,3\n68#1:513,8\n68#1:527,3\n68#1:531,3\n67#1:536,3\n52#1:541,3\n88#1:564,8\n88#1:578,3\n88#1:582,3\n136#1:609,8\n136#1:623,3\n136#1:629,3\n218#1:644\n415#1:681,8\n415#1:695,3\n415#1:699,3\n52#1:450,6\n67#1:485,6\n68#1:521,6\n88#1:572,6\n136#1:617,6\n415#1:689,6\n67#1:460,6\n67#1:494\n67#1:540\n71#1:495\n84#1:546\n112#1:587\n113#1:588\n139#1:589\n140#1:590\n142#1:591\n150#1:627\n162#1:628\n174#1:634\n175#1:635\n176#1:636\n200#1:637\n201#1:638\n202#1:639\n292#1:655\n293#1:656\n294#1:657\n295#1:658\n314#1:660\n315#1:661\n418#1:663\n88#1:547,6\n88#1:581\n88#1:586\n218#1:640,4\n218#1:648,2\n218#1:654\n218#1:645,3\n218#1:651,3\n218#1:650\n306#1:659\n413#1:662\n*E\n"})
public final class o00O0000 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25830OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25831OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, int i) {
            super(2);
            this.f25830OooO0Oo = oooo000;
            this.f25831OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25831OooO0o0 | 1);
            o00O0000.OooO0O0(this.f25830OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25832OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f25833OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, Context context) {
            super(0);
            this.f25832OooO0Oo = oooo000;
            this.f25833OooO0o0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p367o0OOo0o0.OooOOOO value = this.f25832OooO0Oo.f25678OooO.getValue();
            if (value != null) {
                value.OooO0OO(this.f25833OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25834OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25835OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f25836OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f25837OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, Modifier modifier, int i, int i2) {
            super(2);
            this.f25834OooO0Oo = oooo000;
            this.f25836OooO0o0 = modifier;
            this.f25835OooO0o = i;
            this.f25837OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25835OooO0o | 1);
            Modifier modifier = this.f25836OooO0o0;
            int i = this.f25837OooO0oO;
            o00O0000.OooO00o(this.f25834OooO0Oo, modifier, composer, iUpdateChangedFlags, i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25838OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
            super(0);
            this.f25838OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.ui.activity.message.Oooo000 oooo000 = this.f25838OooO0Oo;
            PrivateChatVM privateChatVMOooO0O0 = oooo000.OooO0O0();
            if (privateChatVMOooO0O0.userInfo() != null) {
                UserInfo userInfo = privateChatVMOooO0O0.userInfo();
                Intrinsics.checkNotNull(userInfo);
                if (userInfo.getUserId() != 0 && privateChatVMOooO0O0.sendFilter()) {
                    String strValueOf = String.valueOf(oooo000.OooO00o().getText());
                    boolean z = true;
                    int length = strValueOf.length() - 1;
                    int i = 0;
                    boolean z2 = false;
                    while (i <= length) {
                        boolean z3 = Intrinsics.compare((int) strValueOf.charAt(!z2 ? i : length), 32) <= 0;
                        if (z2) {
                            if (!z3) {
                                break;
                            }
                            length--;
                        } else if (z3) {
                            i++;
                        } else {
                            z2 = true;
                        }
                    }
                    if (TextUtils.isEmpty(strValueOf.subSequence(i, length + 1).toString())) {
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.illegal_empty_msg);
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z = false;
                        }
                        if (!z) {
                            com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        String string = oooo000.OooO00o().getTransformedText().toString();
                        if (!com.code.android.util.OooOo00.OooO00o(string)) {
                            privateChatVMOooO0O0.sendTextMessage(string);
                            oooo000.OooO00o().setText((CharSequence) null);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25839OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
            super(0);
            this.f25839OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.ui.activity.message.Oooo000 oooo000 = this.f25839OooO0Oo;
            p430o0OoOOO0.o000O0o o000o0o2 = oooo000.f25680OooO0O0;
            if (o000o0o2 != null) {
                o000o0o2.OooO0O0(oooo000);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Context, EmojiEditText> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25840OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
            super(1);
            this.f25840OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function1
        public final EmojiEditText invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f25840OooO0Oo.OooO00o();
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<EmojiEditText, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f25841OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EmojiEditText emojiEditText) {
            EmojiEditText it = emojiEditText;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25842OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25843OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, int i) {
            super(2);
            this.f25842OooO0Oo = oooo000;
            this.f25843OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25843OooO0o0 | 1);
            o00O0000.OooO0OO(this.f25842OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.PrivateChatBottomCompKt$MessageEditTextAndEmojiCompose$1$3", f = "PrivateChatBottomComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25844OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f25844OooO0Oo = oooo000;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f25844OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.yalla.yalla.ui.activity.message.Oooo000 oooo000 = this.f25844OooO0Oo;
            if (oooo000.f25683OooO0o.getValue().booleanValue() && oooo000.f25689OooOO0o.f55749OooO0O0.getValue().booleanValue() && !oooo000.OooO00o().isFocused()) {
                oooo000.OooO00o().requestFocus();
                EmojiEditText emojiEditTextOooO00o = oooo000.OooO00o();
                Editable text = oooo000.OooO00o().getText();
                emojiEditTextOooO00o.setSelection(text != null ? text.length() : 0);
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nPrivateChatBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatBottomCompKt$PrivateChatBottomComp$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,424:1\n315#2:425\n329#2,4:426\n316#2:430\n*S KotlinDebug\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatBottomCompKt$PrivateChatBottomComp$1\n*L\n57#1:425\n57#1:426,4\n57#1:430\n*E\n"})
    public static final class OooOOOO extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f25845OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(View view) {
            super(1);
            this.f25845OooO0Oo = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            int iM3924getHeightimpl = IntSize.m3924getHeightimpl(it.mo2801getSizeYbymL2g());
            View view = this.f25845OooO0Oo;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = iM3924getHeightimpl;
            view.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nPrivateChatBottomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatBottomCompKt$PrivateChatBottomLayoutLifecycleHelper$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,424:1\n63#2,5:425\n*S KotlinDebug\n*F\n+ 1 PrivateChatBottomComp.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatBottomCompKt$PrivateChatBottomLayoutLifecycleHelper$1\n*L\n213#1:425,5\n*E\n"})
    public static final class OooOo extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25846OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
            super(1);
            this.f25846OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0O0ooO(this.f25846OooO0Oo);
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f25847OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ View f25848OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25849OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f25850OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(BoxScope boxScope, com.yalla.yalla.ui.activity.message.Oooo000 oooo000, View view, int i) {
            super(2);
            this.f25847OooO0Oo = boxScope;
            this.f25849OooO0o0 = oooo000;
            this.f25848OooO0o = view;
            this.f25850OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25850OooO0oO | 1);
            com.yalla.yalla.ui.activity.message.Oooo000 oooo000 = this.f25849OooO0o0;
            View view = this.f25848OooO0o;
            o00O0000.OooO0Oo(this.f25847OooO0Oo, oooo000, view, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25851OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25852OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, int i) {
            super(2);
            this.f25851OooO0Oo = oooo000;
            this.f25852OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25852OooO0o0 | 1);
            o00O0000.OooO0o0(this.f25851OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.PrivateChatBottomCompKt$PrivateChatBottomLayoutLifecycleHelper$2", f = "PrivateChatBottomComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25853OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f25854OooO0o0;

        public static final class OooO extends Lambda implements Function2<String, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25855OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
                super(2);
                this.f25855OooO0Oo = oooo000;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(String str, Integer num) {
                String str2 = str;
                Integer num2 = num;
                PrivateChatVM privateChatVMOooO0O0 = this.f25855OooO0Oo.OooO0O0();
                Intrinsics.checkNotNull(num2);
                int iIntValue = num2.intValue();
                Intrinsics.checkNotNull(str2);
                privateChatVMOooO0O0.sendGifMessage(iIntValue, str2);
                return Unit.INSTANCE;
            }
        }

        public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25856OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f25857OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, CoroutineScope coroutineScope) {
                super(2);
                this.f25856OooO0Oo = oooo000;
                this.f25857OooO0o0 = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                View view = null;
                com.yalla.yalla.ui.activity.message.Oooo000 oooo000 = this.f25856OooO0Oo;
                if (zBooleanValue) {
                    p587o0oOooo.o0OO000.OooO0O0("202021", MapsKt.mapOf(new Pair("sources", 2)));
                    com.code.android.util.OooOOO.OooO0O0(this.f25857OooO0o0, new o00oOoo(null));
                    View view2 = oooo000.f25692OooOOOO;
                    if (view2 != null) {
                        view = view2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutYallaChat");
                    }
                    view.setVisibility(8);
                } else {
                    oooo000.f25683OooO0o.setValue(Boolean.FALSE);
                    oooo000.OooO00o().clearFocus();
                    if (oooo000.OooO0O0().getLayoutYallaChatShowing()) {
                        View view3 = oooo000.f25692OooOOOO;
                        if (view3 != null) {
                            view = view3;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutYallaChat");
                        }
                        view.setVisibility(0);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25858OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
                super(2);
                this.f25858OooO0Oo = oooo000;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                com.yalla.yalla.ui.activity.message.Oooo000 oooo000 = this.f25858OooO0Oo;
                oooo000.f25684OooO0o0.setValue(Boolean.valueOf(zBooleanValue));
                p430o0OoOOO0.o00O00OO o00o00oo2 = oooo000.f25691OooOOO0;
                if (o00o00oo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("privateChatVoiceManager");
                    o00o00oo2 = null;
                }
                o00o00oo2.OooO00o(oooo000);
                if (zBooleanValue) {
                    p587o0oOooo.o0OO000.OooO00o("104028");
                } else if (!oooo000.f25689OooOO0o.f55749OooO0O0.getValue().booleanValue()) {
                    oooo000.OooO00o().clearFocus();
                }
                oooo000.f25683OooO0o.setValue(Boolean.valueOf(!zBooleanValue));
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25859OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
                super(1);
                this.f25859OooO0Oo = oooo000;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                if (!bool.booleanValue()) {
                    this.f25859OooO0Oo.OooO00o().clearFocus();
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25860OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
                super(1);
                this.f25860OooO0Oo = oooo000;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Integer num) {
                Integer num2 = num;
                PrivateChatVM privateChatVMOooO0O0 = this.f25860OooO0Oo.OooO0O0();
                Intrinsics.checkNotNull(num2);
                privateChatVMOooO0O0.sendEmotionMessage(num2.intValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, CoroutineScope coroutineScope, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f25853OooO0Oo = oooo000;
            this.f25854OooO0o0 = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f25853OooO0Oo, this.f25854OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.yalla.yalla.ui.activity.message.Oooo000 oooo000 = this.f25853OooO0Oo;
            MutableState<p367o0OOo0o0.OooOOOO> mutableState = oooo000.f25678OooO;
            p367o0OOo0o0.OooOOOO oooOOOO = new p367o0OOo0o0.OooOOOO(oooo000.f25688OooOO0O, oooo000.OooO00o());
            oooOOOO.f43972OooO0Oo = new OooO00o(oooo000, this.f25854OooO0o0);
            oooOOOO.f43971OooO0OO = new OooO0O0(oooo000);
            mutableState.setValue(oooOOOO);
            EmojiEditText emojiEditTextOooO00o = oooo000.OooO00o();
            y0 y0Var = oooo000.f25689OooOO0o;
            y0Var.OooO00o(emojiEditTextOooO00o);
            y0Var.f55748OooO00o = new OooO0OO(oooo000);
            y0Var.f55750OooO0OO = new OooO0o(oooo000);
            y0Var.f55751OooO0Oo = new OooO(oooo000);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f25861OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25862OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(com.yalla.yalla.ui.activity.message.Oooo000 oooo000) {
            super(0);
            this.f25862OooO0Oo = oooo000;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.ui.activity.message.Oooo000 oooo000 = this.f25862OooO0Oo;
            if (oooo000.f25685OooO0oO.getValue().booleanValue()) {
                EmojiEditText view = oooo000.OooO00o();
                Intrinsics.checkNotNullParameter(view, "view");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                p430o0OoOOO0.o00O00OO o00o00oo2 = oooo000.f25681OooO0OO;
                if (o00o00oo2 != null) {
                    o00o00oo2.OooO00o(oooo000);
                }
            } else {
                p587o0oOooo.o0OO000.OooO00o("104029");
                Context context2 = oooo000.f25679OooO00o;
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                com.yalla.yalla.util.permission.OooO00o.OooO0OO((Activity) context2, PermissionGroupReveal.f32879OooO00o, null, new o00O000(oooo000));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25863OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25864OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, int i) {
            super(2);
            this.f25863OooO0Oo = oooo000;
            this.f25864OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25864OooO0o0 | 1);
            o00O0000.OooO0oO(this.f25863OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f25865OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25866OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.ui.activity.message.Oooo000 f25867OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(RowScope rowScope, com.yalla.yalla.ui.activity.message.Oooo000 oooo000, int i) {
            super(2);
            this.f25865OooO0Oo = rowScope;
            this.f25867OooO0o0 = oooo000;
            this.f25866OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25866OooO0o | 1);
            o00O0000.OooO0o(this.f25865OooO0Oo, this.f25867OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifierOooO00o;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(878170535);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(878170535, i, -1, "com.yalla.yalla.ui.activity.message.Emoji (PrivateChatBottomComp.kt:283)");
        }
        composerStartRestartGroup.startReplaceableGroup(-85701154);
        if (p411o0Oo0oO0.oo0o0Oo.OooO0O0(composerStartRestartGroup)) {
            if (oooo000.f25683OooO0o.getValue().booleanValue()) {
                z = false;
            } else {
                SharedGifFaceManager.f22774OooO00o.getClass();
                if (Intrinsics.areEqual(LiveDataAdapterKt.observeAsState(SharedGifFaceManager.f22776OooO0OO, composerStartRestartGroup, 8).getValue(), Boolean.TRUE)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z && Intrinsics.areEqual(LiveDataAdapterKt.observeAsState((MutableLiveData) p408o0Oo0o0O.o00Oo0.OooO0o0().f45219OooO0O0.getValue(), composerStartRestartGroup, 8).getValue(), Boolean.FALSE)) {
                modifierOooO00o = com.code.android.util.o0000Ooo.OooO00o(Modifier.INSTANCE, false, ColorKt.Color(4294863980L), Dp.m3765constructorimpl((float) 4.5d), false, true, Dp.m3765constructorimpl(26), Dp.m3765constructorimpl(-24), Dp.m3765constructorimpl(1), 553);
            } else {
                modifierOooO00o = Modifier.INSTANCE;
            }
        } else {
            modifierOooO00o = Modifier.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(oooo000.f25683OooO0o.getValue().booleanValue() ? oO00OOO.ic_moment_chat_keyboard_gray : oO00OOO.iv_room_emoji_gray, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE.then(modifierOooO00o).then(modifier2), Dp.m3765constructorimpl(8), 0.0f, 2, null), Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, new OooO00o(oooo000, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(oooo000, modifier2, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1876562290);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876562290, i, -1, "com.yalla.yalla.ui.activity.message.GiftOrSendComp (PrivateChatBottomComp.kt:166)");
        }
        if (oooo000.f25687OooOO0.getValue().booleanValue() || oooo000.f25685OooO0oO.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(-57048353);
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_gift_red, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(9), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(11), 7, null), Dp.m3765constructorimpl(32)), false, false, 0L, false, null, null, null, new OooO0o(oooo000), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-57049515);
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_moment_chat_send, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(12), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(14), 7, null), Dp.m3765constructorimpl(26)), false, false, 0L, false, null, null, null, new OooO0OO(oooo000), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(oooo000, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1474512435);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1474512435, i, -1, "com.yalla.yalla.ui.activity.message.MessageEditTextAndEmojiCompose (PrivateChatBottomComp.kt:134)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(21, PaddingKt.m477paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(0), Dp.m3765constructorimpl(8)));
        int i2 = p469o0OoooOO.o0oO0O0o.f47152o00OOOo;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(BackgroundKt.m169backgroundbw27NRU$default(modifierOooO0O0, p469o0OoooOO.o0oO0O0o.f47079o000o0O0, null, 2, null), Dp.m3765constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null);
        Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, bottom, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        AndroidView_androidKt.AndroidView(new OooOO0(oooo000), SizeKt.m510heightInVpY3zN4(androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), Dp.m3765constructorimpl(38), Dp.m3765constructorimpl(87)), OooOO0O.f25841OooO0Oo, composerStartRestartGroup, 384, 0);
        EffectsKt.LaunchedEffect(oooo000.f25683OooO0o.getValue(), new OooOOO0(oooo000, null), composerStartRestartGroup, 64);
        OooO00o(oooo000, PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(6), 7, null), composerStartRestartGroup, 56, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(oooo000, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull BoxScope boxScope, @NotNull com.yalla.yalla.ui.activity.message.Oooo000 chatBottomState, @NotNull View bottomViewPlaceHolder, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        Intrinsics.checkNotNullParameter(bottomViewPlaceHolder, "bottomViewPlaceHolder");
        Composer composerStartRestartGroup = composer.startRestartGroup(1994526367);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1994526367, i, -1, "com.yalla.yalla.ui.activity.message.PrivateChatBottomComp (PrivateChatBottomComp.kt:50)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(boxScope.align(companion, companion2.getBottomStart()), new OooOOOO(bottomViewPlaceHolder));
        int i2 = p469o0OoooOO.o0oO0O0o.f47152o00OOOo;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierOnGloballyPositioned, p469o0OoooOO.o0oO0O0o.f46946OooO0O0, null, 2, null);
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, bottom, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (chatBottomState.f25682OooO0Oo.getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(1191681936);
            o00O000o.OooO00o(rowScopeInstance, chatBottomState, composerStartRestartGroup, 70);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1191682007);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical bottom2 = companion2.getBottom();
            Modifier modifierM511heightInVpY3zN4$default = SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(54), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(arrangement, bottom2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM511heightInVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            OooO0o(rowScopeInstance, chatBottomState, composerStartRestartGroup, 70);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            p490o0o00OOO.OooOo00.OooO00o(chatBottomState.f25688OooOO0O, chatBottomState.f25689OooOO0o, chatBottomState.f25684OooO0o0.getValue().booleanValue() ? 60 : 300, composerStartRestartGroup, 72, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(boxScope, chatBottomState, bottomViewPlaceHolder, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(RowScope rowScope, com.yalla.yalla.ui.activity.message.Oooo000 oooo000, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(796651812);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(796651812, i, -1, "com.yalla.yalla.ui.activity.message.PrivateChatFriendComp (PrivateChatBottomComp.kt:82)");
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(12), null, composerStartRestartGroup, 6, 2);
        OooO0oO(oooo000, composerStartRestartGroup, 8);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        OooO0OO(oooo000, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(1990063423);
        if (oooo000.f25685OooO0oO.getValue().booleanValue()) {
            SpacerKt.Spacer(com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m169backgroundbw27NRU$default(boxScopeInstance.matchParentSize(companion), p469o0OoooOO.o0oO0O0o.f46946OooO0O0, null, 2, null), false, false, 0L, false, null, null, null, o000oOoO.f25861OooO0Oo, 253), composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO0O0(oooo000, composerStartRestartGroup, 8);
        OooO0o0(oooo000, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(rowScope, oooo000, i));
    }

    @Composable
    public static final void OooO0o0(com.yalla.yalla.ui.activity.message.Oooo000 oooo000, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2137093232);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2137093232, i, -1, "com.yalla.yalla.ui.activity.message.PrivateChatBottomLayoutLifecycleHelper (PrivateChatBottomComp.kt:210)");
        }
        EffectsKt.DisposableEffect(Unit.INSTANCE, new OooOo(oooo000), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(oooo000.OooO00o(), oooo000.f25688OooOO0O, oooo000.f25678OooO, new Oooo000(oooo000, coroutineScope, null), composerStartRestartGroup, 4168);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(oooo000, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(@NotNull com.yalla.yalla.ui.activity.message.Oooo000 chatBottomState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        Composer composerStartRestartGroup = composer.startRestartGroup(179746419);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(179746419, i, -1, "com.yalla.yalla.ui.activity.message.VoiceComp (PrivateChatBottomComp.kt:106)");
        }
        if (chatBottomState.f25686OooO0oo.getValue().booleanValue()) {
            ImageKt.Image(PainterResources_androidKt.painterResource(chatBottomState.f25685OooO0oO.getValue().booleanValue() ? oO00OOO.icon_keyboard : oO00OOO.btn_chitchat_voice_n, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(12), Dp.m3765constructorimpl(13), 3, null), Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, new o00O0O(chatBottomState), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Oo0(chatBottomState, i));
    }
}
