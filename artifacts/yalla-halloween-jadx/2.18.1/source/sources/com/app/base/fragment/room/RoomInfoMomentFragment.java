package com.app.base.fragment.room;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.o0000O;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.MomentTypeDelete;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.OooOOO;
import p143o00OOooo.o00O0OO;
import p143o00OOooo.o00O0OOO;
import p143o00OOooo.o00OO000;
import p143o00OOooo.oo0O;
import p143o00OOooo.oo0o0O0;
import p143o00OOooo.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p503o0o00o00.OooO;
import p522o0o0O0o.o000O0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p563o0oOo0.o00000OO;
import p649o0ooOOoo.d9;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u001a\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/app/base/fragment/room/RoomInfoMomentFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/d9;", "", "initObserver", "", ShareConstants.RESULT_POST_ID, "squareSingle4Edited", "initView", "refreshLoad", "setEmptyView", "", "isRefresh", "getMoments", "onLazyInit", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Lcom/app/base/mixedroom/model/RoomLoginInformation;", "mRoomLoginInformation", "Lcom/app/base/mixedroom/model/RoomLoginInformation;", "Lcom/app/base/mixedroom/model/RoomConfiguration;", "mRoomConfiguration", "Lcom/app/base/mixedroom/model/RoomConfiguration;", "dateSort", "J", "", "index", "I", "", "Lcom/yalla/yalla/model/MomentDetailModel;", "listData", "Ljava/util/List;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "mMomentVM$delegate", "Lkotlin/Lazy;", "getMMomentVM", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "mMomentVM", "Lo0oOo0/o00000OO;", "mAdapter$delegate", "getMAdapter", "()Lo0oOo0/o00000OO;", "mAdapter", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomInfoMomentFragment extends OooO<d9> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String RoomConfiguration = "RoomConfiguration";

    @NotNull
    private static final String RoomLoginInformation = "RoomLoginInformation";
    private long dateSort;

    @Nullable
    private RoomConfiguration mRoomConfiguration;

    @Nullable
    private RoomLoginInformation mRoomLoginInformation;
    private int index = 1;

    @NotNull
    private List<MomentDetailModel> listData = new ArrayList();

    /* JADX INFO: renamed from: mMomentVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMomentVM = o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.app.base.fragment.room.RoomInfoMomentFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.app.base.fragment.room.RoomInfoMomentFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f11675Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f11675Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.app.base.fragment.room.RoomInfoMomentFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: mAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: com.app.base.fragment.room.RoomInfoMomentFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function1<MomentDetailModel, Long> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f11672Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(MomentDetailModel momentDetailModel) {
            long id;
            MomentDetailModel item = momentDetailModel;
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.getSendPostModel() != null) {
                MomentSendModel sendPostModel = item.getSendPostModel();
                Intrinsics.checkNotNull(sendPostModel);
                id = sendPostModel.getPostId();
            } else {
                id = item.getId();
            }
            return Long.valueOf(id);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o00000OO> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000OO invoke() {
            FragmentActivity fragmentActivityRequireActivity = RoomInfoMomentFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            o00000OO o00000oo2 = new o00000OO(fragmentActivityRequireActivity, MomentAdapterTag.RoomInfoMomentsFragment);
            RoomInfoMomentFragment roomInfoMomentFragment = RoomInfoMomentFragment.this;
            o00000oo2.f44994OooO0o = EnterRoomParentPage.Moments_Room_SharedRoom;
            o00000oo2.setLoadErrorClickListener(new com.app.base.fragment.room.OooO0O0(o00000oo2, roomInfoMomentFragment));
            return o00000oo2;
        }
    }

    public static final class OooO0o extends o00Oo0 {
        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43168OooOooO.setValue(Boolean.TRUE);
            o0O00000.OooO0OO("InRoom_roomProfile_join");
            o0O00000.OooO0OO("InRoom_roomProfile_join_moments");
        }
    }

    @JvmStatic
    @NotNull
    public static final RoomInfoMomentFragment getInstance(@Nullable RoomLoginInformation roomLoginInformation, @Nullable RoomConfiguration roomConfiguration) {
        Objects.requireNonNull(INSTANCE);
        RoomInfoMomentFragment roomInfoMomentFragment = new RoomInfoMomentFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(RoomLoginInformation, roomLoginInformation);
        bundle.putSerializable(RoomConfiguration, roomConfiguration);
        roomInfoMomentFragment.setArguments(bundle);
        return roomInfoMomentFragment;
    }

    private final o00000OO getMAdapter() {
        return (o00000OO) this.mAdapter.getValue();
    }

    private final MomentVM getMMomentVM() {
        return (MomentVM) this.mMomentVM.getValue();
    }

    private final void getMoments(final boolean isRefresh) {
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        if (!oooO00o.OooO00o().OooOOOo()) {
            getMMomentVM().squareBarMember(String.valueOf(oooO00o.OooO00o().f43319OooO0Oo.getValue()), this.dateSort, this.index).observe(getViewLifecycleOwner(), new Observer() { // from class: o00OOooo.o00OO0OO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    RoomInfoMomentFragment.m64getMoments$lambda13(isRefresh, this, (ApiResult) obj);
                }
            });
        } else {
            getMAdapter().setNewData(null);
            getBinding().f49157OooO0OO.OooO();
            setEmptyView();
            getMAdapter().setLoadComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getMoments$lambda-13, reason: not valid java name */
    public static final void m64getMoments$lambda13(boolean z, RoomInfoMomentFragment this$0, ApiResult apiResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (apiResult.isSuccess()) {
            if (z) {
                this$0.listData.clear();
            }
            List list = (List) apiResult.getData();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((MomentDetailModel) it.next()).setFollow(false);
                }
                this$0.listData.addAll(list);
                this$0.dateSort = 0L;
                if (apiResult.getPage().getDateSort() != null) {
                    Long dateSort = apiResult.getPage().getDateSort();
                    Intrinsics.checkNotNull(dateSort);
                    this$0.dateSort = dateSort.longValue();
                }
                this$0.index = apiResult.getPage().getPageIndex() + 1;
            }
            o000O0.OooO0Oo(this$0.listData, OooO0O0.f11672Oooo0o);
            this$0.getMAdapter().setNewData(this$0.listData);
            this$0.getMAdapter().setLoadComplete();
        } else {
            this$0.getMAdapter().loadError();
        }
        XRefreshLayout xRefreshLayout = this$0.getBinding().f49157OooO0OO;
        boolean zIsSuccess = apiResult.isSuccess();
        Collection collection = (Collection) apiResult.getData();
        xRefreshLayout.Oooo0o0(z, zIsSuccess, collection == null || collection.isEmpty());
        this$0.setEmptyView();
    }

    private final void initObserver() {
        int i = 0;
        LiveEventBus.get("MOMENT_POST_DELETE", MomentDetailModel.class).observe(this, new p143o00OOooo.o00OO00O(this, i));
        LiveEventBus.get("MOMENT_POST_COMMENT", MomentDetailModel.class).observe(this, new o00O0OO(this, i));
        LiveEventBus.get("POST_DETAIL_DATA_REFRESH", MomentDetailModel.class).observe(this, new o00OO000(this, i));
        LiveEventBus.get("POST_DETAIL_POLL_DATA_REFRESH", MomentDetailModel.class).observe(this, new oo0oOO0(this, i));
        Class cls = Long.TYPE;
        LiveEventBus.get("EVENT_DELETED", cls).observe(this, new oo0o0O0(this, i));
        LiveEventBus.get("MOMENT_EDIT_SEND_SUCCESS", cls).observe(this, new p143o00OOooo.o00O(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-1, reason: not valid java name */
    public static final void m65initObserver$lambda1(RoomInfoMomentFragment this$0, MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int size = this$0.getMAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            if (this$0.getMAdapter().getData().get(i).getId() == momentDetailModel.getId()) {
                this$0.getMAdapter().remove(i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-2, reason: not valid java name */
    public static final void m66initObserver$lambda2(RoomInfoMomentFragment this$0, MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int size = this$0.getMAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            MomentDetailModel momentDetailModel2 = this$0.getMAdapter().getData().get(i);
            if (momentDetailModel2.getId() == momentDetailModel.getId()) {
                momentDetailModel2.setCommentNum(momentDetailModel.getCommentNum());
                this$0.getMAdapter().notifyItemChanged(this$0.getMAdapter().getHeaderLayoutCount() + i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-3, reason: not valid java name */
    public static final void m67initObserver$lambda3(RoomInfoMomentFragment this$0, MomentDetailModel result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        int size = this$0.getMAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            if (this$0.getMAdapter().getData().get(i).getId() == result.getId()) {
                this$0.getMAdapter().getData().set(i, result);
                this$0.getMAdapter().notifyItemChanged(this$0.getMAdapter().getHeaderLayoutCount() + i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-4, reason: not valid java name */
    public static final void m68initObserver$lambda4(RoomInfoMomentFragment this$0, MomentDetailModel result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        int size = this$0.getMAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            MomentDetailModel momentDetailModel = this$0.getMAdapter().getData().get(i);
            if (momentDetailModel.getType() == MomentType.Poll.getValue()) {
                if (momentDetailModel.getId() == result.getId()) {
                    this$0.getMAdapter().getData().set(i, result);
                    this$0.getMAdapter().notifyItemChanged(this$0.getMAdapter().getHeaderLayoutCount() + i);
                    return;
                }
                return;
            }
            if (momentDetailModel.getType() == MomentType.Forward.getValue()) {
                if (momentDetailModel.getForward() != null) {
                    MomentDetailModel forward = momentDetailModel.getForward();
                    Intrinsics.checkNotNull(forward);
                    if (forward.getId() == result.getId()) {
                        this$0.getMAdapter().getData().get(i).setForward(result);
                        this$0.getMAdapter().notifyItemChanged(this$0.getMAdapter().getHeaderLayoutCount() + i);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-5, reason: not valid java name */
    public static final void m69initObserver$lambda5(RoomInfoMomentFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int size = this$0.getMAdapter().getData().size();
        for (int i = 0; i < size; i++) {
            MomentDetailModel momentDetailModel = this$0.getMAdapter().getData().get(i);
            if (momentDetailModel.getForwardContent() != null) {
                MomentForwardContent forwardContent = momentDetailModel.getForwardContent();
                Intrinsics.checkNotNull(forwardContent);
                if (forwardContent.getShareType() == 20) {
                    MomentForwardContent forwardContent2 = momentDetailModel.getForwardContent();
                    Intrinsics.checkNotNull(forwardContent2);
                    long id = forwardContent2.getId();
                    if (l != null && id == l.longValue()) {
                        momentDetailModel.setDeleteType(MomentTypeDelete.EVENT.getValue());
                        this$0.getMAdapter().notifyItemChanged(this$0.getMAdapter().getHeaderLayoutCount() + i);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-6, reason: not valid java name */
    public static final void m70initObserver$lambda6(RoomInfoMomentFragment this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.squareSingle4Edited(it.longValue());
    }

    private final void initView() {
        getBinding().f49157OooO0OO.setNestedScrollingEnabled(true);
        int i = 0;
        getBinding().f49156OooO0O0.setNestedScrollingEnabled(false);
        getBinding().f49157OooO0OO.f12222o000O0Oo = new oo0O(this, i);
        getBinding().f49157OooO0OO.f12224o000OO0O = new OooOOO(this, 1);
        getBinding().f49156OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49156OooO0O0.setAdapter(getMAdapter());
        o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.observe(getViewLifecycleOwner(), new o00O0OOO(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-10, reason: not valid java name */
    public static final void m71initView$lambda10(RoomInfoMomentFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMoments(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-11, reason: not valid java name */
    public static final void m72initView$lambda11(RoomInfoMomentFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-9, reason: not valid java name */
    public static final void m73initView$lambda9(RoomInfoMomentFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshLoad() {
        this.index = 1;
        getMoments(true);
    }

    private final void setEmptyView() {
        Integer value = o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue();
        if (value == null || value.intValue() != 0) {
            getMAdapter().setEmptyImageRes(R.drawable.ic_empty_fans);
            getMAdapter().setEmptyText(R.string.moments_none);
            getMAdapter().showEmptyButton(false);
        } else {
            getMAdapter().setEmptyImageRes(R.drawable.ic_empty_follow);
            getMAdapter().setEmptyText(R.string.Only_room_members_can_view_each_others_posts);
            getMAdapter().setNewData(null);
            getMAdapter().setOnEmptyClickListener(new OooO0o());
            getMAdapter().setEmptyButtonText(R.string.Join_us);
        }
    }

    private final void squareSingle4Edited(final long postId) {
        getMMomentVM().momentDetail(postId + "", 0).observe(getViewLifecycleOwner(), new Observer() { // from class: o00OOooo.o00OO0O0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                RoomInfoMomentFragment.m74squareSingle4Edited$lambda8(this.f32015OooO00o, postId, (ApiResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: squareSingle4Edited$lambda-8, reason: not valid java name */
    public static final void m74squareSingle4Edited$lambda8(RoomInfoMomentFragment this$0, long j, ApiResult apiResult) {
        MomentDetailModel momentDetailModel;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!apiResult.isSuccess() || (momentDetailModel = (MomentDetailModel) apiResult.getData()) == null) {
            return;
        }
        int i = -1;
        for (int i2 = 0; i2 < this$0.getMAdapter().getData().size(); i2++) {
            if (j == this$0.getMAdapter().getData().get(i2).getId()) {
                i = i2;
            }
        }
        if (i == -1 || this$0.getMAdapter().getData().size() <= i) {
            return;
        }
        if (momentDetailModel.getPower() != MomentTypePower.Self.getValue()) {
            this$0.getMAdapter().setData(i, momentDetailModel);
        } else {
            this$0.getMAdapter().remove(i);
            this$0.getMAdapter().notifyItemRemoved(this$0.getMAdapter().getHeaderLayoutCount() + i);
        }
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mRoomLoginInformation = (RoomLoginInformation) arguments.getSerializable(RoomLoginInformation);
            this.mRoomConfiguration = (RoomConfiguration) arguments.getSerializable(RoomConfiguration);
        }
        initView();
        initObserver();
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O00000.OooO0OO("InRoom_roomMoments");
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public d9 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        d9 d9VarInflate = d9.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(d9VarInflate, "inflate(inflater)");
        return d9VarInflate;
    }
}
