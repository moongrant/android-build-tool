package OooO00o.OooO00o.OooO00o.OooO00o.p002OooOOo0;

import OooO00o.OooO00o.OooO00o.OooO00o.p002OooOOo0.o0ooOOo;
import OooOOO.OooOOO0;
import OooOOO.OooOOOO;
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
import p003OooO0Oo.OooOo00;
import p004OooO0o0.OooO0o;
import p622o0oo0oO.o000O0;
import p622o0oo0oO.o000O0Oo;
import p624o0oo0oOo.oO0O00o0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOooO00o/OooO00o/OooO00o/OooO00o/OooOOo0/o0ooOOo;", "LOooO0o0/OooO0o;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class o0ooOOo extends OooO0o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Dialog f60Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public OooOOOO f61Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public FragmentActivity f62OoooO00;

    public static final class OooO00o implements OooOo00.OooO0O0 {
        public OooO00o() {
        }

        @Override // OooO0Oo.OooOo00.OooO0O0
        public final void OooO00o(@NotNull BaseResp response) {
            Intrinsics.checkNotNullParameter(response, "response");
            YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new OooOOO0(response, o0ooOOo.this, 0));
        }
    }

    public static final class OooO0O0 implements OooOo00.OooO00o {
        public OooO0O0() {
        }

        @Override // OooO0Oo.OooOo00.OooO00o
        public final void OooO00o() {
            YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
            final o0ooOOo o0ooooo2 = o0ooOOo.this;
            yCSDKOpenKit.dispatchToMain$lib_release(new Runnable() { // from class: OooOOO.OooOOO
                @Override // java.lang.Runnable
                public final void run() {
                    Dialog dialog;
                    o0ooOOo this$0 = o0ooooo2;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (!this$0.isAdded() || (dialog = this$0.f60Oooo) == null) {
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
            FragmentActivity fragmentActivity = o0ooOOo.this.f62OoooO00;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("act");
                fragmentActivity = null;
            }
            fragmentActivity.finish();
            return Unit.INSTANCE;
        }
    }

    public final void OooO00o(ShareResponse shareResponse) {
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
        this.f62OoooO00 = requireActivity();
        ShareRequest shareRequest = OooO00o.OooOo00.f87OooO00o;
        if (shareRequest == null) {
            shareRequest = null;
        } else {
            OooOOOO oooOOOO = new OooOOOO(this);
            this.f61Oooo0oo = oooOOOO;
            oooOOOO.f111OooO0oO = new OooO00o();
            oooOOOO.f112OooO0oo = new OooO0O0();
            FragmentActivity context = this.f62OoooO00;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("act");
                context = null;
            }
            OooO0OO oooO0OO = new OooO0OO();
            boolean z = (6 & 4) != 0;
            if ((6 & 8) != 0) {
                oooO0OO = null;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Dialog dialog = new Dialog(context, o000O0Oo.BaseCore_MD_Light);
            dialog.setContentView(o000O0.base_core_layout_loading);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(z);
            dialog.setOnCancelListener(new oO0O00o0(oooO0OO));
            dialog.show();
            this.f60Oooo = dialog;
            OooOOOO oooOOOO2 = this.f61Oooo0oo;
            if (oooOOOO2 != null) {
                oooOOOO2.OooO0OO(new OooOOO.OooO0OO(shareRequest));
            }
        }
        if (shareRequest == null) {
            ShareResponse shareResponseCreateShareResponse$default = ShareResponse.Companion.createShareResponse$default(ShareResponse.INSTANCE, -2002, null, 2, null);
            if (isAdded()) {
                Dialog dialog2 = this.f60Oooo;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                OooO00o(shareResponseCreateShareResponse$default);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f60Oooo;
        if (dialog != null) {
            dialog.dismiss();
        }
        OooO00o.OooOo00.f87OooO00o = null;
        OooOOOO oooOOOO = this.f61Oooo0oo;
        if (oooOOOO == null) {
            return;
        }
        oooOOOO.OooO0O0();
    }
}
