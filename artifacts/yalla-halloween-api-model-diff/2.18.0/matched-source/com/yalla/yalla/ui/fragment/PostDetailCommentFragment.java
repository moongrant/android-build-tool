package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.bean.AbsJavaBeanApiList;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeComment;
import com.yalla.yalla.common.model.MomentLogActionTypeCommentReply;
import com.yalla.yalla.common.ui.view.EmptyView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PostDetailCommentResultModel;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.ui.view.PostDetailCommentHeaderView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o000O;
import p144o00OOooo.o00O000o;
import p161o00OoOO0.o00OO0OO;
import p174o00OooO0.o00OOO00;
import p174o00OooO0.o00OOOO0;
import p255o00ooO0O.o00O000;
import p256o00ooO0o.o00O0;
import p393o0OOooOo.o0O00000;
import p410o0Oo0OOo.oO000Oo0;
import p500o0o00Oo0.o00O0OO;
import p517o0o0O00.o00O00;
import p524o0o0O0o.oo0o0O0;
import p538o0o0OOoo.s0;
import p542o0o0Oo0O.o00O0000;
import p542o0o0Oo0O.o0O0ooO;
import p568o0oOo00O.oO0Oo;
import p597o0oOoooo.t5;
import p651o0ooOOoo.qd;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 p2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001qB\u0007¢\u0006\u0004\bn\u0010oJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\u001a\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010&\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010*\u001a\u00020\u0003H\u0016J$\u00100\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u00010.J\u0010\u00101\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+J\u000e\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u00020\rJ\u0006\u00104\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0006J\u0010\u00107\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0006J\u000e\u00108\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0006J\u0006\u00109\u001a\u00020\u0003J\u0018\u0010=\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010<\u001a\u00020\rJ\u0006\u0010>\u001a\u00020\u0003J\u000e\u0010@\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\rJ\u000e\u0010A\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010B\u001a\u00020\u0003R\u0018\u0010C\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR!\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010L\u001a\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010RR\u0014\u0010a\u001a\u00020P8\u0002X\u0082D¢\u0006\u0006\n\u0004\ba\u0010RR\u0016\u0010b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010L\u001a\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010cR\u0016\u0010j\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010cR\u0016\u0010k\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010cR\u0016\u0010l\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010cR\u0016\u0010m\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010R¨\u0006r"}, d2 = {"Lcom/yalla/yalla/ui/fragment/PostDetailCommentFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/qd;", "", "initObserver", "init", "Lcom/yalla/yalla/model/PostCommentDetailModel;", "item", "Lcom/yalla/yalla/common/ui/view/SVGAView;", "rewardSvga", "Landroid/widget/TextView;", "tvRewardCount", "sendReward", "", "isRefresh", "isMoveToListTop", "loadData", "", "list", "", "convertCommentMessageIndexColor", "smoothScrollToPositionCommentMessageIndex", "smoothScrollToPositionSendCommentIndex", "Lcom/yalla/yalla/model/MomentSendContentModel;", "getSendPostModelContent", "recoverSendEdit", "", "cid", "deleteComment", "reportComment", "showHotOrNewHeaderView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Lcom/yalla/yalla/model/MomentDetailModel;", "postDetailModel", "postCommentDetailModel", "Lcom/app/base/framework/view/editTextSpan/EditTextSpan;", "editContentInput", "setData", "setPostDetailModel", "show", "showKeyboard", "commentReplaceCid", "itemModel", "replyComment", "itemViewOnLongClick", "toReplyComment", "sendComment", "Lcom/yalla/yalla/model/MomentSendCommentModel;", "sendPostCommentModel", "isReplyComment", "toApiSendData", "clearSendEdit", "isShow", "keyBoardPanelSwitchHelper", "tabRefreshData", "initData", "mPostDetailModel", "Lcom/yalla/yalla/model/MomentDetailModel;", "mSendPostCommentModel", "Lcom/yalla/yalla/model/MomentSendCommentModel;", "", "dateSort", "J", "Lo00o00o0/OooO0OO;", "baseAdapter$delegate", "Lkotlin/Lazy;", "getBaseAdapter", "()Lo00o00o0/OooO0OO;", "baseAdapter", "", "pageIndex", "I", "Lcom/yalla/yalla/model/PostCommentDetailModel;", "commentId", "Ljava/lang/String;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm$delegate", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "vm", "mEditContentInput", "Lcom/app/base/framework/view/editTextSpan/EditTextSpan;", "Lcom/yalla/yalla/ui/view/PostDetailCommentHeaderView;", "mPostDetailCommentHeaderView", "Lcom/yalla/yalla/ui/view/PostDetailCommentHeaderView;", "mSortType", "delayMillsCommentMessageChangeColor", "isCommentReplacePost", "Z", "Lcom/yalla/yalla/common/ui/view/EmptyView;", "emptyView$delegate", "getEmptyView", "()Lcom/yalla/yalla/common/ui/view/EmptyView;", "emptyView", "mIsRefresh", "mIsSuccess", "mIsNoMoreData", "isInitLoadData", "commentMessageForPostListIndex", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostDetailCommentFragment extends p505o0o00o00.OooO<qd> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String POST_DETAIL_MODEL = "POST_DETAIL_MODEL";

    @Nullable
    private String commentId;
    private int commentMessageForPostListIndex;
    private long dateSort;
    private final int delayMillsCommentMessageChangeColor;

    /* JADX INFO: renamed from: emptyView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyView;
    private boolean isCommentReplacePost;
    private boolean isInitLoadData;

    @Nullable
    private EditTextSpan mEditContentInput;
    private boolean mIsNoMoreData;
    private boolean mIsRefresh;
    private boolean mIsSuccess;

    @Nullable
    private PostDetailCommentHeaderView mPostDetailCommentHeaderView;

    @Nullable
    private o0O0ooO mPostDetailCommentSendUtils;

    @Nullable
    private MomentDetailModel mPostDetailModel;

    @Nullable
    private MomentSendCommentModel mSendPostCommentModel;
    private int mSortType;

    @Nullable
    private PostCommentDetailModel postCommentDetailModel;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    @NotNull
    private final o00O0000 mMapListSendPostCommentModel = new o00O0000();

    /* JADX INFO: renamed from: baseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy baseAdapter = LazyKt.lazy(new OooO0O0());
    private int pageIndex = 1;

    public static final class OooO extends Lambda implements Function2<Integer, MoreModel, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ PostCommentDetailModel f24105Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ PostDetailCommentFragment f24106OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f24107OoooO00;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MoreTag.values().length];
                iArr[MoreTag.copy.ordinal()] = 1;
                iArr[MoreTag.delete.ordinal()] = 2;
                iArr[MoreTag.report.ordinal()] = 3;
                iArr[MoreTag.reply.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PostCommentDetailModel postCommentDetailModel, FragmentActivity fragmentActivity, PostDetailCommentFragment postDetailCommentFragment) {
            super(2);
            this.f24105Oooo = postCommentDetailModel;
            this.f24107OoooO00 = fragmentActivity;
            this.f24106OoooO0 = postDetailCommentFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, MoreModel moreModel) {
            num.intValue();
            MoreModel moreModel2 = moreModel;
            if (moreModel2 == null) {
                return null;
            }
            PostCommentDetailModel postCommentDetailModel = this.f24105Oooo;
            FragmentActivity activity = this.f24107OoooO00;
            PostDetailCommentFragment postDetailCommentFragment = this.f24106OoooO0;
            int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    postDetailCommentFragment.deleteComment(postCommentDetailModel.getId() + "");
                } else if (i == 3) {
                    postDetailCommentFragment.reportComment(postCommentDetailModel.getId() + "");
                } else if (i == 4) {
                    postDetailCommentFragment.toReplyComment(postCommentDetailModel);
                }
            } else if (postCommentDetailModel.getContent() != null) {
                TextView textView = new TextView(activity);
                o00OOOO0.OooO0O0(activity, postCommentDetailModel.getContent(), textView, new o00O000o(postDetailCommentFragment));
                Intrinsics.checkNotNullExpressionValue(activity, "activity");
                oo0o0O0.OooO0o(textView, activity, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Copied));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.PostDetailCommentFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class OooO0O0 extends Lambda implements Function0<o000000O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000O invoke() {
            return new o000000O(PostDetailCommentFragment.this, PostDetailCommentFragment.this.getContext());
        }
    }

    public static final class OooO0OO extends o00OO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f24110OooO0O0;

        public OooO0OO(String str) {
            this.f24110OooO0O0 = str;
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            super.onFinish(response);
            o00O00.OooO0O0("response = " + response);
            MomentDetailModel momentDetailModel = PostDetailCommentFragment.this.mPostDetailModel;
            if (momentDetailModel != null) {
                MomentDetailModel momentDetailModel2 = PostDetailCommentFragment.this.mPostDetailModel;
                momentDetailModel.setCommentNum((momentDetailModel2 != null ? momentDetailModel2.getCommentNum() : 0L) - 1);
            }
            int size = PostDetailCommentFragment.this.getBaseAdapter().getData().size();
            for (int i = 0; i < size; i++) {
                PostCommentDetailModel postCommentDetailModel = (PostCommentDetailModel) PostDetailCommentFragment.this.getBaseAdapter().getData().get(i);
                String str = this.f24110OooO0O0;
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkNotNull(postCommentDetailModel);
                sb.append(postCommentDetailModel.getId());
                sb.append("");
                if (Intrinsics.areEqual(str, sb.toString())) {
                    PostDetailCommentFragment.this.getBaseAdapter().remove(i);
                    break;
                }
            }
            if (PostDetailCommentFragment.this.getBaseAdapter().getData().isEmpty()) {
                PostDetailCommentFragment.this.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                PostDetailCommentFragment.this.getBaseAdapter().hindEmptyView(true);
            }
            PostDetailCommentFragment.this.getBinding().f50388OooO0Oo.OooO0Oo();
            PostDetailCommentFragment.this.showHotOrNewHeaderView();
            MomentDetailModel momentDetailModel3 = PostDetailCommentFragment.this.mPostDetailModel;
            if (momentDetailModel3 != null) {
                long commentNum = momentDetailModel3.getCommentNum();
                PostDetailCommentFragment postDetailCommentFragment = PostDetailCommentFragment.this;
                long j = commentNum > 0 ? commentNum - 1 : 0L;
                MomentDetailModel momentDetailModel4 = postDetailCommentFragment.mPostDetailModel;
                if (momentDetailModel4 != null) {
                    momentDetailModel4.setCommentNum(j);
                }
            }
            LiveEventBus.get("POST_DETAIL_DATA_DELETE_COMMENT").post(PostDetailCommentFragment.this.mPostDetailModel);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<EmptyView> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EmptyView invoke() {
            Context contextRequireContext = PostDetailCommentFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            EmptyView emptyView = new EmptyView(contextRequireContext, null, 0, 6, null);
            PostDetailCommentFragment postDetailCommentFragment = PostDetailCommentFragment.this;
            emptyView.setImage(Integer.valueOf(R.drawable.icon_no_list_comment));
            emptyView.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.No_comments_yet));
            EmptyView.OooO00o(emptyView, new o00000(postDetailCommentFragment));
            return emptyView;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooOO0 f24112Oooo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<List<PostCommentDetailModel>, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ boolean f24114OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f24115OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z, boolean z2) {
            super(1);
            this.f24115OoooO00 = z;
            this.f24114OoooO0 = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<PostCommentDetailModel> list) {
            List<PostCommentDetailModel> list2 = list;
            int i = 1;
            if (list2 != null) {
                boolean z = this.f24115OoooO00;
                PostDetailCommentFragment postDetailCommentFragment = PostDetailCommentFragment.this;
                boolean z2 = this.f24114OoooO0;
                if (z) {
                    postDetailCommentFragment.getBaseAdapter().setNewData(postDetailCommentFragment.convertCommentMessageIndexColor(list2));
                    postDetailCommentFragment.showHotOrNewHeaderView();
                    postDetailCommentFragment.getBinding().f50386OooO0O0.postDelayed(new oO0Oo(postDetailCommentFragment, i), 300L);
                    if (z2) {
                        postDetailCommentFragment.getBinding().f50386OooO0O0.scrollToPosition(0);
                    }
                } else {
                    postDetailCommentFragment.getBaseAdapter().addData((Collection) list2);
                }
            }
            PostDetailCommentFragment.this.pageIndex++;
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<ApiResult<List<PostCommentDetailModel>>, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f24117OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(boolean z) {
            super(1);
            this.f24117OoooO00 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<PostCommentDetailModel>> apiResult) {
            ApiResult<List<PostCommentDetailModel>> result = apiResult;
            Intrinsics.checkNotNullParameter(result, "result");
            PostDetailCommentFragment.this.dateSort = 0L;
            Long dateSort = result.getPage().getDateSort();
            if (dateSort != null) {
                PostDetailCommentFragment.this.dateSort = dateSort.longValue();
            }
            PostDetailCommentFragment.this.mIsRefresh = this.f24117OoooO00;
            PostDetailCommentFragment.this.mIsSuccess = result.isSuccess();
            PostDetailCommentFragment postDetailCommentFragment = PostDetailCommentFragment.this;
            List<PostCommentDetailModel> data = result.getData();
            postDetailCommentFragment.mIsNoMoreData = data == null || data.isEmpty();
            LiveEventBus.get("POST_DETAIL_REFRESH_LOAD_SUCCESS").post(Boolean.TRUE);
            if (PostDetailCommentFragment.this.getBaseAdapter().getData().isEmpty()) {
                if (result.isSuccess()) {
                    PostDetailCommentFragment.this.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                } else {
                    PostDetailCommentFragment.this.getEmptyView().OooO0O0(EmptyView.State.DataError);
                }
                PostDetailCommentFragment.this.getBaseAdapter().hindEmptyView(true);
            }
            PostDetailCommentFragment.this.getBinding().f50388OooO0Oo.OooO0Oo();
            PostDetailCommentFragment.this.getBaseAdapter().setLoadComplete(Boolean.valueOf(PostDetailCommentFragment.this.mIsRefresh), Boolean.valueOf(PostDetailCommentFragment.this.mIsSuccess), Boolean.valueOf(PostDetailCommentFragment.this.mIsNoMoreData));
            PostDetailCommentFragment.this.getBinding().f50387OooO0OO.Oooo00o(PostDetailCommentFragment.this.mIsRefresh, PostDetailCommentFragment.this.mIsSuccess, PostDetailCommentFragment.this.mIsNoMoreData);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooOOO0 f24118Oooo = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ EditTextSpan f24120OooO0O0;

        public OooOOOO(EditTextSpan editTextSpan) {
            this.f24120OooO0O0 = editTextSpan;
        }

        public final void OooO00o(@NotNull PostCommentDetailModel data) {
            Intrinsics.checkNotNullParameter(data, "data");
            o00O00.OooO0Oo("添加评论 ");
            PostDetailCommentFragment.this.getBaseAdapter().addData(0, data);
            PostDetailCommentFragment.this.getBinding().f50386OooO0O0.smoothScrollToPosition(PostDetailCommentFragment.this.getBaseAdapter().getHeaderLayoutCount() + 0);
            if (PostDetailCommentFragment.this.getBaseAdapter().getData().isEmpty()) {
                PostDetailCommentFragment.this.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                PostDetailCommentFragment.this.getBaseAdapter().hindEmptyView(true);
            }
            PostDetailCommentFragment.this.getBinding().f50388OooO0Oo.OooO0Oo();
            MomentDetailModel momentDetailModel = PostDetailCommentFragment.this.mPostDetailModel;
            if (momentDetailModel != null) {
                MomentDetailModel momentDetailModel2 = PostDetailCommentFragment.this.mPostDetailModel;
                momentDetailModel.setCommentNum((momentDetailModel2 != null ? momentDetailModel2.getCommentNum() : 0L) + 1);
            }
            LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(PostDetailCommentFragment.this.mPostDetailModel);
            PostDetailCommentFragment postDetailCommentFragment = PostDetailCommentFragment.this;
            postDetailCommentFragment.toApiSendData(postDetailCommentFragment.mSendPostCommentModel, false);
            this.f24120OooO0O0.setText("");
            this.f24120OooO0O0.OooO0O0();
            this.f24120OooO0O0.setHint(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Write_a_comment));
            PostDetailCommentFragment.this.showHotOrNewHeaderView();
        }

        public final void OooO0O0(@NotNull PostCommentDetailModel data, int i) {
            Intrinsics.checkNotNullParameter(data, "data");
            o00O00.OooO0Oo("回复评论 ");
            PostDetailCommentFragment.this.getBaseAdapter().setData(i, data);
            PostDetailCommentFragment.this.getBinding().f50386OooO0O0.smoothScrollToPosition(PostDetailCommentFragment.this.getBaseAdapter().getHeaderLayoutCount() + i);
            if (PostDetailCommentFragment.this.getBaseAdapter().getData().isEmpty()) {
                PostDetailCommentFragment.this.getEmptyView().OooO0O0(EmptyView.State.DataNull);
                PostDetailCommentFragment.this.getBaseAdapter().hindEmptyView(true);
            }
            PostDetailCommentFragment.this.getBinding().f50388OooO0Oo.OooO0Oo();
            MomentDetailModel momentDetailModel = PostDetailCommentFragment.this.mPostDetailModel;
            if (momentDetailModel != null) {
                MomentDetailModel momentDetailModel2 = PostDetailCommentFragment.this.mPostDetailModel;
                momentDetailModel.setCommentNum((momentDetailModel2 != null ? momentDetailModel2.getCommentNum() : 0L) + 1);
            }
            LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(PostDetailCommentFragment.this.mPostDetailModel);
            PostDetailCommentFragment postDetailCommentFragment = PostDetailCommentFragment.this;
            postDetailCommentFragment.toApiSendData(postDetailCommentFragment.mSendPostCommentModel, true);
            this.f24120OooO0O0.setText("");
            this.f24120OooO0O0.OooO0O0();
            this.f24120OooO0O0.setHint(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Write_a_comment));
        }
    }

    public static final class OooOo extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ PostCommentDetailModel f24121Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(PostCommentDetailModel postCommentDetailModel) {
            super(1);
            this.f24121Oooo = postCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f24121Oooo.setSendProp(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ SVGAView f24122Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ PostCommentDetailModel f24123OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ PostDetailCommentFragment f24124OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ TextView f24125OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(SVGAView sVGAView, PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel, TextView textView) {
            super(1);
            this.f24122Oooo = sVGAView;
            this.f24124OoooO00 = postDetailCommentFragment;
            this.f24123OoooO0 = postCommentDetailModel;
            this.f24125OoooO0O = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
            RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
            o0O00000.OooO0OO("Monents_commentFlower_success");
            this.f24122Oooo.OooO0oo("svga/anim_moment_reward.svga", this.f24124OoooO00.getViewLifecycleOwner());
            this.f24122Oooo.OooO();
            this.f24123OoooO0.setSendProp(true);
            this.f24123OoooO0.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
            p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0OO().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
            this.f24125OoooO0O.setText(p169o00Ooo0.o0O0O00.OooO0oO(this.f24123OoooO0.getPropNum(), false));
            this.f24125OoooO0O.setTextColor(p255o00ooO0O.o000O0O0.OooO00o(this.f24123OoooO0.isSendProp() ? R.color.color_FFA16C : R.color.color_666666));
            oo00oO.OooO00o.OooO0OO oooO0OO = oo00oO.OooO00o.f53328OooO0OO;
            FragmentActivity fragmentActivityRequireActivity = this.f24124OoooO00.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            oooO0OO.OooO00o(fragmentActivityRequireActivity, this.f24125OoooO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends o00OO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ MomentSendCommentModel f24127OooO0O0;

        public static final class OooO00o implements o0O0ooO.OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ PostDetailCommentFragment f24128OooO00o;

            public OooO00o(PostDetailCommentFragment postDetailCommentFragment) {
                this.f24128OooO00o = postDetailCommentFragment;
            }

            @Override // o0o0Oo0O.o0O0ooO.OooO00o
            public final void OooO00o(@NotNull PostCommentDetailModel data, int i) {
                Intrinsics.checkNotNullParameter(data, "data");
                o00O00.OooO0Oo("回复 替换评论 \n position = " + i + "\n data = " + data);
                this.f24128OooO00o.getBaseAdapter().setData(i, data);
                LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                this.f24128OooO00o.getBinding().f50386OooO0O0.smoothScrollToPosition(this.f24128OooO00o.getBaseAdapter().getHeaderLayoutCount() + i);
            }

            @Override // o0o0Oo0O.o0O0ooO.OooO00o
            public final void OooO0O0(@NotNull PostCommentDetailModel data, int i) {
                Intrinsics.checkNotNullParameter(data, "data");
                o00O00.OooO0Oo("评论  删除评论 ");
                this.f24128OooO00o.getBaseAdapter().remove(i);
                LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                this.f24128OooO00o.getBinding().f50386OooO0O0.smoothScrollToPosition(this.f24128OooO00o.getBaseAdapter().getHeaderLayoutCount() + i);
                this.f24128OooO00o.showHotOrNewHeaderView();
            }
        }

        public static final class OooO0O0 extends p390o0OOooO.o00000O0<AbsJavaBeanApiList<PostDetailCommentResultModel>> {
        }

        public Oooo0(MomentSendCommentModel momentSendCommentModel) {
            this.f24127OooO0O0 = momentSendCommentModel;
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            o00O00.OooO0Oo("toApiSendData onError \n code = " + code2 + "\n message = " + message);
            o0O0ooO o0o0ooo = PostDetailCommentFragment.this.mPostDetailCommentSendUtils;
            Intrinsics.checkNotNull(o0o0ooo);
            List<T> data = PostDetailCommentFragment.this.getBaseAdapter().getData();
            MomentSendCommentModel momentSendCommentModel = this.f24127OooO0O0;
            OooO00o oooO00o = new OooO00o(PostDetailCommentFragment.this);
            Objects.requireNonNull(o0o0ooo);
            if (data != 0 && momentSendCommentModel != null) {
                int i = 0;
                PostCommentDetailModel postCommentDetailModel = null;
                int i2 = -1;
                if (TextUtils.isEmpty(momentSendCommentModel.getParentUserId())) {
                    while (i < data.size()) {
                        PostCommentDetailModel postCommentDetailModel2 = (PostCommentDetailModel) data.get(i);
                        o00O00.OooO0O0("评论 removeCommentOrCommentReply \n i = " + i + "\n itemTemp = " + postCommentDetailModel2);
                        if (postCommentDetailModel2 != null && momentSendCommentModel.getLocalId() == postCommentDetailModel2.getLocalId()) {
                            postCommentDetailModel = postCommentDetailModel2;
                            i2 = i;
                            break;
                        }
                        i++;
                    }
                    if (postCommentDetailModel != null) {
                        oooO00o.OooO0O0(postCommentDetailModel, i2);
                    }
                } else {
                    while (i < data.size()) {
                        PostCommentDetailModel postCommentDetailModel3 = (PostCommentDetailModel) data.get(i);
                        o00O00.OooO0O0("回复 removeCommentOrCommentReply \n i = " + i + "\n itemTemp = " + postCommentDetailModel3);
                        if (postCommentDetailModel3 != null) {
                            String cid = momentSendCommentModel.getCid();
                            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("");
                            sbOooO0O0.append(postCommentDetailModel3.getId());
                            if (cid.equals(sbOooO0O0.toString())) {
                                postCommentDetailModel3.removeLocalSendingCommentReplyModel(momentSendCommentModel);
                                postCommentDetailModel = postCommentDetailModel3;
                                i2 = i;
                                break;
                            }
                        }
                        i++;
                    }
                    if (postCommentDetailModel != null) {
                        oooO00o.OooO00o(postCommentDetailModel, i2);
                    }
                }
            }
            o00O0000 o00o0001 = PostDetailCommentFragment.this.mMapListSendPostCommentModel;
            MomentSendCommentModel momentSendCommentModel2 = this.f24127OooO0O0;
            Objects.requireNonNull(o00o0001);
            MomentSendCommentModel momentSendCommentModel3 = new MomentSendCommentModel(momentSendCommentModel2.getDyid());
            momentSendCommentModel3.setSendPostCommentModel(momentSendCommentModel2);
            o00o0001.OooO00o(momentSendCommentModel3);
            o00O00.OooO0O0("mMapListSendPostCommentModel = " + PostDetailCommentFragment.this.mMapListSendPostCommentModel);
            MomentDetailModel momentDetailModel = PostDetailCommentFragment.this.mPostDetailModel;
            if (momentDetailModel != null) {
                MomentDetailModel momentDetailModel2 = PostDetailCommentFragment.this.mPostDetailModel;
                momentDetailModel.setCommentNum((momentDetailModel2 != null ? momentDetailModel2.getCommentNum() : 0L) - 1);
            }
            LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(PostDetailCommentFragment.this.mPostDetailModel);
            PostDetailCommentFragment.this.clearSendEdit();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onFinish(@NotNull String response) {
            PostCommentDetailModel data;
            Intrinsics.checkNotNullParameter(response, "response");
            super.onFinish(response);
            AbsJavaBeanApiList absJavaBeanApiList = (AbsJavaBeanApiList) com.android.billingclient.api.o0Oo0oo.OooO0OO(response, new OooO0O0().getType());
            PostDetailCommentFragment.this.mMapListSendPostCommentModel.OooO0o0(this.f24127OooO0O0);
            o00O00.OooO0O0("toApiSendData onFinish\n response = " + response + "\n result = " + absJavaBeanApiList + "\n mMapListSendPostCommentModel = " + PostDetailCommentFragment.this.mMapListSendPostCommentModel + "\n sendPostCommentModel = " + this.f24127OooO0O0);
            if (TextUtils.isEmpty(this.f24127OooO0O0.getCid()) && absJavaBeanApiList != null && absJavaBeanApiList.getData() != 0) {
                MomentSendCommentModel momentSendCommentModel = this.f24127OooO0O0;
                StringBuilder sb = new StringBuilder();
                Model data2 = absJavaBeanApiList.getData();
                Intrinsics.checkNotNull(data2);
                sb.append(((PostDetailCommentResultModel) data2).getCid());
                sb.append("");
                momentSendCommentModel.setCid(sb.toString());
                o0O0ooO o0o0ooo = PostDetailCommentFragment.this.mPostDetailCommentSendUtils;
                Intrinsics.checkNotNull(o0o0ooo);
                List<T> data3 = PostDetailCommentFragment.this.getBaseAdapter().getData();
                MomentSendCommentModel momentSendCommentModel2 = this.f24127OooO0O0;
                PostDetailCommentFragment postDetailCommentFragment = PostDetailCommentFragment.this;
                Objects.requireNonNull(o0o0ooo);
                if (data3 != 0 && momentSendCommentModel2 != null && TextUtils.isEmpty(momentSendCommentModel2.getParentUserId())) {
                    int i = 0;
                    while (true) {
                        if (i >= data3.size()) {
                            data = null;
                            i = -1;
                            break;
                        }
                        data = (PostCommentDetailModel) data3.get(i);
                        o00O00.OooO0O0("replaceCommentIdOrCommentReply \n i = " + i + "\n itemTemp = " + data);
                        if (data != null && momentSendCommentModel2.getLocalId() == data.getLocalId()) {
                            data.setLocalSendingCommentModelId(TextUtils.isEmpty(momentSendCommentModel2.getCid()) ? 0L : Long.valueOf(momentSendCommentModel2.getCid()).longValue());
                            break;
                        }
                        i++;
                    }
                    if (data != null) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        o00O00.OooO0Oo("回复评论 ");
                        postDetailCommentFragment.getBaseAdapter().setData(i, data);
                        LiveEventBus.get("POST_DETAIL_APP_BAR_LAYOUT_SET_EXPANDED").post(Boolean.FALSE);
                        postDetailCommentFragment.getBinding().f50386OooO0O0.smoothScrollToPosition(postDetailCommentFragment.getBaseAdapter().getHeaderLayoutCount() + i);
                    }
                }
            }
            PostDetailCommentFragment.this.clearSendEdit();
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final Oooo000 f24129Oooo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
            ApiResult<RewardCommentResultModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public PostDetailCommentFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.PostDetailCommentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.PostDetailCommentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000OO0.OooO0O0(this, Reflection.getOrCreateKotlinClass(MomentVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.PostDetailCommentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.PostDetailCommentFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Function0 f24133Oooo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24133Oooo;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000OO0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.PostDetailCommentFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000OO0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.delayMillsCommentMessageChangeColor = 1400;
        this.isCommentReplacePost = true;
        this.emptyView = LazyKt.lazy(new OooO0o());
        this.commentMessageForPostListIndex = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PostCommentDetailModel> convertCommentMessageIndexColor(List<PostCommentDetailModel> list) {
        PostCommentDetailModel postCommentDetailModel = this.postCommentDetailModel;
        if (postCommentDetailModel != null && postCommentDetailModel.getId() > 0) {
            postCommentDetailModel.setLocalMessageDiscolor(true);
            int i = -1;
            if (list != null) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    PostCommentDetailModel postCommentDetailModel2 = list.get(i3);
                    if (postCommentDetailModel2.getId() == postCommentDetailModel.getId()) {
                        postCommentDetailModel2.setLocalMessageDiscolor(postCommentDetailModel.isLocalMessageDiscolor());
                        i = i3;
                    }
                }
                if (i < 0) {
                    list.add(0, postCommentDetailModel);
                } else {
                    i2 = i;
                }
                this.commentMessageForPostListIndex = getBaseAdapter().getHeaderLayoutCount() + i2;
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteComment(String cid) {
        p154o00Oo0oO.o00oO0o o00oo0o2 = p154o00Oo0oO.o00000OO.f32228OooO00o;
        p154o00Oo0oO.o0Oo0oo o0oo0oo2 = p154o00Oo0oO.o00000OO.f32234OooO0oO;
        StringBuilder sb = new StringBuilder();
        MomentDetailModel momentDetailModel = this.mPostDetailModel;
        sb.append(momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null);
        sb.append("");
        o0oo0oo2.OooO00o(sb.toString(), cid, new OooO0OO(cid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p189o00o00o0.OooO0OO<PostCommentDetailModel> getBaseAdapter() {
        return (p189o00o00o0.OooO0OO) this.baseAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmptyView getEmptyView() {
        return (EmptyView) this.emptyView.getValue();
    }

    private final MomentSendContentModel getSendPostModelContent() {
        EditTextSpan editTextSpan = this.mEditContentInput;
        if (editTextSpan == null) {
            return new MomentSendContentModel("");
        }
        String strOooO00o = o00OOOO0.OooO00o(getActivity(), editTextSpan);
        Intrinsics.checkNotNullExpressionValue(strOooO00o, "getAtUserToAtNum(activity, it)");
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(strOooO00o);
        ArrayList<? extends p151o00Oo0Oo.OooOo> arrayListOooO0OO = editTextSpan.getSpanManager().OooO0OO("@");
        Intrinsics.checkNotNull(arrayListOooO0OO, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
        int size = arrayListOooO0OO.size();
        for (int i = 0; i < size; i++) {
            p151o00Oo0Oo.OooOo oooOo = arrayListOooO0OO.get(i);
            Intrinsics.checkNotNull(oooOo, "null cannot be cast to non-null type com.app.base.framework.view.editTextSpan.EditTextSpanItem");
            p151o00Oo0Oo.OooOo oooOo2 = oooOo;
            List<MomentSendContentAtModel> at = momentSendContentModel.getAt();
            String strOooO00o2 = android.support.v4.media.session.OooOOO0.OooO00o(new StringBuilder(), oooOo2.f32195OoooO00, "");
            String str = oooOo2.f32192Oooo;
            Intrinsics.checkNotNullExpressionValue(str, "friendListModel.text");
            at.add(new MomentSendContentAtModel(strOooO00o2, str));
        }
        return momentSendContentModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MomentVM getVm() {
        return (MomentVM) this.vm.getValue();
    }

    private final void init() {
        this.mSendPostCommentModel = new MomentSendCommentModel(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        getBinding().f50386OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f50386OooO0O0.setAdapter(getBaseAdapter());
        getBaseAdapter().setEmptyView(getEmptyView());
        getBinding().f50387OooO0OO.f19564o00o0O = false;
        getBinding().f50387OooO0OO.OooOoOO(true);
        getBinding().f50387OooO0OO.Oooo0(new s0(this, 2));
        PostDetailCommentHeaderView postDetailCommentHeaderView = new PostDetailCommentHeaderView(getActivity(), null, 0, 6, null);
        this.mPostDetailCommentHeaderView = postDetailCommentHeaderView;
        postDetailCommentHeaderView.OooO00o(0);
        PostDetailCommentHeaderView postDetailCommentHeaderView2 = this.mPostDetailCommentHeaderView;
        if (postDetailCommentHeaderView2 != null) {
            postDetailCommentHeaderView2.setListener(new p070o0000ooO.o00Oo0(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m387init$lambda2(PostDetailCommentFragment this$0, oO000Oo0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.loadData(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m388init$lambda3(PostDetailCommentFragment this$0, Integer it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.mSortType = it.intValue();
        this$0.loadData(true, false);
    }

    private final void initObserver() {
        int i = 6;
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_ADD").observe(this, new o000O(this, i));
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_DEL").observe(this, new p143o00OOooO.o000OO0O(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-0, reason: not valid java name */
    public static final void m389initObserver$lambda0(PostDetailCommentFragment this$0, Object result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (((Boolean) result).booleanValue()) {
            this$0.loadData(true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-1, reason: not valid java name */
    public static final void m390initObserver$lambda1(PostDetailCommentFragment this$0, Object result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (((Boolean) result).booleanValue()) {
            this$0.loadData(true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(boolean isRefresh, boolean isMoveToListTop) {
        MomentDetailModel momentDetailModel = this.mPostDetailModel;
        if (momentDetailModel != null) {
            long id = momentDetailModel.getId();
            if (!this.isInitLoadData) {
                this.isInitLoadData = true;
            }
            if (isRefresh) {
                this.pageIndex = 1;
                this.dateSort = 0L;
                getBinding().f50388OooO0Oo.OooO0oo();
            }
            getVm().momentCommentList(id, this.mSortType, this.dateSort, this.pageIndex).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooOO0O(isRefresh, isMoveToListTop), OooOOO0.f24118Oooo, new OooOOO(isRefresh), false));
        }
    }

    private final void recoverSendEdit() {
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("recoverSendEdit \n mSendPostCommentModel = ");
        sbOooO0O0.append(this.mSendPostCommentModel);
        o00O00.OooO0O0(sbOooO0O0.toString());
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        if (momentSendCommentModel != null) {
            long j = 0;
            if (momentSendCommentModel.getLocalId() >= 0) {
                EditTextSpan editTextSpan = this.mEditContentInput;
                if (editTextSpan != null) {
                    editTextSpan.setText("");
                }
                EditTextSpan editTextSpan2 = this.mEditContentInput;
                if (editTextSpan2 != null) {
                    editTextSpan2.OooO0O0();
                }
            }
            if (TextUtils.isEmpty(momentSendCommentModel.getCid())) {
                EditTextSpan editTextSpan3 = this.mEditContentInput;
                if (editTextSpan3 != null) {
                    editTextSpan3.setHint(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Write_a_comment));
                }
            } else {
                p522o0o0O0O0.o00Ooo o00ooo2 = p522o0o0O0O0.o00Ooo.f42780OooO00o;
                String parentUserId = momentSendCommentModel.getParentUserId();
                if (parentUserId != null) {
                    Intrinsics.checkNotNullParameter(parentUserId, "<this>");
                    try {
                        j = Long.parseLong(parentUserId);
                    } catch (NumberFormatException unused) {
                    }
                }
                String parentUserName = momentSendCommentModel.getParentUserName();
                String strOooO0O0 = o00ooo2.OooO0O0(j, parentUserName != null ? parentUserName : "");
                EditTextSpan editTextSpan4 = this.mEditContentInput;
                if (editTextSpan4 != null) {
                    editTextSpan4.setHint(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Reply_xxx), strOooO0O0));
                }
            }
            this.commentId = momentSendCommentModel.getCid();
            o00OOO00.OooO00o(this.mEditContentInput, momentSendCommentModel.getContent(), getActivity());
            EditTextSpan editTextSpan5 = this.mEditContentInput;
            if (editTextSpan5 != null) {
                editTextSpan5.setCursorVisible(true);
            }
            EditTextSpan editTextSpan6 = this.mEditContentInput;
            if (editTextSpan6 != null) {
                editTextSpan6.setFocusable(true);
            }
            EditTextSpan editTextSpan7 = this.mEditContentInput;
            if (editTextSpan7 != null) {
                editTextSpan7.setSingleLine(true);
            }
        }
        showKeyboard(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportComment(String cid) {
        if (cid != null) {
            t5 t5Var = t5.f47585OooO00o;
            long jOooO0oO = com.yalla.support.common.util.OooO.OooO0oO(cid);
            MomentDetailModel momentDetailModel = this.mPostDetailModel;
            p586o0oOoo.o000O.OooO00o(t5Var, t5.OooO0o(5, jOooO0oO, (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : Long.valueOf(momentDetailModel != null ? momentDetailModel.getId() : 0L), (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendReward(PostCommentDetailModel item, SVGAView rewardSvga, TextView tvRewardCount) {
        item.setSendProp(true);
        MomentVM vm = getVm();
        String str = item.getId() + "";
        String userid = item.getUserid();
        Intrinsics.checkNotNullExpressionValue(userid, "item.userid");
        vm.commentSendProp(str, userid).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooOo00(rewardSvga, this, item, tvRewardCount), new OooOo(item), Oooo000.f24129Oooo, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHotOrNewHeaderView() {
        List<PostCommentDetailModel> data = getBaseAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "baseAdapter.data");
        if (!(!data.isEmpty())) {
            getBaseAdapter().removeAllHeaderView();
            return;
        }
        PostDetailCommentHeaderView postDetailCommentHeaderView = this.mPostDetailCommentHeaderView;
        if ((postDetailCommentHeaderView != null ? postDetailCommentHeaderView.getParent() : null) == null) {
            getBaseAdapter().addHeaderView(this.mPostDetailCommentHeaderView);
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
        getBinding().f50386OooO0O0.smoothScrollToPosition(getBaseAdapter().getHeaderLayoutCount() + this.commentMessageForPostListIndex);
        getBinding().f50386OooO0O0.postDelayed(new com.facebook.appevents.codeless.OooO0O0(this, 2), this.delayMillsCommentMessageChangeColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: smoothScrollToPositionCommentMessageIndex$lambda-9, reason: not valid java name */
    public static final void m391smoothScrollToPositionCommentMessageIndex$lambda9(PostDetailCommentFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDetached()) {
            return;
        }
        try {
            try {
                int size = this$0.getBaseAdapter().getData().size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        PostCommentDetailModel postCommentDetailModel = this$0.getBaseAdapter().getData().get(i);
                        if (postCommentDetailModel != null && postCommentDetailModel.isLocalMessageDiscolor()) {
                            postCommentDetailModel.setLocalMessageDiscolor(false);
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    this$0.getBaseAdapter().notifyItemChanged(i + this$0.getBaseAdapter().getHeaderLayoutCount());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this$0.commentMessageForPostListIndex = -1;
        }
    }

    private final void smoothScrollToPositionSendCommentIndex() {
        PostCommentDetailModel postCommentDetailModel = this.postCommentDetailModel;
        if ((postCommentDetailModel != null ? postCommentDetailModel.getId() : 0L) > 0) {
            int i = 0;
            if (TextUtils.isEmpty(this.commentId)) {
                getBinding().f50386OooO0O0.smoothScrollToPosition(getBaseAdapter().getHeaderLayoutCount() + 0);
                return;
            }
            int size = getBaseAdapter().getData().size();
            for (int i2 = 0; i2 < size; i2++) {
                PostCommentDetailModel postCommentDetailModel2 = getBaseAdapter().getData().get(i2);
                if (postCommentDetailModel2 != null) {
                    if (Intrinsics.areEqual(this.commentId, postCommentDetailModel2.getId() + "")) {
                        i = i2;
                        break;
                    }
                }
            }
            this.commentId = "";
            getBinding().f50386OooO0O0.smoothScrollToPosition(getBaseAdapter().getHeaderLayoutCount() + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toReplyComment$lambda-5, reason: not valid java name */
    public static final void m392toReplyComment$lambda5(PostDetailCommentFragment this$0, PostCommentDetailModel postCommentDetailModel) {
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
        EditTextSpan editTextSpan = this.mEditContentInput;
        if (editTextSpan != null) {
            editTextSpan.setText("");
        }
        EditTextSpan editTextSpan2 = this.mEditContentInput;
        if (editTextSpan2 != null) {
            editTextSpan2.OooO0O0();
        }
        EditTextSpan editTextSpan3 = this.mEditContentInput;
        if (editTextSpan3 != null) {
            editTextSpan3.setHint(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Write_a_comment));
        }
        LiveEventBus.get("MOMENT_POST_COMMENT").post(this.mPostDetailModel);
        showKeyboard(false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<Model>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<Model>] */
    public final void commentReplaceCid() {
        MomentSendCommentModel momentSendCommentModel;
        String dyid;
        if (this.mSendPostCommentModel == null) {
            return;
        }
        this.isCommentReplacePost = true;
        o00O0000 o00o0001 = this.mMapListSendPostCommentModel;
        o00o0001.OooO0Oo();
        o00o0001.OooO0Oo();
        int size = o00o0001.f32187OooO0O0.size();
        do {
            size--;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                o00o0001.OooO0Oo();
                momentSendCommentModel = (MomentSendCommentModel) o00o0001.f32187OooO0O0.get(size);
            }
        } while (!TextUtils.isEmpty(momentSendCommentModel.getCid()));
        String str = "";
        if (momentSendCommentModel == null) {
            StringBuilder sb = new StringBuilder();
            MomentDetailModel momentDetailModel = this.mPostDetailModel;
            sb.append(momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null);
            sb.append("");
            momentSendCommentModel = new MomentSendCommentModel(sb.toString());
        }
        MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
        if (momentSendCommentModel2 != null) {
            momentSendCommentModel2.setSendPostCommentModel(momentSendCommentModel);
        }
        long j = 0;
        try {
            MomentSendCommentModel momentSendCommentModel3 = this.mSendPostCommentModel;
            if (momentSendCommentModel3 != null && (dyid = momentSendCommentModel3.getDyid()) != null) {
                str = dyid;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        MomentSendCommentModel momentSendCommentModel4 = this.mSendPostCommentModel;
        if (momentSendCommentModel4 != null) {
            momentSendCommentModel4.setLocalId(j);
        }
        recoverSendEdit();
    }

    public final void initData() {
        if (this.isInitLoadData) {
            return;
        }
        loadData(true, false);
    }

    public final void itemViewOnLongClick(@Nullable PostCommentDetailModel postCommentDetailModel) {
        if (postCommentDetailModel == null || postCommentDetailModel.getId() < 1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        MoreTag moreTag = MoreTag.reply;
        arrayList.add(new MoreModel(com.yalla.support.common.util.OooOOO.OooO0OO(moreTag.getText()), moreTag));
        MoreTag moreTag2 = MoreTag.copy;
        arrayList.add(new MoreModel(com.yalla.support.common.util.OooOOO.OooO0OO(moreTag2.getText()), moreTag2));
        if (postCommentDetailModel.isDel()) {
            MoreTag moreTag3 = MoreTag.delete;
            arrayList.add(new MoreModel(com.yalla.support.common.util.OooOOO.OooO0OO(moreTag3.getText()), moreTag3));
        } else {
            MoreTag moreTag4 = MoreTag.report;
            arrayList.add(new MoreModel(com.yalla.support.common.util.OooOOO.OooO0OO(moreTag4.getText()), moreTag4));
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            o00O0 o00o1 = new o00O0(activity);
            o00o1.OooOOo0(arrayList);
            o00o1.OooOOoo(new OooO(postCommentDetailModel, activity, this));
            o00o1.OooOO0(OooOO0.f24112Oooo);
            o00o1.OooOOO0();
        }
    }

    public final void keyBoardPanelSwitchHelper(boolean isShow) {
        EditTextSpan editTextSpan = this.mEditContentInput;
        if (editTextSpan != null) {
            if ((editTextSpan != null ? editTextSpan.getText() : null) == null) {
                return;
            }
            if (isShow) {
                EditTextSpan editTextSpan2 = this.mEditContentInput;
                if (com.yalla.support.common.util.OooO0OO.OooO00o(String.valueOf(editTextSpan2 != null ? editTextSpan2.getText() : null)) && this.isCommentReplacePost) {
                    commentReplaceCid();
                    return;
                }
                return;
            }
            this.isCommentReplacePost = true;
            EditTextSpan editTextSpan3 = this.mEditContentInput;
            if (StringsKt.trim((CharSequence) String.valueOf(editTextSpan3 != null ? editTextSpan3.getText() : null)).toString().length() == 0) {
                EditTextSpan editTextSpan4 = this.mEditContentInput;
                if (editTextSpan4 == null) {
                    return;
                }
                editTextSpan4.setHint(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Write_a_comment));
                return;
            }
            MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
            if (momentSendCommentModel != null) {
                momentSendCommentModel.setContent(getSendPostModelContent());
            }
            o00O0000 o00o0001 = this.mMapListSendPostCommentModel;
            MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
            Objects.requireNonNull(o00o0001);
            MomentSendCommentModel momentSendCommentModel3 = new MomentSendCommentModel(momentSendCommentModel2.getDyid());
            momentSendCommentModel3.setSendPostCommentModel(momentSendCommentModel2);
            o00o0001.OooO00o(momentSendCommentModel3);
            clearSendEdit();
        }
    }

    @Override // p505o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mPostDetailModel = (MomentDetailModel) (arguments != null ? arguments.getSerializable(POST_DETAIL_MODEL) : null);
    }

    @Override // p505o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getVm().statisticalTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        o00O00.OooOO0O("PostDetailCommentFragment onViewCreated");
        init();
        initObserver();
        initData();
        getVm().statisticalTime();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<Model>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList, java.util.List<Model>] */
    public final void replyComment(@NotNull PostCommentDetailModel itemModel) {
        MomentSendCommentModel momentSendCommentModel;
        String cid;
        Intrinsics.checkNotNullParameter(itemModel, "itemModel");
        if (isDetached()) {
            return;
        }
        this.isCommentReplacePost = false;
        o00O0000 o00o0001 = this.mMapListSendPostCommentModel;
        StringBuilder sb = new StringBuilder();
        sb.append(itemModel.getId());
        String str = "";
        sb.append("");
        String string = sb.toString();
        o00o0001.OooO0Oo();
        o00o0001.OooO0Oo();
        int size = o00o0001.f32187OooO0O0.size();
        do {
            size--;
            if (size < 0) {
                momentSendCommentModel = null;
                break;
            } else {
                o00o0001.OooO0Oo();
                momentSendCommentModel = (MomentSendCommentModel) o00o0001.f32187OooO0O0.get(size);
            }
        } while (!string.equals(momentSendCommentModel.getCid()));
        if (momentSendCommentModel == null) {
            StringBuilder sb2 = new StringBuilder();
            MomentDetailModel momentDetailModel = this.mPostDetailModel;
            sb2.append(momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null);
            sb2.append("");
            momentSendCommentModel = new MomentSendCommentModel(sb2.toString());
            String str2 = itemModel.getId() + "";
            String userid = itemModel.getUserid();
            Intrinsics.checkNotNullExpressionValue(userid, "itemModel.userid");
            String nickname = itemModel.getNickname();
            Intrinsics.checkNotNullExpressionValue(nickname, "itemModel.nickname");
            momentSendCommentModel.setComment(str2, userid, nickname);
        }
        MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
        if (momentSendCommentModel2 != null) {
            momentSendCommentModel2.setSendPostCommentModel(momentSendCommentModel);
        }
        long j = 0;
        try {
            MomentSendCommentModel momentSendCommentModel3 = this.mSendPostCommentModel;
            if (momentSendCommentModel3 != null && (cid = momentSendCommentModel3.getCid()) != null) {
                str = cid;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        MomentSendCommentModel momentSendCommentModel4 = this.mSendPostCommentModel;
        if (momentSendCommentModel4 != null) {
            momentSendCommentModel4.setLocalId(j);
        }
        recoverSendEdit();
    }

    public final void sendComment() {
        PostCommentDetailModel postCommentDetailModel;
        EditTextSpan editTextSpan = this.mEditContentInput;
        if (editTextSpan != null) {
            int i = 0;
            if (StringsKt.isBlank(StringsKt.trim((CharSequence) editTextSpan.getText().toString()).toString())) {
                String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.please_input_dynamic);
                ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) != 0) {
                    return;
                }
                p255o00ooO0O.o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                    return;
                } else {
                    o00O000 o00o001 = o00O000.f34368OooO00o;
                    o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                    return;
                }
            }
            if (p169o00Ooo0.o0OoOo0.OooO0o0(editTextSpan) > 500) {
                String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.char_room_text_lenght), "500");
                ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                if (StringsKt.isBlank(strOooO00o)) {
                    return;
                }
                p255o00ooO0O.o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                    return;
                } else {
                    o00O000 o00o002 = o00O000.f34368OooO00o;
                    o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                    return;
                }
            }
            if (p169o00Ooo0.o0OoOo0.OooO0Oo(editTextSpan) > 50) {
                String strOooO0OO2 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.char_room_edit1);
                ToastUtil toastUtil3 = ToastUtil.f12583OooO0O0;
                if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? 1 : 0) != 0) {
                    return;
                }
                p255o00ooO0O.o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O2.run();
                    return;
                } else {
                    o00O000 o00o003 = o00O000.f34368OooO00o;
                    o00O000.f34370OooO0OO.post(o0o0oooOooO0O2);
                    return;
                }
            }
            MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
            if (momentSendCommentModel != null) {
                momentSendCommentModel.setContent(getSendPostModelContent());
            }
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("sendComment SendPostCommentModel = ");
            MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
            sbOooO0O0.append(momentSendCommentModel2 != null ? momentSendCommentModel2.toJSONString() : null);
            o00O00.OooO(sbOooO0O0.toString());
            if (this.mPostDetailCommentSendUtils == null) {
                this.mPostDetailCommentSendUtils = new o0O0ooO();
            }
            if (this.mPostDetailCommentSendUtils != null) {
                List<PostCommentDetailModel> data = getBaseAdapter().getData();
                MomentSendCommentModel momentSendCommentModel3 = this.mSendPostCommentModel;
                OooOOOO oooOOOO = new OooOOOO(editTextSpan);
                if (momentSendCommentModel3.getLocalId() <= 0) {
                    momentSendCommentModel3.setLocalId(System.currentTimeMillis());
                }
                if (TextUtils.isEmpty(momentSendCommentModel3.getCid())) {
                    PostCommentDetailModel postCommentDetailModel2 = new PostCommentDetailModel();
                    postCommentDetailModel2.setLocalSendingCommentModel(momentSendCommentModel3);
                    oooOOOO.OooO00o(postCommentDetailModel2);
                } else {
                    if (data == null) {
                        i = -1;
                        postCommentDetailModel = null;
                        break;
                    }
                    while (true) {
                        if (i >= data.size()) {
                            i = -1;
                            postCommentDetailModel = null;
                            break;
                        }
                        postCommentDetailModel = data.get(i);
                        if (postCommentDetailModel != null) {
                            if (momentSendCommentModel3.getCid().equals(postCommentDetailModel.getId() + "")) {
                                postCommentDetailModel.addLocalSendingCommentReplyModel(momentSendCommentModel3);
                                break;
                            }
                        }
                        i++;
                    }
                    if (postCommentDetailModel != null) {
                        oooOOOO.OooO0O0(postCommentDetailModel, i);
                    }
                }
            }
        }
        StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("sendComment SendPostCommentModel = ");
        MomentSendCommentModel momentSendCommentModel4 = this.mSendPostCommentModel;
        sbOooO0O1.append(momentSendCommentModel4 != null ? momentSendCommentModel4.toJSONString() : null);
        o00O00.OooO0O0(sbOooO0O1.toString());
    }

    public final void setData(@Nullable MomentDetailModel postDetailModel, @Nullable PostCommentDetailModel postCommentDetailModel, @Nullable EditTextSpan editContentInput) {
        o00O00.OooOO0O("PostDetailCommentFragment setData");
        this.mPostDetailModel = postDetailModel;
        if (this.mSendPostCommentModel == null) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("");
            sbOooO0O0.append(postDetailModel != null ? Long.valueOf(postDetailModel.getId()) : null);
            this.mSendPostCommentModel = new MomentSendCommentModel(sbOooO0O0.toString());
        }
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        if (momentSendCommentModel != null) {
            StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("");
            sbOooO0O1.append(postDetailModel != null ? Long.valueOf(postDetailModel.getId()) : null);
            momentSendCommentModel.setDyid(sbOooO0O1.toString());
        }
        this.mEditContentInput = editContentInput;
        this.postCommentDetailModel = postCommentDetailModel;
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
        loadData(true, isMoveToListTop);
    }

    public final void toApiSendData(@Nullable MomentSendCommentModel sendPostCommentModel, boolean isReplyComment) {
        MomentDetailModel momentDetailModel;
        String jSONString;
        String jSONString2;
        o00O00.OooO0O0("toApiSendData \n SendPostCommentModel = " + sendPostCommentModel);
        if (sendPostCommentModel == null || (momentDetailModel = this.mPostDetailModel) == null) {
            return;
        }
        String str = "";
        if (isReplyComment) {
            if (String.valueOf(momentDetailModel.getUserId()).length() > 0) {
                MomentLogActionTypeCommentReply momentLogActionTypeCommentReply = new MomentLogActionTypeCommentReply(null, null, null, null, 15, null);
                momentLogActionTypeCommentReply.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
                momentLogActionTypeCommentReply.setDiscoveryid(com.yalla.support.common.util.OooO.OooO(Long.valueOf(momentDetailModel.getId()), ""));
                String cid = sendPostCommentModel.getCid();
                if (cid == null) {
                    cid = "";
                }
                momentLogActionTypeCommentReply.setCommentid(cid);
                MomentSendContentModel content = sendPostCommentModel.getContent();
                if (content != null && (jSONString2 = content.toJSONString()) != null) {
                    str = jSONString2;
                }
                momentLogActionTypeCommentReply.setReply_content(str);
                MomentLogActionType actionType = MomentLogActionType.comment_reply;
                String actionInfo = momentLogActionTypeCommentReply.toJson();
                String sessionId = momentDetailModel.getSessionId();
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO(actionType, actionInfo, sessionId, null), 3, null);
            }
        } else {
            if (String.valueOf(momentDetailModel.getUserId()).length() > 0) {
                MomentLogActionTypeComment momentLogActionTypeComment = new MomentLogActionTypeComment(null, null, null, 7, null);
                momentLogActionTypeComment.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
                momentLogActionTypeComment.setDiscoveryid(com.yalla.support.common.util.OooO.OooO(Long.valueOf(momentDetailModel.getId()), ""));
                MomentSendContentModel content2 = sendPostCommentModel.getContent();
                if (content2 != null && (jSONString = content2.toJSONString()) != null) {
                    str = jSONString;
                }
                momentLogActionTypeComment.setContent(str);
                MomentLogActionType actionType2 = MomentLogActionType.comment;
                String actionInfo2 = momentLogActionTypeComment.toJson();
                MomentDetailModel momentDetailModel2 = this.mPostDetailModel;
                String sessionId2 = momentDetailModel2 != null ? momentDetailModel2.getSessionId() : null;
                Intrinsics.checkNotNullParameter(actionType2, "actionType");
                Intrinsics.checkNotNullParameter(actionInfo2, "actionInfo");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO(actionType2, actionInfo2, sessionId2, null), 3, null);
            }
        }
        p154o00Oo0oO.o00oO0o o00oo0o2 = p154o00Oo0oO.o00000OO.f32228OooO00o;
        p154o00Oo0oO.o00000OO.f32234OooO0oO.OooO0O0(sendPostCommentModel, new Oooo0(sendPostCommentModel));
    }

    public final void toReplyComment(@NotNull PostCommentDetailModel postCommentDetailModel) {
        Intrinsics.checkNotNullParameter(postCommentDetailModel, "postCommentDetailModel");
        getBinding().f50386OooO0O0.postDelayed(new com.facebook.appevents.codeless.OooO0OO(this, postCommentDetailModel, 1), 200L);
    }

    @Override // p505o0o00o00.OooO
    @NotNull
    public qd getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        qd qdVarInflate = qd.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(qdVarInflate, "inflate(inflater, container, false)");
        return qdVarInflate;
    }
}
