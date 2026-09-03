package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.moment.MomentsMessagesEditView;
import com.yalla.yalla.ui.view.moment.MomentsMessagesTypeView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0o0000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44974OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final MomentsMessagesEditView f44975OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44976OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44977OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f44978OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MomentsMessagesTypeView f44979OooO0o0;

    public oO0o0000(@NonNull LinearLayout linearLayout, @NonNull MomentsMessagesEditView momentsMessagesEditView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull MomentsMessagesTypeView momentsMessagesTypeView, @NonNull StateLayout stateLayout) {
        this.f44974OooO00o = linearLayout;
        this.f44975OooO0O0 = momentsMessagesEditView;
        this.f44976OooO0OO = recyclerView;
        this.f44977OooO0Oo = textView;
        this.f44979OooO0o0 = momentsMessagesTypeView;
        this.f44978OooO0o = stateLayout;
    }

    @NonNull
    public static oO0o0000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44974OooO00o;
    }

    @NonNull
    public static oO0o0000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_activity_moment_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.momentMessageEditView;
        MomentsMessagesEditView momentsMessagesEditView = (MomentsMessagesEditView) OooO0O0.OooO00o(i, viewInflate);
        if (momentsMessagesEditView != null) {
            i = o0OO00O.recyclerView;
            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                i = o0OO00O.title_content;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = o0OO00O.typeLayoutView;
                    MomentsMessagesTypeView momentsMessagesTypeView = (MomentsMessagesTypeView) OooO0O0.OooO00o(i, viewInflate);
                    if (momentsMessagesTypeView != null) {
                        i = o0OO00O.ylState;
                        StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (stateLayout != null) {
                            return new oO0o0000((LinearLayout) viewInflate, momentsMessagesEditView, recyclerView, textView, momentsMessagesTypeView, stateLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
