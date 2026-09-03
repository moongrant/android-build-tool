package com.yalla.yalla.api.service;

import com.app.base.fragment.ContributionFragment;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.model.VoteModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ1\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/api/service/VoteApiService;", "", "getVoteActivityDetail", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/VoteDetailModel;", ContributionFragment.ARG_1, "", "voteId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVoteActivityHistory", "", "Lcom/yalla/yalla/model/VoteModel;", "pageIndex", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVoteGiftList", "Lcom/yalla/yalla/model/VoteGameGift;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVoteRank", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface VoteApiService {
    @GET("Webservers/vote/GetVoteActivityDetail")
    @Nullable
    Object getVoteActivityDetail(@Query(ContributionFragment.ARG_1) long j, @Query("voteId") long j2, @NotNull Continuation<? super ApiResult<VoteDetailModel>> continuation);

    @GET("/Webservers/vote/GetVoteActivityHistory")
    @Nullable
    Object getVoteActivityHistory(@Query(ContributionFragment.ARG_1) long j, @Query("pageindex") int i, @NotNull Continuation<? super ApiResult<List<VoteModel>>> continuation);

    @GET("Webservers/vote/GetGiftList")
    @Nullable
    Object getVoteGiftList(@NotNull Continuation<? super ApiResult<List<VoteGameGift>>> continuation);

    @GET("Webservers/vote/GetRank")
    @Nullable
    Object getVoteRank(@Query(ContributionFragment.ARG_1) long j, @Query("voteId") long j2, @NotNull Continuation<? super ApiResult<VoteDetailModel>> continuation);
}
