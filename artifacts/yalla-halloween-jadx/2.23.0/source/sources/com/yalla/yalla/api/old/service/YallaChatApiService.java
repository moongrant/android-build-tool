package com.yalla.yalla.api.old.service;

import com.yalla.yalla.model.FriendChatModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicGroupCreateModel;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.model.topic.TopicGroupJoinModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/api/old/service/YallaChatApiService;", "", "bindChatCreateGroup", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/topic/TopicGroupCreateModel;", "circleId", "", "code", "", "type", "", "(JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindChatFriendChat", "Lcom/yalla/yalla/model/FriendChatModel;", "friendId", "bindChatJoinGroup", "Lcom/yalla/yalla/model/topic/TopicGroupJoinModel;", "circleGroupInfo", "Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createGroup", "friendChat", "joinGroup", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface YallaChatApiService {
    @FormUrlEncoded
    @POST("/Webservers/chat/BindChatCreateGroup")
    @Nullable
    Object bindChatCreateGroup(@Field("circleId") long j, @Field("code") @NotNull String str, @Field("type") int i, @NotNull Continuation<? super ApiResult<TopicGroupCreateModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/chat/BindChatFriendChat")
    @Nullable
    Object bindChatFriendChat(@Field("friendId") long j, @Field("code") @NotNull String str, @Field("type") int i, @NotNull Continuation<? super ApiResult<FriendChatModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/chat/BindChatJoinGroup")
    @Nullable
    Object bindChatJoinGroup(@Field("circleId") long j, @Field("code") @NotNull String str, @Field("type") int i, @NotNull Continuation<? super ApiResult<TopicGroupJoinModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/chat/circleGroupInfo")
    @Nullable
    Object circleGroupInfo(@Field("circleId") long j, @NotNull Continuation<? super ApiResult<TopicGroupInfoModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/chat/CreateGroup")
    @Nullable
    Object createGroup(@Field("circleId") long j, @NotNull Continuation<? super ApiResult<TopicGroupCreateModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/chat/FriendChat")
    @Nullable
    Object friendChat(@Field("friendId") long j, @NotNull Continuation<? super ApiResult<FriendChatModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/chat/JoinGroup")
    @Nullable
    Object joinGroup(@Field("circleId") long j, @NotNull Continuation<? super ApiResult<TopicGroupJoinModel>> continuation);
}
