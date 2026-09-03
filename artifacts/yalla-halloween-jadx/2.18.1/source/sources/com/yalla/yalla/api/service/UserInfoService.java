package com.yalla.yalla.api.service;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.CheckUserInRoomModel;
import com.yalla.yalla.model.HeUserInfoModel;
import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.model.UserEditResult;
import com.yalla.yalla.model.UserVisitorModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/api/service/UserInfoService;", "", "closeMark", "Lcom/yalla/yalla/common/model/ApiResult;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeReportLogs", "getAvatarList", "", "Lcom/yalla/yalla/model/UserDefaultHeadListModel;", "heInformation", "Lcom/yalla/yalla/model/HeUserInfoModel;", "userId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userInBar", "Lcom/yalla/yalla/common/model/CheckUserInRoomModel;", "userInformationEdit", "Lcom/yalla/yalla/model/UserEditResult;", "avatarId", "userVisitorlist", "Lcom/yalla/yalla/model/UserVisitorModel;", "pageIndex", "", "dateSort", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "visitorLogClick", "vid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface UserInfoService {
    @POST("/Webservers/User/CloseMark")
    @Nullable
    Object closeMark(@NotNull Continuation<? super ApiResult<Boolean>> continuation);

    @POST("/Webservers/User/CloseReportLogs")
    @Nullable
    Object closeReportLogs(@NotNull Continuation<? super ApiResult<Boolean>> continuation);

    @GET("/Webservers/User/GetAvatarList")
    @Nullable
    Object getAvatarList(@NotNull Continuation<? super ApiResult<List<UserDefaultHeadListModel>>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/User/HeInformation")
    @Nullable
    Object heInformation(@Query("touserid") long j, @NotNull Continuation<? super ApiResult<HeUserInfoModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/User/UserInBar")
    @Nullable
    Object userInBar(@Query("touserid") long j, @NotNull Continuation<? super ApiResult<CheckUserInRoomModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/User/UserInformationEdit")
    @Nullable
    Object userInformationEdit(@Field("avatarId") long j, @NotNull Continuation<? super ApiResult<UserEditResult>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Messages/UserVisitorlist")
    @Nullable
    Object userVisitorlist(@Query("pageindex") int i, @NotNull @Query("datesort") String str, @NotNull Continuation<? super ApiResult<UserVisitorModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Messages/VisitorLogClick")
    @Nullable
    Object visitorLogClick(@NotNull @Query("vid") String str, @NotNull Continuation<? super ApiResult<Object>> continuation);
}
