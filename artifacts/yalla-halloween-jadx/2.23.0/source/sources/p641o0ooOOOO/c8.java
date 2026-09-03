package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class c8 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57667OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f57668OooO0O0;

    public c8(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FixedRecyclerView fixedRecyclerView) {
        this.f57667OooO00o = linearLayoutCompat;
        this.f57668OooO0O0 = fixedRecyclerView;
    }

    @NonNull
    public static c8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57667OooO00o;
    }

    @NonNull
    public static c8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_room_game_box, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.rvGameBox;
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) OooOO0.OooO00o(i, viewInflate);
        if (fixedRecyclerView != null) {
            i = oO00O0oO.tv_title;
            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                return new c8((LinearLayoutCompat) viewInflate, fixedRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
