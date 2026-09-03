package p564o0oOo0OO;

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
import p466o0Oooo0o.oo00o;
import p562o0oOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o000O<T> extends BaseQuickAdapter<T, ViewHolder> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f56196OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public StatusView f56197OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f56198OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o0OoOo0 f56199OooOoOO;

    public o000O(int i, Context context, @Nullable List list) {
        super(i, list);
        this.f56198OooOoO0 = false;
        this.f56196OooOo = context;
        OooOoo0();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final BaseViewHolder OooO0oo(View view) {
        return new ViewHolder(view);
    }

    public final void OooOoOO(boolean z) {
        this.f56198OooOoO0 = z;
        if (z) {
            StatusView statusView = this.f56197OooOoO;
            statusView.OooO0Oo(false);
            statusView.OooO00o(false);
            statusView.OooO0O0(false);
        }
    }

    public final void OooOoo() {
        if (this.f56198OooOoO0) {
            return;
        }
        int iOooOOOO = OooOOOO();
        this.f10095OooO0O0 = false;
        int iOooOOOO2 = OooOOOO();
        if (iOooOOOO == 1) {
            if (iOooOOOO2 == 0) {
                notifyItemRemoved(OooOOOo());
            }
        } else if (iOooOOOO2 == 1) {
            this.f10097OooO0Oo.OooO0o(1);
            notifyItemInserted(OooOOOo());
        }
        this.f56197OooOoO.OooO0OO(false);
        if (OooOo00.OooO00o(this.f10111OooOOoo)) {
            StatusView statusView = this.f56197OooOoO;
            statusView.OooO0O0(true);
            statusView.OooO0Oo(false);
            statusView.OooO00o(false);
        }
    }

    public final void OooOoo0() {
        this.f10115OooOo0o = 4;
        if (this.f56199OooOoOO == null) {
            this.f56199OooOoOO = new o0OoOo0();
        }
        this.f10097OooO0Oo = this.f56199OooOoOO;
        Context context = this.f56196OooOo;
        if (context != null) {
            StatusView statusView = new StatusView(context);
            this.f56197OooOoO = statusView;
            statusView.OooO0OO(true);
            StatusView statusView2 = this.f56197OooOoO;
            statusView2.f30720OooOo = true;
            OooO00o oooO00o = statusView2.f30725OooOoO0;
            if (oooO00o != null) {
                oooO00o.OooO0OO();
            }
            OooOo0(this.f56197OooOoO);
        }
        OooOo0o();
    }

    public final void OooOooO(boolean z) {
        FrameLayout frameLayout = this.f10104OooOO0o;
        if (frameLayout != null) {
            frameLayout.getLayoutParams().height = z ? -1 : -2;
        }
    }

    public final void OooOooo(@DrawableRes int i) {
        this.f56197OooOoO.setEmptyImageRes(i);
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
            this.f10096OooO0OO = false;
            this.f10094OooO00o = false;
            o00OOOOo.OooO00o oooO00o = this.f10097OooO0Oo;
            oooO00o.f37351OooO0O0 = false;
            oooO00o.OooO0o(4);
            notifyItemChanged(OooOOOo());
            return;
        }
        if (!bool2.booleanValue()) {
            if (OooOOOO() == 0) {
                return;
            }
            this.f10096OooO0OO = false;
            this.f10097OooO0Oo.OooO0o(3);
            notifyItemChanged(OooOOOo());
            return;
        }
        if (!bool3.booleanValue()) {
            if (OooOOOO() == 0) {
                return;
            }
            this.f10096OooO0OO = false;
            this.f10094OooO00o = true;
            this.f10097OooO0Oo.OooO0o(1);
            notifyItemChanged(OooOOOo());
            return;
        }
        if (OooOOOO() == 0) {
            return;
        }
        this.f10096OooO0OO = false;
        this.f10094OooO00o = false;
        o00OOOOo.OooO00o oooO00o2 = this.f10097OooO0Oo;
        oooO00o2.f37351OooO0O0 = false;
        oooO00o2.OooO0o(4);
        notifyItemChanged(OooOOOo());
    }

    public final void Oooo000(@StringRes int i) {
        this.f56197OooOoO.setEmptyText(i);
    }

    public final void Oooo00O(boolean z) {
        this.f56197OooOoO.OooO0OO(z);
    }

    public final void Oooo00o() {
        if (this.f56198OooOoO0) {
            return;
        }
        this.f56197OooOoO.OooO0OO(false);
        if (OooOo00.OooO00o(this.f10111OooOOoo)) {
            StatusView statusView = this.f56197OooOoO;
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

    public final void Oooo0OO(oo00o oo00oVar) {
        this.f56197OooOoO.setOnErrorClickListener(oo00oVar);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public o000O(Context context, @Nullable ArrayList arrayList) {
        super(0, arrayList);
        this.f56198OooOoO0 = false;
        this.f56196OooOo = context;
        OooOoo0();
    }

    public o000O(Context context, int i) {
        super(i, null);
        this.f56198OooOoO0 = false;
        this.f56196OooOo = context;
        OooOoo0();
    }
}
