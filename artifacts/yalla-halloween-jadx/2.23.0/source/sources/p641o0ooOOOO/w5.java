package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class w5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59147OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final MomentsMessagesEditView f59148OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f59149OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f59150OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f59151OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MomentsMessagesTypeView f59152OooO0o0;

    public w5(@NonNull LinearLayout linearLayout, @NonNull MomentsMessagesEditView momentsMessagesEditView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull MomentsMessagesTypeView momentsMessagesTypeView, @NonNull StateLayout stateLayout) {
        this.f59147OooO00o = linearLayout;
        this.f59148OooO0O0 = momentsMessagesEditView;
        this.f59149OooO0OO = recyclerView;
        this.f59150OooO0Oo = textView;
        this.f59152OooO0o0 = momentsMessagesTypeView;
        this.f59151OooO0o = stateLayout;
    }

    @NonNull
    public static w5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59147OooO00o;
    }

    @NonNull
    public static w5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_activity_moment_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.momentMessageEditView;
        MomentsMessagesEditView momentsMessagesEditView = (MomentsMessagesEditView) OooOO0.OooO00o(i, viewInflate);
        if (momentsMessagesEditView != null) {
            i = oO00O0oO.recyclerView;
            RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                i = oO00O0oO.title_content;
                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = oO00O0oO.typeLayoutView;
                    MomentsMessagesTypeView momentsMessagesTypeView = (MomentsMessagesTypeView) OooOO0.OooO00o(i, viewInflate);
                    if (momentsMessagesTypeView != null) {
                        i = oO00O0oO.ylState;
                        StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                        if (stateLayout != null) {
                            return new w5((LinearLayout) viewInflate, momentsMessagesEditView, recyclerView, textView, momentsMessagesTypeView, stateLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
