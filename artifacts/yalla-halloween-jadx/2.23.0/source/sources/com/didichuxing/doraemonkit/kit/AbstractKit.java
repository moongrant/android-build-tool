package com.didichuxing.doraemonkit.kit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.didichuxing.doraemonkit.kit.core.BaseFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J6\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/AbstractKit;", "Lcom/didichuxing/doraemonkit/kit/IKit;", "()V", "canShow", "", "getCanShow", "()Z", "setCanShow", "(Z)V", "category", "", "getCategory", "()I", "isInnerKit", "currentActivity", "Landroid/app/Activity;", "innerKitId", "", "startUniversalActivity", "", "fragmentClass", "Ljava/lang/Class;", "Lcom/didichuxing/doraemonkit/kit/core/BaseFragment;", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "isSystemFragment", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public abstract class AbstractKit implements IKit {
    private boolean canShow = true;

    public static /* synthetic */ void startUniversalActivity$default(AbstractKit abstractKit, Class cls, Context context, Bundle bundle, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startUniversalActivity");
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        abstractKit.startUniversalActivity(cls, context, bundle, z);
    }

    @Nullable
    public final Activity currentActivity() {
        return null;
    }

    public final boolean getCanShow() {
        return this.canShow;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public int getCategory() {
        return 9;
    }

    @NotNull
    public String innerKitId() {
        return "";
    }

    public boolean isInnerKit() {
        return false;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    @Deprecated(message = "请使用onClickWithReturn代替")
    public void onClick(@Nullable Context context) {
        IKit.DefaultImpls.onClick(this, context);
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public boolean onClickWithReturn(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return IKit.DefaultImpls.onClickWithReturn(this, activity);
    }

    public final void setCanShow(boolean z) {
        this.canShow = z;
    }

    public final void startUniversalActivity(@NotNull Class<? extends BaseFragment> fragmentClass, @Nullable Context context, @Nullable Bundle bundle, boolean isSystemFragment) {
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
    }
}
