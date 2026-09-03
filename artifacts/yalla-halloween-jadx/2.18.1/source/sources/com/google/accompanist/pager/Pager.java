package com.google.accompanist.pager;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00000OO;
import p025Oooo0O0.o000000O;
import p027Oooo0o.o000;
import p027Oooo0o.o0000O;
import p027Oooo0o.o000O00O;
import p027Oooo0o.oo000o;
import p028Oooo0o0.o0O00O;
import p028Oooo0o0.o0O00O0o;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p633o0ooO00o.oO00o0;
import p633o0ooO00o.oO00o00;
import p633o0ooO00o.oO00o00O;
import p633o0ooO00o.oO0OO00o;
import p633o0ooO00o.oOo0000O;
import p633o0ooO00o.oOo000Oo;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "Pager")
public final class Pager {

    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$6$1", f = "Pager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f12975Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000O0O.OooO f12976Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f12977Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f12978Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f12979OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O0o f12980OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0000O0O.OooO oooO, o0O0O0O.OooOO0 oooOO1, boolean z, boolean z2, o0O00O0o o0o00o0o, LayoutDirection layoutDirection, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f12976Oooo0o = oooO;
            this.f12977Oooo0oO = oooOO1;
            this.f12978Oooo0oo = z;
            this.f12975Oooo = z2;
            this.f12980OoooO00 = o0o00o0o;
            this.f12979OoooO0 = layoutDirection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f12976Oooo0o, this.f12977Oooo0oO, this.f12978Oooo0oo, this.f12975Oooo, this.f12980OoooO00, this.f12979OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            float fOooO0O0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0000O0O.OooO oooO = this.f12976Oooo0o;
            o0O0O0O.OooOO0 oooOO1 = this.f12977Oooo0oO;
            boolean z = this.f12978Oooo0oo;
            boolean z2 = this.f12975Oooo;
            o0O00O0o o0o00o0o = this.f12980OoooO00;
            LayoutDirection layoutDirection = this.f12979OoooO0;
            if (z) {
                fOooO0O0 = !z2 ? o0o00o0o.OooO00o() : o0o00o0o.OooO0Oo();
            } else {
                fOooO0O0 = !z2 ? PaddingKt.OooO0O0(o0o00o0o, layoutDirection) : PaddingKt.OooO0OO(o0o00o0o, layoutDirection);
            }
            oooOO1.f35355OooO0OO = oooO.OoooooO(fOooO0O0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f12981Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f12982Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f12983Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f12984Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o000000O f12985OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00O0o f12986OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ float f12987OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0.OooO0OO f12988OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f12989OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O0O.OooO0o, Integer, oOO00O, Integer, Unit> f12990OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ int f12991OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ int f12992OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ int f12993OoooOoO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ boolean f12994o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(int i, o00OOOO0 o00oooo1, o0O0O0O.OooOO0 oooOO1, boolean z, float f, o0O00O0o o0o00o0o, o00OO0O0.OooO0OO oooO0OO, o000000O o000000o2, Function1<? super Integer, ? extends Object> function1, boolean z2, Function4<? super o0O0O0O.OooO0o, ? super Integer, ? super oOO00O, ? super Integer, Unit> function4, int i2, int i3, int i4) {
            super(2);
            this.f12982Oooo0o = i;
            this.f12983Oooo0oO = o00oooo1;
            this.f12984Oooo0oo = oooOO1;
            this.f12981Oooo = z;
            this.f12987OoooO00 = f;
            this.f12986OoooO0 = o0o00o0o;
            this.f12988OoooO0O = oooO0OO;
            this.f12985OoooO = o000000o2;
            this.f12989OoooOO0 = function1;
            this.f12994o000oOoO = z2;
            this.f12990OoooOOO = function4;
            this.f12991OoooOOo = i2;
            this.f12992OoooOo0 = i3;
            this.f12993OoooOoO = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            Pager.OooO00o(this.f12982Oooo0o, this.f12983Oooo0oO, this.f12984Oooo0oo, this.f12981Oooo, this.f12987OoooO00, this.f12986OoooO0, this.f12988OoooO0O, this.f12985OoooO, this.f12989OoooOO0, this.f12994o000oOoO, this.f12990OoooOOO, ooo00o, this.f12991OoooOOo | 1, this.f12992OoooOo0, this.f12993OoooOoO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000000O f12995Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000000O o000000o2) {
            super(0);
            this.f12995Oooo0o = o000000o2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            o000000O o000000o2 = this.f12995Oooo0o;
            oO00o0 oo00o0 = o000000o2 instanceof oO00o0 ? (oO00o0) o000000o2 : null;
            if (oo00o0 != null) {
                return (Integer) oo00o0.f48796OooO0o.getValue();
            }
            return null;
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$3$1", f = "Pager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f12996Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f12997Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0O0O0O.OooOO0 oooOO1, int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f12996Oooo0o = oooOO1;
            this.f12997Oooo0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f12996Oooo0o, this.f12997Oooo0oO, continuation);
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
            o0O0O0O.OooOO0 oooOO1 = this.f12996Oooo0o;
            oooOO1.OooOOO(RangesKt.coerceAtLeast(Math.min(this.f12997Oooo0oO - 1, oooOO1.OooO0o0()), 0));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.google.accompanist.pager.Pager$Pager$5$1", f = "Pager.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f12998Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f12999Oooo0oO;

        public static final class OooO00o extends Lambda implements Function0<Integer> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o0O0O0O.OooOO0 f13000Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0O0O0O.OooOO0 oooOO1) {
                super(0);
                this.f13000Oooo0o = oooOO1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                oo000o oo000oVarOooO0oo = this.f13000Oooo0o.OooO0oo();
                if (oo000oVarOooO0oo != null) {
                    return Integer.valueOf(oo000oVarOooO0oo.getIndex());
                }
                return null;
            }
        }

        public static final class OooO0O0 implements FlowCollector<Integer> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o0O0O0O.OooOO0 f13001Oooo0o;

            public OooO0O0(o0O0O0O.OooOO0 oooOO1) {
                this.f13001Oooo0o = oooOO1;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Integer num, Continuation continuation) {
                o0O0O0O.OooOO0 oooOO1 = this.f13001Oooo0o;
                oo000o oo000oVarOooO0oo = oooOO1.OooO0oo();
                if (oo000oVarOooO0oo != null) {
                    oooOO1.OooOOO(oo000oVarOooO0oo.getIndex());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0O0O0O.OooOO0 oooOO1, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f12999Oooo0oO = oooOO1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f12999Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f12998Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(o0OOO00.OooO0oO(new OooO00o(this.f12999Oooo0oO)));
                OooO0O0 oooO0O0 = new OooO0O0(this.f12999Oooo0oO);
                this.f12998Oooo0o = 1;
                if (flowDistinctUntilChanged.collect(oooO0O0, this) == coroutine_suspended) {
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

    public static final class OooOO0 extends Lambda implements Function1<o000, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O0O.OooO0o, Integer, oOO00O, Integer, Unit> f13002Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f13003Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f13004Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooO00o f13005Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f13006OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooO f13007OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(int i, Function1<? super Integer, ? extends Object> function1, o0O0O0O.OooO00o oooO00o, Function4<? super o0O0O0O.OooO0o, ? super Integer, ? super oOO00O, ? super Integer, Unit> function4, o0O0O0O.OooO oooO, int i2) {
            super(1);
            this.f13003Oooo0o = i;
            this.f13004Oooo0oO = function1;
            this.f13005Oooo0oo = oooO00o;
            this.f13002Oooo = function4;
            this.f13007OoooO00 = oooO;
            this.f13006OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000 o000Var) {
            o000 LazyColumn = o000Var;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            o0000O.OooO0O0(LazyColumn, this.f13003Oooo0o, this.f13004Oooo0oO, null, o00O0000.OooO0O0(1889356237, true, new com.google.accompanist.pager.OooO00o(this.f13005Oooo0oo, this.f13002Oooo, this.f13007OoooO00, this.f13006OoooO0)), 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<o000, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O0O.OooO0o, Integer, oOO00O, Integer, Unit> f13008Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f13009Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f13010Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooO00o f13011Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f13012OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooO f13013OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(int i, Function1<? super Integer, ? extends Object> function1, o0O0O0O.OooO00o oooO00o, Function4<? super o0O0O0O.OooO0o, ? super Integer, ? super oOO00O, ? super Integer, Unit> function4, o0O0O0O.OooO oooO, int i2) {
            super(1);
            this.f13009Oooo0o = i;
            this.f13010Oooo0oO = function1;
            this.f13011Oooo0oo = oooO00o;
            this.f13008Oooo = function4;
            this.f13013OoooO00 = oooO;
            this.f13012OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000 o000Var) {
            o000 LazyRow = o000Var;
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            o0000O.OooO0O0(LazyRow, this.f13009Oooo0o, this.f13010Oooo0oO, null, o00O0000.OooO0O0(-70560628, true, new com.google.accompanist.pager.OooO0O0(this.f13011Oooo0oo, this.f13008Oooo, this.f13013OoooO00, this.f13012OoooO0)), 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f13014Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f13015Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f13016Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f13017Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Object> f13018OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ boolean f13019OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ float f13020OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o000000O f13021OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ o0O00O0o f13022OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0.OooO0OO f13023OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0.OooO0O0 f13024OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ Function4<o0O0O0O.OooO0o, Integer, oOO00O, Integer, Unit> f13025OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ int f13026OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final /* synthetic */ int f13027OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public final /* synthetic */ int f13028Ooooo00;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ boolean f13029o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(int i, o00OOOO0 o00oooo1, o0O0O0O.OooOO0 oooOO1, boolean z, float f, boolean z2, o000000O o000000o2, Function1<? super Integer, ? extends Object> function1, o0O00O0o o0o00o0o, boolean z3, o00OO0O0.OooO0OO oooO0OO, o00OO0O0.OooO0O0 oooO0O0, Function4<? super o0O0O0O.OooO0o, ? super Integer, ? super oOO00O, ? super Integer, Unit> function4, int i2, int i3, int i4) {
            super(2);
            this.f13015Oooo0o = i;
            this.f13016Oooo0oO = o00oooo1;
            this.f13017Oooo0oo = oooOO1;
            this.f13014Oooo = z;
            this.f13020OoooO00 = f;
            this.f13019OoooO0 = z2;
            this.f13021OoooO0O = o000000o2;
            this.f13018OoooO = function1;
            this.f13022OoooOO0 = o0o00o0o;
            this.f13029o000oOoO = z3;
            this.f13023OoooOOO = oooO0OO;
            this.f13024OoooOOo = oooO0O0;
            this.f13025OoooOo0 = function4;
            this.f13026OoooOoO = i2;
            this.f13027OoooOoo = i3;
            this.f13028Ooooo00 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            Pager.OooO0O0(this.f13015Oooo0o, this.f13016Oooo0oO, this.f13017Oooo0oo, this.f13014Oooo, this.f13020OoooO00, this.f13019OoooO0, this.f13021OoooO0O, this.f13018OoooO, this.f13022OoooOO0, this.f13029o000oOoO, this.f13023OoooOOO, this.f13024OoooOOo, this.f13025OoooOo0, ooo00o, this.f13026OoooOoO | 1, this.f13027OoooOoo, this.f13028Ooooo00);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:127:0x0186  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01db  */
    /* JADX WARN: Code duplicated, block: B:153:0x01de  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:161:0x0253  */
    /* JADX WARN: Code duplicated, block: B:163:0x0257  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a2 A[LOOP:0: B:165:0x02a0->B:166:0x02a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02df  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:179:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:185:0x036a  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @ExperimentalPagerApi
    public static final void OooO00o(int i, @Nullable o00OOOO0 o00oooo1, @Nullable o0O0O0O.OooOO0 oooOO1, boolean z, float f, @Nullable o0O00O0o o0o00o0o, @Nullable o00OO0O0.OooO0OO oooO0OO, @Nullable o000000O o000000o2, @Nullable Function1<? super Integer, ? extends Object> function1, boolean z2, @NotNull Function4<? super o0O0O0O.OooO0o, ? super Integer, ? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        o0O00O0o o0o00o2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        o00OOOO0 o00oooo2;
        o0O0O0O.OooOO0 state;
        boolean z3;
        float f3;
        o00OO0O0.OooO0OO oooO0OO2;
        o000000O o000000o3;
        Function1<? super Integer, ? extends Object> function2;
        o00OOOO0 o00oooo3;
        boolean z4;
        float f4;
        boolean z5;
        Function1<? super Integer, ? extends Object> function3;
        o000000O o000000o4;
        o0O00O0o o0o00o0o2;
        o00OO0O0.OooO0OO oooO0OO3;
        o00000OO o00000ooOooO00o;
        p023Oooo00O.oo000o<Float> oo000oVar;
        o000O00O lazyListState;
        Function2<oOo000Oo, oOo0000O, Integer> function4;
        boolean zOooo0oo;
        Object objOooO0o;
        oO00o00 layoutInfo;
        Object[] objArr;
        int i20;
        boolean zOooo0oo2;
        Object objOooO0o2;
        oOO00O ooo00o2;
        o00OOOO0 o00oooo4;
        boolean z6;
        float f5;
        o0O00O0o o0o00o0o3;
        o0O0O0O.OooOO0 oooOO2;
        o00OO0O0.OooO0OO oooO0OO4;
        o000000O o000000o5;
        Function1<? super Integer, ? extends Object> function5;
        boolean z7;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-131850087);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (ooo00oOooOOo.OooO(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i21 = i4 & 2;
        if (i21 == 0) {
            if ((i2 & 112) == 0) {
                i5 |= ooo00oOooOOo.Oooo0oo(o00oooo1) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                i5 |= ((i4 & 4) == 0 || !ooo00oOooOOo.Oooo0oo(oooOO1)) ? 128 : 256;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    if (ooo00oOooOOo.OooO0OO(z)) {
                        i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    if ((i2 & 57344) == 0) {
                        f2 = f;
                        if (ooo00oOooOOo.OooO0oO(f2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 32;
                    if (i10 != 0) {
                        i5 |= 196608;
                        o0o00o2 = o0o00o0o;
                    } else {
                        o0o00o2 = o0o00o0o;
                        if ((i2 & 458752) == 0) {
                            if (ooo00oOooOOo.Oooo0oo(o0o00o2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i5 |= i11;
                        }
                    }
                    i12 = i4 & 64;
                    if (i12 != 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(oooO0OO)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i5 |= i13;
                    }
                    if ((i2 & 29360128) != 0) {
                        i5 |= ((i4 & 128) == 0 || !ooo00oOooOOo.Oooo0oo(o000000o2)) ? 4194304 : 8388608;
                    }
                    i14 = i4 & 256;
                    if (i14 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(function1)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i5 |= i15;
                    }
                    i16 = i4 & 512;
                    if (i16 != 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 1879048192) == 0) {
                        if (ooo00oOooOOo.OooO0OO(z2)) {
                            i17 = 536870912;
                        } else {
                            i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                        i5 |= i17;
                    }
                    if ((i4 & 1024) != 0) {
                        i18 = i3 | 6;
                    } else if ((i3 & 14) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(content)) {
                            i19 = 4;
                        } else {
                            i19 = 2;
                        }
                        i18 = i3 | i19;
                    } else {
                        i18 = i3;
                    }
                    if ((i5 & 1533916891) != 306783378 && (i18 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
                        ooo00oOooOOo.OooOoo0();
                        o00oooo4 = o00oooo1;
                        oooOO2 = oooOO1;
                        z6 = z;
                        oooO0OO4 = oooO0OO;
                        o000000o5 = o000000o2;
                        z7 = z2;
                        ooo00o2 = ooo00oOooOOo;
                        o0o00o0o3 = o0o00o2;
                        f5 = f2;
                        function5 = function1;
                    } else {
                        ooo00oOooOOo.OooOOo0();
                        if ((i2 & 1) != 0 || ooo00oOooOOo.Oooo000()) {
                            if (i21 != 0) {
                                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                            } else {
                                o00oooo2 = o00oooo1;
                            }
                            o00OOOO0 o00oooo5 = o00oooo2;
                            if ((i4 & 4) != 0) {
                                state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                                i5 &= -897;
                            } else {
                                state = oooOO1;
                            }
                            if (i6 != 0) {
                                z3 = false;
                            } else {
                                z3 = z;
                            }
                            if (i8 != 0) {
                                f3 = 0;
                            } else {
                                f3 = f2;
                            }
                            if (i10 != 0) {
                                float f6 = 0;
                                o0o00o2 = new o0O00O(f6, f6, f6, f6);
                            }
                            if (i12 != 0) {
                                oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                            } else {
                                oooO0OO2 = oooO0OO;
                            }
                            if ((i4 & 128) != 0) {
                                o0O0O0O.OooO0O0 oooO0O0 = o0O0O0O.OooO0O0.f35330OooO00o;
                                float fOooO0O0 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                                Intrinsics.checkNotNullParameter(state, "state");
                                ooo00oOooOOo.OooO0o0(132228799);
                                o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                                oO0OO00o oo0oo00o = oO0OO00o.f48837OooO00o;
                                oo000oVar = oO0OO00o.f48838OooO0O0;
                                Function3<oOo000Oo, Integer, Integer, Integer> snapIndex = o0O0O0O.OooO0O0.f35331OooO0O0;
                                Intrinsics.checkNotNullParameter(state, "state");
                                Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
                                ooo00oOooOOo.OooO0o0(-776119664);
                                lazyListState = state.f35353OooO00o;
                                oO00o00O oo00o00o = oO00o00O.f48832OooO00o;
                                function4 = oO00o00O.f48833OooO0O0;
                                Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                                Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
                                ooo00oOooOOo.OooO0o0(-632875458);
                                Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                                ooo00oOooOOo.OooO0o0(-1050829263);
                                ooo00oOooOOo.OooO0o0(-3686552);
                                zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                                objOooO0o = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                                    objOooO0o = new oO00o00(lazyListState, function4);
                                    ooo00oOooOOo.Oooo00o(objOooO0o);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                layoutInfo = (oO00o00) objOooO0o;
                                layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O0)));
                                ooo00oOooOOo.Oooo0o0();
                                Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                                Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
                                ooo00oOooOOo.OooO0o0(-632874525);
                                i20 = 0;
                                objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex};
                                ooo00oOooOOo.OooO0o0(-3685570);
                                zOooo0oo2 = false;
                                while (i20 < 4) {
                                    Object obj = objArr[i20];
                                    i20++;
                                    zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj);
                                }
                                objOooO0o2 = ooo00oOooOOo.OooO0o();
                                if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                                    objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                                }
                                ooo00oOooOOo.Oooo0o0();
                                o000000o3 = (oO00o0) objOooO0o2;
                                ooo00oOooOOo.Oooo0o0();
                                ooo00oOooOOo.Oooo0o0();
                                ooo00oOooOOo.Oooo0o0();
                                ooo00oOooOOo.Oooo0o0();
                                i5 &= -29360129;
                            } else {
                                o000000o3 = o000000o2;
                            }
                            if (i14 != 0) {
                                function2 = null;
                            } else {
                                function2 = function1;
                            }
                            o00oooo3 = o00oooo5;
                            z4 = z3;
                            f4 = f3;
                            if (i16 != 0) {
                                function3 = function2;
                                o000000o4 = o000000o3;
                                o0o00o0o2 = o0o00o2;
                                oooO0OO3 = oooO0OO2;
                                z5 = true;
                            } else {
                                z5 = z2;
                                function3 = function2;
                                o000000o4 = o000000o3;
                                o0o00o0o2 = o0o00o2;
                                oooO0OO3 = oooO0OO2;
                            }
                        } else {
                            ooo00oOooOOo.OooOoo0();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            o00oooo3 = o00oooo1;
                            state = oooOO1;
                            z4 = z;
                            oooO0OO3 = oooO0OO;
                            o000000o4 = o000000o2;
                            function3 = function1;
                            z5 = z2;
                            o0o00o0o2 = o0o00o2;
                            f4 = f2;
                        }
                        ooo00oOooOOo.Oooo0oO();
                        int i22 = i5 >> 3;
                        ooo00o2 = ooo00oOooOOo;
                        OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i22 & 3670016) | (i22 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                        o00oooo4 = o00oooo3;
                        z6 = z4;
                        f5 = f4;
                        o0o00o0o3 = o0o00o0o2;
                        oooOO2 = state;
                        oooO0OO4 = oooO0OO3;
                        o000000o5 = o000000o4;
                        function5 = function3;
                        z7 = z5;
                    }
                    oo0oooOooOo = ooo00o2.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooO00o(i, o00oooo4, oooOO2, z6, f5, o0o00o0o3, oooO0OO4, o000000o5, function5, z7, content, i2, i3, i4));
                }
                i5 |= 24576;
                f2 = f;
                i10 = i4 & 32;
                if (i10 != 0) {
                    i5 |= 196608;
                    o0o00o2 = o0o00o0o;
                } else {
                    o0o00o2 = o0o00o0o;
                    if ((i2 & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(o0o00o2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i5 |= i11;
                    }
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(oooO0OO)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i5 |= i13;
                }
                if ((i2 & 29360128) != 0) {
                    i5 |= ((i4 & 128) == 0 || !ooo00oOooOOo.Oooo0oo(o000000o2)) ? 4194304 : 8388608;
                }
                i14 = i4 & 256;
                if (i14 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(function1)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i5 |= i15;
                }
                i16 = i4 & 512;
                if (i16 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    if (ooo00oOooOOo.OooO0OO(z2)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i5 |= i17;
                }
                if ((i4 & 1024) != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                if ((i5 & 1533916891) != 306783378) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo6 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f7 = 0;
                            o0o00o2 = new o0O00O(f7, f7, f7, f7);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O1 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O1 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o2 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex2 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex2, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o2 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex2, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O1)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex2, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex2};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj2 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj2);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo6;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    } else {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo7 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f8 = 0;
                            o0o00o2 = new o0O00O(f8, f8, f8, f8);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O2 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O2 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o3 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex3 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex3, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o3 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex3, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O2)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex3, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex3};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj3 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj3);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo7;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    int i23 = i5 >> 3;
                    ooo00o2 = ooo00oOooOOo;
                    OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i23 & 3670016) | (i23 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                    o00oooo4 = o00oooo3;
                    z6 = z4;
                    f5 = f4;
                    o0o00o0o3 = o0o00o0o2;
                    oooOO2 = state;
                    oooO0OO4 = oooO0OO3;
                    o000000o5 = o000000o4;
                    function5 = function3;
                    z7 = z5;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo8 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f9 = 0;
                            o0o00o2 = new o0O00O(f9, f9, f9, f9);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O3 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O3 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o4 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex4 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex4, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o4 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex4, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O3)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex4, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex4};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj4 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj4);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo8;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    } else {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo9 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f10 = 0;
                            o0o00o2 = new o0O00O(f10, f10, f10, f10);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O4 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O4 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o5 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex5 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex5, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o5 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex5, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O4)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex5, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex5};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj5 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj5);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo9;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    int i24 = i5 >> 3;
                    ooo00o2 = ooo00oOooOOo;
                    OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i24 & 3670016) | (i24 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                    o00oooo4 = o00oooo3;
                    z6 = z4;
                    f5 = f4;
                    o0o00o0o3 = o0o00o0o2;
                    oooOO2 = state;
                    oooO0OO4 = oooO0OO3;
                    o000000o5 = o000000o4;
                    function5 = function3;
                    z7 = z5;
                }
                oo0oooOooOo = ooo00o2.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO00o(i, o00oooo4, oooOO2, z6, f5, o0o00o0o3, oooO0OO4, o000000o5, function5, z7, content, i2, i3, i4));
            }
            i5 |= 3072;
            i8 = i4 & 16;
            if (i8 != 0) {
                if ((i2 & 57344) == 0) {
                    f2 = f;
                    if (ooo00oOooOOo.OooO0oO(f2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    i5 |= 196608;
                    o0o00o2 = o0o00o0o;
                } else {
                    o0o00o2 = o0o00o0o;
                    if ((i2 & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(o0o00o2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i5 |= i11;
                    }
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(oooO0OO)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i5 |= i13;
                }
                if ((i2 & 29360128) != 0) {
                    i5 |= ((i4 & 128) == 0 || !ooo00oOooOOo.Oooo0oo(o000000o2)) ? 4194304 : 8388608;
                }
                i14 = i4 & 256;
                if (i14 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(function1)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i5 |= i15;
                }
                i16 = i4 & 512;
                if (i16 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    if (ooo00oOooOOo.OooO0OO(z2)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i5 |= i17;
                }
                if ((i4 & 1024) != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                if ((i5 & 1533916891) != 306783378) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo10 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f11 = 0;
                            o0o00o2 = new o0O00O(f11, f11, f11, f11);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O5 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O5 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o6 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex6 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex6, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o6 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex6, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O5)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex6, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex6};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj6 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj6);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo10;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    } else {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo11 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f12 = 0;
                            o0o00o2 = new o0O00O(f12, f12, f12, f12);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O6 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O6 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o7 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex7 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex7, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o7 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex7, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O6)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex7, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex7};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj7 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj7);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo11;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    int i25 = i5 >> 3;
                    ooo00o2 = ooo00oOooOOo;
                    OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i25 & 3670016) | (i25 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                    o00oooo4 = o00oooo3;
                    z6 = z4;
                    f5 = f4;
                    o0o00o0o3 = o0o00o0o2;
                    oooOO2 = state;
                    oooO0OO4 = oooO0OO3;
                    o000000o5 = o000000o4;
                    function5 = function3;
                    z7 = z5;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo12 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f13 = 0;
                            o0o00o2 = new o0O00O(f13, f13, f13, f13);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O7 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O7 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o8 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex8 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex8, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o8 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex8, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O7)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex8, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex8};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj8 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj8);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo12;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    } else {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo13 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f14 = 0;
                            o0o00o2 = new o0O00O(f14, f14, f14, f14);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O8 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O8 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o9 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex9 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex9, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o9 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex9, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O8)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex9, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex9};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj9 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj9);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo13;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    int i26 = i5 >> 3;
                    ooo00o2 = ooo00oOooOOo;
                    OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i26 & 3670016) | (i26 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                    o00oooo4 = o00oooo3;
                    z6 = z4;
                    f5 = f4;
                    o0o00o0o3 = o0o00o0o2;
                    oooOO2 = state;
                    oooO0OO4 = oooO0OO3;
                    o000000o5 = o000000o4;
                    function5 = function3;
                    z7 = z5;
                }
                oo0oooOooOo = ooo00o2.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO00o(i, o00oooo4, oooOO2, z6, f5, o0o00o0o3, oooO0OO4, o000000o5, function5, z7, content, i2, i3, i4));
            }
            i5 |= 24576;
            f2 = f;
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                o0o00o2 = o0o00o0o;
            } else {
                o0o00o2 = o0o00o0o;
                if ((i2 & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(o0o00o2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (ooo00oOooOOo.Oooo0oo(oooO0OO)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((i2 & 29360128) != 0) {
                i5 |= ((i4 & 128) == 0 || !ooo00oOooOOo.Oooo0oo(o000000o2)) ? 4194304 : 8388608;
            }
            i14 = i4 & 256;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (ooo00oOooOOo.Oooo0oo(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & 512;
            if (i16 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (ooo00oOooOOo.OooO0OO(z2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i17;
            }
            if ((i4 & 1024) != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 1533916891) != 306783378) {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo14 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f15 = 0;
                        o0o00o2 = new o0O00O(f15, f15, f15, f15);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O9 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O9 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o10 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex10 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex10, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o10 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex10, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O9)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex10, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex10};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj10 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj10);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo14;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                } else {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo15 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f16 = 0;
                        o0o00o2 = new o0O00O(f16, f16, f16, f16);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O10 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O10 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o11 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex11 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex11, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o11 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex11, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O10)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex11, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex11};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj11 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj11);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo15;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                int i27 = i5 >> 3;
                ooo00o2 = ooo00oOooOOo;
                OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i27 & 3670016) | (i27 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                o00oooo4 = o00oooo3;
                z6 = z4;
                f5 = f4;
                o0o00o0o3 = o0o00o0o2;
                oooOO2 = state;
                oooO0OO4 = oooO0OO3;
                o000000o5 = o000000o4;
                function5 = function3;
                z7 = z5;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo16 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f17 = 0;
                        o0o00o2 = new o0O00O(f17, f17, f17, f17);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O11 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O11 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o12 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex12 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex12, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o12 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex12, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O11)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex12, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex12};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj12 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj12);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo16;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                } else {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo17 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f18 = 0;
                        o0o00o2 = new o0O00O(f18, f18, f18, f18);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O12 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O12 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o13 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex13 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex13, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o13 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex13, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O12)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex13, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex13};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj13 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj13);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo17;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                int i28 = i5 >> 3;
                ooo00o2 = ooo00oOooOOo;
                OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i28 & 3670016) | (i28 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                o00oooo4 = o00oooo3;
                z6 = z4;
                f5 = f4;
                o0o00o0o3 = o0o00o0o2;
                oooOO2 = state;
                oooO0OO4 = oooO0OO3;
                o000000o5 = o000000o4;
                function5 = function3;
                z7 = z5;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO00o(i, o00oooo4, oooOO2, z6, f5, o0o00o0o3, oooO0OO4, o000000o5, function5, z7, content, i2, i3, i4));
        }
        i5 |= 48;
        if ((i2 & 896) != 0) {
            i5 |= ((i4 & 4) == 0 || !ooo00oOooOOo.Oooo0oo(oooOO1)) ? 128 : 256;
        }
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i2 & 7168) == 0) {
                if (ooo00oOooOOo.OooO0OO(z)) {
                    i7 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                if ((i2 & 57344) == 0) {
                    f2 = f;
                    if (ooo00oOooOOo.OooO0oO(f2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    i5 |= 196608;
                    o0o00o2 = o0o00o0o;
                } else {
                    o0o00o2 = o0o00o0o;
                    if ((i2 & 458752) == 0) {
                        if (ooo00oOooOOo.Oooo0oo(o0o00o2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i5 |= i11;
                    }
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(oooO0OO)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i5 |= i13;
                }
                if ((i2 & 29360128) != 0) {
                    i5 |= ((i4 & 128) == 0 || !ooo00oOooOOo.Oooo0oo(o000000o2)) ? 4194304 : 8388608;
                }
                i14 = i4 & 256;
                if (i14 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(function1)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i5 |= i15;
                }
                i16 = i4 & 512;
                if (i16 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    if (ooo00oOooOOo.OooO0OO(z2)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i5 |= i17;
                }
                if ((i4 & 1024) != 0) {
                    i18 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(content)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                if ((i5 & 1533916891) != 306783378) {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo18 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f19 = 0;
                            o0o00o2 = new o0O00O(f19, f19, f19, f19);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O13 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O13 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o14 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex14 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex14, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o14 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex14, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O13)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex14, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex14};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj14 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj14);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo18;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    } else {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo19 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f110 = 0;
                            o0o00o2 = new o0O00O(f110, f110, f110, f110);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O14 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O14 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o15 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex15 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex15, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o15 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex15, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O14)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex15, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex15};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj15 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj15);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo19;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    int i29 = i5 >> 3;
                    ooo00o2 = ooo00oOooOOo;
                    OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i29 & 3670016) | (i29 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                    o00oooo4 = o00oooo3;
                    z6 = z4;
                    f5 = f4;
                    o0o00o0o3 = o0o00o0o2;
                    oooOO2 = state;
                    oooO0OO4 = oooO0OO3;
                    o000000o5 = o000000o4;
                    function5 = function3;
                    z7 = z5;
                } else {
                    ooo00oOooOOo.OooOOo0();
                    if ((i2 & 1) != 0) {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo110 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f111 = 0;
                            o0o00o2 = new o0O00O(f111, f111, f111, f111);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O15 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O15 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o16 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex16 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex16, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o16 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex16, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O15)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex16, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex16};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj16 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj16);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo110;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    } else {
                        if (i21 != 0) {
                            o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                        } else {
                            o00oooo2 = o00oooo1;
                        }
                        o00OOOO0 o00oooo111 = o00oooo2;
                        if ((i4 & 4) != 0) {
                            state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                            i5 &= -897;
                        } else {
                            state = oooOO1;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i8 != 0) {
                            f3 = 0;
                        } else {
                            f3 = f2;
                        }
                        if (i10 != 0) {
                            float f112 = 0;
                            o0o00o2 = new o0O00O(f112, f112, f112, f112);
                        }
                        if (i12 != 0) {
                            oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                        } else {
                            oooO0OO2 = oooO0OO;
                        }
                        if ((i4 & 128) != 0) {
                            o0O0O0O.OooO0O0 oooO0O16 = o0O0O0O.OooO0O0.f35330OooO00o;
                            float fOooO0O16 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                            Intrinsics.checkNotNullParameter(state, "state");
                            ooo00oOooOOo.OooO0o0(132228799);
                            o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                            oO0OO00o oo0oo00o17 = oO0OO00o.f48837OooO00o;
                            oo000oVar = oO0OO00o.f48838OooO0O0;
                            Function3<oOo000Oo, Integer, Integer, Integer> snapIndex17 = o0O0O0O.OooO0O0.f35331OooO0O0;
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(snapIndex17, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-776119664);
                            lazyListState = state.f35353OooO00o;
                            oO00o00O oo00o00o17 = oO00o00O.f48832OooO00o;
                            function4 = oO00o00O.f48833OooO0O0;
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            Intrinsics.checkNotNullParameter(snapIndex17, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632875458);
                            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                            ooo00oOooOOo.OooO0o0(-1050829263);
                            ooo00oOooOOo.OooO0o0(-3686552);
                            zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                            objOooO0o = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo) {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            } else {
                                objOooO0o = new oO00o00(lazyListState, function4);
                                ooo00oOooOOo.Oooo00o(objOooO0o);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            layoutInfo = (oO00o00) objOooO0o;
                            layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O16)));
                            ooo00oOooOOo.Oooo0o0();
                            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                            Intrinsics.checkNotNullParameter(snapIndex17, "snapIndex");
                            ooo00oOooOOo.OooO0o0(-632874525);
                            i20 = 0;
                            objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex17};
                            ooo00oOooOOo.OooO0o0(-3685570);
                            zOooo0oo2 = false;
                            while (i20 < 4) {
                                Object obj17 = objArr[i20];
                                i20++;
                                zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj17);
                            }
                            objOooO0o2 = ooo00oOooOOo.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            } else {
                                objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                                ooo00oOooOOo.Oooo00o(objOooO0o2);
                            }
                            ooo00oOooOOo.Oooo0o0();
                            o000000o3 = (oO00o0) objOooO0o2;
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            ooo00oOooOOo.Oooo0o0();
                            i5 &= -29360129;
                        } else {
                            o000000o3 = o000000o2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        o00oooo3 = o00oooo111;
                        z4 = z3;
                        f4 = f3;
                        if (i16 != 0) {
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                            z5 = true;
                        } else {
                            z5 = z2;
                            function3 = function2;
                            o000000o4 = o000000o3;
                            o0o00o0o2 = o0o00o2;
                            oooO0OO3 = oooO0OO2;
                        }
                    }
                    ooo00oOooOOo.Oooo0oO();
                    int i210 = i5 >> 3;
                    ooo00o2 = ooo00oOooOOo;
                    OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i210 & 3670016) | (i210 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                    o00oooo4 = o00oooo3;
                    z6 = z4;
                    f5 = f4;
                    o0o00o0o3 = o0o00o0o2;
                    oooOO2 = state;
                    oooO0OO4 = oooO0OO3;
                    o000000o5 = o000000o4;
                    function5 = function3;
                    z7 = z5;
                }
                oo0oooOooOo = ooo00o2.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO00o(i, o00oooo4, oooOO2, z6, f5, o0o00o0o3, oooO0OO4, o000000o5, function5, z7, content, i2, i3, i4));
            }
            i5 |= 24576;
            f2 = f;
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                o0o00o2 = o0o00o0o;
            } else {
                o0o00o2 = o0o00o0o;
                if ((i2 & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(o0o00o2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (ooo00oOooOOo.Oooo0oo(oooO0OO)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((i2 & 29360128) != 0) {
                i5 |= ((i4 & 128) == 0 || !ooo00oOooOOo.Oooo0oo(o000000o2)) ? 4194304 : 8388608;
            }
            i14 = i4 & 256;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (ooo00oOooOOo.Oooo0oo(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & 512;
            if (i16 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (ooo00oOooOOo.OooO0OO(z2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i17;
            }
            if ((i4 & 1024) != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 1533916891) != 306783378) {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo112 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f113 = 0;
                        o0o00o2 = new o0O00O(f113, f113, f113, f113);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O17 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O17 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o18 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex18 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex18, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o18 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex18, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O17)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex18, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex18};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj18 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj18);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo112;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                } else {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo113 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f114 = 0;
                        o0o00o2 = new o0O00O(f114, f114, f114, f114);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O18 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O18 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o19 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex19 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex19, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o19 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex19, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O18)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex19, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex19};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj19 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj19);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo113;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                int i211 = i5 >> 3;
                ooo00o2 = ooo00oOooOOo;
                OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i211 & 3670016) | (i211 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                o00oooo4 = o00oooo3;
                z6 = z4;
                f5 = f4;
                o0o00o0o3 = o0o00o0o2;
                oooOO2 = state;
                oooO0OO4 = oooO0OO3;
                o000000o5 = o000000o4;
                function5 = function3;
                z7 = z5;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo114 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f115 = 0;
                        o0o00o2 = new o0O00O(f115, f115, f115, f115);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O19 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O19 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o110 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex110 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex110, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o110 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex110, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O19)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex110, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex110};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj110 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj110);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo114;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                } else {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo115 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f116 = 0;
                        o0o00o2 = new o0O00O(f116, f116, f116, f116);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O110 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O110 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o111 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex111 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex111, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o111 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex111, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O110)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex111, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex111};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj111 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj111);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo115;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                int i212 = i5 >> 3;
                ooo00o2 = ooo00oOooOOo;
                OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i212 & 3670016) | (i212 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                o00oooo4 = o00oooo3;
                z6 = z4;
                f5 = f4;
                o0o00o0o3 = o0o00o0o2;
                oooOO2 = state;
                oooO0OO4 = oooO0OO3;
                o000000o5 = o000000o4;
                function5 = function3;
                z7 = z5;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO00o(i, o00oooo4, oooOO2, z6, f5, o0o00o0o3, oooO0OO4, o000000o5, function5, z7, content, i2, i3, i4));
        }
        i5 |= 3072;
        i8 = i4 & 16;
        if (i8 != 0) {
            if ((i2 & 57344) == 0) {
                f2 = f;
                if (ooo00oOooOOo.OooO0oO(f2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                o0o00o2 = o0o00o0o;
            } else {
                o0o00o2 = o0o00o0o;
                if ((i2 & 458752) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(o0o00o2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (ooo00oOooOOo.Oooo0oo(oooO0OO)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((i2 & 29360128) != 0) {
                i5 |= ((i4 & 128) == 0 || !ooo00oOooOOo.Oooo0oo(o000000o2)) ? 4194304 : 8388608;
            }
            i14 = i4 & 256;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (ooo00oOooOOo.Oooo0oo(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & 512;
            if (i16 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (ooo00oOooOOo.OooO0OO(z2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i17;
            }
            if ((i4 & 1024) != 0) {
                i18 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (ooo00oOooOOo.Oooo0oo(content)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 1533916891) != 306783378) {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo116 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f117 = 0;
                        o0o00o2 = new o0O00O(f117, f117, f117, f117);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O111 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O111 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o112 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex112 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex112, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o112 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex112, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O111)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex112, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex112};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj112 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj112);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo116;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                } else {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo117 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f118 = 0;
                        o0o00o2 = new o0O00O(f118, f118, f118, f118);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O112 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O112 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o113 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex113 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex113, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o113 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex113, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O112)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex113, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex113};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj113 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj113);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo117;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                int i213 = i5 >> 3;
                ooo00o2 = ooo00oOooOOo;
                OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i213 & 3670016) | (i213 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                o00oooo4 = o00oooo3;
                z6 = z4;
                f5 = f4;
                o0o00o0o3 = o0o00o0o2;
                oooOO2 = state;
                oooO0OO4 = oooO0OO3;
                o000000o5 = o000000o4;
                function5 = function3;
                z7 = z5;
            } else {
                ooo00oOooOOo.OooOOo0();
                if ((i2 & 1) != 0) {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo118 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f119 = 0;
                        o0o00o2 = new o0O00O(f119, f119, f119, f119);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O113 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O113 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o114 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex114 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex114, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o114 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex114, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O113)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex114, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex114};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj114 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj114);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo118;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                } else {
                    if (i21 != 0) {
                        o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo2 = o00oooo1;
                    }
                    o00OOOO0 o00oooo119 = o00oooo2;
                    if ((i4 & 4) != 0) {
                        state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                        i5 &= -897;
                    } else {
                        state = oooOO1;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i8 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    if (i10 != 0) {
                        float f1110 = 0;
                        o0o00o2 = new o0O00O(f1110, f1110, f1110, f1110);
                    }
                    if (i12 != 0) {
                        oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                    } else {
                        oooO0OO2 = oooO0OO;
                    }
                    if ((i4 & 128) != 0) {
                        o0O0O0O.OooO0O0 oooO0O114 = o0O0O0O.OooO0O0.f35330OooO00o;
                        float fOooO0O114 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                        Intrinsics.checkNotNullParameter(state, "state");
                        ooo00oOooOOo.OooO0o0(132228799);
                        o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                        oO0OO00o oo0oo00o115 = oO0OO00o.f48837OooO00o;
                        oo000oVar = oO0OO00o.f48838OooO0O0;
                        Function3<oOo000Oo, Integer, Integer, Integer> snapIndex115 = o0O0O0O.OooO0O0.f35331OooO0O0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(snapIndex115, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-776119664);
                        lazyListState = state.f35353OooO00o;
                        oO00o00O oo00o00o115 = oO00o00O.f48832OooO00o;
                        function4 = oO00o00O.f48833OooO0O0;
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        Intrinsics.checkNotNullParameter(snapIndex115, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632875458);
                        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                        ooo00oOooOOo.OooO0o0(-1050829263);
                        ooo00oOooOOo.OooO0o0(-3686552);
                        zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                        objOooO0o = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        } else {
                            objOooO0o = new oO00o00(lazyListState, function4);
                            ooo00oOooOOo.Oooo00o(objOooO0o);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        layoutInfo = (oO00o00) objOooO0o;
                        layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O114)));
                        ooo00oOooOOo.Oooo0o0();
                        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                        Intrinsics.checkNotNullParameter(snapIndex115, "snapIndex");
                        ooo00oOooOOo.OooO0o0(-632874525);
                        i20 = 0;
                        objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex115};
                        ooo00oOooOOo.OooO0o0(-3685570);
                        zOooo0oo2 = false;
                        while (i20 < 4) {
                            Object obj115 = objArr[i20];
                            i20++;
                            zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj115);
                        }
                        objOooO0o2 = ooo00oOooOOo.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                            ooo00oOooOOo.Oooo00o(objOooO0o2);
                        }
                        ooo00oOooOOo.Oooo0o0();
                        o000000o3 = (oO00o0) objOooO0o2;
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        ooo00oOooOOo.Oooo0o0();
                        i5 &= -29360129;
                    } else {
                        o000000o3 = o000000o2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    o00oooo3 = o00oooo119;
                    z4 = z3;
                    f4 = f3;
                    if (i16 != 0) {
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                        z5 = true;
                    } else {
                        z5 = z2;
                        function3 = function2;
                        o000000o4 = o000000o3;
                        o0o00o0o2 = o0o00o2;
                        oooO0OO3 = oooO0OO2;
                    }
                }
                ooo00oOooOOo.Oooo0oO();
                int i214 = i5 >> 3;
                ooo00o2 = ooo00oOooOOo;
                OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i214 & 3670016) | (i214 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
                o00oooo4 = o00oooo3;
                z6 = z4;
                f5 = f4;
                o0o00o0o3 = o0o00o0o2;
                oooOO2 = state;
                oooO0OO4 = oooO0OO3;
                o000000o5 = o000000o4;
                function5 = function3;
                z7 = z5;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO00o(i, o00oooo4, oooOO2, z6, f5, o0o00o0o3, oooO0OO4, o000000o5, function5, z7, content, i2, i3, i4));
        }
        i5 |= 24576;
        f2 = f;
        i10 = i4 & 32;
        if (i10 != 0) {
            i5 |= 196608;
            o0o00o2 = o0o00o0o;
        } else {
            o0o00o2 = o0o00o0o;
            if ((i2 & 458752) == 0) {
                if (ooo00oOooOOo.Oooo0oo(o0o00o2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i5 |= i11;
            }
        }
        i12 = i4 & 64;
        if (i12 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (ooo00oOooOOo.Oooo0oo(oooO0OO)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((i2 & 29360128) != 0) {
            i5 |= ((i4 & 128) == 0 || !ooo00oOooOOo.Oooo0oo(o000000o2)) ? 4194304 : 8388608;
        }
        i14 = i4 & 256;
        if (i14 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (ooo00oOooOOo.Oooo0oo(function1)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i5 |= i15;
        }
        i16 = i4 & 512;
        if (i16 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 1879048192) == 0) {
            if (ooo00oOooOOo.OooO0OO(z2)) {
                i17 = 536870912;
            } else {
                i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i5 |= i17;
        }
        if ((i4 & 1024) != 0) {
            i18 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (ooo00oOooOOo.Oooo0oo(content)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i3 | i19;
        } else {
            i18 = i3;
        }
        if ((i5 & 1533916891) != 306783378) {
            ooo00oOooOOo.OooOOo0();
            if ((i2 & 1) != 0) {
                if (i21 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                o00OOOO0 o00oooo1110 = o00oooo2;
                if ((i4 & 4) != 0) {
                    state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                    i5 &= -897;
                } else {
                    state = oooOO1;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i8 != 0) {
                    f3 = 0;
                } else {
                    f3 = f2;
                }
                if (i10 != 0) {
                    float f1111 = 0;
                    o0o00o2 = new o0O00O(f1111, f1111, f1111, f1111);
                }
                if (i12 != 0) {
                    oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                } else {
                    oooO0OO2 = oooO0OO;
                }
                if ((i4 & 128) != 0) {
                    o0O0O0O.OooO0O0 oooO0O115 = o0O0O0O.OooO0O0.f35330OooO00o;
                    float fOooO0O115 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                    Intrinsics.checkNotNullParameter(state, "state");
                    ooo00oOooOOo.OooO0o0(132228799);
                    o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                    oO0OO00o oo0oo00o116 = oO0OO00o.f48837OooO00o;
                    oo000oVar = oO0OO00o.f48838OooO0O0;
                    Function3<oOo000Oo, Integer, Integer, Integer> snapIndex116 = o0O0O0O.OooO0O0.f35331OooO0O0;
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(snapIndex116, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-776119664);
                    lazyListState = state.f35353OooO00o;
                    oO00o00O oo00o00o116 = oO00o00O.f48832OooO00o;
                    function4 = oO00o00O.f48833OooO0O0;
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    Intrinsics.checkNotNullParameter(snapIndex116, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-632875458);
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    ooo00oOooOOo.OooO0o0(-1050829263);
                    ooo00oOooOOo.OooO0o0(-3686552);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new oO00o00(lazyListState, function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oO00o00(lazyListState, function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    layoutInfo = (oO00o00) objOooO0o;
                    layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O115)));
                    ooo00oOooOOo.Oooo0o0();
                    Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                    Intrinsics.checkNotNullParameter(snapIndex116, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-632874525);
                    i20 = 0;
                    objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex116};
                    ooo00oOooOOo.OooO0o0(-3685570);
                    zOooo0oo2 = false;
                    while (i20 < 4) {
                        Object obj116 = objArr[i20];
                        i20++;
                        zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj116);
                    }
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o000000o3 = (oO00o0) objOooO0o2;
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    i5 &= -29360129;
                } else {
                    o000000o3 = o000000o2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                o00oooo3 = o00oooo1110;
                z4 = z3;
                f4 = f3;
                if (i16 != 0) {
                    function3 = function2;
                    o000000o4 = o000000o3;
                    o0o00o0o2 = o0o00o2;
                    oooO0OO3 = oooO0OO2;
                    z5 = true;
                } else {
                    z5 = z2;
                    function3 = function2;
                    o000000o4 = o000000o3;
                    o0o00o0o2 = o0o00o2;
                    oooO0OO3 = oooO0OO2;
                }
            } else {
                if (i21 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                o00OOOO0 o00oooo1111 = o00oooo2;
                if ((i4 & 4) != 0) {
                    state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                    i5 &= -897;
                } else {
                    state = oooOO1;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i8 != 0) {
                    f3 = 0;
                } else {
                    f3 = f2;
                }
                if (i10 != 0) {
                    float f1112 = 0;
                    o0o00o2 = new o0O00O(f1112, f1112, f1112, f1112);
                }
                if (i12 != 0) {
                    oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                } else {
                    oooO0OO2 = oooO0OO;
                }
                if ((i4 & 128) != 0) {
                    o0O0O0O.OooO0O0 oooO0O116 = o0O0O0O.OooO0O0.f35330OooO00o;
                    float fOooO0O116 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                    Intrinsics.checkNotNullParameter(state, "state");
                    ooo00oOooOOo.OooO0o0(132228799);
                    o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                    oO0OO00o oo0oo00o117 = oO0OO00o.f48837OooO00o;
                    oo000oVar = oO0OO00o.f48838OooO0O0;
                    Function3<oOo000Oo, Integer, Integer, Integer> snapIndex117 = o0O0O0O.OooO0O0.f35331OooO0O0;
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(snapIndex117, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-776119664);
                    lazyListState = state.f35353OooO00o;
                    oO00o00O oo00o00o117 = oO00o00O.f48832OooO00o;
                    function4 = oO00o00O.f48833OooO0O0;
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    Intrinsics.checkNotNullParameter(snapIndex117, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-632875458);
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    ooo00oOooOOo.OooO0o0(-1050829263);
                    ooo00oOooOOo.OooO0o0(-3686552);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new oO00o00(lazyListState, function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oO00o00(lazyListState, function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    layoutInfo = (oO00o00) objOooO0o;
                    layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O116)));
                    ooo00oOooOOo.Oooo0o0();
                    Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                    Intrinsics.checkNotNullParameter(snapIndex117, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-632874525);
                    i20 = 0;
                    objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex117};
                    ooo00oOooOOo.OooO0o0(-3685570);
                    zOooo0oo2 = false;
                    while (i20 < 4) {
                        Object obj117 = objArr[i20];
                        i20++;
                        zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj117);
                    }
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o000000o3 = (oO00o0) objOooO0o2;
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    i5 &= -29360129;
                } else {
                    o000000o3 = o000000o2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                o00oooo3 = o00oooo1111;
                z4 = z3;
                f4 = f3;
                if (i16 != 0) {
                    function3 = function2;
                    o000000o4 = o000000o3;
                    o0o00o0o2 = o0o00o2;
                    oooO0OO3 = oooO0OO2;
                    z5 = true;
                } else {
                    z5 = z2;
                    function3 = function2;
                    o000000o4 = o000000o3;
                    o0o00o0o2 = o0o00o2;
                    oooO0OO3 = oooO0OO2;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            int i215 = i5 >> 3;
            ooo00o2 = ooo00oOooOOo;
            OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i215 & 3670016) | (i215 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
            o00oooo4 = o00oooo3;
            z6 = z4;
            f5 = f4;
            o0o00o0o3 = o0o00o0o2;
            oooOO2 = state;
            oooO0OO4 = oooO0OO3;
            o000000o5 = o000000o4;
            function5 = function3;
            z7 = z5;
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i2 & 1) != 0) {
                if (i21 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                o00OOOO0 o00oooo1112 = o00oooo2;
                if ((i4 & 4) != 0) {
                    state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                    i5 &= -897;
                } else {
                    state = oooOO1;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i8 != 0) {
                    f3 = 0;
                } else {
                    f3 = f2;
                }
                if (i10 != 0) {
                    float f1113 = 0;
                    o0o00o2 = new o0O00O(f1113, f1113, f1113, f1113);
                }
                if (i12 != 0) {
                    oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                } else {
                    oooO0OO2 = oooO0OO;
                }
                if ((i4 & 128) != 0) {
                    o0O0O0O.OooO0O0 oooO0O117 = o0O0O0O.OooO0O0.f35330OooO00o;
                    float fOooO0O117 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                    Intrinsics.checkNotNullParameter(state, "state");
                    ooo00oOooOOo.OooO0o0(132228799);
                    o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                    oO0OO00o oo0oo00o118 = oO0OO00o.f48837OooO00o;
                    oo000oVar = oO0OO00o.f48838OooO0O0;
                    Function3<oOo000Oo, Integer, Integer, Integer> snapIndex118 = o0O0O0O.OooO0O0.f35331OooO0O0;
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(snapIndex118, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-776119664);
                    lazyListState = state.f35353OooO00o;
                    oO00o00O oo00o00o118 = oO00o00O.f48832OooO00o;
                    function4 = oO00o00O.f48833OooO0O0;
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    Intrinsics.checkNotNullParameter(snapIndex118, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-632875458);
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    ooo00oOooOOo.OooO0o0(-1050829263);
                    ooo00oOooOOo.OooO0o0(-3686552);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new oO00o00(lazyListState, function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oO00o00(lazyListState, function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    layoutInfo = (oO00o00) objOooO0o;
                    layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O117)));
                    ooo00oOooOOo.Oooo0o0();
                    Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                    Intrinsics.checkNotNullParameter(snapIndex118, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-632874525);
                    i20 = 0;
                    objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex118};
                    ooo00oOooOOo.OooO0o0(-3685570);
                    zOooo0oo2 = false;
                    while (i20 < 4) {
                        Object obj118 = objArr[i20];
                        i20++;
                        zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj118);
                    }
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o000000o3 = (oO00o0) objOooO0o2;
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    i5 &= -29360129;
                } else {
                    o000000o3 = o000000o2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                o00oooo3 = o00oooo1112;
                z4 = z3;
                f4 = f3;
                if (i16 != 0) {
                    function3 = function2;
                    o000000o4 = o000000o3;
                    o0o00o0o2 = o0o00o2;
                    oooO0OO3 = oooO0OO2;
                    z5 = true;
                } else {
                    z5 = z2;
                    function3 = function2;
                    o000000o4 = o000000o3;
                    o0o00o0o2 = o0o00o2;
                    oooO0OO3 = oooO0OO2;
                }
            } else {
                if (i21 != 0) {
                    o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo2 = o00oooo1;
                }
                o00OOOO0 o00oooo1113 = o00oooo2;
                if ((i4 & 4) != 0) {
                    state = o0O0O0O.OooOOO0.OooO00o(0, ooo00oOooOOo, 1);
                    i5 &= -897;
                } else {
                    state = oooOO1;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i8 != 0) {
                    f3 = 0;
                } else {
                    f3 = f2;
                }
                if (i10 != 0) {
                    float f1114 = 0;
                    o0o00o2 = new o0O00O(f1114, f1114, f1114, f1114);
                }
                if (i12 != 0) {
                    oooO0OO2 = o00OO0O0.OooO00o.f4181OooOO0o;
                } else {
                    oooO0OO2 = oooO0OO;
                }
                if ((i4 & 128) != 0) {
                    o0O0O0O.OooO0O0 oooO0O118 = o0O0O0O.OooO0O0.f35330OooO00o;
                    float fOooO0O118 = PaddingKt.OooO0O0(o0o00o2, LayoutDirection.Ltr);
                    Intrinsics.checkNotNullParameter(state, "state");
                    ooo00oOooOOo.OooO0o0(132228799);
                    o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00oOooOOo);
                    oO0OO00o oo0oo00o119 = oO0OO00o.f48837OooO00o;
                    oo000oVar = oO0OO00o.f48838OooO0O0;
                    Function3<oOo000Oo, Integer, Integer, Integer> snapIndex119 = o0O0O0O.OooO0O0.f35331OooO0O0;
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(snapIndex119, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-776119664);
                    lazyListState = state.f35353OooO00o;
                    oO00o00O oo00o00o119 = oO00o00O.f48832OooO00o;
                    function4 = oO00o00O.f48833OooO0O0;
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    Intrinsics.checkNotNullParameter(snapIndex119, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-632875458);
                    Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
                    ooo00oOooOOo.OooO0o0(-1050829263);
                    ooo00oOooOOo.OooO0o0(-3686552);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(lazyListState) | ooo00oOooOOo.Oooo0oo(function4);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o = new oO00o00(lazyListState, function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    } else {
                        objOooO0o = new oO00o00(lazyListState, function4);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    layoutInfo = (oO00o00) objOooO0o;
                    layoutInfo.f48828OooO0OO.setValue(Integer.valueOf(((o0000O0O.OooO) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0)).OoooooO(fOooO0O118)));
                    ooo00oOooOOo.Oooo0o0();
                    Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
                    Intrinsics.checkNotNullParameter(snapIndex119, "snapIndex");
                    ooo00oOooOOo.OooO0o0(-632874525);
                    i20 = 0;
                    objArr = new Object[]{layoutInfo, o00000ooOooO00o, oo000oVar, snapIndex119};
                    ooo00oOooOOo.OooO0o0(-3685570);
                    zOooo0oo2 = false;
                    while (i20 < 4) {
                        Object obj119 = objArr[i20];
                        i20++;
                        zOooo0oo2 |= ooo00oOooOOo.Oooo0oo(obj119);
                    }
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new oO00o0(layoutInfo, o00000ooOooO00o, oo000oVar);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o000000o3 = (oO00o0) objOooO0o2;
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    ooo00oOooOOo.Oooo0o0();
                    i5 &= -29360129;
                } else {
                    o000000o3 = o000000o2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                o00oooo3 = o00oooo1113;
                z4 = z3;
                f4 = f3;
                if (i16 != 0) {
                    function3 = function2;
                    o000000o4 = o000000o3;
                    o0o00o0o2 = o0o00o2;
                    oooO0OO3 = oooO0OO2;
                    z5 = true;
                } else {
                    z5 = z2;
                    function3 = function2;
                    o000000o4 = o000000o3;
                    o0o00o0o2 = o0o00o2;
                    oooO0OO3 = oooO0OO2;
                }
            }
            ooo00oOooOOo.Oooo0oO();
            int i216 = i5 >> 3;
            ooo00o2 = ooo00oOooOOo;
            OooO0O0(i, o00oooo3, state, z4, f4, false, o000000o4, function3, o0o00o0o2, z5, oooO0OO3, null, content, ooo00o2, (i5 & 14) | 196608 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i216 & 3670016) | (i216 & 29360128) | ((i5 << 9) & 234881024) | (i5 & 1879048192), ((i5 >> 18) & 14) | ((i18 << 6) & 896), RecyclerView.oo0o0Oo.FLAG_MOVED);
            o00oooo4 = o00oooo3;
            z6 = z4;
            f5 = f4;
            o0o00o0o3 = o0o00o0o2;
            oooOO2 = state;
            oooO0OO4 = oooO0OO3;
            o000000o5 = o000000o4;
            function5 = function3;
            z7 = z5;
        }
        oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i, o00oooo4, oooOO2, z6, f5, o0o00o0o3, oooO0OO4, o000000o5, function5, z7, content, i2, i3, i4));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
          (r10v2 ?? I:java.lang.Object) from 0x0475: INVOKE (r13v1 ?? I:o000oOoO.oOO00O), (r10v2 ?? I:java.lang.Object) INTERFACE call: o000oOoO.oOO00O.Oooo00o(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:92)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @com.google.accompanist.pager.ExperimentalPagerApi
    public static final void OooO0O0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 ??, still in use, count: 1, list:
          (r10v2 ?? I:java.lang.Object) from 0x0475: INVOKE (r13v1 ?? I:o000oOoO.oOO00O), (r10v2 ?? I:java.lang.Object) INTERFACE call: o000oOoO.oOO00O.Oooo00o(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:92)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
}
