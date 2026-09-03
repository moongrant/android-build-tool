package com.didichuxing.doraemonkit.kit;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.umeng.analytics.pro.d;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/IKit;", "", "category", "", "getCategory", "()I", "icon", "getIcon", "name", "getName", "onAppInit", "", d.R, "Landroid/content/Context;", "onClick", "onClickWithReturn", "", "activity", "Landroid/app/Activity;", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public interface IKit {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static final class DefaultImpls {
        @Deprecated(message = "请使用onClickWithReturn代替")
        public static void onClick(@NotNull IKit iKit, @Nullable Context context) {
        }

        public static boolean onClickWithReturn(@NotNull IKit iKit, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return true;
        }
    }

    int getCategory();

    @DrawableRes
    int getIcon();

    @StringRes
    int getName();

    void onAppInit(@Nullable Context context);

    @Deprecated(message = "请使用onClickWithReturn代替")
    void onClick(@Nullable Context context);

    boolean onClickWithReturn(@NotNull Activity activity);
}
