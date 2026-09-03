package p407o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000o0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45242OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45243OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45244OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45245OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45246OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45247OooO0oO;

    public oOo000o0(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4) {
        this.f45241OooO00o = constraintLayout;
        this.f45242OooO0O0 = netImageView;
        this.f45243OooO0OO = imageView;
        this.f45244OooO0Oo = appCompatTextView;
        this.f45246OooO0o0 = appCompatTextView2;
        this.f45245OooO0o = appCompatTextView3;
        this.f45247OooO0oO = appCompatTextView4;
    }

    @NonNull
    public static oOo000o0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45241OooO00o;
    }

    @NonNull
    public static oOo000o0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o0OO00O.message_dialog_share_events, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.ivEvent;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = o0Oo0oo.ivEventTime;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0Oo0oo.tvEventId;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                if (appCompatTextView != null) {
                    i = o0Oo0oo.tvEventRoom;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                    if (appCompatTextView2 != null) {
                        i = o0Oo0oo.tvEventTime;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                        if (appCompatTextView3 != null) {
                            i = o0Oo0oo.tvEventTitle;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                            if (appCompatTextView4 != null) {
                                return new oOo000o0((ConstraintLayout) viewInflate, netImageView, imageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
