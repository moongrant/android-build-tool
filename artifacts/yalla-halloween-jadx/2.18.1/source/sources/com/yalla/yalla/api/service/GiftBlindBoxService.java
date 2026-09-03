package com.yalla.yalla.api.service;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.GiftBlindBoxRecordModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/api/service/GiftBlindBoxService;", "", "getGiftBlindBoxRecordList", "Lcom/yalla/yalla/common/model/ApiResult;", "", "Lcom/yalla/yalla/model/GiftBlindBoxRecordModel;", "pageIndex", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface GiftBlindBoxService {
    @GET("/Webservers/giftBlindBox/giftBlindBoxRecordList")
    @Nullable
    Object getGiftBlindBoxRecordList(@Query("pageindex") int i, @NotNull Continuation<? super ApiResult<List<GiftBlindBoxRecordModel>>> continuation);
}
