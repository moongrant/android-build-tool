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
import com.yalla.yalla.ui.activity.message.o0oOO;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
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
import p039OoooOoo.o0oOOo;
import p405o0Oo0OOO.oOO0OO0O;
import p522o0o0O0oO.oO00000o;
import p522o0o0O0oO.oO000O0;
import p525o0o0OO0.oo0O;
import p527o0o0OO0o.o000O;
import p532o0o0OOo0.o00O00;
import p557o0oOOooO.oOo00ooO;
import p590o0oOooo0.oOO0OOO;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001{B\u0007¢\u0006\u0004\bx\u0010yJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0016\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001bJ\u0016\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"J \u0010(\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"J\u0006\u0010)\u001a\u00020\nJ\u0016\u0010,\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010J\u000e\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-J\u0010\u00100\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-J\u000e\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0017J\u0006\u00103\u001a\u00020\nJ\b\u00104\u001a\u00020\nH\u0002J\b\u00105\u001a\u00020\nH\u0002J\"\u00108\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00172\b\b\u0002\u00107\u001a\u00020\u0017H\u0002J \u0010<\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010;2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u000109H\u0002J\b\u0010=\u001a\u00020\nH\u0002J\b\u0010>\u001a\u00020\nH\u0002J\u0012\u0010A\u001a\u00020 2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002J \u0010C\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\u0013H\u0002J\b\u0010D\u001a\u00020\nH\u0002J\b\u0010E\u001a\u00020\nH\u0002R$\u0010F\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR!\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001b0S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\\R\u0018\u0010+\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010]R\u001b\u0010b\u001a\u00020^8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010U\u001a\u0004\b`\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\"\u0010f\u001a\u00020Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010[\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020Y8\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010[R\u0016\u0010l\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010U\u001a\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010mR\u0016\u0010t\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010mR\u0016\u0010u\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010mR\u0016\u0010v\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010mR\u0016\u0010w\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010[¨\u0006|"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oOO0OO0O;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "", "count", "setCount", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "postDetailModel", "setData", "setPostDetailModel", "", "show", "showKeyboard", "commentReplaceCid", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "itemModel", "replyComment", "postCommentDetailModel", "toReplyComment", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "formatContentForPost", "Lo0o0O0oO/oO00000o;", "controller", "sendComment", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", "sendPostCommentModel", "isReplyComment", "toApiSendData", "clearSendEdit", "momentId", "commentId", "hideComment", "", "cid", "deleteComment", "reportComment", "isMoveToListTop", "tabRefreshData", "initData", "initObserver", "init", "isRefresh", "showLoading", "loadData", "", "list", "", "convertCommentMessageIndexColor", "smoothScrollToPositionCommentMessageIndex", "smoothScrollToPositionSendCommentIndex", "Lcom/yalla/yalla/ui/view/editTextSpan/EditTextSpan;", "editContentInput", "getSendPostModelContent", "it", "momentBuriedPoint", "recoverSendEdit", "showHotOrNewHeaderView", "mPostDetailModel", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "getMPostDetailModel", "()Lcom/yalla/yalla/model/moment/MomentDetailModel;", "setMPostDetailModel", "(Lcom/yalla/yalla/model/moment/MomentDetailModel;)V", "mSendPostCommentModel", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", "Lo0o00OOO/OooOo00;", "mMapListSendPostCommentModel", "Lo0o00OOO/OooOo00;", "dateSort", "J", "Lo0oOoO0/o0000oo;", "baseAdapter$delegate", "Lkotlin/Lazy;", "getBaseAdapter", "()Lo0oOoO0/o0000oo;", "baseAdapter", "", "pageIndex", "I", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "Ljava/lang/String;", "Lcom/yalla/yalla/ui/vm/moment/MomentDetailActivityVM;", "momentVm$delegate", "getMomentVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentDetailActivityVM;", "momentVm", "Lcom/yalla/yalla/ui/view/moment/MomentDetailCommentHeaderView;", "mPostDetailCommentHeaderView", "Lcom/yalla/yalla/ui/view/moment/MomentDetailCommentHeaderView;", "mSortType", "getMSortType", "()I", "setMSortType", "(I)V", "delayMillsCommentMessageChangeColor", "isCommentReplacePost", "Z", "Lcom/yalla/yalla/ui/view/EmptyView;", "emptyView$delegate", "getEmptyView", "()Lcom/yalla/yalla/ui/view/EmptyView;", "emptyView", "mIsRefresh", "mIsSuccess", "mIsNoMoreData", "isInitLoadData", "commentMessageForPostListIndex", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentDetailCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,809:1\n172#2,9:810\n350#3,7:819\n350#3,7:826\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment\n*L\n95#1:810,9\n728#1:819,7\n149#1:826,7\n*E\n"})
public final class MomentDetailCommentFragment extends o000O<oOO0OO0O> {
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
    private final p493o0o00OOO.OooOo00 mMapListSendPostCommentModel = new p493o0o00OOO.OooOo00();

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter = LazyKt.lazy(new OooO0O0());
    private int pageIndex = 1;

    /* JADX INFO: renamed from: momentVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy momentVm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentDetailActivityVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$special$$inlined$activityViewModels$default$1
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
        public final /* synthetic */ Function0 f28204OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28204OooO0Oo;
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

    public static final class OooO0O0 extends Lambda implements Function0<o00000> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000 invoke() {
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            return new o00000(momentDetailCommentFragment, momentDetailCommentFragment.getContext(), p562o0oOo000.oo0o0Oo.item_moment_detail_comment);
        }
    }

    public static final class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f28191OooO0o;

        public OooO0OO(String str) {
            this.f28191OooO0o = str;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            p598o0oo00Oo.o0000O00.OooO0O0("response = " + response);
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
            if (mPostDetailModel != null) {
                MomentDetailModel mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel();
                mPostDetailModel.setCommentNum((mPostDetailModel2 != null ? mPostDetailModel2.getCommentNum() : 0L) - 1);
            }
            int size = momentDetailCommentFragment.getBaseAdapter().f13189OooOOoo.size();
            for (int i = 0; i < size; i++) {
                MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) momentDetailCommentFragment.getBaseAdapter().f13189OooOOoo.get(i);
                Intrinsics.checkNotNull(momentCommentDetailModel);
                long id = momentCommentDetailModel.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(id);
                if (Intrinsics.areEqual(this.f28191OooO0o, sb.toString())) {
                    momentDetailCommentFragment.getBaseAdapter().OooOOo(i);
                    break;
                }
            }
            if (momentDetailCommentFragment.getBaseAdapter().f13189OooOOoo.isEmpty()) {
                momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                momentDetailCommentFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailCommentFragment.getBinding().f45113OooO0Oo.OooO0Oo();
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
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            EmptyView emptyView = new EmptyView(contextRequireContext, null, 6, 0);
            emptyView.setImage(Integer.valueOf(p562o0oOo000.o0Oo0oo.icon_no_list_comment));
            emptyView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.No_comments_yet));
            EmptyView.OooO00o(emptyView, new o00000O0(momentDetailCommentFragment));
            return emptyView;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<List<MomentCommentDetailModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f28195OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f28196OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f28197OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, boolean z, boolean z2) {
            super(1);
            this.f28196OooO0o0 = j;
            this.f28195OooO0o = z;
            this.f28197OooO0oO = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MomentCommentDetailModel> list) {
            List<MomentCommentDetailModel> list2 = list;
            final MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            if (list2 != null) {
                momentDetailCommentFragment.getMomentVm().fixCommentHideState(list2, Long.valueOf(this.f28196OooO0o0));
                if (this.f28195OooO0o) {
                    momentDetailCommentFragment.getBaseAdapter().OooOoO0(momentDetailCommentFragment.convertCommentMessageIndexColor(list2));
                    momentDetailCommentFragment.showHotOrNewHeaderView();
                    momentDetailCommentFragment.getBinding().f45111OooO0O0.postDelayed(new Runnable() { // from class: o0o0OOO.oOO00O
                        @Override // java.lang.Runnable
                        public final void run() {
                            MomentDetailCommentFragment this$0 = momentDetailCommentFragment;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.smoothScrollToPositionCommentMessageIndex();
                        }
                    }, 300L);
                    if (this.f28197OooO0oO) {
                        momentDetailCommentFragment.getBinding().f45111OooO0O0.scrollToPosition(0);
                    }
                } else {
                    momentDetailCommentFragment.getBaseAdapter().OooO0O0(list2);
                }
            }
            momentDetailCommentFragment.pageIndex++;
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f28198OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j) {
            super(1);
            this.f28198OooO0Oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int code = it.getCode();
            long j = this.f28198OooO0Oo;
            if (code == 2095) {
                LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Long.valueOf(j));
            } else if (code == 4000) {
                LiveEventBus.get("MOMENT_BY_USER_REMOVE").post(Long.valueOf(j));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements p493o0o00OOO.OooOo {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ oO00000o f28200OooO0O0;

        public OooOOO(oO00000o oo00000o) {
            this.f28200OooO0O0 = oo00000o;
        }

        @Override // p493o0o00OOO.OooOo
        public final void OooO00o(@NotNull MomentCommentDetailModel data) {
            Intrinsics.checkNotNullParameter(data, "data");
            p598o0oo00Oo.o0000O00.OooO0Oo("添加评论 data =".concat(p187o00o00o0.OooO.OooO00o(data)));
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            momentDetailCommentFragment.getBaseAdapter().OooO00o(data);
            momentDetailCommentFragment.getBinding().f45111OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + 0);
            if (momentDetailCommentFragment.getBaseAdapter().f13189OooOOoo.isEmpty()) {
                momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                momentDetailCommentFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailCommentFragment.getBinding().f45113OooO0Oo.OooO0Oo();
            MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
            if (mPostDetailModel != null) {
                MomentDetailModel mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel();
                mPostDetailModel.setCommentNum((mPostDetailModel2 != null ? mPostDetailModel2.getCommentNum() : 0L) + 1);
            }
            LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailCommentFragment.getMPostDetailModel());
            momentDetailCommentFragment.toApiSendData(momentDetailCommentFragment.mSendPostCommentModel, false, this.f28200OooO0O0);
            FragmentActivity activity = momentDetailCommentFragment.getActivity();
            MomentDetailActivity momentDetailActivity = activity instanceof MomentDetailActivity ? (MomentDetailActivity) activity : null;
            MutableState<String> mutableState = momentDetailActivity != null ? momentDetailActivity.f25616OooOoO0 : null;
            if (mutableState != null) {
                mutableState.setValue(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.please_chat_friendly));
            }
            momentDetailCommentFragment.showHotOrNewHeaderView();
        }

        @Override // p493o0o00OOO.OooOo
        public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
            Intrinsics.checkNotNullParameter(data, "data");
            p598o0oo00Oo.o0000O00.OooO0Oo("回复评论 data = ".concat(p187o00o00o0.OooO.OooO00o(data)));
            MomentDetailCommentFragment momentDetailCommentFragment = MomentDetailCommentFragment.this;
            momentDetailCommentFragment.getBaseAdapter().OooOo00(i, data);
            momentDetailCommentFragment.getBinding().f45111OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
            if (momentDetailCommentFragment.getBaseAdapter().f13189OooOOoo.isEmpty()) {
                momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                momentDetailCommentFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailCommentFragment.getBinding().f45113OooO0Oo.OooO0Oo();
            MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
            if (mPostDetailModel != null) {
                MomentDetailModel mPostDetailModel2 = momentDetailCommentFragment.getMPostDetailModel();
                mPostDetailModel.setCommentNum((mPostDetailModel2 != null ? mPostDetailModel2.getCommentNum() : 0L) + 1);
            }
            LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailCommentFragment.getMPostDetailModel());
            momentDetailCommentFragment.toApiSendData(momentDetailCommentFragment.mSendPostCommentModel, true, this.f28200OooO0O0);
            FragmentActivity activity = momentDetailCommentFragment.getActivity();
            MomentDetailActivity momentDetailActivity = activity instanceof MomentDetailActivity ? (MomentDetailActivity) activity : null;
            MutableState<String> mutableState = momentDetailActivity != null ? momentDetailActivity.f25616OooOoO0 : null;
            if (mutableState == null) {
                return;
            }
            mutableState.setValue(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.please_chat_friendly));
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<ApiResult<List<MomentCommentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28202OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(boolean z) {
            super(1);
            this.f28202OooO0o0 = z;
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
            momentDetailCommentFragment.mIsRefresh = this.f28202OooO0o0;
            momentDetailCommentFragment.mIsSuccess = result.isSuccess();
            List<MomentCommentDetailModel> data = result.getData();
            momentDetailCommentFragment.mIsNoMoreData = data == null || data.isEmpty();
            LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").post(Boolean.TRUE);
            if (momentDetailCommentFragment.getBaseAdapter().f13189OooOOoo.isEmpty()) {
                if (result.isSuccess()) {
                    momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                } else {
                    momentDetailCommentFragment.getEmptyView().OooO0O0(EmptyView.State.DataError);
                }
                momentDetailCommentFragment.getBaseAdapter().OooOoOO(true);
            }
            momentDetailCommentFragment.getBinding().f45113OooO0Oo.OooO0Oo();
            momentDetailCommentFragment.getBaseAdapter().Oooo0(Boolean.valueOf(momentDetailCommentFragment.mIsRefresh), Boolean.valueOf(momentDetailCommentFragment.mIsSuccess), Boolean.valueOf(momentDetailCommentFragment.mIsNoMoreData));
            momentDetailCommentFragment.getBinding().f45112OooO0OO.OooOoOO(momentDetailCommentFragment.mIsRefresh, momentDetailCommentFragment.mIsSuccess, momentDetailCommentFragment.mIsNoMoreData);
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
    public final p571o0oOoO0.o0000oo<MomentCommentDetailModel> getBaseAdapter() {
        return (p571o0oOoO0.o0000oo) this.baseAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyView getEmptyView() {
        return (EmptyView) this.emptyView.getValue();
    }

    private final MomentSendContentModel getSendPostModelContent(EditTextSpan editContentInput) {
        if (editContentInput == null) {
            return new MomentSendContentModel("");
        }
        String strOooO00o = p599o0oo00o.o00O0O.OooO00o(getActivity(), editContentInput);
        Intrinsics.checkNotNullExpressionValue(strOooO00o, "getAtUserToAtNum(...)");
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(strOooO00o);
        ArrayList<? extends oOo00ooO> arrayListOooO0O0 = editContentInput.getSpanManager().OooO0O0("@");
        Intrinsics.checkNotNull(arrayListOooO0O0, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
        int size = arrayListOooO0O0.size();
        for (int i = 0; i < size; i++) {
            oOo00ooO ooo00ooo = arrayListOooO0O0.get(i);
            Intrinsics.checkNotNull(ooo00ooo, "null cannot be cast to non-null type com.yalla.yalla.ui.view.editTextSpan.EditTextSpanItem");
            oOo00ooO ooo00ooo2 = ooo00ooo;
            List<MomentSendContentAtModel> at = momentSendContentModel.getAt();
            String strOooO00o2 = androidx.media3.session.o0000O00.OooO00o(ooo00ooo2.f56182OooO0o0);
            String str = ooo00ooo2.f56180OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(str, "getText(...)");
            at.add(new MomentSendContentAtModel(strOooO00o2, str));
        }
        return momentSendContentModel;
    }

    private final void init() {
        this.mSendPostCommentModel = new MomentSendCommentModel(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        getBinding().f45111OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f45111OooO0O0.setAdapter(getBaseAdapter());
        getBaseAdapter().OooOo0(getEmptyView());
        int i = 0;
        getBinding().f45112OooO0OO.f20857OooOooO = false;
        getBinding().f45112OooO0OO.OooOo00(true);
        getBinding().f45112OooO0OO.OooOoo0(new p289o0O0Oo0.o000O0Oo(this));
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
    public static final void init$lambda$7(MomentDetailCommentFragment this$0, o0OO0oO0.OooOOO0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        loadData$default(this$0, false, false, false, 4, null);
    }

    private final void initObserver() {
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_ADD").observe(this, new p491o0o00O0o.o0000Ooo(this, 2));
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_DEL").observe(this, new Observer() { // from class: o0o0OOO.o00O000o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MomentDetailCommentFragment.initObserver$lambda$1(this.f53360OooO0Oo, obj);
            }
        });
        LiveEventBus.get("DISLIKE_COMMENT").observe(this, new oo0O(this, 1));
        LiveEventBus.get("DISLIKE_REPLY").observe(this, new Observer() { // from class: o0o0OOO.o00O00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MomentDetailCommentFragment.initObserver$lambda$4(this.f53357OooO0Oo, obj);
            }
        });
        LiveEventBus.get("MomentCommentSon_Data", MomentReplyModel.class).observe(this, new Observer() { // from class: o0o0OOO.o00O00O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MomentDetailCommentFragment.initObserver$lambda$6(this.f53361OooO0Oo, (MomentReplyModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$0(MomentDetailCommentFragment this$0, Object result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (((Boolean) result).booleanValue()) {
            loadData$default(this$0, true, false, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$1(MomentDetailCommentFragment this$0, Object result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (((Boolean) result).booleanValue()) {
            loadData$default(this$0, true, false, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$2(MomentDetailCommentFragment this$0, Object result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        Pair pair = (Pair) result;
        this$0.hideComment(((Number) pair.component1()).longValue(), ((Number) pair.component2()).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$4(MomentDetailCommentFragment this$0, Object obj) {
        MomentReplyModel sonFirst;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Triple<kotlin.Long, kotlin.Long, kotlin.Long>");
        Triple triple = (Triple) obj;
        long jLongValue = ((Number) triple.component1()).longValue();
        long jLongValue2 = ((Number) triple.component2()).longValue();
        long jLongValue3 = ((Number) triple.component3()).longValue();
        MomentDetailModel momentDetailModel = this$0.mPostDetailModel;
        if (momentDetailModel == null || jLongValue != momentDetailModel.getId()) {
            return;
        }
        List<MomentCommentDetailModel> list = this$0.getBaseAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        Iterator<MomentCommentDetailModel> it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else {
                if (it.next().getId() == jLongValue2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i < 0) {
            return;
        }
        MomentCommentDetailModel momentCommentDetailModel = this$0.getBaseAdapter().f13189OooOOoo.get(i);
        MomentReplyModel sonFirst2 = momentCommentDetailModel.getSonFirst();
        if (sonFirst2 != null && sonFirst2.getId() == jLongValue3) {
            z = true;
        }
        if (z && (sonFirst = momentCommentDetailModel.getSonFirst()) != null) {
            sonFirst.setHide(true);
        }
        this$0.getBaseAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$6(MomentDetailCommentFragment this$0, MomentReplyModel momentReplyModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int size = this$0.getBaseAdapter().f13189OooOOoo.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            MomentCommentDetailModel momentCommentDetailModel = this$0.getBaseAdapter().f13189OooOOoo.get(i2);
            if (momentCommentDetailModel != null && i == -1 && momentCommentDetailModel.getId() == momentReplyModel.getLocalCommentId()) {
                momentCommentDetailModel.setSonFirst(momentReplyModel);
                i = i2;
            }
        }
        if (i > -1) {
            this$0.getBaseAdapter().notifyItemChanged(this$0.getBaseAdapter().OooOOO0() + i);
        }
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
                    getBinding().f45113OooO0Oo.OooO0oo();
                }
            }
            getMomentVm().momentCommentList(id, this.mSortType, this.dateSort, this.pageIndex).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooOO0(id, isRefresh, isMoveToListTop), new OooOO0O(id), new OooOOO0(isRefresh), false));
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
                WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
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
            WebEventRepository webEventRepository2 = WebEventRepository.f24430OooO00o;
            MomentLogActionType momentLogActionType2 = MomentLogActionType.comment_reply;
            String json2 = momentLogActionTypeCommentReply.toJson();
            String sessionId2 = it.getSessionId();
            webEventRepository2.getClass();
            WebEventRepository.OooO0o0(momentLogActionType2, json2, sessionId2);
        }
    }

    private final void recoverSendEdit() {
        MutableState<String> mutableState;
        p598o0oo00Oo.o0000O00.OooO0O0("recoverSendEdit \n mSendPostCommentModel = " + this.mSendPostCommentModel);
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        if (momentSendCommentModel != null) {
            if (TextUtils.isEmpty(momentSendCommentModel.getCid())) {
                FragmentActivity activity = getActivity();
                MomentDetailActivity momentDetailActivity = activity instanceof MomentDetailActivity ? (MomentDetailActivity) activity : null;
                mutableState = momentDetailActivity != null ? momentDetailActivity.f25616OooOoO0 : null;
                if (mutableState != null) {
                    mutableState.setValue(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.please_chat_friendly));
                }
            } else {
                String parentUserId = momentSendCommentModel.getParentUserId();
                long jOooO = parentUserId != null ? com.code.android.util.o0OoOo0.OooO(0L, parentUserId) : 0L;
                String parentUserName = momentSendCommentModel.getParentUserName();
                if (parentUserName == null) {
                    parentUserName = "";
                }
                String strOooO0O0 = p412o0Oo0o0O.o000O000.OooO0O0(jOooO, parentUserName);
                FragmentActivity activity2 = getActivity();
                MomentDetailActivity momentDetailActivity2 = activity2 instanceof MomentDetailActivity ? (MomentDetailActivity) activity2 : null;
                mutableState = momentDetailActivity2 != null ? momentDetailActivity2.f25616OooOoO0 : null;
                if (mutableState != null) {
                    mutableState.setValue(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Reply_xxx), strOooO0O0));
                }
            }
            this.commentId = momentSendCommentModel.getCid();
        }
        showKeyboard(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHotOrNewHeaderView() {
        List<MomentCommentDetailModel> list = getBaseAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
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
        getBinding().f45111OooO0O0.smoothScrollToPosition(getBaseAdapter().OooOOO0() + this.commentMessageForPostListIndex);
        getBinding().f45111OooO0O0.postDelayed(new com.facebook.internal.OooOO0(this, 2), this.delayMillsCommentMessageChangeColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void smoothScrollToPositionCommentMessageIndex$lambda$13(MomentDetailCommentFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDetached()) {
            return;
        }
        try {
            try {
                int size = this$0.getBaseAdapter().f13189OooOOoo.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        MomentCommentDetailModel momentCommentDetailModel = this$0.getBaseAdapter().f13189OooOOoo.get(i);
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
                getBinding().f45111OooO0O0.smoothScrollToPosition(getBaseAdapter().OooOOO0() + 0);
                return;
            }
            int size = getBaseAdapter().f13189OooOOoo.size();
            for (int i2 = 0; i2 < size; i2++) {
                MomentCommentDetailModel momentCommentDetailModel = getBaseAdapter().f13189OooOOoo.get(i2);
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
            getBinding().f45111OooO0O0.smoothScrollToPosition(getBaseAdapter().OooOOO0() + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toReplyComment$lambda$9(MomentDetailCommentFragment this$0, MomentCommentDetailModel postCommentDetailModel) {
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
        MutableState<String> mutableState = momentDetailActivity != null ? momentDetailActivity.f25616OooOoO0 : null;
        if (mutableState != null) {
            mutableState.setValue(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.please_chat_friendly));
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
        p493o0o00OOO.OooOo00 oooOo00 = this.mMapListSendPostCommentModel;
        oooOo00.OooO0O0();
        oooOo00.OooO0O0();
        int size = oooOo00.f43647OooO0O0.size();
        do {
            size--;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                oooOo00.OooO0O0();
                momentSendCommentModel = (MomentSendCommentModel) oooOo00.f43647OooO0O0.get(size);
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
        p384o0OOoo0O.o00Ooo o00ooo2 = p384o0OOoo0O.o0OO00O.f43463OooO0O0;
        MomentDetailModel momentDetailModel = this.mPostDetailModel;
        Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(lValueOf);
        String string = sb.toString();
        OooO0OO oooO0OO = new OooO0OO(cid);
        o00ooo2.getClass();
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("dyid", string);
        linkedHashMapOooO00o.put("cid", cid);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43408o0000O0O, p384o0OOoo0O.Oooo0.f43405o0000O, linkedHashMapOooO00o, oooO0OO);
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
        p412o0Oo0o0O.o000O00O.OooO00o(momentId, commentId);
        List<MomentCommentDetailModel> list = getBaseAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
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
            getBaseAdapter().f13189OooOOoo.get(i).setHide(true);
            getBaseAdapter().notifyDataSetChanged();
        }
    }

    public final void initData() {
        if (this.isInitLoadData) {
            return;
        }
        loadData$default(this, true, false, false, 4, null);
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mPostDetailModel = (MomentDetailModel) (arguments != null ? arguments.getSerializable(POST_DETAIL_MODEL) : null);
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMomentVm().statisticalTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        p598o0oo00Oo.o0000O00.OooO("PostDetailCommentFragment onViewCreated");
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
        p493o0o00OOO.OooOo00 oooOo00 = this.mMapListSendPostCommentModel;
        long id = itemModel.getId();
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        String string = sb.toString();
        oooOo00.OooO0O0();
        oooOo00.OooO0O0();
        int size = oooOo00.f43647OooO0O0.size();
        do {
            size--;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                oooOo00.OooO0O0();
                momentSendCommentModel = (MomentSendCommentModel) oooOo00.f43647OooO0O0.get(size);
            }
        } while (!string.equals(momentSendCommentModel.getCid()));
        if (momentSendCommentModel == null) {
            MomentDetailModel momentDetailModel = this.mPostDetailModel;
            Long lValueOf = momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lValueOf);
            momentSendCommentModel = new MomentSendCommentModel(sb2.toString());
            momentSendCommentModel.setReply(androidx.media3.session.o0000O00.OooO00o(itemModel.getId()), com.code.android.util.o0OoOo0.OooOOO(itemModel.getUserid(), ""), com.code.android.util.o0OoOo0.OooOOO(itemModel.getNickname(), ""));
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
            o00O00.OooO0o0(reportScreen, ReportScreen.bundleOf(5, jOooO, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : Long.valueOf(momentDetailModel != null ? momentDetailModel.getId() : 0L), (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
        }
    }

    public final void sendComment(@NotNull MomentSendContentModel formatContentForPost, @NotNull oO00000o controller) {
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
        p598o0oo00Oo.o0000O00.OooO0oO("sendComment SendPostCommentModel = " + (momentSendCommentModel2 != null ? p187o00o00o0.OooO.OooO00o(momentSendCommentModel2) : null));
        p493o0o00OOO.Oooo000.OooO00o(getBaseAdapter().f13189OooOOoo, this.mSendPostCommentModel, new OooOOO(controller));
        MomentSendCommentModel momentSendCommentModel3 = this.mSendPostCommentModel;
        p598o0oo00Oo.o0000O00.OooO0O0("sendComment SendPostCommentModel = " + (momentSendCommentModel3 != null ? momentSendCommentModel3.toJSONString() : null));
    }

    public final void setCount(long count) {
        MomentDetailCommentHeaderView momentDetailCommentHeaderView = this.mPostDetailCommentHeaderView;
        if (momentDetailCommentHeaderView != null) {
            momentDetailCommentHeaderView.setCount(count);
        }
    }

    public final void setData(@Nullable MomentDetailModel postDetailModel) {
        p598o0oo00Oo.o0000O00.OooO("PostDetailCommentFragment setData");
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

    public final void toApiSendData(@Nullable final MomentSendCommentModel sendPostCommentModel, final boolean isReplyComment, @NotNull final oO00000o controller) {
        final MomentDetailModel momentDetailModel;
        Intrinsics.checkNotNullParameter(controller, "controller");
        p598o0oo00Oo.o0000O00.OooO0O0("toApiSendData \n SendPostCommentModel = " + sendPostCommentModel);
        if (sendPostCommentModel == null || (momentDetailModel = this.mPostDetailModel) == null) {
            return;
        }
        momentBuriedPoint(sendPostCommentModel, isReplyComment, momentDetailModel);
        p384o0OOoo0O.o00Ooo o00ooo2 = p384o0OOoo0O.o0OO00O.f43463OooO0O0;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$toApiSendData$1$1

            public static final class OooO00o {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ MomentDetailCommentFragment f28212OooO00o;

                public OooO00o(MomentDetailCommentFragment momentDetailCommentFragment) {
                    this.f28212OooO00o = momentDetailCommentFragment;
                }

                public final void OooO00o(@NotNull MomentCommentDetailModel data, int i) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    p598o0oo00Oo.o0000O00.OooO0Oo("评论  删除评论 ");
                    MomentDetailCommentFragment momentDetailCommentFragment = this.f28212OooO00o;
                    momentDetailCommentFragment.getBaseAdapter().OooOOo(i);
                    LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                    momentDetailCommentFragment.getBinding().f45111OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
                    momentDetailCommentFragment.showHotOrNewHeaderView();
                }

                public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    p598o0oo00Oo.o0000O00.OooO0Oo("回复 替换评论 \n position = " + i + "\n data = " + data);
                    MomentDetailCommentFragment momentDetailCommentFragment = this.f28212OooO00o;
                    momentDetailCommentFragment.getBaseAdapter().OooOo00(i, data);
                    LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                    momentDetailCommentFragment.getBinding().f45111OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
                }
            }

            public static final class OooO0O0 {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ MomentDetailCommentFragment f28213OooO00o;

                public OooO0O0(MomentDetailCommentFragment momentDetailCommentFragment) {
                    this.f28213OooO00o = momentDetailCommentFragment;
                }

                public final void OooO00o(@NotNull MomentCommentDetailModel data, int i) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    p598o0oo00Oo.o0000O00.OooO0Oo("评论的回复 ");
                    MomentDetailCommentFragment momentDetailCommentFragment = this.f28213OooO00o;
                    momentDetailCommentFragment.getBaseAdapter().OooOo00(i, data);
                    LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                    momentDetailCommentFragment.getBinding().f45111OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
                }

                public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
                    Intrinsics.checkNotNullParameter(data, "data");
                    p598o0oo00Oo.o0000O00.OooO0Oo("回复评论 ");
                    MomentDetailCommentFragment momentDetailCommentFragment = this.f28213OooO00o;
                    momentDetailCommentFragment.getBaseAdapter().OooOo00(i, data);
                    LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                    momentDetailCommentFragment.getBinding().f45111OooO0O0.smoothScrollToPosition(momentDetailCommentFragment.getBaseAdapter().OooOOO0() + i);
                }
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                p598o0oo00Oo.o0000O00.OooO0Oo("toApiSendData onError \n code = " + code + "\n message = " + message);
                int i = 0;
                int iOooO0o = com.code.android.util.o0OoOo0.OooO0o(0, code);
                MomentDetailModel momentDetailModel2 = momentDetailModel;
                if (iOooO0o == 2095) {
                    LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(momentDetailModel2);
                } else if (iOooO0o == 4000) {
                    LiveEventBus.get("MOMENT_BY_USER_REMOVE").post(momentDetailModel2);
                }
                MomentDetailCommentFragment momentDetailCommentFragment = this.f28209OooO0o0;
                List<T> list = momentDetailCommentFragment.getBaseAdapter().f13189OooOOoo;
                Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
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
                        p598o0oo00Oo.o0000O00.OooO0O0("发送失败-评论：删除掉 removeCommentOrCommentReply \n i = " + i + "\n itemTemp = " + momentCommentDetailModel);
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
                        p598o0oo00Oo.o0000O00.OooO0O0("发送失败-回复：删除掉 removeCommentOrCommentReply \n i = " + i + "\n itemTemp = " + momentCommentDetailModel);
                        if (momentCommentDetailModel != null) {
                            listener.OooO0O0(momentCommentDetailModel, i);
                        }
                    }
                }
                p493o0o00OOO.OooOo00 oooOo00 = momentDetailCommentFragment.mMapListSendPostCommentModel;
                oooOo00.getClass();
                MomentSendCommentModel momentSendCommentModel2 = new MomentSendCommentModel(momentSendCommentModel.getDyid());
                momentSendCommentModel2.setSendPostCommentModel(momentSendCommentModel);
                oooOo00.OooO0O0();
                int iOooO00o = oooOo00.OooO00o(momentSendCommentModel2);
                if (iOooO00o != -1) {
                    oooOo00.f43647OooO0O0.remove(iOooO00o);
                }
                oooOo00.f43646OooO00o.put(Long.valueOf(momentSendCommentModel2.getLocalId()), momentSendCommentModel2);
                oooOo00.f43647OooO0O0.add(momentSendCommentModel2);
                p598o0oo00Oo.o0000O00.OooO0O0("mMapListSendPostCommentModel = " + momentDetailCommentFragment.mMapListSendPostCommentModel);
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
                AbsJavaBeanApiList absJavaBeanApiList = (AbsJavaBeanApiList) oOOO00.OooO0O0(response, new TypeToken<AbsJavaBeanApiList<MomentCommentResultModel>>() { // from class: com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment$toApiSendData$1$1$onFinish$result$1
                }.getType());
                MomentDetailCommentFragment momentDetailCommentFragment = this.f28209OooO0o0;
                p493o0o00OOO.OooOo00 oooOo00 = momentDetailCommentFragment.mMapListSendPostCommentModel;
                oooOo00.OooO0O0();
                MomentSendCommentModel momentSendCommentModel = sendPostCommentModel;
                int iOooO00o = oooOo00.OooO00o(momentSendCommentModel);
                int i = -1;
                if (iOooO00o != -1) {
                    oooOo00.f43647OooO0O0.remove(iOooO00o);
                    oooOo00.f43646OooO00o.remove(Long.valueOf(momentSendCommentModel.getLocalId()));
                }
                p493o0o00OOO.OooOo00 oooOo01 = momentDetailCommentFragment.mMapListSendPostCommentModel;
                StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("toApiSendData onFinish\n response = ", response, "\n isReplyComment = ");
                sbOooO0O0.append(isReplyComment);
                sbOooO0O0.append("\n result = ");
                sbOooO0O0.append(absJavaBeanApiList);
                sbOooO0O0.append("\n mMapListSendPostCommentModel = ");
                sbOooO0O0.append(oooOo01);
                sbOooO0O0.append("\n sendPostCommentModel = ");
                sbOooO0O0.append(momentSendCommentModel);
                p598o0oo00Oo.o0000O00.OooO0O0(sbOooO0O0.toString());
                if (absJavaBeanApiList != null && (momentCommentResultModel = (MomentCommentResultModel) absJavaBeanApiList.data) != null) {
                    TextUtils.isEmpty(momentSendCommentModel.getCid());
                    MomentDetailModel mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel();
                    int i2 = 0;
                    if (mPostDetailModel != null) {
                        o0oo0000.OooO00o.OooO0OO("106058", MapsKt.mapOf(o0oOO.OooO00o(mPostDetailModel, "discovery_id"), o0O00o0.OooO00o(mPostDetailModel, "video_id"), TuplesKt.to("rec_sessionid", mPostDetailModel.getSessionId())));
                    }
                    List<T> list = momentDetailCommentFragment.getBaseAdapter().f13189OooOOoo;
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
                            p598o0oo00Oo.o0000O00.OooO0O0("发送成功-评论：替换CommentId sendSuccess \n i = " + i + "\n itemTemp = " + momentCommentDetailModel2);
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
                            p598o0oo00Oo.o0000O00.OooO0O0("发送成功-回复：替换CommentId sendSuccess \n i = " + i + "\n itemTemp = " + momentCommentDetailModel);
                            if (momentCommentDetailModel != null) {
                                listener.OooO00o(momentCommentDetailModel, i);
                            }
                        }
                    }
                }
                controller.OooO0O0();
                long jOooO = com.code.android.util.o0OoOo0.OooO(0L, momentSendCommentModel.getDyid());
                long jOooO2 = com.code.android.util.o0OoOo0.OooO(0L, momentSendCommentModel.getCid());
                HashMap<String, oO000O0> map = p583o0oOoo00.oo0o0Oo.f56691OooO00o;
                p583o0oOoo00.oo0o0Oo.OooO0OO(Long.valueOf(jOooO), Long.valueOf(jOooO2), null, 12);
                momentDetailCommentFragment.clearSendEdit();
            }
        };
        o00ooo2.getClass();
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("dyid", sendPostCommentModel.getDyid());
        if (!TextUtils.isEmpty(sendPostCommentModel.getCid())) {
            linkedHashMapOooO00o.put("cid", sendPostCommentModel.getCid());
        }
        if (!p386o0OOooO.oo0o0Oo.OooO0o()) {
            linkedHashMapOooO00o.put("content", sendPostCommentModel.getContent().toJSONString());
            p598o0oo00Oo.o0000O00.OooO0O0("commentWrite params  = " + linkedHashMapOooO00o);
        }
        linkedHashMapOooO00o.put("content", oOO0OOO.OooO0O0(sendPostCommentModel.getContent().toJSONString()).concat(""));
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(p384o0OOoo0O.Oooo0.f43408o0000O0O, p384o0OOoo0O.Oooo0.f43427o000OO, linkedHashMapOooO00o, oooO0O0);
    }

    public final void toReplyComment(@NotNull MomentCommentDetailModel postCommentDetailModel) {
        Intrinsics.checkNotNullParameter(postCommentDetailModel, "postCommentDetailModel");
        getBinding().f45111OooO0O0.postDelayed(new o0oOOo(3, this, postCommentDetailModel), 200L);
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oOO0OO0O getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oOO0OO0O ooo0oo0oInflate = oOO0OO0O.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(ooo0oo0oInflate, "inflate(...)");
        return ooo0oo0oInflate;
    }
}
