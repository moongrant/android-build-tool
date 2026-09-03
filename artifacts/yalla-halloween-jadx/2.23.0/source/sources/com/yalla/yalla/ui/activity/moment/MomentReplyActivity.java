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
import androidx.core.view.o000OO00;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0Oo;
import com.common.support.apm.monitor.MonitorErrorCodeKt;
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
import p029Oooo0oo.oo0ooO;
import p403o0Oo0OOo.o0OO00o0;
import p485o0o00O0.o00O0OO;
import p485o0o00O0.o00OO0OO;
import p485o0o00O0.oo0o0O0;
import p526o0o0OOO0.oo0oOO0;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.y5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentReplyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentReplyActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,565:1\n22#2,2:566\n75#3,13:568\n75#3,13:581\n81#4:594\n107#4,2:595\n350#5,7:597\n*S KotlinDebug\n*F\n+ 1 MomentReplyActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentReplyActivity\n*L\n109#1:566,2\n111#1:568,13\n113#1:581,13\n162#1:594\n162#1:595,2\n538#1:597,7\n*E\n"})
public final class MomentReplyActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f26149OooOoO = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26150OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(y5.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26153OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentReplyActivityVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentReplyActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26169OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26169OooO0Oo;
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
    public final ViewModelLazy f26152OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentDetailActivityVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.MomentReplyActivity$special$$inlined$viewModels$default$5
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
        public final /* synthetic */ Function0 f26173OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26173OooO0Oo;
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
    public final Lazy f26154OooOo0O = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f26155OooOo0o = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f26151OooOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26156OooOoO0 = -1;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f26158OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f26159OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentReplyModel momentReplyModel, long j) {
            super(0);
            this.f26159OooO0o0 = momentReplyModel;
            this.f26158OooO0o = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentReplyActivity momentReplyActivity = MomentReplyActivity.this;
            momentReplyActivity.OooOoO().setCurrentComment(momentReplyActivity.OooOoO().getCurrentComment());
            MomentDetailActivityVM momentDetailActivityVMOooOoO = momentReplyActivity.OooOoO();
            MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
            momentDetailActivityVMOooOoO.setCurrentCommentId(currentComment != null ? Long.valueOf(currentComment.getId()) : null);
            MomentDetailActivityVM momentDetailActivityVMOooOoO2 = momentReplyActivity.OooOoO();
            MomentReplyModel momentReplyModel = this.f26159OooO0o0;
            momentDetailActivityVMOooOoO2.setCurrentReply(momentReplyModel);
            momentReplyActivity.OooOoO().setCurrentReplyId(Long.valueOf(momentReplyModel.getId()));
            MomentDetailActivityVM momentDetailActivityVMOooOoO3 = momentReplyActivity.OooOoO();
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(com.code.android.util.o0OoOo0.OooOO0(Long.valueOf(momentReplyModel.getUserid())));
            userInfo.setUserName(String.valueOf(momentReplyModel.getNickname()));
            momentDetailActivityVMOooOoO3.setReplyUserInfo(userInfo);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(momentReplyActivity), null, null, new o00Ooo(this.f26158OooO0o, momentReplyActivity, null), 3, null);
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
            return new o00O0O(MomentReplyActivity.this, oO00OO0O.item_moment_reply);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentReplyActivity$getReplays$1", f = "MomentReplyActivity.kt", i = {}, l = {MonitorErrorCodeKt.MONITOR_ERROR_SERVER_NETWORK_403}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMomentReplyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentReplyActivity$getReplays$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,565:1\n1855#2,2:566\n*S KotlinDebug\n*F\n+ 1 MomentReplyActivity.kt\ncom/yalla/yalla/ui/activity/moment/MomentReplyActivity$getReplays$1\n*L\n412#1:566,2\n*E\n"})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f26161OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f26162OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f26162OooO0o = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentReplyActivity.this.new OooO0OO(this.f26162OooO0o, continuation);
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
            int i = this.f26161OooO0Oo;
            boolean z2 = this.f26162OooO0o;
            MomentReplyActivity momentReplyActivity = MomentReplyActivity.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MomentReplyActivityVM momentReplyActivityVMOooOoo0 = momentReplyActivity.OooOoo0();
                this.f26161OooO0Oo = 1;
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
                int i2 = MomentReplyActivity.f26149OooOoO;
                momentReplyActivity.OooOoO0().f59392OooO0o.OooOoo(z2);
                momentReplyActivity.OooOoO0().f59393OooO0o0.OooOOO0(true);
                momentReplyActivity.OooOoO0().f59393OooO0o0.setVisibility(8);
            } else {
                if (com.code.android.util.OooOo00.OooO00o(apiResult.getData())) {
                    int i3 = MomentReplyActivity.f26149OooOoO;
                    momentReplyActivity.OooOoO0().f59392OooO0o.OooOooo(z2, true, true);
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
                        o0OO00o0 o0oo00o0OooOo0O = p581o0oOoo00.o000OOo.OooO00o().OooOo0O();
                        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                        long jLongValue = ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue();
                        StringBuilder sb = new StringBuilder();
                        sb.append(jOooOO0);
                        Iterator it2 = it;
                        sb.append("-");
                        sb.append(jOooOO1);
                        sb.append("-");
                        sb.append(id);
                        if (o0oo00o0OooOo0O.OooO0O0(2, jLongValue, sb.toString()) != null) {
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
                                    o000O<MomentReplyModel> o000oOooOo = momentReplyActivity.OooOo();
                                    MomentReplyModel postCommentSonModel3 = momentReplyActivity.OooOoo0().getPostCommentSonModel();
                                    Intrinsics.checkNotNull(postCommentSonModel3);
                                    o000oOooOo.OooO00o(postCommentSonModel3);
                                    i4 = 0;
                                }
                                momentReplyActivity.f26156OooOoO0 = momentReplyActivity.OooOo().OooOOO0() + i4;
                                momentReplyActivity.OooOoO0().f59391OooO0Oo.smoothScrollToPosition(momentReplyActivity.f26156OooOoO0);
                                momentReplyActivity.OooOoo0().setPostCommentSonModel(null);
                                momentReplyActivity.OooOoO0().f59391OooO0Oo.postDelayed(new p022Oooo00O.o0ooOOo(momentReplyActivity, 1), momentReplyActivity.OooOoo0().getDelayMillsCommentMessageChangeColor());
                                z = false;
                            } else {
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) momentReplyActivity.OooOoO0().f59391OooO0Oo.getLayoutManager();
                                Intrinsics.checkNotNull(linearLayoutManager);
                                linearLayoutManager.scrollToPositionWithOffset(0, 0);
                                z = false;
                            }
                        } else {
                            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) momentReplyActivity.OooOoO0().f59391OooO0Oo.getLayoutManager();
                            Intrinsics.checkNotNull(linearLayoutManager2);
                            linearLayoutManager2.scrollToPositionWithOffset(0, 0);
                            z = false;
                        }
                    } else {
                        z = false;
                        momentReplyActivity.OooOo().OooO0O0(list);
                    }
                    momentReplyActivity.OooOoO0().f59393OooO0o0.OooOOO0(true);
                    momentReplyActivity.OooOoO0().f59393OooO0o0.setVisibility(8);
                    momentReplyActivity.OooOoo0().setPageIndex(apiResult.getPage().getPageIndex() + 1);
                    XRefreshLayout xRefreshLayout = momentReplyActivity.OooOoO0().f59392OooO0o;
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
        public final /* synthetic */ long f26166OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j) {
            super(0);
            this.f26166OooO0o0 = j;
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
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(momentReplyActivity), null, null, new oo000o(this.f26166OooO0o0, momentReplyActivity, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public final o000O<MomentReplyModel> OooOo() {
        return (o000O) this.f26155OooOo0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentDetailActivityVM OooOoO() {
        return (MomentDetailActivityVM) this.f26152OooOo0.getValue();
    }

    public final y5 OooOoO0() {
        return (y5) this.f26150OooOOoo.getValue();
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
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
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
        return (MomentReplyActivityVM) this.f26153OooOo00.getValue();
    }

    public final void OooOooO(long j) {
        if (isDestroyed()) {
            return;
        }
        OooOO0 onLogin = new OooOO0(j);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
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
        oo0oOO0.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(5, com.code.android.util.o0OoOo0.OooO(0L, cid), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : Long.valueOf(com.code.android.util.o0OoOo0.OooO(0L, OooOoo0().getMomentId())), (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f59388OooO00o);
        o000OO00.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(o0000.OooO00o(oO00O0o.transparent));
        HeaderLayout fitTopInset = this.f22755OooOO0;
        if (fitTopInset != null) {
            Intrinsics.checkNotNullParameter(fitTopInset, "$this$fitTopInset");
            p370o0OOoO.OooOO0O oooOO0O = new p370o0OOoO.OooOO0O(fitTopInset, true, false);
            WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO.OooOo0(fitTopInset, oooOO0O);
        }
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.OooOo0O();
        }
        OooOoO0().f59392OooO0o.setOnRefreshListener(new p562o0oOo0O.o000oOoO() { // from class: o0o00O0.o00O0O0
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                int i = MomentReplyActivity.f26149OooOoO;
                MomentReplyActivity this$0 = this.f47840OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoOO(true);
            }
        });
        OooOoO0().f59392OooO0o.setOnLoadMoreListener(new p562o0oOo0O.o000oOoO() { // from class: o0o00O0.o00O0O0O
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                int i = MomentReplyActivity.f26149OooOoO;
                MomentReplyActivity this$0 = this.f47842OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoOO(false);
            }
        });
        ComposeView composeView = OooOoO0().f59389OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.bottomComposeView");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1959669513, true, new o00OO0OO(this)));
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
        p592o0oo00O.OooOOO0.OooO0Oo("initData postCommentSonModel = " + OooOoo0() + ".postCommentSonModel");
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            String string = getString(oO00OOo0.xxx_replies);
            MomentCommentDetailModel currentComment3 = OooOoO().getCurrentComment();
            Intrinsics.checkNotNull(currentComment3);
            headerLayout2.setTitle(o0000O.OooO00o(string, oo0ooO.OooO00o(currentComment3.getNum())));
        }
        if (OooOoO().getCurrentComment() == null) {
            finish();
        } else {
            OooOooO(0L);
            OooOo().OooOo(((MomentReplyHeaderView) this.f26154OooOo0O.getValue()).getRootView());
            OooOoO0().f59391OooO0Oo.setLayoutManager(new FixLinearLayoutManager(this));
            OooOoO0().f59391OooO0Oo.setAdapter(OooOo());
            OooOoO().setCurrentComment(OooOoO().getCurrentComment());
            MomentDetailActivityVM momentDetailActivityVMOooOoO2 = OooOoO();
            MomentCommentDetailModel currentComment4 = OooOoO().getCurrentComment();
            momentDetailActivityVMOooOoO2.setCurrentCommentId(currentComment4 != null ? Long.valueOf(currentComment4.getId()) : null);
        }
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_ADD").observe(this, new oo0o0O0(this));
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_DEL").observe(this, new o00O0OO(this));
        OooOoOO(true);
        OooOoO().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOoO().statisticalTime();
    }
}
