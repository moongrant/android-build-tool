package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class me implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50027OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50028OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50029OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50030OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50031OooO0o0;

    public me(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull NetImageView netImageView2) {
        this.f50027OooO00o = constraintLayout;
        this.f50028OooO0O0 = netImageView;
        this.f50029OooO0OO = appCompatTextView;
        this.f50030OooO0Oo = appCompatTextView2;
        this.f50031OooO0o0 = netImageView2;
    }

    @NonNull
    public static me OooO00o(@NonNull View view) {
        int i = R.id.bg;
        if (((ImageView) o00Oo0.OooO00o(view, R.id.bg)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.head;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.head);
            if (netImageView != null) {
                i = R.id.name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.name);
                if (appCompatTextView != null) {
                    i = R.id.number;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.number);
                    if (appCompatTextView2 != null) {
                        i = R.id.pic;
                        NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(view, R.id.pic);
                        if (netImageView2 != null) {
                            return new me(constraintLayout, netImageView, appCompatTextView, appCompatTextView2, netImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static me inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50027OooO00o;
    }

    @NonNull
    public static me inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_lucky_packet_detail_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
