package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.videoplayer.view.VideoView;
import com.yalla.netimage.NetImageView;
import com.yalla.support.statebutton.StateButton;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class z4 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f59440OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59441OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f59442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f59443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f59444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f59445OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f59446OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f59447OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f59448OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59449OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f59450OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f59451OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final VideoView f59452OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59453OooOOO0;

    public z4(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull VideoView videoView) {
        this.f59441OooO00o = constraintLayout;
        this.f59442OooO0O0 = stateButton;
        this.f59443OooO0OO = editText;
        this.f59444OooO0Oo = imageView;
        this.f59446OooO0o0 = netImageView;
        this.f59445OooO0o = netImageView2;
        this.f59447OooO0oO = netImageView3;
        this.f59448OooO0oo = textView;
        this.f59440OooO = textView2;
        this.f59449OooOO0 = textView3;
        this.f59450OooOO0O = textView4;
        this.f59451OooOO0o = textView5;
        this.f59453OooOOO0 = textView6;
        this.f59452OooOOO = videoView;
    }

    @NonNull
    public static z4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59441OooO00o;
    }

    @NonNull
    public static z4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_dialog_send_theme, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btConfirm;
        StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = oO00O0oO.cardView;
            if (((CardView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.clContent;
                if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.etMessage;
                    EditText editText = (EditText) OooOO0.OooO00o(i, viewInflate);
                    if (editText != null) {
                        i = oO00O0oO.flCenter;
                        if (((FrameLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.ivClose;
                            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView != null) {
                                i = oO00O0oO.ivLeft;
                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    i = oO00O0oO.ivMy;
                                    NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (netImageView != null) {
                                        i = oO00O0oO.ivRight;
                                        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                            i = oO00O0oO.ivShop;
                                            NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                                            if (netImageView2 != null) {
                                                i = oO00O0oO.ivTarget;
                                                NetImageView netImageView3 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                                                if (netImageView3 != null) {
                                                    i = oO00O0oO.tvMy;
                                                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView != null) {
                                                        i = oO00O0oO.tvPrice;
                                                        TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView2 != null) {
                                                            i = oO00O0oO.tvRemainingTimes;
                                                            TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView3 != null) {
                                                                i = oO00O0oO.tvSend;
                                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                    i = oO00O0oO.tvShop;
                                                                    TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView4 != null) {
                                                                        i = oO00O0oO.tvShopType;
                                                                        TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                        if (textView5 != null) {
                                                                            i = oO00O0oO.tvTarget;
                                                                            TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i = oO00O0oO.videoView;
                                                                                VideoView videoView = (VideoView) OooOO0.OooO00o(i, viewInflate);
                                                                                if (videoView != null) {
                                                                                    return new z4((ConstraintLayout) viewInflate, stateButton, editText, imageView, netImageView, netImageView2, netImageView3, textView, textView2, textView3, textView4, textView5, textView6, videoView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
