package com.app.base.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.RedPaperRankListModel;
import com.facebook.FacebookSdk;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p133o00OO00o.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes.dex */
public class RedHistoryFragment extends o00OOO0.OooO00o {
    private List<RedPaperRankListModel.Data> commentData;
    private ListView listView;
    private p133o00OO00o.OooO0OO mAdapter;
    private TextView txt_amountsum;
    private TextView txt_name;
    private TextView txt_num;
    private int type;
    private NetImageView userhead;

    public class OooO00o extends p133o00OO00o.OooO0OO<RedPaperRankListModel.Data> {
        public OooO00o(Context context, List list) {
            super(context, list, R.layout.lst_my_red_rnvelopes);
        }

        @Override // p133o00OO00o.OooO0OO
        public final void OooO0O0(o0ooOOo o0ooooo2, Object obj) {
            RedPaperRankListModel.Data data = (RedPaperRankListModel.Data) obj;
            o0ooooo2.OooO0O0(R.id.txt_title, data.nickname);
            if (RedHistoryFragment.this.type == 1) {
                o0ooooo2.OooO0O0(R.id.txt_title, p498o0o00Oo0.OooOOO.f41216OooO00o.OooOoO().getValue());
            } else {
                o0ooooo2.OooO0O0(R.id.txt_title, RedHistoryFragment.this.getResources().getString(R.string.red_amount));
            }
            o0ooooo2.OooO0O0(R.id.txt_time, o00O0.f48624OooO00o.OooO0Oo(data.sendtime, System.currentTimeMillis()));
            o0ooooo2.OooO0O0(R.id.txt_coin, data.amount);
            if (TextUtils.isEmpty(data.getnum)) {
                o0ooooo2.OooO00o(R.id.txt_getnum).setVisibility(8);
                return;
            }
            o0ooooo2.OooO00o(R.id.txt_getnum).setVisibility(0);
            o0ooooo2.OooO0O0(R.id.txt_getnum, data.getnum + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O0O0.OooO0OO(R.string.packets));
        }
    }

    public class OooO0O0 extends o00OO0O0.OooO0O0 {
        public OooO0O0(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            RedPaperRankListModel redPaperRankListModel = (RedPaperRankListModel) o0Oo0oo.OooO0O0(str, RedPaperRankListModel.class);
            if (redPaperRankListModel != null) {
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o.f48429OooO0OO = redPaperRankListModel.headhrl;
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(RedHistoryFragment.this.userhead);
                if (RedHistoryFragment.this.type == 1) {
                    RedHistoryFragment.this.txt_num.setText(OooOo.OooO00o(RedHistoryFragment.this.getString(R.string.Lucky_Bag_Received_Total), redPaperRankListModel.redsum));
                } else {
                    RedHistoryFragment.this.txt_num.setText(OooOo.OooO00o(RedHistoryFragment.this.getString(R.string.Lucky_Bag_Send_Total), redPaperRankListModel.redsum));
                }
                RedHistoryFragment.this.txt_amountsum.setText(redPaperRankListModel.amountsum);
                RedHistoryFragment.this.commentData.clear();
                RedHistoryFragment.this.commentData.addAll(redPaperRankListModel.data);
                RedHistoryFragment.this.mAdapter.notifyDataSetChanged();
            }
        }
    }

    @SuppressLint({"ValidFragment"})
    public RedHistoryFragment(int i) {
        this.commentData = new ArrayList();
        this.type = i;
    }

    private void initContent() {
        OooO00o oooO00o = new OooO00o(FacebookSdk.getApplicationContext(), this.commentData);
        this.mAdapter = oooO00o;
        this.listView.setAdapter((ListAdapter) oooO00o);
    }

    private void initView() {
        this.listView = (ListView) this.rootView.findViewById(R.id.listView);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_my_red_renelopes_head, (ViewGroup) null);
        this.userhead = (NetImageView) viewInflate.findViewById(R.id.userhead);
        this.txt_name = (TextView) viewInflate.findViewById(R.id.txt_name);
        this.txt_amountsum = (TextView) viewInflate.findViewById(R.id.txt_amountsum);
        this.txt_num = (TextView) viewInflate.findViewById(R.id.txt_num);
        this.listView.addHeaderView(viewInflate);
        this.txt_name.setText(getResources().getString(this.type == 1 ? R.string.Lucky_Bag_Received_lastMonth : R.string.Lucky_Bag_Send_lastMonth));
    }

    private void redPaperGetlist() {
        String strValueOf = String.valueOf(this.type);
        OooO0O0 oooO0O0 = new OooO0O0(getContext());
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("type", strValueOf);
        mapOooO0O0.put("paindex", "1");
        mapOooO0O0.put("pagesize", "100");
        oooO0O0.setHaveBeforeAfter(true);
        oooO0O0.setTitle(o000O0O0.OooO0OO(R.string.loading));
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32332o0O0O00, mapOooO0O0, oooO0O0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(R.layout.fragment_red_received, viewGroup, false);
        initView();
        initContent();
        redPaperGetlist();
        return this.rootView;
    }

    public RedHistoryFragment() {
        this.commentData = new ArrayList();
        this.type = 1;
    }
}
