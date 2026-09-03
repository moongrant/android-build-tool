package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.imageMore.ImageMoreView;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.MomentDetailEventView;
import com.yalla.yalla.ui.view.MomentDetailPollView;
import com.yalla.yalla.ui.view.MomentDetailShare;
import com.yalla.yalla.ui.view.MomentDetailText;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class id implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49659OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final MomentDetailEventView f49660OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageMoreView f49661OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final MomentDetailPollView f49662OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final MomentDetailText f49663OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MomentDetailShare f49664OooO0o0;

    public id(@NonNull LinearLayout linearLayout, @NonNull MomentDetailEventView momentDetailEventView, @NonNull ImageMoreView imageMoreView, @NonNull MomentDetailPollView momentDetailPollView, @NonNull MomentDetailShare momentDetailShare, @NonNull MomentDetailText momentDetailText) {
        this.f49659OooO00o = linearLayout;
        this.f49660OooO0O0 = momentDetailEventView;
        this.f49661OooO0OO = imageMoreView;
        this.f49662OooO0Oo = momentDetailPollView;
        this.f49664OooO0o0 = momentDetailShare;
        this.f49663OooO0o = momentDetailText;
    }

    @NonNull
    public static id inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49659OooO00o;
    }

    @NonNull
    public static id inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_forward, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.deleted;
        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.deleted)) != null) {
            i = R.id.event;
            MomentDetailEventView momentDetailEventView = (MomentDetailEventView) o00Oo0.OooO00o(viewInflate, R.id.event);
            if (momentDetailEventView != null) {
                i = R.id.imageMoreView;
                ImageMoreView imageMoreView = (ImageMoreView) o00Oo0.OooO00o(viewInflate, R.id.imageMoreView);
                if (imageMoreView != null) {
                    i = R.id.notSupport;
                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.notSupport)) != null) {
                        i = R.id.pollView;
                        MomentDetailPollView momentDetailPollView = (MomentDetailPollView) o00Oo0.OooO00o(viewInflate, R.id.pollView);
                        if (momentDetailPollView != null) {
                            i = R.id.share;
                            MomentDetailShare momentDetailShare = (MomentDetailShare) o00Oo0.OooO00o(viewInflate, R.id.share);
                            if (momentDetailShare != null) {
                                i = R.id.text;
                                MomentDetailText momentDetailText = (MomentDetailText) o00Oo0.OooO00o(viewInflate, R.id.text);
                                if (momentDetailText != null) {
                                    return new id((LinearLayout) viewInflate, momentDetailEventView, imageMoreView, momentDetailPollView, momentDetailShare, momentDetailText);
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
