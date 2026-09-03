package p632o0ooO00O;

import Oooo0.oo00oO;
import Oooo000.o00oO0o;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import come.code.android.easyrefreshcontentstatus.RefreshState;
import io.agora.rtc.Constants;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import o0000O0O.OooO;
import o0000O0O.OooOOO0;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.o000O00O;
import p028Oooo0o0.o00O00o0;
import p031OoooO.o000Oo0;
import p032OoooO0.oo000o;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p442o0OoOo0.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOOo {

    @DebugMetadata(c = "come.code.android.easyrefreshcontentstatus.EasySwipeRefreshKt$BasicRefresh$1", f = "EasySwipeRefresh.kt", i = {0}, l = {122, 127, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 135}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o000O00O f48727Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f48728Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f48729Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f48730Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f48731OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ float f48732OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f48733OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f48734OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f48735OoooOO0;

        /* JADX INFO: renamed from: o0ooO00O.oO00OOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "come.code.android.easyrefreshcontentstatus.EasySwipeRefreshKt$BasicRefresh$1$1", f = "EasySwipeRefresh.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0422OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f48736Oooo0o;

            public C0422OooO00o(Continuation<? super C0422OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0422OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new C0422OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f48736Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f48736Oooo0o = 1;
                    if (DelayKt.delay(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ class OooO0O0 {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RefreshState.State.values().length];
                iArr[RefreshState.State.Null.ordinal()] = 1;
                iArr[RefreshState.State.Close.ordinal()] = 2;
                iArr[RefreshState.State.Finish.ordinal()] = 3;
                iArr[RefreshState.State.Refresh.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RefreshState refreshState, o000O00O o000o00o2, long j, float f, long j2, Function0<Unit> function0, o0O00OO<Boolean> o0o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f48730Oooo0oo = refreshState;
            this.f48727Oooo = o000o00o2;
            this.f48733OoooO00 = j;
            this.f48732OoooO0 = f;
            this.f48734OoooO0O = j2;
            this.f48731OoooO = function0;
            this.f48735OoooOO0 = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f48730Oooo0oo, this.f48727Oooo, this.f48733OoooO00, this.f48732OoooO0, this.f48734OoooO0O, this.f48731OoooO, this.f48735OoooOO0, continuation);
            oooO00o.f48729Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope scope;
            o000O00O o000o00o2;
            RefreshState refreshState;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48728Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope scope2 = (CoroutineScope) this.f48729Oooo0oO;
                int i2 = OooO0O0.$EnumSwitchMapping$0[this.f48730Oooo0oo.OooO0OO().ordinal()];
                if (i2 == 1) {
                    this.f48735OoooOO0.setValue(Boolean.FALSE);
                } else if (i2 == 2) {
                    o000O00O o000o00o3 = this.f48727Oooo;
                    if (o000o00o3 != null) {
                        Intrinsics.checkNotNullParameter(o000o00o3, "<this>");
                        Intrinsics.checkNotNullParameter(scope2, "scope");
                        BuildersKt__Builders_commonKt.launch$default(scope2, null, null, new oO00OOo0(o000o00o3, null), 3, null);
                    }
                    RefreshState refreshState2 = this.f48730Oooo0oo;
                    long j2 = this.f48733OoooO00;
                    this.f48729Oooo0oO = scope2;
                    this.f48728Oooo0o = 1;
                    if (refreshState2.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, j2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scope = scope2;
                    o000o00o2 = this.f48727Oooo;
                    if (o000o00o2 != null) {
                        Intrinsics.checkNotNullParameter(o000o00o2, "<this>");
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new oO00Oo00(o000o00o2, null), 3, null);
                    }
                    this.f48730Oooo0oo.OooO0Oo(RefreshState.State.Null);
                } else if (i2 == 3) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0422OooO00o c0422OooO00o = new C0422OooO00o(null);
                    this.f48728Oooo0o = 2;
                    if (BuildersKt.withContext(io2, c0422OooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    refreshState = this.f48730Oooo0oo;
                    j = this.f48733OoooO00;
                    this.f48728Oooo0o = 3;
                    if (refreshState.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f48730Oooo0oo.OooO0Oo(RefreshState.State.Null);
                } else if (i2 == 4) {
                    this.f48735OoooOO0.setValue(Boolean.TRUE);
                    RefreshState refreshState3 = this.f48730Oooo0oo;
                    float f = this.f48732OoooO0;
                    long j3 = this.f48734OoooO0O;
                    this.f48728Oooo0o = 4;
                    if (refreshState3.OooO00o(f, j3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f48731OoooO.invoke();
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    refreshState = this.f48730Oooo0oo;
                    j = this.f48733OoooO00;
                    this.f48728Oooo0o = 3;
                    if (refreshState.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.f48731OoooO.invoke();
                }
                this.f48730Oooo0oo.OooO0Oo(RefreshState.State.Null);
            } else {
                CoroutineScope coroutineScope = (CoroutineScope) this.f48729Oooo0oO;
                ResultKt.throwOnFailure(obj);
                scope = coroutineScope;
                o000o00o2 = this.f48727Oooo;
                if (o000o00o2 != null) {
                    Intrinsics.checkNotNullParameter(o000o00o2, "<this>");
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    BuildersKt__Builders_commonKt.launch$default(scope, null, null, new oO00Oo00(o000o00o2, null), 3, null);
                }
                this.f48730Oooo0oo.OooO0Oo(RefreshState.State.Null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f48737Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RefreshState f48738Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ float f48739Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f48740Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ float f48741OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ boolean f48742OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O00O f48743OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f48744OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ long f48745OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ Function6<o00O00o0, RefreshState.State, OooOOO0, Function2<? super oOO00O, ? super Integer, Unit>, oOO00O, Integer, Unit> f48746OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f48747OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ int f48748OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ int f48749OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final /* synthetic */ int f48750OoooOoo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ long f48751o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(RefreshState refreshState, float f, Function0<Unit> function0, o00OOOO0 o00oooo1, o000O00O o000o00o2, boolean z, boolean z2, float f2, long j, long j2, Function6<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super Function2<? super oOO00O, ? super Integer, Unit>, ? super oOO00O, ? super Integer, Unit> function6, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2, int i3) {
            super(2);
            this.f48738Oooo0o = refreshState;
            this.f48739Oooo0oO = f;
            this.f48740Oooo0oo = function0;
            this.f48737Oooo = o00oooo1;
            this.f48743OoooO00 = o000o00o2;
            this.f48742OoooO0 = z;
            this.f48744OoooO0O = z2;
            this.f48741OoooO = f2;
            this.f48745OoooOO0 = j;
            this.f48751o000oOoO = j2;
            this.f48746OoooOOO = function6;
            this.f48747OoooOOo = function2;
            this.f48748OoooOo0 = i;
            this.f48749OoooOoO = i2;
            this.f48750OoooOoo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00OOOo.OooO00o(this.f48738Oooo0o, this.f48739Oooo0oO, this.f48740Oooo0oo, this.f48737Oooo, this.f48743OoooO00, this.f48742OoooO0, this.f48744OoooO0O, this.f48741OoooO, this.f48745OoooOO0, this.f48751o000oOoO, this.f48746OoooOOO, this.f48747OoooOOo, ooo00o, this.f48748OoooOo0 | 1, this.f48749OoooOoO, this.f48750OoooOoo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function6<o00O00o0, RefreshState.State, OooOOO0, Function2<? super oOO00O, ? super Integer, ? extends Unit>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RefreshState f48752Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function5<o00O00o0, RefreshState.State, OooOOO0, oOO00O, Integer, Unit> f48753Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f48754Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(RefreshState refreshState, Function5<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super oOO00O, ? super Integer, Unit> function5, int i) {
            super(6);
            this.f48752Oooo0o = refreshState;
            this.f48753Oooo0oO = function5;
            this.f48754Oooo0oo = i;
        }

        /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r19v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        @Override // kotlin.jvm.functions.Function6
        public final Unit invoke(o00O00o0 o00o00o1, RefreshState.State state, OooOOO0 oooOOO0, Function2<? super oOO00O, ? super Integer, ? extends Unit> function2, oOO00O ooo00o, Integer num) {
            int i;
            o00O00o0 BasicRefresh = o00o00o1;
            RefreshState.State _state = state;
            float f = oooOOO0.f27306Oooo0o;
            Function2<? super oOO00O, ? super Integer, ? extends Unit> _content = function2;
            oOO00O composer = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BasicRefresh, "$this$BasicRefresh");
            Intrinsics.checkNotNullParameter(_state, "_state");
            Intrinsics.checkNotNullParameter(_content, "_content");
            if ((iIntValue & 112) == 0) {
                i = (composer.Oooo0oo(_state) ? 32 : 16) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 896) == 0) {
                i |= composer.OooO0oO(f) ? 256 : 128;
            }
            if ((iIntValue & 7168) == 0) {
                i |= composer.Oooo0oo(_content) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
            }
            if ((46801 & i) == 9360 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0OO = OffsetKt.OooO0OO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, 1);
                composer.OooO0o0(733328855);
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
                OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0OO);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                ?? r14 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r14);
                ?? r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r7);
                ?? r9 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r9);
                ?? r19 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r19, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
                _content.invoke(composer, Integer.valueOf((i >> 9) & 14));
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                if (this.f48752Oooo0o.OooO0OO() != RefreshState.State.Null) {
                    o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(Oooo000.OooO0O0(SizeKt.OooO0oO(oooO00o, f)));
                    o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4170OooO;
                    Function5<o00O00o0, RefreshState.State, OooOOO0, oOO00O, Integer, Unit> function5 = this.f48753Oooo0oO;
                    int i2 = this.f48754Oooo0oo;
                    o000000 o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
                    OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function0);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r14, composer, oooO2, r7, composer, layoutDirection2, r9, composer, o00ooooo3, r19, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    function5.invoke(boxScopeInstance, _state, new OooOOO0(f), composer, Integer.valueOf((i & 896) | (i & 112) | 6 | ((i2 << 9) & 7168)));
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f48755Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RefreshState f48756Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ float f48757Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f48758Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ float f48759OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ boolean f48760OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000O00O f48761OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f48762OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ long f48763OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ Function5<o00O00o0, RefreshState.State, OooOOO0, oOO00O, Integer, Unit> f48764OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f48765OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ int f48766OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ int f48767OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final /* synthetic */ int f48768OoooOoo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ long f48769o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(RefreshState refreshState, float f, Function0<Unit> function0, o00OOOO0 o00oooo1, o000O00O o000o00o2, boolean z, boolean z2, float f2, long j, long j2, Function5<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super oOO00O, ? super Integer, Unit> function5, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2, int i3) {
            super(2);
            this.f48756Oooo0o = refreshState;
            this.f48757Oooo0oO = f;
            this.f48758Oooo0oo = function0;
            this.f48755Oooo = o00oooo1;
            this.f48761OoooO00 = o000o00o2;
            this.f48760OoooO0 = z;
            this.f48762OoooO0O = z2;
            this.f48759OoooO = f2;
            this.f48763OoooOO0 = j;
            this.f48769o000oOoO = j2;
            this.f48764OoooOOO = function5;
            this.f48765OoooOOo = function2;
            this.f48766OoooOo0 = i;
            this.f48767OoooOoO = i2;
            this.f48768OoooOoo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00OOOo.OooO0O0(this.f48756Oooo0o, this.f48757Oooo0oO, this.f48758Oooo0oo, this.f48755Oooo, this.f48761OoooO00, this.f48760OoooO0, this.f48762OoooO0O, this.f48759OoooO, this.f48763OoooOO0, this.f48769o000oOoO, this.f48764OoooOOO, this.f48765OoooOOo, ooo00o, this.f48766OoooOo0 | 1, this.f48767OoooOoO, this.f48768OoooOoo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[0]][0]]")
    public static final void OooO00o(@NotNull RefreshState refreshState, float f, @NotNull Function0<Unit> onRefresh, @Nullable o00OOOO0 o00oooo1, @Nullable o000O00O o000o00o2, boolean z, boolean z2, float f2, long j, long j2, @NotNull Function6<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super Function2<? super oOO00O, ? super Integer, Unit>, ? super oOO00O, ? super Integer, Unit> refreshIndicator, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(refreshIndicator, "refreshIndicator");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O composer = ooo00o.OooOOo(-1016163986);
        o00OOOO0 o00oooo2 = (i3 & 8) != 0 ? o00OOOO0.OooO00o.f4198Oooo0o : o00oooo1;
        o000O00O o000o00o3 = (i3 & 16) != 0 ? null : o000o00o2;
        boolean z3 = (i3 & 32) != 0 ? true : z;
        boolean z4 = (i3 & 64) != 0 ? false : z2;
        float f3 = (i3 & 128) != 0 ? 2.5f : f2;
        long j3 = (i3 & 256) != 0 ? 300L : j;
        long j4 = (i3 & 512) != 0 ? 300L : j2;
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
        float fOoooOoo = ((OooO) composer.OooOO0o(o0o0o0o0)).OoooOoo(f);
        composer.OooO0o0(773894976);
        composer.OooO0o0(-492369756);
        Object objOooO0o = composer.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.Oooo0o0();
        CoroutineScope coroutineScope = ((p100o000oOoO.o00OO0OO) objOooO0o).f29498Oooo0o;
        composer.Oooo0o0();
        composer.OooO0o0(511388516);
        boolean zOooo0oo = composer.Oooo0oo(refreshState) | composer.Oooo0oo(coroutineScope);
        Object objOooO0o2 = composer.OooO0o();
        Object obj = objOooO0o2;
        if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
            oO00Oo0 oo00oo0 = new oO00Oo0(refreshState, coroutineScope);
            oo00oo0.f48773Oooo = f3;
            Unit unit = Unit.INSTANCE;
            composer.Oooo00o(oo00oo0);
            obj = oo00oo0;
        }
        composer.Oooo0o0();
        oO00Oo0 oo00oo1 = (oO00Oo0) obj;
        oo00oo1.f48777OoooO00 = fOoooOoo;
        Unit unit2 = Unit.INSTANCE;
        composer.OooO0o0(-492369756);
        Object objOooO0o3 = composer.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o3);
        }
        composer.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o3;
        float f4 = f3;
        o00OOOO0 o00oooo3 = o00oooo2;
        o00Oo00.OooO0o0(refreshState.OooO0OO(), new OooO00o(refreshState, o000o00o3, j4, fOoooOoo, j3, onRefresh, o0o00oo2, null), composer);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooOOoo = NestedScrollModifierKt.OooO00o(Oooo000.OooO0O0(oooO00o), oo00oo1, null).OooOOoo(o00oooo3);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooOOoo);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
        composer.OooO0o0(1275097338);
        float fOoooOO0 = !z3 ? 0 : ((OooO) composer.OooOO0o(o0o0o0o0)).OoooOO0(refreshState.OooO0O0());
        composer.Oooo0o0();
        refreshIndicator.invoke(boxScopeInstance, refreshState.OooO0OO(), new OooOOO0(fOoooOO0), content, composer, Integer.valueOf(((i2 << 6) & 7168) | 6 | (57344 & (i2 << 12))));
        if (((Boolean) o0o00oo2.getValue()).booleanValue() && !z4) {
            p028Oooo0o0.oOO00O.OooO00o(oo00oO.OooO0OO(SizeKt.OooO0o0(oooO00o), oo00oO.OooO0O0(composer, 1)), composer, 0);
        }
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new OooO0O0(refreshState, f, onRefresh, o00oooo3, o000o00o3, z3, z4, f4, j3, j4, refreshIndicator, content, i, i2, i3));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OooO0O0(@NotNull RefreshState refreshState, float f, @NotNull Function0<Unit> onRefresh, @Nullable o00OOOO0 o00oooo1, @Nullable o000O00O o000o00o2, boolean z, boolean z2, float f2, long j, long j2, @NotNull Function5<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super oOO00O, ? super Integer, Unit> refreshIndicator, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(refreshIndicator, "refreshIndicator");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-899490017);
        o00OOOO0 o00oooo2 = (i3 & 8) != 0 ? o00OOOO0.OooO00o.f4198Oooo0o : o00oooo1;
        o000O00O o000o00o3 = (i3 & 16) != 0 ? null : o000o00o2;
        boolean z3 = (i3 & 32) != 0 ? true : z;
        boolean z4 = (i3 & 64) != 0 ? false : z2;
        float f3 = (i3 & 128) != 0 ? 3.5f : f2;
        long j3 = (i3 & 256) != 0 ? 300L : j;
        long j4 = (i3 & 512) != 0 ? 300L : j2;
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        OooO00o(refreshState, f, onRefresh, o00oooo2, o000o00o3, z3, z4, f3, j3, j4, o00O0000.OooO00o(ooo00oOooOOo, 2120357228, new OooO0OO(refreshState, refreshIndicator, i2)), content, ooo00oOooOOo, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (1879048192 & i), (i2 & 112) | 6, 0);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(refreshState, f, onRefresh, o00oooo2, o000o00o3, z3, z4, f3, j3, j4, refreshIndicator, content, i, i2, i3));
    }

    @Composable
    @NotNull
    public static final RefreshState OooO0OO(@Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(-476203966);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o = ooo00o.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new RefreshState();
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        RefreshState refreshState = (RefreshState) objOooO0o;
        ooo00o.Oooo0o0();
        return refreshState;
    }
}
