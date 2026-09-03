package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class rb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f50439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50440OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50441OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50442OooO0o0;

    public rb(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f50438OooO00o = linearLayout;
        this.f50439OooO0O0 = editText;
        this.f50440OooO0OO = imageView;
        this.f50441OooO0Oo = recyclerView;
        this.f50442OooO0o0 = recyclerView2;
    }

    @NonNull
    public static rb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50438OooO00o;
    }

    @NonNull
    public static rb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_activity_yalla_team, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.etMessage;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etMessage);
        if (editText != null) {
            i = R.id.ivSend;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSend);
            if (imageView != null) {
                i = R.id.llChat;
                if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llChat)) != null) {
                    i = R.id.rvMessage;
                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvMessage);
                    if (recyclerView != null) {
                        i = R.id.rvType;
                        RecyclerView recyclerView2 = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvType);
                        if (recyclerView2 != null) {
                            return new rb((LinearLayout) viewInflate, editText, imageView, recyclerView, recyclerView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
