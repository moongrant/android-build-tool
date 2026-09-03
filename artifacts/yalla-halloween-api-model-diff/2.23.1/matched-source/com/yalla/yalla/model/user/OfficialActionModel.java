package com.yalla.yalla.model.user;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p425o0OoO0OO.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0007\u0018\u0000 22\u00020\u0001:\u000223B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00101\u001a\u00020\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R+\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0002R \u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001e\u0010'\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012R\u001e\u0010)\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R \u0010+\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010.\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\b¨\u00064"}, d2 = {"Lcom/yalla/yalla/model/user/OfficialActionModel;", "Ljava/io/Serializable;", "()V", "activityId", "", "getActivityId", "()I", "setActivityId", "(I)V", "buttonBgUrl", "", "getButtonBgUrl$annotations", "<set-?>", "", "defaultIsShowButton", "getDefaultIsShowButton", "()Z", "setDefaultIsShowButton", "(Z)V", "defaultIsShowButton$delegate", "Landroidx/compose/runtime/MutableState;", "defaultIsShowDialog", "getDefaultIsShowDialog", "setDefaultIsShowDialog", "defaultIsShowDialog$delegate", "defaultIsShowPopUp", "getDefaultIsShowPopUp", "setDefaultIsShowPopUp", "defaultIsShowPopUp$delegate", "dialogTitle", "getDialogTitle$annotations", "entranceImgUrl", "getEntranceImgUrl", "()Ljava/lang/String;", "setEntranceImgUrl", "(Ljava/lang/String;)V", "h5EntranceUrl", "getH5EntranceUrl", "setH5EntranceUrl", "isShowEntrance", "setShowEntrance", "isShowPopUp", "setShowPopUp", "popUpImgUrl", "getPopUpImgUrl", "setPopUpImgUrl", "type", "getType", "setType", "refresh", "Companion", "Type", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOfficialActionModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfficialActionModel.kt\ncom/yalla/yalla/model/user/OfficialActionModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,92:1\n81#2:93\n107#2,2:94\n81#2:96\n107#2,2:97\n81#2:99\n107#2,2:100\n*S KotlinDebug\n*F\n+ 1 OfficialActionModel.kt\ncom/yalla/yalla/model/user/OfficialActionModel\n*L\n64#1:93\n64#1:94,2\n68#1:96\n68#1:97,2\n72#1:99\n72#1:100,2\n*E\n"})
public final class OfficialActionModel implements Serializable {
    private int activityId;

    /* JADX INFO: renamed from: defaultIsShowButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState defaultIsShowButton;

    /* JADX INFO: renamed from: defaultIsShowDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState defaultIsShowDialog;

    /* JADX INFO: renamed from: defaultIsShowPopUp$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState defaultIsShowPopUp;

    @SerializedName("isShowEntrance")
    private boolean isShowEntrance;

    @SerializedName("isShowPopUp")
    private boolean isShowPopUp;
    private int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @SerializedName("popUpImgUrl")
    @Nullable
    private String popUpImgUrl = "";

    @SerializedName("entranceImgUrl")
    @Nullable
    private String entranceImgUrl = "";

    @SerializedName("h5EntranceUrl")
    @Nullable
    private String h5EntranceUrl = "";

    @SerializedName("popUpTitle")
    @Nullable
    private String dialogTitle = "";

    @SerializedName("popUpBtnImgUrl")
    @Nullable
    private String buttonBgUrl = "";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/model/user/OfficialActionModel$Companion;", "", "()V", "test", "Lcom/yalla/yalla/model/user/OfficialActionModel;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OfficialActionModel test() {
            OfficialActionModel officialActionModel = new OfficialActionModel();
            officialActionModel.setPopUpImgUrl("");
            officialActionModel.setH5EntranceUrl("");
            officialActionModel.setType(1);
            officialActionModel.setActivityId(0);
            return officialActionModel;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/model/user/OfficialActionModel$Type;", "", "()V", "OfficialAction", "", "UserReturnReward", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        public static final int $stable = 0;

        @NotNull
        public static final Type INSTANCE = new Type();
        public static final int OfficialAction = 1;
        public static final int UserReturnReward = 0;

        private Type() {
        }
    }

    public OfficialActionModel() {
        Boolean bool = Boolean.FALSE;
        this.defaultIsShowButton = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.defaultIsShowDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.defaultIsShowPopUp = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Deprecated(message = "不用")
    private static /* synthetic */ void getButtonBgUrl$annotations() {
    }

    @Deprecated(message = "不用")
    private static /* synthetic */ void getDialogTitle$annotations() {
    }

    private final void setDefaultIsShowButton(boolean z) {
        this.defaultIsShowButton.setValue(Boolean.valueOf(z));
    }

    private final void setDefaultIsShowDialog(boolean z) {
        this.defaultIsShowDialog.setValue(Boolean.valueOf(z));
    }

    private final void setDefaultIsShowPopUp(boolean z) {
        this.defaultIsShowPopUp.setValue(Boolean.valueOf(z));
    }

    public final int getActivityId() {
        return this.activityId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDefaultIsShowButton() {
        return ((Boolean) this.defaultIsShowButton.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDefaultIsShowDialog() {
        return ((Boolean) this.defaultIsShowDialog.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDefaultIsShowPopUp() {
        return ((Boolean) this.defaultIsShowPopUp.getValue()).booleanValue();
    }

    @Nullable
    public final String getEntranceImgUrl() {
        return this.entranceImgUrl;
    }

    @Nullable
    public final String getH5EntranceUrl() {
        return this.h5EntranceUrl;
    }

    @Nullable
    public final String getPopUpImgUrl() {
        return this.popUpImgUrl;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isShowEntrance, reason: from getter */
    public final boolean getIsShowEntrance() {
        return this.isShowEntrance;
    }

    /* JADX INFO: renamed from: isShowPopUp, reason: from getter */
    public final boolean getIsShowPopUp() {
        return this.isShowPopUp;
    }

    @NotNull
    public final OfficialActionModel refresh() {
        setDefaultIsShowButton(this.isShowEntrance && oOO00O.OooO0o(this.entranceImgUrl) && oOO00O.OooO0o(this.h5EntranceUrl));
        setDefaultIsShowDialog(this.isShowPopUp && oOO00O.OooO0o(this.popUpImgUrl));
        setDefaultIsShowPopUp(this.isShowPopUp);
        return this;
    }

    public final void setActivityId(int i) {
        this.activityId = i;
    }

    public final void setEntranceImgUrl(@Nullable String str) {
        this.entranceImgUrl = str;
    }

    public final void setH5EntranceUrl(@Nullable String str) {
        this.h5EntranceUrl = str;
    }

    public final void setPopUpImgUrl(@Nullable String str) {
        this.popUpImgUrl = str;
    }

    public final void setShowEntrance(boolean z) {
        this.isShowEntrance = z;
    }

    public final void setShowPopUp(boolean z) {
        this.isShowPopUp = z;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
