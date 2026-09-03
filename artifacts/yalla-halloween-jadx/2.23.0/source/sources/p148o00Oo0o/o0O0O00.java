package p148o00Oo0o;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.paging.OooOOO0;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p150o00Oo0oO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRefreshContentStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefreshContentStatus.kt\ncom/code/android/uikit/RefreshContentStatusKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n25#2:90\n25#2:97\n1097#3,6:91\n1097#3,6:98\n81#4:104\n107#4,2:105\n81#4:107\n107#4,2:108\n*S KotlinDebug\n*F\n+ 1 RefreshContentStatus.kt\ncom/code/android/uikit/RefreshContentStatusKt\n*L\n24#1:90\n56#1:97\n24#1:91,6\n56#1:98,6\n24#1:104\n24#1:105,2\n56#1:107\n56#1:108,2\n*E\n"})
public final class o0O0O00 {

    @DebugMetadata(c = "com.code.android.uikit.RefreshContentStatusKt$observerAsContentState$1", f = "RefreshContentStatus.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<T> f37866OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<ContentState> f37867OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f37868OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o000O0.OooO0O0<T> oooO0O0, boolean z, MutableState<ContentState> mutableState, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f37866OooO0Oo = oooO0O0;
            this.f37868OooO0o0 = z;
            this.f37867OooO0o = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f37866OooO0Oo, this.f37868OooO0o0, this.f37867OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000O0.OooO0O0<T> oooO0O0 = this.f37866OooO0Oo;
            boolean z = oooO0O0.OooO0OO().f34455OooO00o instanceof OooOOO0.OooO00o;
            MutableState<ContentState> mutableState = this.f37867OooO0o;
            if (z) {
                mutableState.setValue(ContentState.Error);
            } else if (oooO0O0.OooO0OO().f34455OooO00o instanceof OooOOO0.OooO0OO) {
                mutableState.setValue((oooO0O0.OooO0OO().f34457OooO0OO.f7163OooO00o && oooO0O0.OooO0O0() == 0) ? ContentState.Empty : ContentState.Content);
            } else if ((oooO0O0.OooO0OO().f34455OooO00o instanceof OooOOO0.OooO0O0) && !this.f37868OooO0o0 && oooO0O0.OooO0O0() == 0) {
                mutableState.setValue(ContentState.Loading);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.code.android.uikit.RefreshContentStatusKt$RefreshContentStatus$1", f = "RefreshContentStatus.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<T> f37869OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f37870OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RefreshState f37871OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O0.OooO0O0<T> oooO0O0, RefreshState refreshState, MutableState<Boolean> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f37869OooO0Oo = oooO0O0;
            this.f37871OooO0o0 = refreshState;
            this.f37870OooO0o = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f37869OooO0Oo, this.f37871OooO0o0, this.f37870OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (!(this.f37869OooO0Oo.OooO0OO().f34455OooO00o instanceof OooOOO0.OooO0O0)) {
                this.f37871OooO0o0.OooO0Oo(false);
                this.f37870OooO0o.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<T> f37872OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f37873OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000O0.OooO0O0<T> oooO0O0, MutableState<Boolean> mutableState) {
            super(0);
            this.f37872OooO0Oo = oooO0O0;
            this.f37873OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f37873OooO0o0.setValue(Boolean.TRUE);
            this.f37872OooO0Oo.OooO0Oo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37874OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<T> f37875OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37876OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f37877OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37878OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37879OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f37880OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(o000O0.OooO0O0<T> oooO0O0, int i, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function4, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function5, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function6, MutableState<Boolean> mutableState) {
            super(2);
            this.f37875OooO0Oo = oooO0O0;
            this.f37877OooO0o0 = i;
            this.f37876OooO0o = function3;
            this.f37878OooO0oO = function4;
            this.f37879OooO0oo = function5;
            this.f37874OooO = function6;
            this.f37880OooOO0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(768783476, iIntValue, -1, "com.code.android.uikit.RefreshContentStatus.<anonymous> (RefreshContentStatus.kt:72)");
                }
                boolean zBooleanValue = this.f37880OooOO0.getValue().booleanValue();
                int i = o000O0.OooO0O0.f34327OooO0o0;
                int i2 = this.f37877OooO0o0;
                o000O0.OooO0O0<T> oooO0O0 = this.f37875OooO0Oo;
                int i3 = i2 >> 6;
                o0000Ooo.OooO0o0(o0O0O00.OooO0O0(oooO0O0, zBooleanValue, composer2, (i2 & 14) | 8, 0), false, Modifier.INSTANCE, this.f37876OooO0o, this.f37878OooO0oO, this.f37879OooO0oo, new o000OOo(oooO0O0), this.f37874OooO, composer2, (i3 & 458752) | (i3 & 7168) | 384 | (57344 & i3) | ((i2 >> 3) & 29360128), 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37881OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<T> f37882OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LazyListState f37883OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37884OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RefreshState f37885OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f37886OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37887OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37888OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37889OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f37890OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f37891OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(o000O0.OooO0O0<T> oooO0O0, Modifier modifier, LazyListState lazyListState, RefreshState refreshState, boolean z, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function4, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function5, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function6, int i, int i2) {
            super(2);
            this.f37882OooO0Oo = oooO0O0;
            this.f37884OooO0o0 = modifier;
            this.f37883OooO0o = lazyListState;
            this.f37885OooO0oO = refreshState;
            this.f37886OooO0oo = z;
            this.f37881OooO = function3;
            this.f37887OooOO0 = function4;
            this.f37888OooOO0O = function5;
            this.f37889OooOO0o = function6;
            this.f37891OooOOO0 = i;
            this.f37890OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O0O00.OooO00o(this.f37882OooO0Oo, this.f37884OooO0o0, this.f37883OooO0o, this.f37885OooO0oO, this.f37886OooO0oo, this.f37881OooO, this.f37887OooOO0, this.f37888OooOO0O, this.f37889OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37891OooOOO0 | 1), this.f37890OooOOO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0155  */
    /* JADX WARN: Code duplicated, block: B:108:0x0158  */
    /* JADX WARN: Code duplicated, block: B:110:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x015f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0166  */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:127:0x0190  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x0220  */
    /* JADX WARN: Code duplicated, block: B:139:0x0235  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][androidx.compose.ui.UiComposable]]")
    public static final <T> void OooO00o(@NotNull o000O0.OooO0O0<T> lazyPagingItems, @Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable RefreshState refreshState, boolean z, @Nullable Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function4, @Nullable Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function5, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        LazyListState lazyListState2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Modifier modifier2;
        RefreshState refreshStateOooO0OO;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function7;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function8;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function9;
        int i16;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function10;
        LazyListState lazyListState3;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function11;
        boolean z3;
        Modifier modifier3;
        RefreshState refreshState2;
        Object objRememberedValue;
        Continuation continuation;
        Modifier modifier4;
        Composer composer2;
        RefreshState refreshState3;
        LazyListState lazyListState4;
        boolean z4;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function12;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function13;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lazyPagingItems, "lazyPagingItems");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-986094175);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    lazyListState2 = lazyListState;
                    if (composerStartRestartGroup.changed(lazyListState2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 57344) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        i3 |= 196608;
                        function6 = function3;
                    } else {
                        function6 = function3;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    i13 = i2 & 128;
                    if (i13 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i14;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if (i6 != 8 && (191739611 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            refreshState3 = refreshState;
                            function13 = function4;
                            function14 = function5;
                            lazyListState4 = lazyListState2;
                            function12 = function6;
                            z4 = z2;
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i17 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    lazyListState2 = null;
                                }
                                if (i6 != 0) {
                                    refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                    i3 &= -7169;
                                } else {
                                    refreshStateOooO0OO = refreshState;
                                }
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if (i9 != 0) {
                                    function6 = null;
                                }
                                if (i11 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function4;
                                }
                                if (i13 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function5;
                                }
                                function9 = function8;
                                i16 = i3;
                                function10 = function7;
                                lazyListState3 = lazyListState2;
                                function11 = function6;
                                z3 = z2;
                                modifier3 = modifier2;
                                refreshState2 = refreshStateOooO0OO;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if (i6 != 0) {
                                    i3 &= -7169;
                                }
                                function10 = function4;
                                function9 = function5;
                                i16 = i3;
                                lazyListState3 = lazyListState2;
                                function11 = function6;
                                z3 = z2;
                                modifier3 = modifier;
                                refreshState2 = refreshState;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                continuation = null;
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                continuation = null;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MutableState mutableState = (MutableState) objRememberedValue;
                            EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState, continuation), composerStartRestartGroup, 72);
                            RefreshState refreshState4 = refreshState2;
                            modifier4 = modifier3;
                            composer2 = composerStartRestartGroup;
                            com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            refreshState3 = refreshState4;
                            lazyListState4 = lazyListState3;
                            z4 = z3;
                            function12 = function11;
                            function13 = function10;
                            function14 = function9;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
                    }
                    i15 = 100663296;
                    i3 |= i15;
                    if (i6 != 8) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        } else {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState2 = (MutableState) objRememberedValue;
                        EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState2, continuation), composerStartRestartGroup, 72);
                        RefreshState refreshState5 = refreshState2;
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState2), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState2)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        refreshState3 = refreshState5;
                        lazyListState4 = lazyListState3;
                        z4 = z3;
                        function12 = function11;
                        function13 = function10;
                        function14 = function9;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        } else {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState3 = (MutableState) objRememberedValue;
                        EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState3, continuation), composerStartRestartGroup, 72);
                        RefreshState refreshState6 = refreshState2;
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState3), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState3)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        refreshState3 = refreshState6;
                        lazyListState4 = lazyListState3;
                        z4 = z3;
                        function12 = function11;
                        function13 = function10;
                        function14 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
                }
                i3 |= 24576;
                z2 = z;
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if (i6 != 8) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        } else {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState4 = (MutableState) objRememberedValue;
                        EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState4, continuation), composerStartRestartGroup, 72);
                        RefreshState refreshState7 = refreshState2;
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState4), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState4)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        refreshState3 = refreshState7;
                        lazyListState4 = lazyListState3;
                        z4 = z3;
                        function12 = function11;
                        function13 = function10;
                        function14 = function9;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        } else {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState5 = (MutableState) objRememberedValue;
                        EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState5, continuation), composerStartRestartGroup, 72);
                        RefreshState refreshState8 = refreshState2;
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState5), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState5)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        refreshState3 = refreshState8;
                        lazyListState4 = lazyListState3;
                        z4 = z3;
                        function12 = function11;
                        function13 = function10;
                        function14 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
                }
                i15 = 100663296;
                i3 |= i15;
                if (i6 != 8) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState6 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState6, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState9 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState6), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState6)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState9;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState7 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState7, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState10 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState7), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState7)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState10;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
            }
            i3 |= 384;
            lazyListState2 = lazyListState;
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 57344) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if (i6 != 8) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        } else {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState8 = (MutableState) objRememberedValue;
                        EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState8, continuation), composerStartRestartGroup, 72);
                        RefreshState refreshState11 = refreshState2;
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState8), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState8)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        refreshState3 = refreshState11;
                        lazyListState4 = lazyListState3;
                        z4 = z3;
                        function12 = function11;
                        function13 = function10;
                        function14 = function9;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        } else {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState9 = (MutableState) objRememberedValue;
                        EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState9, continuation), composerStartRestartGroup, 72);
                        RefreshState refreshState12 = refreshState2;
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState9), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState9)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        refreshState3 = refreshState12;
                        lazyListState4 = lazyListState3;
                        z4 = z3;
                        function12 = function11;
                        function13 = function10;
                        function14 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
                }
                i15 = 100663296;
                i3 |= i15;
                if (i6 != 8) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState10 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState10, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState13 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState10), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState10)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState13;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState11 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState11, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState14 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState11), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState11)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState14;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i13 = i2 & 128;
            if (i13 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if (i6 != 8) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState12 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState12, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState15 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState12), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState12)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState15;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState13 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState13, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState16 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState13), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState13)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState16;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
            }
            i15 = 100663296;
            i3 |= i15;
            if (i6 != 8) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState14 = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState14, continuation), composerStartRestartGroup, 72);
                RefreshState refreshState17 = refreshState2;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState14), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState14)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                refreshState3 = refreshState17;
                lazyListState4 = lazyListState3;
                z4 = z3;
                function12 = function11;
                function13 = function10;
                function14 = function9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState15 = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState15, continuation), composerStartRestartGroup, 72);
                RefreshState refreshState18 = refreshState2;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState15), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState15)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                refreshState3 = refreshState18;
                lazyListState4 = lazyListState3;
                z4 = z3;
                function12 = function11;
                function13 = function10;
                function14 = function9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                lazyListState2 = lazyListState;
                if (composerStartRestartGroup.changed(lazyListState2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 57344) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if (i6 != 8) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        } else {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState16 = (MutableState) objRememberedValue;
                        EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState16, continuation), composerStartRestartGroup, 72);
                        RefreshState refreshState19 = refreshState2;
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState16), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState16)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        refreshState3 = refreshState19;
                        lazyListState4 = lazyListState3;
                        z4 = z3;
                        function12 = function11;
                        function13 = function10;
                        function14 = function9;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        } else {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                lazyListState2 = null;
                            }
                            if (i6 != 0) {
                                refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                refreshStateOooO0OO = refreshState;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if (i9 != 0) {
                                function6 = null;
                            }
                            if (i11 != 0) {
                                function7 = null;
                            } else {
                                function7 = function4;
                            }
                            if (i13 != 0) {
                                function8 = null;
                            } else {
                                function8 = function5;
                            }
                            function9 = function8;
                            i16 = i3;
                            function10 = function7;
                            lazyListState3 = lazyListState2;
                            function11 = function6;
                            z3 = z2;
                            modifier3 = modifier2;
                            refreshState2 = refreshStateOooO0OO;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState17 = (MutableState) objRememberedValue;
                        EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState17, continuation), composerStartRestartGroup, 72);
                        RefreshState refreshState110 = refreshState2;
                        modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState17), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState17)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        refreshState3 = refreshState110;
                        lazyListState4 = lazyListState3;
                        z4 = z3;
                        function12 = function11;
                        function13 = function10;
                        function14 = function9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
                }
                i15 = 100663296;
                i3 |= i15;
                if (i6 != 8) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState18 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState18, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState111 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState18), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState18)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState111;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState19 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState19, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState112 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState19), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState19)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState112;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i13 = i2 & 128;
            if (i13 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if (i6 != 8) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState110 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState110, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState113 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState110), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState110)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState113;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState111 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState111, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState114 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState111), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState111)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState114;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
            }
            i15 = 100663296;
            i3 |= i15;
            if (i6 != 8) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState112 = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState112, continuation), composerStartRestartGroup, 72);
                RefreshState refreshState115 = refreshState2;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState112), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState112)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                refreshState3 = refreshState115;
                lazyListState4 = lazyListState3;
                z4 = z3;
                function12 = function11;
                function13 = function10;
                function14 = function9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState113 = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState113, continuation), composerStartRestartGroup, 72);
                RefreshState refreshState116 = refreshState2;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState113), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState113)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                refreshState3 = refreshState116;
                lazyListState4 = lazyListState3;
                z4 = z3;
                function12 = function11;
                function13 = function10;
                function14 = function9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
        }
        i3 |= 384;
        lazyListState2 = lazyListState;
        i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 57344) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i13 = i2 & 128;
            if (i13 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if (i6 != 8) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState114 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState114, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState117 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState114), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState114)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState117;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            lazyListState2 = null;
                        }
                        if (i6 != 0) {
                            refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            refreshStateOooO0OO = refreshState;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        }
                        if (i11 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (i13 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        function9 = function8;
                        i16 = i3;
                        function10 = function7;
                        lazyListState3 = lazyListState2;
                        function11 = function6;
                        z3 = z2;
                        modifier3 = modifier2;
                        refreshState2 = refreshStateOooO0OO;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        continuation = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState115 = (MutableState) objRememberedValue;
                    EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState115, continuation), composerStartRestartGroup, 72);
                    RefreshState refreshState118 = refreshState2;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState115), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState115)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    refreshState3 = refreshState118;
                    lazyListState4 = lazyListState3;
                    z4 = z3;
                    function12 = function11;
                    function13 = function10;
                    function14 = function9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
            }
            i15 = 100663296;
            i3 |= i15;
            if (i6 != 8) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState116 = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState116, continuation), composerStartRestartGroup, 72);
                RefreshState refreshState119 = refreshState2;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState116), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState116)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                refreshState3 = refreshState119;
                lazyListState4 = lazyListState3;
                z4 = z3;
                function12 = function11;
                function13 = function10;
                function14 = function9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState117 = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState117, continuation), composerStartRestartGroup, 72);
                RefreshState refreshState1110 = refreshState2;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState117), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState117)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                refreshState3 = refreshState1110;
                lazyListState4 = lazyListState3;
                z4 = z3;
                function12 = function11;
                function13 = function10;
                function14 = function9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
        }
        i3 |= 24576;
        z2 = z;
        i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= 196608;
            function6 = function3;
        } else {
            function6 = function3;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
        }
        i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        i13 = i2 & 128;
        if (i13 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function5)) {
                i14 = 8388608;
            } else {
                i14 = Configuration.BLOCK_SIZE;
            }
            i3 |= i14;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            if ((234881024 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
            }
            if (i6 != 8) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState118 = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState118, continuation), composerStartRestartGroup, 72);
                RefreshState refreshState1111 = refreshState2;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState118), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState118)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                refreshState3 = refreshState1111;
                lazyListState4 = lazyListState3;
                z4 = z3;
                function12 = function11;
                function13 = function10;
                function14 = function9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyListState2 = null;
                    }
                    if (i6 != 0) {
                        refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        refreshStateOooO0OO = refreshState;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        function6 = null;
                    }
                    if (i11 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i13 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    function9 = function8;
                    i16 = i3;
                    function10 = function7;
                    lazyListState3 = lazyListState2;
                    function11 = function6;
                    z3 = z2;
                    modifier3 = modifier2;
                    refreshState2 = refreshStateOooO0OO;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState119 = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState119, continuation), composerStartRestartGroup, 72);
                RefreshState refreshState1112 = refreshState2;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState119), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState119)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                refreshState3 = refreshState1112;
                lazyListState4 = lazyListState3;
                z4 = z3;
                function12 = function11;
                function13 = function10;
                function14 = function9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
        }
        i15 = 100663296;
        i3 |= i15;
        if (i6 != 8) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    lazyListState2 = null;
                }
                if (i6 != 0) {
                    refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                    i3 &= -7169;
                } else {
                    refreshStateOooO0OO = refreshState;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    function6 = null;
                }
                if (i11 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i13 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                function9 = function8;
                i16 = i3;
                function10 = function7;
                lazyListState3 = lazyListState2;
                function11 = function6;
                z3 = z2;
                modifier3 = modifier2;
                refreshState2 = refreshStateOooO0OO;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    lazyListState2 = null;
                }
                if (i6 != 0) {
                    refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                    i3 &= -7169;
                } else {
                    refreshStateOooO0OO = refreshState;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    function6 = null;
                }
                if (i11 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i13 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                function9 = function8;
                i16 = i3;
                function10 = function7;
                lazyListState3 = lazyListState2;
                function11 = function6;
                z3 = z2;
                modifier3 = modifier2;
                refreshState2 = refreshStateOooO0OO;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                continuation = null;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                continuation = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState1110 = (MutableState) objRememberedValue;
            EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState1110, continuation), composerStartRestartGroup, 72);
            RefreshState refreshState1113 = refreshState2;
            modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState1110), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState1110)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            refreshState3 = refreshState1113;
            lazyListState4 = lazyListState3;
            z4 = z3;
            function12 = function11;
            function13 = function10;
            function14 = function9;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    lazyListState2 = null;
                }
                if (i6 != 0) {
                    refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                    i3 &= -7169;
                } else {
                    refreshStateOooO0OO = refreshState;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    function6 = null;
                }
                if (i11 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i13 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                function9 = function8;
                i16 = i3;
                function10 = function7;
                lazyListState3 = lazyListState2;
                function11 = function6;
                z3 = z2;
                modifier3 = modifier2;
                refreshState2 = refreshStateOooO0OO;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    lazyListState2 = null;
                }
                if (i6 != 0) {
                    refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
                    i3 &= -7169;
                } else {
                    refreshStateOooO0OO = refreshState;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    function6 = null;
                }
                if (i11 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i13 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                function9 = function8;
                i16 = i3;
                function10 = function7;
                lazyListState3 = lazyListState2;
                function11 = function6;
                z3 = z2;
                modifier3 = modifier2;
                refreshState2 = refreshStateOooO0OO;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986094175, i16, -1, "com.code.android.uikit.RefreshContentStatus (RefreshContentStatus.kt:43)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                continuation = null;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                continuation = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState1111 = (MutableState) objRememberedValue;
            EffectsKt.LaunchedEffect(lazyPagingItems.OooO0OO().f34455OooO00o, new OooO00o(lazyPagingItems, refreshState2, mutableState1111, continuation), composerStartRestartGroup, 72);
            RefreshState refreshState1114 = refreshState2;
            modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshState2, new OooO0O0(lazyPagingItems, mutableState1111), lazyListState3, ClipKt.clipToBounds(Modifier.INSTANCE).then(modifier3), z3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 768783476, true, new OooO0OO(lazyPagingItems, i16, function11, function10, function9, content, mutableState1111)), composer2, 196616 | (i16 & 896) | (57344 & i16), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            refreshState3 = refreshState1114;
            lazyListState4 = lazyListState3;
            z4 = z3;
            function12 = function11;
            function13 = function10;
            function14 = function9;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(lazyPagingItems, modifier4, lazyListState4, refreshState3, z4, function12, function13, function14, content, i, i2));
    }

    @Composable
    @NotNull
    public static final <T> ContentState OooO0O0(@NotNull o000O0.OooO0O0<T> oooO0O0, boolean z, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        composer.startReplaceableGroup(-322089237);
        if ((i2 & 1) != 0) {
            z = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-322089237, i, -1, "com.code.android.uikit.observerAsContentState (RefreshContentStatus.kt:22)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(oooO0O0.OooO0OO().f34455OooO00o, Boolean.valueOf(oooO0O0.OooO0O0() == 0), new OooO(oooO0O0, z, mutableState, null), composer, 520);
        ContentState contentState = (ContentState) mutableState.getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentState;
    }
}
