package com.yalla.yalla.common.ui.fragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00000;
import androidx.recyclerview.widget.o000OOo;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.fragment.GiftSendFragment;
import com.yalla.yalla.common.ui.view.GiftView;
import com.yalla.yalla.model.GiftPropAll;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.GiftPropTypeShowKt;
import com.yalla.yalla.model.GiftPropTypeUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0O0O;
import p503o0o00o00.OooO;
import p649o0ooOOoo.x7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0003J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\nJ\u001a\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0014J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u0003R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R$\u0010'\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R'\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010C\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\"\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010H\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\"\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010G¨\u0006O"}, d2 = {"Lcom/yalla/yalla/common/ui/fragment/GiftSendFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/x7;", "", "initView", "initData", "", "Lcom/yalla/yalla/model/GiftPropModel;", "giftList", "setData", "", "giftId", "getGiftPosition", "position", "updateIndicator", "setSelectedGift", "pageSize", "initGiftPoint", "Landroidx/recyclerview/widget/RecyclerView;", "mRvCustomer", "closeDefaultAnimator", "getPageType", "getPageIndex", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "setGiftId", "index", "initGiftId", "notifyDataSetChanged", "pageType", "I", "Lcom/yalla/yalla/model/GiftPropTypeShow;", "showIn", "Lcom/yalla/yalla/model/GiftPropTypeShow;", "pageIndex", "currentData", "Lcom/yalla/yalla/model/GiftPropModel;", "getCurrentData", "()Lcom/yalla/yalla/model/GiftPropModel;", "setCurrentData", "(Lcom/yalla/yalla/model/GiftPropModel;)V", "giftPageList", "Ljava/util/List;", "allData", "Lcom/yalla/yalla/common/ui/view/GiftView;", "selectedView", "Lcom/yalla/yalla/common/ui/view/GiftView;", "", "showFullSite", "Z", "Lo00o00o0/OooO0OO;", "giftPagerAdapter$delegate", "Lkotlin/Lazy;", "getGiftPagerAdapter", "()Lo00o00o0/OooO0OO;", "giftPagerAdapter", "Lkotlin/Function1;", "pageChangedListener", "Lkotlin/jvm/functions/Function1;", "getPageChangedListener", "()Lkotlin/jvm/functions/Function1;", "setPageChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "tempGiftId", "getTempGiftId", "()I", "setTempGiftId", "(I)V", "tempIndex", "getTempIndex", "setTempIndex", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftSendFragment extends OooO<x7> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private GiftPropModel currentData;

    @Nullable
    private Function1<? super Integer, Unit> pageChangedListener;
    private int pageIndex;

    @Nullable
    private GiftView selectedView;
    private int pageType = GiftPropTypeUser.Hot.getValue();

    @NotNull
    private GiftPropTypeShow showIn = GiftPropTypeShow.InRoom;

    @NotNull
    private final List<List<GiftPropModel>> giftPageList = new ArrayList();

    @NotNull
    private final List<GiftPropModel> allData = new ArrayList();
    private boolean showFullSite = true;

    /* JADX INFO: renamed from: giftPagerAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy giftPagerAdapter = LazyKt.lazy(new OooO0O0());
    private int tempGiftId = -1;
    private int tempIndex = -1;

    /* JADX INFO: renamed from: com.yalla.yalla.common.ui.fragment.GiftSendFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<com.yalla.yalla.common.ui.fragment.OooO0OO> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.common.ui.fragment.OooO0OO invoke() {
            return new com.yalla.yalla.common.ui.fragment.OooO0OO(GiftSendFragment.this, GiftSendFragment.this.getContext());
        }
    }

    public static final class OooO0OO extends RecyclerView.o00O0O {
        public OooO0OO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                RecyclerView.Oooo000 layoutManager = GiftSendFragment.this.getBinding().f50919OooO0OO.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                GiftSendFragment.this.updateIndicator(iFindFirstVisibleItemPosition);
                GiftSendFragment.this.pageIndex = iFindFirstVisibleItemPosition;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeDefaultAnimator(RecyclerView mRvCustomer) {
        RecyclerView.ItemAnimator itemAnimator = mRvCustomer.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f9010OooO0OO = 0L;
            itemAnimator.f9012OooO0o = 0L;
            itemAnimator.f9013OooO0o0 = 0L;
            itemAnimator.f9011OooO0Oo = 0L;
            ((o00000) itemAnimator).f9140OooO0oO = false;
        }
    }

    private final p188o00o00o0.OooO0OO<List<GiftPropModel>> getGiftPagerAdapter() {
        return (p188o00o00o0.OooO0OO) this.giftPagerAdapter.getValue();
    }

    private final int getGiftPosition(int giftId) {
        if (giftId == 0) {
            return -1;
        }
        int i = 0;
        for (Object obj : this.allData) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((GiftPropModel) obj).getGiftId() == giftId) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    private final void initData() {
        oo0O.OooO0OO.f53327OooO00o.OooO0o0(this, new o00O0O0O(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-2, reason: not valid java name */
    public static final void m289initData$lambda2(GiftSendFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GiftPropAll giftPropAll = (GiftPropAll) it.next();
                if (giftPropAll.getPropUserType() == this$0.pageType) {
                    this$0.setData(giftPropAll.getListForRegion(GiftPropTypeShowKt.getRegion(this$0.showIn)));
                }
            }
        }
    }

    public static /* synthetic */ void initGiftId$default(GiftSendFragment giftSendFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        giftSendFragment.initGiftId(i);
    }

    private final void initGiftPoint(int pageSize) {
        getBinding().f50918OooO0O0.removeAllViews();
        for (int i = 0; i < pageSize; i++) {
            ImageView imageView = new ImageView(getContext());
            if (i == 0) {
                imageView.setImageResource(R.drawable.icon_banner_point_green);
            } else {
                imageView.setImageResource(R.drawable.no_select);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.leftMargin = OooOo00.OooO00o(3.0f);
            layoutParams.rightMargin = OooOo00.OooO00o(3.0f);
            layoutParams.width = OooOo00.OooO00o(5.0f);
            layoutParams.height = OooOo00.OooO00o(5.0f);
            getBinding().f50918OooO0O0.addView(imageView, layoutParams);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        getBinding().f50919OooO0OO.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView = getBinding().f50919OooO0OO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        closeDefaultAnimator(recyclerView);
        new o000OOo().attachToRecyclerView(getBinding().f50919OooO0OO);
        getGiftPagerAdapter().setLoadComplete();
        getGiftPagerAdapter().hindEmptyView(true);
        getBinding().f50919OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00oO.OooOOOO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return GiftSendFragment.m290initView$lambda0(view, motionEvent);
            }
        });
        getBinding().f50919OooO0OO.addOnScrollListener(new OooO0OO());
        getBinding().f50919OooO0OO.setAdapter(getGiftPagerAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final boolean m290initView$lambda0(View view, MotionEvent motionEvent) {
        LiveEventBus.get("DismissIntroducingTagGiftWindow").post(Boolean.FALSE);
        return false;
    }

    private final void setData(List<GiftPropModel> giftList) {
        List<GiftPropModel> list = this.allData;
        list.clear();
        if (giftList == null) {
            giftList = new ArrayList<>();
        }
        list.addAll(giftList);
        if (list.isEmpty()) {
            getGiftPagerAdapter().setLoadComplete();
            return;
        }
        int i = this.tempIndex;
        if (i >= 0) {
            this.currentData = list.get(i);
        }
        this.giftPageList.clear();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            GiftPropModel giftPropModel = (GiftPropModel) obj;
            int i4 = this.tempGiftId;
            if (i4 > 0 && i4 == giftPropModel.getGiftId()) {
                this.currentData = giftPropModel;
            }
            arrayList.add(giftPropModel);
            if (i2 % 8 == 7) {
                while (arrayList.size() < 8) {
                    arrayList.add(new GiftPropModel());
                }
                this.giftPageList.add(arrayList);
                arrayList = new ArrayList();
            } else if (list.size() - (this.giftPageList.size() * 8) < 8 && i2 == list.size() - 1) {
                this.giftPageList.add(arrayList);
            }
            i2 = i3;
        }
        getGiftPagerAdapter().setNewData(this.giftPageList);
        initGiftPoint(this.giftPageList.size());
        GiftPropModel giftPropModel2 = this.currentData;
        updateIndicator(setSelectedGift(giftPropModel2 != null ? giftPropModel2.getGiftId() : -1));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final int setSelectedGift(int giftId) {
        if (giftId <= 0 || !(!this.allData.isEmpty()) || getGiftPosition(giftId) < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        for (Object obj : this.giftPageList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i4 = 0;
            for (Object obj2 : (List) obj) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((GiftPropModel) obj2).getGiftId() == giftId) {
                    getBinding().f50919OooO0OO.scrollToPosition(i2);
                    RecyclerView.Adapter adapter = getBinding().f50919OooO0OO.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                    i = i2;
                }
                i4 = i5;
            }
            i2 = i3;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIndicator(int position) {
        int childCount = getBinding().f50918OooO0O0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getBinding().f50918OooO0O0.getChildAt(i);
            ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
            if (i == position) {
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.icon_banner_point_green);
                }
            } else if (imageView != null) {
                imageView.setImageResource(R.drawable.no_select);
            }
        }
    }

    @Nullable
    public final GiftPropModel getCurrentData() {
        return this.currentData;
    }

    @Nullable
    public final Function1<Integer, Unit> getPageChangedListener() {
        return this.pageChangedListener;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final int getPageType() {
        return this.pageType;
    }

    public final int getTempGiftId() {
        return this.tempGiftId;
    }

    public final int getTempIndex() {
        return this.tempIndex;
    }

    public final void initGiftId(int index) {
        this.tempIndex = index;
    }

    public final void notifyDataSetChanged() {
        getGiftPagerAdapter().notifyDataSetChanged();
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initData();
    }

    public final void setCurrentData(@Nullable GiftPropModel giftPropModel) {
        this.currentData = giftPropModel;
    }

    public final void setGiftId(int giftId) {
        this.tempGiftId = giftId;
        for (GiftPropModel giftPropModel : this.allData) {
            int i = this.tempGiftId;
            if (i > 0 && i == giftPropModel.getGiftId()) {
                this.currentData = giftPropModel;
            }
        }
        GiftPropModel giftPropModel2 = this.currentData;
        if (giftPropModel2 != null) {
            updateIndicator(setSelectedGift(giftPropModel2.getGiftId()));
        }
    }

    public final void setPageChangedListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.pageChangedListener = function1;
    }

    public final void setTempGiftId(int i) {
        this.tempGiftId = i;
    }

    public final void setTempIndex(int i) {
        this.tempIndex = i;
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public x7 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        x7 x7VarInflate = x7.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(x7VarInflate, "inflate(inflater)");
        return x7VarInflate;
    }
}
