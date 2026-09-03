package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.CrossRecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: renamed from: o0ooOOoo.if, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class Cif implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49671OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CrossRecyclerView f49672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49673OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f49674OooO0Oo;

    public Cif(@NonNull FrameLayout frameLayout, @NonNull CrossRecyclerView crossRecyclerView, @NonNull RecyclerView recyclerView, @NonNull View view) {
        this.f49671OooO00o = frameLayout;
        this.f49672OooO0O0 = crossRecyclerView;
        this.f49673OooO0OO = recyclerView;
        this.f49674OooO0Oo = view;
    }

    @NonNull
    public static Cif inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49671OooO00o;
    }

    @NonNull
    public static Cif inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_mic_emoji_panel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.rvEmojiPanelContent;
        CrossRecyclerView crossRecyclerView = (CrossRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvEmojiPanelContent);
        if (crossRecyclerView != null) {
            i = R.id.rvEmojiPanelTable;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvEmojiPanelTable);
            if (recyclerView != null) {
                i = R.id.vSplitLine;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vSplitLine);
                if (viewOooO00o != null) {
                    return new Cif((FrameLayout) viewInflate, crossRecyclerView, recyclerView, viewOooO00o);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
