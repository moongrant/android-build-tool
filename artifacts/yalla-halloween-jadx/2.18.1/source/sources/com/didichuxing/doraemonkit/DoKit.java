package com.didichuxing.doraemonkit;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.didichuxing.doraemonkit.constant.WSMode;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.didichuxing.doraemonkit.kit.core.AbsDokitView;
import com.didichuxing.doraemonkit.kit.core.BaseFragment;
import com.didichuxing.doraemonkit.kit.core.DoKitViewLaunchMode;
import com.didichuxing.doraemonkit.kit.core.McClientProcessor;
import com.didichuxing.doraemonkit.kit.network.okhttp.interceptor.DokitExtInterceptor;
import com.didichuxing.doraemonkit.kit.webdoor.WebDoorManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.qiniu.android.collect.ReportItem;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/didichuxing/doraemonkit/DoKit;", "", "()V", "Builder", "Companion", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public final class DoKit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DoKit";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J6\u0010\u0015\u001a\u00020\u00002.\u0010\b\u001a*\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\tj\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\u000bJ\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u0000J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R6\u0010\b\u001a*\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\tj\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/didichuxing/doraemonkit/DoKit$Builder;", "", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "listKits", "", "Lcom/didichuxing/doraemonkit/kit/AbstractKit;", "mapKits", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "productId", "alwaysShowMainIcon", "alwaysShow", "", "build", "", "callBack", "callback", "Lcom/didichuxing/doraemonkit/DoKitCallBack;", "customKits", "databasePass", "map", "", com.umeng.umcrash.BuildConfig.BUILD_TYPE, "disableUpload", "fileManagerHttpPort", ReportItem.RequestKeyPort, "", "mcClientProcess", "interceptor", "Lcom/didichuxing/doraemonkit/kit/core/McClientProcessor;", "mcWSPort", "netExtInterceptor", "extInterceptorProxy", "Lcom/didichuxing/doraemonkit/kit/network/okhttp/interceptor/DokitExtInterceptor$DokitExtInterceptorProxy;", "webDoorCallback", "Lcom/didichuxing/doraemonkit/kit/webdoor/WebDoorManager$WebDoorCallback;", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
    public static final class Builder {
        private final Application app;
        private List<? extends AbstractKit> listKits;
        private LinkedHashMap<String, List<AbstractKit>> mapKits;
        private String productId;

        public Builder(@NotNull Application app) {
            Intrinsics.checkNotNullParameter(app, "app");
            this.app = app;
            this.productId = "";
            this.mapKits = new LinkedHashMap<>();
            this.listKits = new ArrayList();
        }

        @NotNull
        public final Builder alwaysShowMainIcon(boolean alwaysShow) {
            return this;
        }

        public final void build() {
        }

        @NotNull
        public final Builder callBack(@NotNull DoKitCallBack callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            return this;
        }

        @NotNull
        public final Builder customKits(@NotNull LinkedHashMap<String, List<AbstractKit>> mapKits) {
            Intrinsics.checkNotNullParameter(mapKits, "mapKits");
            return this;
        }

        @NotNull
        public final Builder customKits(@NotNull List<? extends AbstractKit> listKits) {
            Intrinsics.checkNotNullParameter(listKits, "listKits");
            return this;
        }

        @NotNull
        public final Builder databasePass(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return this;
        }

        @NotNull
        public final Builder debug(boolean debug) {
            return this;
        }

        @NotNull
        public final Builder disableUpload() {
            return this;
        }

        @NotNull
        public final Builder fileManagerHttpPort(int port) {
            return this;
        }

        @NotNull
        public final Builder mcClientProcess(@NotNull McClientProcessor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            return this;
        }

        @NotNull
        public final Builder mcWSPort(int port) {
            return this;
        }

        @NotNull
        public final Builder netExtInterceptor(@NotNull DokitExtInterceptor.DokitExtInterceptorProxy extInterceptorProxy) {
            Intrinsics.checkNotNullParameter(extInterceptorProxy, "extInterceptorProxy");
            return this;
        }

        @NotNull
        public final Builder productId(@NotNull String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            return this;
        }

        @NotNull
        public final Builder webDoorCallback(@NotNull WebDoorManager.WebDoorCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u000fH\u0007¢\u0006\u0002\u0010\u0010J3\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0011H\u0007¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0007J.\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J.\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J:\u0010\u001c\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u0006H\u0007J:\u0010\u001c\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u0006H\u0007J\b\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000bH\u0007J\u0018\u0010#\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u000fH\u0007J\u0018\u0010#\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0011H\u0007J4\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010*H\u0007J\b\u0010+\u001a\u00020\u0014H\u0007J\b\u0010,\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0005\u0010\b¨\u0006-"}, d2 = {"Lcom/didichuxing/doraemonkit/DoKit$Companion;", "", "()V", "TAG", "", "isMainIconShow", "", "isMainIconShow$annotations", "()Z", "getDoKitView", "T", "Lcom/didichuxing/doraemonkit/kit/core/AbsDokitView;", "activity", "Landroid/app/Activity;", "clazz", "Ljava/lang/Class;", "(Landroid/app/Activity;Ljava/lang/Class;)Lcom/didichuxing/doraemonkit/kit/core/AbsDokitView;", "Lkotlin/reflect/KClass;", "(Landroid/app/Activity;Lkotlin/reflect/KClass;)Lcom/didichuxing/doraemonkit/kit/core/AbsDokitView;", "hide", "", "hideToolPanel", "launchFloating", "targetClass", "mode", "Lcom/didichuxing/doraemonkit/kit/core/DoKitViewLaunchMode;", "bundle", "Landroid/os/Bundle;", "launchFullScreen", "Lcom/didichuxing/doraemonkit/kit/core/BaseFragment;", d.R, "Landroid/content/Context;", "isSystemFragment", "mcMode", "Lcom/didichuxing/doraemonkit/constant/WSMode;", "removeFloating", "dokitView", "sendCustomEvent", "eventType", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "param", "", "show", "showToolPanel", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void isMainIconShow$annotations() {
        }

        public static /* synthetic */ void launchFloating$default(Companion companion, Class cls, DoKitViewLaunchMode doKitViewLaunchMode, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                doKitViewLaunchMode = DoKitViewLaunchMode.SINGLE_INSTANCE;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            companion.launchFloating((Class<? extends AbsDokitView>) cls, doKitViewLaunchMode, bundle);
        }

        public static /* synthetic */ void launchFullScreen$default(Companion companion, Class cls, Context context, Bundle bundle, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                context = null;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            companion.launchFullScreen((Class<? extends BaseFragment>) cls, context, bundle, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendCustomEvent$default(Companion companion, String str, View view, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                view = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            companion.sendCustomEvent(str, view, map);
        }

        @JvmStatic
        @Nullable
        public final <T extends AbsDokitView> T getDoKitView(@Nullable Activity activity, @NotNull Class<? extends T> clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return null;
        }

        @JvmStatic
        @Nullable
        public final <T extends AbsDokitView> T getDoKitView(@Nullable Activity activity, @NotNull KClass<? extends T> clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return null;
        }

        @JvmStatic
        public final void hide() {
        }

        @JvmStatic
        public final void hideToolPanel() {
        }

        public final boolean isMainIconShow() {
            return false;
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFloating(@NotNull Class<? extends AbsDokitView> cls) {
            launchFloating$default(this, cls, (DoKitViewLaunchMode) null, (Bundle) null, 6, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFloating(@NotNull Class<? extends AbsDokitView> cls, @NotNull DoKitViewLaunchMode doKitViewLaunchMode) {
            launchFloating$default(this, cls, doKitViewLaunchMode, (Bundle) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFloating(@NotNull Class<? extends AbsDokitView> targetClass, @NotNull DoKitViewLaunchMode mode, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(targetClass, "targetClass");
            Intrinsics.checkNotNullParameter(mode, "mode");
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFloating(@NotNull KClass<? extends AbsDokitView> kClass) {
            launchFloating$default(this, kClass, (DoKitViewLaunchMode) null, (Bundle) null, 6, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFloating(@NotNull KClass<? extends AbsDokitView> kClass, @NotNull DoKitViewLaunchMode doKitViewLaunchMode) {
            launchFloating$default(this, kClass, doKitViewLaunchMode, (Bundle) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFloating(@NotNull KClass<? extends AbsDokitView> targetClass, @NotNull DoKitViewLaunchMode mode, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(targetClass, "targetClass");
            Intrinsics.checkNotNullParameter(mode, "mode");
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFullScreen(@NotNull Class<? extends BaseFragment> cls) {
            launchFullScreen$default(this, (Class) cls, (Context) null, (Bundle) null, false, 14, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFullScreen(@NotNull Class<? extends BaseFragment> cls, @Nullable Context context) {
            launchFullScreen$default(this, (Class) cls, context, (Bundle) null, false, 12, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFullScreen(@NotNull Class<? extends BaseFragment> cls, @Nullable Context context, @Nullable Bundle bundle) {
            launchFullScreen$default(this, (Class) cls, context, bundle, false, 8, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFullScreen(@NotNull Class<? extends BaseFragment> targetClass, @Nullable Context context, @Nullable Bundle bundle, boolean isSystemFragment) {
            Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFullScreen(@NotNull KClass<? extends BaseFragment> kClass) {
            launchFullScreen$default(this, (KClass) kClass, (Context) null, (Bundle) null, false, 14, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFullScreen(@NotNull KClass<? extends BaseFragment> kClass, @Nullable Context context) {
            launchFullScreen$default(this, (KClass) kClass, context, (Bundle) null, false, 12, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFullScreen(@NotNull KClass<? extends BaseFragment> kClass, @Nullable Context context, @Nullable Bundle bundle) {
            launchFullScreen$default(this, (KClass) kClass, context, bundle, false, 8, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final void launchFullScreen(@NotNull KClass<? extends BaseFragment> targetClass, @Nullable Context context, @Nullable Bundle bundle, boolean isSystemFragment) {
            Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        }

        @JvmStatic
        @NotNull
        public final WSMode mcMode() {
            return WSMode.UNKNOW;
        }

        @JvmStatic
        public final void removeFloating(@NotNull AbsDokitView dokitView) {
            Intrinsics.checkNotNullParameter(dokitView, "dokitView");
        }

        @JvmStatic
        public final void removeFloating(@NotNull Class<? extends AbsDokitView> targetClass) {
            Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        }

        @JvmStatic
        public final void removeFloating(@NotNull KClass<? extends AbsDokitView> targetClass) {
            Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        }

        @JvmStatic
        public final void sendCustomEvent(@NotNull String eventType, @Nullable View view, @Nullable Map<String, String> param) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
        }

        @JvmStatic
        public final void show() {
        }

        @JvmStatic
        public final void showToolPanel() {
        }

        public static /* synthetic */ void launchFullScreen$default(Companion companion, KClass kClass, Context context, Bundle bundle, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                context = null;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            companion.launchFullScreen((KClass<? extends BaseFragment>) kClass, context, bundle, z);
        }

        public static /* synthetic */ void launchFloating$default(Companion companion, KClass kClass, DoKitViewLaunchMode doKitViewLaunchMode, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                doKitViewLaunchMode = DoKitViewLaunchMode.SINGLE_INSTANCE;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            companion.launchFloating((KClass<? extends AbsDokitView>) kClass, doKitViewLaunchMode, bundle);
        }
    }

    private DoKit() {
    }

    @JvmStatic
    @Nullable
    public static final <T extends AbsDokitView> T getDoKitView(@Nullable Activity activity, @NotNull Class<? extends T> cls) {
        return (T) INSTANCE.getDoKitView(activity, cls);
    }

    @JvmStatic
    @Nullable
    public static final <T extends AbsDokitView> T getDoKitView(@Nullable Activity activity, @NotNull KClass<? extends T> kClass) {
        return (T) INSTANCE.getDoKitView(activity, kClass);
    }

    @JvmStatic
    public static final void hide() {
        INSTANCE.hide();
    }

    @JvmStatic
    public static final void hideToolPanel() {
        INSTANCE.hideToolPanel();
    }

    public static final boolean isMainIconShow() {
        return INSTANCE.isMainIconShow();
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFloating(@NotNull Class<? extends AbsDokitView> cls) {
        Companion.launchFloating$default(INSTANCE, cls, (DoKitViewLaunchMode) null, (Bundle) null, 6, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFloating(@NotNull Class<? extends AbsDokitView> cls, @NotNull DoKitViewLaunchMode doKitViewLaunchMode) {
        Companion.launchFloating$default(INSTANCE, cls, doKitViewLaunchMode, (Bundle) null, 4, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFloating(@NotNull Class<? extends AbsDokitView> cls, @NotNull DoKitViewLaunchMode doKitViewLaunchMode, @Nullable Bundle bundle) {
        INSTANCE.launchFloating(cls, doKitViewLaunchMode, bundle);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFloating(@NotNull KClass<? extends AbsDokitView> kClass) {
        Companion.launchFloating$default(INSTANCE, kClass, (DoKitViewLaunchMode) null, (Bundle) null, 6, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFloating(@NotNull KClass<? extends AbsDokitView> kClass, @NotNull DoKitViewLaunchMode doKitViewLaunchMode) {
        Companion.launchFloating$default(INSTANCE, kClass, doKitViewLaunchMode, (Bundle) null, 4, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFloating(@NotNull KClass<? extends AbsDokitView> kClass, @NotNull DoKitViewLaunchMode doKitViewLaunchMode, @Nullable Bundle bundle) {
        INSTANCE.launchFloating(kClass, doKitViewLaunchMode, bundle);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFullScreen(@NotNull Class<? extends BaseFragment> cls) {
        Companion.launchFullScreen$default(INSTANCE, (Class) cls, (Context) null, (Bundle) null, false, 14, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFullScreen(@NotNull Class<? extends BaseFragment> cls, @Nullable Context context) {
        Companion.launchFullScreen$default(INSTANCE, (Class) cls, context, (Bundle) null, false, 12, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFullScreen(@NotNull Class<? extends BaseFragment> cls, @Nullable Context context, @Nullable Bundle bundle) {
        Companion.launchFullScreen$default(INSTANCE, (Class) cls, context, bundle, false, 8, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFullScreen(@NotNull Class<? extends BaseFragment> cls, @Nullable Context context, @Nullable Bundle bundle, boolean z) {
        INSTANCE.launchFullScreen(cls, context, bundle, z);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFullScreen(@NotNull KClass<? extends BaseFragment> kClass) {
        Companion.launchFullScreen$default(INSTANCE, (KClass) kClass, (Context) null, (Bundle) null, false, 14, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFullScreen(@NotNull KClass<? extends BaseFragment> kClass, @Nullable Context context) {
        Companion.launchFullScreen$default(INSTANCE, (KClass) kClass, context, (Bundle) null, false, 12, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFullScreen(@NotNull KClass<? extends BaseFragment> kClass, @Nullable Context context, @Nullable Bundle bundle) {
        Companion.launchFullScreen$default(INSTANCE, (KClass) kClass, context, bundle, false, 8, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void launchFullScreen(@NotNull KClass<? extends BaseFragment> kClass, @Nullable Context context, @Nullable Bundle bundle, boolean z) {
        INSTANCE.launchFullScreen(kClass, context, bundle, z);
    }

    @JvmStatic
    @NotNull
    public static final WSMode mcMode() {
        return INSTANCE.mcMode();
    }

    @JvmStatic
    public static final void removeFloating(@NotNull AbsDokitView absDokitView) {
        INSTANCE.removeFloating(absDokitView);
    }

    @JvmStatic
    public static final void removeFloating(@NotNull Class<? extends AbsDokitView> cls) {
        INSTANCE.removeFloating(cls);
    }

    @JvmStatic
    public static final void removeFloating(@NotNull KClass<? extends AbsDokitView> kClass) {
        INSTANCE.removeFloating(kClass);
    }

    @JvmStatic
    public static final void sendCustomEvent(@NotNull String str, @Nullable View view, @Nullable Map<String, String> map) {
        INSTANCE.sendCustomEvent(str, view, map);
    }

    @JvmStatic
    public static final void show() {
        INSTANCE.show();
    }

    @JvmStatic
    public static final void showToolPanel() {
        INSTANCE.showToolPanel();
    }
}
