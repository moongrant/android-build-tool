package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class gf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49465OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49466OooO0O0;

    public gf(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView) {
        this.f49465OooO00o = constraintLayout;
        this.f49466OooO0O0 = imageView;
    }

    @NonNull
    public static gf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49465OooO00o;
    }

    @NonNull
    public static gf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_lucky_packet_rules, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.close;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.close);
        if (imageView != null) {
            i = R.id.content1;
            if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.content1)) != null) {
                i = R.id.content2;
                if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.content2)) != null) {
                    i = R.id.content3;
                    if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.content3)) != null) {
                        i = R.id.title;
                        if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.title)) != null) {
                            return new gf((ConstraintLayout) viewInflate, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
