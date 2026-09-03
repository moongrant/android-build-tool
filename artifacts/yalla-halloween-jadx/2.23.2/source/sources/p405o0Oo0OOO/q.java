package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45397OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f45398OooO0O0;

    public q(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FixedRecyclerView fixedRecyclerView) {
        this.f45397OooO00o = linearLayoutCompat;
        this.f45398OooO0O0 = fixedRecyclerView;
    }

    @NonNull
    public static q inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45397OooO00o;
    }

    @NonNull
    public static q inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_room_game_box, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.rvGameBox;
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) OooO0O0.OooO00o(i, viewInflate);
        if (fixedRecyclerView != null) {
            i = o0OO00O.tv_title;
            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                return new q((LinearLayoutCompat) viewInflate, fixedRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
