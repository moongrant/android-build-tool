package p579o0oOoOoO;

import android.os.Looper;
import androidx.media3.common.util.Log;
import androidx.media3.datasource.cache.OooO0O0;
import com.bumptech.glide.OooO0OO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.code.android.util.o000O00O;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p174o00OooOo.o00OO0O0;
import p363o0OOo00O.OooOo00;
import p415o0Oo0oO0.o00Ooo;
import p466o0OooOoo.o0O0o00O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SettingVM$clearCache$1", f = "SettingVM.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class oOO0O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56532OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SettingVM$clearCache$1$1", f = "SettingVM.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56533OooO0Oo;

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
            int i = this.f56533OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooO0OO oooO0OOOooO0O0 = OooO0OO.OooO0O0(o000O00O.OooO00o());
                oooO0OOOooO0O0.getClass();
                char[] cArr = o00OO0O0.f38351OooO00o;
                if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
                oooO0OOOooO0O0.f12942OooO0Oo.f37562OooO0o.OooO00o().clear();
                File file = o0O0o00O.f47844OooO00o;
                o0O0o00O.OooO0O0();
                this.f56533OooO0Oo = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o00Ooo.OooO0oo().OooO00o();
            o00Ooo.OooO().OooO00o();
            OooOo00.f43061OooO00o.getClass();
            OooO0O0 oooO0O0 = OooOo00.f43062OooO0O0;
            if (oooO0O0 != null) {
                synchronized (oooO0O0) {
                    if (!oooO0O0.f7073OooO) {
                        oooO0O0.f7079OooO0o0.clear();
                        oooO0O0.OooOo00();
                        try {
                            try {
                                oooO0O0.f7076OooO0OO.OooO0oO();
                            } catch (IOException e) {
                                Log.OooO0Oo("SimpleCache", "Storing index file failed", e);
                            }
                            OooO0O0.OooOo0O(oooO0O0.f7074OooO00o);
                            oooO0O0.f7073OooO = true;
                        } catch (Throwable th) {
                            OooO0O0.OooOo0O(oooO0O0.f7074OooO00o);
                            oooO0O0.f7073OooO = true;
                            throw th;
                        }
                    }
                }
            }
            OooOo00.f43062OooO0O0 = null;
            OooOo00.f43064OooO0Oo = null;
            OooOo00.f43066OooO0o0 = null;
            OooOo00.f43065OooO0o = null;
            o00Ooo.OooO00o().OooOO0O(null);
            VideoPreloadWorker.f32303OooO.clear();
            return Unit.INSTANCE;
        }
    }

    public oOO0O00O(Continuation<? super oOO0O00O> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOO0O00O(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new oOO0O00O(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56532OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO0OO.OooO0O0(o000O00O.OooO00o()).OooO00o();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OooO00o oooO00o = new OooO00o(null);
            this.f56532OooO0Oo = 1;
            if (BuildersKt.withContext(io2, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        o000O00.OooO0O0(o0000.OooO0OO(o000000.clear_suc));
        return Unit.INSTANCE;
    }
}
