package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeComment;
import com.yalla.yalla.model.MomentLogActionTypeCommentReply;
import com.yalla.yalla.model.bean.AbsJavaBeanApiList;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentCommentResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.view.EmptyView;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentHeaderView;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.oo0ooO;
import p039OoooOoo.o00OO;
import p377o0OOoOo.o000O0O0;
import p406o0Oo0Ooo.oOO0O0O;
import p406o0Oo0Ooo.oOO0Oo00;
import p526o0o0OOO0.oo0oOO0;
import p564o0oOo0OO.o000O;
import p579o0oOoo.oO000Oo0;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p585o0oOooOO.h;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.o6;
import p642o0ooOOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001{B\u0007¢\u0006\u0004\bx\u0010yJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0016\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001bJ\u0016\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"J \u0010(\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"J\u0006\u0010)\u001a\u00020\nJ\u0016\u0010,\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010J\u000e\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-J\u0010\u00100\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-J\u000e\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0017J\u0006\u00103\u001a\u00020\nJ\b\u00104\u001a\u00020\nH\u0002J\b\u00105\u001a\u00020\nH\u0002J\"\u00108\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00172\b\b\u0002\u00107\u001a\u00020\u0017H\u0002J \u0010<\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010;2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u000109H\u0002J\b\u0010=\u001a\u00020\nH\u0002J\b\u0010>\u001a\u00020\nH\u0002J\u0012\u0010A\u001a\u00020 2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002J \u0010C\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\u0013H\u0002J\b\u0010D\u001a\u00020\nH\u0002J\b\u0010E\u001a\u00020\nH\u0002R$\u0010F\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR!\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001b0S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\\R\u0018\u0010+\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010]R\u001b\u0010b\u001a\u00020^8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010U\u001a\u0004\b`\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\"\u0010f\u001a\u00020Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010[\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020Y8\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010[R\u0016\u0010l\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010U\u001a\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010mR\u0016\u0010t\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010mR\u0016\u0010u\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010mR\u0016\u0010v\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010mR\u0016\u0010w\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010[¨\u0006|"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/o6;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "", "count", "setCount", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "postDetailModel", "setData", "setPostDetailModel", "", "show", "showKeyboard", "commentReplaceCid", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "itemModel", "replyComment", "postCommentDetailModel", "toReplyComment", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "formatContentForPost", "Lo0o0Oo00/OooOOOO;", "controller", "sendComment", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", "sendPostCommentModel", "isReplyComment", "toApiSendData", "clearSendEdit", "momentId", "commentId", "hideComment", "", "cid", "deleteComment", "reportComment", "isMoveToListTop", "tabRefreshData", "initData", "initObserver", "init", "isRefresh", "showLoading", "loadData", "", "list", "", "convertCommentMessageIndexColor", "smoothScrollToPositionCommentMessageIndex", "smoothScrollToPositionSendCommentIndex", "Lcom/yalla/yalla/ui/view/editTextSpan/EditTextSpan;", "editContentInput", "getSendPostModelContent", "it", "momentBuriedPoint", "recoverSendEdit", "showHotOrNewHeaderView", "mPostDetailModel", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "getMPostDetailModel", "()Lcom/yalla/yalla/model/moment/MomentDetailModel;", "setMPostDetailModel", "(Lcom/yalla/yalla/model/moment/MomentDetailModel;)V", "mSendPostCommentModel", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", "Lo0o00O0O/o00Ooo;", "mMapListSendPostCommentModel", "Lo0o00O0O/o00Ooo;", "dateSort", "J", "Lo0oOo0OO/o000O;", "baseAdapter$delegate", "Lkotlin/Lazy;", "getBaseAdapter", "()Lo0oOo0OO/o000O;", "baseAdapter", "", "pageIndex", "I", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "Ljava/lang/String;", "Lcom/yalla/yalla/ui/vm/moment/MomentDetailActivityVM;", "momentVm$delegate", "getMomentVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentDetailActivityVM;", "momentVm", "Lcom/yalla/yalla/ui/view/moment/MomentDetailCommentHeaderView;", "mPostDetailCommentHeaderView", "Lcom/yalla/yalla/ui/view/moment/MomentDetailCommentHeaderView;", "mSortType", "getMSortType", "()I", "setMSortType", "(I)V", "delayMillsCommentMessageChangeColor", "isCommentReplacePost", "Z", "Lcom/yalla/yalla/ui/view/EmptyView;", "emptyView$delegate", "getEmptyView", "()Lcom/yalla/yalla/ui/view/EmptyView;", "emptyView", "mIsRefresh", "mIsSuccess", "mIsNoMoreData", "isInitLoadData", "commentMessageForPostListIndex", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentDetailCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,809:1\n172#2,9:810\n350#3,7:819\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment\n*L\n95#1:810,9\n728#1:819,7\n*E\n"})
public final class MomentDetailCommentFragment extends p508o0o0O.OooOO0O<o6> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String POST_DETAIL_MODEL = "POST_DETAIL_MODEL";

    @Nullable
    private String commentId;
    private long dateSort;
    private boolean isInitLoadData;
    private boolean mIsNoMoreData;
    private boolean mIsRefresh;
    private boolean mIsSuccess;

    @Nullable
    private MomentDetailCommentHeaderView mPostDetailCommentHeaderView;

    @Nullable
    private MomentDetailModel mPostDetailModel;

    @Nullable
    private MomentSendCommentModel mSendPostCommentModel;
    private int mSortType;

    @Nullable
    private MomentCommentDetailModel postCommentDetailModel;

    @NotNull
    private final p487o0o00O0O.o00Ooo mMapListSendPostCommentModel = new p487o0o00O0O.o00Ooo();

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter = LazyKt.lazy(new OooO0O0());
    private int pageIndex = 1;

    /* JADX INFO: renamed from: momentVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentVm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentDetailActivityVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f28732OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28732OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$special$$inlined$activityViewModels$default$3
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
    private final int delayMillsCommentMessageChangeColor = 1400;
    private boolean isCommentReplacePost = true;

    /* JADX INFO: renamed from: emptyView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyView = LazyKt.lazy(new OooO0o());
    private int commentMessageForPostListIndex = -1;

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            momentDetailCommentFragment.setMSortType(iIntValue);
            momentDetailCommentFragment.loadData(true, false, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00000O0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000O0 invoke() {
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            return new o00000O0(momentDetailCommentFragment, momentDetailCommentFragment.getContext(), oO00OO0O.item_moment_detail_comment);
        }
    }

    public static final class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f28714OooO0o;

        public OooO0OO(String str) {
            this.f28714OooO0o = str;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            p592o0oo00O.OooOOO0.OooO0O0("response = " + response);
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
            if (mPostDetailModel != null) {
                MomentDetailModel mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel();
                mPostDetailModel.setCommentNum((mPostDetailModel2 != null ? mPostDetailModel2.getCommentNum() : 0L) - 1);
            }
            int size = momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.size();
            for (int i = 0; i < size; i++) {
                MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.get(i);
                Intrinsics.checkNotNull(momentCommentDetailModel);
                long id = momentCommentDetailModel.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                if (Intrinsics.areEqual(this.f28714OooO0o, sb.toString())) {
                    momentDetailCommentFragment.getBaseAdapter().OooOOo(i);
                    break;
                }
            }
            if (momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.isEmpty()) {
                momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                momentDetailCommentFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailCommentFragment.getBinding().f58521OooO0Oo.OooO0Oo();
            momentDetailCommentFragment.showHotOrNewHeaderView();
            MomentDetailModel mPostDetailModel3 = momentDetailCommentFragment.getMPostDetailModel();
            if (mPostDetailModel3 != null) {
                long commentNum = mPostDetailModel3.getCommentNum();
                long j = commentNum > 0 ? commentNum - 1 : 0L;
                MomentDetailModel mPostDetailModel4 = momentDetailCommentFragment.getMPostDetailModel();
                if (mPostDetailModel4 != null) {
                    mPostDetailModel4.setCommentNum(j);
                }
            }
            LiveEventBus.get("POST_DETAIL_DATA_DELETE_COMMENT").post(momentDetailCommentFragment.getMPostDetailModel());
        }
    }

    public static final class OooO0o extends Lambda implements Function0<EmptyView> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EmptyView invoke() {
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            Context contextRequireContext = momentDetailCommentFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            EmptyView emptyView = new EmptyView(contextRequireContext, null, 6, 0);
            emptyView.setImage(Integer.valueOf(oOo00OO0.icon_no_list_comment));
            emptyView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.No_comments_yet));
            EmptyView.OooO00o(emptyView, new o00000O(momentDetailCommentFragment));
            return emptyView;
        }
    }

    public static final class OooOO0 implements Observer<Object> {
        public OooOO0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (((Boolean) result).booleanValue()) {
                MomentDetailCommentFragment.loadData$default(MomentDetailCommentFragment.this, true, false, false, 4, null);
            }
        }
    }

    public static final class OooOO0O implements Observer<Object> {
        public OooOO0O() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (((Boolean) result).booleanValue()) {
                MomentDetailCommentFragment.loadData$default(MomentDetailCommentFragment.this, true, false, false, 4, null);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nMomentDetailCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment$initObserver$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,809:1\n350#2,7:810\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment$initObserver$4\n*L\n149#1:810,7\n*E\n"})
    public static final class OooOOO implements Observer<Object> {
        public OooOOO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            MomentReplyModel sonFirst;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Triple<kotlin.Long, kotlin.Long, kotlin.Long>");
            Triple triple = (Triple) obj;
            long jLongValue = ((Number) triple.component1()).longValue();
            long jLongValue2 = ((Number) triple.component2()).longValue();
            long jLongValue3 = ((Number) triple.component3()).longValue();
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
            if (mPostDetailModel == null || jLongValue != mPostDetailModel.getId()) {
                return;
            }
            List<T> list = momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "baseAdapter.data");
            Iterator it = list.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else {
                    if (((MomentCommentDetailModel) it.next()).getId() == jLongValue2) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (i < 0) {
                return;
            }
            MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.get(i);
            MomentReplyModel sonFirst2 = momentCommentDetailModel.getSonFirst();
            if (sonFirst2 != null && sonFirst2.getId() == jLongValue3) {
                z = true;
            }
            if (z && (sonFirst = momentCommentDetailModel.getSonFirst()) != null) {
                sonFirst.setHide(true);
            }
            momentDetailCommentFragment.getBaseAdapter().notifyDataSetChanged();
        }
    }

    public static final class OooOOO0 implements Observer<Object> {
        public OooOOO0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Pair pair = (Pair) result;
            MomentDetailCommentFragment.this.hideComment(((Number) pair.component1()).longValue(), ((Number) pair.component2()).longValue());
        }
    }

    public static final class OooOOOO implements Observer<MomentReplyModel> {
        public OooOOOO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(MomentReplyModel momentReplyModel) {
            MomentReplyModel momentReplyModel2 = momentReplyModel;
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            int size = momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.get(i2);
                if (momentCommentDetailModel != null && i == -1 && momentCommentDetailModel.getId() == momentReplyModel2.getLocalCommentId()) {
                    momentCommentDetailModel.setSonFirst(momentReplyModel2);
                    i = i2;
                }
            }
            if (i > -1) {
                momentDetailCommentFragment.getBaseAdapter().notifyItemChanged(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
            }
        }
    }

    public static final class OooOo extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f28722OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(long j) {
            super(1);
            this.f28722OooO0Oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int code = it.getCode();
            long j = this.f28722OooO0Oo;
            if (code == 2095) {
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Long.valueOf(j));
            } else if (code == 4000) {
                LiveEventBus.get("MOMENT_BY_USER_REMOVE").post(Long.valueOf(j));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<List<MomentCommentDetailModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f28724OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f28725OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f28726OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(long j, boolean z, boolean z2) {
            super(1);
            this.f28725OooO0o0 = j;
            this.f28724OooO0o = z;
            this.f28726OooO0oO = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentCommentDetailModel> list) {
            List<MomentCommentDetailModel> list2 = list;
            int i = 1;
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            if (list2 != null) {
                momentDetailCommentFragment.getMomentVm().fixCommentHideState(list2, Long.valueOf(this.f28725OooO0o0));
                if (this.f28724OooO0o) {
                    momentDetailCommentFragment.getBaseAdapter().OooOoO0(momentDetailCommentFragment.convertCommentMessageIndexColor(list2));
                    momentDetailCommentFragment.showHotOrNewHeaderView();
                    momentDetailCommentFragment.getBinding().f58519OooO0O0.postDelayed(new p045Oooooo.o000O00(momentDetailCommentFragment, i), 300L);
                    if (this.f28726OooO0oO) {
                        momentDetailCommentFragment.getBinding().f58519OooO0O0.scrollToPosition(0);
                    }
                } else {
                    momentDetailCommentFragment.getBaseAdapter().OooO0O0(list2);
                }
            }
            momentDetailCommentFragment.pageIndex++;
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 implements p487o0o00O0O.oo000o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ p534o0o0Oo00.OooOOOO f28728OooO0O0;

        public Oooo0(p534o0o0Oo00.OooOOOO oooOOOO) {
            this.f28728OooO0O0 = oooOOOO;
        }

        @Override // p487o0o00O0O.oo000o
        public final void OooO00o(@NotNull MomentCommentDetailModel data) {
            Intrinsics.checkNotNullParameter(data, "data");
            p592o0oo00O.OooOOO0.OooO0Oo("添加评论 data =".concat(p140o00OOooo.OooOO0.OooO00o(data)));
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            momentDetailCommentFragment.getBaseAdapter().OooO00o(data);
            momentDetailCommentFragment.getBinding().f58519OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + 0);
            if (momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.isEmpty()) {
                momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                momentDetailCommentFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailCommentFragment.getBinding().f58521OooO0Oo.OooO0Oo();
            MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
            if (mPostDetailModel != null) {
                MomentDetailModel mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel();
                mPostDetailModel.setCommentNum((mPostDetailModel2 != null ? mPostDetailModel2.getCommentNum() : 0L) + 1);
            }
            LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailCommentFragment.getMPostDetailModel());
            momentDetailCommentFragment.toApiSendData(momentDetailCommentFragment.mSendPostCommentModel, false, this.f28728OooO0O0);
            FragmentActivity activity = momentDetailCommentFragment.getActivity();
            MomentDetailActivity momentDetailActivity = activity instanceof MomentDetailActivity ? (MomentDetailActivity) activity : null;
            MutableState<String> mutableState = momentDetailActivity != null ? momentDetailActivity.f26065OooOoO0 : null;
            if (mutableState != null) {
                mutableState.setValue(com.code.android.util.o0000.OooO0OO(oO00OOo0.please_chat_friendly));
            }
            momentDetailCommentFragment.showHotOrNewHeaderView();
        }

        @Override // p487o0o00O0O.oo000o
        public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
            Intrinsics.checkNotNullParameter(data, "data");
            p592o0oo00O.OooOOO0.OooO0Oo("回复评论 data = ".concat(p140o00OOooo.OooOO0.OooO00o(data)));
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            momentDetailCommentFragment.getBaseAdapter().OooOo00(i, data);
            momentDetailCommentFragment.getBinding().f58519OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
            if (momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.isEmpty()) {
                momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                momentDetailCommentFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailCommentFragment.getBinding().f58521OooO0Oo.OooO0Oo();
            MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
            if (mPostDetailModel != null) {
                MomentDetailModel mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel();
                mPostDetailModel.setCommentNum((mPostDetailModel2 != null ? mPostDetailModel2.getCommentNum() : 0L) + 1);
            }
            LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailCommentFragment.getMPostDetailModel());
            momentDetailCommentFragment.toApiSendData(momentDetailCommentFragment.mSendPostCommentModel, true, this.f28728OooO0O0);
            FragmentActivity activity = momentDetailCommentFragment.getActivity();
            MomentDetailActivity momentDetailActivity = activity instanceof MomentDetailActivity ? (MomentDetailActivity) activity : null;
            MutableState<String> mutableState = momentDetailActivity != null ? momentDetailActivity.f26065OooOoO0 : null;
            if (mutableState == null) {
                return;
            }
            mutableState.setValue(com.code.android.util.o0000.OooO0OO(oO00OOo0.please_chat_friendly));
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiResult<List<MomentCommentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28730OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(boolean z) {
            super(1);
            this.f28730OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<MomentCommentDetailModel>> apiResult) {
            ApiResult<List<MomentCommentDetailModel>> result = apiResult;
            Intrinsics.checkNotNullParameter(result, "result");
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            momentDetailCommentFragment.dateSort = 0L;
            Long dateSort = result.getPage().getDateSort();
            if (dateSort != null) {
                momentDetailCommentFragment.dateSort = dateSort.longValue();
            }
            momentDetailCommentFragment.mIsRefresh = this.f28730OooO0o0;
            momentDetailCommentFragment.mIsSuccess = result.isSuccess();
            List<MomentCommentDetailModel> data = result.getData();
            momentDetailCommentFragment.mIsNoMoreData = data == null || data.isEmpty();
            LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").post(Boolean.TRUE);
            if (momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo.isEmpty()) {
                if (result.isSuccess()) {
                    momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                } else {
                    momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataError);
                }
                momentDetailCommentFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailCommentFragment.getBinding().f58521OooO0Oo.OooO0Oo();
            momentDetailCommentFragment.getBaseAdapter().Oooo0(Boolean.valueOf(momentDetailCommentFragment.mIsRefresh), Boolean.valueOf(momentDetailCommentFragment.mIsSuccess), Boolean.valueOf(momentDetailCommentFragment.mIsNoMoreData));
            momentDetailCommentFragment.getBinding().f58520OooO0OO.OooOoOO(momentDetailCommentFragment.mIsRefresh, momentDetailCommentFragment.mIsSuccess, momentDetailCommentFragment.mIsNoMoreData);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MomentCommentDetailModel> convertCommentMessageIndexColor(List<MomentCommentDetailModel> list) {
        MomentCommentDetailModel postCommentDetailModel = getMomentVm().getPostCommentDetailModel();
        if (postCommentDetailModel != null && postCommentDetailModel.getId() > 0) {
            postCommentDetailModel.setLocalMessageDiscolor(true);
            if (list != null) {
                int size = list.size();
                int i = 0;
                int i2 = -1;
                for (int i3 = 0; i3 < size; i3++) {
                    MomentCommentDetailModel momentCommentDetailModel = list.get(i3);
                    if (momentCommentDetailModel.getId() == postCommentDetailModel.getId()) {
                        momentCommentDetailModel.setLocalMessageDiscolor(postCommentDetailModel.isLocalMessageDiscolor());
                        i2 = i3;
                    }
                }
                if (i2 < 0) {
                    list.add(0, postCommentDetailModel);
                } else {
                    i = i2;
                }
                this.commentMessageForPostListIndex = getBaseAdapter().OooOOO0() + i;
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o000O<MomentCommentDetailModel> getBaseAdapter() {
        return (o000O) this.baseAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyView getEmptyView() {
        return (EmptyView) this.emptyView.getValue();
    }

    private final MomentSendContentModel getSendPostModelContent(EditTextSpan editContentInput) {
        if (editContentInput == null) {
            return new MomentSendContentModel("");
        }
        String strOooO00o = p595o0oo00Oo.o0000Ooo.OooO00o(getActivity(), editContentInput);
        Intrinsics.checkNotNullExpressionValue(strOooO00o, "getAtUserToAtNum(activity, it)");
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(strOooO00o);
        ArrayList<? extends h> arrayListOooO0O0 = editContentInput.getSpanManager().OooO0O0("@");
        Intrinsics.checkNotNull(arrayListOooO0O0, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
        int size = arrayListOooO0O0.size();
        for (int i = 0; i < size; i++) {
            h hVar = arrayListOooO0O0.get(i);
            Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.yalla.yalla.ui.view.editTextSpan.EditTextSpanItem");
            h hVar2 = hVar;
            List<MomentSendContentAtModel> at = momentSendContentModel.getAt();
            String strOooO00o2 = oo0ooO.OooO00o(hVar2.f56771OooO0o0);
            String str = hVar2.f56769OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(str, "friendListModel.text");
            at.add(new MomentSendContentAtModel(strOooO00o2, str));
        }
        return momentSendContentModel;
    }

    private final void init() {
        this.mSendPostCommentModel = new MomentSendCommentModel(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        getBinding().f58519OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58519OooO0O0.setAdapter(getBaseAdapter());
        getBaseAdapter().OooOo0(getEmptyView());
        int i = 0;
        getBinding().f58520OooO0OO.f21330OooOooO = false;
        getBinding().f58520OooO0OO.OooOo00(true);
        getBinding().f58520OooO0OO.OooOoo0(new p022Oooo00O.Oooo000(this));
        Context context = getContext();
        if (context != null) {
            this.mPostDetailCommentHeaderView = new MomentDetailCommentHeaderView(context, null, 6, i);
        }
        MomentDetailCommentHeaderView momentDetailCommentHeaderView = this.mPostDetailCommentHeaderView;
        if (momentDetailCommentHeaderView != null) {
            momentDetailCommentHeaderView.setData(0);
        }
        MomentDetailCommentHeaderView momentDetailCommentHeaderView2 = this.mPostDetailCommentHeaderView;
        if (momentDetailCommentHeaderView2 == null) {
            return;
        }
        momentDetailCommentHeaderView2.setItemListener(new OooO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(MomentDetailCommentFragment this$0, o0OO0o.OooOOO0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        loadData$default(this$0, false, false, false, 4, null);
    }

    private final void initObserver() {
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_ADD").observe(this, new OooOO0());
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_DEL").observe(this, new OooOO0O());
        LiveEventBus.get("DISLIKE_COMMENT").observe(this, new OooOOO0());
        LiveEventBus.get("DISLIKE_REPLY").observe(this, new OooOOO());
        LiveEventBus.get("MomentCommentSon_Data", MomentReplyModel.class).observe(this, new OooOOOO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean isRefresh, boolean isMoveToListTop, boolean showLoading) {
        MomentDetailModel momentDetailModel = this.mPostDetailModel;
        if (momentDetailModel != null) {
            long id = momentDetailModel.getId();
            if (!this.isInitLoadData) {
                this.isInitLoadData = true;
            }
            if (isRefresh) {
                this.pageIndex = 1;
                this.dateSort = 0L;
                if (showLoading) {
                    getBinding().f58521OooO0Oo.OooO0oo();
                }
            }
            getMomentVm().momentCommentList(id, this.mSortType, this.dateSort, this.pageIndex).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooOo00(id, isRefresh, isMoveToListTop), new OooOo(id), new Oooo000(isRefresh), false));
        }
    }

    public static /* synthetic */ void loadData$default(MomentDetailCommentFragment momentDetailCommentFragment, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = true;
        }
        momentDetailCommentFragment.loadData(z, z2, z3);
    }

    private final void momentBuriedPoint(MomentSendCommentModel sendPostCommentModel, boolean isReplyComment, MomentDetailModel it) {
        String jSONString;
        String jSONString2;
        String str = "";
        if (!isReplyComment) {
            if (String.valueOf(it.getUserId()).length() > 0) {
                MomentLogActionTypeComment momentLogActionTypeComment = new MomentLogActionTypeComment(null, null, null, 7, null);
                momentLogActionTypeComment.setObject_userid(String.valueOf(it.getUserId()));
                momentLogActionTypeComment.setDiscoveryid(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(it.getId())));
                MomentSendContentModel content = sendPostCommentModel.getContent();
                if (content != null && (jSONString = content.toJSONString()) != null) {
                    str = jSONString;
                }
                momentLogActionTypeComment.setContent(str);
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                MomentLogActionType momentLogActionType = MomentLogActionType.comment;
                String json = momentLogActionTypeComment.toJson();
                MomentDetailModel momentDetailModel = this.mPostDetailModel;
                String sessionId = momentDetailModel != null ? momentDetailModel.getSessionId() : null;
                webEventRepository.getClass();
                WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
                return;
            }
            return;
        }
        if (String.valueOf(it.getUserId()).length() > 0) {
            MomentLogActionTypeCommentReply momentLogActionTypeCommentReply = new MomentLogActionTypeCommentReply(null, null, null, null, 15, null);
            momentLogActionTypeCommentReply.setObject_userid(String.valueOf(it.getUserId()));
            momentLogActionTypeCommentReply.setDiscoveryid(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(it.getId())));
            String cid = sendPostCommentModel.getCid();
            if (cid == null) {
                cid = "";
            }
            momentLogActionTypeCommentReply.setCommentid(cid);
            MomentSendContentModel content2 = sendPostCommentModel.getContent();
            if (content2 != null && (jSONString2 = content2.toJSONString()) != null) {
                str = jSONString2;
            }
            momentLogActionTypeCommentReply.setReply_content(str);
            WebEventRepository webEventRepository2 = WebEventRepository.f24891OooO00o;
            MomentLogActionType momentLogActionType2 = MomentLogActionType.comment_reply;
            String json2 = momentLogActionTypeCommentReply.toJson();
            String sessionId2 = it.getSessionId();
            webEventRepository2.getClass();
            WebEventRepository.OooO0o0(momentLogActionType2, json2, sessionId2);
        }
    }

    private final void recoverSendEdit() {
        MutableState<String> mutableState;
        p592o0oo00O.OooOOO0.OooO0O0("recoverSendEdit \n mSendPostCommentModel = " + this.mSendPostCommentModel);
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        if (momentSendCommentModel != null) {
            if (TextUtils.isEmpty(momentSendCommentModel.getCid())) {
                FragmentActivity activity = getActivity();
                MomentDetailActivity momentDetailActivity = activity instanceof MomentDetailActivity ? (MomentDetailActivity) activity : null;
                mutableState = momentDetailActivity != null ? momentDetailActivity.f26065OooOoO0 : null;
                if (mutableState != null) {
                    mutableState.setValue(com.code.android.util.o0000.OooO0OO(oO00OOo0.please_chat_friendly));
                }
            } else {
                String parentUserId = momentSendCommentModel.getParentUserId();
                long jOooO = parentUserId != null ? com.code.android.util.o0OoOo0.OooO(0L, parentUserId) : 0L;
                String parentUserName = momentSendCommentModel.getParentUserName();
                if (parentUserName == null) {
                    parentUserName = "";
                }
                String strOooO0O0 = oOO0O0O.OooO0O0(jOooO, parentUserName);
                FragmentActivity activity2 = getActivity();
                MomentDetailActivity momentDetailActivity2 = activity2 instanceof MomentDetailActivity ? (MomentDetailActivity) activity2 : null;
                mutableState = momentDetailActivity2 != null ? momentDetailActivity2.f26065OooOoO0 : null;
                if (mutableState != null) {
                    mutableState.setValue(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Reply_xxx), strOooO0O0));
                }
            }
            this.commentId = momentSendCommentModel.getCid();
        }
        showKeyboard(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHotOrNewHeaderView() {
        List<MomentCommentDetailModel> list = getBaseAdapter().f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "baseAdapter.data");
        if (!(!list.isEmpty())) {
            getBaseAdapter().OooOOoo();
            return;
        }
        MomentDetailCommentHeaderView momentDetailCommentHeaderView = this.mPostDetailCommentHeaderView;
        if ((momentDetailCommentHeaderView != null ? momentDetailCommentHeaderView.getParent() : null) == null) {
            getBaseAdapter().OooO0o0(this.mPostDetailCommentHeaderView, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothScrollToPositionCommentMessageIndex() {
        if (isDetached()) {
            return;
        }
        if (this.commentMessageForPostListIndex < 0) {
            smoothScrollToPositionSendCommentIndex();
            return;
        }
        LiveEventBus.get("POST_DETAIL_APPBARLAYOUTSETEXPANDED").post(Boolean.FALSE);
        getMomentVm().setPostCommentDetailModel(null);
        getBinding().f58519OooO0O0.smoothScrollToPosition(getBaseAdapter().OooOOO0() + this.commentMessageForPostListIndex);
        getBinding().f58519OooO0O0.postDelayed(new o0OOOO0o(this, 1), this.delayMillsCommentMessageChangeColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void smoothScrollToPositionCommentMessageIndex$lambda$6(MomentDetailCommentFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDetached()) {
            return;
        }
        try {
            try {
                int size = this$0.getBaseAdapter().f10111OooOOoo.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        MomentCommentDetailModel momentCommentDetailModel = this$0.getBaseAdapter().f10111OooOOoo.get(i);
                        if (momentCommentDetailModel != null && momentCommentDetailModel.isLocalMessageDiscolor()) {
                            momentCommentDetailModel.setLocalMessageDiscolor(false);
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    this$0.getBaseAdapter().notifyItemChanged(i + this$0.getBaseAdapter().OooOOO0());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this$0.commentMessageForPostListIndex = -1;
        }
    }

    private final void smoothScrollToPositionSendCommentIndex() {
        MomentCommentDetailModel postCommentDetailModel = getMomentVm().getPostCommentDetailModel();
        if ((postCommentDetailModel != null ? postCommentDetailModel.getId() : 0L) > 0) {
            int i = 0;
            if (TextUtils.isEmpty(this.commentId)) {
                getBinding().f58519OooO0O0.smoothScrollToPosition(getBaseAdapter().OooOOO0() + 0);
                return;
            }
            int size = getBaseAdapter().f10111OooOOoo.size();
            for (int i2 = 0; i2 < size; i2++) {
                MomentCommentDetailModel momentCommentDetailModel = getBaseAdapter().f10111OooOOoo.get(i2);
                if (momentCommentDetailModel != null) {
                    String str = this.commentId;
                    long id = momentCommentDetailModel.getId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    if (Intrinsics.areEqual(str, sb.toString())) {
                        i = i2;
                        break;
                    }
                }
            }
            this.commentId = "";
            getBinding().f58519OooO0O0.smoothScrollToPosition(getBaseAdapter().OooOOO0() + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toReplyComment$lambda$2(MomentDetailCommentFragment this$0, MomentCommentDetailModel postCommentDetailModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(postCommentDetailModel, "$postCommentDetailModel");
        this$0.replyComment(postCommentDetailModel);
    }

    public final void clearSendEdit() {
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        this.commentId = momentSendCommentModel != null ? momentSendCommentModel.getCid() : null;
        MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
        if (momentSendCommentModel2 != null) {
            momentSendCommentModel2.cleanComment();
        }
        MomentSendCommentModel momentSendCommentModel3 = this.mSendPostCommentModel;
        if (momentSendCommentModel3 != null) {
            momentSendCommentModel3.setContent(null);
        }
        FragmentActivity activity = getActivity();
        MomentDetailActivity momentDetailActivity = activity instanceof MomentDetailActivity ? (MomentDetailActivity) activity : null;
        MutableState<String> mutableState = momentDetailActivity != null ? momentDetailActivity.f26065OooOoO0 : null;
        if (mutableState != null) {
            mutableState.setValue(com.code.android.util.o0000.OooO0OO(oO00OOo0.please_chat_friendly));
        }
        LiveEventBus.get("MOMENT_POST_COMMENT").post(this.mPostDetailModel);
        showKeyboard(false);
    }

    public final void commentReplaceCid() {
        MomentSendCommentModel momentSendCommentModel;
        String dyid;
        if (this.mSendPostCommentModel == null) {
            return;
        }
        this.isCommentReplacePost = true;
        p487o0o00O0O.o00Ooo o00ooo2 = this.mMapListSendPostCommentModel;
        o00ooo2.OooO0O0();
        o00ooo2.OooO0O0();
        int size = o00ooo2.f44417OooO0O0.size();
        do {
            size--;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                o00ooo2.OooO0O0();
                momentSendCommentModel = (MomentSendCommentModel) o00ooo2.f44417OooO0O0.get(size);
            }
        } while (!TextUtils.isEmpty(momentSendCommentModel.getCid()));
        if (momentSendCommentModel == null) {
            MomentDetailModel momentDetailModel = this.mPostDetailModel;
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
            StringBuilder sb = new StringBuilder();
            sb.append(lValueOf);
            momentSendCommentModel = new MomentSendCommentModel(sb.toString());
        }
        MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
        if (momentSendCommentModel2 != null) {
            momentSendCommentModel2.setSendPostCommentModel(momentSendCommentModel);
        }
        long jOooO = 0;
        try {
            MomentSendCommentModel momentSendCommentModel3 = this.mSendPostCommentModel;
            if (momentSendCommentModel3 == null || (dyid = momentSendCommentModel3.getDyid()) == null) {
                dyid = "";
            }
            jOooO = com.code.android.util.o0OoOo0.OooO(0L, dyid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MomentSendCommentModel momentSendCommentModel4 = this.mSendPostCommentModel;
        if (momentSendCommentModel4 != null) {
            momentSendCommentModel4.setLocalId(jOooO);
        }
        recoverSendEdit();
    }

    public final void deleteComment(@NotNull String cid) {
        Intrinsics.checkNotNullParameter(cid, "cid");
        p377o0OOoOo.o000Oo0 o000oo1 = o000O0O0.f44227OooO0O0;
        MomentDetailModel momentDetailModel = this.mPostDetailModel;
        Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(lValueOf);
        String string = sb.toString();
        OooO0OO oooO0OO = new OooO0OO(cid);
        o000oo1.getClass();
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("dyid", string);
        linkedHashMapOooO00o.put("cid", cid);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44149o0000O0O, p377o0OOoOo.o0000O.f44146o0000O, linkedHashMapOooO00o, oooO0OO);
    }

    @Nullable
    public final MomentDetailModel getMPostDetailModel() {
        return this.mPostDetailModel;
    }

    public final int getMSortType() {
        return this.mSortType;
    }

    @NotNull
    public final MomentDetailActivityVM getMomentVm() {
        return (MomentDetailActivityVM) this.momentVm.getValue();
    }

    public final void hideComment(long momentId, long commentId) {
        oOO0Oo00.OooO00o(momentId, commentId);
        List<MomentCommentDetailModel> list = getBaseAdapter().f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "baseAdapter.data");
        Iterator<MomentCommentDetailModel> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else {
                if (it.next().getId() == commentId) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i >= 0) {
            getBaseAdapter().f10111OooOOoo.get(i).setHide(true);
            getBaseAdapter().notifyDataSetChanged();
        }
    }

    public final void initData() {
        if (this.isInitLoadData) {
            return;
        }
        loadData$default(this, true, false, false, 4, null);
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mPostDetailModel = (MomentDetailModel) (arguments != null ? arguments.getSerializable(POST_DETAIL_MODEL) : null);
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMomentVm().statisticalTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        p592o0oo00O.OooOOO0.OooO("PostDetailCommentFragment onViewCreated");
        init();
        initObserver();
        initData();
        getMomentVm().statisticalTime();
    }

    public final void replyComment(@NotNull MomentCommentDetailModel itemModel) {
        MomentSendCommentModel momentSendCommentModel;
        String cid;
        Intrinsics.checkNotNullParameter(itemModel, "itemModel");
        if (isDetached()) {
            return;
        }
        this.isCommentReplacePost = false;
        p487o0o00O0O.o00Ooo o00ooo2 = this.mMapListSendPostCommentModel;
        long id = itemModel.getId();
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        String string = sb.toString();
        o00ooo2.OooO0O0();
        o00ooo2.OooO0O0();
        int size = o00ooo2.f44417OooO0O0.size();
        do {
            size--;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                o00ooo2.OooO0O0();
                momentSendCommentModel = (MomentSendCommentModel) o00ooo2.f44417OooO0O0.get(size);
            }
        } while (!string.equals(momentSendCommentModel.getCid()));
        if (momentSendCommentModel == null) {
            MomentDetailModel momentDetailModel = this.mPostDetailModel;
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lValueOf);
            momentSendCommentModel = new MomentSendCommentModel(sb2.toString());
            momentSendCommentModel.setReply(oo0ooO.OooO00o(itemModel.getId()), com.code.android.util.o0OoOo0.OooOOO(itemModel.getUserid(), ""), com.code.android.util.o0OoOo0.OooOOO(itemModel.getNickname(), ""));
        }
        getMomentVm().setCurrentComment(itemModel);
        getMomentVm().setCurrentCommentId(Long.valueOf(itemModel.getId()));
        MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
        if (momentSendCommentModel2 != null) {
            momentSendCommentModel2.setSendPostCommentModel(momentSendCommentModel);
        }
        long jOooO = 0;
        try {
            MomentSendCommentModel momentSendCommentModel3 = this.mSendPostCommentModel;
            if (momentSendCommentModel3 == null || (cid = momentSendCommentModel3.getCid()) == null) {
                cid = "";
            }
            jOooO = com.code.android.util.o0OoOo0.OooO(0L, cid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MomentSendCommentModel momentSendCommentModel4 = this.mSendPostCommentModel;
        if (momentSendCommentModel4 != null) {
            momentSendCommentModel4.setLocalId(jOooO);
        }
        recoverSendEdit();
    }

    public final void reportComment(@Nullable String cid) {
        if (cid != null) {
            ReportScreen reportScreen = ReportScreen.INSTANCE;
            long jOooO = com.code.android.util.o0OoOo0.OooO(0L, cid);
            MomentDetailModel momentDetailModel = this.mPostDetailModel;
            oo0oOO0.OooO0o0(reportScreen, ReportScreen.bundleOf(5, jOooO, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : Long.valueOf(momentDetailModel != null ? momentDetailModel.getId() : 0L), (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
        }
    }

    public final void sendComment(@NotNull MomentSendContentModel formatContentForPost, @NotNull p534o0o0Oo00.OooOOOO controller) {
        Intrinsics.checkNotNullParameter(formatContentForPost, "formatContentForPost");
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (!getIsLazyInit() || this.mPostDetailModel == null) {
            return;
        }
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        if (momentSendCommentModel != null) {
            momentSendCommentModel.setContent(formatContentForPost);
        }
        MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
        p592o0oo00O.OooOOO0.OooO0oO("sendComment SendPostCommentModel = " + (momentSendCommentModel2 != null ? p140o00OOooo.OooOO0.OooO00o(momentSendCommentModel2) : null));
        p487o0o00O0O.o00oO0o.OooO00o(getBaseAdapter().f10111OooOOoo, this.mSendPostCommentModel, new Oooo0(controller));
        MomentSendCommentModel momentSendCommentModel3 = this.mSendPostCommentModel;
        p592o0oo00O.OooOOO0.OooO0O0("sendComment SendPostCommentModel = " + (momentSendCommentModel3 != null ? momentSendCommentModel3.toJSONString() : null));
    }

    public final void setCount(long count) {
        MomentDetailCommentHeaderView momentDetailCommentHeaderView = this.mPostDetailCommentHeaderView;
        if (momentDetailCommentHeaderView != null) {
            momentDetailCommentHeaderView.setCount(count);
        }
    }

    public final void setData(@Nullable MomentDetailModel postDetailModel) {
        p592o0oo00O.OooOOO0.OooO("PostDetailCommentFragment setData");
        this.mPostDetailModel = postDetailModel;
        if (this.mSendPostCommentModel == null) {
            Long lValueOf = postDetailModel != null ? Long.valueOf(postDetailModel.getId()) : null;
            StringBuilder sb = new StringBuilder();
            sb.append(lValueOf);
            this.mSendPostCommentModel = new MomentSendCommentModel(sb.toString());
        }
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        if (momentSendCommentModel == null) {
            return;
        }
        Long lValueOf2 = postDetailModel != null ? Long.valueOf(postDetailModel.getId()) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lValueOf2);
        momentSendCommentModel.setDyid(sb2.toString());
    }

    public final void setMPostDetailModel(@Nullable MomentDetailModel momentDetailModel) {
        this.mPostDetailModel = momentDetailModel;
    }

    public final void setMSortType(int i) {
        this.mSortType = i;
    }

    public final void setPostDetailModel(@Nullable MomentDetailModel postDetailModel) {
        this.mPostDetailModel = postDetailModel;
    }

    public final void showKeyboard(boolean show) {
        if (show) {
            LiveEventBus.get("POST_DETAIL_REFRESH_CLOSE_HEADER_OR_FOOTER").post(Boolean.TRUE);
        }
        LiveEventBus.get("POST_DETAIL_SHOW_KEYBOARD").post(Boolean.valueOf(show));
    }

    public final void tabRefreshData(boolean isMoveToListTop) {
        loadData$default(this, true, isMoveToListTop, false, 4, null);
    }

    public final void toApiSendData(@Nullable final MomentSendCommentModel sendPostCommentModel, final boolean isReplyComment, @NotNull final p534o0o0Oo00.OooOOOO controller) {
        final MomentDetailModel momentDetailModel;
        Intrinsics.checkNotNullParameter(controller, "controller");
        p592o0oo00O.OooOOO0.OooO0O0("toApiSendData \n SendPostCommentModel = " + sendPostCommentModel);
        if (sendPostCommentModel == null || (momentDetailModel = this.mPostDetailModel) == null) {
            return;
        }
        momentBuriedPoint(sendPostCommentModel, isReplyComment, momentDetailModel);
        p377o0OOoOo.o000Oo0 o000oo1 = o000O0O0.f44227OooO0O0;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$toApiSendData$1$1

            public static final class OooO00o {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ MomentDetailCommentFragment f28740OooO00o;

                public OooO00o(MomentDetailCommentFragment momentDetailCommentFragment) {
                    this.f28740OooO00o = momentDetailCommentFragment;
                }

                public final void OooO00o(@NotNull MomentCommentDetailModel data, int i) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    p592o0oo00O.OooOOO0.OooO0Oo("评论  删除评论 ");
                    MomentDetailCommentFragment momentDetailCommentFragment = this.f28740OooO00o;
                    momentDetailCommentFragment.getBaseAdapter().OooOOo(i);
                    LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                    momentDetailCommentFragment.getBinding().f58519OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
                    momentDetailCommentFragment.showHotOrNewHeaderView();
                }

                public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    p592o0oo00O.OooOOO0.OooO0Oo("回复 替换评论 \n position = " + i + "\n data = " + data);
                    MomentDetailCommentFragment momentDetailCommentFragment = this.f28740OooO00o;
                    momentDetailCommentFragment.getBaseAdapter().OooOo00(i, data);
                    LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                    momentDetailCommentFragment.getBinding().f58519OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
                }
            }

            public static final class OooO0O0 {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ MomentDetailCommentFragment f28741OooO00o;

                public OooO0O0(MomentDetailCommentFragment momentDetailCommentFragment) {
                    this.f28741OooO00o = momentDetailCommentFragment;
                }

                public final void OooO00o(@NotNull MomentCommentDetailModel data, int i) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    p592o0oo00O.OooOOO0.OooO0Oo("评论的回复 ");
                    MomentDetailCommentFragment momentDetailCommentFragment = this.f28741OooO00o;
                    momentDetailCommentFragment.getBaseAdapter().OooOo00(i, data);
                    LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                    momentDetailCommentFragment.getBinding().f58519OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
                }

                public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    p592o0oo00O.OooOOO0.OooO0Oo("回复评论 ");
                    MomentDetailCommentFragment momentDetailCommentFragment = this.f28741OooO00o;
                    momentDetailCommentFragment.getBaseAdapter().OooOo00(i, data);
                    LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                    momentDetailCommentFragment.getBinding().f58519OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
                }
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                p592o0oo00O.OooOOO0.OooO0Oo("toApiSendData onError \n code = " + code + "\n message = " + message);
                int i = 0;
                int iOooO0o = com.code.android.util.o0OoOo0.OooO0o(0, code);
                MomentDetailModel momentDetailModel2 = momentDetailModel;
                if (iOooO0o == 2095) {
                    LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(momentDetailModel2);
                } else if (iOooO0o == 4000) {
                    LiveEventBus.get("MOMENT_BY_USER_REMOVE").post(momentDetailModel2);
                }
                MomentDetailCommentFragment momentDetailCommentFragment = this.f28737OooO0o0;
                List<T> list = momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo;
                Intrinsics.checkNotNullExpressionValue(list, "baseAdapter.data");
                OooO00o listener = new OooO00o(momentDetailCommentFragment);
                Intrinsics.checkNotNullParameter(list, "list");
                Intrinsics.checkNotNullParameter(listener, "listener");
                MomentSendCommentModel momentSendCommentModel = sendPostCommentModel;
                if (momentSendCommentModel != null) {
                    MomentCommentDetailModel momentCommentDetailModel = null;
                    if (TextUtils.isEmpty(momentSendCommentModel.getParentUserId())) {
                        int size = list.size();
                        while (true) {
                            if (i >= size) {
                                i = -1;
                                break;
                            }
                            MomentCommentDetailModel momentCommentDetailModel2 = (MomentCommentDetailModel) list.get(i);
                            if (momentSendCommentModel.getLocalId() == momentCommentDetailModel2.getLocalId()) {
                                momentCommentDetailModel = momentCommentDetailModel2;
                                break;
                            }
                            i++;
                        }
                        p592o0oo00O.OooOOO0.OooO0O0("发送失败-评论：删除掉 removeCommentOrCommentReply \n i = " + i + "\n itemTemp = " + momentCommentDetailModel);
                        if (momentCommentDetailModel != null) {
                            listener.OooO00o(momentCommentDetailModel, i);
                        }
                    } else {
                        int size2 = list.size();
                        while (true) {
                            if (i >= size2) {
                                i = -1;
                                break;
                            }
                            MomentCommentDetailModel momentCommentDetailModel3 = (MomentCommentDetailModel) list.get(i);
                            if (Intrinsics.areEqual(momentSendCommentModel.getCid(), String.valueOf(momentCommentDetailModel3.getId()))) {
                                momentCommentDetailModel3.removeLocalSendingCommentReplyModel(momentSendCommentModel);
                                momentCommentDetailModel = momentCommentDetailModel3;
                                break;
                            }
                            i++;
                        }
                        p592o0oo00O.OooOOO0.OooO0O0("发送失败-回复：删除掉 removeCommentOrCommentReply \n i = " + i + "\n itemTemp = " + momentCommentDetailModel);
                        if (momentCommentDetailModel != null) {
                            listener.OooO0O0(momentCommentDetailModel, i);
                        }
                    }
                }
                p487o0o00O0O.o00Ooo o00ooo2 = momentDetailCommentFragment.mMapListSendPostCommentModel;
                o00ooo2.getClass();
                MomentSendCommentModel momentSendCommentModel2 = new MomentSendCommentModel(momentSendCommentModel.getDyid());
                momentSendCommentModel2.setSendPostCommentModel(momentSendCommentModel);
                o00ooo2.OooO0O0();
                int iOooO00o = o00ooo2.OooO00o(momentSendCommentModel2);
                if (iOooO00o != -1) {
                    o00ooo2.f44417OooO0O0.remove(iOooO00o);
                }
                o00ooo2.f44416OooO00o.put(Long.valueOf(momentSendCommentModel2.getLocalId()), momentSendCommentModel2);
                o00ooo2.f44417OooO0O0.add(momentSendCommentModel2);
                p592o0oo00O.OooOOO0.OooO0O0("mMapListSendPostCommentModel = " + momentDetailCommentFragment.mMapListSendPostCommentModel);
                MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
                if (mPostDetailModel != null) {
                    MomentDetailModel mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel();
                    mPostDetailModel.setCommentNum((mPostDetailModel2 != null ? mPostDetailModel2.getCommentNum() : 0L) - 1);
                }
                LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailCommentFragment.getMPostDetailModel());
                momentDetailCommentFragment.clearSendEdit();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                MomentCommentResultModel momentCommentResultModel;
                MomentCommentDetailModel momentCommentDetailModel;
                MomentReplyModel sonFirst;
                MomentCommentDetailModel momentCommentDetailModel2;
                Intrinsics.checkNotNullParameter(response, "response");
                AbsJavaBeanApiList absJavaBeanApiList = (AbsJavaBeanApiList) p579o0oOoo.oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApiList<MomentCommentResultModel>>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$toApiSendData$1$1$onFinish$result$1
                }.getType());
                MomentDetailCommentFragment momentDetailCommentFragment = this.f28737OooO0o0;
                p487o0o00O0O.o00Ooo o00ooo2 = momentDetailCommentFragment.mMapListSendPostCommentModel;
                o00ooo2.OooO0O0();
                MomentSendCommentModel momentSendCommentModel = sendPostCommentModel;
                int iOooO00o = o00ooo2.OooO00o(momentSendCommentModel);
                int i = -1;
                if (iOooO00o != -1) {
                    o00ooo2.f44417OooO0O0.remove(iOooO00o);
                    o00ooo2.f44416OooO00o.remove(Long.valueOf(momentSendCommentModel.getLocalId()));
                }
                p487o0o00O0O.o00Ooo o00ooo3 = momentDetailCommentFragment.mMapListSendPostCommentModel;
                StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o("toApiSendData onFinish\n response = ", response, "\n isReplyComment = ");
                sbOooO00o.append(isReplyComment);
                sbOooO00o.append("\n result = ");
                sbOooO00o.append(absJavaBeanApiList);
                sbOooO00o.append("\n mMapListSendPostCommentModel = ");
                sbOooO00o.append(o00ooo3);
                sbOooO00o.append("\n sendPostCommentModel = ");
                sbOooO00o.append(momentSendCommentModel);
                p592o0oo00O.OooOOO0.OooO0O0(sbOooO00o.toString());
                if (absJavaBeanApiList != null && (momentCommentResultModel = (MomentCommentResultModel) absJavaBeanApiList.data) != null) {
                    TextUtils.isEmpty(momentSendCommentModel.getCid());
                    MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
                    int i2 = 0;
                    if (mPostDetailModel != null) {
                        o0OO000.OooO0O0("106058", MapsKt.mapOf(o00OO.OooO0O0(mPostDetailModel, "discovery_id"), o0O00o0.OooO00o(mPostDetailModel, "video_id"), TuplesKt.to("rec_sessionid", mPostDetailModel.getSessionId())));
                    }
                    List<T> list = momentDetailCommentFragment.getBaseAdapter().f10111OooOOoo;
                    long cid = momentCommentResultModel.getCid();
                    OooO0O0 listener = new OooO0O0(momentDetailCommentFragment);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    if (list != 0) {
                        if (TextUtils.isEmpty(momentSendCommentModel.getParentUserId())) {
                            int size = list.size();
                            while (true) {
                                if (i2 >= size) {
                                    momentCommentDetailModel2 = null;
                                    break;
                                }
                                momentCommentDetailModel2 = (MomentCommentDetailModel) list.get(i2);
                                if (momentSendCommentModel.getLocalId() == momentCommentDetailModel2.getLocalId()) {
                                    momentCommentDetailModel2.setLocalSendingCommentModelId(cid);
                                    i = i2;
                                    break;
                                }
                                i2++;
                            }
                            p592o0oo00O.OooOOO0.OooO0O0("发送成功-评论：替换CommentId sendSuccess \n i = " + i + "\n itemTemp = " + momentCommentDetailModel2);
                            if (momentCommentDetailModel2 != null) {
                                listener.OooO0O0(momentCommentDetailModel2, i);
                            }
                        } else {
                            int size2 = list.size();
                            while (true) {
                                if (i2 >= size2) {
                                    momentCommentDetailModel = null;
                                    break;
                                }
                                momentCommentDetailModel = (MomentCommentDetailModel) list.get(i2);
                                if (Intrinsics.areEqual(momentSendCommentModel.getCid(), String.valueOf(momentCommentDetailModel.getId()))) {
                                    MomentReplyModel sonFirst2 = momentCommentDetailModel.getSonFirst();
                                    if ((sonFirst2 != null && sonFirst2.getId() == 0) && (sonFirst = momentCommentDetailModel.getSonFirst()) != null) {
                                        sonFirst.setId(cid);
                                    }
                                    i = i2;
                                    break;
                                }
                                i2++;
                            }
                            p592o0oo00O.OooOOO0.OooO0O0("发送成功-回复：替换CommentId sendSuccess \n i = " + i + "\n itemTemp = " + momentCommentDetailModel);
                            if (momentCommentDetailModel != null) {
                                listener.OooO00o(momentCommentDetailModel, i);
                            }
                        }
                    }
                }
                controller.OooO0O0();
                long jOooO = com.code.android.util.o0OoOo0.OooO(0L, momentSendCommentModel.getDyid());
                long jOooO2 = com.code.android.util.o0OoOo0.OooO(0L, momentSendCommentModel.getCid());
                HashMap<String, p534o0o0Oo00.o000oOoO> map = p402o0Oo0OOO.o000O.f44463OooO00o;
                p402o0Oo0OOO.o000O.OooO0OO(Long.valueOf(jOooO), Long.valueOf(jOooO2), null, 12);
                momentDetailCommentFragment.clearSendEdit();
            }
        };
        o000oo1.getClass();
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("dyid", sendPostCommentModel.getDyid());
        if (!TextUtils.isEmpty(sendPostCommentModel.getCid())) {
            linkedHashMapOooO00o.put("cid", sendPostCommentModel.getCid());
        }
        if (!p382o0OOoo0o.o00Ooo.OooO0o()) {
            linkedHashMapOooO00o.put("content", sendPostCommentModel.getContent().toJSONString());
            p592o0oo00O.OooOOO0.OooO0O0("commentWrite params  = " + linkedHashMapOooO00o);
        }
        linkedHashMapOooO00o.put("content", oO000Oo0.OooO0O0(sendPostCommentModel.getContent().toJSONString()).concat(""));
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(p377o0OOoOo.o0000O.f44149o0000O0O, p377o0OOoOo.o0000O.f44168o000OO, linkedHashMapOooO00o, oooO0O0);
    }

    public final void toReplyComment(@NotNull MomentCommentDetailModel postCommentDetailModel) {
        Intrinsics.checkNotNullParameter(postCommentDetailModel, "postCommentDetailModel");
        getBinding().f58519OooO0O0.postDelayed(new p022Oooo00O.OooOo(2, this, postCommentDetailModel), 200L);
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public o6 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o6 o6VarInflate = o6.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(o6VarInflate, "inflate(inflater, container, false)");
        return o6VarInflate;
    }
}
