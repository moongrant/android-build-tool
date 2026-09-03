package com.yalla.yalla.api.service;

import com.app.base.fragment.ContributionFragment;
import com.app.base.model.ReportData;
import com.umeng.analytics.AnalyticsConfig;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.EventTagModel;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.EventCreateStateModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.EventSettingModel;
import com.yalla.yalla.model.EventSubscribeModel;
import com.yalla.yalla.model.RoomEventListModel;
import com.yalla.yalla.model.SquareEventRoomModel;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001Ju\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J1\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001e0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010 J\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001e0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ!\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J1\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001e0\u00032\b\b\u0001\u0010&\u001a\u00020\n2\b\b\u0001\u0010\u001f\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010'J1\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001e0\u00032\b\b\u0001\u0010)\u001a\u00020\n2\b\b\u0001\u0010\u001f\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010'J1\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001e0\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010 J\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001e0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ5\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u00100\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u00101\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u00102J!\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u00104\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u00105J-\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010&\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/yalla/yalla/api/service/EventApiService;", "", "create", "Lcom/yalla/yalla/common/model/ApiResult;", "", "createToken", "", ContributionFragment.ARG_1, "eventName", "keyWord", "", "keyWordText", "pic", AnalyticsConfig.RTD_START_TIME, "endTime", "eventDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "eventId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detail", "Lcom/yalla/yalla/model/EventModel;", "getCreateEventState", "Lcom/yalla/yalla/model/EventCreateStateModel;", "getEventSettingState", "Lcom/yalla/yalla/model/EventSettingModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstByRoom", "", "getHistoryList", "", "pageIndex", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getJoinRoomList", "Lcom/yalla/yalla/model/SquareEventRoomModel;", "getListByRoom", "Lcom/yalla/yalla/model/RoomEventListModel;", "getMineEventList", "type", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSquareEventList", "orderType", "getSubPage", "Lcom/yalla/yalla/common/model/UserInfoModel;", "getTagList", "Lcom/yalla/yalla/common/model/EventTagModel;", "report", "Lcom/app/base/model/ReportData;", "reportType", "content", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEventSettingState", "isAddToCalendar", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeEvent", "Lcom/yalla/yalla/model/EventSubscribeModel;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface EventApiService {
    @FormUrlEncoded
    @POST("/Webservers/Event/Create")
    @Nullable
    Object create(@Field("createToken") @NotNull String str, @Field("RoomId") @NotNull String str2, @Field("EventName") @NotNull String str3, @Field("KeyWord") int i, @Field("KeyWordText") @NotNull String str4, @Field("Pic") @Nullable String str5, @Field("StartTime") long j, @Field("EndTime") long j2, @Field("EventDesc") @Nullable String str6, @NotNull Continuation<? super ApiResult<Long>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Event/Delete")
    @Nullable
    Object delete(@Field("eventId") long j, @NotNull Continuation<? super ApiResult<String>> continuation);

    @GET("/Webservers/Event/GetInfo")
    @Nullable
    Object detail(@Query("eventid") long j, @NotNull Continuation<? super ApiResult<EventModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Event/CreateBefore")
    @Nullable
    Object getCreateEventState(@Field(ContributionFragment.ARG_1) long j, @NotNull Continuation<? super ApiResult<EventCreateStateModel>> continuation);

    @GET("Webservers/Event/GetConfig")
    @Nullable
    Object getEventSettingState(@NotNull Continuation<? super ApiResult<EventSettingModel>> continuation);

    @GET("Webservers/Event/GetFirstByRoom")
    @Nullable
    Object getFirstByRoom(@Query(ContributionFragment.ARG_1) long j, @NotNull Continuation<? super ApiResult<Boolean>> continuation);

    @GET("/Webservers/Event/GetHistoryList")
    @Nullable
    Object getHistoryList(@Query("roomid") long j, @Query("pageIndex") int i, @NotNull Continuation<? super ApiResult<List<EventModel>>> continuation);

    @GET("/Webservers/Event/GetJoinRoomList")
    @Nullable
    Object getJoinRoomList(@NotNull Continuation<? super ApiResult<List<SquareEventRoomModel>>> continuation);

    @GET("/Webservers/Event/GetListByRoom")
    @Nullable
    Object getListByRoom(@Query("roomid") long j, @NotNull Continuation<? super ApiResult<RoomEventListModel>> continuation);

    @GET("/Webservers/Event/GetMyList")
    @Nullable
    Object getMineEventList(@Query("type") int i, @Query("pageindex") int i2, @NotNull Continuation<? super ApiResult<List<EventModel>>> continuation);

    @GET("/Webservers/Event/GetList")
    @Nullable
    Object getSquareEventList(@Query("ordertype") int i, @Query("pageindex") int i2, @NotNull Continuation<? super ApiResult<List<EventModel>>> continuation);

    @GET("Webservers/Event/GetSubPage")
    @Nullable
    Object getSubPage(@Query("eventid") long j, @Query("pageIndex") int i, @NotNull Continuation<? super ApiResult<List<UserInfoModel>>> continuation);

    @GET("/Webservers/Event/GetTagList")
    @Nullable
    Object getTagList(@NotNull Continuation<? super ApiResult<List<EventTagModel>>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Event/Report")
    @Nullable
    Object report(@Field("reportType") @NotNull String str, @Field("eventId") long j, @Field("content") @NotNull String str2, @NotNull Continuation<? super ApiResult<ReportData>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Event/SetConfig")
    @Nullable
    Object setEventSettingState(@Field("isAddToCalendar") int i, @NotNull Continuation<? super ApiResult<EventSettingModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Event/Subscribe")
    @Nullable
    Object subscribeEvent(@Field("eventId") long j, @Field("type") int i, @NotNull Continuation<? super ApiResult<EventSubscribeModel>> continuation);
}
