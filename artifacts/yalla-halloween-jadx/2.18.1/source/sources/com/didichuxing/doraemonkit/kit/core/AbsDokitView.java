package com.didichuxing.doraemonkit.kit.core;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010E\u001a\u00020\u001cH\u0016J\u0010\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IJ\u0006\u0010J\u001a\u00020GJ#\u0010K\u001a\u0004\u0018\u0001HL\"\b\b\u0000\u0010L*\u00020\u00182\b\b\u0001\u0010M\u001a\u000206H\u0004¢\u0006\u0002\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010P\u001a\u000206J\b\u0010Q\u001a\u00020GH\u0016J\b\u0010R\u001a\u00020\u001cH\u0016J\b\u0010S\u001a\u00020GH\u0016J\u0012\u0010T\u001a\u00020G2\b\u0010U\u001a\u0004\u0018\u00010\u0000H\u0016J\u0018\u0010V\u001a\u00020G2\u0006\u0010W\u001a\u0002062\u0006\u0010X\u001a\u000206H\u0016J\b\u0010Y\u001a\u00020GH\u0016J\b\u0010Z\u001a\u00020GH\u0016J\b\u0010[\u001a\u00020GH\u0016J(\u0010\\\u001a\u00020G2\u0006\u0010W\u001a\u0002062\u0006\u0010X\u001a\u0002062\u0006\u0010]\u001a\u0002062\u0006\u0010^\u001a\u000206H\u0016J\b\u0010_\u001a\u00020GH\u0016J\b\u0010`\u001a\u00020GH\u0016J\b\u0010a\u001a\u00020GH\u0016J\u0018\u0010b\u001a\u00020G2\u0006\u0010W\u001a\u0002062\u0006\u0010X\u001a\u000206H\u0016J\u000e\u0010c\u001a\u00020G2\u0006\u0010d\u001a\u00020eJ\u0016\u0010f\u001a\u00020G2\u0006\u0010d\u001a\u00020e2\u0006\u0010g\u001a\u00020hJ\b\u0010i\u001a\u00020\u001cH\u0016J\u000e\u0010j\u001a\u00020G2\u0006\u0010\t\u001a\u00020\nJ\b\u0010k\u001a\u00020\u001cH\u0016J\u0018\u0010l\u001a\u00020G2\u0006\u0010A\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u001cH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u0004\u0018\u00010 8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b:\u00108R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\b\"\u0004\bC\u0010D¨\u0006n"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/core/AbsDokitView;", "Lcom/didichuxing/doraemonkit/kit/core/DokitView;", "Lcom/didichuxing/doraemonkit/kit/core/TouchProxy$OnTouchEventListener;", "Lcom/didichuxing/doraemonkit/kit/core/DokitViewManager$DokitViewAttachedListener;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", d.R, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "doKitView", "Landroid/view/View;", "getDoKitView", "()Landroid/view/View;", "isNormalMode", "", "()Z", "isShow", "mWindowManager", "", "mode", "Lcom/didichuxing/doraemonkit/kit/core/DoKitViewLaunchMode;", "getMode", "()Lcom/didichuxing/doraemonkit/kit/core/DoKitViewLaunchMode;", "setMode", "(Lcom/didichuxing/doraemonkit/kit/core/DoKitViewLaunchMode;)V", "normalLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "getNormalLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "setNormalLayoutParams", "(Landroid/widget/FrameLayout$LayoutParams;)V", "parentView", "Lcom/didichuxing/doraemonkit/kit/core/DokitFrameLayout;", "getParentView", "()Lcom/didichuxing/doraemonkit/kit/core/DokitFrameLayout;", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "screenLongSideLength", "", "getScreenLongSideLength", "()I", "screenShortSideLength", "getScreenShortSideLength", "systemLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "getSystemLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "setSystemLayoutParams", "(Landroid/view/WindowManager$LayoutParams;)V", ViewHierarchyConstants.TAG_KEY, "getTag", "setTag", "(Ljava/lang/String;)V", "canDrag", "dealDecorRootView", "", "decorRootView", "Landroid/widget/FrameLayout;", "detach", "findViewById", "T", "id", "(I)Landroid/view/View;", "getString", "resId", "immInvalidate", "onBackPressed", "onDestroy", "onDokitViewAdd", "dokitView", "onDown", "x", "y", "onEnterBackground", "onEnterForeground", "onHomeKeyPress", "onMove", "dx", "dy", "onPause", "onRecentAppKeyPress", "onResume", "onUp", "post", "run", "Ljava/lang/Runnable;", "postDelayed", "delayMillis", "", "restrictBorderline", "setActivity", "shouldDealBackKey", "updateViewLayout", "isActivityBackResume", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public abstract class AbsDokitView implements DokitView, TouchProxy.OnTouchEventListener, DokitViewManager.DokitViewAttachedListener {

    @Nullable
    private Bundle bundle;
    private final boolean isNormalMode;

    @JvmField
    @Nullable
    public Void mWindowManager;

    @Nullable
    private FrameLayout.LayoutParams normalLayoutParams;

    @Nullable
    private WindowManager.LayoutParams systemLayoutParams;

    @NotNull
    private final String TAG = "";

    @NotNull
    private DoKitViewLaunchMode mode = DoKitViewLaunchMode.SINGLE_INSTANCE;

    @NotNull
    private String tag = "";

    @Override // com.didichuxing.doraemonkit.kit.core.DokitView
    public boolean canDrag() {
        return true;
    }

    public final void dealDecorRootView(@Nullable FrameLayout decorRootView) {
    }

    public final void detach() {
    }

    @Nullable
    public final <T extends View> T findViewById(@IdRes int id) {
        return null;
    }

    @Nullable
    public final Activity getActivity() {
        return null;
    }

    @Nullable
    public final Bundle getBundle() {
        return this.bundle;
    }

    @Nullable
    public final Context getContext() {
        return null;
    }

    @Nullable
    public final View getDoKitView() {
        return null;
    }

    @NotNull
    public final DoKitViewLaunchMode getMode() {
        return this.mode;
    }

    @Nullable
    public final FrameLayout.LayoutParams getNormalLayoutParams() {
        return this.normalLayoutParams;
    }

    @Nullable
    public final DokitFrameLayout getParentView() {
        return null;
    }

    @Nullable
    public final Resources getResources() {
        return null;
    }

    public final int getScreenLongSideLength() {
        return -1;
    }

    public final int getScreenShortSideLength() {
        return -1;
    }

    @Nullable
    public final String getString(@StringRes int resId) {
        return null;
    }

    @Nullable
    public final WindowManager.LayoutParams getSystemLayoutParams() {
        return this.systemLayoutParams;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public void immInvalidate() {
    }

    /* JADX INFO: renamed from: isNormalMode, reason: from getter */
    public final boolean getIsNormalMode() {
        return this.isNormalMode;
    }

    public final boolean isShow() {
        return false;
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitView
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitView
    public void onDestroy() {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitViewManager.DokitViewAttachedListener
    public void onDokitViewAdd(@Nullable AbsDokitView dokitView) {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.TouchProxy.OnTouchEventListener
    public void onDown(int x, int y) {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitView
    public void onEnterBackground() {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitView
    public void onEnterForeground() {
    }

    public void onHomeKeyPress() {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.TouchProxy.OnTouchEventListener
    public void onMove(int x, int y, int dx, int dy) {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitView
    public void onPause() {
    }

    public void onRecentAppKeyPress() {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitView
    public void onResume() {
    }

    @Override // com.didichuxing.doraemonkit.kit.core.TouchProxy.OnTouchEventListener
    public void onUp(int x, int y) {
    }

    public final void post(@NotNull Runnable run) {
        Intrinsics.checkNotNullParameter(run, "run");
    }

    public final void postDelayed(@NotNull Runnable run, long delayMillis) {
        Intrinsics.checkNotNullParameter(run, "run");
    }

    public boolean restrictBorderline() {
        return true;
    }

    public final void setActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void setBundle(@Nullable Bundle bundle) {
        this.bundle = bundle;
    }

    public final void setMode(@NotNull DoKitViewLaunchMode doKitViewLaunchMode) {
        Intrinsics.checkNotNullParameter(doKitViewLaunchMode, "<set-?>");
        this.mode = doKitViewLaunchMode;
    }

    public final void setNormalLayoutParams(@Nullable FrameLayout.LayoutParams layoutParams) {
        this.normalLayoutParams = layoutParams;
    }

    public final void setSystemLayoutParams(@Nullable WindowManager.LayoutParams layoutParams) {
        this.systemLayoutParams = layoutParams;
    }

    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    @Override // com.didichuxing.doraemonkit.kit.core.DokitView
    public boolean shouldDealBackKey() {
        return false;
    }

    public void updateViewLayout(@NotNull String tag, boolean isActivityBackResume) {
        Intrinsics.checkNotNullParameter(tag, "tag");
    }
}
