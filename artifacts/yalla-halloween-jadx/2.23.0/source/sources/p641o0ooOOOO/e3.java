package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57798OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57799OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57800OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f57801OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f57802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57803OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f57804OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f57805OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57806OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57807OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f57808OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57809OooOO0o;

    public e3(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull NetImageView netImageView2, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f57799OooO00o = linearLayout;
        this.f57800OooO0O0 = netImageView;
        this.f57801OooO0OO = textView;
        this.f57802OooO0Oo = textView2;
        this.f57804OooO0o0 = textView3;
        this.f57803OooO0o = textView4;
        this.f57805OooO0oO = netImageView2;
        this.f57806OooO0oo = constraintLayout;
        this.f57798OooO = frameLayout;
        this.f57807OooOO0 = linearLayout2;
        this.f57808OooOO0O = textView5;
        this.f57809OooOO0o = textView6;
    }

    @NonNull
    public static e3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57799OooO00o;
    }

    @NonNull
    public static e3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.layout_send_moment_share, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.eventImage;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = oO00O0oO.eventName;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.eventRoomId;
                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    i = oO00O0oO.eventRoomName;
                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView3 != null) {
                        i = oO00O0oO.eventTime;
                        TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView4 != null) {
                            i = oO00O0oO.ivShare;
                            NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                            if (netImageView2 != null) {
                                i = oO00O0oO.ivVideo;
                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    i = oO00O0oO.layoutEvent;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
                                    if (constraintLayout != null) {
                                        i = oO00O0oO.layoutImage;
                                        FrameLayout frameLayout = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
                                        if (frameLayout != null) {
                                            i = oO00O0oO.layoutShare;
                                            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                            if (linearLayout != null) {
                                                i = oO00O0oO.tvShareContent;
                                                TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView5 != null) {
                                                    i = oO00O0oO.tvShareTitle;
                                                    TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView6 != null) {
                                                        return new e3((LinearLayout) viewInflate, netImageView, textView, textView2, textView3, textView4, netImageView2, constraintLayout, frameLayout, linearLayout, textView5, textView6);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
