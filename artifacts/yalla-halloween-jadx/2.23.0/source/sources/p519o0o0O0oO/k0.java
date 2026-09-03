package p519o0o0O0oO;

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
import p377o0OOoOo.o0000O;
import p391o0Oo0.OooOO0;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p564o0oOo0OO.o000O;
import p579o0oOoo.oOo00OO0;
import p579o0oOoo.oOo00o0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends OooOO0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f52391OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f52392OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ArrayList<String> f52393OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public RecyclerView f52394OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final FragmentActivity f52395OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public StatusView f52396OooOOO0;

    public class OooO implements BaseQuickAdapter.OooO0O0 {
        public OooO() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
        public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (i >= baseQuickAdapter.f10111OooOOoo.size()) {
                return;
            }
            ReplaceMedalModel.DataBean dataBean = (ReplaceMedalModel.DataBean) baseQuickAdapter.f10111OooOOoo.get(i);
            int i2 = dataBean.medalid;
            k0 k0Var = k0.this;
            boolean z = !k0Var.OooOOO0(i2);
            StringBuilder sb = new StringBuilder();
            if (!z) {
                int size = k0Var.f52393OooOO0O.size();
                int i3 = k0Var.f52391OooO;
                if (size <= i3) {
                    return;
                } else {
                    k0Var.f52393OooOO0O.remove(i3);
                }
            } else if (k0Var.f52391OooO >= k0Var.f52393OooOO0O.size()) {
                k0Var.f52393OooOO0O.add(dataBean.type + "_" + dataBean.medalid + "_" + dataBean.level);
            } else {
                k0Var.f52393OooOO0O.set(k0Var.f52391OooO, dataBean.type + "_" + dataBean.medalid + "_" + dataBean.level);
            }
            for (String str : k0Var.f52393OooOO0O) {
                sb.append(",");
                sb.append(str);
            }
            String string = new StringBuilder(sb.toString().replaceFirst(",", "")).toString();
            int i4 = !z ? 1 : 0;
            l0 l0Var = new l0(k0Var, k0Var.getContext(), z, string);
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("medalstr", string);
            linkedHashMapOooO00o.put("medaltype", i4 + "");
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44182o0OoOo0, linkedHashMapOooO00o, l0Var);
        }
    }

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
            k0 k0Var = k0.this;
            k0Var.f52392OooOO0.OooOoo();
            StatusView statusView = k0Var.f52396OooOOO0;
            statusView.OooO0O0(true);
            statusView.OooO0Oo(false);
            statusView.OooO00o(false);
            k0Var.f52396OooOOO0.setVisibility(0);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            ReplaceMedalModel replaceMedalModel = (ReplaceMedalModel) oOo00OO0.OooO00o(str, ReplaceMedalModel.class);
            k0 k0Var = k0.this;
            if (k0Var.isShowing()) {
                if (replaceMedalModel == null || OooOo00.OooO00o(replaceMedalModel.data)) {
                    k0Var.f52392OooOO0.Oooo00o();
                    StatusView statusView = k0Var.f52396OooOOO0;
                    statusView.OooO00o(true);
                    statusView.OooO0Oo(false);
                    statusView.OooO0O0(false);
                    k0Var.f52396OooOOO0.setVisibility(0);
                    return;
                }
                k0Var.f52392OooOO0.OooOoO0(replaceMedalModel.data);
                k0Var.f52392OooOO0.Oooo0O0(true);
                StatusView statusView2 = k0Var.f52396OooOOO0;
                statusView2.OooO0Oo(false);
                statusView2.OooO00o(false);
                statusView2.OooO0O0(false);
                k0Var.f52396OooOOO0.setVisibility(8);
            }
        }
    }

    public class OooO0O0 extends oo00o {
        public OooO0O0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            k0 k0Var = k0.this;
            k0Var.f52392OooOO0.Oooo00O(true);
            k0Var.OooOO0o();
        }
    }

    public class OooO0OO extends oo00o {
        public OooO0OO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            k0.this.dismiss();
        }
    }

    public class OooO0o extends o000O<ReplaceMedalModel.DataBean> {
        public OooO0o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            ReplaceMedalModel.DataBean dataBean = (ReplaceMedalModel.DataBean) obj;
            Uri uriOooO00o = oOo00o0o.OooO00o(dataBean.medalid, dataBean.level);
            if (dataBean.type == 1) {
                uriOooO00o = oOo00o0o.OooO00o(dataBean.medalid, 1);
            }
            viewHolder.setText(oO00O0oO.tvName, dataBean.name);
            SVGAView sVGAView = (SVGAView) viewHolder.getView(oO00O0oO.nivMedal);
            int i = p584o0oOooO0.oOo00OO0.honor_medal_loading;
            sVGAView.f10172OooOooO = i;
            sVGAView.setImageResource(i);
            String string = uriOooO00o.toString();
            k0 k0Var = k0.this;
            sVGAView.OooOO0O(string, k0Var.f52395OooOOO);
            sVGAView.OooOO0o();
            boolean zOooOOO0 = k0Var.OooOOO0(dataBean.medalid);
            int i2 = oO00O0oO.tvState;
            viewHolder.addOnClickListener(i2);
            if (zOooOOO0) {
                viewHolder.setText(i2, oO00OOo0.Wearning);
                int i3 = k0Var.f52391OooO;
                if ((i3 >= k0Var.f52393OooOO0O.size() ? -1 : Integer.parseInt(k0Var.f52393OooOO0O.get(i3).split("_")[1])) == dataBean.medalid) {
                    viewHolder.setBackgroundRes(i2, p584o0oOooO0.oOo00OO0.ic_badge_state_remove);
                } else {
                    viewHolder.setBackgroundRes(i2, p584o0oOooO0.oOo00OO0.ic_badge_state_added);
                    viewHolder.removeViewOnClickListener(i2);
                }
            } else {
                viewHolder.setText(i2, "");
                viewHolder.setBackgroundRes(i2, p584o0oOooO0.oOo00OO0.ic_badge_state_add);
            }
            int i4 = oO00O0oO.tvNum;
            viewHolder.setText(i4, dataBean.type != 0 ? p022Oooo00O.OooOO0.OooO0O0(new StringBuilder(), dataBean.level, "") : "");
            viewHolder.setTextColor(i4, o0000.OooO00o(oOo00o0o.OooO0O0(dataBean.medalid)));
        }
    }

    public k0(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
        this.f52395OooOOO = fragmentActivity;
        OooOO0O(80);
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_replace_medal;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        this.f52394OooOO0o = (RecyclerView) findViewById(oO00O0oO.rv_replace_medal);
        StatusView statusView = (StatusView) findViewById(oO00O0oO.ehv);
        this.f52396OooOOO0 = statusView;
        statusView.OooO0OO(true);
        this.f52396OooOOO0.setEmptyImageRes(p584o0oOooO0.oOo00OO0.ic_empty_delete);
        this.f52396OooOOO0.setEmptyText(oO00OOo0.no_badge);
        this.f52396OooOOO0.setOnErrorClickListener(new OooO0O0());
        findViewById(oO00O0oO.iv_close).setOnClickListener(new OooO0OO());
        this.f52394OooOO0o.setLayoutManager(new FixGridLayoutManager(getContext(), 3));
        OooO0o oooO0o = new OooO0o(getContext(), oO00OO0O.item_replace_medal);
        this.f52392OooOO0 = oooO0o;
        oooO0o.Oooo00O(false);
        this.f52392OooOO0.OooOoOO(true);
        OooO0o oooO0o2 = this.f52392OooOO0;
        oooO0o2.f10101OooO0oo = new OooO();
        this.f52394OooOO0o.setAdapter(oooO0o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0o() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.f52393OooOO0O = new ArrayList<>(Arrays.asList(oOo00o0o.OooO0Oo((String) o000000O.OooOO0O().getValue())));
        OooO00o oooO00o = new OooO00o(getContext());
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44133Ooooooo, oO00o000.OooO00o(), oooO00o);
    }

    public final boolean OooOOO0(int i) {
        for (String str : this.f52393OooOO0O) {
            int i2 = oOo00o0o.f56707OooO00o;
            if (i == Integer.parseInt(str.split("_")[1])) {
                return true;
            }
        }
        return false;
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        if (view.getId() == oO00O0oO.iv_close) {
            dismiss();
        }
    }

    @Override // p391o0Oo0.OooOO0, android.app.Dialog
    public final void show() {
        super.show();
        OooOO0o();
    }
}
