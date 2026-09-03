package com.yalla.yalla.model.user;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.bean.AbsJavaBean;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u00020\u0000J\u000e\u00101\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0017J\u000e\u00103\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004J\u0010\u00104\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(J\u0010\u00105\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010(J\u0010\u00106\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010(R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001d\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010!\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u001e\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R&\u0010%\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0002\u001a\u0004\b'\u0010\u0013R\"\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0016\u001a\u0004\u0018\u00010(@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\"\u0010,\u001a\u0004\u0018\u00010(2\b\u0010\u0016\u001a\u0004\u0018\u00010(@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\"\u0010.\u001a\u0004\u0018\u00010(2\b\u0010\u0016\u001a\u0004\u0018\u00010(@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+¨\u00067"}, d2 = {"Lcom/yalla/yalla/model/user/UserHeadFrameModel;", "Lcom/yalla/yalla/model/bean/AbsJavaBean;", "()V", "dayNum", "", "getDayNum", "()Ljava/lang/Integer;", "setDayNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "expireTime", "", "getExpireTime", "()Ljava/lang/Long;", "setExpireTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "headframeid", "getHeadframeid", "()I", "honorablelevel", "getHonorablelevel", "<set-?>", "", "isLocalIsSelect", "()Z", "setLocalIsSelect", "(Z)V", "isLocalIsSelect$delegate", "Landroidx/compose/runtime/MutableState;", "isLocalSelectUnLock", "setLocalSelectUnLock", "isLocalSelectUnLock$delegate", "isUnLock", "setUnLock", "isweared", "getIsweared", "localTypeModel", "getLocalTypeModel$annotations", "getLocalTypeModel", "", "pic", "getPic", "()Ljava/lang/String;", "unlocktext", "getUnlocktext", "uptime", "getUptime", "localClearIsSelect", "setIsweared", "localSelectUnLock", "setLocalTypeModel", "setPic", "setUnlocktext", "setUptime", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserHeadFrameModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserHeadFrameModel.kt\ncom/yalla/yalla/model/user/UserHeadFrameModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,142:1\n81#2:143\n107#2,2:144\n81#2:146\n107#2,2:147\n*S KotlinDebug\n*F\n+ 1 UserHeadFrameModel.kt\ncom/yalla/yalla/model/user/UserHeadFrameModel\n*L\n62#1:143\n62#1:144,2\n68#1:146\n68#1:147,2\n*E\n"})
public final class UserHeadFrameModel extends AbsJavaBean {
    public static final int $stable = 8;

    @Nullable
    private Integer dayNum = -1;

    @Nullable
    private Long expireTime;
    private final int headframeid;
    private final int honorablelevel;

    /* JADX INFO: renamed from: isLocalIsSelect$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isLocalIsSelect;

    /* JADX INFO: renamed from: isLocalSelectUnLock$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isLocalSelectUnLock;
    private boolean isUnLock;
    private int isweared;
    private int localTypeModel;

    @Nullable
    private String pic;

    @Nullable
    private String unlocktext;

    @Nullable
    private String uptime;

    public UserHeadFrameModel() {
        Boolean bool = Boolean.FALSE;
        this.isLocalIsSelect = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLocalSelectUnLock = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public static /* synthetic */ void getLocalTypeModel$annotations() {
    }

    private final void setLocalIsSelect(boolean z) {
        this.isLocalIsSelect.setValue(Boolean.valueOf(z));
    }

    private final void setLocalSelectUnLock(boolean z) {
        this.isLocalSelectUnLock.setValue(Boolean.valueOf(z));
    }

    @Nullable
    public final Integer getDayNum() {
        return this.dayNum;
    }

    @Nullable
    public final Long getExpireTime() {
        return this.expireTime;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLocalIsSelect() {
        return ((Boolean) this.isLocalIsSelect.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLocalSelectUnLock() {
        return ((Boolean) this.isLocalSelectUnLock.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: isUnLock, reason: from getter */
    public final boolean getIsUnLock() {
        return this.isUnLock;
    }

    @NotNull
    public final UserHeadFrameModel localClearIsSelect() {
        setLocalIsSelect(false);
        setLocalSelectUnLock(false);
        return this;
    }

    public final void setDayNum(@Nullable Integer num) {
        this.dayNum = num;
    }

    public final void setExpireTime(@Nullable Long l) {
        this.expireTime = l;
    }

    @NotNull
    public final UserHeadFrameModel setIsweared(int isweared) {
        this.isweared = isweared;
        return this;
    }

    @NotNull
    public final UserHeadFrameModel setLocalTypeModel(int localTypeModel) {
        this.localTypeModel = localTypeModel;
        return this;
    }

    @NotNull
    public final UserHeadFrameModel setPic(@Nullable String pic) {
        this.pic = pic;
        return this;
    }

    public final void setUnLock(boolean z) {
        this.isUnLock = z;
    }

    @NotNull
    public final UserHeadFrameModel setUnlocktext(@Nullable String unlocktext) {
        this.unlocktext = unlocktext;
        return this;
    }

    @NotNull
    public final UserHeadFrameModel setUptime(@Nullable String uptime) {
        this.uptime = uptime;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: setLocalSelectUnLock, reason: collision with other method in class */
    public final UserHeadFrameModel m4197setLocalSelectUnLock(boolean localSelectUnLock) {
        setLocalIsSelect(true);
        setLocalSelectUnLock(localSelectUnLock);
        return this;
    }
}
