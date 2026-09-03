package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.FixTextView;
import com.app.base.view.imageMore.ImageMoreView;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.MomentDetailEventView;
import com.yalla.yalla.ui.view.MomentDetailPollView;
import com.yalla.yalla.ui.view.MomentDetailShareView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class jd implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final FixTextView f49753OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageMoreView f49755OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49756OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49757OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final MomentDetailEventView f49758OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MomentDetailShareView f49759OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final MomentDetailPollView f49760OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49761OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49762OooOO0;

    public jd(@NonNull LinearLayout linearLayout, @NonNull ImageMoreView imageMoreView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull MomentDetailShareView momentDetailShareView, @NonNull MomentDetailEventView momentDetailEventView, @NonNull MomentDetailPollView momentDetailPollView, @NonNull TextView textView, @NonNull FixTextView fixTextView, @NonNull TextView textView2) {
        this.f49754OooO00o = linearLayout;
        this.f49755OooO0O0 = imageMoreView;
        this.f49756OooO0OO = linearLayout2;
        this.f49757OooO0Oo = linearLayout3;
        this.f49759OooO0o0 = momentDetailShareView;
        this.f49758OooO0o = momentDetailEventView;
        this.f49760OooO0oO = momentDetailPollView;
        this.f49761OooO0oo = textView;
        this.f49753OooO = fixTextView;
        this.f49762OooOO0 = textView2;
    }

    @NonNull
    public static jd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49754OooO00o;
    }

    @NonNull
    public static jd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_forward_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivImageMoreViewForwardItem;
        ImageMoreView imageMoreView = (ImageMoreView) o00Oo0.OooO00o(viewInflate, R.id.ivImageMoreViewForwardItem);
        if (imageMoreView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i = R.id.layoutForwardContentItem;
            LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutForwardContentItem);
            if (linearLayout2 != null) {
                i = R.id.layoutForwardShareItem;
                MomentDetailShareView momentDetailShareView = (MomentDetailShareView) o00Oo0.OooO00o(viewInflate, R.id.layoutForwardShareItem);
                if (momentDetailShareView != null) {
                    i = R.id.momentDetailEventViewForwardItem;
                    MomentDetailEventView momentDetailEventView = (MomentDetailEventView) o00Oo0.OooO00o(viewInflate, R.id.momentDetailEventViewForwardItem);
                    if (momentDetailEventView != null) {
                        i = R.id.momentDetailPollViewForwardItem;
                        MomentDetailPollView momentDetailPollView = (MomentDetailPollView) o00Oo0.OooO00o(viewInflate, R.id.momentDetailPollViewForwardItem);
                        if (momentDetailPollView != null) {
                            i = R.id.tvForwardDeleteItem;
                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvForwardDeleteItem)) != null) {
                                i = R.id.tvForwardNotSupportItem;
                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvForwardNotSupportItem);
                                if (textView != null) {
                                    i = R.id.tvForwardTextContentItem;
                                    FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(viewInflate, R.id.tvForwardTextContentItem);
                                    if (fixTextView != null) {
                                        i = R.id.tvForwardTextContentMoreItem;
                                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvForwardTextContentMoreItem);
                                        if (textView2 != null) {
                                            return new jd(linearLayout, imageMoreView, linearLayout, linearLayout2, momentDetailShareView, momentDetailEventView, momentDetailPollView, textView, fixTextView, textView2);
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
