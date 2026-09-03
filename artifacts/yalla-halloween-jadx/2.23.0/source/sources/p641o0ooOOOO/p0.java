package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView;
import com.yalla.yalla.ui.view.moment.SendMomentLocationPowerView;
import com.yalla.yalla.ui.view.moment.SendMomentPollView;
import com.yalla.yalla.ui.view.moment.SendMomentTipsView;
import com.yalla.yalla.ui.view.moment.SendMomentTopicView;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SendMomentTipsView f58553OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58554OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f58555OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f58556OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f58557OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SendMomentEmojiAtPollView f58558OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final EditTextSpan f58559OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SendMomentLocationPowerView f58560OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SendMomentPollView f58561OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final SendMomentTopicView f58562OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ComposeView f58563OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ComposeView f58564OooOO0o;

    public p0(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull NoScrollRecyclerView noScrollRecyclerView, @NonNull EditTextSpan editTextSpan, @NonNull SendMomentEmojiAtPollView sendMomentEmojiAtPollView, @NonNull SendMomentLocationPowerView sendMomentLocationPowerView, @NonNull SendMomentPollView sendMomentPollView, @NonNull SendMomentTipsView sendMomentTipsView, @NonNull SendMomentTopicView sendMomentTopicView, @NonNull ComposeView composeView3, @NonNull ComposeView composeView4) {
        this.f58554OooO00o = constraintLayout;
        this.f58555OooO0O0 = composeView;
        this.f58556OooO0OO = composeView2;
        this.f58557OooO0Oo = noScrollRecyclerView;
        this.f58559OooO0o0 = editTextSpan;
        this.f58558OooO0o = sendMomentEmojiAtPollView;
        this.f58560OooO0oO = sendMomentLocationPowerView;
        this.f58561OooO0oo = sendMomentPollView;
        this.f58553OooO = sendMomentTipsView;
        this.f58562OooOO0 = sendMomentTopicView;
        this.f58563OooOO0O = composeView3;
        this.f58564OooOO0o = composeView4;
    }

    @NonNull
    public static p0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58554OooO00o;
    }

    @NonNull
    public static p0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.activity_send_moment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottomComposeView;
        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = oO00O0oO.composeView;
            ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
            if (composeView2 != null) {
                i = oO00O0oO.imagesRecyclerView;
                NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (noScrollRecyclerView != null) {
                    i = oO00O0oO.mEditContent;
                    EditTextSpan editTextSpan = (EditTextSpan) OooOO0.OooO00o(i, viewInflate);
                    if (editTextSpan != null) {
                        i = oO00O0oO.scrollview;
                        if (((ScrollView) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.sendMomentBottomView;
                            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = (SendMomentEmojiAtPollView) OooOO0.OooO00o(i, viewInflate);
                            if (sendMomentEmojiAtPollView != null) {
                                i = oO00O0oO.sendMomentLocationLayout;
                                if (((FrameLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    i = oO00O0oO.sendMomentLocationView;
                                    SendMomentLocationPowerView sendMomentLocationPowerView = (SendMomentLocationPowerView) OooOO0.OooO00o(i, viewInflate);
                                    if (sendMomentLocationPowerView != null) {
                                        i = oO00O0oO.sendMomentPollView;
                                        SendMomentPollView sendMomentPollView = (SendMomentPollView) OooOO0.OooO00o(i, viewInflate);
                                        if (sendMomentPollView != null) {
                                            i = oO00O0oO.sendMomentTipsView;
                                            SendMomentTipsView sendMomentTipsView = (SendMomentTipsView) OooOO0.OooO00o(i, viewInflate);
                                            if (sendMomentTipsView != null) {
                                                i = oO00O0oO.sendMomentTopicView;
                                                SendMomentTopicView sendMomentTopicView = (SendMomentTopicView) OooOO0.OooO00o(i, viewInflate);
                                                if (sendMomentTopicView != null) {
                                                    i = oO00O0oO.shareComposeView;
                                                    ComposeView composeView3 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                                                    if (composeView3 != null) {
                                                        i = oO00O0oO.topComposeView;
                                                        ComposeView composeView4 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                                                        if (composeView4 != null) {
                                                            return new p0((ConstraintLayout) viewInflate, composeView, composeView2, noScrollRecyclerView, editTextSpan, sendMomentEmojiAtPollView, sendMomentLocationPowerView, sendMomentPollView, sendMomentTipsView, sendMomentTopicView, composeView3, composeView4);
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
