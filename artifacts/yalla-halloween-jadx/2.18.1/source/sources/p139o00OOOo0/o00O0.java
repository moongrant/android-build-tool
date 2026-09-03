package p139o00OOOo0;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.model.ReplaceMedalModel;
import com.app.base.view.StatusView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o00oO0o;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0 extends p146o00Oo000.OooO0O0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ArrayList<String> f31811OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f31812OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<ReplaceMedalModel.DataBean> f31813OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public RecyclerView f31814OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public FragmentActivity f31815OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public StatusView f31816o000oOoO;

    public class OooO implements BaseQuickAdapter.OooOOO0 {
        public OooO() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
        public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            if (i >= baseQuickAdapter.getData().size()) {
                return;
            }
            ReplaceMedalModel.DataBean dataBean = (ReplaceMedalModel.DataBean) baseQuickAdapter.getData().get(i);
            o00O0 o00o1 = o00O0.this;
            boolean z = !o00o1.OooOOOO(dataBean.medalid);
            StringBuilder sb = new StringBuilder();
            if (!z) {
                int size = o00o1.f31811OoooO.size();
                int i2 = o00o1.f31812OoooO0;
                if (size <= i2) {
                    return;
                } else {
                    o00o1.f31811OoooO.remove(i2);
                }
            } else if (o00o1.f31812OoooO0 >= o00o1.f31811OoooO.size()) {
                o00o1.f31811OoooO.add(dataBean.type + "_" + dataBean.medalid + "_" + dataBean.level);
            } else {
                o00o1.f31811OoooO.set(o00o1.f31812OoooO0, dataBean.type + "_" + dataBean.medalid + "_" + dataBean.level);
            }
            for (String str : o00o1.f31811OoooO) {
                sb.append(",");
                sb.append(str);
            }
            String string = new StringBuilder(sb.toString().replaceFirst(",", "")).toString();
            int i3 = !z ? 1 : 0;
            o00O0O00 o00o0o01 = new o00O0O00(o00o1, o00o1.getContext(), z, string);
            Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
            mapOooO0O0.put("medalstr", string);
            mapOooO0O0.put("medaltype", i3 + "");
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32326o00Oo0, mapOooO0O0, o00o0o01);
        }
    }

    public class OooO00o extends o00OO0O0.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            o00O0.this.f31813OoooO0O.loadError();
            o00O0.this.f31816o000oOoO.OooO0O0();
            o00O0.this.f31816o000oOoO.setVisibility(0);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            ReplaceMedalModel replaceMedalModel = (ReplaceMedalModel) o0Oo0oo.OooO0O0(str, ReplaceMedalModel.class);
            if (o00O0.this.isShowing()) {
                if (replaceMedalModel == null || com.yalla.support.common.util.OooO0OO.OooO00o(replaceMedalModel.data)) {
                    o00O0.this.f31813OoooO0O.setLoadComplete();
                    StatusView statusView = o00O0.this.f31816o000oOoO;
                    statusView.OooO00o(true);
                    statusView.OooO0o0(false);
                    statusView.OooO0OO(false);
                    o00O0.this.f31816o000oOoO.setVisibility(0);
                    return;
                }
                o00O0.this.f31813OoooO0O.setNewData(replaceMedalModel.data);
                o00O0.this.f31813OoooO0O.setLoadComplete(true);
                StatusView statusView2 = o00O0.this.f31816o000oOoO;
                statusView2.OooO0o0(false);
                statusView2.OooO00o(false);
                statusView2.OooO0OO(false);
                o00O0.this.f31816o000oOoO.setVisibility(8);
            }
        }
    }

    public class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            o00O0.this.f31813OoooO0O.setFirstLoading(true);
            o00O0.this.OooOOO();
        }
    }

    public class OooO0OO extends o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            o00O0.this.dismiss();
        }
    }

    public class OooO0o extends p188o00o00o0.OooO0OO<ReplaceMedalModel.DataBean> {
        public OooO0o(Context context) {
            super(context, R.layout.item_replace_medal);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            ReplaceMedalModel.DataBean dataBean = (ReplaceMedalModel.DataBean) obj;
            Uri uriOooO00o = o00oO0o.OooO00o(dataBean.medalid, dataBean.level);
            if (dataBean.type == 1) {
                uriOooO00o = o00oO0o.OooO00o(dataBean.medalid, 1);
            }
            oooO0o.OooOO0(R.id.tvName, dataBean.name);
            SVGAView sVGAView = (SVGAView) oooO0o.OooO0Oo(R.id.nivMedal);
            sVGAView.f21010OooooO0 = R.drawable.honor_medal_loading;
            sVGAView.OooO0oo(uriOooO00o.toString(), o00O0.this.f31815OoooOOO);
            sVGAView.OooO();
            boolean zOooOOOO = o00O0.this.OooOOOO(dataBean.medalid);
            oooO0o.OooO0O0(R.id.tvState);
            if (zOooOOOO) {
                oooO0o.OooO(R.id.tvState, R.string.Wearning);
                o00O0 o00o1 = o00O0.this;
                int i = o00o1.f31812OoooO0;
                if ((i >= o00o1.f31811OoooO.size() ? -1 : Integer.parseInt(o00oO0o.OooO0o0(o00o1.f31811OoooO.get(i))[1])) == dataBean.medalid) {
                    oooO0o.OooO0o(R.id.tvState, R.drawable.ic_badge_state_remove);
                } else {
                    oooO0o.OooO0o(R.id.tvState, R.drawable.ic_badge_state_added);
                    oooO0o.OooO0Oo(R.id.tvState).setOnClickListener(null);
                }
            } else {
                oooO0o.OooOO0(R.id.tvState, "");
                oooO0o.OooO0o(R.id.tvState, R.drawable.ic_badge_state_add);
            }
            oooO0o.OooOO0(R.id.tvNum, dataBean.type != 0 ? o0O0O00.o0ooOOo.OooO00o(new StringBuilder(), dataBean.level, "") : "");
            oooO0o.OooOO0O(R.id.tvNum, OooOOO.OooO00o(o00oO0o.OooO0O0(dataBean.medalid)));
        }
    }

    public o00O0(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
        this.f31815OoooOOO = fragmentActivity;
        OooOO0o(80);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_replace_medal;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        this.f31814OoooOO0 = (RecyclerView) findViewById(R.id.rv_replace_medal);
        StatusView statusView = (StatusView) findViewById(R.id.ehv);
        this.f31816o000oOoO = statusView;
        statusView.OooO0Oo(true);
        this.f31816o000oOoO.setEmptyImageRes(R.drawable.ic_empty_delete);
        this.f31816o000oOoO.setEmptyText(R.string.no_badge);
        this.f31816o000oOoO.setOnErrorClickListener(new OooO0O0());
        findViewById(R.id.iv_close).setOnClickListener(new OooO0OO());
        this.f31814OoooOO0.setLayoutManager(new FixGridLayoutManager(getContext(), 3));
        OooO0o oooO0o = new OooO0o(getContext());
        this.f31813OoooO0O = oooO0o;
        oooO0o.setFirstLoading(false);
        this.f31813OoooO0O.hindEmptyView(true);
        this.f31813OoooO0O.setOnItemChildClickListener(new OooO());
        this.f31814OoooOO0.setAdapter(this.f31813OoooO0O);
    }

    public final void OooOOO() {
        this.f31811OoooO = new ArrayList<>(Arrays.asList(o00oO0o.OooO0Oo(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOO0O().getValue())));
        OooO00o oooO00o = new OooO00o(getContext());
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32325o00O0O, mapOooO0O0, oooO00o);
    }

    public final boolean OooOOOO(int i) {
        Iterator<String> it = this.f31811OoooO.iterator();
        while (it.hasNext()) {
            if (i == Integer.parseInt(o00oO0o.OooO0o0(it.next())[1])) {
                return true;
            }
        }
        return false;
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        if (view.getId() == R.id.iv_close) {
            dismiss();
        }
    }

    @Override // p146o00Oo000.OooO0O0, android.app.Dialog
    public final void show() {
        super.show();
        OooOOO();
    }
}
