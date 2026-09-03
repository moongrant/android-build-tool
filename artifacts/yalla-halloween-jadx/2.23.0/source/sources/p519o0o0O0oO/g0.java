package p519o0o0O0oO;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import p003OooO0o0.o0O0O00;
import p391o0Oo0.OooOO0;
import p427o0OoOO00.oo000o;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends OooOO0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f52257OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f52258OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f52259OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f52260OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList f52261OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RecyclerView f52262OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f52263OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO00o f52264OooOOOo;

    public class OooO00o extends o000O<Integer> {
        public OooO00o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(@NonNull BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            ImageView imageView = (ImageView) viewHolder.getView(oO00O0oO.iv_rating_score);
            if (g0.this.f52263OooOOOO < viewHolder.getAdapterPosition()) {
                imageView.setImageResource(oOo00OO0.icon_rating_gray);
            } else {
                imageView.setImageResource(oOo00OO0.icon_rating_yellow);
            }
        }
    }

    public class OooO0O0 implements BaseQuickAdapter.OooO0o {
        public OooO0O0() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            g0 g0Var = g0.this;
            g0Var.f52263OooOOOO = i;
            g0Var.f52264OooOOOo.notifyDataSetChanged();
            if (i > 2) {
                oo000o.OooO00o(g0Var.getContext());
            }
            g0Var.dismiss();
        }
    }

    public g0(@NonNull Context context) {
        super(context, 0);
        this.f52263OooOOOO = -1;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
        this.f52257OooO.setVisibility(0);
        this.f52258OooOO0.setVisibility(0);
        this.f52259OooOO0O.setText("");
        this.f52259OooOO0O.setVisibility(8);
        this.f52260OooOO0o.setText("");
        this.f52260OooOO0o.setVisibility(8);
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_rating_layout;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        this.f52257OooO = (RelativeLayout) findViewById(oO00O0oO.rl_dialog_background);
        this.f52258OooOO0 = (LinearLayout) findViewById(oO00O0oO.ll_dialog_content_wrapper);
        this.f52259OooOO0O = (TextView) findViewById(oO00O0oO.tv_dialog_title);
        this.f52260OooOO0o = (TextView) findViewById(oO00O0oO.tv_dialog_content);
        this.f52262OooOOO0 = (RecyclerView) findViewById(oO00O0oO.rv_dialog_rating);
        OooO00o oooO00o = new OooO00o(getContext(), oO00OO0O.item_rating_dialog);
        this.f52264OooOOOo = oooO00o;
        oooO00o.f10098OooO0o = new OooO0O0();
        this.f52261OooOOO = new ArrayList();
        int iOooO00o = 0;
        while (iOooO00o < 5) {
            iOooO00o = o0O0O00.OooO00o(iOooO00o, this.f52261OooOOO, iOooO00o, 1);
        }
        this.f52264OooOOOo.OooOoO0(this.f52261OooOOO);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f52262OooOOO0.setLayoutManager(linearLayoutManager);
        this.f52262OooOOO0.setAdapter(this.f52264OooOOOo);
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        if (view.getId() == oO00O0oO.iv_dialog_cancel) {
            dismiss();
        }
    }
}
