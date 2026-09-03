package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class y2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59375OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f59376OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f59377OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f59378OooO0Oo;

    public y2(@NonNull ConstraintLayout constraintLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull Group group, @NonNull ImageView imageView) {
        this.f59375OooO00o = constraintLayout;
        this.f59376OooO0O0 = flexboxLayout;
        this.f59377OooO0OO = group;
        this.f59378OooO0Oo = imageView;
    }

    @NonNull
    public static y2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59375OooO00o;
    }

    @NonNull
    public static y2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.layout_header_topic_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.flexBoxHistory;
        FlexboxLayout flexboxLayout = (FlexboxLayout) OooOO0.OooO00o(i, viewInflate);
        if (flexboxLayout != null) {
            i = oO00O0oO.groupSearch;
            Group group = (Group) OooOO0.OooO00o(i, viewInflate);
            if (group != null) {
                i = oO00O0oO.ivClearHistory;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.tvSearchHistory;
                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        return new y2((ConstraintLayout) viewInflate, flexboxLayout, group, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
