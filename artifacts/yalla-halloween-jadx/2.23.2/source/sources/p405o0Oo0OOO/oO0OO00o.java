package p405o0Oo0OOO;

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
import com.yalla.android.videoplayer.view.VideoView;
import com.yalla.netimage.NetImageView;
import com.yalla.support.statebutton.StateButton;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00o implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44902OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44903OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f44904OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f44905OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f44907OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44908OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f44909OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44910OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44911OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f44912OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44913OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final VideoView f44914OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44915OooOOO0;

    public oO0OO00o(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull VideoView videoView) {
        this.f44903OooO00o = constraintLayout;
        this.f44904OooO0O0 = stateButton;
        this.f44905OooO0OO = editText;
        this.f44906OooO0Oo = imageView;
        this.f44908OooO0o0 = netImageView;
        this.f44907OooO0o = netImageView2;
        this.f44909OooO0oO = netImageView3;
        this.f44910OooO0oo = textView;
        this.f44902OooO = textView2;
        this.f44911OooOO0 = textView3;
        this.f44912OooOO0O = textView4;
        this.f44913OooOO0o = textView5;
        this.f44915OooOOO0 = textView6;
        this.f44914OooOOO = videoView;
    }

    @NonNull
    public static oO0OO00o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44903OooO00o;
    }

    @NonNull
    public static oO0OO00o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_dialog_send_theme, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btConfirm;
        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = o0OO00O.cardView;
            if (((CardView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.clContent;
                if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.etMessage;
                    EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
                    if (editText != null) {
                        i = o0OO00O.flCenter;
                        if (((FrameLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.ivClose;
                            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView != null) {
                                i = o0OO00O.ivLeft;
                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    i = o0OO00O.ivMy;
                                    NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (netImageView != null) {
                                        i = o0OO00O.ivRight;
                                        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                            i = o0OO00O.ivShop;
                                            NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                                            if (netImageView2 != null) {
                                                i = o0OO00O.ivTarget;
                                                NetImageView netImageView3 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                                                if (netImageView3 != null) {
                                                    i = o0OO00O.tvMy;
                                                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView != null) {
                                                        i = o0OO00O.tvPrice;
                                                        TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView2 != null) {
                                                            i = o0OO00O.tvRemainingTimes;
                                                            TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView3 != null) {
                                                                i = o0OO00O.tvSend;
                                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                    i = o0OO00O.tvShop;
                                                                    TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView4 != null) {
                                                                        i = o0OO00O.tvShopType;
                                                                        TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                        if (textView5 != null) {
                                                                            i = o0OO00O.tvTarget;
                                                                            TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i = o0OO00O.videoView;
                                                                                VideoView videoView = (VideoView) OooO0O0.OooO00o(i, viewInflate);
                                                                                if (videoView != null) {
                                                                                    return new oO0OO00o((ConstraintLayout) viewInflate, stateButton, editText, imageView, netImageView, netImageView2, netImageView3, textView, textView2, textView3, textView4, textView5, textView6, videoView);
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
