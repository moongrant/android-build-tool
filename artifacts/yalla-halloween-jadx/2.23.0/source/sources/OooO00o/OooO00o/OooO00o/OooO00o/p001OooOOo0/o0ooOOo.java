package OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOo0;

import OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOo0.o0ooOOo;
import OooOOOO.OooOOOO;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.yallatech.support.platform.share.bean.ShareResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o00Oo0;
import p611o0oo0o.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOooO00o/OooO00o/OooO00o/OooO00o/OooOOo0/o0ooOOo;", "LOooO0o/OooO00o;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class o0ooOOo extends OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOOOO f81OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Dialog f82OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public FragmentActivity f83OooO0oo;

    public static final class OooO00o implements o00Oo0.OooO0O0 {
        public OooO00o() {
        }

        @Override // OooO0o0.o00Oo0.OooO0O0
        public final void OooO00o(@NotNull final BaseResp response) {
            Intrinsics.checkNotNullParameter(response, "response");
            YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
            final o0ooOOo o0ooooo = o0ooOOo.this;
            yCSDKOpenKit.dispatchToMain$lib_release(new Runnable() { // from class: OooOOOO.OooOOO0
                @Override // java.lang.Runnable
                public final void run() {
                    BaseResp response2 = response;
                    Intrinsics.checkNotNullParameter(response2, "$response");
                    o0ooOOo this$0 = o0ooooo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (response2 instanceof ShareResponse) {
                        ShareResponse shareResponse = (ShareResponse) response2;
                        if (this$0.isAdded()) {
                            Dialog dialog = this$0.f82OooO0oO;
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            this$0.OooO0O0(shareResponse);
                            return;
                        }
                        return;
                    }
                    ShareResponse shareResponseCreateShareResponse$default = ShareResponse.Companion.createShareResponse$default(ShareResponse.INSTANCE, -2002, null, 2, null);
                    if (this$0.isAdded()) {
                        Dialog dialog2 = this$0.f82OooO0oO;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        this$0.OooO0O0(shareResponseCreateShareResponse$default);
                    }
                }
            });
        }
    }

    public static final class OooO0O0 implements o00Oo0.OooO00o {
        public OooO0O0() {
        }

        @Override // OooO0o0.o00Oo0.OooO00o
        public final void OooO00o() {
            YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
            final o0ooOOo o0ooooo = o0ooOOo.this;
            yCSDKOpenKit.dispatchToMain$lib_release(new Runnable() { // from class: OooOOOO.OooOOO
                @Override // java.lang.Runnable
                public final void run() {
                    Dialog dialog;
                    o0ooOOo this$0 = o0ooooo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (!this$0.isAdded() || (dialog = this$0.f82OooO0oO) == null) {
                        return;
                    }
                    dialog.dismiss();
                }
            });
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity fragmentActivity = o0ooOOo.this.f83OooO0oo;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("act");
                fragmentActivity = null;
            }
            fragmentActivity.finish();
            return Unit.INSTANCE;
        }
    }

    public final void OooO0O0(ShareResponse shareResponse) {
        int i = shareResponse.getCode() == -1002 ? 0 : -1;
        Intent intent = new Intent();
        intent.putExtra("ylapi_response", shareResponse);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(i, intent);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            return;
        }
        activity2.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        this.f83OooO0oo = requireActivity();
        ShareRequest shareRequest = OooO0O0.OooOOOO.f108OooO00o;
        if (shareRequest == null) {
            shareRequest = null;
        } else {
            OooOOOO oooOOOO = new OooOOOO(this);
            this.f81OooO0o = oooOOOO;
            oooOOOO.f135OooO0oO = new OooO00o();
            oooOOOO.f136OooO0oo = new OooO0O0();
            FragmentActivity fragmentActivity = this.f83OooO0oo;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("act");
                fragmentActivity = null;
            }
            this.f82OooO0oO = o000oOoO.OooO0O0(fragmentActivity, new OooO0OO());
            OooOOOO oooOOOO2 = this.f81OooO0o;
            if (oooOOOO2 != null) {
                oooOOOO2.OooO0OO(new OooOOOO.OooO0OO(shareRequest));
            }
        }
        if (shareRequest == null) {
            ShareResponse shareResponseCreateShareResponse$default = ShareResponse.Companion.createShareResponse$default(ShareResponse.INSTANCE, -2002, null, 2, null);
            if (isAdded()) {
                Dialog dialog = this.f82OooO0oO;
                if (dialog != null) {
                    dialog.dismiss();
                }
                OooO0O0(shareResponseCreateShareResponse$default);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f82OooO0oO;
        if (dialog != null) {
            dialog.dismiss();
        }
        OooO0O0.OooOOOO.f108OooO00o = null;
        OooOOOO oooOOOO = this.f81OooO0o;
        if (oooOOOO == null) {
            return;
        }
        oooOOOO.OooO0O0();
    }
}
