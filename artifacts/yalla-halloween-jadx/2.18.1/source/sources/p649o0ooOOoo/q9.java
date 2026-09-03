package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.flexbox.FlexboxLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class q9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50360OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f50361OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f50362OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50363OooO0Oo;

    public q9(@NonNull ConstraintLayout constraintLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull Group group, @NonNull ImageView imageView) {
        this.f50360OooO00o = constraintLayout;
        this.f50361OooO0O0 = flexboxLayout;
        this.f50362OooO0OO = group;
        this.f50363OooO0Oo = imageView;
    }

    @NonNull
    public static q9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50360OooO00o;
    }

    @NonNull
    public static q9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_header_topic_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.flexBoxHistory;
        FlexboxLayout flexboxLayout = (FlexboxLayout) o00Oo0.OooO00o(viewInflate, R.id.flexBoxHistory);
        if (flexboxLayout != null) {
            i = R.id.groupSearch;
            Group group = (Group) o00Oo0.OooO00o(viewInflate, R.id.groupSearch);
            if (group != null) {
                i = R.id.ivClearHistory;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClearHistory);
                if (imageView != null) {
                    i = R.id.tvSearchHistory;
                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSearchHistory)) != null) {
                        return new q9((ConstraintLayout) viewInflate, flexboxLayout, group, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
