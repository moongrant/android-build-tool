package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.data.constant.FeedbackType;
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
import p406o0Oo0OOo.u3;
import p473o0OoooOo.o0OOOO0o;
import p496o0o00Oo0.oOOO00o0;
import p605o0oo0O0O.o0O0O0Oo;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ValidFragment"})
public class CrystalDetailFragment extends com.yalla.yalla.base.fragment.OooO00o {
    private p571o0oOoO0.o0000oo<GoldModel> adapter;
    private XRefreshLayout mXRefreshLayout;
    private RecyclerView recyclerView;
    private View rootView;
    private WalletCoinVM vm = null;
    private final String TYPE = FeedbackType.Recharge;
    private int pageIndex = 1;

    public class OooO00o extends p571o0oOoO0.o0000oo<GoldModel> {
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        @RequiresApi(api = 23)
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            String str;
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            GoldModel goldModel = (GoldModel) obj;
            try {
                viewHolder.setText(p562o0oOo000.o0OO00O.tv_gold_time, o0O0O0o0.OooO0Oo(goldModel.getTradetimesp(), System.currentTimeMillis()));
                int i = p562o0oOo000.o0OO00O.tv_gold_title;
                HashMap<String, Integer> map = u3.f45735OooO00o;
                String key = goldModel.getType();
                Intrinsics.checkNotNullParameter(key, "key");
                Integer numValueOf = u3.f45736OooO0O0.get(key);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(p562o0oOo000.o000000.Others);
                }
                viewHolder.setText(i, com.code.android.util.o0000.OooO0OO(numValueOf.intValue()));
                if (o0O0O0Oo.OooOO0O(goldModel.getAmount()) > 0) {
                    str = "+" + goldModel.getAmount() + "";
                } else {
                    str = goldModel.getAmount() + "";
                }
                int i2 = p562o0oOo000.o0OO00O.tv_gold_num;
                viewHolder.setText(i2, str);
                viewHolder.setTextColor(i2, com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.crystal_mall_text_color));
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            CrystalDetailFragment crystalDetailFragment = CrystalDetailFragment.this;
            crystalDetailFragment.adapter.Oooo00O(true);
            crystalDetailFragment.lambda$initView$0();
        }
    }

    private void getBillData(final boolean z) {
        this.vm.userBill(String.valueOf(this.pageIndex), FeedbackType.Recharge).observe(requireActivity(), new p384o0OOoo0O.o000oOoO(new Oooo000(), new Function1() { // from class: com.yalla.yalla.ui.fragment.Oooo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f27752OooO0Oo.lambda$getBillData$3(z, (ApiError) obj);
            }
        }, new Function1() { // from class: com.yalla.yalla.ui.fragment.o000oOoO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f28402OooO0Oo.lambda$getBillData$4(z, (ApiResult) obj);
            }
        }, false));
    }

    private void initView() {
        this.recyclerView = (RecyclerView) this.rootView.findViewById(p562o0oOo000.o0OO00O.crystal_detail_list_view);
        XRefreshLayout xRefreshLayout = (XRefreshLayout) this.rootView.findViewById(p562o0oOo000.o0OO00O.crystal_pullToRefreshView);
        this.mXRefreshLayout = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new OooOo(this));
        this.mXRefreshLayout.setOnLoadMoreListener(new oOOO00o0(this));
        OooO00o oooO00o = new OooO00o(getContext(), p562o0oOo000.oo0o0Oo.activity_bill_gold_item);
        this.adapter = oooO00o;
        oooO00o.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_message_system);
        this.adapter.Oooo000(p562o0oOo000.o000000.blank_no_crystal_transaction_history);
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
            this.rootView = layoutInflater.inflate(p562o0oOo000.oo0o0Oo.fragment_crystal_detail, viewGroup, false);
        }
        return this.rootView;
    }
}
