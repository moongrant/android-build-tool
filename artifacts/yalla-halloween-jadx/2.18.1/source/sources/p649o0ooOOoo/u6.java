package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class u6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50675OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50676OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50677OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50679OooO0o0;

    public u6(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50675OooO00o = linearLayout;
        this.f50676OooO0O0 = imageView;
        this.f50677OooO0OO = linearLayout2;
        this.f50678OooO0Oo = textView;
        this.f50679OooO0o0 = textView2;
    }

    @NonNull
    public static u6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50675OooO00o;
    }

    @NonNull
    public static u6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_untie_account_bind, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivPlatformBg;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPlatformBg);
        if (imageView != null) {
            i = R.id.llUntieBind;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llUntieBind);
            if (linearLayout != null) {
                i = R.id.tvUntieBindResult;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvUntieBindResult);
                if (textView != null) {
                    i = R.id.tvUserName;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvUserName);
                    if (textView2 != null) {
                        return new u6((LinearLayout) viewInflate, imageView, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
