package com.yalla.yalla.api.service;

import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.FollowTopicModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.model.TopicTypeTagModel;
import com.yalla.yalla.model.TopicVerifyState;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ;\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015JG\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\u00112\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J1\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J;\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u001f\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010 J;\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u001f\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010 J'\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010#\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ!\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/yalla/yalla/api/service/TopicApiService;", "", "circleAdmin", "Lcom/yalla/yalla/common/model/ApiResult;", "", "Lcom/yalla/yalla/common/db/table/UserInfo;", "circleId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleAdminIns", "toUserId", "type", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleJoinIns", "Lcom/yalla/yalla/model/FollowTopicModel;", "circleid", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleMemberList", "Lcom/yalla/yalla/model/TopicTypeTagModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pageIndex", "dateSort", "pageSize", "(Ljava/lang/String;IJLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleNewList", "Lcom/yalla/yalla/model/TopicInfoModel;", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circlePersonRecommendList", "circleRecommendList", "typeId", "(IIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleRecommendTypeList", "circleSearch", "search", "circleUserVerify", "Lcom/yalla/yalla/model/TopicVerifyState;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface TopicApiService {

    public static final class OooO00o {
    }

    @GET("/Webservers/Circle/CircleAdmin")
    @Nullable
    Object circleAdmin(@NotNull @Query("circleid") String str, @NotNull Continuation<? super ApiResult<List<UserInfo>>> continuation);

    @GET("/Webservers/Circle/CircleAdminIns")
    @Nullable
    Object circleAdminIns(@NotNull @Query("touserid") String str, @NotNull @Query("circleid") String str2, @Query("type") int i, @NotNull Continuation<? super ApiResult<List<UserInfo>>> continuation);

    @GET("/Webservers/Circle/CircleJoinIns")
    @Nullable
    Object circleJoinIns(@Query("circleid") long j, @Query("type") int i, @NotNull Continuation<? super ApiResult<FollowTopicModel>> continuation);

    @GET("/Webservers/Circle/CircleMemberlist")
    @Nullable
    Object circleMemberList(@NotNull @Query("circleid") String str, @Query("pageindex") int i, @Query("datesort") long j, @Nullable @Query("pagesize") Integer num, @NotNull Continuation<? super ApiResult<List<UserInfo>>> continuation);

    @GET("/Webservers/Circle/CircleTypeConfigList")
    @Nullable
    Object circleMemberList(@NotNull Continuation<? super ApiResult<List<TopicTypeTagModel>>> continuation);

    @GET("/Webservers/Circle/CircleNewList")
    @Nullable
    Object circleNewList(@Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<TopicInfoModel>>> continuation);

    @GET("/Webservers/Circle/CirclePersonRecommendList")
    @Nullable
    Object circlePersonRecommendList(@NotNull Continuation<? super ApiResult<List<TopicInfoModel>>> continuation);

    @GET("/Webservers/Circle/CircleRecommendList")
    @Nullable
    Object circleRecommendList(@Query("pageindex") int i, @Query("pagesize") int i2, @Query("typeid") long j, @NotNull Continuation<? super ApiResult<List<TopicInfoModel>>> continuation);

    @GET("/Webservers/Circle/CircleRecommendTypeList")
    @Nullable
    Object circleRecommendTypeList(@Query("pageindex") int i, @Query("pagesize") int i2, @Query("typeid") long j, @NotNull Continuation<? super ApiResult<List<TopicInfoModel>>> continuation);

    @GET("/Webservers/Circle/CircleSearch")
    @Nullable
    Object circleSearch(@NotNull @Query("search") String str, @NotNull Continuation<? super ApiResult<List<TopicInfoModel>>> continuation);

    @GET("/Webservers/Circle/CircleUserVerify")
    @Nullable
    Object circleUserVerify(@Query("circleid") long j, @NotNull Continuation<? super ApiResult<TopicVerifyState>> continuation);
}
