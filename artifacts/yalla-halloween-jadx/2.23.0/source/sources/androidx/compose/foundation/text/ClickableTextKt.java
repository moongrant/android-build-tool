package androidx.compose.foundation.text;

import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001ay\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0017\u001a\u00020\f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"ClickableText", "", ViewHierarchyConstants.TEXT_KEY, "Landroidx/compose/ui/text/AnnotatedString;", "onHover", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "Landroidx/compose/ui/text/TextStyle;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "onClick", "ClickableText-03UYbkw", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "containsWithinBounds", "Landroidx/compose/ui/text/MultiParagraph;", "positionOffset", "Landroidx/compose/ui/geometry/Offset;", "containsWithinBounds-Uv8p0NA", "(Landroidx/compose/ui/text/MultiParagraph;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n25#2:193\n50#2:200\n49#2:201\n50#2:208\n49#2:209\n25#2:216\n25#2:227\n50#2:238\n49#2:239\n1097#3,6:194\n1097#3,6:202\n1097#3,6:210\n1097#3,6:217\n1097#3,3:228\n1100#3,3:234\n1097#3,6:240\n486#4,4:223\n490#4,2:231\n494#4:237\n486#5:233\n1#6:246\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n80#1:193\n81#1:200\n81#1:201\n96#1:208\n96#1:209\n154#1:216\n155#1:227\n184#1:238\n184#1:239\n80#1:194,6\n81#1:202,6\n96#1:210,6\n154#1:217,6\n155#1:228,3\n155#1:234,3\n184#1:240,6\n155#1:223,4\n155#1:231,2\n155#1:237\n155#1:233\n*E\n"})
public final class ClickableTextKt {
    /* JADX WARN: Code duplicated, block: B:103:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0152  */
    /* JADX WARN: Code duplicated, block: B:110:0x0156  */
    /* JADX WARN: Code duplicated, block: B:111:0x015a  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0167  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x0175  */
    /* JADX WARN: Code duplicated, block: B:120:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181  */
    /* JADX WARN: Code duplicated, block: B:126:0x019c  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:134:0x0204  */
    /* JADX WARN: Code duplicated, block: B:137:0x024d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0263  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: ClickableText-03UYbkw, reason: not valid java name */
    public static final void m738ClickableText03UYbkw(@NotNull final AnnotatedString text, @NotNull final Function1<? super Integer, Unit> onHover, @Nullable Modifier modifier, @Nullable TextStyle textStyle, boolean z, int i, int i2, @Nullable Function1<? super TextLayoutResult, Unit> function1, @NotNull final Function1<? super Integer, Unit> onClick, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Modifier modifier2;
        TextStyle textStyle2;
        boolean z2;
        int iM3718getClipgIe3tQ8;
        int i19;
        final Function1<? super TextLayoutResult, Unit> function2;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableState mutableState;
        Object objOooO00o;
        boolean zChanged;
        Object objRememberedValue2;
        final int i20;
        final TextStyle textStyle3;
        final boolean z3;
        final int i21;
        final Modifier modifier3;
        final Function1<? super TextLayoutResult, Unit> function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onHover, "onHover");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1020774372);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onHover) ? 32 : 16;
        }
        int i22 = i4 & 4;
        if (i22 == 0) {
            if ((i3 & 896) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i3 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(textStyle)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    if ((57344 & i3) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 32;
                    if (i10 != 0) {
                        if ((i3 & 458752) == 0) {
                            i11 = i;
                            if (composerStartRestartGroup.changed(i11)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i5 |= i12;
                        }
                        i13 = i4 & 64;
                        if (i13 != 0) {
                            i5 |= 1572864;
                            i14 = i2;
                        } else {
                            i14 = i2;
                            if ((i3 & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(i14)) {
                                    i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                                } else {
                                    i15 = 524288;
                                }
                                i5 |= i15;
                            }
                        }
                        i16 = i4 & 128;
                        if (i16 != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 29360128) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i17 = 8388608;
                            } else {
                                i17 = Configuration.BLOCK_SIZE;
                            }
                            i5 |= i17;
                        }
                        if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            if ((234881024 & i3) == 0) {
                                if (composerStartRestartGroup.changedInstance(onClick)) {
                                    i18 = 67108864;
                                } else {
                                    i18 = 33554432;
                                }
                            }
                            if ((191739611 & i5) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i6 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                } else {
                                    textStyle2 = textStyle;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i10 != 0) {
                                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                                } else {
                                    iM3718getClipgIe3tQ8 = i11;
                                }
                                if (i13 != 0) {
                                    i19 = Integer.MAX_VALUE;
                                } else {
                                    i19 = i14;
                                }
                                if (i16 != 0) {
                                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull TextLayoutResult it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                } else {
                                    function2 = function1;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableState = (MutableState) objRememberedValue;
                                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                                if (objOooO00o == companion.getEmpty()) {
                                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierThen = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope, onHover, mutableState, onClick, null)));
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull TextLayoutResult it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            mutableState.setValue(it);
                                            function2.invoke(it);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                int i23 = i5 >> 3;
                                Modifier modifier4 = modifier2;
                                Function1<? super TextLayoutResult, Unit> function4 = function2;
                                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i23 & 896) | (i23 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i20 = i19;
                                textStyle3 = textStyle2;
                                z3 = z2;
                                i21 = iM3718getClipgIe3tQ8;
                                modifier3 = modifier4;
                                function3 = function4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                textStyle3 = textStyle;
                                z3 = z;
                                i20 = i14;
                                i21 = i11;
                                function3 = function1;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i24) {
                                    ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                        }
                        i18 = 100663296;
                        i5 |= i18;
                        if ((191739611 & i5) == 38347922) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope2, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i24 = i5 >> 3;
                            Modifier modifier5 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function5 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen2, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i24 & 896) | (i24 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier5;
                            function3 = function5;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen3 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope3, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i25 = i5 >> 3;
                            Modifier modifier6 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function6 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen3, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i25 & 896) | (i25 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier6;
                            function3 = function6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i26) {
                                ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                            }
                        });
                    }
                    i5 |= 196608;
                    i11 = i;
                    i13 = i4 & 64;
                    if (i13 != 0) {
                        i5 |= 1572864;
                        i14 = i2;
                    } else {
                        i14 = i2;
                        if ((i3 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(i14)) {
                                i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 128;
                    if (i16 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i17 = 8388608;
                        } else {
                            i17 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i18 = 67108864;
                            } else {
                                i18 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen4 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope4, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i26 = i5 >> 3;
                            Modifier modifier7 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function7 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen4, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i26 & 896) | (i26 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier7;
                            function3 = function7;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen5 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope5, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i27 = i5 >> 3;
                            Modifier modifier8 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function8 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen5, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i27 & 896) | (i27 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier8;
                            function3 = function8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i28) {
                                ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                            }
                        });
                    }
                    i18 = 100663296;
                    i5 |= i18;
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen6 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope6, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i28 = i5 >> 3;
                        Modifier modifier9 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function9 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen6, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i28 & 896) | (i28 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier9;
                        function3 = function9;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen7 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope7, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i29 = i5 >> 3;
                        Modifier modifier10 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function10 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen7, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i29 & 896) | (i29 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier10;
                        function3 = function10;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i210) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 24576;
                i10 = i4 & 32;
                if (i10 != 0) {
                    if ((i3 & 458752) == 0) {
                        i11 = i;
                        if (composerStartRestartGroup.changed(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 64;
                    if (i13 != 0) {
                        i5 |= 1572864;
                        i14 = i2;
                    } else {
                        i14 = i2;
                        if ((i3 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(i14)) {
                                i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 128;
                    if (i16 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i17 = 8388608;
                        } else {
                            i17 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i18 = 67108864;
                            } else {
                                i18 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen8 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope8, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i210 = i5 >> 3;
                            Modifier modifier11 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function11 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen8, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i210 & 896) | (i210 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier11;
                            function3 = function11;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen9 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope9, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i211 = i5 >> 3;
                            Modifier modifier12 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function12 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen9, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211 & 896) | (i211 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier12;
                            function3 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i212) {
                                ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                            }
                        });
                    }
                    i18 = 100663296;
                    i5 |= i18;
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen10 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope10, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i212 = i5 >> 3;
                        Modifier modifier13 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function13 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen10, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i212 & 896) | (i212 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier13;
                        function3 = function13;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen11 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i213 = i5 >> 3;
                        Modifier modifier14 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function14 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i213 & 896) | (i213 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier14;
                        function3 = function14;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i214) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 196608;
                i11 = i;
                i13 = i4 & 64;
                if (i13 != 0) {
                    i5 |= 1572864;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i14)) {
                            i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 128;
                if (i16 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i17;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen12 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope12, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i214 = i5 >> 3;
                        Modifier modifier15 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function15 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen12, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i214 & 896) | (i214 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier15;
                        function3 = function15;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen13 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope13, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i215 = i5 >> 3;
                        Modifier modifier16 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function16 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen13, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i215 & 896) | (i215 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier16;
                        function3 = function16;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i216) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i18 = 100663296;
                i5 |= i18;
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen14 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope14, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i216 = i5 >> 3;
                    Modifier modifier17 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function17 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen14, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i216 & 896) | (i216 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier17;
                    function3 = function17;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen15 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope15, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i217 = i5 >> 3;
                    Modifier modifier18 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function18 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen15, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i217 & 896) | (i217 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier18;
                    function3 = function18;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i218) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 3072;
            i8 = i4 & 16;
            if (i8 != 0) {
                if ((57344 & i3) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    if ((i3 & 458752) == 0) {
                        i11 = i;
                        if (composerStartRestartGroup.changed(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 64;
                    if (i13 != 0) {
                        i5 |= 1572864;
                        i14 = i2;
                    } else {
                        i14 = i2;
                        if ((i3 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(i14)) {
                                i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 128;
                    if (i16 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i17 = 8388608;
                        } else {
                            i17 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i18 = 67108864;
                            } else {
                                i18 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope16 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen16 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope16, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i218 = i5 >> 3;
                            Modifier modifier19 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function19 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen16, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i218 & 896) | (i218 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier19;
                            function3 = function19;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope17 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen17 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope17, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i219 = i5 >> 3;
                            Modifier modifier110 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function110 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen17, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i219 & 896) | (i219 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier110;
                            function3 = function110;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i2110) {
                                ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                            }
                        });
                    }
                    i18 = 100663296;
                    i5 |= i18;
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope18 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen18 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope18, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2110 = i5 >> 3;
                        Modifier modifier111 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function111 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen18, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2110 & 896) | (i2110 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier111;
                        function3 = function111;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope19 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen19 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope19, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2111 = i5 >> 3;
                        Modifier modifier112 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function112 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen19, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111 & 896) | (i2111 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier112;
                        function3 = function112;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i2112) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 196608;
                i11 = i;
                i13 = i4 & 64;
                if (i13 != 0) {
                    i5 |= 1572864;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i14)) {
                            i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 128;
                if (i16 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i17;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope110 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope110, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2112 = i5 >> 3;
                        Modifier modifier113 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function113 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen110, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2112 & 896) | (i2112 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier113;
                        function3 = function113;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope111 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2113 = i5 >> 3;
                        Modifier modifier114 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function114 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2113 & 896) | (i2113 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier114;
                        function3 = function114;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i2114) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i18 = 100663296;
                i5 |= i18;
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope112 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen112 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope112, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2114 = i5 >> 3;
                    Modifier modifier115 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function115 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen112, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2114 & 896) | (i2114 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier115;
                    function3 = function115;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope113 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen113 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope113, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2115 = i5 >> 3;
                    Modifier modifier116 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function116 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen113, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2115 & 896) | (i2115 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier116;
                    function3 = function116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i2116) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 24576;
            i10 = i4 & 32;
            if (i10 != 0) {
                if ((i3 & 458752) == 0) {
                    i11 = i;
                    if (composerStartRestartGroup.changed(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 64;
                if (i13 != 0) {
                    i5 |= 1572864;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i14)) {
                            i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 128;
                if (i16 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i17;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope114 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen114 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope114, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2116 = i5 >> 3;
                        Modifier modifier117 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function117 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen114, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2116 & 896) | (i2116 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier117;
                        function3 = function117;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope115 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen115 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope115, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2117 = i5 >> 3;
                        Modifier modifier118 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function118 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen115, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2117 & 896) | (i2117 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier118;
                        function3 = function118;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i2118) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i18 = 100663296;
                i5 |= i18;
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope116 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen116 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope116, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2118 = i5 >> 3;
                    Modifier modifier119 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function119 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen116, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2118 & 896) | (i2118 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier119;
                    function3 = function119;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope117 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen117 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope117, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2119 = i5 >> 3;
                    Modifier modifier1110 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function1110 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen117, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2119 & 896) | (i2119 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier1110;
                    function3 = function1110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i21110) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 196608;
            i11 = i;
            i13 = i4 & 64;
            if (i13 != 0) {
                i5 |= 1572864;
                i14 = i2;
            } else {
                i14 = i2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i14)) {
                        i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 128;
            if (i16 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i17 = 8388608;
                } else {
                    i17 = Configuration.BLOCK_SIZE;
                }
                i5 |= i17;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope118 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen118 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope118, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21110 = i5 >> 3;
                    Modifier modifier1111 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function1111 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen118, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21110 & 896) | (i21110 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier1111;
                    function3 = function1111;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope119 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen119 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope119, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i21111 = i5 >> 3;
                    Modifier modifier1112 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function1112 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen119, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21111 & 896) | (i21111 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier1112;
                    function3 = function1112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i21112) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i18 = 100663296;
            i5 |= i18;
            if ((191739611 & i5) == 38347922) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope1110 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen1110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1110, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21112 = i5 >> 3;
                Modifier modifier1113 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1113 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1110, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21112 & 896) | (i21112 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier1113;
                function3 = function1113;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope1111 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen1111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1111, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21113 = i5 >> 3;
                Modifier modifier1114 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1114 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1111, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21113 & 896) | (i21113 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier1114;
                function3 = function1114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i21114) {
                    ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 384;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i3 & 7168) == 0) {
                if (composerStartRestartGroup.changed(textStyle)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i5 |= i7;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                if ((57344 & i3) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    if ((i3 & 458752) == 0) {
                        i11 = i;
                        if (composerStartRestartGroup.changed(i11)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & 64;
                    if (i13 != 0) {
                        i5 |= 1572864;
                        i14 = i2;
                    } else {
                        i14 = i2;
                        if ((i3 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(i14)) {
                                i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i15 = 524288;
                            }
                            i5 |= i15;
                        }
                    }
                    i16 = i4 & 128;
                    if (i16 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i17 = 8388608;
                        } else {
                            i17 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i18 = 67108864;
                            } else {
                                i18 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope1112 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen1112 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1112, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i21114 = i5 >> 3;
                            Modifier modifier1115 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function1115 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1112, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21114 & 896) | (i21114 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier1115;
                            function3 = function1115;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i19 = Integer.MAX_VALUE;
                            } else {
                                i19 = i14;
                            }
                            if (i16 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                            if (objOooO00o == companion.getEmpty()) {
                                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope1113 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen1113 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1113, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i21115 = i5 >> 3;
                            Modifier modifier1116 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function1116 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1113, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21115 & 896) | (i21115 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i20 = i19;
                            textStyle3 = textStyle2;
                            z3 = z2;
                            i21 = iM3718getClipgIe3tQ8;
                            modifier3 = modifier1116;
                            function3 = function1116;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i21116) {
                                ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                            }
                        });
                    }
                    i18 = 100663296;
                    i5 |= i18;
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope1114 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen1114 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1114, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i21116 = i5 >> 3;
                        Modifier modifier1117 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function1117 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1114, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21116 & 896) | (i21116 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier1117;
                        function3 = function1117;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope1115 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen1115 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1115, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i21117 = i5 >> 3;
                        Modifier modifier1118 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function1118 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1115, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21117 & 896) | (i21117 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier1118;
                        function3 = function1118;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i21118) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 196608;
                i11 = i;
                i13 = i4 & 64;
                if (i13 != 0) {
                    i5 |= 1572864;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i14)) {
                            i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 128;
                if (i16 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i17;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope1116 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen1116 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1116, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i21118 = i5 >> 3;
                        Modifier modifier1119 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function1119 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1116, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21118 & 896) | (i21118 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier1119;
                        function3 = function1119;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope1117 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen1117 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1117, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i21119 = i5 >> 3;
                        Modifier modifier11110 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function11110 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1117, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21119 & 896) | (i21119 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier11110;
                        function3 = function11110;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i211110) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i18 = 100663296;
                i5 |= i18;
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope1118 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen1118 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1118, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211110 = i5 >> 3;
                    Modifier modifier11111 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function11111 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1118, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211110 & 896) | (i211110 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier11111;
                    function3 = function11111;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope1119 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen1119 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1119, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211111 = i5 >> 3;
                    Modifier modifier11112 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function11112 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1119, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211111 & 896) | (i211111 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier11112;
                    function3 = function11112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i211112) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 24576;
            i10 = i4 & 32;
            if (i10 != 0) {
                if ((i3 & 458752) == 0) {
                    i11 = i;
                    if (composerStartRestartGroup.changed(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 64;
                if (i13 != 0) {
                    i5 |= 1572864;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i14)) {
                            i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 128;
                if (i16 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i17;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope11110 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen11110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11110, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i211112 = i5 >> 3;
                        Modifier modifier11113 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function11113 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11110, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211112 & 896) | (i211112 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier11113;
                        function3 = function11113;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope11111 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen11111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11111, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i211113 = i5 >> 3;
                        Modifier modifier11114 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function11114 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11111, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211113 & 896) | (i211113 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier11114;
                        function3 = function11114;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i211114) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i18 = 100663296;
                i5 |= i18;
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope11112 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen11112 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11112, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211114 = i5 >> 3;
                    Modifier modifier11115 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function11115 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11112, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211114 & 896) | (i211114 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier11115;
                    function3 = function11115;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope11113 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen11113 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11113, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211115 = i5 >> 3;
                    Modifier modifier11116 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function11116 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11113, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211115 & 896) | (i211115 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier11116;
                    function3 = function11116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i211116) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 196608;
            i11 = i;
            i13 = i4 & 64;
            if (i13 != 0) {
                i5 |= 1572864;
                i14 = i2;
            } else {
                i14 = i2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i14)) {
                        i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 128;
            if (i16 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i17 = 8388608;
                } else {
                    i17 = Configuration.BLOCK_SIZE;
                }
                i5 |= i17;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope11114 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen11114 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11114, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211116 = i5 >> 3;
                    Modifier modifier11117 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function11117 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11114, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211116 & 896) | (i211116 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier11117;
                    function3 = function11117;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope11115 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen11115 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11115, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i211117 = i5 >> 3;
                    Modifier modifier11118 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function11118 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11115, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211117 & 896) | (i211117 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier11118;
                    function3 = function11118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i211118) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i18 = 100663296;
            i5 |= i18;
            if ((191739611 & i5) == 38347922) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope11116 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen11116 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11116, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211118 = i5 >> 3;
                Modifier modifier11119 = modifier2;
                Function1<? super TextLayoutResult, Unit> function11119 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11116, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211118 & 896) | (i211118 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier11119;
                function3 = function11119;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope11117 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen11117 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11117, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i211119 = i5 >> 3;
                Modifier modifier111110 = modifier2;
                Function1<? super TextLayoutResult, Unit> function111110 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11117, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i211119 & 896) | (i211119 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier111110;
                function3 = function111110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2111110) {
                    ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 3072;
        i8 = i4 & 16;
        if (i8 != 0) {
            if ((57344 & i3) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                if ((i3 & 458752) == 0) {
                    i11 = i;
                    if (composerStartRestartGroup.changed(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i5 |= i12;
                }
                i13 = i4 & 64;
                if (i13 != 0) {
                    i5 |= 1572864;
                    i14 = i2;
                } else {
                    i14 = i2;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i14)) {
                            i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i15 = 524288;
                        }
                        i5 |= i15;
                    }
                }
                i16 = i4 & 128;
                if (i16 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i17;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope11118 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen11118 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11118, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2111110 = i5 >> 3;
                        Modifier modifier111111 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function111111 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11118, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111110 & 896) | (i2111110 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier111111;
                        function3 = function111111;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i6 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i19 = Integer.MAX_VALUE;
                        } else {
                            i19 = i14;
                        }
                        if (i16 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                        if (objOooO00o == companion.getEmpty()) {
                            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope11119 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen11119 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope11119, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i2111111 = i5 >> 3;
                        Modifier modifier111112 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function111112 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11119, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111111 & 896) | (i2111111 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i20 = i19;
                        textStyle3 = textStyle2;
                        z3 = z2;
                        i21 = iM3718getClipgIe3tQ8;
                        modifier3 = modifier111112;
                        function3 = function111112;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i2111112) {
                            ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i18 = 100663296;
                i5 |= i18;
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111110 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111110, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111112 = i5 >> 3;
                    Modifier modifier111113 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function111113 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111110, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111112 & 896) | (i2111112 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier111113;
                    function3 = function111113;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111111 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111111, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111113 = i5 >> 3;
                    Modifier modifier111114 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function111114 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111111, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111113 & 896) | (i2111113 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier111114;
                    function3 = function111114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i2111114) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 196608;
            i11 = i;
            i13 = i4 & 64;
            if (i13 != 0) {
                i5 |= 1572864;
                i14 = i2;
            } else {
                i14 = i2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i14)) {
                        i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 128;
            if (i16 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i17 = 8388608;
                } else {
                    i17 = Configuration.BLOCK_SIZE;
                }
                i5 |= i17;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111112 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111112 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111112, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111114 = i5 >> 3;
                    Modifier modifier111115 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function111115 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111112, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111114 & 896) | (i2111114 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier111115;
                    function3 = function111115;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111113 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111113 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111113, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111115 = i5 >> 3;
                    Modifier modifier111116 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function111116 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111113, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111115 & 896) | (i2111115 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier111116;
                    function3 = function111116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i2111116) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i18 = 100663296;
            i5 |= i18;
            if ((191739611 & i5) == 38347922) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope111114 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen111114 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111114, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111116 = i5 >> 3;
                Modifier modifier111117 = modifier2;
                Function1<? super TextLayoutResult, Unit> function111117 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111114, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111116 & 896) | (i2111116 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier111117;
                function3 = function111117;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope111115 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen111115 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111115, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i2111117 = i5 >> 3;
                Modifier modifier111118 = modifier2;
                Function1<? super TextLayoutResult, Unit> function111118 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111115, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111117 & 896) | (i2111117 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier111118;
                function3 = function111118;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2111118) {
                    ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 24576;
        i10 = i4 & 32;
        if (i10 != 0) {
            if ((i3 & 458752) == 0) {
                i11 = i;
                if (composerStartRestartGroup.changed(i11)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i5 |= i12;
            }
            i13 = i4 & 64;
            if (i13 != 0) {
                i5 |= 1572864;
                i14 = i2;
            } else {
                i14 = i2;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i14)) {
                        i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i15 = 524288;
                    }
                    i5 |= i15;
                }
            }
            i16 = i4 & 128;
            if (i16 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i17 = 8388608;
                } else {
                    i17 = Configuration.BLOCK_SIZE;
                }
                i5 |= i17;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111116 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111116 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111116, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111118 = i5 >> 3;
                    Modifier modifier111119 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function111119 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111116, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111118 & 896) | (i2111118 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier111119;
                    function3 = function111119;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i6 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = i14;
                    }
                    if (i16 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                    if (objOooO00o == companion.getEmpty()) {
                        objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111117 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111117 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111117, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i2111119 = i5 >> 3;
                    Modifier modifier1111110 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function1111110 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111117, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i2111119 & 896) | (i2111119 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i20 = i19;
                    textStyle3 = textStyle2;
                    z3 = z2;
                    i21 = iM3718getClipgIe3tQ8;
                    modifier3 = modifier1111110;
                    function3 = function1111110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i21111110) {
                        ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i18 = 100663296;
            i5 |= i18;
            if ((191739611 & i5) == 38347922) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope111118 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen111118 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111118, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111110 = i5 >> 3;
                Modifier modifier1111111 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1111111 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111118, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21111110 & 896) | (i21111110 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier1111111;
                function3 = function1111111;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope111119 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen111119 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope111119, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111111 = i5 >> 3;
                Modifier modifier1111112 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1111112 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111119, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21111111 & 896) | (i21111111 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier1111112;
                function3 = function1111112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i21111112) {
                    ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 196608;
        i11 = i;
        i13 = i4 & 64;
        if (i13 != 0) {
            i5 |= 1572864;
            i14 = i2;
        } else {
            i14 = i2;
            if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i14)) {
                    i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i15 = 524288;
                }
                i5 |= i15;
            }
        }
        i16 = i4 & 128;
        if (i16 != 0) {
            i5 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i17 = 8388608;
            } else {
                i17 = Configuration.BLOCK_SIZE;
            }
            i5 |= i17;
        }
        if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            if ((234881024 & i3) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
            }
            if ((191739611 & i5) == 38347922) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope1111110 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen1111110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1111110, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111112 = i5 >> 3;
                Modifier modifier1111113 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1111113 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1111110, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21111112 & 896) | (i21111112 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier1111113;
                function3 = function1111113;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i6 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i8 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = i14;
                }
                if (i16 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
                if (objOooO00o == companion.getEmpty()) {
                    objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope1111111 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen1111111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1111111, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21111113 = i5 >> 3;
                Modifier modifier1111114 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1111114 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1111111, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21111113 & 896) | (i21111113 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i20 = i19;
                textStyle3 = textStyle2;
                z3 = z2;
                i21 = iM3718getClipgIe3tQ8;
                modifier3 = modifier1111114;
                function3 = function1111114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i21111114) {
                    ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i18 = 100663296;
        i5 |= i18;
        if ((191739611 & i5) == 38347922) {
            if (i22 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i6 != 0) {
                textStyle2 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle2 = textStyle;
            }
            if (i8 != 0) {
                z2 = true;
            } else {
                z2 = z;
            }
            if (i10 != 0) {
                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
            } else {
                iM3718getClipgIe3tQ8 = i11;
            }
            if (i13 != 0) {
                i19 = Integer.MAX_VALUE;
            } else {
                i19 = i14;
            }
            if (i16 != 0) {
                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1111112 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen1111112 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1111112, onHover, mutableState, onClick, null)));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                        function2.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                        function2.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21111114 = i5 >> 3;
            Modifier modifier1111115 = modifier2;
            Function1<? super TextLayoutResult, Unit> function1111115 = function2;
            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1111112, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21111114 & 896) | (i21111114 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i20 = i19;
            textStyle3 = textStyle2;
            z3 = z2;
            i21 = iM3718getClipgIe3tQ8;
            modifier3 = modifier1111115;
            function3 = function1111115;
        } else {
            if (i22 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i6 != 0) {
                textStyle2 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle2 = textStyle;
            }
            if (i8 != 0) {
                z2 = true;
            } else {
                z2 = z;
            }
            if (i10 != 0) {
                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
            } else {
                iM3718getClipgIe3tQ8 = i11;
            }
            if (i13 != 0) {
                i19 = Integer.MAX_VALUE;
            } else {
                i19 = i14;
            }
            if (i16 != 0) {
                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020774372, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1111113 = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen1111113 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new ClickableTextKt$ClickableText$pointerInputModifier$1(coroutineScope1111113, onHover, mutableState, onClick, null)));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                        function2.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                        function2.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21111115 = i5 >> 3;
            Modifier modifier1111116 = modifier2;
            Function1<? super TextLayoutResult, Unit> function1111116 = function2;
            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1111113, textStyle2, (Function1) objRememberedValue2, iM3718getClipgIe3tQ8, z2, i19, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i21111115 & 896) | (i21111115 & 57344) | ((i5 << 3) & 458752) | (i5 & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i20 = i19;
            textStyle3 = textStyle2;
            z3 = z2;
            i21 = iM3718getClipgIe3tQ8;
            modifier3 = modifier1111116;
            function3 = function1111116;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i21111116) {
                ClickableTextKt.m738ClickableText03UYbkw(text, onHover, modifier3, textStyle3, z3, i21, i20, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139  */
    /* JADX WARN: Code duplicated, block: B:102:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:105:0x014c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0178  */
    /* JADX WARN: Code duplicated, block: B:117:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:127:0x0217  */
    /* JADX WARN: Code duplicated, block: B:132:0x022d  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    public static final void m739ClickableText4YKlhWE(@NotNull final AnnotatedString text, @Nullable Modifier modifier, @Nullable TextStyle textStyle, boolean z, int i, int i2, @Nullable Function1<? super TextLayoutResult, Unit> function1, @NotNull final Function1<? super Integer, Unit> onClick, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TextStyle textStyle3;
        boolean z3;
        int iM3718getClipgIe3tQ8;
        int i18;
        final Function1<? super TextLayoutResult, Unit> function2;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        final int i19;
        final Modifier modifier3;
        final Function1<? super TextLayoutResult, Unit> function3;
        final TextStyle textStyle4;
        final boolean z4;
        final int i20;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-246609449);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i21 = i4 & 2;
        if (i21 == 0) {
            if ((i3 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 896) == 0) {
                    textStyle2 = textStyle;
                    if (composerStartRestartGroup.changed(textStyle2)) {
                        i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 7168) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i9 = 2048;
                        } else {
                            i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        i5 |= 24576;
                        i11 = i;
                    } else {
                        i11 = i;
                        if ((i3 & 57344) == 0) {
                            if (composerStartRestartGroup.changed(i11)) {
                                i12 = 16384;
                            } else {
                                i12 = 8192;
                            }
                            i5 |= i12;
                        }
                    }
                    i13 = i4 & 32;
                    if (i13 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i5 |= i14;
                    }
                    i15 = i4 & 64;
                    if (i15 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i16 = 524288;
                        }
                        i5 |= i16;
                    }
                    if ((i4 & 128) != 0) {
                        if ((29360128 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i17 = 8388608;
                            } else {
                                i17 = Configuration.BLOCK_SIZE;
                            }
                        }
                        if ((23967451 & i5) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i6 != 0) {
                                textStyle3 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle3 = textStyle2;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i10 != 0) {
                                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                            } else {
                                iM3718getClipgIe3tQ8 = i11;
                            }
                            if (i13 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        mutableState.setValue(it);
                                        function2.invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifier4 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function4 = function2;
                            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i19 = i18;
                            modifier3 = modifier4;
                            function3 = function4;
                            textStyle4 = textStyle3;
                            z4 = z3;
                            i20 = iM3718getClipgIe3tQ8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function3 = function1;
                            modifier3 = modifier2;
                            textStyle4 = textStyle2;
                            z4 = z2;
                            i20 = i11;
                            i19 = i2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i22) {
                                ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                            }
                        });
                    }
                    i17 = 12582912;
                    i5 |= i17;
                    if ((23967451 & i5) == 4793490) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion3, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier5 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function5 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen2, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i19 = i18;
                        modifier3 = modifier5;
                        function3 = function5;
                        textStyle4 = textStyle3;
                        z4 = z3;
                        i20 = iM3718getClipgIe3tQ8;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen3 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion4, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier6 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function6 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen3, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i19 = i18;
                        modifier3 = modifier6;
                        function3 = function6;
                        textStyle4 = textStyle3;
                        z4 = z3;
                        i20 = iM3718getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i22) {
                            ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 3072;
                z2 = z;
                i10 = i4 & 16;
                if (i10 != 0) {
                    i5 |= 24576;
                    i11 = i;
                } else {
                    i11 = i;
                    if ((i3 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i17 = 8388608;
                        } else {
                            i17 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen4 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion5, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier7 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function7 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen4, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i19 = i18;
                        modifier3 = modifier7;
                        function3 = function7;
                        textStyle4 = textStyle3;
                        z4 = z3;
                        i20 = iM3718getClipgIe3tQ8;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen5 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion6, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier8 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function8 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen5, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i19 = i18;
                        modifier3 = modifier8;
                        function3 = function8;
                        textStyle4 = textStyle3;
                        z4 = z3;
                        i20 = iM3718getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i22) {
                            ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i17 = 12582912;
                i5 |= i17;
                if ((23967451 & i5) == 4793490) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen6 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion7, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier9 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function9 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen6, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier9;
                    function3 = function9;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen7 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion8, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier10 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function10 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen7, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier10;
                    function3 = function10;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i22) {
                        ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 384;
            textStyle2 = textStyle;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 2048;
                    } else {
                        i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    i5 |= 24576;
                    i11 = i;
                } else {
                    i11 = i;
                    if ((i3 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i17 = 8388608;
                        } else {
                            i17 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion9 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen8 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion9, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier11 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function11 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen8, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i19 = i18;
                        modifier3 = modifier11;
                        function3 = function11;
                        textStyle4 = textStyle3;
                        z4 = z3;
                        i20 = iM3718getClipgIe3tQ8;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion10 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen9 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion10, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier12 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function12 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen9, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i19 = i18;
                        modifier3 = modifier12;
                        function3 = function12;
                        textStyle4 = textStyle3;
                        z4 = z3;
                        i20 = iM3718getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i22) {
                            ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i17 = 12582912;
                i5 |= i17;
                if ((23967451 & i5) == 4793490) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen10 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion11, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier13 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function13 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen10, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier13;
                    function3 = function13;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen11 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion12, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier14 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function14 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen11, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier14;
                    function3 = function14;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i22) {
                        ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 3072;
            z2 = z;
            i10 = i4 & 16;
            if (i10 != 0) {
                i5 |= 24576;
                i11 = i;
            } else {
                i11 = i;
                if ((i3 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen12 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion13, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier15 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function15 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen12, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier15;
                    function3 = function15;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion14 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen13 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion14, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier16 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function16 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen13, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier16;
                    function3 = function16;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i22) {
                        ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i17 = 12582912;
            i5 |= i17;
            if ((23967451 & i5) == 4793490) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion15 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen14 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion15, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier17 = modifier2;
                Function1<? super TextLayoutResult, Unit> function17 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen14, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i19 = i18;
                modifier3 = modifier17;
                function3 = function17;
                textStyle4 = textStyle3;
                z4 = z3;
                i20 = iM3718getClipgIe3tQ8;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion16 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen15 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion16, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier18 = modifier2;
                Function1<? super TextLayoutResult, Unit> function18 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen15, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i19 = i18;
                modifier3 = modifier18;
                function3 = function18;
                textStyle4 = textStyle3;
                z4 = z3;
                i20 = iM3718getClipgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i22) {
                    ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 48;
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 896) == 0) {
                textStyle2 = textStyle;
                if (composerStartRestartGroup.changed(textStyle2)) {
                    i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 2048;
                    } else {
                        i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    i5 |= 24576;
                    i11 = i;
                } else {
                    i11 = i;
                    if ((i3 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                }
                i13 = i4 & 32;
                if (i13 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 64;
                if (i15 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i16 = 524288;
                    }
                    i5 |= i16;
                }
                if ((i4 & 128) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i17 = 8388608;
                        } else {
                            i17 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion17 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen16 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion17, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier19 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function19 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen16, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i19 = i18;
                        modifier3 = modifier19;
                        function3 = function19;
                        textStyle4 = textStyle3;
                        z4 = z3;
                        i20 = iM3718getClipgIe3tQ8;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i10 != 0) {
                            iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                        } else {
                            iM3718getClipgIe3tQ8 = i11;
                        }
                        if (i13 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion18 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen17 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion18, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(it);
                                    function2.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier110 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function110 = function2;
                        BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen17, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i19 = i18;
                        modifier3 = modifier110;
                        function3 = function110;
                        textStyle4 = textStyle3;
                        z4 = z3;
                        i20 = iM3718getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i22) {
                            ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i17 = 12582912;
                i5 |= i17;
                if ((23967451 & i5) == 4793490) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion19 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen18 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion19, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier111 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function111 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen18, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier111;
                    function3 = function111;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion110 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen19 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion110, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier112 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function112 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen19, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier112;
                    function3 = function112;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i22) {
                        ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 3072;
            z2 = z;
            i10 = i4 & 16;
            if (i10 != 0) {
                i5 |= 24576;
                i11 = i;
            } else {
                i11 = i;
                if ((i3 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion111 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion111, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier113 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function113 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen110, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier113;
                    function3 = function113;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion112 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion112, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier114 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function114 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen111, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier114;
                    function3 = function114;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i22) {
                        ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i17 = 12582912;
            i5 |= i17;
            if ((23967451 & i5) == 4793490) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion113 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen112 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion113, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier115 = modifier2;
                Function1<? super TextLayoutResult, Unit> function115 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen112, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i19 = i18;
                modifier3 = modifier115;
                function3 = function115;
                textStyle4 = textStyle3;
                z4 = z3;
                i20 = iM3718getClipgIe3tQ8;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion114 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen113 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion114, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier116 = modifier2;
                Function1<? super TextLayoutResult, Unit> function116 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen113, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i19 = i18;
                modifier3 = modifier116;
                function3 = function116;
                textStyle4 = textStyle3;
                z4 = z3;
                i20 = iM3718getClipgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i22) {
                    ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 384;
        textStyle2 = textStyle;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 7168) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 2048;
                } else {
                    i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                i5 |= 24576;
                i11 = i;
            } else {
                i11 = i;
                if ((i3 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
            }
            i13 = i4 & 32;
            if (i13 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i5 |= i14;
            }
            i15 = i4 & 64;
            if (i15 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i16 = 524288;
                }
                i5 |= i16;
            }
            if ((i4 & 128) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i17 = 8388608;
                    } else {
                        i17 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion115 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen114 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion115, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier117 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function117 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen114, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier117;
                    function3 = function117;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i10 != 0) {
                        iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                    } else {
                        iM3718getClipgIe3tQ8 = i11;
                    }
                    if (i13 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion116 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen115 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion116, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                invoke2(textLayoutResult);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(it);
                                function2.invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier118 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function118 = function2;
                    BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen115, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i19 = i18;
                    modifier3 = modifier118;
                    function3 = function118;
                    textStyle4 = textStyle3;
                    z4 = z3;
                    i20 = iM3718getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i22) {
                        ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i17 = 12582912;
            i5 |= i17;
            if ((23967451 & i5) == 4793490) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion117 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen116 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion117, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier119 = modifier2;
                Function1<? super TextLayoutResult, Unit> function119 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen116, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i19 = i18;
                modifier3 = modifier119;
                function3 = function119;
                textStyle4 = textStyle3;
                z4 = z3;
                i20 = iM3718getClipgIe3tQ8;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion118 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen117 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion118, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1110 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1110 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen117, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i19 = i18;
                modifier3 = modifier1110;
                function3 = function1110;
                textStyle4 = textStyle3;
                z4 = z3;
                i20 = iM3718getClipgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i22) {
                    ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 3072;
        z2 = z;
        i10 = i4 & 16;
        if (i10 != 0) {
            i5 |= 24576;
            i11 = i;
        } else {
            i11 = i;
            if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i5 |= i12;
            }
        }
        i13 = i4 & 32;
        if (i13 != 0) {
            i5 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (composerStartRestartGroup.changed(i2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        }
        i15 = i4 & 64;
        if (i15 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i16 = 524288;
            }
            i5 |= i16;
        }
        if ((i4 & 128) != 0) {
            if ((29360128 & i3) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i17 = 8388608;
                } else {
                    i17 = Configuration.BLOCK_SIZE;
                }
            }
            if ((23967451 & i5) == 4793490) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion119 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen118 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion119, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1111 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1111 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen118, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i19 = i18;
                modifier3 = modifier1111;
                function3 = function1111;
                textStyle4 = textStyle3;
                z4 = z3;
                i20 = iM3718getClipgIe3tQ8;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i10 != 0) {
                    iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
                } else {
                    iM3718getClipgIe3tQ8 = i11;
                }
                if (i13 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion1110 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen119 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion1110, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull TextLayoutResult it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            mutableState.setValue(it);
                            function2.invoke(it);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1112 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1112 = function2;
                BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen119, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i19 = i18;
                modifier3 = modifier1112;
                function3 = function1112;
                textStyle4 = textStyle3;
                z4 = z3;
                i20 = iM3718getClipgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i22) {
                    ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i17 = 12582912;
        i5 |= i17;
        if ((23967451 & i5) == 4793490) {
            if (i21 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i6 != 0) {
                textStyle3 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle3 = textStyle2;
            }
            if (i8 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i10 != 0) {
                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
            } else {
                iM3718getClipgIe3tQ8 = i11;
            }
            if (i13 != 0) {
                i18 = Integer.MAX_VALUE;
            } else {
                i18 = i2;
            }
            if (i15 != 0) {
                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion1111 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen1110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion1111, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                        function2.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                        function2.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier1113 = modifier2;
            Function1<? super TextLayoutResult, Unit> function1113 = function2;
            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1110, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i19 = i18;
            modifier3 = modifier1113;
            function3 = function1113;
            textStyle4 = textStyle3;
            z4 = z3;
            i20 = iM3718getClipgIe3tQ8;
        } else {
            if (i21 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i6 != 0) {
                textStyle3 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle3 = textStyle2;
            }
            if (i8 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i10 != 0) {
                iM3718getClipgIe3tQ8 = TextOverflow.INSTANCE.m3718getClipgIe3tQ8();
            } else {
                iM3718getClipgIe3tQ8 = i11;
            }
            if (i13 != 0) {
                i18 = Integer.MAX_VALUE;
            } else {
                i18 = i2;
            }
            if (i15 != 0) {
                function2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion1112 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, onClick, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen1111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion1112, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                        function2.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextLayoutResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                        function2.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier1114 = modifier2;
            Function1<? super TextLayoutResult, Unit> function1114 = function2;
            BasicTextKt.m734BasicTextRWo7tUw(text, modifierThen1111, textStyle3, (Function1) objRememberedValue3, iM3718getClipgIe3tQ8, z3, i18, 0, null, null, composerStartRestartGroup, (i5 & 14) | (i5 & 896) | (57344 & i5) | ((i5 << 6) & 458752) | ((i5 << 3) & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i19 = i18;
            modifier3 = modifier1114;
            function3 = function1114;
            textStyle4 = textStyle3;
            z4 = z3;
            i20 = iM3718getClipgIe3tQ8;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i22) {
                ClickableTextKt.m739ClickableText4YKlhWE(text, modifier3, textStyle4, z4, i20, i19, function3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!m740containsWithinBoundsUv8p0NA(multiParagraph, j)) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.m3201getOffsetForPositionk4lQ0M(j));
        }
        return null;
    }

    /* JADX INFO: renamed from: containsWithinBounds-Uv8p0NA, reason: not valid java name */
    private static final boolean m740containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j) {
        float fM1426component1impl = Offset.m1426component1impl(j);
        float fM1427component2impl = Offset.m1427component2impl(j);
        return fM1426component1impl > 0.0f && fM1427component2impl >= 0.0f && fM1426component1impl <= multiParagraph.getWidth() && fM1427component2impl <= multiParagraph.getHeight();
    }
}
