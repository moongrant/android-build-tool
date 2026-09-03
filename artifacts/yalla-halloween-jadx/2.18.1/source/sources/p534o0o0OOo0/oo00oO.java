package p534o0o0OOo0;

import android.view.View;
import android.widget.ImageView;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00oO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountCheckActivity f43620Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(DeleteAccountCheckActivity deleteAccountCheckActivity) {
        super(1);
        this.f43620Oooo0o = deleteAccountCheckActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        DeleteAccountCheckActivity deleteAccountCheckActivity = this.f43620Oooo0o;
        DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21734Oooooo0;
        Objects.requireNonNull(deleteAccountCheckActivity);
        OpenAuthManager openAuthManager = null;
        BaseActivityK.OooOoo0(deleteAccountCheckActivity, null, 0L, 3, null);
        ImageView imageView = deleteAccountCheckActivity.f21738OooooO0;
        if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOoo().f49712OooO0o)) {
            OpenAuthManager openAuthManager2 = deleteAccountCheckActivity.f21739OooooOO;
            if (openAuthManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager2;
            }
            openAuthManager.OooO00o();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOoo().f49715OooO0oo)) {
            OpenAuthManager openAuthManager3 = deleteAccountCheckActivity.f21739OooooOO;
            if (openAuthManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager3;
            }
            openAuthManager.OooO0OO();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOoo().f49714OooO0oO)) {
            OpenAuthManager openAuthManager4 = deleteAccountCheckActivity.f21739OooooOO;
            if (openAuthManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager4;
            }
            openAuthManager.OooO0O0();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOoo().f49707OooO)) {
            OpenAuthManager openAuthManager5 = deleteAccountCheckActivity.f21739OooooOO;
            if (openAuthManager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager5;
            }
            openAuthManager.OooO0Oo();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOoo().f49716OooOO0)) {
            OpenAuthManager openAuthManager6 = deleteAccountCheckActivity.f21739OooooOO;
            if (openAuthManager6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager6;
            }
            openAuthManager.OooO0o0();
        }
        return Unit.INSTANCE;
    }
}
