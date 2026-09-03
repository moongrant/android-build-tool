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
public final class wf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50896OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50897OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50898OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50900OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50901OooO0o0;

    public wf(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f50896OooO00o = linearLayoutCompat;
        this.f50897OooO0O0 = imageView;
        this.f50898OooO0OO = textView;
        this.f50899OooO0Oo = textView2;
        this.f50901OooO0o0 = textView3;
        this.f50900OooO0o = textView4;
    }

    @NonNull
    public static wf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50896OooO00o;
    }

    @NonNull
    public static wf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_footer_vote_game_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivVoteMore;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivVoteMore);
        if (imageView != null) {
            i = R.id.tvDetailEndTime;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDetailEndTime);
            if (textView != null) {
                i = R.id.tvDetailInitiator;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDetailInitiator);
                if (textView2 != null) {
                    i = R.id.tvDetailStartTime;
                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDetailStartTime);
                    if (textView3 != null) {
                        i = R.id.tvDetailTitle;
                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDetailTitle);
                        if (textView4 != null) {
                            return new wf((LinearLayoutCompat) viewInflate, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
