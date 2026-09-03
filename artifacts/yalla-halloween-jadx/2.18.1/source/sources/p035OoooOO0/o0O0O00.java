package p035OoooOO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00OO00O;
import p026Oooo0OO.o0000;
import p026Oooo0OO.o00000O;
import p026Oooo0OO.o00000OO;
import p026Oooo0OO.o0000O;
import p026Oooo0OO.o0000O0;
import p026Oooo0OO.o0000O00;
import p026Oooo0OO.o0000O0O;
import p026Oooo0OO.o0000OO0;
import p026Oooo0OO.o0000Ooo;
import p026Oooo0OO.o000O00;
import p026Oooo0OO.o000O0o;
import p026Oooo0OO.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0000 f3635Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f3636Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f3637Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0000OO0 f3638Oooo0oo;

    public static final class OooO00o implements FlowCollector<o0000O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000 f3639Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f3640Oooo0oO;

        public OooO00o(o0000 o0000Var, CoroutineScope coroutineScope) {
            this.f3639Oooo0o = o0000Var;
            this.f3640Oooo0oO = coroutineScope;
        }

        /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<Oooo0OO.o0000O>] */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList, java.util.List<Oooo0OO.o0000O>] */
        /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList, java.util.List<Oooo0OO.o0000O>] */
        /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList, java.util.List<Oooo0OO.o0000O>] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList, java.util.List<Oooo0OO.o0000O>] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList, java.util.List<Oooo0OO.o0000O>] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<Oooo0OO.o0000O>] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(o0000O o0000o2, @NotNull Continuation<? super Unit> continuation) {
            float f;
            o00OO00O<Float> o00oo00o;
            o0000O interaction = o0000o2;
            if (interaction instanceof o000Oo0) {
                this.f3639Oooo0o.OooO0o0((o000Oo0) interaction, this.f3640Oooo0oO);
            } else if (interaction instanceof o000O00) {
                this.f3639Oooo0o.OooO0oO(((o000O00) interaction).f1720OooO00o);
            } else if (interaction instanceof o000O0o) {
                this.f3639Oooo0o.OooO0oO(((o000O0o) interaction).f1727OooO00o);
            } else {
                o0000 o0000Var = this.f3639Oooo0o;
                CoroutineScope scope = this.f3640Oooo0oO;
                Objects.requireNonNull(o0000Var);
                Intrinsics.checkNotNullParameter(interaction, "interaction");
                Intrinsics.checkNotNullParameter(scope, "scope");
                o0000O o0000o3 = o0000Var.f3570Oooo0o;
                Objects.requireNonNull(o0000o3);
                Intrinsics.checkNotNullParameter(interaction, "interaction");
                Intrinsics.checkNotNullParameter(scope, "scope");
                boolean z = interaction instanceof o0000O0;
                if (z) {
                    o0000o3.f3609OooO0Oo.add(interaction);
                } else if (interaction instanceof o0000O0O) {
                    o0000o3.f3609OooO0Oo.remove(((o0000O0O) interaction).f1713OooO00o);
                } else if (interaction instanceof o0000) {
                    o0000o3.f3609OooO0Oo.add(interaction);
                } else if (interaction instanceof o0000O00) {
                    o0000o3.f3609OooO0Oo.remove(((o0000O00) interaction).f1712OooO00o);
                } else if (interaction instanceof o00000OO) {
                    o0000o3.f3609OooO0Oo.add(interaction);
                } else if (interaction instanceof o0000Ooo) {
                    o0000o3.f3609OooO0Oo.remove(((o0000Ooo) interaction).f1714OooO00o);
                } else if (interaction instanceof o00000O) {
                    o0000o3.f3609OooO0Oo.remove(((o00000O) interaction).f1711OooO00o);
                }
                o0000O o0000o4 = (o0000O) CollectionsKt.lastOrNull((List) o0000o3.f3609OooO0Oo);
                if (!Intrinsics.areEqual(o0000o3.f3610OooO0o0, o0000o4)) {
                    if (o0000o4 != null) {
                        if (z) {
                            f = o0000o3.f3607OooO0O0.getValue().f3581OooO0OO;
                        } else if (interaction instanceof o0000) {
                            f = o0000o3.f3607OooO0O0.getValue().f3580OooO0O0;
                        } else {
                            f = interaction instanceof o00000OO ? o0000o3.f3607OooO0O0.getValue().f3579OooO00o : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                        o00OO00O<Float> o00oo00o2 = o0000O00.f3615OooO00o;
                        if (o0000o4 instanceof o0000O0) {
                            o00oo00o = o0000O00.f3615OooO00o;
                        } else {
                            o00oo00o = ((o0000o4 instanceof o0000) || (o0000o4 instanceof o00000OO)) ? new o00OO00O<>(45, Oooo00O.o0000O0.OooO00o.f1052OooO00o, 2) : o0000O00.f3615OooO00o;
                        }
                        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new o0000O0O(o0000o3, f, o00oo00o, null), 3, null);
                    } else {
                        o0000O o0000o5 = o0000o3.f3610OooO0o0;
                        o00OO00O<Float> o00oo00o3 = o0000O00.f3615OooO00o;
                        o00OO00O<Float> o00oo00o4 = ((o0000o5 instanceof o0000O0) || (o0000o5 instanceof o0000) || !(o0000o5 instanceof o00000OO)) ? o0000O00.f3615OooO00o : new o00OO00O<>(150, Oooo00O.o0000O0.OooO00o.f1052OooO00o, 2);
                        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new o000OO(o0000o3, o00oo00o4, null), 3, null);
                    }
                    o0000o3.f3610OooO0o0 = o0000o4;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(o0000OO0 o0000oo1, o0000 o0000Var, Continuation<? super o0O0O00> continuation) {
        super(2, continuation);
        this.f3638Oooo0oo = o0000oo1;
        this.f3635Oooo = o0000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0O0O00 o0o0o00 = new o0O0O00(this.f3638Oooo0oo, this.f3635Oooo, continuation);
        o0o0o00.f3637Oooo0oO = obj;
        return o0o0o00;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3636Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f3637Oooo0oO;
            Flow<o0000O> flowOooO00o = this.f3638Oooo0oo.OooO00o();
            OooO00o oooO00o = new OooO00o(this.f3635Oooo, coroutineScope);
            this.f3636Oooo0o = 1;
            if (flowOooO00o.collect(oooO00o, this) == coroutine_suspended) {
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
