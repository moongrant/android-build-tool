package com.yalla.yalla.ui.activity.moment;

import com.yalla.yalla.data.db.model.TopicRecentTable;
import com.yalla.yalla.model.topic.TopicInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p403o0Oo0OOo.oO0O0Oo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.AddTopicListActivity$loadRecentlyList$1", f = "AddTopicListActivity.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAddTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity$loadRecentlyList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,556:1\n1864#2,3:557\n*S KotlinDebug\n*F\n+ 1 AddTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/AddTopicListActivity$loadRecentlyList$1\n*L\n229#1:557,3\n*E\n"})
public final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f26210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f26211OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.AddTopicListActivity$loadRecentlyList$1$2", f = "AddTopicListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AddTopicListActivity f26212OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Lazy<List<TopicInfoModel>> f26213OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Lazy<List<TopicInfoModel>> f26214OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(AddTopicListActivity addTopicListActivity, Lazy<? extends List<TopicInfoModel>> lazy, Lazy<? extends List<TopicInfoModel>> lazy2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26212OooO0Oo = addTopicListActivity;
            this.f26214OooO0o0 = lazy;
            this.f26213OooO0o = lazy2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f26212OooO0Oo, this.f26214OooO0o0, this.f26213OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AddTopicListActivity.OooO00o oooO00o = (AddTopicListActivity.OooO00o) this.f26212OooO0Oo.f26012OooOo0.getValue();
            List<TopicInfoModel> listAllTemp = this.f26214OooO0o0.getValue();
            List<TopicInfoModel> listMax3 = this.f26213OooO0o.getValue();
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(listAllTemp, "listAllTemp");
            Intrinsics.checkNotNullParameter(listMax3, "listMax3");
            Lazy lazy = oooO00o.f26023Oooo0;
            ((List) lazy.getValue()).clear();
            Lazy lazy2 = oooO00o.f26027Oooo0O0;
            ((List) lazy2.getValue()).clear();
            ((List) lazy.getValue()).addAll(listAllTemp);
            ((List) lazy2.getValue()).addAll(listMax3);
            oooO00o.OooOoO0(listMax3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<List<TopicInfoModel>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f26215OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<TopicInfoModel> invoke() {
            return new ArrayList();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<List<TopicInfoModel>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f26216OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<TopicInfoModel> invoke() {
            return new ArrayList();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(AddTopicListActivity addTopicListActivity, Continuation<? super OooO> continuation) {
        super(2, continuation);
        this.f26211OooO0o0 = addTopicListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO(this.f26211OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26210OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = LazyKt.lazy(OooO0OO.f26216OooO0Oo);
            Lazy lazy2 = LazyKt.lazy(OooO0O0.f26215OooO0Oo);
            oO0O0Oo0 oo0o0oo0Oooo00O = p581o0oOoo00.o000OOo.OooO00o().Oooo00O();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            ArrayList listTopicRecent = oo0o0oo0Oooo00O.OooO00o(String.valueOf(p464o0Oooo.o000000O.OooOOo0().getValue()));
            Intrinsics.checkNotNullExpressionValue(listTopicRecent, "listTopicRecent");
            int i2 = 0;
            for (Object obj2 : listTopicRecent) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TopicRecentTable topicRecentTable = (TopicRecentTable) obj2;
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                topicInfoModel.setId(topicRecentTable.topicId);
                String str = topicRecentTable.topicName;
                Intrinsics.checkNotNullExpressionValue(str, "item.topicName");
                topicInfoModel.setName(str);
                topicInfoModel.setRecentlyLocal(true);
                if (i2 == 0) {
                    topicInfoModel.setTitleLocal(true);
                }
                if (i2 < 3) {
                    ((List) lazy.getValue()).add(topicInfoModel);
                }
                ((List) lazy2.getValue()).add(topicInfoModel);
                i2 = i3;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(this.f26211OooO0o0, lazy2, lazy, null);
            this.f26210OooO0Oo = 1;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
