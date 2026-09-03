package p035OoooOO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o000000.o00O0O;
import o00O0O.OooO;
import o00O0O.OooOO0;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o000Oo0;
import p047Oooooo0.o00OO;
import p047Oooooo0.o00OOOOo;
import p047Oooooo0.o00Oo00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oo0oO0;
import p145o00Oo0.o00000O0;
import p191o00o0O.o000OOo;
import p191o00o0O.o00Oo0;
import p191o00o0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends o0000 implements oo0oO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00000O0> f3652Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f3653Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f3654Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final o00OO<o000Oo0, o000000O> f3655OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o000000> f3656OoooO00;

    @DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o000Oo0 f3657Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3658Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000000O f3659Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo f3660Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000000O o000000o2, o0Oo0oo o0oo0oo2, o000Oo0 o000oo1, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f3659Oooo0oO = o000000o2;
            this.f3660Oooo0oo = o0oo0oo2;
            this.f3657Oooo = o000oo1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f3659Oooo0oO, this.f3660Oooo0oo, this.f3657Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3658Oooo0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o000000O o000000o2 = this.f3659Oooo0oO;
                    this.f3658Oooo0o = 1;
                    if (o000000o2.OooO00o(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f3660Oooo0oo.f3655OoooO0.remove(this.f3657Oooo);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.f3660Oooo0oo.f3655OoooO0.remove(this.f3657Oooo);
                throw th;
            }
        }
    }

    public o0Oo0oo(boolean z, float f, oO0Oo oo0oo, oO0Oo oo0oo2, DefaultConstructorMarker defaultConstructorMarker) {
        super(z, oo0oo2);
        this.f3653Oooo0oO = z;
        this.f3654Oooo0oo = f;
        this.f3652Oooo = oo0oo;
        this.f3656OoooO00 = oo0oo2;
        this.f3655OoooO0 = new o00OO<>();
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
        this.f3655OoooO0.clear();
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        this.f3655OoooO0.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0.o0O0ooO
    public final void OooO0OO(@NotNull o00oO0o draw) {
        Intrinsics.checkNotNullParameter(draw, "<this>");
        long j = this.f3652Oooo.getValue().f32070OooO00o;
        o00O0O o00o0o2 = (o00O0O) draw;
        o00o0o2.o0ooOOo();
        OooO0o(draw, this.f3654Oooo0oo, j);
        Object it = this.f3655OoooO0.f4101Oooo0oO.iterator();
        while (((o00Oo00) it).hasNext()) {
            o000000O o000000o2 = (o000000O) ((Map.Entry) ((o00OOOOo) it).next()).getValue();
            float f = this.f3656OoooO00.getValue().f3582OooO0Oo;
            if (!(f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                long jOooO0OO = o00000O0.OooO0OO(j, f);
                Objects.requireNonNull(o000000o2);
                Intrinsics.checkNotNullParameter(draw, "$this$draw");
                if (o000000o2.f3587OooO0Oo == null) {
                    long jOooO0OO2 = o00o0o2.OooO0OO();
                    float f2 = o00000O.f3599OooO00o;
                    o000000o2.f3587OooO0Oo = Float.valueOf(Math.max(OooOo00.OooO0Oo(jOooO0OO2), OooOo00.OooO0O0(jOooO0OO2)) * 0.3f);
                }
                if (o000000o2.f3589OooO0o0 == null) {
                    o000000o2.f3589OooO0o0 = Float.isNaN(o000000o2.f3585OooO0O0) ? Float.valueOf(o00000O.OooO00o(draw, o000000o2.f3586OooO0OO, o00o0o2.OooO0OO())) : Float.valueOf(o00o0o2.OoooOoo(o000000o2.f3585OooO0O0));
                }
                if (o000000o2.f3584OooO00o == null) {
                    o000000o2.f3584OooO00o = new OooO(o00o0o2.o00Oo0());
                }
                if (o000000o2.f3588OooO0o == null) {
                    o000000o2.f3588OooO0o = new OooO(OooOO0.OooO00o(OooOo00.OooO0Oo(o00o0o2.OooO0OO()) / 2.0f, OooOo00.OooO0O0(o00o0o2.OooO0OO()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) o000000o2.f3594OooOO0o.getValue()).booleanValue() || ((Boolean) o000000o2.f3593OooOO0O.getValue()).booleanValue()) ? o000000o2.f3590OooO0oO.OooO0o().floatValue() : 1.0f;
                Float f3 = o000000o2.f3587OooO0Oo;
                Intrinsics.checkNotNull(f3);
                float fFloatValue2 = f3.floatValue();
                Float f4 = o000000o2.f3589OooO0o0;
                Intrinsics.checkNotNull(f4);
                float fOooO00o = o000OO.OooO00o.OooO00o(fFloatValue2, f4.floatValue(), o000000o2.f3591OooO0oo.OooO0o().floatValue());
                OooO oooO = o000000o2.f3584OooO00o;
                Intrinsics.checkNotNull(oooO);
                float fOooO0OO = OooO.OooO0OO(oooO.f30395OooO00o);
                OooO oooO2 = o000000o2.f3588OooO0o;
                Intrinsics.checkNotNull(oooO2);
                float fOooO00o2 = o000OO.OooO00o.OooO00o(fOooO0OO, OooO.OooO0OO(oooO2.f30395OooO00o), o000000o2.f3583OooO.OooO0o().floatValue());
                OooO oooO3 = o000000o2.f3584OooO00o;
                Intrinsics.checkNotNull(oooO3);
                float fOooO0Oo = OooO.OooO0Oo(oooO3.f30395OooO00o);
                OooO oooO4 = o000000o2.f3588OooO0o;
                Intrinsics.checkNotNull(oooO4);
                long jOooO00o = OooOO0.OooO00o(fOooO00o2, o000OO.OooO00o.OooO00o(fOooO0Oo, OooO.OooO0Oo(oooO4.f30395OooO00o), o000000o2.f3583OooO.OooO0o().floatValue()));
                long jOooO0OO3 = o00000O0.OooO0OO(jOooO0OO, o00000O0.OooO0o0(jOooO0OO) * fFloatValue);
                if (o000000o2.f3586OooO0OO) {
                    float fOooO0Oo2 = OooOo00.OooO0Oo(o00o0o2.OooO0OO());
                    float fOooO0O0 = OooOo00.OooO0O0(o00o0o2.OooO0OO());
                    o00Oo0.OooO0O0 oooO0O0 = o00o0o2.f26649Oooo0o.f33068Oooo0oO;
                    long jOooO0OO4 = oooO0O0.OooO0OO();
                    oooO0O0.OooO0o().OooO0oo();
                    oooO0O0.f33074OooO00o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fOooO0Oo2, fOooO0O0, 1);
                    draw.o00oO0O(jOooO0OO3, (124 & 2) != 0 ? OooOo00.OooO0OO(draw.OooO0OO()) / 2.0f : fOooO00o, (124 & 4) != 0 ? draw.o00Oo0() : jOooO00o, (124 & 8) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (124 & 16) != 0 ? o000OOo.f33065OooO00o : null, null, (124 & 64) != 0 ? 3 : 0);
                    oooO0O0.OooO0o().OooOOo0();
                    oooO0O0.OooO0o0(jOooO0OO4);
                } else {
                    draw.o00oO0O(jOooO0OO3, (124 & 2) != 0 ? OooOo00.OooO0OO(draw.OooO0OO()) / 2.0f : fOooO00o, (124 & 4) != 0 ? draw.o00Oo0() : jOooO00o, (124 & 8) != 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (124 & 16) != 0 ? o000OOo.f33065OooO00o : null, null, (124 & 64) != 0 ? 3 : 0);
                }
            }
            o00o0o2 = o00o0o2;
        }
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
    }

    @Override // p035OoooOO0.o0000
    public final void OooO0o0(@NotNull o000Oo0 interaction, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Iterator<Map.Entry<K, V>> it = this.f3655OoooO0.f4101Oooo0oO.iterator();
        while (it.hasNext()) {
            o000000O o000000o2 = (o000000O) ((Map.Entry) it.next()).getValue();
            o000000o2.f3594OooOO0o.setValue(Boolean.TRUE);
            o000000o2.f3592OooOO0.complete(Unit.INSTANCE);
        }
        o000000O o000000o3 = new o000000O(this.f3653Oooo0oO ? new OooO(interaction.f1733OooO00o) : null, this.f3654Oooo0oo, this.f3653Oooo0oO);
        this.f3655OoooO0.put(interaction, o000000o3);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new OooO00o(o000000o3, this, interaction, null), 3, null);
    }

    @Override // p035OoooOO0.o0000
    public final void OooO0oO(@NotNull o000Oo0 interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        o000000O o000000o2 = this.f3655OoooO0.get(interaction);
        if (o000000o2 != null) {
            o000000o2.f3594OooOO0o.setValue(Boolean.TRUE);
            o000000o2.f3592OooOO0.complete(Unit.INSTANCE);
        }
    }
}
