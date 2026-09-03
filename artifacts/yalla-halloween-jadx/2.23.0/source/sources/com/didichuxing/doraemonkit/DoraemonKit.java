package com.didichuxing.doraemonkit;

import android.app.Application;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.didichuxing.doraemonkit.kit.core.McClientProcessor;
import com.didichuxing.doraemonkit.kit.network.okhttp.interceptor.DokitExtInterceptor;
import com.didichuxing.doraemonkit.kit.webdoor.WebDoorManager;
import com.qiniu.android.collect.ReportItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J@\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2.\u0010\u0010\u001a*\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011j\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012`\u0014H\u0007JH\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2.\u0010\u0010\u001a*\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011j\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012`\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007J&\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u001c\u0010\u001b\u001a\u00020\b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0007J\u0010\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020(H\u0007J\u0012\u0010)\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010*H\u0007J\b\u0010+\u001a\u00020\bH\u0007J\b\u0010,\u001a\u00020\bH\u0007R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0003\u0010\u0006¨\u0006-"}, d2 = {"Lcom/didichuxing/doraemonkit/DoraemonKit;", "", "()V", "isShow", "", "isShow$annotations", "()Z", "disableUpload", "", "hide", "hideToolPanel", "install", "app", "Landroid/app/Application;", "productId", "", "mapKits", "Ljava/util/LinkedHashMap;", "", "Lcom/didichuxing/doraemonkit/kit/AbstractKit;", "Lkotlin/collections/LinkedHashMap;", "listKits", "setAlwaysShowMainIcon", "alwaysShow", "setCallBack", "callback", "Lcom/didichuxing/doraemonkit/DoKitCallBack;", "setDatabasePass", "map", "", "setDebug", "debug", "setFileManagerHttpPort", ReportItem.RequestKeyPort, "", "setMCIntercept", "interceptor", "Lcom/didichuxing/doraemonkit/kit/core/McClientProcessor;", "setNetExtInterceptor", "extInterceptorProxy", "Lcom/didichuxing/doraemonkit/kit/network/okhttp/interceptor/DokitExtInterceptor$DokitExtInterceptorProxy;", "setWebDoorCallback", "Lcom/didichuxing/doraemonkit/kit/webdoor/WebDoorManager$WebDoorCallback;", "show", "showToolPanel", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public final class DoraemonKit {

    @NotNull
    public static final DoraemonKit INSTANCE = new DoraemonKit();

    private DoraemonKit() {
    }

    @JvmStatic
    public static final void disableUpload() {
    }

    @JvmStatic
    public static final void hide() {
    }

    @JvmStatic
    public static final void hideToolPanel() {
    }

    @JvmStatic
    public static final void install(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
    }

    public static final boolean isShow() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void isShow$annotations() {
    }

    @JvmStatic
    public static final void setAlwaysShowMainIcon(boolean alwaysShow) {
    }

    @JvmStatic
    public static final void setCallBack(@NotNull DoKitCallBack callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @JvmStatic
    public static final void setDatabasePass(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
    }

    @JvmStatic
    public static final void setDebug(boolean debug) {
    }

    @JvmStatic
    public static final void setFileManagerHttpPort(int port) {
    }

    @JvmStatic
    public static final void setMCIntercept(@NotNull McClientProcessor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
    }

    @JvmStatic
    public static final void setNetExtInterceptor(@NotNull DokitExtInterceptor.DokitExtInterceptorProxy extInterceptorProxy) {
        Intrinsics.checkNotNullParameter(extInterceptorProxy, "extInterceptorProxy");
    }

    @JvmStatic
    public static final void setWebDoorCallback(@Nullable WebDoorManager.WebDoorCallback callback) {
    }

    @JvmStatic
    public static final void show() {
    }

    @JvmStatic
    public static final void showToolPanel() {
    }

    @JvmStatic
    public static final void install(@NotNull Application app, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(productId, "productId");
    }

    @JvmStatic
    public static final void install(@NotNull Application app, @NotNull LinkedHashMap<String, List<AbstractKit>> mapKits) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(mapKits, "mapKits");
    }

    @JvmStatic
    public static final void install(@NotNull Application app, @NotNull LinkedHashMap<String, List<AbstractKit>> mapKits, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(mapKits, "mapKits");
        Intrinsics.checkNotNullParameter(productId, "productId");
    }

    @JvmStatic
    public static final void install(@NotNull Application app, @NotNull List<AbstractKit> listKits) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(listKits, "listKits");
    }

    @JvmStatic
    public static final void install(@NotNull Application app, @NotNull List<AbstractKit> listKits, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(listKits, "listKits");
        Intrinsics.checkNotNullParameter(productId, "productId");
    }
}
