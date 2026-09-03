package p579o0oOoo;

import android.os.FileObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;
import p495o0o00Ooo.oo0OOoo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oOOO00Oo extends FileObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public String f56671OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final OooO00o f56672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f56673OooO0OO;

    public interface OooO00o {
        void OooO00o(@Nullable String str);
    }

    @DebugMetadata(c = "com.yalla.yalla.util.ScreenShotFileObserver$onEvent$1", f = "ScreenShotFileObserver.kt", i = {}, l = {36, 38}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56674OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f56675OooO0o;

        @DebugMetadata(c = "com.yalla.yalla.util.ScreenShotFileObserver$onEvent$1$1", f = "ScreenShotFileObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ oOOO00Oo f56677OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ String f56678OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(oOOO00Oo oooo00oo, String str, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f56677OooO0Oo = oooo00oo;
                this.f56678OooO0o0 = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f56677OooO0Oo, this.f56678OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                OooO00o oooO00o = this.f56677OooO0Oo.f56672OooO0O0;
                Intrinsics.checkNotNull(oooO00o);
                oooO00o.OooO00o(this.f56678OooO0o0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f56675OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return oOOO00Oo.this.new OooO0O0(this.f56675OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56674OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f56674OooO0Oo = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            if (oooo00oo.f56672OooO0O0 != null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                OooO00o oooO00o = new OooO00o(oooo00oo, this.f56675OooO0o, null);
                this.f56674OooO0Oo = 2;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public oOOO00Oo(@Nullable String str, @Nullable oo0OOoo oo0oooo) {
        super(str, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        this.f56671OooO00o = "";
        this.f56673OooO0OO = str;
        this.f56672OooO0O0 = oo0oooo;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, @Nullable String str) {
        OooOOO0.OooO00o(104, "ScreenShotFileObserver", "event = " + i + "    path = " + str, null);
        if ((str == null || StringsKt.isBlank(str)) || i != 256) {
            return;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "Screenshot", 0, true, 2, (Object) null);
        if (StringsKt.Oooo00o(str, ".") && iIndexOf$default > 0) {
            str = str.substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
        }
        if (Intrinsics.areEqual(str, this.f56671OooO00o)) {
            return;
        }
        this.f56671OooO00o = str;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooO0O0(o0O00o0.OooO0O0(new StringBuilder(), this.f56673OooO0OO, str), null), 2, null);
    }
}
