package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentEditBefore;", "Ljava/io/Serializable;", "()V", "dyId", "", "getDyId", "()J", "setDyId", "(J)V", "editMaxNum", "", "getEditMaxNum", "()I", "setEditMaxNum", "(I)V", "editToken", "", "getEditToken", "()Ljava/lang/String;", "setEditToken", "(Ljava/lang/String;)V", "editedNum", "getEditedNum", "setEditedNum", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentEditBefore implements Serializable {
    public static final int $stable = 8;
    private long dyId;

    @SerializedName("maxEditNum")
    private int editMaxNum;

    @NotNull
    private String editToken = "";
    private int editedNum;

    public final long getDyId() {
        return this.dyId;
    }

    public final int getEditMaxNum() {
        return this.editMaxNum;
    }

    @NotNull
    public final String getEditToken() {
        return this.editToken;
    }

    public final int getEditedNum() {
        return this.editedNum;
    }

    public final void setDyId(long j) {
        this.dyId = j;
    }

    public final void setEditMaxNum(int i) {
        this.editMaxNum = i;
    }

    public final void setEditToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editToken = str;
    }

    public final void setEditedNum(int i) {
        this.editedNum = i;
    }
}
