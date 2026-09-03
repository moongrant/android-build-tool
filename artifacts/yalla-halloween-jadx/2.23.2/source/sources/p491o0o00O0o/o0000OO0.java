package p491o0o00O0o;

import android.view.View;
import android.widget.ImageView;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountCheckActivity f48946OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(DeleteAccountCheckActivity deleteAccountCheckActivity) {
        super(1);
        this.f48946OooO0Oo = deleteAccountCheckActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = DeleteAccountCheckActivity.f24708OooOoO0;
        DeleteAccountCheckActivity deleteAccountCheckActivity = this.f48946OooO0Oo;
        deleteAccountCheckActivity.getClass();
        OpenAuthManager openAuthManager = null;
        BaseActivityK.OooOo0o(deleteAccountCheckActivity, null, 0L, 3);
        ImageView imageView = deleteAccountCheckActivity.f24713OooOo0O;
        if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f44227OooO0o0)) {
            AppConfigRepo.f24292OooO00o.getClass();
            AppConfigRepo.f24293OooO0O0.observe(deleteAccountCheckActivity, new DeleteAccountCheckActivity.OooO00o(new o0000O0(deleteAccountCheckActivity)));
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f44228OooO0oO)) {
            OpenAuthManager openAuthManager2 = deleteAccountCheckActivity.f24714OooOo0o;
            if (openAuthManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager2;
            }
            openAuthManager.OooO0OO();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f44226OooO0o)) {
            OpenAuthManager openAuthManager3 = deleteAccountCheckActivity.f24714OooOo0o;
            if (openAuthManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager3;
            }
            openAuthManager.OooO0O0();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f44229OooO0oo)) {
            OpenAuthManager openAuthManager4 = deleteAccountCheckActivity.f24714OooOo0o;
            if (openAuthManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager4;
            }
            openAuthManager.OooO0Oo();
        } else if (Intrinsics.areEqual(imageView, deleteAccountCheckActivity.OooOo().f44221OooO)) {
            OpenAuthManager openAuthManager5 = deleteAccountCheckActivity.f24714OooOo0o;
            if (openAuthManager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
            } else {
                openAuthManager = openAuthManager5;
            }
            openAuthManager.OooO0o0();
        }
        return Unit.INSTANCE;
    }
}
