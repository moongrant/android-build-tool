package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.imageMore.ImageMoreView;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.MomentDetailTopic;
import com.yalla.yalla.ui.view.MomentSendTitleTask;
import com.yalla.yalla.ui.view.MomentTaskPollView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ae implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final MomentSendTitleTask f48941OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48944OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f48945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageMoreView f48946OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f48947OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f48948OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final MomentDetailTopic f48949OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final MomentTaskPollView f48950OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final View f48951OooOO0O;

    public ae(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageMoreView imageMoreView, @NonNull TextView textView3, @NonNull MomentDetailTopic momentDetailTopic, @NonNull MomentSendTitleTask momentSendTitleTask, @NonNull MomentTaskPollView momentTaskPollView, @NonNull View view) {
        this.f48942OooO00o = linearLayout;
        this.f48943OooO0O0 = linearLayout2;
        this.f48944OooO0OO = linearLayout3;
        this.f48945OooO0Oo = textView;
        this.f48947OooO0o0 = textView2;
        this.f48946OooO0o = imageMoreView;
        this.f48948OooO0oO = textView3;
        this.f48949OooO0oo = momentDetailTopic;
        this.f48941OooO = momentSendTitleTask;
        this.f48950OooOO0 = momentTaskPollView;
        this.f48951OooOO0O = view;
    }

    @NonNull
    public static ae inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48942OooO00o;
    }

    @NonNull
    public static ae inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_send_view_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivSharePostTask;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSharePostTask)) != null) {
            i = R.id.layoutContentTask;
            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutContentTask)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i = R.id.layoutSharePostTask;
                if (((RelativeLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutSharePostTask)) != null) {
                    i = R.id.mEditContentLayoutTask;
                    LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.mEditContentLayoutTask);
                    if (linearLayout2 != null) {
                        i = R.id.mEditContentMoreTask;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.mEditContentMoreTask);
                        if (textView != null) {
                            i = R.id.mEditContentTask;
                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.mEditContentTask);
                            if (textView2 != null) {
                                i = R.id.mImageMoreViewTask;
                                ImageMoreView imageMoreView = (ImageMoreView) o00Oo0.OooO00o(viewInflate, R.id.mImageMoreViewTask);
                                if (imageMoreView != null) {
                                    i = R.id.mTvAddressTask;
                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.mTvAddressTask);
                                    if (textView3 != null) {
                                        i = R.id.momentDetailTopicTask;
                                        MomentDetailTopic momentDetailTopic = (MomentDetailTopic) o00Oo0.OooO00o(viewInflate, R.id.momentDetailTopicTask);
                                        if (momentDetailTopic != null) {
                                            i = R.id.momentSendTitleTask;
                                            MomentSendTitleTask momentSendTitleTask = (MomentSendTitleTask) o00Oo0.OooO00o(viewInflate, R.id.momentSendTitleTask);
                                            if (momentSendTitleTask != null) {
                                                i = R.id.momentTaskPollView;
                                                MomentTaskPollView momentTaskPollView = (MomentTaskPollView) o00Oo0.OooO00o(viewInflate, R.id.momentTaskPollView);
                                                if (momentTaskPollView != null) {
                                                    i = R.id.parentBottomTask;
                                                    View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.parentBottomTask);
                                                    if (viewOooO00o != null) {
                                                        i = R.id.tvCommentsTask;
                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCommentsTask)) != null) {
                                                            i = R.id.tvGiftsTask;
                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGiftsTask)) != null) {
                                                                i = R.id.tvPraiseCountTask;
                                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPraiseCountTask)) != null) {
                                                                    return new ae(linearLayout, linearLayout, linearLayout2, textView, textView2, imageMoreView, textView3, momentDetailTopic, momentSendTitleTask, momentTaskPollView, viewOooO00o);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
