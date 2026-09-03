package p407o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Switch f44217OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44218OooO0Oo;

    public o000O0O0(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull Switch r3, @NonNull TextView textView) {
        this.f44215OooO00o = linearLayout;
        this.f44216OooO0O0 = recyclerView;
        this.f44217OooO0OO = r3;
        this.f44218OooO0Oo = textView;
    }

    @NonNull
    public static o000O0O0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44215OooO00o;
    }

    @NonNull
    public static o000O0O0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o0OO00O.account_activity_account_protection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.rvTrustedDevice;
        RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
        if (recyclerView != null) {
            i = o0Oo0oo.switchProtection;
            Switch r0 = (Switch) OooO0O0.OooO00o(i, viewInflate);
            if (r0 != null) {
                i = o0Oo0oo.tvTrustedDevice;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    return new o000O0O0((LinearLayout) viewInflate, recyclerView, r0, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
