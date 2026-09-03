package p486o0o00O00;

import android.os.Looper;
import com.bumptech.glide.OooO0OO;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p408o0Oo0o0O.o00Oo0;
import p416o0Oo0ooo.y0;
import p532o0o0Oo.o0000oo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.SettingActivity$clearCache$1", f = "SettingActivity.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
public final class oo00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f48407OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.SettingActivity$clearCache$1$1", f = "SettingActivity.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f48408OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SettingActivity f48409OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SettingActivity settingActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f48409OooO0o0 = settingActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f48409OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48408OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooO0OO oooO0OOOooO0O0 = OooO0OO.OooO0O0(this.f48409OooO0o0);
                oooO0OOOooO0O0.getClass();
                if (!o0000oo.OooO0oo()) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
                oooO0OOOooO0O0.f9851OooO0Oo.f36848OooO0o.OooO00o().clear();
                File file = y0.f45407OooO00o;
                y0.OooO0O0();
                this.f48408OooO0Oo = 1;
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
            o00Oo0.OooO00o().OooOO0O(null);
            VideoPreloadWorker.f32839OooOOOO.clear();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(SettingActivity settingActivity, Continuation<? super oo00o> continuation) {
        super(2, continuation);
        this.f48407OooO0o0 = settingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo00o(this.f48407OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48406OooO0Oo;
        SettingActivity settingActivity = this.f48407OooO0o0;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO0OO.OooO0O0(settingActivity).OooO00o();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OooO00o oooO00o = new OooO00o(settingActivity, null);
            this.f48406OooO0Oo = 1;
            if (BuildersKt.withContext(io2, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.clear_suc);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (!z) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        settingActivity.OooOo0();
        return Unit.INSTANCE;
    }
}
