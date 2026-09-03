package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class fe implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49377OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49378OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49379OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49380OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49381OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49382OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49383OooO0oO;

    public fe(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f49377OooO00o = linearLayout;
        this.f49378OooO0O0 = textView;
        this.f49379OooO0OO = textView2;
        this.f49380OooO0Oo = textView3;
        this.f49382OooO0o0 = textView4;
        this.f49381OooO0o = textView5;
        this.f49383OooO0oO = textView6;
    }

    @NonNull
    public static fe inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49377OooO00o;
    }

    @NonNull
    public static fe inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_view_layout_moment_message_type, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.type_all;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.type_all);
        if (textView != null) {
            i = R.id.type_at_me;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.type_at_me);
            if (textView2 != null) {
                i = R.id.type_comment;
                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.type_comment);
                if (textView3 != null) {
                    i = R.id.type_gifts;
                    TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.type_gifts);
                    if (textView4 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        i = R.id.type_like;
                        TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.type_like);
                        if (textView5 != null) {
                            i = R.id.type_other;
                            TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.type_other);
                            if (textView6 != null) {
                                return new fe(linearLayout, textView, textView2, textView3, textView4, textView5, textView6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
