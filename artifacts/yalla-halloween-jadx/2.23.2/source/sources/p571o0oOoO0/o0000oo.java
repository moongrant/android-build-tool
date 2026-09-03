package p571o0oOoO0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.OooOo00;
import com.yalla.yalla.ui.view.StatusView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.util.Function.OooO00o;
import java.util.ArrayList;
import java.util.List;
import p181o00o0000.OooOO0;
import p473o0OoooOo.o0OOOO0o;
import p559o0oOo.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0000oo<T> extends BaseQuickAdapter<T, ViewHolder> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f56423OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public StatusView f56424OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f56425OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00Oo0 f56426OooOoOO;

    public o0000oo(int i, Context context, @Nullable List list) {
        super(i, list);
        this.f56425OooOoO0 = false;
        this.f56423OooOo = context;
        OooOoo0();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final BaseViewHolder OooO0oo(View view) {
        return new ViewHolder(view);
    }

    public final void OooOoOO(boolean z) {
        this.f56425OooOoO0 = z;
        if (z) {
            StatusView statusView = this.f56424OooOoO;
            statusView.OooO0Oo(false);
            statusView.OooO00o(false);
            statusView.OooO0O0(false);
        }
    }

    public final void OooOoo() {
        if (this.f56425OooOoO0) {
            return;
        }
        int iOooOOOO = OooOOOO();
        this.f13173OooO0O0 = false;
        int iOooOOOO2 = OooOOOO();
        if (iOooOOOO == 1) {
            if (iOooOOOO2 == 0) {
                notifyItemRemoved(OooOOOo());
            }
        } else if (iOooOOOO2 == 1) {
            this.f13175OooO0Oo.OooO0o(1);
            notifyItemInserted(OooOOOo());
        }
        this.f56424OooOoO.OooO0OO(false);
        if (OooOo00.OooO00o(this.f13189OooOOoo)) {
            StatusView statusView = this.f56424OooOoO;
            statusView.OooO0O0(true);
            statusView.OooO0Oo(false);
            statusView.OooO00o(false);
        }
    }

    public final void OooOoo0() {
        this.f13193OooOo0o = 4;
        if (this.f56426OooOoOO == null) {
            this.f56426OooOoOO = new o00Oo0();
        }
        this.f13175OooO0Oo = this.f56426OooOoOO;
        Context context = this.f56423OooOo;
        if (context != null) {
            StatusView statusView = new StatusView(context);
            this.f56424OooOoO = statusView;
            statusView.OooO0OO(true);
            StatusView statusView2 = this.f56424OooOoO;
            statusView2.f30175OooOo = true;
            OooO00o oooO00o = statusView2.f30180OooOoO0;
            if (oooO00o != null) {
                oooO00o.OooO0OO();
            }
            OooOo0(this.f56424OooOoO);
        }
        OooOo0o();
    }

    public final void OooOooO(boolean z) {
        FrameLayout frameLayout = this.f13182OooOO0o;
        if (frameLayout != null) {
            frameLayout.getLayoutParams().height = z ? -1 : -2;
        }
    }

    public final void OooOooo(@DrawableRes int i) {
        this.f56424OooOoO.setEmptyImageRes(i);
    }

    public final void Oooo0(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool.booleanValue()) {
            if (!bool2.booleanValue()) {
                OooOoo();
                return;
            }
            Oooo00o();
            if (!bool3.booleanValue() || OooOOOO() == 0) {
                return;
            }
            this.f13174OooO0OO = false;
            this.f13172OooO00o = false;
            OooOO0 oooOO1 = this.f13175OooO0Oo;
            oooOO1.f38401OooO0O0 = false;
            oooOO1.OooO0o(4);
            notifyItemChanged(OooOOOo());
            return;
        }
        if (!bool2.booleanValue()) {
            if (OooOOOO() == 0) {
                return;
            }
            this.f13174OooO0OO = false;
            this.f13175OooO0Oo.OooO0o(3);
            notifyItemChanged(OooOOOo());
            return;
        }
        if (!bool3.booleanValue()) {
            if (OooOOOO() == 0) {
                return;
            }
            this.f13174OooO0OO = false;
            this.f13172OooO00o = true;
            this.f13175OooO0Oo.OooO0o(1);
            notifyItemChanged(OooOOOo());
            return;
        }
        if (OooOOOO() == 0) {
            return;
        }
        this.f13174OooO0OO = false;
        this.f13172OooO00o = false;
        OooOO0 oooOO2 = this.f13175OooO0Oo;
        oooOO2.f38401OooO0O0 = false;
        oooOO2.OooO0o(4);
        notifyItemChanged(OooOOOo());
    }

    public final void Oooo000(@StringRes int i) {
        this.f56424OooOoO.setEmptyText(i);
    }

    public final void Oooo00O(boolean z) {
        this.f56424OooOoO.OooO0OO(z);
    }

    public final void Oooo00o() {
        if (this.f56425OooOoO0) {
            return;
        }
        this.f56424OooOoO.OooO0OO(false);
        if (OooOo00.OooO00o(this.f13189OooOOoo)) {
            StatusView statusView = this.f56424OooOoO;
            statusView.OooO00o(true);
            statusView.OooO0Oo(false);
            statusView.OooO0O0(false);
        }
    }

    public final void Oooo0O0(boolean z) {
        if (z) {
            Oooo00o();
        } else {
            OooOoo();
        }
    }

    public final void Oooo0OO(o0OOOO0o o0oooo0o2) {
        this.f56424OooOoO.setOnErrorClickListener(o0oooo0o2);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public o0000oo(Context context, @Nullable ArrayList arrayList) {
        super(0, arrayList);
        this.f56425OooOoO0 = false;
        this.f56423OooOo = context;
        OooOoo0();
    }

    public o0000oo(Context context, int i) {
        super(i, null);
        this.f56425OooOoO0 = false;
        this.f56423OooOo = context;
        OooOoo0();
    }
}
