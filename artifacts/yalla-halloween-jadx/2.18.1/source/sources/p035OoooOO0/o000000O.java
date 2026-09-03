package p035OoooOO0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o000oOoO;
import p023Oooo00O.o0Oo0oo;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public OooO f3584OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f3585OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f3586OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Float f3587OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO f3588OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Float f3589OooO0o0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3593OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3594OooOO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Oooo0<Float, o0Oo0oo> f3590OooO0oO = o000oOoO.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Oooo0<Float, o0Oo0oo> f3591OooO0oo = o000oOoO.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Oooo0<Float, o0Oo0oo> f3583OooO = o000oOoO.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Unit> f3592OooOO0 = CompletableDeferredKt.CompletableDeferred((Job) null);

    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {80, 82, 83}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f3595Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o000000O f3596Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f3597Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3597Oooo0oO = obj;
            this.f3595Oooo |= Integer.MIN_VALUE;
            return o000000O.this.OooO00o(this);
        }
    }

    public o000000O(OooO oooO, float f, boolean z) {
        this.f3584OooO00o = oooO;
        this.f3585OooO0O0 = f;
        this.f3586OooO0OO = z;
        Boolean bool = Boolean.FALSE;
        this.f3593OooOO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f3594OooOO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        o000000O o000000o2;
        Object objCoroutineScope;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f3595Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f3595Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f3597Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f3595Oooo;
        if (i2 != 0) {
            if (i2 == 1) {
                o000000o2 = oooO00o.f3596Oooo0o;
                ResultKt.throwOnFailure(obj);
            } else if (i2 == 2) {
                o000000o2 = oooO00o.f3596Oooo0o;
                ResultKt.throwOnFailure(obj);
                oooO00o.f3596Oooo0o = null;
                oooO00o.f3595Oooo = 3;
                Objects.requireNonNull(o000000o2);
                objCoroutineScope = CoroutineScopeKt.coroutineScope(new o00000O0(o000000o2, null), oooO00o);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        oooO00o.f3596Oooo0o = this;
        oooO00o.f3595Oooo = 1;
        Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new o00000(this, null), oooO00o);
        if (objCoroutineScope2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope2 = Unit.INSTANCE;
        }
        if (objCoroutineScope2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        o000000o2 = this;
        o000000o2.f3593OooOO0O.setValue(Boolean.TRUE);
        CompletableDeferred<Unit> completableDeferred = o000000o2.f3592OooOO0;
        oooO00o.f3596Oooo0o = o000000o2;
        oooO00o.f3595Oooo = 2;
        if (completableDeferred.await(oooO00o) == coroutine_suspended) {
            return coroutine_suspended;
        }
        oooO00o.f3596Oooo0o = null;
        oooO00o.f3595Oooo = 3;
        Objects.requireNonNull(o000000o2);
        objCoroutineScope = CoroutineScopeKt.coroutineScope(new o00000O0(o000000o2, null), oooO00o);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        if (objCoroutineScope == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
