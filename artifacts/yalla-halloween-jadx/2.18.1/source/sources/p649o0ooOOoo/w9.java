package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.framework.view.recyclerView.NoScrollRecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class w9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50864OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50865OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50866OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f50867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f50868OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50869OooO0o0;

    public w9(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull NoScrollRecyclerView noScrollRecyclerView, @NonNull TextView textView, @NonNull View view) {
        this.f50864OooO00o = constraintLayout;
        this.f50865OooO0O0 = imageView;
        this.f50866OooO0OO = linearLayout;
        this.f50867OooO0Oo = noScrollRecyclerView;
        this.f50869OooO0o0 = textView;
        this.f50868OooO0o = view;
    }

    @NonNull
    public static w9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50864OooO00o;
    }

    @NonNull
    public static w9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_send_moment_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.close;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.close);
        if (imageView != null) {
            i = R.id.layoutAdd;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutAdd);
            if (linearLayout != null) {
                i = R.id.pollLength;
                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.pollLength)) != null) {
                    i = R.id.recyclerView;
                    NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                    if (noScrollRecyclerView != null) {
                        i = R.id.timeLong;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.timeLong);
                        if (textView != null) {
                            i = R.id.title;
                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.title)) != null) {
                                i = R.id.titleLine;
                                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.titleLine);
                                if (viewOooO00o != null) {
                                    i = R.id.tvAdd;
                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAdd)) != null) {
                                        return new w9((ConstraintLayout) viewInflate, imageView, linearLayout, noScrollRecyclerView, textView, viewOooO00o);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
