package com.common.support.imagepicker.base.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"getAlbumPermission", "", "", "()[Ljava/lang/String;", "goSetting", "", "activity", "Landroid/app/Activity;", "requestCode", "", "fragment", "Landroidx/fragment/app/Fragment;", "base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PermissionHelperKt {
    @NotNull
    public static final String[] getAlbumPermission() {
        return Build.VERSION.SDK_INT < 33 ? new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
    }

    public static final void goSetting(@NotNull Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            Uri uriFromParts = Uri.fromParts("package", fragment.requireActivity().getPackageName(), null);
            Intrinsics.checkNotNullExpressionValue(uriFromParts, "fromParts(\"package\", fra…vity().packageName, null)");
            intent.setData(uriFromParts);
            fragment.startActivityForResult(intent, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void goSetting(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            Uri uriFromParts = Uri.fromParts("package", activity.getPackageName(), null);
            Intrinsics.checkNotNullExpressionValue(uriFromParts, "fromParts(\"package\", activity.packageName, null)");
            intent.setData(uriFromParts);
            activity.startActivityForResult(intent, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
