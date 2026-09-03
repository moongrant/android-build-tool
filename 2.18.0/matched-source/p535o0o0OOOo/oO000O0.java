package p535o0o0OOOo;

import android.os.Looper;
import androidx.appcompat.widget.o00000O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.RemoveMemberModel;
import com.app.base.model.ChatModel;
import com.app.base.model.RoomAdminDemotionModel;
import com.app.base.model.RoomAdminUpgradeModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MemberBadgeInfo;
import com.yalla.yalla.model.RoomJoinMemberModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p160o00OoOO.o000O00O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000Oo0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0Oo0oo;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO000O0 implements o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public oO00000 f43470OooO00o;

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$2", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00OO000.f43170OooO.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$1$1", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MemberBadgeInfo f43471Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ RoomJoinMemberModel f43472OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MemberBadgeInfo memberBadgeInfo, RoomJoinMemberModel roomJoinMemberModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43471Oooo = memberBadgeInfo;
            this.f43472OoooO00 = roomJoinMemberModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f43471Oooo, this.f43472OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00oo001.OooOOOo(this.f43471Oooo.getBadgeUrl());
            o00OO000.f43183OooOOO0.setValue(Boolean.valueOf(this.f43471Oooo.getBadgeState()));
            o00oo001.OooOo00(this.f43471Oooo.getBadgeLevelUrl());
            o00oo001.OooOOoo(this.f43471Oooo.getMemberLevel());
            o00oo001.OooOo0O(this.f43472OoooO00.getRoomMemberCount());
            boolean z = false;
            o00OO000.f43199OooOooO.setValue(Boxing.boxBoolean(false));
            if (!this.f43471Oooo.getBadgeState()) {
                if (this.f43471Oooo.getMemberLevel() >= 15) {
                    str = "svga/anim_member_high_frozen.svga";
                } else {
                    int memberLevel = this.f43471Oooo.getMemberLevel();
                    if (7 <= memberLevel && memberLevel < 15) {
                        z = true;
                    }
                    str = z ? "svga/anim_member_middle_frozen.svga" : "svga/anim_member_lower_frozen.svga";
                }
                o00oo001.OooOOo0(str);
            }
            RoomUserInfoModel roomUserInfoModelOooOO0 = o00oo001.OooOO0(this.f43472OoooO00.getUserid());
            if (roomUserInfoModelOooOO0 != null) {
                roomUserInfoModelOooOO0.setRoomMemberType(3);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$10", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f43473Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f43474OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f43475OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f43476OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, int i2, long j, long j2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f43473Oooo = i;
            this.f43475OoooO00 = i2;
            this.f43474OoooO0 = j;
            this.f43476OoooO0O = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f43473Oooo, this.f43475OoooO00, this.f43474OoooO0, this.f43476OoooO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00OO000.f43204Oooo00O.setValue(Integer.valueOf(this.f43473Oooo));
            o00OO000.f43203Oooo000.setValue(Integer.valueOf(this.f43475OoooO00));
            o00oo001.OooOo0(this.f43474OoooO0);
            o00OO000.f43202Oooo0 = this.f43476OoooO0O;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$11", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f43477Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ boolean f43478OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f43479OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f43480OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f43481OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, int i, String str, String str2, boolean z, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f43477Oooo = j;
            this.f43480OoooO00 = i;
            this.f43479OoooO0 = str;
            this.f43481OoooO0O = str2;
            this.f43478OoooO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f43477Oooo, this.f43480OoooO00, this.f43479OoooO0, this.f43481OoooO0O, this.f43478OoooO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long j = this.f43477Oooo;
            Long value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
            if (value != null && j == value.longValue()) {
                o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                o00oo001.OooOOoo(this.f43480OoooO00);
                String badgeUrl = this.f43479OoooO0;
                Intrinsics.checkNotNullExpressionValue(badgeUrl, "badgeUrl");
                o00oo001.OooOOOo(badgeUrl);
                String badgeLevelUrl = this.f43481OoooO0O;
                Intrinsics.checkNotNullExpressionValue(badgeLevelUrl, "badgeLevelUrl");
                o00oo001.OooOo00(badgeLevelUrl);
                o00oo001.OooOOo(this.f43478OoooO);
                int i = this.f43480OoooO00;
                if (i >= 15) {
                    str = "svga/anim_member_high_active.svga";
                } else {
                    str = 7 <= i && i < 15 ? "svga/anim_member_middle_active.svga" : "svga/anim_member_lower_active.svga";
                }
                o00oo001.OooOOo0(str);
            }
            RoomUserInfoModel roomUserInfoModelOooOO0 = o00OO000.f43171OooO00o.OooOO0(this.f43477Oooo);
            if (roomUserInfoModelOooOO0 != null) {
                roomUserInfoModelOooOO0.setRoomMemberType(0);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$12", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f43482Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f43482Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f43482Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000.f43171OooO00o.OooOo0O(this.f43482Oooo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$3", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomJoinMemberModel f43483Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RoomJoinMemberModel roomJoinMemberModel, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f43483Oooo = roomJoinMemberModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f43483Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00oo001.OooOo0O(this.f43483Oooo.getRoomMemberCount());
            RoomUserInfoModel roomUserInfoModelOooOO0 = o00oo001.OooOO0(this.f43483Oooo.getUserid());
            if (roomUserInfoModelOooOO0 != null) {
                roomUserInfoModelOooOO0.setRoomMemberType(3);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$4", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomJoinMemberModel f43484Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomJoinMemberModel roomJoinMemberModel, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f43484Oooo = roomJoinMemberModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f43484Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00oo001.OooOo0O(this.f43484Oooo.getRoomMemberCount());
            RoomUserInfoModel roomUserInfoModelOooOO0 = o00oo001.OooOO0(this.f43484Oooo.getUserid());
            if (roomUserInfoModelOooOO0 != null) {
                RoomJoinMemberModel roomJoinMemberModel = this.f43484Oooo;
                roomUserInfoModelOooOO0.setRoomMemberType(3);
                MemberBadgeInfo memberInfo = roomJoinMemberModel.getMemberInfo();
                if (memberInfo != null) {
                    roomUserInfoModelOooOO0.setBadgeState(memberInfo.getBadgeState());
                    roomUserInfoModelOooOO0.setMemberLevel(memberInfo.getMemberLevel());
                    roomUserInfoModelOooOO0.setBadgeUrl(memberInfo.getBadgeUrl());
                    roomUserInfoModelOooOO0.setBadgeLevelUrl(memberInfo.getBadgeLevelUrl());
                    roomUserInfoModelOooOO0.setTopRank(memberInfo.getIsTopRank());
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$6", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomAdminDemotionModel f43485Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(RoomAdminDemotionModel roomAdminDemotionModel, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f43485Oooo = roomAdminDemotionModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f43485Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            RoomUserInfoModel roomUserInfoModelOooOO0 = o00OO000.f43171OooO00o.OooOO0(this.f43485Oooo.getUserid());
            if (roomUserInfoModelOooOO0 != null) {
                roomUserInfoModelOooOO0.setRoomMemberType(3);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$5", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomAdminUpgradeModel f43486Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(RoomAdminUpgradeModel roomAdminUpgradeModel, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f43486Oooo = roomAdminUpgradeModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f43486Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            RoomUserInfoModel roomUserInfoModelOooOO0 = o00OO000.f43171OooO00o.OooOO0(this.f43486Oooo.userid);
            if (roomUserInfoModelOooOO0 != null) {
                roomUserInfoModelOooOO0.setRoomMemberType(2);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$7", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ JSONObject f43487Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(JSONObject jSONObject, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f43487Oooo = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f43487Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000.f43171OooO00o.OooOo0O(this.f43487Oooo.getInt("roomMemberCount"));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$9", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f43488Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f43489OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f43490OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f43491OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(int i, String str, String str2, boolean z, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f43488Oooo = i;
            this.f43490OoooO00 = str;
            this.f43489OoooO0 = str2;
            this.f43491OoooO0O = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f43488Oooo, this.f43490OoooO00, this.f43489OoooO0, this.f43491OoooO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00oo001.OooOOoo(this.f43488Oooo);
            String badgeLevelUrl = this.f43490OoooO00;
            Intrinsics.checkNotNullExpressionValue(badgeLevelUrl, "badgeLevelUrl");
            o00oo001.OooOo00(badgeLevelUrl);
            String badgeUrl = this.f43489OoooO0;
            Intrinsics.checkNotNullExpressionValue(badgeUrl, "badgeUrl");
            o00oo001.OooOOOo(badgeUrl);
            o00oo001.OooOOo(this.f43491OoooO0O);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$8", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RemoveMemberModel f43492Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RemoveMemberModel removeMemberModel, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f43492Oooo = removeMemberModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f43492Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            RoomUserInfoModel roomUserInfoModelOooOO0 = o00oo001.OooOO0(this.f43492Oooo.getUserid());
            if (roomUserInfoModelOooOO0 != null) {
                roomUserInfoModelOooOO0.setRoomMemberType(0);
            }
            RoomUserInfoModel roomUserInfoModelOooOO1 = o00oo001.OooOO0(this.f43492Oooo.getUserid());
            if (roomUserInfoModelOooOO1 != null) {
                roomUserInfoModelOooOO1.setMemberLevel(0);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // p535o0o0OOOo.o
    @NotNull
    public final String OooO00o() {
        return o.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        RemoveMemberModel removeMemberModel;
        Integer num;
        RoomAdminUpgradeModel roomAdminUpgradeModel;
        RoomAdminDemotionModel roomAdminDemotionModel;
        o.OooO00o.OooO0O0(this, i, bArr);
        String strOooO00o = o.OooO00o.OooO00o(this);
        StringBuilder sbOooO00o = o00000O0.OooO00o("type = ", i, "  data = ");
        byte[] bArr2 = bArr == null ? new byte[0] : bArr;
        Charset charset = Charsets.UTF_8;
        sbOooO00o.append(new String(bArr2, charset));
        o00O00.OooO0OO(strOooO00o, sbOooO00o.toString());
        boolean z = true;
        switch (i) {
            case 10021:
                if (bArr != null) {
                    String strOooO00o2 = o.OooO00o.OooO00o(this);
                    StringBuilder sbOooO00o2 = o00000O0.OooO00o("type = ", i, "  data = ");
                    sbOooO00o2.append(new String(bArr, charset));
                    o00O00.OooO0OO(strOooO00o2, sbOooO00o2.toString());
                    RoomJoinMemberModel roomJoinMemberModel = (RoomJoinMemberModel) o0Oo0oo.OooO0OO(new String(bArr, charset), RoomJoinMemberModel.class);
                    if (roomJoinMemberModel != null) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0(roomJoinMemberModel, null), 3, null);
                        p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0OO().postValue(Long.valueOf(roomJoinMemberModel.getLeftcoin()));
                        LiveEventBus.get("ROOM_JOIN_MEMBER").post(Long.valueOf(roomJoinMemberModel.getUserid()));
                        o00OO0O0.f43338OooooOo.OooO00o().f43393Ooooo0o.postValue(new Pair<>(Long.valueOf(roomJoinMemberModel.getUserid()), 3));
                        break;
                    }
                }
                break;
            case 10022:
            case 100221:
            case 100222:
                if (bArr != null && (removeMemberModel = (RemoveMemberModel) o0Oo0oo.OooO0OO(new String(bArr, charset), RemoveMemberModel.class)) != null) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, charset));
                    if (jSONObject.has("roomMemberCount")) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(jSONObject, null), 3, null);
                    }
                    long userid = removeMemberModel.getUserid();
                    Long value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
                    if ((value != null && userid == value.longValue()) || i == 100221) {
                        String strOooO0OO = o000O0O0.OooO0OO(R.string.member_getOut);
                        ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o0o0oooOooO0O0.run();
                            } else {
                                o00O000 o00o001 = o00O000.f34368OooO00o;
                                o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                            }
                        }
                        o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
                        num = 0;
                        oooO00o.OooO00o().f43354OooOOOO.postValue(null);
                        if (i == 10022) {
                            oooO00o.OooO00o().f43352OooOOO.postValue(Boolean.valueOf(!(removeMemberModel.getFollowType() == 1)));
                            o0O00000.OooO0OO("InRoom_roomProfile_unjoin_success");
                        } else {
                            oooO00o.OooO00o().f43352OooOOO.postValue(Boolean.TRUE);
                        }
                    } else {
                        if (i == 10022) {
                            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Removed_successfully);
                            ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                                o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o0o0oooOooO0O1.run();
                                } else {
                                    o00O000 o00o002 = o00O000.f34368OooO00o;
                                    o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                                }
                            }
                            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                            o00OO000.f43212OoooO.postValue(Long.valueOf(removeMemberModel.getUserid()));
                            o000O00O.OooO().OooO0Oo(removeMemberModel);
                        } else {
                            o000O00O.OooO().OooO0Oo(removeMemberModel);
                        }
                        num = 0;
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo00(removeMemberModel, null), 3, null);
                    o00OO0O0.f43338OooooOo.OooO00o().f43393Ooooo0o.postValue(new Pair<>(Long.valueOf(removeMemberModel.getUserid()), num));
                    o000O00O.OooO().Oooo(removeMemberModel.getUserid(), 0);
                    LiveEventBus.get("ROOM_MEMBER_DELETE").post(CollectionsKt.mutableListOf(Long.valueOf(removeMemberModel.getUserid())));
                }
                break;
            case 10023:
            case 100231:
            case 100232:
                if (i == 100231) {
                    roomAdminUpgradeModel = new RoomAdminUpgradeModel();
                    p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
                    Long value2 = oooOOO.OooOo().getValue();
                    if (value2 != null) {
                        Intrinsics.checkNotNullExpressionValue(value2, "Account.userId.value ?: return");
                        roomAdminUpgradeModel.userid = value2.longValue();
                        roomAdminUpgradeModel.setUsername(oooOOO.OooOoO().getValue());
                        Unit unit = Unit.INSTANCE;
                    }
                } else if (bArr == null || (roomAdminUpgradeModel = (RoomAdminUpgradeModel) o0Oo0oo.OooO0OO(new String(bArr, charset), RoomAdminUpgradeModel.class)) == null) {
                }
                if (i == 10023) {
                    String strOooO0OO3 = o000O0O0.OooO0OO(R.string.Set_admin_successfully);
                    ToastUtil toastUtil3 = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                        o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O2.run();
                        } else {
                            o00O000 o00o003 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O2);
                        }
                    }
                } else if (i == 100231) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "被提升者弹被提升提示并修改自己的身份信息");
                    String strOooO0OO4 = o000O0O0.OooO0OO(R.string.improves_admin);
                    ToastUtil toastUtil4 = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO4 == null || StringsKt.isBlank(strOooO0OO4))) {
                        o0O0ooO o0o0oooOooO0O3 = p074o000O0oo.OooOOO.OooO0O0(toastUtil4, strOooO0OO4, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O3.run();
                        } else {
                            o00O000 o00o004 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O3);
                        }
                    }
                    o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.postValue(2);
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO0(roomAdminUpgradeModel, null), 3, null);
                if (this.f43470OooO00o != null) {
                    String userName = roomAdminUpgradeModel.getUsername();
                    Intrinsics.checkNotNullExpressionValue(userName, "model.username");
                    Intrinsics.checkNotNullParameter(userName, "userName");
                    ChatModel chatModel = new ChatModel();
                    chatModel.type = 3;
                    chatModel.message = com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.welcome_xxx_to_become_admin), userName);
                    o000O00O.OooO().OooO00o(chatModel);
                    Unit unit2 = Unit.INSTANCE;
                }
                o000O00O.OooO().OooO0Oo(roomAdminUpgradeModel);
                o00OO0O0.f43338OooooOo.OooO00o().f43393Ooooo0o.postValue(new Pair<>(Long.valueOf(roomAdminUpgradeModel.userid), 2));
                o000O00O.OooO().Oooo(roomAdminUpgradeModel.userid, 2);
                LiveEventBus.get("MEMBER_UPGRADE_ADMIN").post(Long.valueOf(roomAdminUpgradeModel.userid));
                break;
            case 10024:
            case 100241:
            case 100242:
                if (i == 100241) {
                    roomAdminDemotionModel = new RoomAdminDemotionModel();
                    Long value3 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
                    if (value3 != null) {
                        Intrinsics.checkNotNullExpressionValue(value3, "Account.userId.value ?: return");
                        roomAdminDemotionModel.setUserid(value3.longValue());
                        Unit unit3 = Unit.INSTANCE;
                    }
                } else if (bArr == null || (roomAdminDemotionModel = (RoomAdminDemotionModel) o0Oo0oo.OooO0OO(new String(bArr, charset), RoomAdminDemotionModel.class)) == null) {
                }
                if (i == 10024) {
                    String strOooO0OO5 = o000O0O0.OooO0OO(R.string.Removed_admin_successfully);
                    ToastUtil toastUtil5 = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO5 == null || StringsKt.isBlank(strOooO0OO5))) {
                        o0O0ooO o0o0oooOooO0O4 = p074o000O0oo.OooOOO.OooO0O0(toastUtil5, strOooO0OO5, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O4.run();
                        } else {
                            o00O000 o00o005 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O4);
                        }
                    }
                } else if (i == 100241) {
                    String strOooO0OO6 = o000O0O0.OooO0OO(R.string.demotiion_Management);
                    ToastUtil toastUtil6 = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO6 == null || StringsKt.isBlank(strOooO0OO6))) {
                        o0O0ooO o0o0oooOooO0O5 = p074o000O0oo.OooOOO.OooO0O0(toastUtil6, strOooO0OO6, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O5.run();
                        } else {
                            o00O000 o00o006 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O5);
                        }
                    }
                    o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO.postValue(3);
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO(roomAdminDemotionModel, null), 3, null);
                o000O00O.OooO().OooO0Oo(roomAdminDemotionModel);
                o00OO0O0.f43338OooooOo.OooO00o().f43393Ooooo0o.postValue(new Pair<>(Long.valueOf(roomAdminDemotionModel.getUserid()), 3));
                o000O00O.OooO().Oooo(roomAdminDemotionModel.getUserid(), 3);
                LiveEventBus.get("MEMBER_DOWNGRADE_MEMBER").post(Long.valueOf(roomAdminDemotionModel.getUserid()));
                break;
            case 10042:
                if (bArr != null) {
                    String strOooO00o3 = o.OooO00o.OooO00o(this);
                    StringBuilder sbOooO00o3 = o00000O0.OooO00o("type = ", i, "  data = ");
                    sbOooO00o3.append(new String(bArr, charset));
                    o00O00.OooO0OO(strOooO00o3, sbOooO00o3.toString());
                    o0O00000.OooO0OO("InRoom_roomProfile_join_success");
                    oO00000 oo00000 = this.f43470OooO00o;
                    if (oo00000 != null) {
                        p500o0o00Oo0.OooOOO oooOOO2 = p500o0o00Oo0.OooOOO.f41235OooO00o;
                        long jLongValue = ((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO2)).longValue();
                        String value4 = oooOOO2.OooO0oo().getValue();
                        Intrinsics.checkNotNull(value4);
                        String value5 = oooOOO2.OooOoO().getValue();
                        Intrinsics.checkNotNull(value5);
                        oo00000.OooO0O0(jLongValue, value4, value5);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    RoomJoinMemberModel roomJoinMemberModel2 = (RoomJoinMemberModel) o0Oo0oo.OooO0OO(new String(bArr, charset), RoomJoinMemberModel.class);
                    if (roomJoinMemberModel2 != null) {
                        if (roomJoinMemberModel2.getDues() > 0) {
                            p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0OO().postValue(Long.valueOf(roomJoinMemberModel2.getLeftcoin()));
                        }
                        Observable<Object> observable = LiveEventBus.get("JoinOrFollowRoom_Update");
                        Boolean bool = Boolean.TRUE;
                        observable.post(bool);
                        MemberBadgeInfo memberInfo = roomJoinMemberModel2.getMemberInfo();
                        if (memberInfo != null) {
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(memberInfo, roomJoinMemberModel2, null), 3, null);
                        }
                        LiveEventBus.get("ROOM_DISMISS_ROOMINFO").post(bool);
                        o00OO0O0.OooO00o oooO00o2 = o00OO0O0.f43338OooooOo;
                        oooO00o2.OooO00o().f43354OooOOOO.postValue(3);
                        oooO00o2.OooO00o().f43352OooOOO.postValue(bool);
                        String strOooO0OO7 = o000O0O0.OooO0OO(R.string.title_Room_beMember);
                        ToastUtil toastUtil7 = ToastUtil.f12583OooO0O0;
                        if (strOooO0OO7 != null && !StringsKt.isBlank(strOooO0OO7)) {
                            z = false;
                        }
                        if (!z) {
                            o0O0ooO o0o0oooOooO0O6 = p074o000O0oo.OooOOO.OooO0O0(toastUtil7, strOooO0OO7, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o0o0oooOooO0O6.run();
                            } else {
                                o00O000 o00o007 = o00O000.f34368OooO00o;
                                o00O000.f34370OooO0OO.post(o0o0oooOooO0O6);
                            }
                        }
                        o00OO000 o00oo002 = o00OO000.f43171OooO00o;
                        o00oo002.OooOoO(false);
                        p500o0o00Oo0.OooOOO oooOOO3 = p500o0o00Oo0.OooOOO.f41235OooO00o;
                        RoomUserInfoModel roomUserInfoModelOooOO0 = o00oo002.OooOO0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO3)).longValue());
                        if (roomUserInfoModelOooOO0 != null) {
                            roomUserInfoModelOooOO0.setRoomMemberType(3);
                        }
                        o000O00O o000o00oOooO = o000O00O.OooO();
                        Long value6 = oooOOO3.OooOo().getValue();
                        if (value6 == null) {
                            value6 = 0L;
                        }
                        o000o00oOooO.Oooo(value6.longValue(), 3);
                        if (!roomJoinMemberModel2.getInvitefalg()) {
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(null), 3, null);
                        }
                        break;
                    }
                }
                break;
            case 100212:
                if (bArr != null) {
                    String strOooO00o4 = o.OooO00o.OooO00o(this);
                    StringBuilder sbOooO00o4 = o00000O0.OooO00o("type = ", i, "  data = ");
                    sbOooO00o4.append(new String(bArr, charset));
                    o00O00.OooO0OO(strOooO00o4, sbOooO00o4.toString());
                    RoomJoinMemberModel roomJoinMemberModel3 = (RoomJoinMemberModel) o0Oo0oo.OooO0OO(new String(bArr, charset), RoomJoinMemberModel.class);
                    if (roomJoinMemberModel3 != null) {
                        oO00000 oo00001 = this.f43470OooO00o;
                        if (oo00001 != null) {
                            oo00001.OooO0O0(roomJoinMemberModel3.getUserid(), roomJoinMemberModel3.getHeadphoto(), roomJoinMemberModel3.getNickname());
                            Unit unit5 = Unit.INSTANCE;
                        }
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0O(roomJoinMemberModel3, null), 3, null);
                        o000O00O.OooO().OooO0Oo(roomJoinMemberModel3);
                        LiveEventBus.get("ROOM_JOIN_MEMBER").post(Long.valueOf(roomJoinMemberModel3.getUserid()));
                        o00OO0O0.f43338OooooOo.OooO00o().f43393Ooooo0o.postValue(new Pair<>(Long.valueOf(roomJoinMemberModel3.getUserid()), 3));
                        break;
                    }
                }
                break;
            case 1000402:
                if (bArr != null) {
                    String strOooO00o5 = o.OooO00o.OooO00o(this);
                    StringBuilder sbOooO00o5 = o00000O0.OooO00o("type = ", i, "  data = ");
                    sbOooO00o5.append(new String(bArr, charset));
                    o00O00.OooO0OO(strOooO00o5, sbOooO00o5.toString());
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(new JSONObject(new String(bArr, charset)).optInt("roomMemberCount"), null), 3, null);
                    break;
                }
                break;
            case 1000900:
                if (o00OO0O0.f43338OooooOo.OooO00o().OooOOo0()) {
                    String strOooO0OO8 = o000O0O0.OooO0OO(R.string.member_task_invite_success);
                    ToastUtil toastUtil8 = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO8 == null || StringsKt.isBlank(strOooO0OO8))) {
                        o0O0ooO o0o0oooOooO0O7 = p074o000O0oo.OooOOO.OooO0O0(toastUtil8, strOooO0OO8, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O7.run();
                        } else {
                            o00O000 o00o008 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O7);
                        }
                    }
                    o00OO000 o00oo003 = o00OO000.f43171OooO00o;
                    o00OO000.f43204Oooo00O.setValue(Integer.valueOf(o00oo003.OooO0o() - 1));
                    if (o00oo003.OooO0o() > 0) {
                        o00oo003.OooOo0(o00OO000.f43202Oooo0);
                        o00oo003.OooOoOO();
                    }
                } else if (this.f43470OooO00o != null) {
                    ChatModel chatModel2 = new ChatModel();
                    chatModel2.type = 29;
                    o000O00O.OooO().OooO00o(chatModel2);
                    Unit unit6 = Unit.INSTANCE;
                }
                break;
            case 1000901:
                if (bArr != null) {
                    String strOooO00o6 = o.OooO00o.OooO00o(this);
                    StringBuilder sbOooO00o6 = o00000O0.OooO00o("type = ", i, "  data = ");
                    sbOooO00o6.append(new String(bArr, charset));
                    o00O00.OooO0OO(strOooO00o6, sbOooO00o6.toString());
                    JSONObject jSONObject2 = new JSONObject(new String(bArr, charset));
                    long jOptLong = jSONObject2.optLong("userId");
                    String userName2 = jSONObject2.optString("nickName");
                    String userHeader = jSONObject2.optString("headUrl");
                    int iOptInt = jSONObject2.optInt("memberLevel");
                    String strOptString = jSONObject2.optString("badgeUrl");
                    String strOptString2 = jSONObject2.optString("badgeLevelUrl");
                    boolean zOptBoolean = jSONObject2.optBoolean("isTopRank");
                    Long value7 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
                    if (value7 != null && jOptLong == value7.longValue()) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo(iOptInt, strOptString2, strOptString, zOptBoolean, null), 3, null);
                    }
                    if (iOptInt >= 5 && this.f43470OooO00o != null) {
                        Intrinsics.checkNotNullExpressionValue(userName2, "userName");
                        Intrinsics.checkNotNullExpressionValue(userHeader, "userHeader");
                        Intrinsics.checkNotNullParameter(userName2, "userName");
                        Intrinsics.checkNotNullParameter(userHeader, "userHeader");
                        ChatModel chatModel3 = new ChatModel();
                        ChatModel.MemberUpLevelModel memberUpLevelModel = new ChatModel.MemberUpLevelModel(jOptLong, userName2, userHeader, iOptInt);
                        chatModel3.type = 31;
                        chatModel3.memberUpLevelModel = memberUpLevelModel;
                        o000O00O.OooO().OooO00o(chatModel3);
                        Unit unit7 = Unit.INSTANCE;
                    }
                    if (iOptInt == 10) {
                        LiveEventBus.get("ROOM_MEMBER_LEVEL_UPGRADE").post(new Pair(userName2, userHeader));
                    }
                    break;
                }
                break;
            case 1000902:
                if (bArr != null) {
                    JSONObject jSONObject3 = new JSONObject(new String(bArr, charset));
                    long jOptLong2 = jSONObject3.optLong("UserId");
                    String userName3 = jSONObject3.optString("NickName");
                    String userHeaderUrl = jSONObject3.optString("HeadUrl");
                    if (this.f43470OooO00o != null) {
                        Intrinsics.checkNotNullExpressionValue(userName3, "userName");
                        Intrinsics.checkNotNullExpressionValue(userHeaderUrl, "userHeaderUrl");
                        Intrinsics.checkNotNullParameter(userName3, "userName");
                        Intrinsics.checkNotNullParameter(userHeaderUrl, "userHeaderUrl");
                        ArrayList<ChatModel> arrayList = o000O00O.OooO().f32458OoooOoO;
                        int iMin = Math.min(arrayList.size(), 9);
                        if (iMin >= 0) {
                            int i2 = 0;
                            while (true) {
                                if ((arrayList.size() - i2) - 1 < 0 || arrayList.get((arrayList.size() - i2) - 1).type != 30) {
                                    if (i2 != iMin) {
                                        i2++;
                                    } else {
                                        p608o0oo0O.OooOo.OooO0O0("402003");
                                        ChatModel chatModel4 = new ChatModel();
                                        chatModel4.type = 30;
                                        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
                                        chatModel4.from = roomUserInfoModel;
                                        roomUserInfoModel.setUserId(jOptLong2);
                                        chatModel4.from.setUserName(userName3);
                                        chatModel4.from.setUserHeader(userHeaderUrl);
                                        o000O00O.OooO().OooO00o(chatModel4);
                                    }
                                }
                            }
                        } else {
                            p608o0oo0O.OooOo.OooO0O0("402003");
                            ChatModel chatModel5 = new ChatModel();
                            chatModel5.type = 30;
                            RoomUserInfoModel roomUserInfoModel2 = new RoomUserInfoModel();
                            chatModel5.from = roomUserInfoModel2;
                            roomUserInfoModel2.setUserId(jOptLong2);
                            chatModel5.from.setUserName(userName3);
                            chatModel5.from.setUserHeader(userHeaderUrl);
                            o000O00O.OooO().OooO00o(chatModel5);
                        }
                        Unit unit8 = Unit.INSTANCE;
                    }
                    break;
                }
                break;
            case 1000903:
                if (bArr != null) {
                    String strOooO00o7 = o.OooO00o.OooO00o(this);
                    StringBuilder sbOooO00o7 = o00000O0.OooO00o("type = ", i, "  data = ");
                    sbOooO00o7.append(new String(bArr, charset));
                    o00O00.OooO0OO(strOooO00o7, sbOooO00o7.toString());
                    JSONObject jSONObject4 = new JSONObject(new String(bArr, charset));
                    if (jSONObject4.has("badgeState")) {
                        boolean zOooO00o = o000Oo0.OooO00o(Integer.valueOf(jSONObject4.optInt("badgeState")));
                        if (zOooO00o) {
                            p608o0oo0O.OooOo.OooO0O0("402001");
                        } else {
                            p608o0oo0O.OooOo.OooO0O0("402002");
                        }
                        if (this.f43470OooO00o != null) {
                            ChatModel chatModel6 = new ChatModel();
                            chatModel6.type = 28;
                            chatModel6.memberBadgeActivate = zOooO00o;
                            o000O00O.OooO().OooO00o(chatModel6);
                            Unit unit9 = Unit.INSTANCE;
                        }
                        break;
                    }
                }
                break;
            case 1000904:
                if (bArr != null) {
                    String strOooO00o8 = o.OooO00o.OooO00o(this);
                    StringBuilder sbOooO00o8 = o00000O0.OooO00o("type = ", i, "  data = ");
                    sbOooO00o8.append(new String(bArr, charset));
                    o00O00.OooO0OO(strOooO00o8, sbOooO00o8.toString());
                    JSONObject jSONObject5 = new JSONObject(new String(bArr, charset));
                    int iOptInt2 = jSONObject5.optInt("total");
                    int iOptInt3 = jSONObject5.optInt("remain");
                    long jOptLong3 = jSONObject5.optLong("disableTime");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(iOptInt3, iOptInt2, jOptLong3, jSONObject5.optLong("frequency", 30000L), null), 3, null);
                    if (jOptLong3 > 0) {
                        o00OO000.f43171OooO00o.OooOoOO();
                    }
                    break;
                }
                break;
            case 1000905:
                if (bArr != null) {
                    String strOooO00o9 = o.OooO00o.OooO00o(this);
                    StringBuilder sbOooO00o9 = o00000O0.OooO00o("type = ", i, "  data = ");
                    sbOooO00o9.append(new String(bArr, charset));
                    o00O00.OooO0OO(strOooO00o9, sbOooO00o9.toString());
                    JSONObject jSONObject6 = new JSONObject(new String(bArr, charset));
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(jSONObject6.optLong("userId"), jSONObject6.optInt("memberLevel"), jSONObject6.optString("badgeUrl"), jSONObject6.optString("badgeLevelUrl"), jSONObject6.optBoolean("isTopRank"), null), 3, null);
                    break;
                }
                break;
        }
    }
}
