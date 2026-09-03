package com.common.support.imagepicker.dataprovider.utils;

import android.content.Context;
import androidx.core.content.PermissionChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0002J)\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0002¢\u0006\u0002\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/utils/PermissionUtil;", "", "()V", "hasPermissions", "", "context", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "hasSelfPermission", "permission", "hasSelfPermissions", "dataprovider_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PermissionUtil {

    @NotNull
    public static final PermissionUtil INSTANCE = new PermissionUtil();

    private PermissionUtil() {
    }

    private final boolean hasSelfPermission(Context context, String permission) {
        try {
            return PermissionChecker.OooO00o(context, permission) == 0;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    private final boolean hasSelfPermissions(Context context, String... permissions) {
        for (String str : permissions) {
            if (!hasSelfPermission(context, str)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasPermissions(@NotNull Context context, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return hasSelfPermissions(context, (String[]) Arrays.copyOf(permissions, permissions.length));
    }
}
