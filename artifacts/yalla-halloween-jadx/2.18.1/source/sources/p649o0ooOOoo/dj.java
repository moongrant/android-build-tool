package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class dj implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49203OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49204OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49205OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49206OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49207OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49208OooO0oO;

    public dj(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.f49202OooO00o = linearLayout;
        this.f49203OooO0O0 = imageView;
        this.f49204OooO0OO = appCompatTextView;
        this.f49205OooO0Oo = constraintLayout;
        this.f49207OooO0o0 = netImageView;
        this.f49206OooO0o = appCompatTextView2;
        this.f49208OooO0oO = appCompatTextView3;
    }

    @NonNull
    public static dj inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49202OooO00o;
    }

    @NonNull
    public static dj inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_room_member_convene_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.close;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.close);
        if (imageView != null) {
            i = R.id.join;
            AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.join);
            if (appCompatTextView != null) {
                i = R.id.layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layout);
                if (constraintLayout != null) {
                    i = R.id.roomHead;
                    NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.roomHead);
                    if (netImageView != null) {
                        i = R.id.roomInfo;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.roomInfo);
                        if (appCompatTextView2 != null) {
                            i = R.id.roomName;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.roomName);
                            if (appCompatTextView3 != null) {
                                return new dj((LinearLayout) viewInflate, imageView, appCompatTextView, constraintLayout, netImageView, appCompatTextView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
