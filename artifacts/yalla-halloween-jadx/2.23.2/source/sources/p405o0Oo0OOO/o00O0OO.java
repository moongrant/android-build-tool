package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SendMomentTipsView f44315OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44316OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f44317OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f44318OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f44319OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SendMomentEmojiAtPollView f44320OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final EditTextSpan f44321OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SendMomentLocationPowerView f44322OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SendMomentPollView f44323OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final SendMomentTopicView f44324OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ComposeView f44325OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ComposeView f44326OooOO0o;

    public o00O0OO(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull NoScrollRecyclerView noScrollRecyclerView, @NonNull EditTextSpan editTextSpan, @NonNull SendMomentEmojiAtPollView sendMomentEmojiAtPollView, @NonNull SendMomentLocationPowerView sendMomentLocationPowerView, @NonNull SendMomentPollView sendMomentPollView, @NonNull SendMomentTipsView sendMomentTipsView, @NonNull SendMomentTopicView sendMomentTopicView, @NonNull ComposeView composeView3, @NonNull ComposeView composeView4) {
        this.f44316OooO00o = constraintLayout;
        this.f44317OooO0O0 = composeView;
        this.f44318OooO0OO = composeView2;
        this.f44319OooO0Oo = noScrollRecyclerView;
        this.f44321OooO0o0 = editTextSpan;
        this.f44320OooO0o = sendMomentEmojiAtPollView;
        this.f44322OooO0oO = sendMomentLocationPowerView;
        this.f44323OooO0oo = sendMomentPollView;
        this.f44315OooO = sendMomentTipsView;
        this.f44324OooOO0 = sendMomentTopicView;
        this.f44325OooOO0O = composeView3;
        this.f44326OooOO0o = composeView4;
    }

    @NonNull
    public static o00O0OO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44316OooO00o;
    }

    @NonNull
    public static o00O0OO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.activity_send_moment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bottomComposeView;
        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = o0OO00O.composeView;
            ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
            if (composeView2 != null) {
                i = o0OO00O.imagesRecyclerView;
                NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) OooO0O0.OooO00o(i, viewInflate);
                if (noScrollRecyclerView != null) {
                    i = o0OO00O.mEditContent;
                    EditTextSpan editTextSpan = (EditTextSpan) OooO0O0.OooO00o(i, viewInflate);
                    if (editTextSpan != null) {
                        i = o0OO00O.scrollview;
                        if (((ScrollView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.sendMomentBottomView;
                            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = (SendMomentEmojiAtPollView) OooO0O0.OooO00o(i, viewInflate);
                            if (sendMomentEmojiAtPollView != null) {
                                i = o0OO00O.sendMomentLocationLayout;
                                if (((FrameLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    i = o0OO00O.sendMomentLocationView;
                                    SendMomentLocationPowerView sendMomentLocationPowerView = (SendMomentLocationPowerView) OooO0O0.OooO00o(i, viewInflate);
                                    if (sendMomentLocationPowerView != null) {
                                        i = o0OO00O.sendMomentPollView;
                                        SendMomentPollView sendMomentPollView = (SendMomentPollView) OooO0O0.OooO00o(i, viewInflate);
                                        if (sendMomentPollView != null) {
                                            i = o0OO00O.sendMomentTipsView;
                                            SendMomentTipsView sendMomentTipsView = (SendMomentTipsView) OooO0O0.OooO00o(i, viewInflate);
                                            if (sendMomentTipsView != null) {
                                                i = o0OO00O.sendMomentTopicView;
                                                SendMomentTopicView sendMomentTopicView = (SendMomentTopicView) OooO0O0.OooO00o(i, viewInflate);
                                                if (sendMomentTopicView != null) {
                                                    i = o0OO00O.shareComposeView;
                                                    ComposeView composeView3 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (composeView3 != null) {
                                                        i = o0OO00O.topComposeView;
                                                        ComposeView composeView4 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (composeView4 != null) {
                                                            return new o00O0OO((ConstraintLayout) viewInflate, composeView, composeView2, noScrollRecyclerView, editTextSpan, sendMomentEmojiAtPollView, sendMomentLocationPowerView, sendMomentPollView, sendMomentTipsView, sendMomentTopicView, composeView3, composeView4);
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
