package p139o00OOOo0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.PackManager;
import java.util.ArrayList;
import java.util.List;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class oo00o extends p146o00Oo000.OooO0O0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f31866OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public RelativeLayout f31867OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public LinearLayout f31868OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f31869OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public List<Integer> f31870OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f31871OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OooO0OO<Integer> f31872OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public RecyclerView f31873o000oOoO;

    public class OooO00o extends OooO0OO<Integer> {
        public OooO00o(Context context) {
            super(context, R.layout.item_rating_dialog);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(@NonNull com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            OooO0o oooO0o = (OooO0o) oooO00o;
            ImageView imageView = (ImageView) oooO0o.OooO0Oo(R.id.iv_rating_score);
            if (oo00o.this.f31871OoooOOo < oooO0o.getAdapterPosition()) {
                imageView.setImageResource(R.drawable.icon_rating_gray);
            } else {
                imageView.setImageResource(R.drawable.icon_rating_yellow);
            }
        }
    }

    public class OooO0O0 implements BaseQuickAdapter.OooOOOO {
        public OooO0O0() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            oo00o oo00oVar = oo00o.this;
            oo00oVar.f31871OoooOOo = i;
            oo00oVar.f31872OoooOo0.notifyDataSetChanged();
            if (i > 2) {
                PackManager.INSTANCE.goToAppStore(oo00o.this.getContext());
            }
            oo00o.this.dismiss();
        }
    }

    public oo00o(@NonNull Context context) {
        super(context, 0);
        this.f31871OoooOOo = -1;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
        this.f31867OoooO0.setVisibility(0);
        this.f31868OoooO0O.setVisibility(0);
        this.f31866OoooO.setText("");
        this.f31866OoooO.setVisibility(8);
        this.f31869OoooOO0.setText("");
        this.f31869OoooOO0.setVisibility(8);
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_rating_layout;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        this.f31867OoooO0 = (RelativeLayout) findViewById(R.id.rl_dialog_background);
        this.f31868OoooO0O = (LinearLayout) findViewById(R.id.ll_dialog_content_wrapper);
        this.f31866OoooO = (TextView) findViewById(R.id.tv_dialog_title);
        this.f31869OoooOO0 = (TextView) findViewById(R.id.tv_dialog_content);
        this.f31873o000oOoO = (RecyclerView) findViewById(R.id.rv_dialog_rating);
        OooO00o oooO00o = new OooO00o(getContext());
        this.f31872OoooOo0 = oooO00o;
        oooO00o.setOnItemClickListener(new OooO0O0());
        this.f31870OoooOOO = new ArrayList();
        for (int i = 0; i < 5; i++) {
            this.f31870OoooOOO.add(Integer.valueOf(i));
        }
        this.f31872OoooOo0.setNewData(this.f31870OoooOOO);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f31873o000oOoO.setLayoutManager(linearLayoutManager);
        this.f31873o000oOoO.setAdapter(this.f31872OoooOo0);
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        if (view.getId() == R.id.iv_dialog_cancel) {
            dismiss();
        }
    }
}
