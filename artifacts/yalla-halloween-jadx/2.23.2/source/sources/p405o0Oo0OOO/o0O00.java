package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f44389OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44390OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44391OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44392OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Button f44393OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Button f44394OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Button f44395OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44396OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44397OooO0oo;

    public o0O00(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view) {
        this.f44390OooO00o = linearLayout;
        this.f44391OooO0O0 = imageView;
        this.f44392OooO0OO = textView;
        this.f44393OooO0Oo = button;
        this.f44395OooO0o0 = button2;
        this.f44394OooO0o = button3;
        this.f44396OooO0oO = textView2;
        this.f44397OooO0oo = textView3;
        this.f44389OooO = view;
    }

    @NonNull
    public static o0O00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44390OooO00o;
    }

    @NonNull
    public static o0O00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_room_black_list_unjoin_and_unfollow, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bt_cancel;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.bt_Ok;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o0OO00O.bt_unFollow;
                Button button = (Button) OooO0O0.OooO00o(i, viewInflate);
                if (button != null) {
                    i = o0OO00O.bt_unJoin;
                    Button button2 = (Button) OooO0O0.OooO00o(i, viewInflate);
                    if (button2 != null) {
                        i = o0OO00O.bt_unJoinAndUnFollow;
                        Button button3 = (Button) OooO0O0.OooO00o(i, viewInflate);
                        if (button3 != null) {
                            i = o0OO00O.tv_content;
                            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView2 != null) {
                                i = o0OO00O.tv_title;
                                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView3 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.view_top), viewInflate)) != null) {
                                    return new o0O00((LinearLayout) viewInflate, imageView, textView, button, button2, button3, textView2, textView3, viewOooO00o);
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
