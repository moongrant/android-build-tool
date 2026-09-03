package com.common.support.permission;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J+\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010 JA\u0010!\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00070\u000ej\u0002`\u000f2%\u0010\n\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004j\u0004\u0018\u0001`\b¢\u0006\u0002\b\tH\u0007J{\u0010\"\u001a\u00020\u00072\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u001d2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00070\u000ej\u0002`\u000f2%\u0010\u0003\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004j\u0004\u0018\u0001`\b¢\u0006\u0002\b\t2%\u0010\n\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004j\u0004\u0018\u0001`\b¢\u0006\u0002\b\t¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0006H\u0002JA\u0010&\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00070\u000ej\u0002`\u000f2%\u0010\n\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004j\u0004\u0018\u0001`\b¢\u0006\u0002\b\tH\u0007R-\u0010\u0003\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004j\u0004\u0018\u0001`\b¢\u0006\u0002\b\tX\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\n\u001a!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004j\u0004\u0018\u0001`\b¢\u0006\u0002\b\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/common/support/permission/PermissionsRequestFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onNeverAskAgain", "Lkotlin/Function1;", "", "", "", "Lcom/common/support/permission/Func1;", "Lkotlin/ExtensionFunctionType;", "onPermissionDenied", "requestCode", "", "requiresPermission", "Lkotlin/Function0;", "Lcom/common/support/permission/Func;", "savedOrientation", "dismiss", "()Lkotlin/Unit;", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestOverlayPermission", "requestPermissions", "([Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "requestSpecialPermissions", NativeProtocol.WEB_DIALOG_ACTION, "requestWriteSettingsPermission", "Companion", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PermissionsRequestFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String tag = PermissionsRequestFragment.class.getCanonicalName();

    @Nullable
    private Function1<? super List<String>, Unit> onNeverAskAgain;

    @Nullable
    private Function1<? super List<String>, Unit> onPermissionDenied;

    @Nullable
    private Function0<Unit> requiresPermission;
    private final int requestCode = new Random().nextInt(1000);
    private int savedOrientation = 1;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/common/support/permission/PermissionsRequestFragment$Companion;", "", "()V", ViewHierarchyConstants.TAG_KEY, "", "kotlin.jvm.PlatformType", "getTag", "()Ljava/lang/String;", "newInstance", "Lcom/common/support/permission/PermissionsRequestFragment;", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTag() {
            return PermissionsRequestFragment.tag;
        }

        @NotNull
        public final PermissionsRequestFragment newInstance() {
            return new PermissionsRequestFragment();
        }
    }

    private final Unit dismiss() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return null;
        }
        OooO00o oooO00o = new OooO00o(fragmentManager);
        oooO00o.OooOOO0(this);
        oooO00o.OooO();
        return Unit.INSTANCE;
    }

    private final void requestSpecialPermissions(String action) {
        startActivityForResult(new Intent(action, Uri.parse("package:" + requireContext().getPackageName())), this.requestCode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == this.requestCode) {
            if (Settings.canDrawOverlays(getActivity())) {
                Function0<Unit> function0 = this.requiresPermission;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                Function1<? super List<String>, Unit> function1 = this.onPermissionDenied;
                if (function1 != null) {
                    List<String> EMPTY_LIST = PermissionUtils.EMPTY_LIST;
                    Intrinsics.checkNotNullExpressionValue(EMPTY_LIST, "EMPTY_LIST");
                    function1.invoke(EMPTY_LIST);
                }
            }
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setRetainInstance(true);
        if (Build.VERSION.SDK_INT == 26 || (activity = getActivity()) == null) {
            return;
        }
        this.savedOrientation = activity.getRequestedOrientation();
        activity.setRequestedOrientation(context.getResources().getConfiguration().orientation != 1 ? 0 : 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        FragmentActivity activity;
        super.onDestroy();
        if (Build.VERSION.SDK_INT != 26 && (activity = getActivity()) != null) {
            activity.setRequestedOrientation(this.savedOrientation);
        }
        this.requiresPermission = null;
        this.onNeverAskAgain = null;
        this.onPermissionDenied = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.requestCode) {
            if (PermissionUtils.verifyPermissions(Arrays.copyOf(grantResults, grantResults.length))) {
                Function0<Unit> function0 = this.requiresPermission;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                List<String> deniedPermissions = PermissionUtils.findDeniedPermission(permissions, Arrays.copyOf(grantResults, grantResults.length));
                if (PermissionUtils.shouldShowRequestPermissionRationale(this, (String[]) Arrays.copyOf(permissions, permissions.length))) {
                    Function1<? super List<String>, Unit> function1 = this.onPermissionDenied;
                    if (function1 != null) {
                        Intrinsics.checkNotNullExpressionValue(deniedPermissions, "deniedPermissions");
                        function1.invoke(deniedPermissions);
                    }
                } else {
                    Function1<? super List<String>, Unit> function2 = this.onNeverAskAgain;
                    if (function2 != null) {
                        Intrinsics.checkNotNullExpressionValue(deniedPermissions, "deniedPermissions");
                        function2.invoke(deniedPermissions);
                    }
                }
            }
        }
        dismiss();
    }

    @RequiresApi(23)
    public final void requestOverlayPermission(@NotNull Function0<Unit> requiresPermission, @Nullable Function1<? super List<String>, Unit> onPermissionDenied) {
        Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
        this.requiresPermission = requiresPermission;
        this.onPermissionDenied = onPermissionDenied;
        requestSpecialPermissions("android.settings.action.MANAGE_OVERLAY_PERMISSION");
    }

    public final void requestPermissions(@NotNull String[] permissions, @NotNull Function0<Unit> requiresPermission, @Nullable Function1<? super List<String>, Unit> onNeverAskAgain, @Nullable Function1<? super List<String>, Unit> onPermissionDenied) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
        this.requiresPermission = requiresPermission;
        this.onNeverAskAgain = onNeverAskAgain;
        this.onPermissionDenied = onPermissionDenied;
        requestPermissions(permissions, this.requestCode);
    }

    @RequiresApi(23)
    public final void requestWriteSettingsPermission(@NotNull Function0<Unit> requiresPermission, @Nullable Function1<? super List<String>, Unit> onPermissionDenied) {
        Intrinsics.checkNotNullParameter(requiresPermission, "requiresPermission");
        this.requiresPermission = requiresPermission;
        this.onPermissionDenied = onPermissionDenied;
        requestSpecialPermissions("android.settings.action.MANAGE_WRITE_SETTINGS");
    }
}
