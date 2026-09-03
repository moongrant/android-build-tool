package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/GifConfigJson;", "", "id", "", "name", "", "png", "gif", "lowestVip", "lowestKAVIP", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getGif", "()Ljava/lang/String;", "getId", "()I", "getLowestKAVIP", "setLowestKAVIP", "(I)V", "getLowestVip", "getName", "getPng", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GifConfigJson {
    public static final int $stable = 8;

    @NotNull
    private final String gif;
    private final int id;
    private int lowestKAVIP;
    private final int lowestVip;

    @NotNull
    private final String name;

    @NotNull
    private final String png;

    public GifConfigJson(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2, int i3) {
        com.facebook.OooO00o.OooO0O0(str, "name", str2, "png", str3, "gif");
        this.id = i;
        this.name = str;
        this.png = str2;
        this.gif = str3;
        this.lowestVip = i2;
        this.lowestKAVIP = i3;
    }

    public static /* synthetic */ GifConfigJson copy$default(GifConfigJson gifConfigJson, int i, String str, String str2, String str3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = gifConfigJson.id;
        }
        if ((i4 & 2) != 0) {
            str = gifConfigJson.name;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = gifConfigJson.png;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            str3 = gifConfigJson.gif;
        }
        String str6 = str3;
        if ((i4 & 16) != 0) {
            i2 = gifConfigJson.lowestVip;
        }
        int i5 = i2;
        if ((i4 & 32) != 0) {
            i3 = gifConfigJson.lowestKAVIP;
        }
        return gifConfigJson.copy(i, str4, str5, str6, i5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPng() {
        return this.png;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGif() {
        return this.gif;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLowestVip() {
        return this.lowestVip;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLowestKAVIP() {
        return this.lowestKAVIP;
    }

    @NotNull
    public final GifConfigJson copy(int id, @NotNull String name, @NotNull String png, @NotNull String gif, int lowestVip, int lowestKAVIP) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(png, "png");
        Intrinsics.checkNotNullParameter(gif, "gif");
        return new GifConfigJson(id, name, png, gif, lowestVip, lowestKAVIP);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GifConfigJson)) {
            return false;
        }
        GifConfigJson gifConfigJson = (GifConfigJson) other;
        return this.id == gifConfigJson.id && Intrinsics.areEqual(this.name, gifConfigJson.name) && Intrinsics.areEqual(this.png, gifConfigJson.png) && Intrinsics.areEqual(this.gif, gifConfigJson.gif) && this.lowestVip == gifConfigJson.lowestVip && this.lowestKAVIP == gifConfigJson.lowestKAVIP;
    }

    @NotNull
    public final String getGif() {
        return this.gif;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLowestKAVIP() {
        return this.lowestKAVIP;
    }

    public final int getLowestVip() {
        return this.lowestVip;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPng() {
        return this.png;
    }

    public int hashCode() {
        return ((o0O0O00.OooO00o(this.gif, o0O0O00.OooO00o(this.png, o0O0O00.OooO00o(this.name, this.id * 31, 31), 31), 31) + this.lowestVip) * 31) + this.lowestKAVIP;
    }

    public final void setLowestKAVIP(int i) {
        this.lowestKAVIP = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("GifConfigJson(id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", name=");
        sbOooO0o0.append(this.name);
        sbOooO0o0.append(", png=");
        sbOooO0o0.append(this.png);
        sbOooO0o0.append(", gif=");
        sbOooO0o0.append(this.gif);
        sbOooO0o0.append(", lowestVip=");
        sbOooO0o0.append(this.lowestVip);
        sbOooO0o0.append(", lowestKAVIP=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.lowestKAVIP, ')');
    }
}
