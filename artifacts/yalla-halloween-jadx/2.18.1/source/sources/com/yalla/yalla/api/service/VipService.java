package com.yalla.yalla.api.service;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipExperienceDetailModel;
import com.yalla.yalla.model.VipModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\b\b\u0001\u0010\r\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/api/service/VipService;", "", "changeKAVIPStealthVisit", "Lcom/yalla/yalla/common/model/ApiResult;", "", "changeType", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeKaVipShowState", "changeShowPremiumFirst", "getKaVipExperienceDetails", "", "Lcom/yalla/yalla/model/VipExperienceDetailModel;", "pageIndex", "getKaVipPrivilege", "Lcom/yalla/yalla/model/VipModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPersonalKaVip", "Lcom/yalla/yalla/model/PersonalVipModel;", "updateKaVipDialogState", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface VipService {
    @FormUrlEncoded
    @POST("/Webservers/User/ChangeKAVIPStealthVisit?")
    @Nullable
    Object changeKAVIPStealthVisit(@Field("changeType") int i, @NotNull Continuation<? super ApiResult<String>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/User/ChangeKAVIPShowState")
    @Nullable
    Object changeKaVipShowState(@Field("changeType") int i, @NotNull Continuation<? super ApiResult<String>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/User/ChangePremiumFirstState")
    @Nullable
    Object changeShowPremiumFirst(@Field("changeType") int i, @NotNull Continuation<? super ApiResult<String>> continuation);

    @GET("/Webservers/User/KAVIPExperienceDetails")
    @Nullable
    Object getKaVipExperienceDetails(@Query("pageindex") int i, @NotNull Continuation<? super ApiResult<List<VipExperienceDetailModel>>> continuation);

    @GET("/Webservers/User/KAVIPPrivilege")
    @Nullable
    Object getKaVipPrivilege(@NotNull Continuation<? super ApiResult<List<VipModel>>> continuation);

    @GET("/Webservers/User/UserKAVIPInfo")
    @Nullable
    Object getPersonalKaVip(@NotNull Continuation<? super ApiResult<PersonalVipModel>> continuation);

    @POST("/Webservers/User/SetUserKAVIPLvPopUpFlag")
    @Nullable
    Object updateKaVipDialogState(@NotNull Continuation<? super ApiResult<String>> continuation);
}
