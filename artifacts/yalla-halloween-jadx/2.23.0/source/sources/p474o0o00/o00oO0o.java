package p474o0o00;

import android.view.View;
import android.widget.ImageView;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountCheckActivity f47288OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(DeleteAccountCheckActivity deleteAccountCheckActivity) {
        super(1);
        this.f47288OooO0Oo = deleteAccountCheckActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = DeleteAccountCheckActivity.f25168OooOoO0;
        DeleteAccountCheckActivity deleteAccountCheckActivity = this.f47288OooO0Oo;
        deleteAccountCheckActivity.getClass();
        OpenAuthManager openAuthManager = null;
        BaseActivityK.OooOo0o(deleteAccountCheckActivity, null, 0L, 3);
        ImageView imageView = deleteAccountCheckActivity.f25173OooOo0O;
        if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f58911OooO0o0)) {
            OpenAuthManager openAuthManager2 = deleteAccountCheckActivity.f25174OooOo0o;
            if (openAuthManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager2;
            }
            openAuthManager.OooO00o();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f58912OooO0oO)) {
            OpenAuthManager openAuthManager3 = deleteAccountCheckActivity.f25174OooOo0o;
            if (openAuthManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager3;
            }
            openAuthManager.OooO0OO();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f58910OooO0o)) {
            OpenAuthManager openAuthManager4 = deleteAccountCheckActivity.f25174OooOo0o;
            if (openAuthManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager4;
            }
            openAuthManager.OooO0O0();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f58913OooO0oo)) {
            OpenAuthManager openAuthManager5 = deleteAccountCheckActivity.f25174OooOo0o;
            if (openAuthManager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager5;
            }
            openAuthManager.OooO0Oo();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f58905OooO)) {
            OpenAuthManager openAuthManager6 = deleteAccountCheckActivity.f25174OooOo0o;
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
