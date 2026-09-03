package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class b5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57578OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57579OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57580OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57581OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57582OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57583OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57584OooO0oO;

    public b5(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4) {
        this.f57578OooO00o = constraintLayout;
        this.f57579OooO0O0 = netImageView;
        this.f57580OooO0OO = imageView;
        this.f57581OooO0Oo = appCompatTextView;
        this.f57583OooO0o0 = appCompatTextView2;
        this.f57582OooO0o = appCompatTextView3;
        this.f57584OooO0oO = appCompatTextView4;
    }

    @NonNull
    public static b5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57578OooO00o;
    }

    @NonNull
    public static b5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_dialog_share_events, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivEvent;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = oO00O0oO.ivEventTime;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.tvEventId;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                if (appCompatTextView != null) {
                    i = oO00O0oO.tvEventRoom;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                    if (appCompatTextView2 != null) {
                        i = oO00O0oO.tvEventTime;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                        if (appCompatTextView3 != null) {
                            i = oO00O0oO.tvEventTitle;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                            if (appCompatTextView4 != null) {
                                return new b5((ConstraintLayout) viewInflate, netImageView, imageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
