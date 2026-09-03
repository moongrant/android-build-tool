package com.app.base.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.db.table.UserInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lcom/app/base/model/UserInfoModelNew;", "Lcom/yalla/yalla/common/db/table/UserInfo;", "()V", "hePullBlack", "", "getHePullBlack", "()I", "setHePullBlack", "(I)V", "inroom", "", "getInroom", "()J", "setInroom", "(J)V", "isfollow", "getIsfollow", "setIsfollow", "isfriend", "getIsfriend", "setIsfriend", "pullblack", "getPullblack", "setPullblack", "regtime", "", "getRegtime", "()Ljava/lang/String;", "setRegtime", "(Ljava/lang/String;)V", "timestamp", "getTimestamp", "setTimestamp", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserInfoModelNew extends UserInfo {
    public static final int $stable = 8;
    private int hePullBlack;
    private long inroom;
    private int isfollow;
    private int isfriend;
    private int pullblack;

    @Nullable
    private String regtime;
    private long timestamp;

    public final int getHePullBlack() {
        return this.hePullBlack;
    }

    public final long getInroom() {
        return this.inroom;
    }

    public final int getIsfollow() {
        return this.isfollow;
    }

    public final int getIsfriend() {
        return this.isfriend;
    }

    public final int getPullblack() {
        return this.pullblack;
    }

    @Nullable
    public final String getRegtime() {
        return this.regtime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setHePullBlack(int i) {
        this.hePullBlack = i;
    }

    public final void setInroom(long j) {
        this.inroom = j;
    }

    public final void setIsfollow(int i) {
        this.isfollow = i;
    }

    public final void setIsfriend(int i) {
        this.isfriend = i;
    }

    public final void setPullblack(int i) {
        this.pullblack = i;
    }

    public final void setRegtime(@Nullable String str) {
        this.regtime = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }
}
