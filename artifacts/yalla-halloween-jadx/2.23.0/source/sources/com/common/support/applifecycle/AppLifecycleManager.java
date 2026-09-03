package com.common.support.applifecycle;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\nH\u0002J\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u001c\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\u001c\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J*\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/common/support/applifecycle/AppLifecycleManager;", "", "()V", "appLifecycleObserver", "Lcom/common/support/applifecycle/AppLifecycleObserver;", "foregroundListener", "Lcom/common/support/applifecycle/AppLifecycleManager$ForegroundAppLifecycleListener;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "addAppLifecycleListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/common/support/applifecycle/AppLifecycleListener;", "addObserver", "init", "isAppBackground", "", "isAppForeground", "onBackground", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function0;", "onForeground", "onForegroundAndBackground", "removeAppLifecycleListener", "ForegroundAppLifecycleListener", "lib_applifecycle_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AppLifecycleManager {
    private static AppLifecycleObserver appLifecycleObserver;

    @NotNull
    public static final AppLifecycleManager INSTANCE = new AppLifecycleManager();

    @NotNull
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    @NotNull
    private static ForegroundAppLifecycleListener foregroundListener = new ForegroundAppLifecycleListener();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/common/support/applifecycle/AppLifecycleManager$ForegroundAppLifecycleListener;", "Lcom/common/support/applifecycle/DefaultAppLifecycleListener;", "()V", "appLifeState", "", "getAppLifeState", "()I", "setAppLifeState", "(I)V", "onBackground", "", "onCreate", "onDestroy", "onForeground", "lib_applifecycle_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ForegroundAppLifecycleListener extends DefaultAppLifecycleListener {
        private int appLifeState;

        public final int getAppLifeState() {
            return this.appLifeState;
        }

        @Override // com.common.support.applifecycle.DefaultAppLifecycleListener, com.common.support.applifecycle.AppLifecycleListener
        public void onBackground() {
            this.appLifeState = 2;
        }

        @Override // com.common.support.applifecycle.DefaultAppLifecycleListener, com.common.support.applifecycle.AppLifecycleListener
        public void onCreate() {
            this.appLifeState = 0;
        }

        @Override // com.common.support.applifecycle.DefaultAppLifecycleListener, com.common.support.applifecycle.AppLifecycleListener
        public void onDestroy() {
            this.appLifeState = 3;
        }

        @Override // com.common.support.applifecycle.DefaultAppLifecycleListener, com.common.support.applifecycle.AppLifecycleListener
        public void onForeground() {
            this.appLifeState = 1;
        }

        public final void setAppLifeState(int i) {
            this.appLifeState = i;
        }
    }

    private AppLifecycleManager() {
    }

    private final void addObserver() {
        Lifecycle lifecycle = ProcessLifecycleOwner.get().getLifecycle();
        AppLifecycleObserver appLifecycleObserver2 = appLifecycleObserver;
        if (appLifecycleObserver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appLifecycleObserver");
            appLifecycleObserver2 = null;
        }
        lifecycle.addObserver(appLifecycleObserver2);
        isInitialized.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final void m4018init$lambda0() {
        INSTANCE.addObserver();
    }

    public final synchronized void addAppLifecycleListener(@NotNull AppLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AppLifecycleObserver appLifecycleObserver2 = appLifecycleObserver;
        if (appLifecycleObserver2 == null) {
            return;
        }
        if (appLifecycleObserver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appLifecycleObserver");
            appLifecycleObserver2 = null;
        }
        appLifecycleObserver2.addAppLifecycleListener$lib_applifecycle_release(listener);
    }

    public final synchronized void init() {
        if (isInitialized.get()) {
            return;
        }
        appLifecycleObserver = new AppLifecycleObserver();
        addAppLifecycleListener(foregroundListener);
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            addObserver();
        } else {
            new Handler(Looper.getMainLooper()).post(new OooO00o());
        }
    }

    public final boolean isAppBackground() {
        return isInitialized.get() && foregroundListener.getAppLifeState() == 2;
    }

    public final boolean isAppForeground() {
        return isInitialized.get() && foregroundListener.getAppLifeState() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.common.support.applifecycle.AppLifecycleListener, com.common.support.applifecycle.AppLifecycleManager$onBackground$appLifecycleListener$1] */
    public final void onBackground(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> onBackground) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onBackground, "onBackground");
        final ?? r0 = new DefaultAppLifecycleListener() { // from class: com.common.support.applifecycle.AppLifecycleManager$onBackground$appLifecycleListener$1
            @Override // com.common.support.applifecycle.DefaultAppLifecycleListener, com.common.support.applifecycle.AppLifecycleListener
            public void onBackground() {
                onBackground.invoke();
            }
        };
        addAppLifecycleListener(r0);
        LifecycleExtensionsKt.onDestroy(lifecycleOwner, new Function0<Unit>() { // from class: com.common.support.applifecycle.AppLifecycleManager.onBackground.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AppLifecycleManager.INSTANCE.removeAppLifecycleListener(r0);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.common.support.applifecycle.AppLifecycleListener, com.common.support.applifecycle.AppLifecycleManager$onForeground$appLifecycleListener$1] */
    public final void onForeground(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> onForeground) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onForeground, "onForeground");
        final ?? r0 = new DefaultAppLifecycleListener() { // from class: com.common.support.applifecycle.AppLifecycleManager$onForeground$appLifecycleListener$1
            @Override // com.common.support.applifecycle.DefaultAppLifecycleListener, com.common.support.applifecycle.AppLifecycleListener
            public void onForeground() {
                onForeground.invoke();
            }
        };
        addAppLifecycleListener(r0);
        LifecycleExtensionsKt.onDestroy(lifecycleOwner, new Function0<Unit>() { // from class: com.common.support.applifecycle.AppLifecycleManager.onForeground.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AppLifecycleManager.INSTANCE.removeAppLifecycleListener(r0);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.common.support.applifecycle.AppLifecycleListener, com.common.support.applifecycle.AppLifecycleManager$onForegroundAndBackground$appLifecycleListener$1] */
    public final void onForegroundAndBackground(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> onForeground, @NotNull final Function0<Unit> onBackground) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onForeground, "onForeground");
        Intrinsics.checkNotNullParameter(onBackground, "onBackground");
        final ?? r0 = new DefaultAppLifecycleListener() { // from class: com.common.support.applifecycle.AppLifecycleManager$onForegroundAndBackground$appLifecycleListener$1
            @Override // com.common.support.applifecycle.DefaultAppLifecycleListener, com.common.support.applifecycle.AppLifecycleListener
            public void onBackground() {
                onBackground.invoke();
            }

            @Override // com.common.support.applifecycle.DefaultAppLifecycleListener, com.common.support.applifecycle.AppLifecycleListener
            public void onForeground() {
                onForeground.invoke();
            }
        };
        addAppLifecycleListener(r0);
        LifecycleExtensionsKt.onDestroy(lifecycleOwner, new Function0<Unit>() { // from class: com.common.support.applifecycle.AppLifecycleManager.onForegroundAndBackground.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AppLifecycleManager.INSTANCE.removeAppLifecycleListener(r0);
            }
        });
    }

    public final synchronized void removeAppLifecycleListener(@NotNull AppLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AppLifecycleObserver appLifecycleObserver2 = appLifecycleObserver;
        if (appLifecycleObserver2 == null) {
            return;
        }
        if (appLifecycleObserver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appLifecycleObserver");
            appLifecycleObserver2 = null;
        }
        appLifecycleObserver2.removeAppLifecycleListener$lib_applifecycle_release(listener);
    }
}
