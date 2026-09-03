package com.common.support.permission;

import android.content.Context;
import android.provider.Settings;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003%&'B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH&¢\u0006\u0002\u0010\nJ§\u0001\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012j\u0004\u0018\u0001`\u00142%\u0010\u0015\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012j\u0004\u0018\u0001`\u0017¢\u0006\u0002\b\u00182%\u0010\u0019\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012j\u0004\u0018\u0001`\u0017¢\u0006\u0002\b\u00182\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\f0\u001bj\u0002`\u001c¢\u0006\u0002\u0010\u001dJ\u0085\u0001\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\f0\u001bj\u0002`\u001c2%\u0010\u0019\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012j\u0004\u0018\u0001`\u0017¢\u0006\u0002\b\u00182%\u0010\u0015\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012j\u0004\u0018\u0001`\u0017¢\u0006\u0002\b\u0018H&¢\u0006\u0002\u0010!J\u0087\u0001\u0010\"\u001a\u00020\f2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\f0\u001bj\u0002`\u001c2%\u0010\u0019\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012j\u0004\u0018\u0001`\u0017¢\u0006\u0002\b\u00182%\u0010\u0015\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012j\u0004\u0018\u0001`\u0017¢\u0006\u0002\b\u0018H\u0000¢\u0006\u0004\b#\u0010$\u0082\u0001\u0003()*¨\u0006+"}, d2 = {"Lcom/common/support/permission/PermissionRequestType;", "", "()V", "checkPermissions", "", "context", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "invoke", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onShowRationale", "Lkotlin/Function1;", "Lcom/common/support/permission/PermissionRequest;", "Lcom/common/support/permission/ShowRationaleFunc;", "onPermissionDenied", "", "Lcom/common/support/permission/Func1;", "Lkotlin/ExtensionFunctionType;", "onNeverAskAgain", "requiresPermission", "Lkotlin/Function0;", "Lcom/common/support/permission/Func;", "([Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "invokeRequest", "fragment", "Lcom/common/support/permission/PermissionsRequestFragment;", "(Lcom/common/support/permission/PermissionsRequestFragment;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "requestPermissions", "requestPermissions$lib_release", "([Ljava/lang/String;Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Others", "SystemAlertWindow", "WriteSettings", "Lcom/common/support/permission/PermissionRequestType$Others;", "Lcom/common/support/permission/PermissionRequestType$SystemAlertWindow;", "Lcom/common/support/permission/PermissionRequestType$WriteSettings;", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PermissionRequestType {

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\nJ\u0085\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\f0\u0010j\u0002`\u00112%\u0010\u0012\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015¢\u0006\u0002\b\u00162%\u0010\u0017\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/common/support/permission/PermissionRequestType$Others;", "Lcom/common/support/permission/PermissionRequestType;", "()V", "checkPermissions", "", "context", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "invokeRequest", "", "fragment", "Lcom/common/support/permission/PermissionsRequestFragment;", "requiresPermission", "Lkotlin/Function0;", "Lcom/common/support/permission/Func;", "onNeverAskAgain", "Lkotlin/Function1;", "", "Lcom/common/support/permission/Func1;", "Lkotlin/ExtensionFunctionType;", "onPermissionDenied", "(Lcom/common/support/permission/PermissionsRequestFragment;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Others extends PermissionRequestType {

        @NotNull
        public static final Others INSTANCE = new Others();

        private Others() {
            super(null);
        }

        @Override // com.common.support.permission.PermissionRequestType
        public boolean checkPermissions(@NotNull Context context, @NotNull String[] permissions) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            return PermissionUtils.hasSelfPermissions(context, (String[]) Arrays.copyOf(permissions, permissions.length));
        }

        @Override // com.common.support.permission.PermissionRequestType
        public void invokeRequest(@NotNull PermissionsRequestFragment fragment, @NotNull String[] permissions, @NotNull Function0<Unit> requiresPermission, @Nullable Function1<? super List<String>, Unit> onNeverAskAgain, @Nullable Function1<? super List<String>, Unit> onPermissionDenied) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
            fragment.requestPermissions(permissions, requiresPermission, onNeverAskAgain, onPermissionDenied);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\nJ\u0085\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\f0\u0010j\u0002`\u00112%\u0010\u0012\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015¢\u0006\u0002\b\u00162%\u0010\u0017\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015¢\u0006\u0002\b\u0016H\u0017¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/common/support/permission/PermissionRequestType$SystemAlertWindow;", "Lcom/common/support/permission/PermissionRequestType;", "()V", "checkPermissions", "", "context", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "invokeRequest", "", "fragment", "Lcom/common/support/permission/PermissionsRequestFragment;", "requiresPermission", "Lkotlin/Function0;", "Lcom/common/support/permission/Func;", "onNeverAskAgain", "Lkotlin/Function1;", "", "Lcom/common/support/permission/Func1;", "Lkotlin/ExtensionFunctionType;", "onPermissionDenied", "(Lcom/common/support/permission/PermissionsRequestFragment;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SystemAlertWindow extends PermissionRequestType {

        @NotNull
        public static final SystemAlertWindow INSTANCE = new SystemAlertWindow();

        private SystemAlertWindow() {
            super(null);
        }

        @Override // com.common.support.permission.PermissionRequestType
        public boolean checkPermissions(@NotNull Context context, @NotNull String[] permissions) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            return Settings.canDrawOverlays(context);
        }

        @Override // com.common.support.permission.PermissionRequestType
        @RequiresApi(23)
        public void invokeRequest(@NotNull PermissionsRequestFragment fragment, @NotNull String[] permissions, @NotNull Function0<Unit> requiresPermission, @Nullable Function1<? super List<String>, Unit> onNeverAskAgain, @Nullable Function1<? super List<String>, Unit> onPermissionDenied) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
            fragment.requestOverlayPermission(requiresPermission, onPermissionDenied);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\nJ\u0085\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\f0\u0010j\u0002`\u00112%\u0010\u0012\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015¢\u0006\u0002\b\u00162%\u0010\u0017\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0015¢\u0006\u0002\b\u0016H\u0017¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/common/support/permission/PermissionRequestType$WriteSettings;", "Lcom/common/support/permission/PermissionRequestType;", "()V", "checkPermissions", "", "context", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "invokeRequest", "", "fragment", "Lcom/common/support/permission/PermissionsRequestFragment;", "requiresPermission", "Lkotlin/Function0;", "Lcom/common/support/permission/Func;", "onNeverAskAgain", "Lkotlin/Function1;", "", "Lcom/common/support/permission/Func1;", "Lkotlin/ExtensionFunctionType;", "onPermissionDenied", "(Lcom/common/support/permission/PermissionsRequestFragment;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WriteSettings extends PermissionRequestType {

        @NotNull
        public static final WriteSettings INSTANCE = new WriteSettings();

        private WriteSettings() {
            super(null);
        }

        @Override // com.common.support.permission.PermissionRequestType
        public boolean checkPermissions(@NotNull Context context, @NotNull String[] permissions) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            return Settings.System.canWrite(context);
        }

        @Override // com.common.support.permission.PermissionRequestType
        @RequiresApi(23)
        public void invokeRequest(@NotNull PermissionsRequestFragment fragment, @NotNull String[] permissions, @NotNull Function0<Unit> requiresPermission, @Nullable Function1<? super List<String>, Unit> onNeverAskAgain, @Nullable Function1<? super List<String>, Unit> onPermissionDenied) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
            fragment.requestWriteSettingsPermission(requiresPermission, onPermissionDenied);
        }
    }

    private PermissionRequestType() {
    }

    public /* synthetic */ PermissionRequestType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean checkPermissions(@NotNull Context context, @NotNull String[] permissions);

    public final void invoke(@NotNull final String[] permissions, @NotNull FragmentActivity activity, @NotNull final FragmentManager fragmentManager, @Nullable Function1<? super PermissionRequest, Unit> onShowRationale, @Nullable final Function1<? super List<String>, Unit> onPermissionDenied, @Nullable final Function1<? super List<String>, Unit> onNeverAskAgain, @NotNull final Function0<Unit> requiresPermission) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
        if (checkPermissions(activity, permissions)) {
            requiresPermission.invoke();
        } else if (!PermissionUtils.shouldShowRequestPermissionRationale(activity, (String[]) Arrays.copyOf(permissions, permissions.length))) {
            requestPermissions$lib_release(permissions, fragmentManager, requiresPermission, onNeverAskAgain, onPermissionDenied);
        } else if (onShowRationale != null) {
            onShowRationale.invoke(KtxPermissionRequest.INSTANCE.create(onPermissionDenied, new Function0<Unit>() { // from class: com.common.support.permission.PermissionRequestType.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    PermissionRequestType.this.requestPermissions$lib_release(permissions, fragmentManager, requiresPermission, onNeverAskAgain, onPermissionDenied);
                }
            }));
        }
    }

    public abstract void invokeRequest(@NotNull PermissionsRequestFragment fragment, @NotNull String[] permissions, @NotNull Function0<Unit> requiresPermission, @Nullable Function1<? super List<String>, Unit> onNeverAskAgain, @Nullable Function1<? super List<String>, Unit> onPermissionDenied);

    public final void requestPermissions$lib_release(@NotNull String[] permissions, @NotNull FragmentManager fragmentManager, @NotNull Function0<Unit> requiresPermission, @Nullable Function1<? super List<String>, Unit> onNeverAskAgain, @Nullable Function1<? super List<String>, Unit> onPermissionDenied) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
        PermissionsRequestFragment.Companion companion = PermissionsRequestFragment.INSTANCE;
        Fragment fragmentOooOoo = fragmentManager.OooOoo(companion.getTag());
        PermissionsRequestFragment permissionsRequestFragmentNewInstance = fragmentOooOoo instanceof PermissionsRequestFragment ? (PermissionsRequestFragment) fragmentOooOoo : null;
        if (permissionsRequestFragmentNewInstance == null) {
            permissionsRequestFragmentNewInstance = companion.newInstance();
            OooO00o oooO00o = new OooO00o(fragmentManager);
            oooO00o.OooO0OO(0, permissionsRequestFragmentNewInstance, companion.getTag(), 1);
            if (oooO00o.f6008OooO0oO) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            oooO00o.f5896OooOOOo.OooOoO0(oooO00o, true);
        }
        invokeRequest(permissionsRequestFragmentNewInstance, permissions, requiresPermission, onNeverAskAgain, onPermissionDenied);
    }
}
