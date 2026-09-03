package p405o0Oo0OOO;

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
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOOo0O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45176OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45177OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45178OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45180OooO0o0;

    public oOOOOo0O(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull NetImageView netImageView2) {
        this.f45176OooO00o = constraintLayout;
        this.f45177OooO0O0 = netImageView;
        this.f45178OooO0OO = appCompatTextView;
        this.f45179OooO0Oo = appCompatTextView2;
        this.f45180OooO0o0 = netImageView2;
    }

    @NonNull
    public static oOOOOo0O OooO00o(@NonNull View view) {
        int i = o0OO00O.bg;
        if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = o0OO00O.head;
            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, view);
            if (netImageView != null) {
                i = o0OO00O.name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, view);
                if (appCompatTextView != null) {
                    i = o0OO00O.number;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooO0O0.OooO00o(i, view);
                    if (appCompatTextView2 != null) {
                        i = o0OO00O.pic;
                        NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, view);
                        if (netImageView2 != null) {
                            return new oOOOOo0O(constraintLayout, netImageView, appCompatTextView, appCompatTextView2, netImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static oOOOOo0O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45176OooO00o;
    }

    @NonNull
    public static oOOOOo0O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_lucky_packet_detail_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
