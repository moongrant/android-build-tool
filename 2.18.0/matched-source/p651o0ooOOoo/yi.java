package p651o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.DotView;
import p105o000oo0O.o00O0O;
import p105o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class yi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51059OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f51060OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f51061OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f51062OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Switch f51063OooO0o0;

    public yi(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull Switch r5) {
        this.f51059OooO00o = linearLayout;
        this.f51060OooO0O0 = textView;
        this.f51061OooO0OO = view;
        this.f51062OooO0Oo = view2;
        this.f51063OooO0o0 = r5;
    }

    @NonNull
    public static yi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p105o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51059OooO00o;
    }

    @NonNull
    public static yi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.dotView;
        if (((DotView) o00Oo0.OooO00o(viewInflate, R.id.dotView)) != null) {
            i = R.id.ivImage;
            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivImage)) != null) {
                i = R.id.llItem;
                if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llItem)) != null) {
                    i = R.id.tvContent;
                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvContent)) != null) {
                        i = R.id.tvTitle;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTitle);
                        if (textView != null) {
                            i = R.id.vLineBottom;
                            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vLineBottom);
                            if (viewOooO00o != null) {
                                i = R.id.vLineTop;
                                View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.vLineTop);
                                if (viewOooO00o2 != null) {
                                    i = R.id.vSwitch;
                                    Switch r5 = (Switch) o00Oo0.OooO00o(viewInflate, R.id.vSwitch);
                                    if (r5 != null) {
                                        return new yi((LinearLayout) viewInflate, textView, viewOooO00o, viewOooO00o2, r5);
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
