package p651o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p105o000oo0O.o00O0O;
import p105o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class gd implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49491OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49492OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49493OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49494OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49495OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49496OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49497OooO0oO;

    public gd(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f49491OooO00o = constraintLayout;
        this.f49492OooO0O0 = imageView;
        this.f49493OooO0OO = netImageView;
        this.f49494OooO0Oo = textView;
        this.f49496OooO0o0 = textView2;
        this.f49495OooO0o = textView3;
        this.f49497OooO0oO = textView4;
    }

    @NonNull
    public static gd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p105o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49491OooO00o;
    }

    @NonNull
    public static gd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_event, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.eventClick;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.eventClick);
        if (imageView != null) {
            i = R.id.eventImage;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.eventImage);
            if (netImageView != null) {
                i = R.id.eventName;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.eventName);
                if (textView != null) {
                    i = R.id.eventRoomId;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.eventRoomId);
                    if (textView2 != null) {
                        i = R.id.eventRoomName;
                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.eventRoomName);
                        if (textView3 != null) {
                            i = R.id.eventTime;
                            TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.eventTime);
                            if (textView4 != null) {
                                return new gd((ConstraintLayout) viewInflate, imageView, netImageView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
