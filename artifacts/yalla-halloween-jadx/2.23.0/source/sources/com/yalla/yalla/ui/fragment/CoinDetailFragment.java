package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.GoldModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.WalletCoinVM;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p039OoooOoo.o00O0O0;
import p285o0O0OOoo.o00oOoo;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ValidFragment"})
public class CoinDetailFragment extends com.yalla.yalla.base.fragment.OooO00o {
    private p564o0oOo0OO.o000O<GoldModel> adapter;
    private XRefreshLayout mXRefreshLayout;
    private RecyclerView recyclerView;
    private View rootView;
    private WalletCoinVM vm = null;
    private final String TYPE = "1";
    private int pageIndex = 1;

    public class OooO00o extends p564o0oOo0OO.o000O<GoldModel> {
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            String str;
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            GoldModel goldModel = (GoldModel) obj;
            try {
                viewHolder.setText(oO00O0oO.tv_gold_time, p601o0oo0O0.o0000oo.OooO0Oo(goldModel.getTradetimesp(), System.currentTimeMillis()));
                int i = oO00O0oO.tv_gold_title;
                HashMap<String, Integer> map = p567o0oOo0o0.o00000O0.f56212OooO00o;
                String key = goldModel.getType();
                Intrinsics.checkNotNullParameter(key, "key");
                Integer numValueOf = p567o0oOo0o0.o00000O0.f56212OooO00o.get(key);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(oO00OOo0.Others);
                }
                viewHolder.setText(i, com.code.android.util.o0000.OooO0OO(numValueOf.intValue()));
                if (p590o0oo0.OooOOOO.OooOO0O(goldModel.getAmount()) > 0) {
                    str = "+" + goldModel.getAmount() + "";
                } else {
                    str = goldModel.getAmount() + "";
                }
                int i2 = oO00O0oO.tv_gold_num;
                viewHolder.setText(i2, str);
                viewHolder.setTextColor(i2, com.code.android.util.o0000.OooO00o(oO00O0o.color_ffc339));
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public class OooO0O0 extends oo00o {
        public OooO0O0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            CoinDetailFragment coinDetailFragment = CoinDetailFragment.this;
            coinDetailFragment.adapter.Oooo00O(true);
            coinDetailFragment.lambda$initView$0();
        }
    }

    private void getBillData(final boolean z) {
        this.vm.userBill(String.valueOf(this.pageIndex), "1").observe(requireActivity(), new p377o0OOoOo.o0000OO0(new OooO(), new Function1() { // from class: com.yalla.yalla.ui.fragment.OooOO0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f28228OooO0Oo.lambda$getBillData$3(z, (ApiError) obj);
            }
        }, new Function1() { // from class: com.yalla.yalla.ui.fragment.OooOO0O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f28230OooO0Oo.lambda$getBillData$4(z, (ApiResult) obj);
            }
        }, false));
    }

    private void initView() {
        this.recyclerView = (RecyclerView) this.rootView.findViewById(oO00O0oO.coin_detail_list_view);
        XRefreshLayout xRefreshLayout = (XRefreshLayout) this.rootView.findViewById(oO00O0oO.coin_pullToRefreshView);
        this.mXRefreshLayout = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new o00O0O0(this));
        this.mXRefreshLayout.setOnLoadMoreListener(new o00oOoo(this));
        OooO00o oooO00o = new OooO00o(getContext(), oO00OO0O.activity_bill_gold_item);
        this.adapter = oooO00o;
        oooO00o.OooOooo(oOo00OO0.ic_empty_message_system);
        this.adapter.Oooo000(oO00OOo0.blank_no_coin_transaction_history);
        this.adapter.Oooo0OO(new OooO0O0());
        this.recyclerView.setLayoutManager(new FixLinearLayoutManager(getContext()));
        this.recyclerView.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$getBillData$2(List list) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getBillData$3(boolean z, ApiError apiError) {
        this.mXRefreshLayout.OooOoo(z);
        this.adapter.OooOoo();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$getBillData$4(boolean z, ApiResult apiResult) {
        if (apiResult == null || apiResult.getData() == null) {
            this.mXRefreshLayout.OooOooo(z, true, true);
            this.adapter.Oooo00o();
            return null;
        }
        if (z) {
            this.adapter.OooOoO0((List) apiResult.getData());
        } else {
            this.adapter.OooO0O0((Collection) apiResult.getData());
        }
        this.pageIndex = apiResult.getPage().getPageIndex() + 1;
        this.mXRefreshLayout.OooOooo(z, true, ((List) apiResult.getData()).size() < Integer.parseInt("15"));
        this.adapter.Oooo00o();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1() {
        getBillData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: refreshLoad, reason: merged with bridge method [inline-methods] */
    public void lambda$initView$0() {
        this.pageIndex = 1;
        getBillData(true);
    }

    @Override // com.yalla.yalla.base.fragment.OooO0OO, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        initView();
        lambda$initView$0();
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, androidx.fragment.app.Fragment
    public void onCreate(@org.jetbrains.annotations.Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.vm = (WalletCoinVM) new ViewModelProvider(this).get(WalletCoinVM.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.rootView == null) {
            this.rootView = layoutInflater.inflate(oO00OO0O.fragment_coin_detail, viewGroup, false);
        }
        return this.rootView;
    }
}
