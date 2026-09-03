package com.common.support.permission;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¥\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\t2'\b\u0002\u0010\n\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\f¢\u0006\u0002\b\r2'\b\u0002\u0010\u000e\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\f¢\u0006\u0002\b\r2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00010\u0010j\u0002`\u0011¢\u0006\u0002\u0010\u0012\u001ac\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\t2'\b\u0002\u0010\n\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\f¢\u0006\u0002\b\r2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00010\u0010j\u0002`\u0011\u001ac\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\t2'\b\u0002\u0010\n\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\f¢\u0006\u0002\b\r2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00010\u0010j\u0002`\u0011¨\u0006\u0015"}, d2 = {"withPermissionsCheck", "", "Landroidx/fragment/app/FragmentActivity;", "permissions", "", "", "onShowRationale", "Lkotlin/Function1;", "Lcom/common/support/permission/PermissionRequest;", "Lcom/common/support/permission/ShowRationaleFunc;", "onPermissionDenied", "", "Lcom/common/support/permission/Func1;", "Lkotlin/ExtensionFunctionType;", "onNeverAskAgain", "requiresPermission", "Lkotlin/Function0;", "Lcom/common/support/permission/Func;", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "withSystemAlertWindowPermissionCheck", "withWriteSettingsPermissionCheck", "lib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityExtensionsKt {
    public static final void withPermissionsCheck(@NotNull FragmentActivity fragmentActivity, @NotNull String[] permissions, @Nullable Function1<? super PermissionRequest, Unit> function1, @Nullable Function1<? super List<String>, Unit> function2, @Nullable Function1<? super List<String>, Unit> function3, @NotNull Function0<Unit> requiresPermission) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
        PermissionRequestType.Others others = PermissionRequestType.Others.INSTANCE;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        others.invoke(permissions, fragmentActivity, supportFragmentManager, function1, function2, function3, requiresPermission);
    }

    public static final void withSystemAlertWindowPermissionCheck(@NotNull FragmentActivity fragmentActivity, @Nullable Function1<? super PermissionRequest, Unit> function1, @Nullable Function1<? super List<String>, Unit> function2, @NotNull Function0<Unit> requiresPermission) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        PermissionRequestType.SystemAlertWindow.INSTANCE.invoke(new String[]{"android.permission.SYSTEM_ALERT_WINDOW"}, fragmentActivity, supportFragmentManager, function1, function2, null, requiresPermission);
    }

    public static /* synthetic */ void withSystemAlertWindowPermissionCheck$default(FragmentActivity fragmentActivity, Function1 function1, Function1 function2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        withSystemAlertWindowPermissionCheck(fragmentActivity, function1, function2, function0);
    }

    public static final void withWriteSettingsPermissionCheck(@NotNull FragmentActivity fragmentActivity, @Nullable Function1<? super PermissionRequest, Unit> function1, @Nullable Function1<? super List<String>, Unit> function2, @NotNull Function0<Unit> requiresPermission) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        PermissionRequestType.WriteSettings.INSTANCE.invoke(new String[]{"android.permission.WRITE_SETTINGS"}, fragmentActivity, supportFragmentManager, function1, function2, null, requiresPermission);
    }

    public static /* synthetic */ void withWriteSettingsPermissionCheck$default(FragmentActivity fragmentActivity, Function1 function1, Function1 function2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        withWriteSettingsPermissionCheck(fragmentActivity, function1, function2, function0);
    }
}
