package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class a8 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57491OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatButton f57492OooO0O0;

    public a8(@NonNull FrameLayout frameLayout, @NonNull AppCompatButton appCompatButton) {
        this.f57491OooO00o = frameLayout;
        this.f57492OooO0O0 = appCompatButton;
    }

    @NonNull
    public static a8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57491OooO00o;
    }

    @NonNull
    public static a8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_mora_game_rules, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.content1;
        if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.content2;
            if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.content3;
                if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.content4;
                    if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.content5;
                        if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.image;
                            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                i = oO00O0oO.ok;
                                AppCompatButton appCompatButton = (AppCompatButton) OooOO0.OooO00o(i, viewInflate);
                                if (appCompatButton != null) {
                                    i = oO00O0oO.title;
                                    if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                        return new a8((FrameLayout) viewInflate, appCompatButton);
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
