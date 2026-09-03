package p650o0ooo;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.o00O;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import p401o0Oo0O00.OooO;
import p429o0OoOO.o00Ooo;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends OooO<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f58301OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f58302OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f58303OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f58304OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList f58305OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RecyclerView f58306OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f58307OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO00o f58308OooOOOo;

    public class OooO00o extends o0000oo<Integer> {
        public OooO00o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(@NonNull BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            ImageView imageView = (ImageView) viewHolder.getView(o0OO00O.iv_rating_score);
            if (j0.this.f58307OooOOOO < viewHolder.getAdapterPosition()) {
                imageView.setImageResource(o0Oo0oo.icon_rating_gray);
            } else {
                imageView.setImageResource(o0Oo0oo.icon_rating_yellow);
            }
        }
    }

    public class OooO0O0 implements BaseQuickAdapter.OooO0o {
        public OooO0O0() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            j0 j0Var = j0.this;
            j0Var.f58307OooOOOO = i;
            j0Var.f58308OooOOOo.notifyDataSetChanged();
            if (i > 2) {
                o00Ooo.OooO00o(j0Var.getContext());
            }
            j0Var.dismiss();
        }
    }

    public j0(@NonNull Context context) {
        super(context, 0);
        this.f58307OooOOOO = -1;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
        this.f58301OooO.setVisibility(0);
        this.f58302OooOO0.setVisibility(0);
        this.f58303OooOO0O.setText("");
        this.f58303OooOO0O.setVisibility(8);
        this.f58304OooOO0o.setText("");
        this.f58304OooOO0o.setVisibility(8);
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_rating_layout;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        this.f58301OooO = (RelativeLayout) findViewById(o0OO00O.rl_dialog_background);
        this.f58302OooOO0 = (LinearLayout) findViewById(o0OO00O.ll_dialog_content_wrapper);
        this.f58303OooOO0O = (TextView) findViewById(o0OO00O.tv_dialog_title);
        this.f58304OooOO0o = (TextView) findViewById(o0OO00O.tv_dialog_content);
        this.f58306OooOOO0 = (RecyclerView) findViewById(o0OO00O.rv_dialog_rating);
        OooO00o oooO00o = new OooO00o(getContext(), oo0o0Oo.item_rating_dialog);
        this.f58308OooOOOo = oooO00o;
        oooO00o.f13176OooO0o = new OooO0O0();
        this.f58305OooOOO = new ArrayList();
        int iOooO00o = 0;
        while (iOooO00o < 5) {
            iOooO00o = o00O.OooO00o(iOooO00o, this.f58305OooOOO, iOooO00o, 1);
        }
        this.f58308OooOOOo.OooOoO0(this.f58305OooOOO);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f58306OooOOO0.setLayoutManager(linearLayoutManager);
        this.f58306OooOOO0.setAdapter(this.f58308OooOOOo);
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        if (view.getId() == o0OO00O.iv_dialog_cancel) {
            dismiss();
        }
    }
}
