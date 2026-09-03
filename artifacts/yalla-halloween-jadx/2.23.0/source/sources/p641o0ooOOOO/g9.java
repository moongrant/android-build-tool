package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.UserTagView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class g9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57982OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57983OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57984OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57985OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final UserTagView f57986OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f57987OooO0o0;

    public g9(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull UserTagView userTagView) {
        this.f57982OooO00o = constraintLayout;
        this.f57983OooO0O0 = netImageView;
        this.f57984OooO0OO = imageView;
        this.f57985OooO0Oo = imageView2;
        this.f57987OooO0o0 = textView;
        this.f57986OooO0o = userTagView;
    }

    @NonNull
    public static g9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57982OooO00o;
    }

    @NonNull
    public static g9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_item_member_remove, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.head;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = oO00O0oO.officials;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.select;
                ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = oO00O0oO.time;
                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = oO00O0oO.userTagView;
                        UserTagView userTagView = (UserTagView) OooOO0.OooO00o(i, viewInflate);
                        if (userTagView != null) {
                            return new g9((ConstraintLayout) viewInflate, netImageView, imageView, imageView2, textView, userTagView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
