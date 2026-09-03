package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class kf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatButton f49871OooO0O0;

    public kf(@NonNull FrameLayout frameLayout, @NonNull AppCompatButton appCompatButton) {
        this.f49870OooO00o = frameLayout;
        this.f49871OooO0O0 = appCompatButton;
    }

    @NonNull
    public static kf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49870OooO00o;
    }

    @NonNull
    public static kf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_mora_game_rules, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.content1;
        if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.content1)) != null) {
            i = R.id.content2;
            if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.content2)) != null) {
                i = R.id.content3;
                if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.content3)) != null) {
                    i = R.id.content4;
                    if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.content4)) != null) {
                        i = R.id.content5;
                        if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.content5)) != null) {
                            i = R.id.image;
                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.image)) != null) {
                                i = R.id.ok;
                                AppCompatButton appCompatButton = (AppCompatButton) o00Oo0.OooO00o(viewInflate, R.id.ok);
                                if (appCompatButton != null) {
                                    i = R.id.title;
                                    if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.title)) != null) {
                                        return new kf((FrameLayout) viewInflate, appCompatButton);
                                    }
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
