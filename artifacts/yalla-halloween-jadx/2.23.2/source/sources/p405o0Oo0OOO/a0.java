package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43707OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f43708OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f43709OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f43710OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f43711OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f43712OooO0o0;

    public a0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f43707OooO00o = linearLayoutCompat;
        this.f43708OooO0O0 = imageView;
        this.f43709OooO0OO = textView;
        this.f43710OooO0Oo = textView2;
        this.f43712OooO0o0 = textView3;
        this.f43711OooO0o = textView4;
    }

    @NonNull
    public static a0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43707OooO00o;
    }

    @NonNull
    public static a0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_footer_vote_game_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivVoteMore;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.tvDetailEndTime;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o0OO00O.tvDetailInitiator;
                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    i = o0OO00O.tvDetailStartTime;
                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView3 != null) {
                        i = o0OO00O.tvDetailTitle;
                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView4 != null) {
                            return new a0((LinearLayoutCompat) viewInflate, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
