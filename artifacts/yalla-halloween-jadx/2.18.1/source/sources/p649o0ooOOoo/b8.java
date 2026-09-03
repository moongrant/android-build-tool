package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class b8 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f48996OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48997OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f48998OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f48999OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Button f49000OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Button f49001OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Button f49002OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49003OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49004OooO0oo;

    public b8(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view) {
        this.f48997OooO00o = linearLayout;
        this.f48998OooO0O0 = imageView;
        this.f48999OooO0OO = textView;
        this.f49000OooO0Oo = button;
        this.f49002OooO0o0 = button2;
        this.f49001OooO0o = button3;
        this.f49003OooO0oO = textView2;
        this.f49004OooO0oo = textView3;
        this.f48996OooO = view;
    }

    @NonNull
    public static b8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48997OooO00o;
    }

    @NonNull
    public static b8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_room_black_list_unjoin_and_unfollow, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bt_cancel;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.bt_cancel);
        if (imageView != null) {
            i = R.id.bt_Ok;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.bt_Ok);
            if (textView != null) {
                i = R.id.bt_unFollow;
                Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.bt_unFollow);
                if (button != null) {
                    i = R.id.bt_unJoin;
                    Button button2 = (Button) o00Oo0.OooO00o(viewInflate, R.id.bt_unJoin);
                    if (button2 != null) {
                        i = R.id.bt_unJoinAndUnFollow;
                        Button button3 = (Button) o00Oo0.OooO00o(viewInflate, R.id.bt_unJoinAndUnFollow);
                        if (button3 != null) {
                            i = R.id.tv_content;
                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_content);
                            if (textView2 != null) {
                                i = R.id.tv_title;
                                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_title);
                                if (textView3 != null) {
                                    i = R.id.view_top;
                                    View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.view_top);
                                    if (viewOooO00o != null) {
                                        return new b8((LinearLayout) viewInflate, imageView, textView, button, button2, button3, textView2, textView3, viewOooO00o);
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
