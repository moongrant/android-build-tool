package p032OoooO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import o0000O0O.o000oOoO;
import o00O0O.OooOO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p030Oooo0oo.o0O0O0O;
import p054o00000oo.o00O0O00;
import p054o00000oo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", i = {}, l = {298}, m = "invokeSuspend", n = {}, s = {})
public final class o000000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3002Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f3003Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0O0O f3004Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f3005Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f3006OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O000 f3007OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o0O0O0O o0o0o0o, oo0oOO0 oo0ooo0, o0O0000O o0o0000o2, o0O000 o0o001, o00O0O00 o00o0o01, Continuation<? super o000000> continuation) {
        super(2, continuation);
        this.f3004Oooo0oO = o0o0o0o;
        this.f3005Oooo0oo = oo0ooo0;
        this.f3002Oooo = o0o0000o2;
        this.f3007OoooO00 = o0o001;
        this.f3006OoooO0 = o00o0o01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000000(this.f3004Oooo0oO, this.f3005Oooo0oo, this.f3002Oooo, this.f3007OoooO00, this.f3006OoooO0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OooOO0O oooOO0OOooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3003Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O0O0O o0o0o0o = this.f3004Oooo0oO;
            oo0oOO0 oo0ooo0 = this.f3005Oooo0oo;
            oOO00O ooo00o = this.f3002Oooo.f3319OooO00o;
            o0OOO0o o0ooo0o2 = this.f3007OoooO00.f3314OooO00o;
            o00O0O00 o00o0o01 = this.f3006OoooO0;
            this.f3003Oooo0o = 1;
            int iOooO0O0 = o00o0o01.OooO0O0(o0OO00O.OooO0o(oo0ooo0.f27237OooO0O0));
            if (iOooO0O0 < o0ooo0o2.f26877OooO00o.f26885OooO00o.length()) {
                oooOO0OOooO0O0 = o0ooo0o2.OooO0O0(iOooO0O0);
            } else {
                oooOO0OOooO0O0 = iOooO0O0 != 0 ? o0ooo0o2.OooO0O0(iOooO0O0 - 1) : new OooOO0O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, o000oOoO.OooO0O0(o00O0OO0.OooO00o(ooo00o.f3391OooO0O0, ooo00o.f3394OooO0o, ooo00o.f3396OooO0oO, o00O0OO0.f3175OooO00o, 1)));
            }
            Object objOooO00o = o0o0o0o.OooO00o(oooOO0OOooO0O0, this);
            if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO00o = Unit.INSTANCE;
            }
            if (objOooO00o == coroutine_suspended) {
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
