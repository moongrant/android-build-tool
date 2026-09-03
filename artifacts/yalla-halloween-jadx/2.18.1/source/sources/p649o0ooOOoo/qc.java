package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.ui.view.MomentsMessagesEditView;
import com.yalla.yalla.ui.view.MomentsMessagesTypeView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class qc implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50369OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final MomentsMessagesEditView f50370OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50371OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50372OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f50373OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MomentsMessagesTypeView f50374OooO0o0;

    public qc(@NonNull LinearLayout linearLayout, @NonNull MomentsMessagesEditView momentsMessagesEditView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull MomentsMessagesTypeView momentsMessagesTypeView, @NonNull StateLayout stateLayout) {
        this.f50369OooO00o = linearLayout;
        this.f50370OooO0O0 = momentsMessagesEditView;
        this.f50371OooO0OO = recyclerView;
        this.f50372OooO0Oo = textView;
        this.f50374OooO0o0 = momentsMessagesTypeView;
        this.f50373OooO0o = stateLayout;
    }

    @NonNull
    public static qc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50369OooO00o;
    }

    @NonNull
    public static qc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_moment_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.momentMessageEditView;
        MomentsMessagesEditView momentsMessagesEditView = (MomentsMessagesEditView) o00Oo0.OooO00o(viewInflate, R.id.momentMessageEditView);
        if (momentsMessagesEditView != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
            if (recyclerView != null) {
                i = R.id.title_content;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.title_content);
                if (textView != null) {
                    i = R.id.typeLayoutView;
                    MomentsMessagesTypeView momentsMessagesTypeView = (MomentsMessagesTypeView) o00Oo0.OooO00o(viewInflate, R.id.typeLayoutView);
                    if (momentsMessagesTypeView != null) {
                        i = R.id.ylState;
                        StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.ylState);
                        if (stateLayout != null) {
                            return new qc((LinearLayout) viewInflate, momentsMessagesEditView, recyclerView, textView, momentsMessagesTypeView, stateLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
