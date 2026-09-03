package p535o0o0OOoO;

import android.content.SharedPreferences;
import com.bumptech.glide.OooO0OO;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import java.io.File;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import p168o00Ooo0.OooOo;
import p243o00oo00O.o000O000;
import p254o00ooO0O.o000O0O0;
import p494o0o00OO0.OooO0o;
import p497o0o00Oo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.SettingActivity$clearCache$1", f = "SettingActivity.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class oOO000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43686Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f43687Oooo0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.SettingActivity$clearCache$1$1", f = "SettingActivity.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f43688Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ SettingActivity f43689Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SettingActivity settingActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43689Oooo0oO = settingActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f43689Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f43688Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooO0OO oooO0OOOooO0O0 = OooO0OO.OooO0O0(this.f43689Oooo0oO);
                Objects.requireNonNull(oooO0OOOooO0O0);
                if (!o000O000.OooO0oo()) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
                oooO0OOOooO0O0.f12372Oooo0o.f33445OooO0o.OooO00o().clear();
                OooO0o oooO0o = OooO0o.f41155OooO00o;
                OooOo.OooO0O0(oooO0o.OooO0o0());
                OooOo.OooO0O0(OooO0o.f41157OooO0OO);
                OooOo.OooO0O0(oooO0o.OooO0OO());
                OooOo.OooO0O0(OooO0o.f41156OooO0O0);
                OooOo.OooO0O0((File) OooO0o.f41162OooO0oo.getValue());
                OooOo.OooO0O0(OooO0o.f41158OooO0Oo);
                OooOo.OooO0O0((File) OooO0o.f41164OooOO0O.getValue());
                this.f43688Oooo0o = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            SharedPreferences.Editor editorClear = OooOOO0.OooO0oO().f32553OooO00o.edit().clear();
            if (editorClear != null) {
                editorClear.commit();
            }
            SharedPreferences.Editor editorClear2 = OooOOO0.OooO().f32553OooO00o.edit().clear();
            return Boxing.boxBoolean(editorClear2 != null ? editorClear2.commit() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000o(SettingActivity settingActivity, Continuation<? super oOO000o> continuation) {
        super(2, continuation);
        this.f43687Oooo0oO = settingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOO000o(this.f43687Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOO000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43686Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO0OO.OooO0O0(this.f43687Oooo0oO).OooO00o();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OooO00o oooO00o = new OooO00o(this.f43687Oooo0oO, null);
            this.f43686Oooo0o = 1;
            if (BuildersKt.withContext(io2, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.clear_suc));
        this.f43687Oooo0oO.OooOoO();
        return Unit.INSTANCE;
    }
}
