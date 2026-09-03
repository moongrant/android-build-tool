package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.ImageItemView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class de implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49179OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49180OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49181OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49182OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49183OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49184OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49185OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49186OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49187OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49188OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageItemView f49189OooOO0O;

    public de(@NonNull ConstraintLayout constraintLayout, @NonNull ImageItemView imageItemView, @NonNull ImageItemView imageItemView2, @NonNull ImageItemView imageItemView3, @NonNull ImageItemView imageItemView4, @NonNull ImageItemView imageItemView5, @NonNull ImageItemView imageItemView6, @NonNull ImageItemView imageItemView7, @NonNull ImageItemView imageItemView8, @NonNull ImageItemView imageItemView9, @NonNull ImageItemView imageItemView10) {
        this.f49180OooO00o = constraintLayout;
        this.f49181OooO0O0 = imageItemView;
        this.f49182OooO0OO = imageItemView2;
        this.f49183OooO0Oo = imageItemView3;
        this.f49185OooO0o0 = imageItemView4;
        this.f49184OooO0o = imageItemView5;
        this.f49186OooO0oO = imageItemView6;
        this.f49187OooO0oo = imageItemView7;
        this.f49179OooO = imageItemView8;
        this.f49188OooOO0 = imageItemView9;
        this.f49189OooOO0O = imageItemView10;
    }

    @NonNull
    public static de inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49180OooO00o;
    }

    @NonNull
    public static de inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_view_image_more, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.image_1_0;
        ImageItemView imageItemView = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_1_0);
        if (imageItemView != null) {
            i = R.id.image_9_0;
            ImageItemView imageItemView2 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_0);
            if (imageItemView2 != null) {
                i = R.id.image_9_1;
                ImageItemView imageItemView3 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_1);
                if (imageItemView3 != null) {
                    i = R.id.image_9_2;
                    ImageItemView imageItemView4 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_2);
                    if (imageItemView4 != null) {
                        i = R.id.image_9_3;
                        ImageItemView imageItemView5 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_3);
                        if (imageItemView5 != null) {
                            i = R.id.image_9_4;
                            ImageItemView imageItemView6 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_4);
                            if (imageItemView6 != null) {
                                i = R.id.image_9_5;
                                ImageItemView imageItemView7 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_5);
                                if (imageItemView7 != null) {
                                    i = R.id.image_9_6;
                                    ImageItemView imageItemView8 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_6);
                                    if (imageItemView8 != null) {
                                        i = R.id.image_9_7;
                                        ImageItemView imageItemView9 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_7);
                                        if (imageItemView9 != null) {
                                            i = R.id.image_9_8;
                                            ImageItemView imageItemView10 = (ImageItemView) o00Oo0.OooO00o(viewInflate, R.id.image_9_8);
                                            if (imageItemView10 != null) {
                                                return new de((ConstraintLayout) viewInflate, imageItemView, imageItemView2, imageItemView3, imageItemView4, imageItemView5, imageItemView6, imageItemView7, imageItemView8, imageItemView9, imageItemView10);
                                            }
                                        }
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
