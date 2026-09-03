package com.yalla.yalla.ui.activity.moment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00oOoo;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.session.o0000O0;
import androidx.media3.session.o0000O0O;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyActivityVM;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0OOO00;
import p379o0OOoOOO.o00O00O;
import p405o0Oo0OOO.oOo00o00;
import p407o0Oo0Oo.o00O0OO0;
import p448o0OoOoo.o00O00o0;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.o00O;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;
import p571o0oOoO0.o0000oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentReplyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentReplyActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,568:1\n22#2,2:569\n75#3,13:571\n75#3,13:584\n81#4:597\n107#4,2:598\n350#5,7:600\n*S KotlinDebug\n*F\n+ 1 MomentReplyActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentReplyActivity\n*L\n110#1:569,2\n112#1:571,13\n114#1:584,13\n163#1:597\n163#1:598,2\n541#1:600,7\n*E\n"})
public final class MomentReplyActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f25700OooOoO = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25701OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oOo00o00.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25704OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentReplyActivityVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentReplyActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentReplyActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentReplyActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25720OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25720OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25703OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentDetailActivityVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentReplyActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.MomentReplyActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.MomentReplyActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25724OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25724OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25705OooOo0O = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25706OooOo0o = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f25702OooOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f25707OooOoO0 = -1;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f25709OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f25710OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentReplyModel momentReplyModel, long j) {
            super(0);
            this.f25710OooO0o0 = momentReplyModel;
            this.f25709OooO0o = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentReplyActivity momentReplyActivity = MomentReplyActivity.this;
            momentReplyActivity.OooOoO().setCurrentComment(momentReplyActivity.OooOoO().getCurrentComment());
            MomentDetailActivityVM momentDetailActivityVMOooOoO = momentReplyActivity.OooOoO();
            MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
            momentDetailActivityVMOooOoO.setCurrentCommentId(currentComment != null ? Long.valueOf(currentComment.getId()) : null);
            MomentDetailActivityVM momentDetailActivityVMOooOoO2 = momentReplyActivity.OooOoO();
            MomentReplyModel momentReplyModel = this.f25710OooO0o0;
            momentDetailActivityVMOooOoO2.setCurrentReply(momentReplyModel);
            momentReplyActivity.OooOoO().setCurrentReplyId(Long.valueOf(momentReplyModel.getId()));
            MomentDetailActivityVM momentDetailActivityVMOooOoO3 = momentReplyActivity.OooOoO();
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(com.code.android.util.o0OoOo0.OooOO0(Long.valueOf(momentReplyModel.getUserid())));
            userInfo.setUserName(String.valueOf(momentReplyModel.getNickname()));
            momentDetailActivityVMOooOoO3.setReplyUserInfo(userInfo);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(momentReplyActivity), null, null, new o00Ooo(this.f25709OooO0o, momentReplyActivity, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@Nullable FragmentActivity fragmentActivity, boolean z, @Nullable MomentDetailModel momentDetailModel, @Nullable MomentCommentDetailModel momentCommentDetailModel, @Nullable MomentReplyModel momentReplyModel) {
            if (fragmentActivity != null) {
                Intent intent = new Intent(fragmentActivity, (Class<?>) MomentReplyActivity.class);
                intent.putExtra("From", z);
                intent.putExtra("Data", momentDetailModel);
                intent.putExtra("Module", momentCommentDetailModel);
                intent.putExtra("Type", momentReplyModel);
                fragmentActivity.startActivity(intent);
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00O0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0O invoke() {
            return new o00O0O(MomentReplyActivity.this, p562o0oOo000.oo0o0Oo.item_moment_reply);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentReplyActivity$getReplays$1", f = "MomentReplyActivity.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMomentReplyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentReplyActivity$getReplays$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,568:1\n1855#2,2:569\n*S KotlinDebug\n*F\n+ 1 MomentReplyActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentReplyActivity$getReplays$1\n*L\n415#1:569,2\n*E\n"})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25712OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f25713OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25713OooO0o = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentReplyActivity.this.new OooO0OO(this.f25713OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x0188  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object replays;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25712OooO0Oo;
            boolean z2 = this.f25713OooO0o;
            MomentReplyActivity momentReplyActivity = MomentReplyActivity.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MomentReplyActivityVM momentReplyActivityVMOooOoo0 = momentReplyActivity.OooOoo0();
                this.f25712OooO0Oo = 1;
                replays = momentReplyActivityVMOooOoo0.getReplays(z2, this);
                if (replays == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                replays = obj;
            }
            ApiResult apiResult = (ApiResult) replays;
            if (!apiResult.isSuccess()) {
                int i2 = MomentReplyActivity.f25700OooOoO;
                momentReplyActivity.OooOoO0().f45218OooO0o.OooOoo(z2);
                momentReplyActivity.OooOoO0().f45219OooO0o0.OooOOO0(true);
                momentReplyActivity.OooOoO0().f45219OooO0o0.setVisibility(8);
            } else {
                if (com.code.android.util.OooOo00.OooO00o(apiResult.getData())) {
                    int i3 = MomentReplyActivity.f25700OooOoO;
                    momentReplyActivity.OooOoO0().f45218OooO0o.OooOooo(z2, true, true);
                    return Unit.INSTANCE;
                }
                List<MomentReplyModel> list = (List) apiResult.getData();
                if (list != null) {
                    MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
                    long jOooOO0 = com.code.android.util.o0OoOo0.OooOO0(currentMomentDetail != null ? Boxing.boxLong(currentMomentDetail.getId()) : null);
                    MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
                    long jOooOO1 = com.code.android.util.o0OoOo0.OooOO0(currentComment != null ? Boxing.boxLong(currentComment.getId()) : null);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MomentReplyModel momentReplyModel = (MomentReplyModel) it.next();
                        long id = momentReplyModel.getId();
                        o00O0OO0 o00o0oo0OooOo0o = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOo0o();
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        long jLongValue = ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue();
                        StringBuilder sb = new StringBuilder();
                        sb.append(jOooOO0);
                        Iterator it2 = it;
                        sb.append("-");
                        sb.append(jOooOO1);
                        sb.append("-");
                        sb.append(id);
                        if (o00o0oo0OooOo0o.OooO0O0(2, jLongValue, sb.toString()) != null) {
                            momentReplyModel.setHide(true);
                        }
                        momentReplyModel.setLocalMomentId(jOooOO0);
                        momentReplyModel.setLocalCommentId(jOooOO1);
                        it = it2;
                    }
                    if (z2) {
                        momentReplyActivity.OooOo().OooOoO0(list);
                        if (momentReplyActivity.OooOoo0().getPostCommentSonModel() != null) {
                            MomentReplyModel postCommentSonModel = momentReplyActivity.OooOoo0().getPostCommentSonModel();
                            Intrinsics.checkNotNull(postCommentSonModel);
                            if (postCommentSonModel.getId() > 0) {
                                int size = list.size();
                                int i4 = -1;
                                for (int i5 = 0; i5 < size; i5++) {
                                    MomentReplyModel momentReplyModel2 = list.get(i5);
                                    long id2 = momentReplyModel2.getId();
                                    MomentReplyModel postCommentSonModel2 = momentReplyActivity.OooOoo0().getPostCommentSonModel();
                                    Intrinsics.checkNotNull(postCommentSonModel2);
                                    if (id2 == postCommentSonModel2.getId()) {
                                        momentReplyModel2.setLocalMessageDiscolor(true);
                                        i4 = i5;
                                    }
                                }
                                if (i4 < 0) {
                                    o0000oo<MomentReplyModel> o0000ooVarOooOo = momentReplyActivity.OooOo();
                                    MomentReplyModel postCommentSonModel3 = momentReplyActivity.OooOoo0().getPostCommentSonModel();
                                    Intrinsics.checkNotNull(postCommentSonModel3);
                                    o0000ooVarOooOo.OooO00o(postCommentSonModel3);
                                    i4 = 0;
                                }
                                momentReplyActivity.f25707OooOoO0 = momentReplyActivity.OooOo().OooOOO0() + i4;
                                momentReplyActivity.OooOoO0().f45217OooO0Oo.smoothScrollToPosition(momentReplyActivity.f25707OooOoO0);
                                momentReplyActivity.OooOoo0().setPostCommentSonModel(null);
                                momentReplyActivity.OooOoO0().f45217OooO0Oo.postDelayed(new o0OOO00(momentReplyActivity, 2), momentReplyActivity.OooOoo0().getDelayMillsCommentMessageChangeColor());
                                z = false;
                            } else {
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) momentReplyActivity.OooOoO0().f45217OooO0Oo.getLayoutManager();
                                Intrinsics.checkNotNull(linearLayoutManager);
                                linearLayoutManager.scrollToPositionWithOffset(0, 0);
                                z = false;
                            }
                        } else {
                            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) momentReplyActivity.OooOoO0().f45217OooO0Oo.getLayoutManager();
                            Intrinsics.checkNotNull(linearLayoutManager2);
                            linearLayoutManager2.scrollToPositionWithOffset(0, 0);
                            z = false;
                        }
                    } else {
                        z = false;
                        momentReplyActivity.OooOo().OooO0O0(list);
                    }
                    momentReplyActivity.OooOoO0().f45219OooO0o0.OooOOO0(true);
                    momentReplyActivity.OooOoO0().f45219OooO0o0.setVisibility(8);
                    momentReplyActivity.OooOoo0().setPageIndex(apiResult.getPage().getPageIndex() + 1);
                    XRefreshLayout xRefreshLayout = momentReplyActivity.OooOoO0().f45218OooO0o;
                    if (list.size() < 20) {
                        z = true;
                    }
                    xRefreshLayout.OooOooo(z2, true, z);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<MomentReplyHeaderView> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentReplyHeaderView invoke() {
            MomentReplyActivity momentReplyActivity = MomentReplyActivity.this;
            MomentReplyHeaderView momentReplyHeaderView = new MomentReplyHeaderView(momentReplyActivity);
            momentReplyHeaderView.setData(momentReplyActivity.OooOoO().getCurrentComment());
            momentReplyHeaderView.setSelectType(momentReplyActivity.OooOoo0().getSortType());
            momentReplyHeaderView.setShowOriginal(momentReplyActivity.OooOoo0().getPostCommentSonModel() != null);
            momentReplyHeaderView.setItemListener(new o00Oo0(momentReplyActivity));
            return momentReplyHeaderView;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f25717OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j) {
            super(0);
            this.f25717OooO0o0 = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentReplyActivity momentReplyActivity = MomentReplyActivity.this;
            momentReplyActivity.OooOoO().setCurrentComment(momentReplyActivity.OooOoO().getCurrentComment());
            MomentDetailActivityVM momentDetailActivityVMOooOoO = momentReplyActivity.OooOoO();
            MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
            momentDetailActivityVMOooOoO.setCurrentCommentId(currentComment != null ? Long.valueOf(currentComment.getId()) : null);
            momentReplyActivity.OooOoO().setCurrentReply(null);
            momentReplyActivity.OooOoO().setCurrentReplyId(null);
            momentReplyActivity.OooOoO().setReplyUserInfo(null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(momentReplyActivity), null, null, new oo000o(this.f25717OooO0o0, momentReplyActivity, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public final o0000oo<MomentReplyModel> OooOo() {
        return (o0000oo) this.f25706OooOo0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentDetailActivityVM OooOoO() {
        return (MomentDetailActivityVM) this.f25703OooOo0.getValue();
    }

    public final oOo00o00 OooOoO0() {
        return (oOo00o00) this.f25701OooOOoo.getValue();
    }

    public final void OooOoOO(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0OO(z, null), 3, null);
    }

    public final void OooOoo(@NotNull MomentReplyModel data, long j) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (isDestroyed()) {
            return;
        }
        OooO onLogin = new OooO(data, j);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentReplyActivityVM OooOoo0() {
        return (MomentReplyActivityVM) this.f25704OooOo00.getValue();
    }

    public final void OooOooO(long j) {
        if (isDestroyed()) {
            return;
        }
        OooOO0 onLogin = new OooOO0(j);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public final void OooOooo(@NotNull String cid) {
        Intrinsics.checkNotNullParameter(cid, "cid");
        o00O00.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(5, com.code.android.util.o0OoOo0.OooO(0L, cid), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : Long.valueOf(com.code.android.util.o0OoOo0.OooO(0L, OooOoo0().getMomentId())), (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f45214OooO00o);
        o00oOoo.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.transparent));
        HeaderLayout fitTopInset = this.f22282OooOO0;
        int i = 1;
        if (fitTopInset != null) {
            Intrinsics.checkNotNullParameter(fitTopInset, "$this$fitTopInset");
            o00O00O o00o00o2 = new o00O00O(fitTopInset, true, false);
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOOO.OooOo0(fitTopInset, o00o00o2);
        }
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.OooOo0O();
        }
        OooOoO0().f45218OooO0o.setOnRefreshListener(new o0000O0(this, 1));
        OooOoO0().f45218OooO0o.setOnLoadMoreListener(new o0000O0O(this));
        ComposeView bottomComposeView = OooOoO0().f45215OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bottomComposeView, "bottomComposeView");
        p193o00o0O0O.o0000oo.OooO0Oo(bottomComposeView, ComposableLambdaKt.composableLambdaInstance(1959669513, true, new o00O(this)));
        OooOoo0().setFromPostDetail(getIntent().getBooleanExtra("From", false));
        OooOoO().setCurrentMomentDetail((MomentDetailModel) getIntent().getSerializableExtra("Data"));
        OooOoO().setCurrentComment((MomentCommentDetailModel) getIntent().getSerializableExtra("Module"));
        MomentDetailActivityVM momentDetailActivityVMOooOoO = OooOoO();
        MomentCommentDetailModel currentComment = OooOoO().getCurrentComment();
        momentDetailActivityVMOooOoO.setCurrentCommentId(currentComment != null ? Long.valueOf(currentComment.getId()) : null);
        MomentReplyActivityVM momentReplyActivityVMOooOoo0 = OooOoo0();
        MomentDetailModel currentMomentDetail = OooOoO().getCurrentMomentDetail();
        Long lValueOf = currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(lValueOf);
        momentReplyActivityVMOooOoo0.setMomentId(sb.toString());
        MomentReplyActivityVM momentReplyActivityVMOooOoo1 = OooOoo0();
        MomentDetailModel currentMomentDetail2 = OooOoO().getCurrentMomentDetail();
        momentReplyActivityVMOooOoo1.setMomentUserId(com.code.android.util.o0OoOo0.OooOO0(currentMomentDetail2 != null ? Long.valueOf(currentMomentDetail2.getUserId()) : null));
        MomentReplyActivityVM momentReplyActivityVMOooOoo2 = OooOoo0();
        MomentCommentDetailModel currentComment2 = OooOoO().getCurrentComment();
        momentReplyActivityVMOooOoo2.setCommentId(com.code.android.util.o0OoOo0.OooOO0(currentComment2 != null ? Long.valueOf(currentComment2.getId()) : null));
        OooOoo0().setPostCommentSonModel((MomentReplyModel) getIntent().getSerializableExtra("Type"));
        o0000O00.OooO0Oo("initData postCommentSonModel = " + OooOoo0() + ".postCommentSonModel");
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            String string = getString(p562o0oOo000.o000000.xxx_replies);
            MomentCommentDetailModel currentComment3 = OooOoO().getCurrentComment();
            Intrinsics.checkNotNull(currentComment3);
            headerLayout2.setTitle(o0000O.OooO00o(string, androidx.media3.session.o0000O00.OooO00o(currentComment3.getNum())));
        }
        if (OooOoO().getCurrentComment() == null) {
            finish();
        } else {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                OooOooO(0L);
            }
            OooOo().OooOo(((MomentReplyHeaderView) this.f25705OooOo0O.getValue()).getRootView());
            OooOoO0().f45217OooO0Oo.setLayoutManager(new FixLinearLayoutManager(this));
            OooOoO0().f45217OooO0Oo.setAdapter(OooOo());
            OooOoO().setCurrentComment(OooOoO().getCurrentComment());
            MomentDetailActivityVM momentDetailActivityVMOooOoO2 = OooOoO();
            MomentCommentDetailModel currentComment4 = OooOoO().getCurrentComment();
            momentDetailActivityVMOooOoO2.setCurrentCommentId(currentComment4 != null ? Long.valueOf(currentComment4.getId()) : null);
        }
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_ADD").observe(this, new o00O00o0(this, i));
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_DEL").observe(this, new Observer() { // from class: o0o00OO0.o00O0O00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object result) {
                int i2 = MomentReplyActivity.f25700OooOoO;
                MomentReplyActivity this$0 = this.f49164OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                if (((Boolean) result).booleanValue()) {
                    MomentCommentDetailModel currentComment5 = this$0.OooOoO().getCurrentComment();
                    Intrinsics.checkNotNull(currentComment5);
                    currentComment5.setNum(currentComment5.getNum() - 1);
                    MomentCommentDetailModel currentComment6 = this$0.OooOoO().getCurrentComment();
                    Intrinsics.checkNotNull(currentComment6);
                    if (currentComment6.getNum() <= 0) {
                        this$0.finish();
                    }
                    HeaderLayout headerLayout3 = this$0.f22282OooOO0;
                    if (headerLayout3 != null) {
                        String string2 = this$0.getString(o000000.xxx_replies);
                        MomentCommentDetailModel currentComment7 = this$0.OooOoO().getCurrentComment();
                        Intrinsics.checkNotNull(currentComment7);
                        headerLayout3.setTitle(o0000O.OooO00o(string2, androidx.media3.session.o0000O00.OooO00o(currentComment7.getNum())));
                    }
                }
            }
        });
        OooOoOO(true);
        OooOoO().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOoO().statisticalTime();
    }
}
