package com.app.base.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.GoldModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.vm.WalletCoinVM;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.OooOo;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p621o0oo0o0o.o00O0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ValidFragment"})
public class CoinDetailFragment extends o00OOO0.OooO00o {
    private p188o00o00o0.OooO0OO<GoldModel> adapter;
    private XRefreshLayout mXRefreshLayout;
    private RecyclerView recyclerView;
    private View rootView;
    private WalletCoinVM vm = null;
    private final String TYPE = "1";
    private int pageIndex = 1;

    public class OooO00o extends p188o00o00o0.OooO0OO<GoldModel> {
        public OooO00o(Context context) {
            super(context, R.layout.activity_bill_gold_item);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            String str;
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            GoldModel goldModel = (GoldModel) obj;
            try {
                oooO0o.OooOO0(R.id.tv_gold_time, o00O0.f48624OooO00o.OooO0Oo(goldModel.getTradetimesp(), System.currentTimeMillis()));
                p137o00OO0oo.OooO0o oooO0o2 = p137o00OO0oo.OooO0o.f31647OooO00o;
                String key = goldModel.getType();
                Intrinsics.checkNotNullParameter(key, "key");
                Integer numValueOf = p137o00OO0oo.OooO0o.f31648OooO0O0.get(key);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(R.string.Others);
                }
                oooO0o.OooOO0(R.id.tv_gold_title, o000O0O0.OooO0OO(numValueOf.intValue()));
                if (o0O0O00.OooOO0o(goldModel.getAmount()) > 0) {
                    str = "+" + goldModel.getAmount() + "";
                } else {
                    str = goldModel.getAmount() + "";
                }
                oooO0o.OooOO0(R.id.tv_gold_num, str);
                oooO0o.OooOO0O(R.id.tv_gold_num, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_ffc339));
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            CoinDetailFragment.this.adapter.setFirstLoading(true);
            CoinDetailFragment.this.lambda$initView$0();
        }
    }

    private void getBillData(final boolean z) {
        this.vm.userBill(String.valueOf(this.pageIndex), "1").observe(requireActivity(), new OooOo(p142o00OOooO.OooOO0O.f31892Oooo0oO, new Function1() { // from class: o00OOooO.OooO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f31888Oooo0o.lambda$getBillData$3(z, (ApiError) obj);
            }
        }, new Function1() { // from class: o00OOooO.OooOO0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f31890Oooo0o.lambda$getBillData$4(z, (ApiResult) obj);
            }
        }, false));
    }

    private void initView() {
        this.recyclerView = (RecyclerView) this.rootView.findViewById(R.id.coin_detail_list_view);
        XRefreshLayout xRefreshLayout = (XRefreshLayout) this.rootView.findViewById(R.id.coin_pullToRefreshView);
        this.mXRefreshLayout = xRefreshLayout;
        int i = 0;
        xRefreshLayout.setOnRefreshListener(new p142o00OOooO.OooOOO(this, i));
        this.mXRefreshLayout.setOnLoadMoreListener(new p142o00OOooO.OooOOO0(this, i));
        OooO00o oooO00o = new OooO00o(getContext());
        this.adapter = oooO00o;
        oooO00o.setEmptyImageRes(R.drawable.ic_empty_message_system);
        this.adapter.setEmptyText(R.string.blank_no_coin_transaction_history);
        this.adapter.setLoadErrorClickListener(new OooO0O0());
        this.recyclerView.setLayoutManager(new FixLinearLayoutManager(getContext()));
        this.recyclerView.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$getBillData$2(List list) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getBillData$3(boolean z, ApiError apiError) {
        this.mXRefreshLayout.Oooo0O0(z);
        this.adapter.loadError();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$getBillData$4(boolean z, ApiResult apiResult) {
        if (apiResult == null || apiResult.getData() == null) {
            this.mXRefreshLayout.Oooo0o0(z, true, true);
            this.adapter.setLoadComplete();
            return null;
        }
        if (z) {
            this.adapter.setNewData((List) apiResult.getData());
        } else {
            this.adapter.addData((Collection<? extends GoldModel>) apiResult.getData());
        }
        this.pageIndex = apiResult.getPage().getPageIndex() + 1;
        this.mXRefreshLayout.Oooo0o0(z, true, ((List) apiResult.getData()).size() < Integer.parseInt("15"));
        this.adapter.setLoadComplete();
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

    @Override // o00OOO0.OooO0OO, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        initView();
        lambda$initView$0();
    }

    @Override // o00OOO0.OooO00o, androidx.fragment.app.Fragment
    public void onCreate(@org.jetbrains.annotations.Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.vm = (WalletCoinVM) new ViewModelProvider(this).get(WalletCoinVM.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.rootView == null) {
            this.rootView = layoutInflater.inflate(R.layout.fragment_coin_detail, viewGroup, false);
        }
        return this.rootView;
    }
}
