package p590o0oOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.data.repository.UserInfoRepo$reportSafetyData$$inlined$call$1;
import com.yalla.yalla.model.ReportSafetyDataModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO0000 f57173OooO00o = new oOO0000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f57174OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.util.AppVirtualManager$check$1$1", f = "AppVirtualManager.kt", i = {}, l = {30, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f57175OooO0Oo;

        /* JADX INFO: renamed from: o0oOooo0.oOO0000$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.util.AppVirtualManager$check$1$1$1", f = "AppVirtualManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0491OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f57176OooO0Oo;

            public C0491OooO00o(Continuation<? super C0491OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0491OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new C0491OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f57176OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    O0000000.OooO00o();
                    this.f57176OooO0Oo = 1;
                    if (DelayKt.delay(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                o0000O00.OooO0OO("AppComplianceCheck", "killApp exitProcess");
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }

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
            int i = this.f57175OooO0Oo;
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
            oOO0000 ooo0000 = oOO0000.f57173OooO00o;
            this.f57175OooO0Oo = 1;
            obj = oOO0000.OooO00o(ooo0000, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                C0491OooO00o c0491OooO00o = new C0491OooO00o(null);
                this.f57175OooO0Oo = 2;
                if (OooOOO.OooO0o0(c0491OooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(oOO0000 ooo0000, Continuation continuation) {
        oOO000 ooo000;
        ooo0000.getClass();
        if (continuation instanceof oOO000) {
            ooo000 = (oOO000) continuation;
            int i = ooo000.f57171OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo000.f57171OooO0o = i - Integer.MIN_VALUE;
            } else {
                ooo000 = new oOO000(ooo0000, continuation);
            }
        } else {
            ooo000 = new oOO000(ooo0000, continuation);
        }
        Object objOooO0Oo = ooo000.f57170OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ooo000.f57171OooO0o;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            SecModel secModel = oo0o0Oo.f43515OooOO0;
            if (secModel != null && secModel.getAppVirtual()) {
                UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
                String strOooO00o = OooO.OooO00o(oo0o0Oo.f43515OooOO0);
                ooo000.f57171OooO0o = 1;
                userInfoRepo.getClass();
                String url = oo000o.OooO0OO("/Webservers/User/ReportSafetyData");
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 1);
                o0ooooo.OooO0O0(strOooO00o, "SafetyData");
                objOooO0Oo = OooOOO.OooO0Oo(new UserInfoRepo$reportSafetyData$$inlined$call$1(o0ooooo, null), ooo000);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objOooO0Oo);
        ReportSafetyDataModel reportSafetyDataModel = (ReportSafetyDataModel) ((ApiResult) objOooO0Oo).getData();
        if (reportSafetyDataModel != null && reportSafetyDataModel.getIsBlackUser()) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }

    public static void OooO0O0(boolean z) {
        SecModel secModel = oo0o0Oo.f43515OooOO0;
        o0000O00.OooO0O0("AppVirtualManager appVirtual = " + (secModel != null ? Boolean.valueOf(secModel.getAppVirtual()) : null));
        if (!z) {
            if (f57174OooO0O0) {
                return;
            }
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.FALSE)) {
                return;
            }
        }
        SecModel secModel2 = oo0o0Oo.f43515OooOO0;
        if (secModel2 != null) {
            f57174OooO0O0 = true;
            if (secModel2.getAppVirtual()) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OooO00o(null), 3, null);
            }
        }
    }
}
