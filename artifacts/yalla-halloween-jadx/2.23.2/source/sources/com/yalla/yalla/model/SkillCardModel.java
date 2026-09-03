package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00188FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00188FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0010\u0010 \u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/yalla/yalla/model/SkillCardModel;", "", "()V", "balance", "", "getBalance", "()J", "setBalance", "(J)V", "cardType", "", "getCardType", "()I", "setCardType", "(I)V", "code", "getCode", "setCode", "differtype", "getDiffertype", "setDiffertype", "from", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "newFrom", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "getNewFrom", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "setNewFrom", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;)V", "newTarget", "getNewTarget", "setNewTarget", "target", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SkillCardModel {
    public static final int CARD_TYPE_CRAZY_WORDS = 2;
    public static final int CARD_TYPE_HATS = 1;
    public static final int CARD_TYPE_VOICE_CHANGE = 3;
    private long balance;
    private int cardType;
    private int code;
    private int differtype;

    @Nullable
    private RoomUserInfoDTO from;

    @Nullable
    private transient RoomUserInfoModel newFrom;

    @Nullable
    private transient RoomUserInfoModel newTarget;

    @Nullable
    private RoomUserInfoDTO target;
    public static final int $stable = 8;

    public final long getBalance() {
        return this.balance;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getDiffertype() {
        return this.differtype;
    }

    @Nullable
    public final RoomUserInfoModel getNewFrom() {
        if (this.newFrom == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.from;
            this.newFrom = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newFrom;
    }

    @Nullable
    public final RoomUserInfoModel getNewTarget() {
        if (this.newTarget == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.target;
            this.newTarget = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newTarget;
    }

    public final void setBalance(long j) {
        this.balance = j;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setDiffertype(int i) {
        this.differtype = i;
    }

    public final void setNewFrom(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newFrom = roomUserInfoModel;
    }

    public final void setNewTarget(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newTarget = roomUserInfoModel;
    }
}
