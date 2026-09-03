package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/model/VoteDetailModel;", "", "()V", "currentUserVoteCount", "", "getCurrentUserVoteCount", "()I", "setCurrentUserVoteCount", "(I)V", "isHasStop", "", "()Z", "setHasStop", "(Z)V", "rank", "", "Lcom/yalla/yalla/model/VoteRankModel;", "getRank", "()Ljava/util/List;", "setRank", "(Ljava/util/List;)V", "voteActivity", "Lcom/yalla/yalla/model/VoteModel;", "getVoteActivity", "()Lcom/yalla/yalla/model/VoteModel;", "setVoteActivity", "(Lcom/yalla/yalla/model/VoteModel;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VoteDetailModel {
    public static final int $stable = 8;
    private int currentUserVoteCount;
    private boolean isHasStop;

    @Nullable
    private List<VoteRankModel> rank;

    @Nullable
    private VoteModel voteActivity;

    public final int getCurrentUserVoteCount() {
        return this.currentUserVoteCount;
    }

    @Nullable
    public final List<VoteRankModel> getRank() {
        return this.rank;
    }

    @Nullable
    public final VoteModel getVoteActivity() {
        return this.voteActivity;
    }

    /* JADX INFO: renamed from: isHasStop, reason: from getter */
    public final boolean getIsHasStop() {
        return this.isHasStop;
    }

    public final void setCurrentUserVoteCount(int i) {
        this.currentUserVoteCount = i;
    }

    public final void setHasStop(boolean z) {
        this.isHasStop = z;
    }

    public final void setRank(@Nullable List<VoteRankModel> list) {
        this.rank = list;
    }

    public final void setVoteActivity(@Nullable VoteModel voteModel) {
        this.voteActivity = voteModel;
    }
}
