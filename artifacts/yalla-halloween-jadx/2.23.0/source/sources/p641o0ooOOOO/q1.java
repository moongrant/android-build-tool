package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f58643OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58644OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58645OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58646OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Button f58647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Button f58648OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Button f58649OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58650OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58651OooO0oo;

    public q1(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view) {
        this.f58644OooO00o = linearLayout;
        this.f58645OooO0O0 = imageView;
        this.f58646OooO0OO = textView;
        this.f58647OooO0Oo = button;
        this.f58649OooO0o0 = button2;
        this.f58648OooO0o = button3;
        this.f58650OooO0oO = textView2;
        this.f58651OooO0oo = textView3;
        this.f58643OooO = view;
    }

    @NonNull
    public static q1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58644OooO00o;
    }

    @NonNull
    public static q1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_room_black_list_unjoin_and_unfollow, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bt_cancel;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.bt_Ok;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.bt_unFollow;
                Button button = (Button) OooOO0.OooO00o(i, viewInflate);
                if (button != null) {
                    i = oO00O0oO.bt_unJoin;
                    Button button2 = (Button) OooOO0.OooO00o(i, viewInflate);
                    if (button2 != null) {
                        i = oO00O0oO.bt_unJoinAndUnFollow;
                        Button button3 = (Button) OooOO0.OooO00o(i, viewInflate);
                        if (button3 != null) {
                            i = oO00O0oO.tv_content;
                            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView2 != null) {
                                i = oO00O0oO.tv_title;
                                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView3 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.view_top), viewInflate)) != null) {
                                    return new q1((LinearLayout) viewInflate, imageView, textView, button, button2, button3, textView2, textView3, viewOooO00o);
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
