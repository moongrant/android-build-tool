package com.didichuxing.doraemonkit.kit.core;

import android.app.Activity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\nH&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J,\u0010\u0011\u001a\u0004\u0018\u00010\b\"\b\b\u0000\u0010\u0012*\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\nH&J \u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&¨\u0006\u001b"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/core/DokitViewManagerInterface;", "", "attach", "", "dokitIntent", "Lcom/didichuxing/doraemonkit/kit/core/DokitIntent;", "detach", "dokitView", "Lcom/didichuxing/doraemonkit/kit/core/AbsDokitView;", "doKitViewClass", "Ljava/lang/Class;", ViewHierarchyConstants.TAG_KEY, "", "detachAll", "dispatchOnActivityResumed", "activity", "Landroid/app/Activity;", "getDoKitView", "T", "clazz", "getDoKitViews", "", "notifyBackground", "notifyForeground", "onActivityDestroyed", "onActivityPaused", "onActivityStopped", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public interface DokitViewManagerInterface {
    void attach(@NotNull DokitIntent dokitIntent);

    void detach(@NotNull AbsDokitView dokitView);

    void detach(@NotNull Class<? extends AbsDokitView> doKitViewClass);

    void detach(@NotNull String tag);

    void detachAll();

    void dispatchOnActivityResumed(@Nullable Activity activity);

    @Nullable
    <T extends AbsDokitView> AbsDokitView getDoKitView(@Nullable Activity activity, @NotNull Class<T> clazz);

    @Nullable
    Map<String, AbsDokitView> getDoKitViews(@Nullable Activity activity);

    void notifyBackground();

    void notifyForeground();

    void onActivityDestroyed(@Nullable Activity activity);

    void onActivityPaused(@Nullable Activity activity);

    void onActivityStopped(@Nullable Activity activity);
}
