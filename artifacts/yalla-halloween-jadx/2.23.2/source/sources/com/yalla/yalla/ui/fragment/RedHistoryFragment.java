package com.yalla.yalla.ui.fragment;

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
import com.facebook.FacebookSdk;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.RedPaperRankListModel;
import com.yalla.yalla.ui.adapter.o00O00o0;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOOO00;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public class RedHistoryFragment extends com.yalla.yalla.base.fragment.OooO00o {
    private List<RedPaperRankListModel.Data> commentData;
    private ListView listView;
    private com.yalla.yalla.ui.adapter.OooO0O0 mAdapter;
    private TextView txt_amountsum;
    private TextView txt_name;
    private TextView txt_num;
    private int type;
    private NetImageView userhead;

    public class OooO00o extends com.yalla.yalla.ui.adapter.OooO0O0<RedPaperRankListModel.Data> {
        public OooO00o(Context context, List list, int i) {
            super(i, context, list);
        }

        @Override // com.yalla.yalla.ui.adapter.OooO0O0
        public final void OooO0O0(o00O00o0 o00o00o1, Object obj) {
            RedPaperRankListModel.Data data = (RedPaperRankListModel.Data) obj;
            int i = p562o0oOo000.o0OO00O.txt_title;
            o00o00o1.OooO0O0(i, data.nickname);
            RedHistoryFragment redHistoryFragment = RedHistoryFragment.this;
            if (redHistoryFragment.type == 1) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o00o00o1.OooO0O0(i, (CharSequence) o0O00oO0.OooOOoo().getValue());
            } else {
                o00o00o1.OooO0O0(i, redHistoryFragment.getResources().getString(p562o0oOo000.o000000.red_amount));
            }
            o00o00o1.OooO0O0(p562o0oOo000.o0OO00O.txt_time, o0O0O0o0.OooO0Oo(data.sendtime, System.currentTimeMillis()));
            o00o00o1.OooO0O0(p562o0oOo000.o0OO00O.txt_coin, data.amount);
            if (TextUtils.isEmpty(data.getnum)) {
                o00o00o1.OooO00o(p562o0oOo000.o0OO00O.txt_getnum).setVisibility(8);
                return;
            }
            int i2 = p562o0oOo000.o0OO00O.txt_getnum;
            o00o00o1.OooO00o(i2).setVisibility(0);
            o00o00o1.OooO0O0(i2, data.getnum + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.packets));
        }
    }

    public class OooO0O0 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO0O0(Context context) {
            super(context);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            RedPaperRankListModel redPaperRankListModel = (RedPaperRankListModel) oOOO00.OooO00o(str, RedPaperRankListModel.class);
            if (redPaperRankListModel != null) {
                o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f22925OooO00o);
                oooO00o.OooO00o(d1.OooO0OO());
                oooO00o.f43126OooO0OO = redPaperRankListModel.headhrl;
                oooO00o.f43124OooO00o = 0;
                RedHistoryFragment redHistoryFragment = RedHistoryFragment.this;
                oooO00o.OooO0Oo(redHistoryFragment.userhead);
                if (redHistoryFragment.type == 1) {
                    redHistoryFragment.txt_num.setText(com.code.android.util.o0000O.OooO00o(redHistoryFragment.getString(p562o0oOo000.o000000.Lucky_Bag_Received_Total), redPaperRankListModel.redsum));
                } else {
                    redHistoryFragment.txt_num.setText(com.code.android.util.o0000O.OooO00o(redHistoryFragment.getString(p562o0oOo000.o000000.Lucky_Bag_Send_Total), redPaperRankListModel.redsum));
                }
                redHistoryFragment.txt_amountsum.setText(redPaperRankListModel.amountsum);
                redHistoryFragment.commentData.clear();
                redHistoryFragment.commentData.addAll(redPaperRankListModel.data);
                redHistoryFragment.mAdapter.notifyDataSetChanged();
            }
        }
    }

    @SuppressLint({"ValidFragment"})
    public RedHistoryFragment(int i) {
        this.commentData = new ArrayList();
        this.type = i;
    }

    private void initContent() {
        OooO00o oooO00o = new OooO00o(FacebookSdk.getApplicationContext(), this.commentData, p562o0oOo000.oo0o0Oo.lst_my_red_rnvelopes);
        this.mAdapter = oooO00o;
        this.listView.setAdapter((ListAdapter) oooO00o);
    }

    private void initView() {
        this.listView = (ListView) this.rootView.findViewById(p562o0oOo000.o0OO00O.listView);
        View viewInflate = LayoutInflater.from(getContext()).inflate(p562o0oOo000.oo0o0Oo.layout_my_red_renelopes_head, (ViewGroup) null);
        this.userhead = (NetImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.userhead);
        this.txt_name = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.txt_name);
        this.txt_amountsum = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.txt_amountsum);
        this.txt_num = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.txt_num);
        this.listView.addHeaderView(viewInflate);
        this.txt_name.setText(getResources().getString(this.type == 1 ? p562o0oOo000.o000000.Lucky_Bag_Received_lastMonth : p562o0oOo000.o000000.Lucky_Bag_Send_lastMonth));
    }

    private void redPaperGetlist() {
        String strValueOf = String.valueOf(this.type);
        OooO0O0 oooO0O0 = new OooO0O0(getContext());
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("type", strValueOf);
        linkedHashMapOooO00o.put("paindex", "1");
        linkedHashMapOooO00o.put("pagesize", "100");
        oooO0O0.f22926OooO0O0 = true;
        oooO0O0.f22927OooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.loading);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43439o0OOO0o, linkedHashMapOooO00o, oooO0O0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(p562o0oOo000.oo0o0Oo.fragment_red_received, viewGroup, false);
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
