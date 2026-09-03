package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class g7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49423OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49424OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49425OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f49426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49427OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FixTextView f49428OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49429OooO0oO;

    public g7(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f49423OooO00o = frameLayout;
        this.f49424OooO0O0 = imageView;
        this.f49425OooO0OO = linearLayout;
        this.f49426OooO0Oo = netImageView;
        this.f49428OooO0o0 = fixTextView;
        this.f49427OooO0o = textView;
        this.f49429OooO0oO = textView2;
    }

    @NonNull
    public static g7 OooO00o(@NonNull View view) {
        int i = R.id.ivEventState;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.ivEventState);
        if (imageView != null) {
            i = R.id.llSub;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(view, R.id.llSub);
            if (linearLayout != null) {
                i = R.id.niv;
                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.niv);
                if (netImageView != null) {
                    i = R.id.tvEvent;
                    FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(view, R.id.tvEvent);
                    if (fixTextView != null) {
                        i = R.id.tvEventTime;
                        TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvEventTime);
                        if (textView != null) {
                            i = R.id.tvSubscribe;
                            TextView textView2 = (TextView) o00Oo0.OooO00o(view, R.id.tvSubscribe);
                            if (textView2 != null) {
                                return new g7((FrameLayout) view, imageView, linearLayout, netImageView, fixTextView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static g7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49423OooO00o;
    }

    @NonNull
    public static g7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.chatline_event, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
