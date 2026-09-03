package com.didichuxing.doraemonkit.kit.core;

import android.app.Activity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J,\u0010\u0012\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0013*\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u000bH\u0016J \u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u001e"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/core/DokitViewManager;", "Lcom/didichuxing/doraemonkit/kit/core/DokitViewManagerInterface;", "()V", "attach", "", "dokitIntent", "Lcom/didichuxing/doraemonkit/kit/core/DokitIntent;", "detach", "dokitView", "Lcom/didichuxing/doraemonkit/kit/core/AbsDokitView;", "doKitViewClass", "Ljava/lang/Class;", ViewHierarchyConstants.TAG_KEY, "", "detachAll", "dispatchOnActivityResumed", "activity", "Landroid/app/Activity;", "getDoKitView", "T", "clazz", "getDoKitViews", "", "notifyBackground", "notifyForeground", "onActivityDestroyed", "onActivityPaused", "onActivityStopped", "Companion", "DokitViewAttachedListener", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public final class DokitViewManager implements DokitViewManagerInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy instance$delegate = LazyKt.lazy(new Function0<DokitViewManager>() { // from class: com.didichuxing.doraemonkit.kit.core.DokitViewManager$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DokitViewManager invoke() {
            return new DokitViewManager();
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/core/DokitViewManager$Companion;", "", "()V", "instance", "Lcom/didichuxing/doraemonkit/kit/core/DokitViewManager;", "getInstance$annotations", "getInstance", "()Lcom/didichuxing/doraemonkit/kit/core/DokitViewManager;", "instance$delegate", "Lkotlin/Lazy;", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final DokitViewManager getInstance() {
            return (DokitViewManager) DokitViewManager.instance$delegate.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/core/DokitViewManager$DokitViewAttachedListener;", "", "onDokitViewAdd", "", "dokitView", "Lcom/didichuxing/doraemonkit/kit/core/AbsDokitView;", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
    public interface DokitViewAttachedListener {
        void onDokitViewAdd(@Nullable AbsDokitView dokitView);
    }

    @NotNull
    public static final DokitViewManager getInstance() {
        return INSTANCE.getInstance();
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void attach(@NotNull DokitIntent dokitIntent) {
        Intrinsics.checkNotNullParameter(dokitIntent, "dokitIntent");
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void detach(@NotNull AbsDokitView dokitView) {
        Intrinsics.checkNotNullParameter(dokitView, "dokitView");
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void detachAll() {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void dispatchOnActivityResumed(@Nullable Activity activity) {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    @Nullable
    public <T extends AbsDokitView> AbsDokitView getDoKitView(@Nullable Activity activity, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return null;
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    @Nullable
    public Map<String, AbsDokitView> getDoKitViews(@Nullable Activity activity) {
        return null;
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void notifyBackground() {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void notifyForeground() {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void onActivityDestroyed(@Nullable Activity activity) {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void onActivityPaused(@Nullable Activity activity) {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void onActivityStopped(@Nullable Activity activity) {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void detach(@NotNull Class<? extends AbsDokitView> doKitViewClass) {
        Intrinsics.checkNotNullParameter(doKitViewClass, "doKitViewClass");
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManagerInterface
    public void detach(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
    }
}
