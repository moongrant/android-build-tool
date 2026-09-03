package com.yallatech.support.platform.base.bean;

import OooO00o.OooO00o;
import androidx.annotation.Keep;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001c\u0010\u0004R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001d\u0010\u0004¨\u0006 "}, d2 = {"Lcom/yallatech/support/platform/base/bean/BridgeBean;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "Lcom/yallatech/support/platform/base/bean/BridgeFunction;", "component4", "()Lcom/yallatech/support/platform/base/bean/BridgeFunction;", "bridge", "api", NativeProtocol.WEB_DIALOG_PARAMS, "callback", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yallatech/support/platform/base/bean/BridgeFunction;)Lcom/yallatech/support/platform/base/bean/BridgeBean;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApi", "Lcom/yallatech/support/platform/base/bean/BridgeFunction;", "getCallback", "getBridge", "getParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yallatech/support/platform/base/bean/BridgeFunction;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BridgeBean {

    @NotNull
    private final String api;

    @NotNull
    private final String bridge;

    @NotNull
    private final BridgeFunction callback;

    @NotNull
    private final String params;

    public BridgeBean(@NotNull String bridge, @NotNull String api, @NotNull String params, @NotNull BridgeFunction callback) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.bridge = bridge;
        this.api = api;
        this.params = params;
        this.callback = callback;
    }

    public static /* synthetic */ BridgeBean copy$default(BridgeBean bridgeBean, String str, String str2, String str3, BridgeFunction bridgeFunction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bridgeBean.bridge;
        }
        if ((i & 2) != 0) {
            str2 = bridgeBean.api;
        }
        if ((i & 4) != 0) {
            str3 = bridgeBean.params;
        }
        if ((i & 8) != 0) {
            bridgeFunction = bridgeBean.callback;
        }
        return bridgeBean.copy(str, str2, str3, bridgeFunction);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBridge() {
        return this.bridge;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApi() {
        return this.api;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParams() {
        return this.params;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BridgeFunction getCallback() {
        return this.callback;
    }

    @NotNull
    public final BridgeBean copy(@NotNull String bridge, @NotNull String api, @NotNull String params, @NotNull BridgeFunction callback) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new BridgeBean(bridge, api, params, callback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BridgeBean)) {
            return false;
        }
        BridgeBean bridgeBean = (BridgeBean) other;
        return Intrinsics.areEqual(this.bridge, bridgeBean.bridge) && Intrinsics.areEqual(this.api, bridgeBean.api) && Intrinsics.areEqual(this.params, bridgeBean.params) && Intrinsics.areEqual(this.callback, bridgeBean.callback);
    }

    @NotNull
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final String getBridge() {
        return this.bridge;
    }

    @NotNull
    public final BridgeFunction getCallback() {
        return this.callback;
    }

    @NotNull
    public final String getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.callback.hashCode() + o0O0O00.OooO00o(this.params, o0O0O00.OooO00o(this.api, this.bridge.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("BridgeBean(bridge=");
        sbOooO0o0.append(this.bridge);
        sbOooO0o0.append(", api=");
        sbOooO0o0.append(this.api);
        sbOooO0o0.append(", params=");
        sbOooO0o0.append(this.params);
        sbOooO0o0.append(", callback=");
        sbOooO0o0.append(this.callback);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
