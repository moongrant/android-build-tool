package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.view.GiftView;
import com.yalla.yalla.ui.view.gift.GiftListFragmentEmptyView;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.l1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\bM\u0010NJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u000bJ\u0014\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\b\u0010\u0017\u001a\u00020\u000bH\u0003J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0003J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R$\u0010.\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R'\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010$\u001a\u0004\b?\u0010@RE\u0010E\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000b\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010)R\u0016\u0010L\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010)¨\u0006Q"}, d2 = {"Lcom/yalla/yalla/ui/fragment/GiftSendFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/l1;", "", "getPageTypeUser", "getPageIndex", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "onResume", "giftId", "setGiftId", "index", "initGiftId", "notifyDataSetChanged", "", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "data", "refreshData", "initView", "setData", "getGiftPosition", "position", "updateIndicator", "setSelectedGift", "pageSize", "initGiftPoint", "Landroidx/recyclerview/widget/RecyclerView;", "mRvCustomer", "closeDefaultAnimator", "Lcom/yalla/yalla/ui/view/gift/GiftListFragmentEmptyView;", "emptyView$delegate", "Lkotlin/Lazy;", "getEmptyView", "()Lcom/yalla/yalla/ui/view/gift/GiftListFragmentEmptyView;", "emptyView", "pageTypeUser", "I", "Lcom/yalla/yalla/model/gift/GiftPropTypeShow;", "showIn", "Lcom/yalla/yalla/model/gift/GiftPropTypeShow;", "pageIndex", "currentData", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "getCurrentData", "()Lcom/yalla/yalla/model/gift/GiftPropModel;", "setCurrentData", "(Lcom/yalla/yalla/model/gift/GiftPropModel;)V", "giftPageList", "Ljava/util/List;", "allData", "Lcom/yalla/yalla/ui/view/GiftView;", "selectedView", "Lcom/yalla/yalla/ui/view/GiftView;", "", "showAllSiteGift", "Z", "Lo0oOo0OO/o000O;", "giftPagerAdapter$delegate", "getGiftPagerAdapter", "()Lo0oOo0OO/o000O;", "giftPagerAdapter", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "resumeListener", "Lkotlin/jvm/functions/Function1;", "getResumeListener", "()Lkotlin/jvm/functions/Function1;", "setResumeListener", "(Lkotlin/jvm/functions/Function1;)V", "tempGiftId", "tempIndex", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGiftSendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendFragment.kt\ncom/yalla/yalla/ui/fragment/GiftSendFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n1855#2,2:316\n1864#2,3:318\n1864#2,3:321\n1864#2,2:324\n1864#2,3:326\n1866#2:329\n*S KotlinDebug\n*F\n+ 1 GiftSendFragment.kt\ncom/yalla/yalla/ui/fragment/GiftSendFragment\n*L\n170#1:316,2\n211#1:318,3\n242#1:321,3\n267#1:324,2\n268#1:326,3\n267#1:329\n*E\n"})
public final class GiftSendFragment extends p508o0o0O.OooOO0O<l1> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private GiftPropModel currentData;
    private int pageIndex;

    @Nullable
    private Function1<? super List<GiftPropModel>, Unit> resumeListener;

    @Nullable
    private GiftView selectedView;

    /* JADX INFO: renamed from: emptyView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyView = LazyKt.lazy(new OooO0O0());
    private int pageTypeUser = GiftPropTypeUser.Hot.getValue();

    @NotNull
    private GiftPropTypeShow showIn = GiftPropTypeShow.InRoom;

    @NotNull
    private final List<List<GiftPropModel>> giftPageList = new ArrayList();

    @NotNull
    private List<GiftPropModel> allData = new ArrayList();
    private boolean showAllSiteGift = true;

    /* JADX INFO: renamed from: giftPagerAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy giftPagerAdapter = LazyKt.lazy(new OooO0OO());
    private int tempGiftId = -1;
    private int tempIndex = -1;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.GiftSendFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static GiftSendFragment OooO00o(int i, @NotNull GiftPropTypeShow showIn, @NotNull List data) {
            Intrinsics.checkNotNullParameter(showIn, "showIn");
            Intrinsics.checkNotNullParameter(data, "data");
            GiftSendFragment giftSendFragment = new GiftSendFragment();
            giftSendFragment.pageTypeUser = i;
            giftSendFragment.showIn = showIn;
            giftSendFragment.allData.clear();
            giftSendFragment.allData.addAll(data);
            giftSendFragment.setArguments(new Bundle());
            return giftSendFragment;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<GiftListFragmentEmptyView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GiftListFragmentEmptyView invoke() {
            return new GiftListFragmentEmptyView(GiftSendFragment.this.getContext(), null, 6, 0);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<oo000o> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo000o invoke() {
            GiftSendFragment giftSendFragment = GiftSendFragment.this;
            return new oo000o(giftSendFragment, giftSendFragment.getContext(), oO00OO0O.item_gift_send_page);
        }
    }

    public static final class OooO0o extends RecyclerView.o00O0O {
        public OooO0o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                GiftSendFragment giftSendFragment = GiftSendFragment.this;
                RecyclerView.Oooo000 layoutManager = giftSendFragment.getBinding().f58319OooO0OO.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                giftSendFragment.updateIndicator(iFindFirstVisibleItemPosition);
                giftSendFragment.pageIndex = iFindFirstVisibleItemPosition;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeDefaultAnimator(RecyclerView mRvCustomer) {
        RecyclerView.ItemAnimator itemAnimator = mRvCustomer.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7627OooO0OO = 0L;
            itemAnimator.f7629OooO0o = 0L;
            itemAnimator.f7630OooO0o0 = 0L;
            itemAnimator.f7628OooO0Oo = 0L;
            ((androidx.recyclerview.widget.o00000) itemAnimator).f7758OooO0oO = false;
        }
    }

    private final GiftListFragmentEmptyView getEmptyView() {
        return (GiftListFragmentEmptyView) this.emptyView.getValue();
    }

    private final p564o0oOo0OO.o000O<List<GiftPropModel>> getGiftPagerAdapter() {
        return (p564o0oOo0OO.o000O) this.giftPagerAdapter.getValue();
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

    public static /* synthetic */ void initGiftId$default(GiftSendFragment giftSendFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        giftSendFragment.initGiftId(i);
    }

    private final void initGiftPoint(int pageSize) {
        if (pageSize <= 1) {
            return;
        }
        getBinding().f58318OooO0O0.removeAllViews();
        for (int i = 0; i < pageSize; i++) {
            ImageView imageView = new ImageView(getContext());
            if (i == 0) {
                imageView.setImageResource(oOo00OO0.icon_banner_point_green);
            } else {
                imageView.setImageResource(oOo00OO0.no_select);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.leftMargin = com.code.android.util.o0000O0.OooO00o(3.0f);
            layoutParams.rightMargin = com.code.android.util.o0000O0.OooO00o(3.0f);
            layoutParams.width = com.code.android.util.o0000O0.OooO00o(5.0f);
            layoutParams.height = com.code.android.util.o0000O0.OooO00o(5.0f);
            getBinding().f58318OooO0O0.addView(imageView, layoutParams);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        getBinding().f58319OooO0OO.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView = getBinding().f58319OooO0OO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        closeDefaultAnimator(recyclerView);
        new androidx.recyclerview.widget.o000OOo().attachToRecyclerView(getBinding().f58319OooO0OO);
        getGiftPagerAdapter().Oooo00o();
        getGiftPagerAdapter().OooOo0(getEmptyView());
        getBinding().f58319OooO0OO.setOnTouchListener(new o0OoOo0());
        getBinding().f58319OooO0OO.addOnScrollListener(new OooO0o());
        getBinding().f58319OooO0OO.setAdapter(getGiftPagerAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$0(View view, MotionEvent motionEvent) {
        LiveEventBus.get("DismissIntroducingTagGiftWindow").post(Boolean.FALSE);
        return false;
    }

    private final void setData() {
        List<GiftPropModel> list = this.allData;
        this.giftPageList.clear();
        if (list.isEmpty()) {
            getGiftPagerAdapter().Oooo00o();
            getGiftPagerAdapter().OooOoO0(this.giftPageList);
        } else {
            int i = this.tempIndex;
            if (i >= 0) {
                this.currentData = list.get(i);
            }
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
            getGiftPagerAdapter().OooOoO0(this.giftPageList);
            initGiftPoint(this.giftPageList.size());
            GiftPropModel giftPropModel2 = this.currentData;
            updateIndicator(setSelectedGift(giftPropModel2 != null ? giftPropModel2.getGiftId() : -1));
        }
        Function1<? super List<GiftPropModel>, Unit> function1 = this.resumeListener;
        if (function1 != null) {
            function1.invoke(list);
        }
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
                    getBinding().f58319OooO0OO.scrollToPosition(i2);
                    RecyclerView.Adapter adapter = getBinding().f58319OooO0OO.getAdapter();
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
        if (getBinding().f58318OooO0O0.getChildCount() <= 1) {
            return;
        }
        int childCount = getBinding().f58318OooO0O0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getBinding().f58318OooO0O0.getChildAt(i);
            ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
            if (i == position) {
                if (imageView != null) {
                    imageView.setImageResource(oOo00OO0.icon_banner_point_green);
                }
            } else if (imageView != null) {
                imageView.setImageResource(oOo00OO0.no_select);
            }
        }
    }

    @Nullable
    public final GiftPropModel getCurrentData() {
        return this.currentData;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final int getPageTypeUser() {
        return this.pageTypeUser;
    }

    @Nullable
    public final Function1<List<GiftPropModel>, Unit> getResumeListener() {
        return this.resumeListener;
    }

    public final void initGiftId(int index) {
        this.tempIndex = index;
    }

    public final void notifyDataSetChanged() {
        getGiftPagerAdapter().notifyDataSetChanged();
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        setData();
        setGiftId(this.tempGiftId);
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Function1<? super List<GiftPropModel>, Unit> function1 = this.resumeListener;
        if (function1 != null) {
            function1.invoke(this.allData);
        }
    }

    public final void refreshData(@NotNull List<GiftPropModel> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.allData.clear();
        this.allData.addAll(data);
        setData();
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
        if (giftPropModel2 == null || !getIsLazyInit()) {
            return;
        }
        updateIndicator(setSelectedGift(giftPropModel2.getGiftId()));
        notifyDataSetChanged();
    }

    public final void setResumeListener(@Nullable Function1<? super List<GiftPropModel>, Unit> function1) {
        this.resumeListener = function1;
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public l1 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l1 l1VarInflate = l1.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(l1VarInflate, "inflate(inflater)");
        return l1VarInflate;
    }
}
