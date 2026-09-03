package p133o00OO00o;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.model.SkillCardListModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f31242Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<SkillCardListModel.DataBean> f31243Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<SkillCardListModel.DataBean> f31244Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Context f31245Oooo0oo;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public NetImageView f31247OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ImageView f31248OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TextView f31249OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public TextView f31250OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f31251OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f31252OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public View f31253OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public View f31254OooO0oo;

        public OooO00o() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    public Oooo0(Context context, List list, int i, int i2) {
        this.f31245Oooo0oo = context;
        this.f31243Oooo0o = list;
        this.f31242Oooo = i2;
        int i3 = i * i2;
        int i4 = i2 + i3;
        if (this.f31244Oooo0oO == null) {
            this.f31244Oooo0oO = new ArrayList();
        }
        while (i3 < i4) {
            this.f31244Oooo0oO.add(this.f31243Oooo0o.get(i3));
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final SkillCardListModel.DataBean getItem(int i) {
        return (SkillCardListModel.DataBean) this.f31244Oooo0oO.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f31242Oooo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f31244Oooo0oO.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f31244Oooo0oO.get(i)).shopid);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            viewInflate = LayoutInflater.from(this.f31245Oooo0oo).inflate(R.layout.item_room_wear_voice, viewGroup, false);
            oooO00o.f31252OooO0o0 = (TextView) viewInflate.findViewById(R.id.tv_item_price);
            oooO00o.f31251OooO0o = (TextView) viewInflate.findViewById(R.id.tv_item_promotion_price);
            oooO00o.f31249OooO0OO = (TextView) viewInflate.findViewById(R.id.tv_item_name);
            oooO00o.f31250OooO0Oo = (TextView) viewInflate.findViewById(R.id.tv_item_stock);
            oooO00o.f31247OooO00o = (NetImageView) viewInflate.findViewById(R.id.ivHeader);
            oooO00o.f31248OooO0O0 = (ImageView) viewInflate.findViewById(R.id.ivCoin);
            oooO00o.f31254OooO0oo = viewInflate.findViewById(R.id.v_item_selected);
            oooO00o.f31253OooO0oO = viewInflate.findViewById(R.id.view_item_wear_line_right);
            viewInflate.setTag(oooO00o);
            if (oo000o.OooO0o0()) {
                viewInflate.setLayoutDirection(1);
            } else {
                viewInflate.setLayoutDirection(0);
            }
        } else {
            viewInflate = view;
            oooO00o = (OooO00o) view.getTag();
        }
        SkillCardListModel.DataBean item = getItem(i);
        View view2 = oooO00o.f31254OooO0oo;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (OooO0OO.OooO00o(item.shopid)) {
            oooO00o.f31252OooO0o0.setVisibility(8);
            oooO00o.f31251OooO0o.setVisibility(8);
            oooO00o.f31250OooO0Oo.setVisibility(4);
            oooO00o.f31248OooO0O0.setVisibility(4);
            oooO00o.f31247OooO00o.setVisibility(4);
        } else {
            oooO00o.f31248OooO0O0.setVisibility(0);
            oooO00o.f31252OooO0o0.setVisibility(0);
            oooO00o.f31251OooO0o.setVisibility(0);
            oooO00o.f31250OooO0Oo.setVisibility(0);
            oooO00o.f31250OooO0Oo.setText(item.num);
            oooO00o.f31250OooO0Oo.setVisibility(0);
            oooO00o.f31247OooO00o.setVisibility(0);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(Oooo0.this.f31245Oooo0oo);
            oooO00o2.f48429OooO0OO = item.picurl;
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o(oooO00o.f31247OooO00o);
            oooO00o.f31249OooO0OO.setText(item.waresname);
            oooO00o.f31252OooO0o0.setText(o0O0O00.OooO0Oo(item.discountprice));
            if (((i + 1) * 2) % Oooo0.this.f31242Oooo == 0) {
                oooO00o.f31253OooO0oO.setVisibility(8);
            }
            oooO00o.f31252OooO0o0.getPaint().setFlags(16);
            oooO00o.f31252OooO0o0.setText(o0O0O00.OooO0Oo(item.price));
            Pair<Boolean, Integer> value = OooOOO.f41216OooO00o.OooOOO0().getValue();
            if (!value.getFirst().booleanValue() || value.getSecond().intValue() < PremiumLevel.Premium4.getValue()) {
                oooO00o.f31251OooO0o.setText(o0O0O00.OooO0Oo(item.promotionprice));
                if (item.price.equals(item.promotionprice)) {
                    oooO00o.f31252OooO0o0.setVisibility(8);
                }
            } else {
                oooO00o.f31251OooO0o.setText(o0O0O00.OooO0Oo(item.discountprice));
            }
        }
        return viewInflate;
    }
}
