package p363o0OOo0O0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO implements p081o000OoOO.OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final TextView f43946OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f43947OooO0O0;

    public OooO(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f43946OooO00o = textView;
        this.f43947OooO0O0 = textView2;
    }

    @NonNull
    public static OooO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f43946OooO00o;
    }

    @NonNull
    public static OooO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(p360o0OOo00O.OooO.item_custom_lis_up_down_item, viewGroup, false);
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
