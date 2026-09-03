package p573o0oOoO;

import Oooo000.o00oO0o;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.OooO;
import o0000O0O.OooOo;
import o0000O0O.o000oOoO;
import o0O0O00.Oooo000;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00OO0OO;
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

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 {

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.refresh.SwipeLayoutKt$SwipeLayout$1$1", f = "SwipeLayout.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f45648Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000OO f45649Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000OO o000oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45649Oooo0oO = o000oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45649Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45648Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) this.f45649Oooo0oO.f45670OooO0o0.getValue()).booleanValue()) {
                    o000OO o000oo2 = this.f45649Oooo0oO;
                    this.f45648Oooo0o = 1;
                    Object objOooO0O0 = o000oo2.f45667OooO0O0.OooO0O0(MutatePriority.Default, new o0000O0(o000oo2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null), this);
                    if (objOooO0O0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO0O0 = Unit.INSTANCE;
                    }
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class OooO0O0 extends Lambda implements Function1<Oooo000, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Integer> f45650Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00OO<Integer> o0o00oo2) {
            super(1);
            this.f45650Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Oooo000 oooo000) {
            Oooo000 it = oooo000;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f45650Oooo0o.setValue(Integer.valueOf(o000oOoO.OooO0O0(it.OooO00o())));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<OooO, OooOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000OO f45651Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000OO o000oo2) {
            super(1);
            this.f45651Oooo0o = o000oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final OooOo invoke(OooO oooO) {
            OooO offset = oooO;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return new OooOo(o0000O0O.Oooo000.OooO00o(0, (int) this.f45651Oooo0o.OooO00o()));
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f45652Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f45653Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f45654Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f45655Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(o00OOOO0 o00oooo1, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f45653Oooo0o = o00oooo1;
            this.f45654Oooo0oO = function2;
            this.f45655Oooo0oo = i;
            this.f45652Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O00.OooO00o(this.f45653Oooo0o, this.f45654Oooo0oO, ooo00o, this.f45655Oooo0oo | 1, this.f45652Oooo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r5v20, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r6v29, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@Nullable o00OOOO0 o00oooo1, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2) {
        o00OOOO0 o00oooo2;
        int i3;
        o00OOOO0 o00oooo3;
        Function2<? super oOO00O, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O composer = ooo00o.OooOOo(1066139866);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            o00oooo2 = o00oooo1;
        } else if ((i & 14) == 0) {
            o00oooo2 = o00oooo1;
            i3 = (composer.Oooo0oo(o00oooo2) ? 4 : 2) | i;
        } else {
            o00oooo2 = o00oooo1;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composer.Oooo0oo(content) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 91) == 18 && composer.OooOo0()) {
            composer.OooOoo0();
            function2 = content;
            o00oooo3 = o00oooo2;
        } else {
            o00OOOO0 o00oooo4 = i4 != 0 ? o00OOOO0.OooO00o.f4198Oooo0o : o00oooo2;
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooO0O0 = o000O00.OooO0O0(composer, 773894976, -492369756);
            Object obj = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0O0 == obj) {
                objOooO0O0 = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.Oooo0o0();
            CoroutineScope coroutineScope = ((o00OO0OO) objOooO0O0).f29498Oooo0o;
            composer.Oooo0o0();
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            if (objOooO0o == obj) {
                objOooO0o = o0OOO00.OooO0Oo(1);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            float fIntValue = ((Number) o0o00oo2.getValue()).intValue() * 1.0f;
            float fIntValue2 = ((Number) o0o00oo2.getValue()).intValue() * 2.5f;
            composer.OooO0o0(665005425);
            composer.OooO0o0(-492369756);
            Object objOooO0o2 = composer.OooO0o();
            if (objOooO0o2 == obj) {
                objOooO0o2 = new o000OO(fIntValue, fIntValue2);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o000OO o000oo2 = (o000OO) objOooO0o2;
            o000oo2.f45669OooO0Oo.setValue(Float.valueOf(fIntValue));
            o000oo2.f45668OooO0OO.setValue(Float.valueOf(fIntValue2));
            composer.Oooo0o0();
            Boolean boolValueOf = Boolean.valueOf(((Boolean) o000oo2.f45670OooO0o0.getValue()).booleanValue());
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(o000oo2);
            Object objOooO0o3 = composer.OooO0o();
            if (zOooo0oo || objOooO0o3 == obj) {
                objOooO0o3 = new OooO00o(o000oo2, null);
                composer.Oooo00o(objOooO0o3);
            }
            composer.Oooo0o0();
            o00Oo00.OooO0o0(boolValueOf, (Function2) objOooO0o3, composer);
            composer.OooO0o0(511388516);
            boolean zOooo0oo2 = composer.Oooo0oo(o000oo2) | composer.Oooo0oo(coroutineScope);
            Object objOooO0o4 = composer.OooO0o();
            if (zOooo0oo2 || objOooO0o4 == obj) {
                objOooO0o4 = new o0000oo(o000oo2, coroutineScope);
                composer.Oooo00o(objOooO0o4);
            }
            composer.Oooo0o0();
            o0000oo o0000ooVar = (o0000oo) objOooO0o4;
            Objects.requireNonNull(o0000ooVar);
            Unit unit = Unit.INSTANCE;
            o00OOOO0 o00oooo0OooO00o = NestedScrollModifierKt.OooO00o(o00oooo4, o0000ooVar, null);
            composer.OooO0o0(733328855);
            p048OoooooO.o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4172OooO0O0;
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
            OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            o00OOOO0 o00oooo5 = o00oooo4;
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO00o);
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
            ?? r1 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r1);
            ?? r5 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r5);
            ?? r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r6);
            ?? r19 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r19, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
            Object objOooO0o5 = composer.OooO0o();
            if (zOooo0oo3 || objOooO0o5 == obj) {
                objOooO0o5 = new OooO0O0(o0o00oo2);
                composer.Oooo00o(objOooO0o5);
            }
            composer.Oooo0o0();
            p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooO0oO(OnGloballyPositionedModifierKt.OooO00o(oooO00o, (Function1) objOooO0o5), 40), composer, 0);
            composer.OooO0o0(1157296644);
            boolean zOooo0oo4 = composer.Oooo0oo(o000oo2);
            Object objOooO0o6 = composer.OooO0o();
            if (zOooo0oo4 || objOooO0o6 == obj) {
                objOooO0o6 = new OooO0OO(o000oo2);
                composer.Oooo00o(objOooO0o6);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO00o2 = OffsetKt.OooO00o(oooO00o, (Function1) objOooO0o6);
            o000000 o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
            OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO00o2);
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
            o00oooo3 = o00oooo5;
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r1, composer, oooO2, r5, composer, layoutDirection2, r6, composer, o00ooooo3, r19, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            function2 = content;
            function2.invoke(composer, Integer.valueOf((i5 >> 3) & 14));
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(o00oooo3, function2, i, i2));
    }
}
