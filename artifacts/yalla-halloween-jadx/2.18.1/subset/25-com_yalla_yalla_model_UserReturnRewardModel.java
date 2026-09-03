package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u000fR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R \u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0002R \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006 "}, d2 = {"Lcom/yalla/yalla/model/UserReturnRewardModel;", "Ljava/io/Serializable;", "()V", "actionH5Url", "", "getActionH5Url", "()Ljava/lang/String;", "setActionH5Url", "(Ljava/lang/String;)V", "buttonBgUrl", "getButtonBgUrl$annotations", "dialogBgUrl", "getDialogBgUrl", "setDialogBgUrl", "dialogIsShow", "", "getDialogIsShow", "()Z", "setDialogIsShow", "(Z)V", "dialogTitle", "getDialogTitle$annotations", "entranceImgUrl", "getEntranceImgUrl", "setEntranceImgUrl", "entranceIsShow", "getEntranceIsShow", "setEntranceIsShow", "isShowingLocal", "setShowingLocal", "defaultIsShowButton", "defaultIsShowDialog", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserReturnRewardModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("isShowPopUp")
    private boolean dialogIsShow;

    @SerializedName("isShowEntrance")
    private boolean entranceIsShow;
    private boolean isShowingLocal;

    @SerializedName("popUpImgUrl")
    @Nullable
    private String dialogBgUrl = "";

    @SerializedName("entranceImgUrl")
    @Nullable
    private String entranceImgUrl = "";

    @SerializedName("h5EntranceUrl")
    @Nullable
    private String actionH5Url = "";

    @SerializedName("popUpTitle")
    @Nullable
    private String dialogTitle = "";

    @SerializedName("popUpBtnImgUrl")
    @Nullable
    private String buttonBgUrl = "";

    @Deprecated(message = "不用")
    private static /* synthetic */ void getButtonBgUrl$annotations() {
    }

    @Deprecated(message = "不用")
    private static /* synthetic */ void getDialogTitle$annotations() {
    }

    public final boolean defaultIsShowButton() {
        return this.entranceIsShow && o00O0.OooO0o0(this.entranceImgUrl) && o00O0.OooO0o0(this.actionH5Url);
    }

    public final boolean defaultIsShowDialog() {
        return this.dialogIsShow && o00O0.OooO0o0(this.dialogBgUrl) && o00O0.OooO0o0(this.actionH5Url);
    }

    @Nullable
    public final String getActionH5Url() {
        return this.actionH5Url;
    }

    @Nullable
    public final String getDialogBgUrl() {
        return this.dialogBgUrl;
    }

    public final boolean getDialogIsShow() {
        return this.dialogIsShow;
    }

    @Nullable
    public final String getEntranceImgUrl() {
        return this.entranceImgUrl;
    }

    public final boolean getEntranceIsShow() {
        return this.entranceIsShow;
    }

    /* JADX INFO: renamed from: isShowingLocal, reason: from getter */
    public final boolean getIsShowingLocal() {
        return this.isShowingLocal;
    }

    public final void setActionH5Url(@Nullable String str) {
        this.actionH5Url = str;
    }

    public final void setDialogBgUrl(@Nullable String str) {
        this.dialogBgUrl = str;
    }

    public final void setDialogIsShow(boolean z) {
        this.dialogIsShow = z;
    }

    public final void setEntranceImgUrl(@Nullable String str) {
        this.entranceImgUrl = str;
    }

    public final void setEntranceIsShow(boolean z) {
        this.entranceIsShow = z;
    }

    public final void setShowingLocal(boolean z) {
        this.isShowingLocal = z;
    }
}
