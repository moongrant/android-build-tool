package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class xg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50980OooO00o;

    public xg(@NonNull LinearLayoutCompat linearLayoutCompat) {
        this.f50980OooO00o = linearLayoutCompat;
    }

    @NonNull
    public static xg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50980OooO00o;
    }

    @NonNull
    public static xg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_layout_user_info_rank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivType;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivType)) != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvRank)) != null) {
                return new xg(linearLayoutCompat);
            }
            i = R.id.tvRank;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
