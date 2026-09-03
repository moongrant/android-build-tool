package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006#"}, d2 = {"Lcom/yalla/yalla/model/user/UserHeaderFrameModel;", "Ljava/io/Serializable;", "()V", "headframeid", "", "getHeadframeid", "()I", "honorablelevel", "getHonorablelevel", "isweared", "getIsweared", "setIsweared", "(I)V", "localIsSelect", "", "getLocalIsSelect", "()Z", "setLocalIsSelect", "(Z)V", "localTypeModel", "getLocalTypeModel$annotations", "getLocalTypeModel", "setLocalTypeModel", "pic", "", "getPic", "()Ljava/lang/String;", "setPic", "(Ljava/lang/String;)V", "unlocktext", "getUnlocktext", "setUnlocktext", "uptime", "getUptime", "setUptime", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserHeaderFrameModel implements Serializable {
    public static final int $stable = 8;
    private final int headframeid;
    private final int honorablelevel;
    private int isweared;
    private boolean localIsSelect;
    private int localTypeModel;

    @Nullable
    private String pic;

    @Nullable
    private String unlocktext;

    @Nullable
    private String uptime;

    public static /* synthetic */ void getLocalTypeModel$annotations() {
    }

    public final int getHeadframeid() {
        return this.headframeid;
    }

    public final int getHonorablelevel() {
        return this.honorablelevel;
    }

    public final int getIsweared() {
        return this.isweared;
    }

    public final boolean getLocalIsSelect() {
        return this.localIsSelect;
    }

    public final int getLocalTypeModel() {
        return this.localTypeModel;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getUnlocktext() {
        return this.unlocktext;
    }

    @Nullable
    public final String getUptime() {
        return this.uptime;
    }

    public final void setIsweared(int i) {
        this.isweared = i;
    }

    public final void setLocalIsSelect(boolean z) {
        this.localIsSelect = z;
    }

    public final void setLocalTypeModel(int i) {
        this.localTypeModel = i;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setUnlocktext(@Nullable String str) {
        this.unlocktext = str;
    }

    public final void setUptime(@Nullable String str) {
        this.uptime = str;
    }
}
