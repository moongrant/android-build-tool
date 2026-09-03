package p032OoooO0;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import o00000O.o0OOO0o;
import o0000O0O.OooOo;
import o0000O0O.o000oOoO;
import o00O0O.OooOO0O;
import o0O0O00.OooOOOO;
import o0O0O00.OooOo00;
import o0O0O00.Oooo0;
import o0O0O00.Oooo000;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o00000O;
import p034OoooO0O.o00000O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oo0oO0;
import p418o0Oo0oo.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 implements oo0oO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f3120Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0O000O f3121Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o00000O0 f3122Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o00O00OO f3123Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public o00OOOO0 f3124OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f3125OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public o00OOOO0 f3126OoooO0O;

    public static final class OooO implements o00O00OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f3127OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f3128OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f3130OooO0Oo;

        public OooO(o00000O0 o00000o1) {
            this.f3130OooO0Oo = o00000o1;
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            long j = o00O0O.OooO.f30392OooO0OO;
            this.f3127OooO00o = j;
            this.f3128OooO0O0 = j;
        }

        @Override // p032OoooO0.o00O00OO
        public final void OooO00o(long j) {
            o00O000 o00o001 = o00O000.this;
            Oooo000 oooo000 = o00o001.f3121Oooo0o.f3343OooO0o0;
            if (oooo000 != null) {
                o00000O0 o00000o1 = this.f3130OooO0Oo;
                if (!oooo000.OooOoO()) {
                    return;
                }
                if (o00O000.OooO0OO(o00o001, j, j)) {
                    long j2 = o00o001.f3121Oooo0o.f3339OooO0O0;
                    o00000o1.OooO();
                } else {
                    o00000o1.OooOO0();
                }
                this.f3127OooO00o = j;
            }
            if (o00000O.OooO00o(this.f3130OooO0Oo, o00O000.this.f3121Oooo0o.f3339OooO0O0)) {
                o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
                this.f3128OooO0O0 = o00O0O.OooO.f30392OooO0OO;
            }
        }

        @Override // p032OoooO0.o00O00OO
        public final void OooO0O0() {
        }

        @Override // p032OoooO0.o00O00OO
        public final void OooO0OO() {
        }

        @Override // p032OoooO0.o00O00OO
        public final void OooO0Oo(long j) {
            o00O000 o00o001 = o00O000.this;
            Oooo000 oooo000 = o00o001.f3121Oooo0o.f3343OooO0o0;
            if (oooo000 != null) {
                o00000O0 o00000o1 = this.f3130OooO0Oo;
                if (oooo000.OooOoO() && o00000O.OooO00o(o00000o1, o00o001.f3121Oooo0o.f3339OooO0O0)) {
                    long jOooO0oO = o00O0O.OooO.OooO0oO(this.f3128OooO0O0, j);
                    this.f3128OooO0O0 = jOooO0oO;
                    long jOooO0oO2 = o00O0O.OooO.OooO0oO(this.f3127OooO00o, jOooO0oO);
                    if (o00O000.OooO0OO(o00o001, this.f3127OooO00o, jOooO0oO2) || !o00000o1.OooO0o0()) {
                        return;
                    }
                    this.f3127OooO00o = jOooO0oO2;
                    o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
                    this.f3128OooO0O0 = o00O0O.OooO.f30392OooO0OO;
                }
            }
        }

        @Override // p032OoooO0.o00O00OO
        public final void onCancel() {
            if (o00000O.OooO00o(this.f3130OooO0Oo, o00O000.this.f3121Oooo0o.f3339OooO0O0)) {
                this.f3130OooO0Oo.OooO0o();
            }
        }

        @Override // p032OoooO0.o00O00OO
        public final void onStop() {
            if (o00000O.OooO00o(this.f3130OooO0Oo, o00O000.this.f3121Oooo0o.f3339OooO0O0)) {
                this.f3130OooO0Oo.OooO0o();
            }
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Oooo000, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Oooo000 oooo000) {
            o00O000 o00o001;
            o00000O0 o00000o1;
            Oooo000 it = oooo000;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O000 o00o002 = o00O000.this;
            o0O000O o0o000o = o00o002.f3121Oooo0o;
            o0o000o.f3343OooO0o0 = it;
            if (o00000O.OooO00o(o00o002.f3122Oooo0oO, o0o000o.f3339OooO0O0)) {
                long jOooO0o = Oooo0.OooO0o(it);
                if (!o00O0O.OooO.OooO00o(jOooO0o, o00O000.this.f3121Oooo0o.f3344OooO0oO) && (o00000o1 = (o00o001 = o00O000.this).f3122Oooo0oO) != null) {
                    long j = o00o001.f3121Oooo0o.f3339OooO0O0;
                    o00000o1.OooO0OO();
                }
                o00O000.this.f3121Oooo0o.f3344OooO0oO = jOooO0o;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements o000000 {

        public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ List<Pair<o000O000, OooOo>> f3133Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(List<? extends Pair<? extends o000O000, OooOo>> list) {
                super(1);
                this.f3133Oooo0o = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o000O000.OooO00o oooO00o) {
                o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<Pair<o000O000, OooOo>> list = this.f3133Oooo0o;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Pair<o000O000, OooOo> pair = list.get(i);
                    layout.OooO0o0(pair.component1(), pair.component2().f27312OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                return Unit.INSTANCE;
            }
        }

        public OooO0O0() {
        }

        @Override // o0O0O00.o000000
        @NotNull
        public final o000000O OooO00o(@NotNull o0O0O00.o00000O0 measure, @NotNull List<? extends o0O0O00> measurables, long j) {
            o00000O0 o00000o1;
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            o0O000O o0o000o = o00O000.this.f3121Oooo0o;
            o0OOO0o o0ooo0o2 = o0o000o.f3342OooO0o;
            o0OOO0o o0ooo0oOooO0OO = o0o000o.f3338OooO00o.OooO0OO(j, measure.getLayoutDirection(), o0ooo0o2);
            if (!Intrinsics.areEqual(o0ooo0o2, o0ooo0oOooO0OO)) {
                o00O000.this.f3121Oooo0o.f3340OooO0OO.invoke(o0ooo0oOooO0OO);
                if (o0ooo0o2 != null) {
                    o00O000 o00o001 = o00O000.this;
                    if (!Intrinsics.areEqual(o0ooo0o2.f26877OooO00o.f26885OooO00o, o0ooo0oOooO0OO.f26877OooO00o.f26885OooO00o) && (o00000o1 = o00o001.f3122Oooo0oO) != null) {
                        long j2 = o00o001.f3121Oooo0o.f3339OooO0O0;
                        o00000o1.OooO0oO();
                    }
                }
            }
            o0O000O o0o000o2 = o00O000.this.f3121Oooo0o;
            Objects.requireNonNull(o0o000o2);
            o0o000o2.f3345OooO0oo.setValue(Unit.INSTANCE);
            o0o000o2.f3342OooO0o = o0ooo0oOooO0OO;
            if (!(measurables.size() >= o0ooo0oOooO0OO.f26881OooO0o.size())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            List<OooOO0O> list = o0ooo0oOooO0OO.f26881OooO0o;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                OooOO0O oooOO0O = list.get(i);
                Pair pair = oooOO0O != null ? new Pair(measurables.get(i).Oooo000(o0000O0O.OooO0OO.OooO0O0((int) Math.floor(oooOO0O.f30406OooO0OO - oooOO0O.f30404OooO00o), (int) Math.floor(oooOO0O.f30407OooO0Oo - oooOO0O.f30405OooO0O0), 5)), new OooOo(o0000O0O.Oooo000.OooO00o(MathKt.roundToInt(oooOO0O.f30404OooO00o), MathKt.roundToInt(oooOO0O.f30405OooO0O0)))) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            long j3 = o0ooo0oOooO0OO.f26879OooO0OO;
            return measure.OooOooo((int) (j3 >> 32), o000oOoO.OooO0O0(j3), MapsKt.mapOf(TuplesKt.to(o0O0O00.OooO0O0.f35231OooO00o, Integer.valueOf(MathKt.roundToInt(o0ooo0oOooO0OO.f26880OooO0Oo))), TuplesKt.to(o0O0O00.OooO0O0.f35232OooO0O0, Integer.valueOf(MathKt.roundToInt(o0ooo0oOooO0OO.f26882OooO0o0)))), new OooO00o(arrayList));
        }

        @Override // o0O0O00.o000000
        public final int OooO0O0(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            o00O000.this.f3121Oooo0o.f3338OooO00o.OooO0Oo(LayoutNode.this.f6152OooooO0);
            return (int) Math.ceil(o00O000.this.f3121Oooo0o.f3338OooO00o.OooO0O0().OooO0O0());
        }

        @Override // o0O0O00.o000000
        public final int OooO0OO(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            o00O000.this.f3121Oooo0o.f3338OooO00o.OooO0Oo(LayoutNode.this.f6152OooooO0);
            return o00O000.this.f3121Oooo0o.f3338OooO00o.OooO00o();
        }

        @Override // o0O0O00.o000000
        public final int OooO0Oo(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return o000oOoO.OooO0O0(o00O000.this.f3121Oooo0o.f3338OooO00o.OooO0OO(o0000O0O.OooO0OO.OooO00o(0, i, 0, Integer.MAX_VALUE), LayoutNode.this.f6152OooooO0, null).f26879OooO0OO);
        }

        @Override // o0O0O00.o000000
        public final int OooO0o0(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return o000oOoO.OooO0O0(o00O000.this.f3121Oooo0o.f3338OooO00o.OooO0OO(o0000O0O.OooO0OO.OooO00o(0, i, 0, Integer.MAX_VALUE), LayoutNode.this.f6152OooooO0, null).f26879OooO0OO);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Oooo000> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Oooo000 invoke() {
            return o00O000.this.f3121Oooo0o.f3343OooO0o0;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0OOO0o> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOO0o invoke() {
            return o00O000.this.f3121Oooo0o.f3342OooO0o;
        }
    }

    @DebugMetadata(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3136Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f3137Oooo0oO;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = o00O000.this.new OooOO0(continuation);
            oooOO1.f3137Oooo0oO = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3136Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00000 o00000Var = (o00000) this.f3137Oooo0oO;
                o00O00OO o00o00oo2 = o00O000.this.f3123Oooo0oo;
                if (o00o00oo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("longPressDragObserver");
                    o00o00oo2 = null;
                }
                this.f3136Oooo0o = 1;
                if (o000OO0O.OooO00o(o00000Var, o00o00oo2, this) == coroutine_suspended) {
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

    public o00O000(@NotNull o0O000O state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f3121Oooo0o = state;
        this.f3120Oooo = new OooO0O0();
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        this.f3125OoooO00 = OnGloballyPositionedModifierKt.OooO00o(DrawModifierKt.OooO00o(GraphicsLayerModifierKt.OooO0O0(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, 65535), new o00O00O(this)), new OooO00o());
        this.f3124OoooO0 = SemanticsModifierKt.OooO00o(oooO00o, false, new o00O00(state.f3338OooO00o.f3390OooO00o, this));
        this.f3126OoooO0O = oooO00o;
    }

    public static final boolean OooO0OO(o00O000 o00o001, long j, long j2) {
        o0OOO0o o0ooo0o2 = o00o001.f3121Oooo0o.f3342OooO0o;
        if (o0ooo0o2 == null) {
            return false;
        }
        int length = o0ooo0o2.f26877OooO00o.f26885OooO00o.f26756Oooo0o.length();
        int iOooOOO0 = o0ooo0o2.OooOOO0(j);
        int iOooOOO1 = o0ooo0o2.OooOOO0(j2);
        int i = length - 1;
        return (iOooOOO0 >= i && iOooOOO1 >= i) || (iOooOOO0 < 0 && iOooOOO1 < 0);
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
        o00000O0 o00000o1;
        if (this.f3121Oooo0o.f3341OooO0Oo == null || (o00000o1 = this.f3122Oooo0oO) == null) {
            return;
        }
        o00000o1.OooO0Oo();
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        o00000O0 o00000o1;
        if (this.f3121Oooo0o.f3341OooO0Oo == null || (o00000o1 = this.f3122Oooo0oO) == null) {
            return;
        }
        o00000o1.OooO0Oo();
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
        o00000O0 o00000o1 = this.f3122Oooo0oO;
        if (o00000o1 != null) {
            o0O000O o0o000o = this.f3121Oooo0o;
            long j = o0o000o.f3339OooO0O0;
            OooO0OO coordinatesCallback = new OooO0OO();
            OooO0o layoutResultCallback = new OooO0o();
            Intrinsics.checkNotNullParameter(coordinatesCallback, "coordinatesCallback");
            Intrinsics.checkNotNullParameter(layoutResultCallback, "layoutResultCallback");
            o0o000o.f3341OooO0Oo = o00000o1.OooO00o();
        }
    }

    public final void OooO0o(@Nullable o00000O0 o00000o1) {
        o00OOOO0 o00oooo0OooO0O0;
        this.f3122Oooo0oO = o00000o1;
        if (o00000o1 != null) {
            OooO oooO = new OooO(o00000o1);
            Intrinsics.checkNotNullParameter(oooO, "<set-?>");
            this.f3123Oooo0oo = oooO;
            int i = o00OOOO0.f4197OooO00o;
            o00oooo0OooO0O0 = SuspendingPointerInputFilterKt.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, oooO, new OooOO0(null));
        } else {
            int i2 = o00OOOO0.f4197OooO00o;
            o00oooo0OooO0O0 = o00OOOO0.OooO00o.f4198Oooo0o;
        }
        this.f3126OoooO0O = o00oooo0OooO0O0;
    }

    public final void OooO0o0(@NotNull oOO00O textDelegate) {
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        o0O000O o0o000o = this.f3121Oooo0o;
        if (o0o000o.f3338OooO00o == textDelegate) {
            return;
        }
        Intrinsics.checkNotNullParameter(textDelegate, "<set-?>");
        o0o000o.f3338OooO00o = textDelegate;
        this.f3124OoooO0 = SemanticsModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, false, new o00O00(this.f3121Oooo0o.f3338OooO00o.f3390OooO00o, this));
    }
}
