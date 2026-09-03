package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class j9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49730OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f49731OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f49732OooO0OO;

    public j9(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2) {
        this.f49730OooO00o = linearLayout;
        this.f49731OooO0O0 = view;
        this.f49732OooO0OO = view2;
    }

    @NonNull
    public static j9 OooO00o(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.include_search_edittext_iv_clear;
        if (((ImageView) o00Oo0.OooO00o(view, R.id.include_search_edittext_iv_clear)) != null) {
            i = R.id.include_search_edittext_iv_search;
            if (((ImageView) o00Oo0.OooO00o(view, R.id.include_search_edittext_iv_search)) != null) {
                i = R.id.include_search_edittext_layout;
                if (((RelativeLayout) o00Oo0.OooO00o(view, R.id.include_search_edittext_layout)) != null) {
                    i = R.id.include_search_edittext_line_bottom;
                    View viewOooO00o = o00Oo0.OooO00o(view, R.id.include_search_edittext_line_bottom);
                    if (viewOooO00o != null) {
                        i = R.id.include_search_edittext_line_edit;
                        View viewOooO00o2 = o00Oo0.OooO00o(view, R.id.include_search_edittext_line_edit);
                        if (viewOooO00o2 != null) {
                            i = R.id.include_search_edittext_searchEdit;
                            if (((EditText) o00Oo0.OooO00o(view, R.id.include_search_edittext_searchEdit)) != null) {
                                return new j9(linearLayout, viewOooO00o, viewOooO00o2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static j9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49730OooO00o;
    }

    @NonNull
    public static j9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.include_search_edittext, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
