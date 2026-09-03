package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooO;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseReq;
import com.yallatech.support.platform.base.BaseResp;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0Oo.o00O0O;
import p004OooO0o0.OooO0o;
import p309o0O0o0oO.o000Oo0;
import p622o0oo0oO.o000O0;
import p622o0oo0oO.o000O0Oo;
import p624o0oo0oOo.oO0O00o0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOooO00o/OooO00o/OooO00o/OooO00o/OooOOO0/OooO;", "LOooO0o0/OooO0o;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class OooO extends OooO0o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public FragmentActivity f18Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Dialog f19Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public p003OooO0Oo.OooOo00 f20OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public BaseReq f21OoooO00;

    public static final class OooO00o implements OooO0Oo.OooOo00.OooO0O0 {
        public OooO00o() {
        }

        @Override // OooO0Oo.OooOo00.OooO0O0
        public final void OooO00o(@NotNull final BaseResp response) {
            Intrinsics.checkNotNullParameter(response, "response");
            YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
            final OooO oooO = OooO.this;
            yCSDKOpenKit.dispatchToMain$lib_release(new Runnable() { // from class: OooO0Oo.OooOO0
                @Override // java.lang.Runnable
                public final void run() {
                    OooO this$0 = (OooO) oooO;
                    BaseResp response2 = (BaseResp) response;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(response2, "$response");
                    this$0.OooO0O0(response2);
                }
            });
        }
    }

    public static final class OooO0O0 implements OooO0Oo.OooOo00.OooO00o {
        public OooO0O0() {
        }

        @Override // OooO0Oo.OooOo00.OooO00o
        public final void OooO00o() {
            YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
            final OooO oooO = OooO.this;
            final int i = 0;
            yCSDKOpenKit.dispatchToMain$lib_release(new Runnable() { // from class: OooO0Oo.OooOO0O
                @Override // java.lang.Runnable
                public final void run() {
                    Dialog dialog;
                    switch (i) {
                        case 0:
                            OooO this$0 = (OooO) oooO;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (!this$0.isAdded() || (dialog = this$0.f19Oooo0oo) == null) {
                                return;
                            }
                            dialog.dismiss();
                            return;
                        default:
                            Objects.requireNonNull((o000Oo0) oooO);
                            throw null;
                    }
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
            OooO.this.OooO0o0().finish();
            return Unit.INSTANCE;
        }
    }

    public abstract int OooO00o();

    public final void OooO0O0(@NotNull BaseResp response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (isAdded()) {
            Dialog dialog = this.f19Oooo0oo;
            if (dialog != null) {
                dialog.dismiss();
            }
            int i = response.getCode() == OooO00o() ? 0 : -1;
            Intent intent = new Intent();
            intent.putExtra("ylapi_response", response);
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
    }

    @NotNull
    public abstract p003OooO0Oo.OooOo00 OooO0OO();

    @NotNull
    public abstract o00O0O OooO0Oo();

    @NotNull
    public final p003OooO0Oo.OooOo00 OooO0o() {
        p003OooO0Oo.OooOo00 oooOo00 = this.f20OoooO0;
        if (oooOo00 != null) {
            return oooOo00;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseClient");
        return null;
    }

    @NotNull
    public final FragmentActivity OooO0o0() {
        FragmentActivity fragmentActivity = this.f18Oooo;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("act");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        Intrinsics.checkNotNullParameter(fragmentActivityRequireActivity, "<set-?>");
        this.f18Oooo = fragmentActivityRequireActivity;
        Intent intent = OooO0o0().getIntent();
        this.f21OoooO00 = intent == null ? null : (BaseReq) intent.getParcelableExtra("yalla_buddle_extra_data");
        p003OooO0Oo.OooOo00 oooOo00OooO0OO = OooO0OO();
        Intrinsics.checkNotNullParameter(oooOo00OooO0OO, "<set-?>");
        this.f20OoooO0 = oooOo00OooO0OO;
        BaseReq baseReq = this.f21OoooO00;
        if (baseReq == null) {
            baseReq = null;
        } else {
            OooO0o().f111OooO0oO = new OooO00o();
            OooO0o().f112OooO0oo = new OooO0O0();
            FragmentActivity context = OooO0o0();
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
            this.f19Oooo0oo = dialog;
            OooO0o().OooO0OO(OooO0Oo());
        }
        if (baseReq == null) {
            OooO0O0(OooO0o().OooO00o(-2002, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f19Oooo0oo;
        if (dialog != null) {
            dialog.dismiss();
        }
        p003OooO0Oo.OooOo00 oooOo00OooO0o = OooO0o();
        if (oooOo00OooO0o == null) {
            return;
        }
        oooOo00OooO0o.OooO0O0();
    }
}
