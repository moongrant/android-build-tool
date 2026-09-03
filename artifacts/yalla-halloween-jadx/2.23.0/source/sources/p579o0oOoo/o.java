package p579o0oOoo;

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
import p140o00OOooo.OooOO0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p382o0OOoo0o.o00Ooo;
import p464o0Oooo.o000000O;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o f56514OooO00o = new o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f56515OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.util.AppVirtualManager$check$1$1", f = "AppVirtualManager.kt", i = {}, l = {30, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56516OooO0Oo;

        /* JADX INFO: renamed from: o0oOoo.o$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.util.AppVirtualManager$check$1$1$1", f = "AppVirtualManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0511OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f56517OooO0Oo;

            public C0511OooO00o(Continuation<? super C0511OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0511OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new C0511OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f56517OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    oO00o0.OooO00o();
                    this.f56517OooO0Oo = 1;
                    if (DelayKt.delay(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                OooOOO0.OooO0OO("AppComplianceCheck", "killApp exitProcess");
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
            int i = this.f56516OooO0Oo;
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
            o oVar = o.f56514OooO00o;
            this.f56516OooO0Oo = 1;
            obj = o.OooO00o(oVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                C0511OooO00o c0511OooO00o = new C0511OooO00o(null);
                this.f56516OooO0Oo = 2;
                if (OooOOO.OooO0o0(c0511OooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(o oVar, Continuation continuation) {
        oO00000 oo00000;
        oVar.getClass();
        if (continuation instanceof oO00000) {
            oo00000 = (oO00000) continuation;
            int i = oo00000.f56523OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo00000.f56523OooO0o = i - Integer.MIN_VALUE;
            } else {
                oo00000 = new oO00000(oVar, continuation);
            }
        } else {
            oo00000 = new oO00000(oVar, continuation);
        }
        Object objOooO0Oo = oo00000.f56522OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oo00000.f56523OooO0o;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            SecModel secModel = o00Ooo.f44292OooOO0;
            if (secModel != null && secModel.getAppVirtual()) {
                UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
                String strOooO00o = OooOO0.OooO00o(o00Ooo.f44292OooOO0);
                oo00000.f56523OooO0o = 1;
                userInfoRepo.getClass();
                String url = o000OOo0.OooO0OO("/Webservers/User/ReportSafetyData");
                Intrinsics.checkNotNullParameter(url, "url");
                o0O0ooO o0o0ooo = new o0O0ooO(url, 1);
                o0o0ooo.OooO0O0(strOooO00o, "SafetyData");
                objOooO0Oo = OooOOO.OooO0Oo(new UserInfoRepo$reportSafetyData$$inlined$call$1(o0o0ooo, null), oo00000);
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
        SecModel secModel = o00Ooo.f44292OooOO0;
        OooOOO0.OooO0O0("AppVirtualManager appVirtual = " + (secModel != null ? Boolean.valueOf(secModel.getAppVirtual()) : null));
        if (!z) {
            if (f56515OooO0O0) {
                return;
            }
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.FALSE)) {
                return;
            }
        }
        SecModel secModel2 = o00Ooo.f44292OooOO0;
        if (secModel2 != null) {
            f56515OooO0O0 = true;
            if (secModel2.getAppVirtual()) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OooO00o(null), 3, null);
            }
        }
    }
}
