package p487o0o00O;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.bumptech.glide.OooO0OO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import com.yalla.yalla.util.cache.VideoPreloadWorker;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p174o00OooOo.o00OO0O0;
import p415o0Oo0oO0.o00Ooo;
import p466o0OooOoo.o0O0o00O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.SettingActivity$clearCache$1", f = "SettingActivity.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
public final class o00O00OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48803OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f48804OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.SettingActivity$clearCache$1$1", f = "SettingActivity.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f48805OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SettingActivity f48806OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SettingActivity settingActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f48806OooO0o0 = settingActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f48806OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48805OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooO0OO oooO0OOOooO0O0 = OooO0OO.OooO0O0(this.f48806OooO0o0);
                oooO0OOOooO0O0.getClass();
                char[] cArr = o00OO0O0.f38351OooO00o;
                if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
                oooO0OOOooO0O0.f12942OooO0Oo.f37562OooO0o.OooO00o().clear();
                File file = o0O0o00O.f47844OooO00o;
                o0O0o00O.OooO0O0();
                this.f48805OooO0Oo = 1;
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
            o00Ooo.OooO00o().OooOO0O(null);
            VideoPreloadWorker.f32303OooO.clear();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(SettingActivity settingActivity, Continuation<? super o00O00OO> continuation) {
        super(2, continuation);
        this.f48804OooO0o0 = settingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O00OO(this.f48804OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O00OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48803OooO0Oo;
        SettingActivity settingActivity = this.f48804OooO0o0;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO0OO.OooO0O0(settingActivity).OooO00o();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OooO00o oooO00o = new OooO00o(settingActivity, null);
            this.f48803OooO0Oo = 1;
            if (BuildersKt.withContext(io2, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String strOooO0OO = o0000.OooO0OO(o000000.clear_suc);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (!z) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        settingActivity.OooOo0();
        return Unit.INSTANCE;
    }
}
