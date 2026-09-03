package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class uf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50731OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50732OooO0O0;

    public uf(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.f50731OooO00o = frameLayout;
        this.f50732OooO0O0 = imageView;
    }

    @NonNull
    public static uf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50731OooO00o;
    }

    @NonNull
    public static uf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_vote_game_rule, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivClose;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClose);
        if (imageView != null) {
            i = R.id.tvContent1;
            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvContent1)) != null) {
                i = R.id.tvContent2;
                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvContent2)) != null) {
                    i = R.id.tvContent3;
                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvContent3)) != null) {
                        i = R.id.tvContent4;
                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvContent4)) != null) {
                            i = R.id.tvContent5;
                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvContent5)) != null) {
                                i = R.id.tvTitle;
                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTitle)) != null) {
                                    return new uf((FrameLayout) viewInflate, imageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
