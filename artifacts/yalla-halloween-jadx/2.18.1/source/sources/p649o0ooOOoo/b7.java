package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.framework.view.recyclerView.NoScrollRecyclerView;
import com.app.base.view.EmojiFaceView;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.ui.view.SendMomentEmojiAtPollView;
import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import com.yalla.yalla.ui.view.SendMomentPollView;
import com.yalla.yalla.ui.view.SendMomentShareView;
import com.yalla.yalla.ui.view.SendMomentTipsView;
import com.yalla.yalla.ui.view.SendMomentTopicView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class b7 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SendMomentLocationPowerView f48983OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48984OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EmojiFaceView f48985OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final PanelLayout f48986OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f48987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final EditTextSpan f48988OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48989OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f48990OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SendMomentEmojiAtPollView f48991OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final SendMomentPollView f48992OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SendMomentShareView f48993OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final SendMomentTipsView f48994OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final SendMomentTopicView f48995OooOOO0;

    public b7(@NonNull LinearLayout linearLayout, @NonNull EmojiFaceView emojiFaceView, @NonNull PanelLayout panelLayout, @NonNull NoScrollRecyclerView noScrollRecyclerView, @NonNull LinearLayout linearLayout2, @NonNull EditTextSpan editTextSpan, @NonNull ImageView imageView, @NonNull SendMomentEmojiAtPollView sendMomentEmojiAtPollView, @NonNull SendMomentLocationPowerView sendMomentLocationPowerView, @NonNull SendMomentPollView sendMomentPollView, @NonNull SendMomentShareView sendMomentShareView, @NonNull SendMomentTipsView sendMomentTipsView, @NonNull SendMomentTopicView sendMomentTopicView) {
        this.f48984OooO00o = linearLayout;
        this.f48985OooO0O0 = emojiFaceView;
        this.f48986OooO0OO = panelLayout;
        this.f48987OooO0Oo = noScrollRecyclerView;
        this.f48989OooO0o0 = linearLayout2;
        this.f48988OooO0o = editTextSpan;
        this.f48990OooO0oO = imageView;
        this.f48991OooO0oo = sendMomentEmojiAtPollView;
        this.f48983OooO = sendMomentLocationPowerView;
        this.f48992OooOO0 = sendMomentPollView;
        this.f48993OooOO0O = sendMomentShareView;
        this.f48994OooOO0o = sendMomentTipsView;
        this.f48995OooOOO0 = sendMomentTopicView;
    }

    @NonNull
    public static b7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48984OooO00o;
    }

    @NonNull
    public static b7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_send_moment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.emojiFaceView;
        EmojiFaceView emojiFaceView = (EmojiFaceView) o00Oo0.OooO00o(viewInflate, R.id.emojiFaceView);
        if (emojiFaceView != null) {
            i = R.id.faceLayout;
            PanelLayout panelLayout = (PanelLayout) o00Oo0.OooO00o(viewInflate, R.id.faceLayout);
            if (panelLayout != null) {
                i = R.id.imagesRecyclerView;
                NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.imagesRecyclerView);
                if (noScrollRecyclerView != null) {
                    i = R.id.layoutImage;
                    LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutImage);
                    if (linearLayout != null) {
                        i = R.id.mEditContent;
                        EditTextSpan editTextSpan = (EditTextSpan) o00Oo0.OooO00o(viewInflate, R.id.mEditContent);
                        if (editTextSpan != null) {
                            i = R.id.mIvAddImage;
                            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.mIvAddImage);
                            if (imageView != null) {
                                i = R.id.scrollview;
                                if (((ScrollView) o00Oo0.OooO00o(viewInflate, R.id.scrollview)) != null) {
                                    i = R.id.sendMomentBottomView;
                                    SendMomentEmojiAtPollView sendMomentEmojiAtPollView = (SendMomentEmojiAtPollView) o00Oo0.OooO00o(viewInflate, R.id.sendMomentBottomView);
                                    if (sendMomentEmojiAtPollView != null) {
                                        i = R.id.sendMomentLocationView;
                                        SendMomentLocationPowerView sendMomentLocationPowerView = (SendMomentLocationPowerView) o00Oo0.OooO00o(viewInflate, R.id.sendMomentLocationView);
                                        if (sendMomentLocationPowerView != null) {
                                            i = R.id.sendMomentPollView;
                                            SendMomentPollView sendMomentPollView = (SendMomentPollView) o00Oo0.OooO00o(viewInflate, R.id.sendMomentPollView);
                                            if (sendMomentPollView != null) {
                                                i = R.id.sendMomentShareView;
                                                SendMomentShareView sendMomentShareView = (SendMomentShareView) o00Oo0.OooO00o(viewInflate, R.id.sendMomentShareView);
                                                if (sendMomentShareView != null) {
                                                    i = R.id.sendMomentTipsView;
                                                    SendMomentTipsView sendMomentTipsView = (SendMomentTipsView) o00Oo0.OooO00o(viewInflate, R.id.sendMomentTipsView);
                                                    if (sendMomentTipsView != null) {
                                                        i = R.id.sendMomentTopicView;
                                                        SendMomentTopicView sendMomentTopicView = (SendMomentTopicView) o00Oo0.OooO00o(viewInflate, R.id.sendMomentTopicView);
                                                        if (sendMomentTopicView != null) {
                                                            return new b7((LinearLayout) viewInflate, emojiFaceView, panelLayout, noScrollRecyclerView, linearLayout, editTextSpan, imageView, sendMomentEmojiAtPollView, sendMomentLocationPowerView, sendMomentPollView, sendMomentShareView, sendMomentTipsView, sendMomentTopicView);
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
