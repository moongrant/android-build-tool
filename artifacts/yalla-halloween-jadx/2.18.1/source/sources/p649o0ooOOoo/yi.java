package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class yi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f51050OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f51051OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f51052OooO0OO;

    public yi(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f51050OooO00o = constraintLayout;
        this.f51051OooO0O0 = textView;
        this.f51052OooO0OO = imageView;
    }

    @NonNull
    public static yi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51050OooO00o;
    }

    @NonNull
    public static yi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_gift_week_star_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.weeklyGifts;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.weeklyGifts);
        if (textView != null) {
            i = R.id.weeklyGiftsStar;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.weeklyGiftsStar);
            if (imageView != null) {
                return new yi(constraintLayout, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
