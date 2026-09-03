package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class mf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50032OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f50033OooO0O0;

    public mf(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FixedRecyclerView fixedRecyclerView) {
        this.f50032OooO00o = linearLayoutCompat;
        this.f50033OooO0O0 = fixedRecyclerView;
    }

    @NonNull
    public static mf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50032OooO00o;
    }

    @NonNull
    public static mf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_room_game_box, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.rvGameBox;
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvGameBox);
        if (fixedRecyclerView != null) {
            i = R.id.tv_title;
            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_title)) != null) {
                return new mf((LinearLayoutCompat) viewInflate, fixedRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
