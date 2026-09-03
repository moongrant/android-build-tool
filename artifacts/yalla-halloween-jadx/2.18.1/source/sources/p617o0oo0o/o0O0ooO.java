package p617o0oo0o;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0O0ooO extends FileObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public String f48569OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f48570OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f48571OooO0OO;

    public interface OooO00o {
        void OooO00o(@Nullable String str);
    }

    @DebugMetadata(c = "com.yalla.yalla.util.ScreenShotFileObserver$onEvent$1", f = "ScreenShotFileObserver.kt", i = {}, l = {36, 38}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f48572Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f48574Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.util.ScreenShotFileObserver$onEvent$1$1", f = "ScreenShotFileObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o0O0ooO f48575Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ String f48576Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0O0ooO o0o0ooo, String str, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f48575Oooo0o = o0o0ooo;
                this.f48576Oooo0oO = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f48575Oooo0o, this.f48576Oooo0oO, continuation);
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
                OooO00o oooO00o = this.f48575Oooo0o.f48570OooO0O0;
                Intrinsics.checkNotNull(oooO00o);
                oooO00o.OooO00o(this.f48576Oooo0oO);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f48574Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0O0ooO.this.new OooO0O0(this.f48574Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48572Oooo0o;
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
            this.f48572Oooo0o = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (o0O0ooO.this.f48570OooO0O0 != null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                OooO00o oooO00o = new OooO00o(o0O0ooO.this, this.f48574Oooo0oo, null);
                this.f48572Oooo0o = 2;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public o0O0ooO(@Nullable String str, @Nullable OooO00o oooO00o) {
        super(str, 256);
        this.f48569OooO00o = "";
        this.f48571OooO0OO = str;
        this.f48570OooO0O0 = oooO00o;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, @Nullable String str) {
        o00O00.OooOO0o("ScreenShotFileObserver", "event = " + i + "    path = " + str);
        if ((str == null || StringsKt.isBlank(str)) || i != 256) {
            return;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "Screenshot", 0, true, 2, (Object) null);
        if (StringsKt.OooOoOO(str, ".") && iIndexOf$default > 0) {
            str = str.substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
        }
        if (Intrinsics.areEqual(str, this.f48569OooO00o)) {
            return;
        }
        this.f48569OooO00o = str;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooO0O0(OooO.OooO00o(new StringBuilder(), this.f48571OooO0OO, str), null), 2, null);
    }
}
