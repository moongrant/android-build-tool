package p649o0ooOOoo;

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
import com.common.videoplayer.view.VideoView;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class sb implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50561OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50562OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f50563OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f50564OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50565OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f50566OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50567OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50568OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f50569OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50570OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f50571OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50572OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final VideoView f50573OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50574OooOOO0;

    public sb(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull VideoView videoView) {
        this.f50562OooO00o = constraintLayout;
        this.f50563OooO0O0 = stateButton;
        this.f50564OooO0OO = editText;
        this.f50565OooO0Oo = imageView;
        this.f50567OooO0o0 = netImageView;
        this.f50566OooO0o = netImageView2;
        this.f50568OooO0oO = netImageView3;
        this.f50569OooO0oo = textView;
        this.f50561OooO = textView2;
        this.f50570OooOO0 = textView3;
        this.f50571OooOO0O = textView4;
        this.f50572OooOO0o = textView5;
        this.f50574OooOOO0 = textView6;
        this.f50573OooOOO = videoView;
    }

    @NonNull
    public static sb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50562OooO00o;
    }

    @NonNull
    public static sb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_dialog_send_theme, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btConfirm;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btConfirm);
        if (stateButton != null) {
            i = R.id.cardView;
            if (((CardView) o00Oo0.OooO00o(viewInflate, R.id.cardView)) != null) {
                i = R.id.clContent;
                if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.clContent)) != null) {
                    i = R.id.etMessage;
                    EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etMessage);
                    if (editText != null) {
                        i = R.id.flCenter;
                        if (((FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flCenter)) != null) {
                            i = R.id.ivClose;
                            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClose);
                            if (imageView != null) {
                                i = R.id.ivLeft;
                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLeft)) != null) {
                                    i = R.id.ivMy;
                                    NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMy);
                                    if (netImageView != null) {
                                        i = R.id.ivRight;
                                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRight)) != null) {
                                            i = R.id.ivShop;
                                            NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivShop);
                                            if (netImageView2 != null) {
                                                i = R.id.ivTarget;
                                                NetImageView netImageView3 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTarget);
                                                if (netImageView3 != null) {
                                                    i = R.id.tvMy;
                                                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMy);
                                                    if (textView != null) {
                                                        i = R.id.tvPrice;
                                                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPrice);
                                                        if (textView2 != null) {
                                                            i = R.id.tvRemainingTimes;
                                                            TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvRemainingTimes);
                                                            if (textView3 != null) {
                                                                i = R.id.tvSend;
                                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSend)) != null) {
                                                                    i = R.id.tvShop;
                                                                    TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvShop);
                                                                    if (textView4 != null) {
                                                                        i = R.id.tvShopType;
                                                                        TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvShopType);
                                                                        if (textView5 != null) {
                                                                            i = R.id.tvTarget;
                                                                            TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTarget);
                                                                            if (textView6 != null) {
                                                                                i = R.id.videoView;
                                                                                VideoView videoView = (VideoView) o00Oo0.OooO00o(viewInflate, R.id.videoView);
                                                                                if (videoView != null) {
                                                                                    return new sb((ConstraintLayout) viewInflate, stateButton, editText, imageView, netImageView, netImageView2, netImageView3, textView, textView2, textView3, textView4, textView5, textView6, videoView);
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
