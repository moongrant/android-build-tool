package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class t9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50636OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50637OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f50638OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50640OooO0o0;

    public t9(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull EditText editText, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50636OooO00o = linearLayout;
        this.f50637OooO0O0 = linearLayout2;
        this.f50638OooO0OO = editText;
        this.f50639OooO0Oo = textView;
        this.f50640OooO0o0 = textView2;
    }

    @NonNull
    public static t9 OooO00o(@NonNull View view) {
        int i = R.id.layout_search;
        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(view, R.id.layout_search);
        if (linearLayout != null) {
            i = R.id.search_edit;
            EditText editText = (EditText) o00Oo0.OooO00o(view, R.id.search_edit);
            if (editText != null) {
                i = R.id.search_text;
                TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.search_text);
                if (textView != null) {
                    i = R.id.tv_cancel;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(view, R.id.tv_cancel);
                    if (textView2 != null) {
                        return new t9((LinearLayout) view, linearLayout, editText, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static t9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50636OooO00o;
    }

    @NonNull
    public static t9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_room_member_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
