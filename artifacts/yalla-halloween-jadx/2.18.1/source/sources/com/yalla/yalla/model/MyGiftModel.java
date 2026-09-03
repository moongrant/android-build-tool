package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/model/MyGiftModel;", "Ljava/io/Serializable;", "()V", "Data", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MyGiftModel implements Serializable {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001e\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u000e\u0010 \u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u000e\u0010*\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\b¨\u00061"}, d2 = {"Lcom/yalla/yalla/model/MyGiftModel$Data;", "", "()V", "giftid", "", "getGiftid", "()I", "setGiftid", "(I)V", "imageurl", "", "getImageurl", "()Ljava/lang/String;", "setImageurl", "(Ljava/lang/String;)V", "isShowUpgrade", "", "()Z", "setShowUpgrade", "(Z)V", "name", "getName", "setName", "price", "getPrice", "setPrice", "propNum", "getPropNum", "setPropNum", "propType", "getPropType", "setPropType", "propUserType", "propimage", "getPropimage", "setPropimage", "region", "getRegion", "setRegion", ServerProtocol.DIALOG_PARAM_STATE, "getState", "setState", "subType", "type", "getType", "setType", "iGiftCustomMade", "isGiftBlind", "isGiftMember", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Data {
        public static final int $stable = 8;
        private int giftid;
        private boolean isShowUpgrade;

        @Nullable
        private String name;

        @SerializedName("propnum")
        private int propNum;
        private int propType;
        private int propUserType;
        private int region;
        private int state;
        private int subType;
        private int type;

        @NotNull
        private String propimage = "";

        @NotNull
        private String imageurl = "";

        @NotNull
        private String price = "";

        public final int getGiftid() {
            return this.giftid;
        }

        @NotNull
        public final String getImageurl() {
            return this.imageurl;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPrice() {
            return this.price;
        }

        public final int getPropNum() {
            return this.propNum;
        }

        public final int getPropType() {
            return this.propType;
        }

        @NotNull
        public final String getPropimage() {
            return this.propimage;
        }

        public final int getRegion() {
            return this.region;
        }

        public final int getState() {
            return this.state;
        }

        public final int getType() {
            return this.type;
        }

        public final boolean iGiftCustomMade() {
            return this.type == 5;
        }

        public final boolean isGiftBlind() {
            return this.subType == 1;
        }

        public final boolean isGiftMember() {
            return this.propUserType == GiftPropTypeUser.Member.getValue();
        }

        /* JADX INFO: renamed from: isShowUpgrade, reason: from getter */
        public final boolean getIsShowUpgrade() {
            return this.isShowUpgrade;
        }

        public final void setGiftid(int i) {
            this.giftid = i;
        }

        public final void setImageurl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.imageurl = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setPrice(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.price = str;
        }

        public final void setPropNum(int i) {
            this.propNum = i;
        }

        public final void setPropType(int i) {
            this.propType = i;
        }

        public final void setPropimage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.propimage = str;
        }

        public final void setRegion(int i) {
            this.region = i;
        }

        public final void setShowUpgrade(boolean z) {
            this.isShowUpgrade = z;
        }

        public final void setState(int i) {
            this.state = i;
        }

        public final void setType(int i) {
            this.type = i;
        }
    }
}
