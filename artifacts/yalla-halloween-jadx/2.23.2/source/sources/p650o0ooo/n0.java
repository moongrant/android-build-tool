package p650o0ooo;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.model.ReplaceMedalModel;
import com.yalla.yalla.ui.view.StatusView;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p022Oooo00O.OooOO0;
import p384o0OOoo0O.Oooo0;
import p426o0OoO0o0.OooOOOO;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p590o0oOooo0.O0O0;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends p401o0Oo0O00.OooO<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f58403OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f58404OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ArrayList<String> f58405OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public RecyclerView f58406OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final FragmentActivity f58407OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public StatusView f58408OooOOO0;

    public class OooO implements BaseQuickAdapter.OooO0O0 {
        public OooO() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
        public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (i >= baseQuickAdapter.f13189OooOOoo.size()) {
                return;
            }
            ReplaceMedalModel.DataBean dataBean = (ReplaceMedalModel.DataBean) baseQuickAdapter.f13189OooOOoo.get(i);
            int i2 = dataBean.medalid;
            n0 n0Var = n0.this;
            boolean z = !n0Var.OooOOO0(i2);
            StringBuilder sb = new StringBuilder();
            if (!z) {
                int size = n0Var.f58405OooOO0O.size();
                int i3 = n0Var.f58403OooO;
                if (size <= i3) {
                    return;
                } else {
                    n0Var.f58405OooOO0O.remove(i3);
                }
            } else if (n0Var.f58403OooO >= n0Var.f58405OooOO0O.size()) {
                n0Var.f58405OooOO0O.add(dataBean.type + "_" + dataBean.medalid + "_" + dataBean.level);
            } else {
                n0Var.f58405OooOO0O.set(n0Var.f58403OooO, dataBean.type + "_" + dataBean.medalid + "_" + dataBean.level);
            }
            for (String str : n0Var.f58405OooOO0O) {
                sb.append(",");
                sb.append(str);
            }
            String string = new StringBuilder(sb.toString().replaceFirst(",", "")).toString();
            int i4 = !z ? 1 : 0;
            p0 p0Var = new p0(n0Var, n0Var.getContext(), z, string);
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("medalstr", string);
            linkedHashMapOooO00o.put("medaltype", i4 + "");
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43441o0OoOo0, linkedHashMapOooO00o, p0Var);
        }
    }

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
            n0 n0Var = n0.this;
            n0Var.f58404OooOO0.OooOoo();
            StatusView statusView = n0Var.f58408OooOOO0;
            statusView.OooO0O0(true);
            statusView.OooO0Oo(false);
            statusView.OooO00o(false);
            n0Var.f58408OooOOO0.setVisibility(0);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            ReplaceMedalModel replaceMedalModel = (ReplaceMedalModel) oOOO00.OooO00o(str, ReplaceMedalModel.class);
            n0 n0Var = n0.this;
            if (n0Var.isShowing()) {
                if (replaceMedalModel == null || OooOo00.OooO00o(replaceMedalModel.data)) {
                    n0Var.f58404OooOO0.Oooo00o();
                    StatusView statusView = n0Var.f58408OooOOO0;
                    statusView.OooO00o(true);
                    statusView.OooO0Oo(false);
                    statusView.OooO0O0(false);
                    n0Var.f58408OooOOO0.setVisibility(0);
                    return;
                }
                n0Var.f58404OooOO0.OooOoO0(replaceMedalModel.data);
                n0Var.f58404OooOO0.Oooo0O0(true);
                StatusView statusView2 = n0Var.f58408OooOOO0;
                statusView2.OooO0Oo(false);
                statusView2.OooO00o(false);
                statusView2.OooO0O0(false);
                n0Var.f58408OooOOO0.setVisibility(8);
            }
        }
    }

    public class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            n0 n0Var = n0.this;
            n0Var.f58404OooOO0.Oooo00O(true);
            n0Var.OooOO0o();
        }
    }

    public class OooO0OO extends o0OOOO0o {
        public OooO0OO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            n0.this.dismiss();
        }
    }

    public class OooO0o extends o0000oo<ReplaceMedalModel.DataBean> {
        public OooO0o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            ReplaceMedalModel.DataBean dataBean = (ReplaceMedalModel.DataBean) obj;
            Uri uriOooO00o = O0O0.OooO00o(dataBean.medalid, dataBean.level);
            if (dataBean.type == 1) {
                uriOooO00o = O0O0.OooO00o(dataBean.medalid, 1);
            }
            viewHolder.setText(o0OO00O.tvName, dataBean.name);
            SVGAView sVGAView = (SVGAView) viewHolder.getView(o0OO00O.nivMedal);
            int i = o0Oo0oo.honor_medal_loading;
            sVGAView.f13232OooOooO = i;
            sVGAView.setImageResource(i);
            String string = uriOooO00o.toString();
            n0 n0Var = n0.this;
            sVGAView.OooOO0O(string, n0Var.f58407OooOOO);
            sVGAView.OooOO0o();
            boolean zOooOOO0 = n0Var.OooOOO0(dataBean.medalid);
            int i2 = o0OO00O.tvState;
            viewHolder.addOnClickListener(i2);
            if (zOooOOO0) {
                viewHolder.setText(i2, o000000.Wearning);
                int i3 = n0Var.f58403OooO;
                if ((i3 >= n0Var.f58405OooOO0O.size() ? -1 : Integer.parseInt(n0Var.f58405OooOO0O.get(i3).split("_")[1])) == dataBean.medalid) {
                    viewHolder.setBackgroundRes(i2, o0Oo0oo.ic_badge_state_remove);
                } else {
                    viewHolder.setBackgroundRes(i2, o0Oo0oo.ic_badge_state_added);
                    viewHolder.removeViewOnClickListener(i2);
                }
            } else {
                viewHolder.setText(i2, "");
                viewHolder.setBackgroundRes(i2, o0Oo0oo.ic_badge_state_add);
            }
            int i4 = o0OO00O.tvNum;
            viewHolder.setText(i4, dataBean.type != 0 ? OooOO0.OooO00o(new StringBuilder(), dataBean.level, "") : "");
            viewHolder.setTextColor(i4, o0000.OooO00o(O0O0.OooO0O0(dataBean.medalid)));
        }
    }

    public n0(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
        this.f58407OooOOO = fragmentActivity;
        OooOO0O(80);
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_replace_medal;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        this.f58406OooOO0o = (RecyclerView) findViewById(o0OO00O.rv_replace_medal);
        StatusView statusView = (StatusView) findViewById(o0OO00O.ehv);
        this.f58408OooOOO0 = statusView;
        statusView.OooO0OO(true);
        this.f58408OooOOO0.setEmptyImageRes(o0Oo0oo.ic_empty_delete);
        this.f58408OooOOO0.setEmptyText(o000000.no_badge);
        this.f58408OooOOO0.setOnErrorClickListener(new OooO0O0());
        findViewById(o0OO00O.iv_close).setOnClickListener(new OooO0OO());
        this.f58406OooOO0o.setLayoutManager(new FixGridLayoutManager(getContext(), 3));
        OooO0o oooO0o = new OooO0o(getContext(), oo0o0Oo.item_replace_medal);
        this.f58404OooOO0 = oooO0o;
        oooO0o.Oooo00O(false);
        this.f58404OooOO0.OooOoOO(true);
        OooO0o oooO0o2 = this.f58404OooOO0;
        oooO0o2.f13179OooO0oo = new OooO();
        this.f58406OooOO0o.setAdapter(oooO0o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0o() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        this.f58405OooOO0O = new ArrayList<>(Arrays.asList(O0O0.OooO0Oo((String) o0O00oO0.OooOO0O().getValue())));
        OooO00o oooO00o = new OooO00o(getContext());
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43392Ooooooo, OooOOOO.OooO00o(), oooO00o);
    }

    public final boolean OooOOO0(int i) {
        for (String str : this.f58405OooOO0O) {
            int i2 = O0O0.f57095OooO00o;
            if (i == Integer.parseInt(str.split("_")[1])) {
                return true;
            }
        }
        return false;
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        if (view.getId() == o0OO00O.iv_close) {
            dismiss();
        }
    }

    @Override // p401o0Oo0O00.OooO, android.app.Dialog
    public final void show() {
        super.show();
        OooOO0o();
    }
}
