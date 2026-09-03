package com.yalla.yalla.api.old.service;

import com.yalla.yalla.model.LiveRoomMemberRoomRankModel;
import com.yalla.yalla.model.LiveRoomMemberUserRankModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomMemberHostTaskModel;
import com.yalla.yalla.model.room.RoomMemberTaskModel;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0013H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/api/old/service/RoomApiService;", "", "getMemberInfo", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/room/RoomMemberTaskModel;", ContributionFragment.ARG_1, "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRoomTeamWeekRankData", "Lcom/yalla/yalla/model/LiveRoomMemberRoomRankModel;", "RoomId", "IsOwner", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskInfo", "Lcom/yalla/yalla/model/room/RoomMemberHostTaskModel;", "getUserRankData", "Lcom/yalla/yalla/model/LiveRoomMemberUserRankModel;", "rankType", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RoomApiService {
    @GET("/Webservers/RoomTeam/GetMemberInfo")
    @Nullable
    Object getMemberInfo(@Query("RoomId") long j, @NotNull Continuation<? super ApiResult<RoomMemberTaskModel>> continuation);

    @GET("/Webservers/RoomTeam/GetRoomTeamWeekRankData")
    @Nullable
    Object getRoomTeamWeekRankData(@Query("RoomId") long j, @Query("IsOwner") boolean z, @NotNull Continuation<? super ApiResult<LiveRoomMemberRoomRankModel>> continuation);

    @GET("/Webservers/RoomTeam/GetTaskInfo")
    @Nullable
    Object getTaskInfo(@Query("RoomId") long j, @NotNull Continuation<? super ApiResult<RoomMemberHostTaskModel>> continuation);

    @GET("/Webservers/RoomTeam/GetUserRankData")
    @Nullable
    Object getUserRankData(@Query("RoomId") long j, @Query("RankType") int i, @NotNull Continuation<? super ApiResult<LiveRoomMemberUserRankModel>> continuation);
}
