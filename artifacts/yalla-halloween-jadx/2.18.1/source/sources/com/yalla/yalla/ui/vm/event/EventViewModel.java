package com.yalla.yalla.ui.vm.event;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.RoomIndexModel;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventCreateStateModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.EventSubscribeModel;
import com.yalla.yalla.model.SquareEventRoomModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o0o0000.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.Oooo0;
import p617o0oo0o.o0ooOOo;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R+\u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*8\u0006¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R+\u00103\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/yalla/yalla/ui/vm/event/EventViewModel;", "Lo00OO/OooO00o;", "", "getSquareEventRoom", "", ContributionFragment.ARG_1, "updateReadState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/EventCreateStateModel;", "getCreateEventState", "Lcom/yalla/yalla/model/EventModel;", "eventModel", "Lkotlin/Function1;", "", "requestAction", "subscribeEvent", "", "list", "updateTimeDivision", "", "today", "Ljava/lang/String;", "weekly", "nextWeekly", "<set-?>", "roomIdForUser$delegate", "Lo000oOoO/o0O00OO;", "getRoomIdForUser", "()J", "setRoomIdForUser", "(J)V", "roomIdForUser", "roomId$delegate", "getRoomId", "setRoomId", "LOooooo0/o00OO0OO;", "Lcom/yalla/yalla/model/SquareEventRoomModel;", "squareEventRooms", "LOooooo0/o00OO0OO;", "getSquareEventRooms", "()LOooooo0/o00OO0OO;", "Lo000oOoO/o0O00OO;", "showAddToCalendarDialog", "getShowAddToCalendarDialog", "()Lo000oOoO/o0O00OO;", "addToCalendarEventModel$delegate", "getAddToCalendarEventModel", "()Lcom/yalla/yalla/model/EventModel;", "setAddToCalendarEventModel", "(Lcom/yalla/yalla/model/EventModel;)V", "addToCalendarEventModel", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class EventViewModel extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final String today = o000O0O0.OooO0OO(R.string.Room_Event_Today);

    @NotNull
    private final String weekly = o000O0O0.OooO0OO(R.string.Room_Event_This_Week);

    @NotNull
    private final String nextWeekly = o000O0O0.OooO0OO(R.string.Room_Event_Next_Week);

    /* JADX INFO: renamed from: roomIdForUser$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO roomIdForUser = o0OOO00.OooO0Oo(0L);

    /* JADX INFO: renamed from: roomId$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO roomId = o0OOO00.OooO0Oo(0L);

    @NotNull
    private final o00OO0OO<SquareEventRoomModel> squareEventRooms = new o00OO0OO<>();

    @NotNull
    private final o0O00OO<Boolean> showAddToCalendarDialog = o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: addToCalendarEventModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO addToCalendarEventModel = o0OOO00.OooO0Oo(new EventModel());

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventViewModel$getCreateEventState$1$1", f = "EventViewModel.kt", i = {}, l = {77, 78}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25445Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f25446Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow<ApiResult<EventCreateStateModel>> f25447Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, MutableSharedFlow<ApiResult<EventCreateStateModel>> mutableSharedFlow, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25446Oooo0oO = j;
            this.f25447Oooo0oo = mutableSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25446Oooo0oO, this.f25447Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25445Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Oooo0 oooo0 = Oooo0.f42257OooO00o;
            long j = this.f25446Oooo0oO;
            this.f25445Oooo0o = 1;
            obj = oooo0.OooO0Oo(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MutableSharedFlow<ApiResult<EventCreateStateModel>> mutableSharedFlow = this.f25447Oooo0oo;
            this.f25445Oooo0o = 2;
            if (mutableSharedFlow.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventViewModel$getSquareEventRoom$1", f = "EventViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25448Oooo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventViewModel.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25448Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0 oooo0 = Oooo0.f42257OooO00o;
                this.f25448Oooo0o = 1;
                obj = oooo0.OooO0o0(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) ((ApiResult) obj).getData();
            if (list != null) {
                EventViewModel eventViewModel = EventViewModel.this;
                eventViewModel.getSquareEventRooms().clear();
                eventViewModel.getSquareEventRooms().addAll(list);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f25450Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            bool.booleanValue();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventViewModel$subscribeEvent$2", f = "EventViewModel.kt", i = {}, l = {85, 86}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f25451Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25452Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ EventModel f25454Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventViewModel$subscribeEvent$2$1", f = "EventViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<ApiResult<EventSubscribeModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ EventViewModel f25455Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EventViewModel eventViewModel, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25455Oooo0o = eventViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f25455Oooo0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<EventSubscribeModel> apiResult, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f25455Oooo0o.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventViewModel$subscribeEvent$2$2", f = "EventViewModel.kt", i = {0}, l = {105}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class OooO0O0 extends SuspendLambda implements Function2<EventSubscribeModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ EventViewModel f25456Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f25457Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f25458Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ EventModel f25459Oooo0oo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ Function1<Boolean, Unit> f25460OoooO00;

            public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ EventViewModel f25461Oooo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EventViewModel eventViewModel) {
                    super(1);
                    this.f25461Oooo0o = eventViewModel;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Boolean bool) {
                    if (bool.booleanValue()) {
                        this.f25461Oooo0o.getShowAddToCalendarDialog().setValue(Boolean.TRUE);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.event.EventViewModel$OooO0o$OooO0O0$OooO0O0, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventViewModel$subscribeEvent$2$2$2", f = "EventViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0264OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ EventModel f25462Oooo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0264OooO0O0(EventModel eventModel, Continuation<? super C0264OooO0O0> continuation) {
                    super(2, continuation);
                    this.f25462Oooo0o = eventModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0264OooO0O0(this.f25462Oooo0o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0264OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    Context context = o0000O.f2657OooO00o;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                        context = null;
                    }
                    String title = this.f25462Oooo0o.getEventName();
                    Intrinsics.checkNotNullParameter(title, "title");
                    if (context != null) {
                        try {
                            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.android.calendar/events"), null, null, null, null);
                            if (cursorQuery == null) {
                                CloseableKt.closeFinally(cursorQuery, null);
                            } else {
                                try {
                                    if (cursorQuery.getCount() > 0) {
                                        cursorQuery.moveToFirst();
                                        while (!cursorQuery.isAfterLast()) {
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndex(ShareConstants.WEB_DIALOG_PARAM_TITLE));
                                            if (!TextUtils.isEmpty(title) && Intrinsics.areEqual(title, string)) {
                                                Uri uriWithAppendedId = ContentUris.withAppendedId(Uri.parse("content://com.android.calendar/events"), cursorQuery.getInt(cursorQuery.getColumnIndex(ao.d)));
                                                Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(Uri.parse…_EVENT_URL), id.toLong())");
                                                if (context.getContentResolver().delete(uriWithAppendedId, null, null) == -1) {
                                                    CloseableKt.closeFinally(cursorQuery, null);
                                                }
                                            }
                                            cursorQuery.moveToNext();
                                        }
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(cursorQuery, null);
                                    } else {
                                        Unit unit2 = Unit.INSTANCE;
                                        CloseableKt.closeFinally(cursorQuery, null);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(cursorQuery, th);
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(EventModel eventModel, EventViewModel eventViewModel, Function1<? super Boolean, Unit> function1, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f25459Oooo0oo = eventModel;
                this.f25456Oooo = eventViewModel;
                this.f25460OoooO00 = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f25459Oooo0oo, this.f25456Oooo, this.f25460OoooO00, continuation);
                oooO0O0.f25458Oooo0oO = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EventSubscribeModel eventSubscribeModel, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(eventSubscribeModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                EventSubscribeModel eventSubscribeModel;
                EventSubscribeModel eventSubscribeModel2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f25457Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    eventSubscribeModel = (EventSubscribeModel) this.f25458Oooo0oO;
                    if (this.f25459Oooo0oo.getHasSubscribe()) {
                        this.f25456Oooo.getShowAddToCalendarDialog().setValue(Boxing.boxBoolean(false));
                        Context context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        if (o0O0O00.OooO0O0(context, oo0o0Oo.f48610OooO0o0)) {
                            CoroutineDispatcher io2 = Dispatchers.getIO();
                            C0264OooO0O0 c0264OooO0O0 = new C0264OooO0O0(this.f25459Oooo0oo, null);
                            this.f25458Oooo0oO = eventSubscribeModel;
                            this.f25457Oooo0o = 1;
                            if (BuildersKt.withContext(io2, c0264OooO0O0, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eventSubscribeModel2 = eventSubscribeModel;
                        }
                    } else {
                        this.f25456Oooo.setAddToCalendarEventModel(this.f25459Oooo0oo);
                        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
                        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            contextOooO0O0 = null;
                        }
                        Activity activity = contextOooO0O0 instanceof Activity ? (Activity) contextOooO0O0 : null;
                        if (activity != null) {
                            o0O0O00.OooO0OO(activity, oo0o0Oo.f48610OooO0o0, null, new OooO00o(this.f25456Oooo));
                        }
                    }
                    LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER").post(new SubscribeNotifyModel(this.f25459Oooo0oo.getId(), !this.f25459Oooo0oo.getHasSubscribe(), eventSubscribeModel != null ? eventSubscribeModel.getSubCount() : 0));
                    this.f25460OoooO00.invoke(Boxing.boxBoolean(!this.f25459Oooo0oo.getHasSubscribe()));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventSubscribeModel2 = (EventSubscribeModel) this.f25458Oooo0oO;
                ResultKt.throwOnFailure(obj);
                eventSubscribeModel = eventSubscribeModel2;
                LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER").post(new SubscribeNotifyModel(this.f25459Oooo0oo.getId(), !this.f25459Oooo0oo.getHasSubscribe(), eventSubscribeModel != null ? eventSubscribeModel.getSubCount() : 0));
                this.f25460OoooO00.invoke(Boxing.boxBoolean(!this.f25459Oooo0oo.getHasSubscribe()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(EventModel eventModel, Function1<? super Boolean, Unit> function1, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25454Oooo0oo = eventModel;
            this.f25451Oooo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventViewModel.this.new OooO0o(this.f25454Oooo0oo, this.f25451Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25452Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EventViewModel.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            Oooo0 oooo0 = Oooo0.f42257OooO00o;
            long id = this.f25454Oooo0oo.getId();
            int i2 = !this.f25454Oooo0oo.getHasSubscribe() ? 1 : 0;
            this.f25452Oooo0o = 1;
            obj = oooo0.OooOOO0(id, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO00o oooO00o = new OooO00o(EventViewModel.this, null);
            OooO0O0 oooO0O0 = new OooO0O0(this.f25454Oooo0oo, EventViewModel.this, this.f25451Oooo, null);
            this.f25452Oooo0o = 2;
            if (o000oOoO.OooO0O0((ApiResult) obj, false, (7 & 2) != 0 ? null : oooO00o, null, oooO0O0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public EventViewModel() {
        RoomLoginInformation.RoomBean room;
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        RoomIndexModel value = OooOOO.f41251Oooo0OO.getValue();
        if (value != null) {
            String str = value.barid;
            Intrinsics.checkNotNullExpressionValue(str, "it.barid");
            setRoomIdForUser(OooO.OooO0o(str));
        }
        RoomLoginInformation roomLoginInformation = o000O00O.OooO().f32430Oooo0oo;
        if (roomLoginInformation == null || (room = roomLoginInformation.getRoom()) == null) {
            return;
        }
        setRoomId(room.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void subscribeEvent$default(EventViewModel eventViewModel, EventModel eventModel, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeEvent");
        }
        if ((i & 2) != 0) {
            function1 = OooO0OO.f25450Oooo0o;
        }
        eventViewModel.subscribeEvent(eventModel, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final EventModel getAddToCalendarEventModel() {
        return (EventModel) this.addToCalendarEventModel.getValue();
    }

    @NotNull
    public final MutableSharedFlow<ApiResult<EventCreateStateModel>> getCreateEventState(long roomId) {
        MutableSharedFlow<ApiResult<EventCreateStateModel>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(roomId, mutableSharedFlowMutableSharedFlow$default, null), 2, null);
        return mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getRoomId() {
        return ((Number) this.roomId.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getRoomIdForUser() {
        return ((Number) this.roomIdForUser.getValue()).longValue();
    }

    @NotNull
    public final o0O00OO<Boolean> getShowAddToCalendarDialog() {
        return this.showAddToCalendarDialog;
    }

    public final void getSquareEventRoom() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null), 3, null);
    }

    @NotNull
    public final o00OO0OO<SquareEventRoomModel> getSquareEventRooms() {
        return this.squareEventRooms;
    }

    public final void setAddToCalendarEventModel(@NotNull EventModel eventModel) {
        Intrinsics.checkNotNullParameter(eventModel, "<set-?>");
        this.addToCalendarEventModel.setValue(eventModel);
    }

    public final void setRoomId(long j) {
        this.roomId.setValue(Long.valueOf(j));
    }

    public final void setRoomIdForUser(long j) {
        this.roomIdForUser.setValue(Long.valueOf(j));
    }

    public final void subscribeEvent(@NotNull EventModel eventModel, @NotNull Function1<? super Boolean, Unit> requestAction) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Intrinsics.checkNotNullParameter(requestAction, "requestAction");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(eventModel, requestAction, null), 3, null);
    }

    public final void updateReadState(long roomId) {
        Iterator<SquareEventRoomModel> it = this.squareEventRooms.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getRoomId() == roomId) {
                SquareEventRoomModel squareEventRoomModel = this.squareEventRooms.get(i);
                squareEventRoomModel.setNewRoomEvent(false);
                this.squareEventRooms.set(i, squareEventRoomModel.clone());
            }
            i++;
        }
        i = -1;
        SquareEventRoomModel squareEventRoomModel2 = this.squareEventRooms.get(i);
        squareEventRoomModel2.setNewRoomEvent(false);
        this.squareEventRooms.set(i, squareEventRoomModel2.clone());
    }

    public final void updateTimeDivision(@Nullable List<EventModel> list) {
        if (list != null) {
            int i = 0;
            String str = "";
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                EventModel eventModel = (EventModel) obj;
                long eventStartTime = eventModel.getEventStartTime();
                Locale locale = Locale.ENGLISH;
                Calendar calendar = Calendar.getInstance(locale);
                Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(Locale.ENGLISH)");
                calendar.setTimeInMillis(o0ooOOo.OooO00o(eventStartTime));
                Calendar calendar2 = Calendar.getInstance(locale);
                Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance(Locale.ENGLISH).apply { }");
                calendar2.setTimeInMillis(System.currentTimeMillis());
                if (calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6)) {
                    if (i == 0 || !Intrinsics.areEqual(str, this.today)) {
                        eventModel.setDateTag(this.today);
                    } else {
                        eventModel.setDateTag("");
                    }
                    str = this.today;
                } else {
                    long eventStartTime2 = eventModel.getEventStartTime();
                    Calendar calendar3 = Calendar.getInstance(locale);
                    Intrinsics.checkNotNullExpressionValue(calendar3, "getInstance(Locale.ENGLISH)");
                    calendar3.setTimeInMillis(o0ooOOo.OooO00o(eventStartTime2));
                    Calendar calendar4 = Calendar.getInstance(locale);
                    Intrinsics.checkNotNullExpressionValue(calendar4, "getInstance(Locale.ENGLISH).apply { }");
                    calendar4.setTimeInMillis(System.currentTimeMillis());
                    if (calendar4.get(1) == calendar3.get(1) && calendar4.get(6) == calendar3.get(6) + 1) {
                        if (i == 0 || !Intrinsics.areEqual(str, this.today)) {
                            eventModel.setDateTag(this.today);
                        } else {
                            eventModel.setDateTag("");
                        }
                        str = this.today;
                    } else {
                        long eventStartTime3 = eventModel.getEventStartTime();
                        Calendar calendar5 = Calendar.getInstance(locale);
                        Intrinsics.checkNotNullExpressionValue(calendar5, "getInstance(Locale.ENGLISH)");
                        calendar5.setTimeInMillis(o0ooOOo.OooO00o(eventStartTime3));
                        Calendar calendar6 = Calendar.getInstance(locale);
                        Intrinsics.checkNotNullExpressionValue(calendar6, "getInstance(Locale.ENGLISH)");
                        calendar6.setTimeInMillis(System.currentTimeMillis());
                        if (calendar6.get(1) == calendar5.get(1) && calendar6.get(3) == calendar5.get(3)) {
                            if (i == 0 || !Intrinsics.areEqual(str, this.weekly)) {
                                eventModel.setDateTag(this.weekly);
                            } else {
                                eventModel.setDateTag("");
                            }
                            str = this.weekly;
                        } else {
                            long eventStartTime4 = eventModel.getEventStartTime();
                            Calendar calendar7 = Calendar.getInstance(locale);
                            Intrinsics.checkNotNullExpressionValue(calendar7, "getInstance(Locale.ENGLISH)");
                            calendar7.setTimeInMillis(o0ooOOo.OooO00o(eventStartTime4));
                            Calendar calendar8 = Calendar.getInstance(locale);
                            Intrinsics.checkNotNullExpressionValue(calendar8, "getInstance(Locale.ENGLISH)");
                            calendar8.setTimeInMillis(System.currentTimeMillis());
                            if (calendar8.get(1) == calendar7.get(1) && calendar8.get(3) == calendar7.get(3) - 1) {
                                if (i == 0 || !Intrinsics.areEqual(str, this.nextWeekly)) {
                                    eventModel.setDateTag(this.nextWeekly);
                                } else {
                                    eventModel.setDateTag("");
                                }
                                str = this.nextWeekly;
                            } else {
                                eventModel.setDateTag("");
                            }
                        }
                    }
                }
                i = i2;
            }
        }
    }
}
