package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseReq;
import com.yallatech.support.platform.base.BaseResp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;
import p611o0oo0o.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOooO00o/OooO00o/OooO00o/OooO00o/OooOOO0/OooO;", "LOooO0o/OooO00o;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class OooO extends OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00Oo0 f43OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Dialog f44OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public FragmentActivity f45OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public BaseReq f46OooO0oo;

    public static final class OooO00o implements o00Oo0.OooO0O0 {
        public OooO00o() {
        }

        @Override // OooO0o0.o00Oo0.OooO0O0
        public final void OooO00o(@NotNull BaseResp response) {
            Intrinsics.checkNotNullParameter(response, "response");
            YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new p003OooO0o0.OooOo(0, OooO.this, response));
        }
    }

    public static final class OooO0O0 implements o00Oo0.OooO00o {
        public OooO0O0() {
        }

        @Override // OooO0o0.o00Oo0.OooO00o
        public final void OooO00o() {
            YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new p003OooO0o0.Oooo000(OooO.this, 0));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity fragmentActivity = OooO.this.f45OooO0oO;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("act");
                fragmentActivity = null;
            }
            fragmentActivity.finish();
            return Unit.INSTANCE;
        }
    }

    public abstract int OooO0O0();

    public final void OooO0OO(@NotNull BaseResp response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (isAdded()) {
            Dialog dialog = this.f44OooO0o;
            if (dialog != null) {
                dialog.dismiss();
            }
            int i = response.getCode() == OooO0O0() ? 0 : -1;
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
    public abstract o00Oo0 OooO0Oo();

    @NotNull
    public final o00Oo0 OooO0o() {
        o00Oo0 o00oo1 = this.f43OooO;
        if (o00oo1 != null) {
            return o00oo1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseClient");
        return null;
    }

    @NotNull
    public abstract o0Oo0oo OooO0o0();

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        Intrinsics.checkNotNullParameter(fragmentActivityRequireActivity, "<set-?>");
        this.f45OooO0oO = fragmentActivityRequireActivity;
        if (fragmentActivityRequireActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("act");
            fragmentActivityRequireActivity = null;
        }
        Intent intent = fragmentActivityRequireActivity.getIntent();
        this.f46OooO0oo = intent == null ? null : (BaseReq) intent.getParcelableExtra("yalla_buddle_extra_data");
        o00Oo0 o00oo0OooO0Oo = OooO0Oo();
        Intrinsics.checkNotNullParameter(o00oo0OooO0Oo, "<set-?>");
        this.f43OooO = o00oo0OooO0Oo;
        BaseReq baseReq = this.f46OooO0oo;
        if (baseReq == null) {
            baseReq = null;
        } else {
            OooO0o().f135OooO0oO = new OooO00o();
            OooO0o().f136OooO0oo = new OooO0O0();
            FragmentActivity fragmentActivity = this.f45OooO0oO;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("act");
                fragmentActivity = null;
            }
            this.f44OooO0o = o000oOoO.OooO0O0(fragmentActivity, new OooO0OO());
            OooO0o().OooO0OO(OooO0o0());
        }
        if (baseReq == null) {
            OooO0OO(OooO0o().OooO00o(-2002, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f44OooO0o;
        if (dialog != null) {
            dialog.dismiss();
        }
        o00Oo0 o00oo0OooO0o = OooO0o();
        if (o00oo0OooO0o == null) {
            return;
        }
        o00oo0OooO0o.OooO0O0();
    }
}
