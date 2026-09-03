package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/VipModel;", "", "()V", "experience", "", "getExperience", "()J", "setExperience", "(J)V", "kaVipLv", "", "getKaVipLv", "()I", "setKaVipLv", "(I)V", "privilegeCount", "getPrivilegeCount", "setPrivilegeCount", "privilegeData", "", "Lcom/yalla/yalla/model/ItemVipModel;", "getPrivilegeData", "()Ljava/util/List;", "setPrivilegeData", "(Ljava/util/List;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VipModel {
    public static final int $stable = 8;
    private long experience;

    @SerializedName("kavipLv")
    private int kaVipLv;
    private int privilegeCount;

    @Nullable
    private List<ItemVipModel> privilegeData;

    public final long getExperience() {
        return this.experience;
    }

    public final int getKaVipLv() {
        return this.kaVipLv;
    }

    public final int getPrivilegeCount() {
        return this.privilegeCount;
    }

    @Nullable
    public final List<ItemVipModel> getPrivilegeData() {
        return this.privilegeData;
    }

    public final void setExperience(long j) {
        this.experience = j;
    }

    public final void setKaVipLv(int i) {
        this.kaVipLv = i;
    }

    public final void setPrivilegeCount(int i) {
        this.privilegeCount = i;
    }

    public final void setPrivilegeData(@Nullable List<ItemVipModel> list) {
        this.privilegeData = list;
    }
}
