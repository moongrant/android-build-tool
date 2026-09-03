package com.yalla.yalla.model;

import androidx.compose.animation.OooO0O0;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, d2 = {"Lcom/yalla/yalla/model/RandomRoomModel;", "", "barId", "", "barIdx", "roomServerIP", "websocketaddr", "barName", "barLevel", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBarId", "()Ljava/lang/String;", "setBarId", "(Ljava/lang/String;)V", "getBarIdx", "setBarIdx", "getBarLevel", "setBarLevel", "getBarName", "setBarName", "getRoomServerIP", "setRoomServerIP", "getSessionId", "setSessionId", "getWebsocketaddr", "setWebsocketaddr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RandomRoomModel {
    public static final int $stable = 8;

    @NotNull
    private String barId;

    @NotNull
    private String barIdx;

    @NotNull
    private String barLevel;

    @NotNull
    private String barName;

    @NotNull
    private String roomServerIP;

    @NotNull
    private String sessionId;

    @NotNull
    private String websocketaddr;

    public RandomRoomModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ RandomRoomModel copy$default(RandomRoomModel randomRoomModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = randomRoomModel.barId;
        }
        if ((i & 2) != 0) {
            str2 = randomRoomModel.barIdx;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = randomRoomModel.roomServerIP;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = randomRoomModel.websocketaddr;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = randomRoomModel.barName;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = randomRoomModel.barLevel;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = randomRoomModel.sessionId;
        }
        return randomRoomModel.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBarId() {
        return this.barId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBarIdx() {
        return this.barIdx;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoomServerIP() {
        return this.roomServerIP;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWebsocketaddr() {
        return this.websocketaddr;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBarName() {
        return this.barName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBarLevel() {
        return this.barLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final RandomRoomModel copy(@NotNull String barId, @NotNull String barIdx, @NotNull String roomServerIP, @NotNull String websocketaddr, @NotNull String barName, @NotNull String barLevel, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(barId, "barId");
        Intrinsics.checkNotNullParameter(barIdx, "barIdx");
        Intrinsics.checkNotNullParameter(roomServerIP, "roomServerIP");
        Intrinsics.checkNotNullParameter(websocketaddr, "websocketaddr");
        Intrinsics.checkNotNullParameter(barName, "barName");
        Intrinsics.checkNotNullParameter(barLevel, "barLevel");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new RandomRoomModel(barId, barIdx, roomServerIP, websocketaddr, barName, barLevel, sessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RandomRoomModel)) {
            return false;
        }
        RandomRoomModel randomRoomModel = (RandomRoomModel) other;
        return Intrinsics.areEqual(this.barId, randomRoomModel.barId) && Intrinsics.areEqual(this.barIdx, randomRoomModel.barIdx) && Intrinsics.areEqual(this.roomServerIP, randomRoomModel.roomServerIP) && Intrinsics.areEqual(this.websocketaddr, randomRoomModel.websocketaddr) && Intrinsics.areEqual(this.barName, randomRoomModel.barName) && Intrinsics.areEqual(this.barLevel, randomRoomModel.barLevel) && Intrinsics.areEqual(this.sessionId, randomRoomModel.sessionId);
    }

    @NotNull
    public final String getBarId() {
        return this.barId;
    }

    @NotNull
    public final String getBarIdx() {
        return this.barIdx;
    }

    @NotNull
    public final String getBarLevel() {
        return this.barLevel;
    }

    @NotNull
    public final String getBarName() {
        return this.barName;
    }

    @NotNull
    public final String getRoomServerIP() {
        return this.roomServerIP;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getWebsocketaddr() {
        return this.websocketaddr;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + OooO0O0.OooO00o(this.barLevel, OooO0O0.OooO00o(this.barName, OooO0O0.OooO00o(this.websocketaddr, OooO0O0.OooO00o(this.roomServerIP, OooO0O0.OooO00o(this.barIdx, this.barId.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final void setBarId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.barId = str;
    }

    public final void setBarIdx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.barIdx = str;
    }

    public final void setBarLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.barLevel = str;
    }

    public final void setBarName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.barName = str;
    }

    public final void setRoomServerIP(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomServerIP = str;
    }

    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setWebsocketaddr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.websocketaddr = str;
    }

    @NotNull
    public String toString() {
        String str = this.barId;
        String str2 = this.barIdx;
        String str3 = this.roomServerIP;
        String str4 = this.websocketaddr;
        String str5 = this.barName;
        String str6 = this.barLevel;
        String str7 = this.sessionId;
        StringBuilder sbOooO00o = OooO0OO.OooO00o("RandomRoomModel(barId=", str, ", barIdx=", str2, ", roomServerIP=");
        OooO0OO.OooO0O0.OooO00o(sbOooO00o, str3, ", websocketaddr=", str4, ", barName=");
        OooO0OO.OooO0O0.OooO00o(sbOooO00o, str5, ", barLevel=", str6, ", sessionId=");
        return o0oOO.OooO0O0(sbOooO00o, str7, ")");
    }

    public RandomRoomModel(@NotNull String barId, @NotNull String barIdx, @NotNull String roomServerIP, @NotNull String websocketaddr, @NotNull String barName, @NotNull String barLevel, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(barId, "barId");
        Intrinsics.checkNotNullParameter(barIdx, "barIdx");
        Intrinsics.checkNotNullParameter(roomServerIP, "roomServerIP");
        Intrinsics.checkNotNullParameter(websocketaddr, "websocketaddr");
        Intrinsics.checkNotNullParameter(barName, "barName");
        Intrinsics.checkNotNullParameter(barLevel, "barLevel");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.barId = barId;
        this.barIdx = barIdx;
        this.roomServerIP = roomServerIP;
        this.websocketaddr = websocketaddr;
        this.barName = barName;
        this.barLevel = barLevel;
        this.sessionId = sessionId;
    }

    public /* synthetic */ RandomRoomModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
