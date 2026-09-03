package p365o0OOo0O;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import p366o0OOo0O0.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final TextView f43072OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f43073OooO0O0;

    public OooO(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f43072OooO00o = textView;
        this.f43073OooO0O0 = textView2;
    }

    @NonNull
    public static OooO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43072OooO00o;
    }

    @NonNull
    public static OooO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(OooOOO0.item_custom_lis_up_down_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewInflate;
        return new OooO(textView, textView);
    }
}
