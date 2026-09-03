package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57468OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57469OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f57470OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f57471OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f57472OooO0o0;

    public a3(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull EditText editText, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f57468OooO00o = linearLayout;
        this.f57469OooO0O0 = linearLayout2;
        this.f57470OooO0OO = editText;
        this.f57471OooO0Oo = textView;
        this.f57472OooO0o0 = textView2;
    }

    @NonNull
    public static a3 OooO00o(@NonNull View view) {
        int i = oO00O0oO.layout_search;
        LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, view);
        if (linearLayout != null) {
            i = oO00O0oO.search_edit;
            EditText editText = (EditText) OooOO0.OooO00o(i, view);
            if (editText != null) {
                i = oO00O0oO.search_text;
                TextView textView = (TextView) OooOO0.OooO00o(i, view);
                if (textView != null) {
                    i = oO00O0oO.tv_cancel;
                    TextView textView2 = (TextView) OooOO0.OooO00o(i, view);
                    if (textView2 != null) {
                        return new a3((LinearLayout) view, linearLayout, editText, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static a3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57468OooO00o;
    }

    @NonNull
    public static a3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.layout_room_member_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
