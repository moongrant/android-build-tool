package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44605OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44606OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f44607OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44608OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44609OooO0o0;

    public o0OO0oO0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull EditText editText, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f44605OooO00o = linearLayout;
        this.f44606OooO0O0 = linearLayout2;
        this.f44607OooO0OO = editText;
        this.f44608OooO0Oo = textView;
        this.f44609OooO0o0 = textView2;
    }

    @NonNull
    public static o0OO0oO0 OooO00o(@NonNull View view) {
        int i = o0OO00O.layout_search;
        LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, view);
        if (linearLayout != null) {
            i = o0OO00O.search_edit;
            EditText editText = (EditText) OooO0O0.OooO00o(i, view);
            if (editText != null) {
                i = o0OO00O.search_text;
                TextView textView = (TextView) OooO0O0.OooO00o(i, view);
                if (textView != null) {
                    i = o0OO00O.tv_cancel;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, view);
                    if (textView2 != null) {
                        return new o0OO0oO0((LinearLayout) view, linearLayout, editText, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static o0OO0oO0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44605OooO00o;
    }

    @NonNull
    public static o0OO0oO0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.layout_room_member_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
