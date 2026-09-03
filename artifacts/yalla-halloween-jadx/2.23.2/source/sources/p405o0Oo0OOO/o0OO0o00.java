package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44601OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f44602OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f44603OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44604OooO0Oo;

    public o0OO0o00(@NonNull ConstraintLayout constraintLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull Group group, @NonNull ImageView imageView) {
        this.f44601OooO00o = constraintLayout;
        this.f44602OooO0O0 = flexboxLayout;
        this.f44603OooO0OO = group;
        this.f44604OooO0Oo = imageView;
    }

    @NonNull
    public static o0OO0o00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44601OooO00o;
    }

    @NonNull
    public static o0OO0o00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.layout_header_topic_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flexBoxHistory;
        FlexboxLayout flexboxLayout = (FlexboxLayout) OooO0O0.OooO00o(i, viewInflate);
        if (flexboxLayout != null) {
            i = o0OO00O.groupSearch;
            Group group = (Group) OooO0O0.OooO00o(i, viewInflate);
            if (group != null) {
                i = o0OO00O.ivClearHistory;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.tvSearchHistory;
                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        return new o0OO0o00((ConstraintLayout) viewInflate, flexboxLayout, group, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
