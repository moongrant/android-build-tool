package p473o0OoooO0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p104o000oo0O.o00O0O;
import p459o0Ooo0O.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final TextView f40655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f40656OooO0O0;

    public o00OO000(@NonNull TextView textView, @NonNull TextView textView2) {
        this.f40655OooO00o = textView;
        this.f40656OooO0O0 = textView2;
    }

    @NonNull
    public static o00OO000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f40655OooO00o;
    }

    @NonNull
    public static o00OO000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o00000OO.item_custom_lis_up_down_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        Objects.requireNonNull(viewInflate, "rootView");
        TextView textView = (TextView) viewInflate;
        return new o00OO000(textView, textView);
    }
}
