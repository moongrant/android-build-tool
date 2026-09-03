package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class vf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50816OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f50817OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50818OooO0OO;

    public vf(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull EditText editText, @NonNull TextView textView) {
        this.f50816OooO00o = linearLayoutCompat;
        this.f50817OooO0O0 = editText;
        this.f50818OooO0OO = textView;
    }

    @NonNull
    public static vf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50816OooO00o;
    }

    @NonNull
    public static vf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_vote_game_set_title, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.etVoteSetTitle;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etVoteSetTitle);
        if (editText != null) {
            i = R.id.tvVoteCount;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvVoteCount);
            if (textView != null) {
                return new vf((LinearLayoutCompat) viewInflate, editText, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
