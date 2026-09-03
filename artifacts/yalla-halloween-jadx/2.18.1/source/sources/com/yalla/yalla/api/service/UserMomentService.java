package com.yalla.yalla.api.service;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.ReportPublishModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/api/service/UserMomentService;", "", "reportPublish", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/ReportPublishModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface UserMomentService {
    @POST("/Webservers/Moment/ReportPublish")
    @Nullable
    Object reportPublish(@NotNull Continuation<? super ApiResult<ReportPublishModel>> continuation);
}
