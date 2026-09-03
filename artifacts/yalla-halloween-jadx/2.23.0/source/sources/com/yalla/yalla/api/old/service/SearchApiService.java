package com.yalla.yalla.api.old.service;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomMemberListModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\nJ7\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011JU\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\t2\b\b\u0003\u0010\u0015\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J1\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/api/old/service/SearchApiService;", "", "barSearch", "Lcom/yalla/yalla/model/http/ApiResult;", "", "Lcom/yalla/yalla/model/room/RoomIndexModel;", ViewHierarchyConstants.TEXT_KEY, "", "pageIndex", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBatchRoomMemberList", "Lcom/yalla/yalla/model/room/RoomMemberListModel;", "", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", ContributionFragment.ARG_1, "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSingleBarSearch", "search", "pageSize", "source", "(JLjava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userSearch", "Lcom/yalla/yalla/model/user/UserInfoModel;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SearchApiService {
    @GET("/Webservers/bar/barsearch")
    @Nullable
    Object barSearch(@NotNull @Query("search") String str, @Query("pageindex") int i, @NotNull Continuation<? super ApiResult<List<RoomIndexModel>>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Bar/BatchRoomMemberList")
    @Nullable
    Object getBatchRoomMemberList(@Query("barid") long j, @Query("pageindex") int i, @NotNull Continuation<? super ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Bar/SingleBarSearch")
    @Nullable
    Object getSingleBarSearch(@Query("barid") long j, @NotNull @Query("search") String str, @Query("pageindex") int i, @Query("pagesize") int i2, @Query("source") int i3, @NotNull Continuation<? super ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>> continuation);

    @GET("/Webservers/Messages/UserSearch")
    @Nullable
    Object userSearch(@NotNull @Query("search") String str, @Query("pageindex") int i, @NotNull Continuation<? super ApiResult<List<UserInfoModel>>> continuation);
}
