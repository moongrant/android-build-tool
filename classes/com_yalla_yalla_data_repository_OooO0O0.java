package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.result.ApiResult;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nActivityCenterRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityCenterRepo.kt\ncom/yalla/yalla/data/repository/ActivityCenterRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,15:1\n91#2,14:16\n*S KotlinDebug\n*F\n+ 1 ActivityCenterRepo.kt\ncom/yalla/yalla/data/repository/ActivityCenterRepo\n*L\n14#1:16,14\n*E\n"})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f47315OooO00o = new OooO0O0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(int i, @NotNull ContinuationImpl continuationImpl) {
        ActivityCenterRepo$getActivityList$1 activityCenterRepo$getActivityList$1;
        com.yalla.yalla.api.call.OooO oooO;
        if (continuationImpl instanceof ActivityCenterRepo$getActivityList$1) {
            activityCenterRepo$getActivityList$1 = (ActivityCenterRepo$getActivityList$1) continuationImpl;
            int i2 = activityCenterRepo$getActivityList$1.f46026OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activityCenterRepo$getActivityList$1.f46026OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                activityCenterRepo$getActivityList$1 = new ActivityCenterRepo$getActivityList$1(this, continuationImpl);
            }
        } else {
            activityCenterRepo$getActivityList$1 = new ActivityCenterRepo$getActivityList$1(this, continuationImpl);
        }
        Object objOooO0Oo = activityCenterRepo$getActivityList$1.f46025OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = activityCenterRepo$getActivityList$1.f46026OooOO0;
        if (i3 == 0) {
            com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(com.yalla.yalla.api.old.Oooo0.OooO0OO(objOooO0Oo, "/Webservers/Messages/GetActivityListForCenter", "url"), 0);
            oooO2.OooO0Oo(Boxing.boxInt(i), "isExploreIndex");
            ActivityCenterRepo$getActivityList$$inlined$call$1 activityCenterRepo$getActivityList$$inlined$call$1 = new ActivityCenterRepo$getActivityList$$inlined$call$1(oooO2, null);
            activityCenterRepo$getActivityList$1.f46024OooO0oO = oooO2;
            activityCenterRepo$getActivityList$1.f46026OooOO0 = 1;
            objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(activityCenterRepo$getActivityList$$inlined$call$1, activityCenterRepo$getActivityList$1);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO = oooO2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO = activityCenterRepo$getActivityList$1.f46024OooO0oO;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
        }
        return apiResult;
    }
}
