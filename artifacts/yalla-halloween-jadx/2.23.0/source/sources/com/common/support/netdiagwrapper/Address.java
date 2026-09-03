package com.common.support.netdiagwrapper;

import androidx.compose.foundation.layout.oo000o;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/common/support/netdiagwrapper/Address;", "", ReportItem.RequestKeyHost, "", ReportItem.RequestKeyPort, "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "getPort", "setPort", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "com.common.support.netdiagnosis-wrapper"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Address {

    @NotNull
    private String host;

    @NotNull
    private String port;

    public Address(@NotNull String host, @NotNull String port) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(port, "port");
        this.host = host;
        this.port = port;
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.host;
        }
        if ((i & 2) != 0) {
            str2 = address.port;
        }
        return address.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    @NotNull
    public final Address copy(@NotNull String host, @NotNull String port) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(port, "port");
        return new Address(host, port);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return Intrinsics.areEqual(this.host, address.host) && Intrinsics.areEqual(this.port, address.port);
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getPort() {
        return this.port;
    }

    public int hashCode() {
        return this.port.hashCode() + (this.host.hashCode() * 31);
    }

    public final void setHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final void setPort(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.port = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Address(host=");
        sb.append(this.host);
        sb.append(", port=");
        return oo000o.OooO00o(sb, this.port, ')');
    }

    public /* synthetic */ Address(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
