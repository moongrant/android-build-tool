package o00O00O;

import Oooo0.oo00oO;
import Oooo000.o00oO0o;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import code.easy.refresh.RefreshState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
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
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.OooOOO0;
import o0O0O00.o000000;
import o0O0O00.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p445o0OoOo0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    @DebugMetadata(c = "code.easy.refresh.EasyRefreshKt$BasicRefresh$1", f = "EasyRefresh.kt", i = {}, l = {Constants.ERR_WATERMARK_READ, 134}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f30204Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ long f30205OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f30206OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ RefreshState f30207OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ float f30208OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30209OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f30210o000oOoO;

        /* JADX INFO: renamed from: o00O00O.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0328OooO00o {
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
        public OooO00o(RefreshState refreshState, long j, float f, long j2, Function0<Unit> function0, o0O00O<Boolean> o0o00o2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f30207OoooO00 = refreshState;
            this.f30206OoooO0 = j;
            this.f30208OoooO0O = f;
            this.f30205OoooO = j2;
            this.f30209OoooOO0 = function0;
            this.f30210o000oOoO = o0o00o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f30207OoooO00, this.f30206OoooO0, this.f30208OoooO0O, this.f30205OoooO, this.f30209OoooOO0, this.f30210o000oOoO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30204Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = C0328OooO00o.$EnumSwitchMapping$0[this.f30207OoooO00.OooO0OO().ordinal()];
                if (i2 == 1) {
                    this.f30210o000oOoO.setValue(Boolean.FALSE);
                } else if (i2 == 2 || i2 == 3) {
                    RefreshState refreshState = this.f30207OoooO00;
                    long j = this.f30206OoooO0;
                    this.f30204Oooo = 1;
                    if (refreshState.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f30207OoooO00.OooO0Oo(RefreshState.State.Null);
                } else if (i2 == 4) {
                    this.f30210o000oOoO.setValue(Boolean.TRUE);
                    RefreshState refreshState2 = this.f30207OoooO00;
                    float f = this.f30208OoooO0O;
                    long j2 = this.f30205OoooO;
                    this.f30204Oooo = 2;
                    if (refreshState2.OooO00o(f, j2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f30209OoooOO0.invoke();
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                this.f30207OoooO00.OooO0Oo(RefreshState.State.Null);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f30209OoooOO0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o00O00O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0329OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f30211Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ boolean f30212OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30213OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ float f30214OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f30215OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f30216OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ long f30217OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ long f30218OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ Function6<o00O00o0, RefreshState.State, OooOOO0, Function2<? super oOO00O, ? super Integer, Unit>, oOO00O, Integer, Unit> f30219OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f30220OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final /* synthetic */ int f30221OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public final /* synthetic */ int f30222Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public final /* synthetic */ int f30223Ooooo0o;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ float f30224o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0329OooO0O0(RefreshState refreshState, float f, Function0<Unit> function0, o00OOOO0 o00oooo1, boolean z, boolean z2, float f2, long j, long j2, Function6<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super Function2<? super oOO00O, ? super Integer, Unit>, ? super oOO00O, ? super Integer, Unit> function6, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2, int i3) {
            super(2);
            this.f30211Oooo = refreshState;
            this.f30214OoooO00 = f;
            this.f30213OoooO0 = function0;
            this.f30215OoooO0O = o00oooo1;
            this.f30212OoooO = z;
            this.f30216OoooOO0 = z2;
            this.f30224o000oOoO = f2;
            this.f30217OoooOOO = j;
            this.f30218OoooOOo = j2;
            this.f30219OoooOo0 = function6;
            this.f30220OoooOoO = function2;
            this.f30221OoooOoo = i;
            this.f30222Ooooo00 = i2;
            this.f30223Ooooo0o = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooO0O0.OooO00o(this.f30211Oooo, this.f30214OoooO00, this.f30213OoooO0, this.f30215OoooO0O, this.f30212OoooO, this.f30216OoooOO0, this.f30224o000oOoO, this.f30217OoooOOO, this.f30218OoooOOo, this.f30219OoooOo0, this.f30220OoooOoO, ooo00o, this.f30221OoooOoo | 1, this.f30222Ooooo00, this.f30223Ooooo0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function6<o00O00o0, RefreshState.State, OooOOO0, Function2<? super oOO00O, ? super Integer, ? extends Unit>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f30225Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f30226OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function5<o00O00o0, RefreshState.State, OooOOO0, oOO00O, Integer, Unit> f30227OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(RefreshState refreshState, Function5<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super oOO00O, ? super Integer, Unit> function5, int i) {
            super(6);
            this.f30225Oooo = refreshState;
            this.f30227OoooO00 = function5;
            this.f30226OoooO0 = i;
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
            float f = oooOOO0.f27326Oooo;
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
            if (((46801 & i) ^ 9360) == 0 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
                o00OOOO0 o00oooo0OooO0OO = OffsetKt.OooO0OO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, 1);
                composer.OooO0o0(733328855);
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4189OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6371OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6375OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6379OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Ooo.OooO0O0(o00oooo0OooO0OO);
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
                ?? r14 = o000000.OooO00o.C0279OooO00o.f26600OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r14);
                ?? r7 = o000000.OooO00o.C0279OooO00o.f26598OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r7);
                ?? r9 = o000000.OooO00o.C0279OooO00o.f26599OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r9);
                ?? r19 = o000000.OooO00o.C0279OooO00o.f26601OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r19, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5756OooO00o;
                _content.invoke(composer, Integer.valueOf((i >> 9) & 14));
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                if (this.f30225Oooo.OooO0OO() != RefreshState.State.Null) {
                    composer.OooO0o0(-772283854);
                    o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(Oooo000.OooO0O0(SizeKt.OooO0oO(oooO00o, f)));
                    o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4187OooO;
                    Function5<o00O00o0, RefreshState.State, OooOOO0, oOO00O, Integer, Unit> function5 = this.f30227OoooO00;
                    int i2 = this.f30226OoooO0;
                    o000000 o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
                    o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Ooo.OooO0O0(o00oooo0OooO0o);
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
                    function5.invoke(boxScopeInstance, _state, new OooOOO0(f), composer, Integer.valueOf((i & 896) | (i & 112) | 6 | ((i2 >> 18) & 7168)));
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                } else {
                    composer.OooO0o0(-772283495);
                    composer.Oooo0o0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f30228Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ boolean f30229OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30230OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ float f30231OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f30232OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f30233OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ long f30234OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ long f30235OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ Function5<o00O00o0, RefreshState.State, OooOOO0, oOO00O, Integer, Unit> f30236OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f30237OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final /* synthetic */ int f30238OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public final /* synthetic */ int f30239Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public final /* synthetic */ int f30240Ooooo0o;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ float f30241o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(RefreshState refreshState, float f, Function0<Unit> function0, o00OOOO0 o00oooo1, boolean z, boolean z2, float f2, long j, long j2, Function5<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super oOO00O, ? super Integer, Unit> function5, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2, int i3) {
            super(2);
            this.f30228Oooo = refreshState;
            this.f30231OoooO00 = f;
            this.f30230OoooO0 = function0;
            this.f30232OoooO0O = o00oooo1;
            this.f30229OoooO = z;
            this.f30233OoooOO0 = z2;
            this.f30241o000oOoO = f2;
            this.f30234OoooOOO = j;
            this.f30235OoooOOo = j2;
            this.f30236OoooOo0 = function5;
            this.f30237OoooOoO = function2;
            this.f30238OoooOoo = i;
            this.f30239Ooooo00 = i2;
            this.f30240Ooooo0o = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooO0O0.OooO0O0(this.f30228Oooo, this.f30231OoooO00, this.f30230OoooO0, this.f30232OoooO0O, this.f30229OoooO, this.f30233OoooOO0, this.f30241o000oOoO, this.f30234OoooOOO, this.f30235OoooOOo, this.f30236OoooOo0, this.f30237OoooOoO, ooo00o, this.f30238OoooOoo | 1, this.f30239Ooooo00, this.f30240Ooooo0o);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Composable
    public static final void OooO00o(@NotNull RefreshState refreshState, float f, @NotNull Function0<Unit> onRefresh, @Nullable o00OOOO0 o00oooo1, boolean z, boolean z2, float f2, long j, long j2, @NotNull Function6<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super Function2<? super oOO00O, ? super Integer, Unit>, ? super oOO00O, ? super Integer, Unit> refreshIndicator, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2, int i3) {
        float fOoooOO0;
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(refreshIndicator, "refreshIndicator");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O composer = ooo00o.OooOOo(2073463723);
        o00OOOO0 o00oooo2 = (i3 & 8) != 0 ? o00OOOO0.OooO00o.f4215Oooo : o00oooo1;
        boolean z3 = (i3 & 16) != 0 ? true : z;
        boolean z4 = (i3 & 32) != 0 ? false : z2;
        float f3 = (i3 & 64) != 0 ? 2.5f : f2;
        long j3 = (i3 & 128) != 0 ? 300L : j;
        long j4 = (i3 & 256) != 0 ? 300L : j2;
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6371OooO0o0;
        float fOoooOoo = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooOoo(f);
        composer.OooO0o0(773894976);
        composer.OooO0o0(-492369756);
        Object objOooO0o = composer.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o00oO0o.OooO0O0(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.Oooo0o0();
        CoroutineScope coroutineScope = ((p100o000oOoO.o00OO0OO) objOooO0o).f29518Oooo;
        composer.Oooo0o0();
        composer.OooO0o0(511388516);
        boolean zOooo0oo = composer.Oooo0oo(refreshState) | composer.Oooo0oo(coroutineScope);
        Object objOooO0o2 = composer.OooO0o();
        Object obj = objOooO0o2;
        if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
            o00O00O.OooO0o oooO0o = new o00O00O.OooO0o(refreshState, coroutineScope);
            oooO0o.f30246OoooO0O = f3;
            Unit unit = Unit.INSTANCE;
            composer.Oooo00o(oooO0o);
            obj = oooO0o;
        }
        composer.Oooo0o0();
        o00O00O.OooO0o oooO0o2 = (o00O00O.OooO0o) obj;
        oooO0o2.f30243OoooO = fOoooOoo;
        Unit unit2 = Unit.INSTANCE;
        composer.OooO0o0(-492369756);
        Object objOooO0o3 = composer.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o3);
        }
        composer.Oooo0o0();
        o0O00O o0o00o2 = (o0O00O) objOooO0o3;
        float f4 = f3;
        o00OOOO0 o00oooo3 = o00oooo2;
        o00Oo00.OooO0o0(refreshState.OooO0OO(), new OooO00o(refreshState, j4, fOoooOoo, j3, onRefresh, o0o00o2, null), composer);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4215Oooo;
        o00OOOO0 o00oooo0OooOOoo = NestedScrollModifierKt.OooO00o(Oooo000.OooO0O0(oooO00o), oooO0o2, null).OooOOoo(o00oooo3);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4189OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Ooo.OooO0O0(o00oooo0OooOOoo);
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
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5756OooO00o;
        if (z3) {
            composer.OooO0o0(-856269429);
            fOoooOO0 = ((o0000O0O.OooO) composer.OooOO0o(o0o0o0o0)).OoooOO0(refreshState.OooO0O0());
            composer.Oooo0o0();
        } else {
            composer.OooO0o0(-856269437);
            composer.Oooo0o0();
            fOoooOO0 = 0;
        }
        refreshIndicator.invoke(boxScopeInstance, refreshState.OooO0OO(), new OooOOO0(fOoooOO0), content, composer, Integer.valueOf(((i2 << 9) & 7168) | 6 | (57344 & (i >> 15))));
        if (!((Boolean) o0o00o2.getValue()).booleanValue() || z4) {
            composer.OooO0o0(-856269136);
            composer.Oooo0o0();
        } else {
            composer.OooO0o0(-856269225);
            p028Oooo0o0.oOO00O.OooO00o(oo00oO.OooO0OO(SizeKt.OooO0o0(oooO00o), oo00oO.OooO0O0(composer, 1)), composer, 0);
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new C0329OooO0O0(refreshState, f, onRefresh, o00oooo3, z3, z4, f4, j3, j4, refreshIndicator, content, i, i2, i3));
    }

    @Composable
    public static final void OooO0O0(@NotNull RefreshState refreshState, float f, @NotNull Function0<Unit> onRefresh, @Nullable o00OOOO0 o00oooo1, boolean z, boolean z2, float f2, long j, long j2, @NotNull Function5<? super o00O00o0, ? super RefreshState.State, ? super OooOOO0, ? super oOO00O, ? super Integer, Unit> refreshIndicator, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(refreshIndicator, "refreshIndicator");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1427920098);
        o00OOOO0 o00oooo2 = (i3 & 8) != 0 ? o00OOOO0.OooO00o.f4215Oooo : o00oooo1;
        boolean z3 = (i3 & 16) != 0 ? true : z;
        boolean z4 = (i3 & 32) != 0 ? false : z2;
        float f3 = (i3 & 64) != 0 ? 3.5f : f2;
        long j3 = (i3 & 128) != 0 ? 300L : j;
        long j4 = (i3 & 256) != 0 ? 300L : j2;
        OooO00o(refreshState, f, onRefresh, o00oooo2, z3, z4, f3, j3, j4, o00O0000.OooO00o(ooo00oOooOOo, -819893075, new OooO0OO(refreshState, refreshIndicator, i)), content, ooo00oOooOOo, 805306376 | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i), i2 & 14, 0);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(refreshState, f, onRefresh, o00oooo2, z3, z4, f3, j3, j4, refreshIndicator, content, i, i2, i3));
    }
}
