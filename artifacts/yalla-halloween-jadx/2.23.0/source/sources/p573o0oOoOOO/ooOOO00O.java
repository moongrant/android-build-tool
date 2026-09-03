package p573o0oOoOOO;

import com.bumptech.glide.OooO0OO;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00O;
import com.google.android.exoplayer2.upstream.cache.OooO0O0;
import com.google.android.exoplayer2.util.Log;
import com.yalla.yalla.util.cache.VideoPreloadWorker;
import java.io.File;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import o0OOo000.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p416o0Oo0ooo.y0;
import p532o0o0Oo.o0000oo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SettingVM$clearCache$1", f = "SettingVM.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class ooOOO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56311OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SettingVM$clearCache$1$1", f = "SettingVM.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56312OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56312OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooO0OO oooO0OOOooO0O0 = OooO0OO.OooO0O0(o000O0.OooO00o());
                oooO0OOOooO0O0.getClass();
                if (!o0000oo.OooO0oo()) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
                oooO0OOOooO0O0.f9851OooO0Oo.f36848OooO0o.OooO00o().clear();
                File file = y0.f45407OooO00o;
                y0.OooO0O0();
                this.f56312OooO0Oo = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o00Oo0.OooO0oo().OooO00o();
            o00Oo0.OooO().OooO00o();
            OooO0O0 oooO0O0 = OooOOO0.f43863OooO00o;
            if (oooO0O0 != null) {
                synchronized (oooO0O0) {
                    try {
                        if (!oooO0O0.f14303OooO) {
                            oooO0O0.f14309OooO0o0.clear();
                            oooO0O0.OooOOo();
                            try {
                                try {
                                    oooO0O0.f14306OooO0OO.OooO0oO();
                                } catch (IOException e) {
                                    Log.OooO0Oo("SimpleCache", "Storing index file failed", e);
                                }
                                OooO0O0.OooOo00(oooO0O0.f14304OooO00o);
                                oooO0O0.f14303OooO = true;
                            } catch (Throwable th) {
                                OooO0O0.OooOo00(oooO0O0.f14304OooO00o);
                                oooO0O0.f14303OooO = true;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            OooOOO0.f43863OooO00o = null;
            o00Oo0.OooO00o().OooOO0O(null);
            VideoPreloadWorker.f32839OooOOOO.clear();
            return Unit.INSTANCE;
        }
    }

    public ooOOO00O(Continuation<? super ooOOO00O> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ooOOO00O(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new ooOOO00O(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56311OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO0OO.OooO0O0(o000O0.OooO00o()).OooO00o();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OooO00o oooO00o = new OooO00o(null);
            this.f56311OooO0Oo = 1;
            if (BuildersKt.withContext(io2, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.clear_suc));
        return Unit.INSTANCE;
    }
}
