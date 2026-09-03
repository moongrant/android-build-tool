package com.common.support.zeus;

import androidx.compose.foundation.layout.oo000o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001fJ\t\u0010 \u001a\u00020\u0003HÖ\u0001R$\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/common/support/zeus/ZeusEntity;", "", "xZeus", "", "xHera", "xTime", "", "xShield", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "<set-?>", "encryptedPostBody", "getEncryptedPostBody", "()Ljava/lang/String;", "setEncryptedPostBody$signv2_release", "(Ljava/lang/String;)V", "getXHera", "getXShield", "getXTime", "()J", "getXZeus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "headers", "", "toString", "signv2_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ZeusEntity {

    @NotNull
    private String encryptedPostBody;

    @NotNull
    private final String xHera;

    @Nullable
    private final String xShield;
    private final long xTime;

    @NotNull
    private final String xZeus;

    public ZeusEntity(@NotNull String xZeus, @NotNull String xHera, long j, @Nullable String str) {
        Intrinsics.checkNotNullParameter(xZeus, "xZeus");
        Intrinsics.checkNotNullParameter(xHera, "xHera");
        this.xZeus = xZeus;
        this.xHera = xHera;
        this.xTime = j;
        this.xShield = str;
        this.encryptedPostBody = "";
    }

    public static /* synthetic */ ZeusEntity copy$default(ZeusEntity zeusEntity, String str, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zeusEntity.xZeus;
        }
        if ((i & 2) != 0) {
            str2 = zeusEntity.xHera;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = zeusEntity.xTime;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = zeusEntity.xShield;
        }
        return zeusEntity.copy(str, str4, j2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getXZeus() {
        return this.xZeus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getXHera() {
        return this.xHera;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getXTime() {
        return this.xTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getXShield() {
        return this.xShield;
    }

    @NotNull
    public final ZeusEntity copy(@NotNull String xZeus, @NotNull String xHera, long xTime, @Nullable String xShield) {
        Intrinsics.checkNotNullParameter(xZeus, "xZeus");
        Intrinsics.checkNotNullParameter(xHera, "xHera");
        return new ZeusEntity(xZeus, xHera, xTime, xShield);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZeusEntity)) {
            return false;
        }
        ZeusEntity zeusEntity = (ZeusEntity) other;
        return Intrinsics.areEqual(this.xZeus, zeusEntity.xZeus) && Intrinsics.areEqual(this.xHera, zeusEntity.xHera) && this.xTime == zeusEntity.xTime && Intrinsics.areEqual(this.xShield, zeusEntity.xShield);
    }

    @NotNull
    public final String getEncryptedPostBody() {
        return this.encryptedPostBody;
    }

    @NotNull
    public final String getXHera() {
        return this.xHera;
    }

    @Nullable
    public final String getXShield() {
        return this.xShield;
    }

    public final long getXTime() {
        return this.xTime;
    }

    @NotNull
    public final String getXZeus() {
        return this.xZeus;
    }

    public int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.xHera, this.xZeus.hashCode() * 31, 31);
        long j = this.xTime;
        int i = (iOooO00o + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.xShield;
        return i + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final Map<String, String> headers() {
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(new Pair(ConstKt.X_ZEUS, this.xZeus), new Pair(ConstKt.X_HERA, this.xHera), new Pair(ConstKt.X_TIME, String.valueOf(this.xTime)));
        String str = this.xShield;
        if (str != null) {
            mapMutableMapOf.put(ConstKt.X_SHIELD, str);
        }
        return mapMutableMapOf;
    }

    public final void setEncryptedPostBody$signv2_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.encryptedPostBody = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ZeusEntity(xZeus=");
        sb.append(this.xZeus);
        sb.append(", xHera=");
        sb.append(this.xHera);
        sb.append(", xTime=");
        sb.append(this.xTime);
        sb.append(", xShield=");
        return oo000o.OooO00o(sb, this.xShield, ')');
    }

    public /* synthetic */ ZeusEntity(String str, String str2, long j, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? null : str3);
    }
}
