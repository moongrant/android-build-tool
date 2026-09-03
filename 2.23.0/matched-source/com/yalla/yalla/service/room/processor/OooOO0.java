package com.yalla.yalla.service.room.processor;

import android.os.Looper;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.MemberBadgeInfo;
import com.yalla.yalla.model.room.RoomAdminDemotionModel;
import com.yalla.yalla.model.room.RoomAdminUpgradeModel;
import com.yalla.yalla.model.room.RoomJoinMemberModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.adapter.RemoveMemberModel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ActorCoroutine;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p464o0Oooo.o000000O;
import p475o0o000.o0O0O00;
import p475o0o000.oo0o0Oo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMemberMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMemberMsgProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"})
public final class OooOO0 implements com.yalla.yalla.service.room.processor.OooO00o {

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$13", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f25087OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f25087OooO0Oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f25087OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.OooO0o(this.f25087OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$1$1", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MemberBadgeInfo f25088OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomJoinMemberModel f25089OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MemberBadgeInfo memberBadgeInfo, RoomJoinMemberModel roomJoinMemberModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25088OooO0Oo = memberBadgeInfo;
            this.f25089OooO0o0 = roomJoinMemberModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25088OooO0Oo, this.f25089OooO0o0, continuation);
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
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            MemberBadgeInfo memberBadgeInfo = this.f25088OooO0Oo;
            String badgeUrl = memberBadgeInfo.getBadgeUrl();
            oo0o0oo.getClass();
            Intrinsics.checkNotNullParameter(badgeUrl, "<set-?>");
            oo0o0oo.f47508OooO0OO.setValue(badgeUrl);
            oo0o0oo.f47511OooO0o0.setValue(Boolean.valueOf(memberBadgeInfo.getBadgeState()));
            String badgeLevelUrl = memberBadgeInfo.getBadgeLevelUrl();
            Intrinsics.checkNotNullParameter(badgeLevelUrl, "<set-?>");
            oo0o0oo.f47509OooO0Oo.setValue(badgeLevelUrl);
            oo0o0oo.f47507OooO0O0.setValue(Integer.valueOf(memberBadgeInfo.getMemberLevel()));
            RoomJoinMemberModel roomJoinMemberModel = this.f25089OooO0o0;
            oo0o0oo.OooO0o(roomJoinMemberModel.getRoomMemberCount());
            boolean z = false;
            oo0o0oo.f47531OooOoOO.setValue(Boxing.boxBoolean(false));
            if (!memberBadgeInfo.getBadgeState()) {
                if (memberBadgeInfo.getMemberLevel() >= 15) {
                    str = "svga/anim_member_high_frozen.svga";
                } else {
                    int memberLevel = memberBadgeInfo.getMemberLevel();
                    if (7 <= memberLevel && memberLevel < 15) {
                        z = true;
                    }
                    str = z ? "svga/anim_member_middle_frozen.svga" : "svga/anim_member_lower_frozen.svga";
                }
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                oo0o0oo.f47512OooO0oO.setValue(str);
            }
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(roomJoinMemberModel.getUserid()));
            MutableStateFlow<Integer> roomMemberType = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getRoomMemberType() : null;
            if (roomMemberType != null) {
                roomMemberType.setValue(Boxing.boxInt(3));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$10", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            Integer numValueOf = Integer.valueOf(((Number) oo0o0oo.f47519OooOOOO.getValue()).intValue() - 1);
            MutableState mutableState = oo0o0oo.f47519OooOOOO;
            mutableState.setValue(numValueOf);
            if (((Number) mutableState.getValue()).intValue() > 0) {
                oo0o0oo.f47520OooOOOo.setValue(Long.valueOf(oo0o0oo.f47522OooOOo0));
                Job job = oo0o0oo.f47521OooOOo;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                oo0o0oo.f47521OooOOo = null;
                oo0o0oo.f47521OooOOo = com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new o0O0O00(oo0o0oo, null));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$11", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f25090OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f25091OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25092OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f25093OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, int i2, long j, long j2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25090OooO0Oo = i;
            this.f25092OooO0o0 = i2;
            this.f25091OooO0o = j;
            this.f25093OooO0oO = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f25090OooO0Oo, this.f25092OooO0o0, this.f25091OooO0o, this.f25093OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            oo0o0oo.f47519OooOOOO.setValue(Integer.valueOf(this.f25090OooO0Oo));
            oo0o0oo.f47517OooOOO.setValue(Integer.valueOf(this.f25092OooO0o0));
            oo0o0oo.f47520OooOOOo.setValue(Long.valueOf(this.f25091OooO0o));
            oo0o0oo.f47522OooOOo0 = this.f25093OooO0oO;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$12", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f25094OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f25095OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25096OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f25097OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f25098OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, int i, String str, String str2, boolean z, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25094OooO0Oo = j;
            this.f25096OooO0o0 = i;
            this.f25095OooO0o = str;
            this.f25097OooO0oO = str2;
            this.f25098OooO0oo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f25094OooO0Oo, this.f25096OooO0o0, this.f25095OooO0o, this.f25097OooO0oO, this.f25098OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            long j = this.f25094OooO0Oo;
            if (l != null && j == l.longValue()) {
                oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
                MutableState mutableState = oo0o0oo.f47507OooO0O0;
                int i = this.f25096OooO0o0;
                mutableState.setValue(Integer.valueOf(i));
                String badgeUrl = this.f25095OooO0o;
                Intrinsics.checkNotNullExpressionValue(badgeUrl, "badgeUrl");
                Intrinsics.checkNotNullParameter(badgeUrl, "<set-?>");
                oo0o0oo.f47508OooO0OO.setValue(badgeUrl);
                String badgeLevelUrl = this.f25097OooO0oO;
                Intrinsics.checkNotNullExpressionValue(badgeLevelUrl, "badgeLevelUrl");
                Intrinsics.checkNotNullParameter(badgeLevelUrl, "<set-?>");
                oo0o0oo.f47509OooO0Oo.setValue(badgeLevelUrl);
                oo0o0oo.f47510OooO0o.setValue(Boolean.valueOf(this.f25098OooO0oo));
                if (i >= 15) {
                    str = "svga/anim_member_high_active.svga";
                } else {
                    str = 7 <= i && i < 15 ? "svga/anim_member_middle_active.svga" : "svga/anim_member_lower_active.svga";
                }
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                oo0o0oo.f47512OooO0oO.setValue(str);
            }
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(j));
            MutableStateFlow<Integer> roomMemberType = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getRoomMemberType() : null;
            if (roomMemberType != null) {
                roomMemberType.setValue(Boxing.boxInt(0));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.service.room.processor.OooOO0$OooOO0, reason: collision with other inner class name */
    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$2", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0320OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public C0320OooOO0(Continuation<? super C0320OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0320OooOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new C0320OooOO0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47506OooO00o.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$3", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomJoinMemberModel f25099OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomJoinMemberModel roomJoinMemberModel, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f25099OooO0Oo = roomJoinMemberModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f25099OooO0Oo, continuation);
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
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            RoomJoinMemberModel roomJoinMemberModel = this.f25099OooO0Oo;
            oo0o0oo.OooO0o(roomJoinMemberModel.getRoomMemberCount());
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(roomJoinMemberModel.getUserid()));
            MutableStateFlow<Integer> roomMemberType = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getRoomMemberType() : null;
            if (roomMemberType != null) {
                roomMemberType.setValue(Boxing.boxInt(3));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$5", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomAdminUpgradeModel f25100OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(RoomAdminUpgradeModel roomAdminUpgradeModel, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f25100OooO0Oo = roomAdminUpgradeModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f25100OooO0Oo, continuation);
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
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(this.f25100OooO0Oo.userid));
            MutableStateFlow<Integer> roomMemberType = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getRoomMemberType() : null;
            if (roomMemberType != null) {
                roomMemberType.setValue(Boxing.boxInt(2));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$4", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomJoinMemberModel f25101OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(RoomJoinMemberModel roomJoinMemberModel, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f25101OooO0Oo = roomJoinMemberModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f25101OooO0Oo, continuation);
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
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            RoomJoinMemberModel roomJoinMemberModel = this.f25101OooO0Oo;
            oo0o0oo.OooO0o(roomJoinMemberModel.getRoomMemberCount());
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(roomJoinMemberModel.getUserid()));
            if (roomUserInfoModelOooO0o0 != null) {
                roomUserInfoModelOooO0o0.getRoomMemberType().setValue(Boxing.boxInt(3));
                MemberBadgeInfo memberInfo = roomJoinMemberModel.getMemberInfo();
                if (memberInfo != null) {
                    roomUserInfoModelOooO0o0.getBadgeState().setValue(Boxing.boxBoolean(memberInfo.getBadgeState()));
                    roomUserInfoModelOooO0o0.getMemberLevel().setValue(Boxing.boxInt(memberInfo.getMemberLevel()));
                    roomUserInfoModelOooO0o0.getBadgeUrl().setValue(memberInfo.getBadgeUrl());
                    roomUserInfoModelOooO0o0.getBadgeLevelUrl().setValue(memberInfo.getBadgeLevelUrl());
                    roomUserInfoModelOooO0o0.isTopRank().setValue(Boxing.boxBoolean(memberInfo.getIsTopRank()));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$6", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomAdminDemotionModel f25102OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(RoomAdminDemotionModel roomAdminDemotionModel, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f25102OooO0Oo = roomAdminDemotionModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f25102OooO0Oo, continuation);
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
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(this.f25102OooO0Oo.getUserid()));
            MutableStateFlow<Integer> roomMemberType = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getRoomMemberType() : null;
            if (roomMemberType != null) {
                roomMemberType.setValue(Boxing.boxInt(3));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$8", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RemoveMemberModel f25103OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(RemoveMemberModel removeMemberModel, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f25103OooO0Oo = removeMemberModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f25103OooO0Oo, continuation);
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
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RemoveMemberModel removeMemberModel = this.f25103OooO0Oo;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(removeMemberModel.getUserid()));
            MutableStateFlow<Integer> roomMemberType = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getRoomMemberType() : null;
            if (roomMemberType != null) {
                roomMemberType.setValue(Boxing.boxInt(0));
            }
            RoomUserInfoModel roomUserInfoModelOooO0o1 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(removeMemberModel.getUserid()));
            MutableStateFlow<Integer> memberLevel = roomUserInfoModelOooO0o1 != null ? roomUserInfoModelOooO0o1.getMemberLevel() : null;
            if (memberLevel != null) {
                memberLevel.setValue(Boxing.boxInt(0));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$7", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ JSONObject f25104OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(JSONObject jSONObject, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f25104OooO0Oo = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f25104OooO0Oo, continuation);
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
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.OooO0o(this.f25104OooO0Oo.getInt("roomMemberCount"));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMemberMsgProcessor$parseMessage$9", f = "RoomMemberMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f25105OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f25106OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f25107OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f25108OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(int i, String str, String str2, boolean z, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f25105OooO0Oo = i;
            this.f25107OooO0o0 = str;
            this.f25106OooO0o = str2;
            this.f25108OooO0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f25105OooO0Oo, this.f25107OooO0o0, this.f25106OooO0o, this.f25108OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            oo0o0oo.f47507OooO0O0.setValue(Integer.valueOf(this.f25105OooO0Oo));
            String badgeLevelUrl = this.f25107OooO0o0;
            Intrinsics.checkNotNullExpressionValue(badgeLevelUrl, "badgeLevelUrl");
            Intrinsics.checkNotNullParameter(badgeLevelUrl, "<set-?>");
            oo0o0oo.f47509OooO0Oo.setValue(badgeLevelUrl);
            String badgeUrl = this.f25106OooO0o;
            Intrinsics.checkNotNullExpressionValue(badgeUrl, "badgeUrl");
            Intrinsics.checkNotNullParameter(badgeUrl, "<set-?>");
            oo0o0oo.f47508OooO0OO.setValue(badgeUrl);
            oo0o0oo.f47510OooO0o.setValue(Boolean.valueOf(this.f25108OooO0oO));
            return Unit.INSTANCE;
        }
    }

    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(int i, @Nullable Object obj) {
        RoomAdminUpgradeModel roomAdminUpgradeModel;
        RoomAdminDemotionModel roomAdminDemotionModel;
        ActorCoroutine actorCoroutine;
        com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO0O0(this, i, obj);
        String strOooO00o = com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this);
        byte[] bArr = (byte[]) obj;
        Charset charset = Charsets.UTF_8;
        p592o0oo00O.OooOOO0.OooO0OO(strOooO00o, "type = " + i + "  data = " + new String(bArr, charset));
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        switch (i) {
            case 10021:
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "type = " + i + "  data = " + new String(bArr, charset));
                RoomJoinMemberModel roomJoinMemberModel = (RoomJoinMemberModel) p140o00OOooo.OooOO0.OooO0O0(RoomJoinMemberModel.class, new String(bArr, charset));
                if (roomJoinMemberModel != null) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0O(roomJoinMemberModel, null), 3, null);
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    o000000O.OooO0O0().postValue(Long.valueOf(roomJoinMemberModel.getLeftcoin()));
                    LiveEventBus.get("ROOM_JOIN_MEMBER").post(Long.valueOf(roomJoinMemberModel.getUserid()));
                    oooO00o.OooO00o().f25039OoooO.postValue(new Pair<>(Long.valueOf(roomJoinMemberModel.getUserid()), 3));
                    break;
                }
                break;
            case 10022:
            case 100221:
            case 100222:
                RemoveMemberModel removeMemberModel = (RemoveMemberModel) p140o00OOooo.OooOO0.OooO0O0(RemoveMemberModel.class, new String(bArr, charset));
                if (removeMemberModel != null) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, charset));
                    if (jSONObject.has("roomMemberCount")) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo00(jSONObject, null), 3, null);
                    }
                    long userid = removeMemberModel.getUserid();
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    Long l = (Long) o000000O.OooOOo0().getValue();
                    if ((l != null && userid == l.longValue()) || i == 100221) {
                        String strOooO0OO = o0000.OooO0OO(oO00OOo0.member_getOut);
                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                        oooO00o.OooO00o().f25008OooOO0o.postValue(0);
                        if (i == 10022) {
                            oooO00o.OooO00o().f25007OooOO0O.postValue(Boolean.valueOf(!(removeMemberModel.getFollowType() == 1)));
                        } else {
                            oooO00o.OooO00o().f25007OooOO0O.postValue(Boolean.TRUE);
                        }
                    } else if (i == 10022) {
                        String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Removed_successfully);
                        if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                            o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o2.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                            }
                        }
                        com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47532OooOoo.postValue(Long.valueOf(removeMemberModel.getUserid()));
                        MixedRoomDataSource.OooO0o0().OooO0OO(removeMemberModel);
                    } else {
                        MixedRoomDataSource.OooO0o0().OooO0OO(removeMemberModel);
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo(removeMemberModel, null), 3, null);
                    oooO00o.OooO00o().f25039OoooO.postValue(new Pair<>(Long.valueOf(removeMemberModel.getUserid()), 0));
                    LiveEventBus.get("ROOM_MEMBER_DELETE").post(CollectionsKt.mutableListOf(Long.valueOf(removeMemberModel.getUserid())));
                    break;
                }
                break;
            case 10023:
            case 100231:
            case 100232:
                if (i == 100231) {
                    roomAdminUpgradeModel = new RoomAdminUpgradeModel();
                    o000000O o000000o4 = o000000O.f46674OooO00o;
                    Long l2 = (Long) o000000O.OooOOo0().getValue();
                    if (l2 != null) {
                        Intrinsics.checkNotNullExpressionValue(l2, "Account.userId.value ?: return");
                        roomAdminUpgradeModel.userid = l2.longValue();
                        roomAdminUpgradeModel.setUsername((String) o000000O.OooOOoo().getValue());
                    }
                } else {
                    roomAdminUpgradeModel = (RoomAdminUpgradeModel) p140o00OOooo.OooOO0.OooO0O0(RoomAdminUpgradeModel.class, new String(bArr, charset));
                    if (roomAdminUpgradeModel == null) {
                    }
                }
                if (i == 10023) {
                    String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.Set_admin_successfully);
                    if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                        o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO3, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o3.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                        }
                    }
                } else if (i == 100231) {
                    p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "被提升者弹被提升提示并修改自己的身份信息");
                    String strOooO0OO4 = o0000.OooO0OO(oO00OOo0.improves_admin);
                    if (!(strOooO0OO4 == null || StringsKt.isBlank(strOooO0OO4))) {
                        o000Oo0 o000oo0OooO00o4 = o000O00.OooO00o(strOooO0OO4, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o4.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o4);
                        }
                    }
                    oooO00o.OooO00o().f25008OooOO0o.postValue(2);
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO(roomAdminUpgradeModel, null), 3, null);
                String userName = roomAdminUpgradeModel.getUsername();
                Intrinsics.checkNotNullExpressionValue(userName, "model.username");
                Intrinsics.checkNotNullParameter(userName, "userName");
                ChatModel chatModel = new ChatModel();
                chatModel.setType(3);
                chatModel.setMessage(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.welcome_xxx_to_become_admin), userName));
                MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
                MixedRoomDataSource.OooO0o0().OooO0OO(roomAdminUpgradeModel);
                oooO00o.OooO00o().f25039OoooO.postValue(new Pair<>(Long.valueOf(roomAdminUpgradeModel.userid), 2));
                LiveEventBus.get("MEMBER_UPGRADE_ADMIN").post(Long.valueOf(roomAdminUpgradeModel.userid));
                break;
            case 10024:
            case 100241:
            case 100242:
                if (i == 100241) {
                    roomAdminDemotionModel = new RoomAdminDemotionModel();
                    o000000O o000000o5 = o000000O.f46674OooO00o;
                    Long l3 = (Long) o000000O.OooOOo0().getValue();
                    if (l3 != null) {
                        Intrinsics.checkNotNullExpressionValue(l3, "Account.userId.value ?: return");
                        roomAdminDemotionModel.setUserid(l3.longValue());
                    }
                } else {
                    roomAdminDemotionModel = (RoomAdminDemotionModel) p140o00OOooo.OooOO0.OooO0O0(RoomAdminDemotionModel.class, new String(bArr, charset));
                    if (roomAdminDemotionModel == null) {
                    }
                }
                if (i == 10024) {
                    String strOooO0OO5 = o0000.OooO0OO(oO00OOo0.Removed_admin_successfully);
                    if (!(strOooO0OO5 == null || StringsKt.isBlank(strOooO0OO5))) {
                        o000Oo0 o000oo0OooO00o5 = o000O00.OooO00o(strOooO0OO5, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o5.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o5);
                        }
                    }
                } else if (i == 100241) {
                    String strOooO0OO6 = o0000.OooO0OO(oO00OOo0.demotiion_Management);
                    if (!(strOooO0OO6 == null || StringsKt.isBlank(strOooO0OO6))) {
                        o000Oo0 o000oo0OooO00o6 = o000O00.OooO00o(strOooO0OO6, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o6.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o6);
                        }
                    }
                    oooO00o.OooO00o().f25008OooOO0o.postValue(3);
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(roomAdminDemotionModel, null), 3, null);
                MixedRoomDataSource.OooO0o0().OooO0OO(roomAdminDemotionModel);
                oooO00o.OooO00o().f25039OoooO.postValue(new Pair<>(Long.valueOf(roomAdminDemotionModel.getUserid()), 3));
                LiveEventBus.get("MEMBER_DOWNGRADE_MEMBER").post(Long.valueOf(roomAdminDemotionModel.getUserid()));
                break;
            case 10042:
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "type = " + i + "  data = " + new String(bArr, charset));
                o000000O o000000o6 = o000000O.f46674OooO00o;
                long jLongValue = ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue();
                T value = o000000O.OooO().getValue();
                Intrinsics.checkNotNull(value);
                String userHeader = (String) value;
                T value2 = o000000O.OooOOoo().getValue();
                Intrinsics.checkNotNull(value2);
                String userName2 = (String) value2;
                Intrinsics.checkNotNullParameter(userHeader, "userHeader");
                Intrinsics.checkNotNullParameter(userName2, "userName");
                ChatModel chatModel2 = new ChatModel();
                ChatModel.BecomeMemberModel becomeMemberModel = new ChatModel.BecomeMemberModel(jLongValue, userHeader, userName2);
                chatModel2.setType(25);
                chatModel2.setBecomeMemberModel(becomeMemberModel);
                MixedRoomDataSource.OooO0o0().OooO00o(chatModel2);
                RoomJoinMemberModel roomJoinMemberModel2 = (RoomJoinMemberModel) p140o00OOooo.OooOO0.OooO0O0(RoomJoinMemberModel.class, new String(bArr, charset));
                if (roomJoinMemberModel2 != null) {
                    if (roomJoinMemberModel2.getDues() > 0) {
                        o000000O.OooO0O0().postValue(Long.valueOf(roomJoinMemberModel2.getLeftcoin()));
                    }
                    Observable<Object> observable = LiveEventBus.get("JoinOrFollowRoom_Update");
                    Boolean bool = Boolean.TRUE;
                    observable.post(bool);
                    MemberBadgeInfo memberInfo = roomJoinMemberModel2.getMemberInfo();
                    if (memberInfo != null) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(memberInfo, roomJoinMemberModel2, null), 3, null);
                    }
                    LiveEventBus.get("ROOM_DISMISS_ROOMINFO").post(bool);
                    oooO00o.OooO00o().f25008OooOO0o.postValue(3);
                    oooO00o.OooO00o().f25007OooOO0O.postValue(bool);
                    String strOooO0OO7 = o0000.OooO0OO(oO00OOo0.title_Room_beMember);
                    if (!(strOooO0OO7 == null || StringsKt.isBlank(strOooO0OO7))) {
                        o000Oo0 o000oo0OooO00o7 = o000O00.OooO00o(strOooO0OO7, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o7.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o7);
                        }
                    }
                    com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.OooO0oO(false);
                    ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                    RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0((Long) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0());
                    MutableStateFlow<Integer> roomMemberType = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getRoomMemberType() : null;
                    if (roomMemberType != null) {
                        roomMemberType.setValue(3);
                    }
                    if (!roomJoinMemberModel2.getInvitefalg()) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C0320OooOO0(null), 3, null);
                    }
                    break;
                }
                break;
            case 100212:
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "type = " + i + "  data = " + new String(bArr, charset));
                RoomJoinMemberModel roomJoinMemberModel3 = (RoomJoinMemberModel) p140o00OOooo.OooOO0.OooO0O0(RoomJoinMemberModel.class, new String(bArr, charset));
                if (roomJoinMemberModel3 != null) {
                    long userid2 = roomJoinMemberModel3.getUserid();
                    String userHeader2 = roomJoinMemberModel3.getHeadphoto();
                    String userName3 = roomJoinMemberModel3.getNickname();
                    Intrinsics.checkNotNullParameter(userHeader2, "userHeader");
                    Intrinsics.checkNotNullParameter(userName3, "userName");
                    ChatModel chatModel3 = new ChatModel();
                    ChatModel.BecomeMemberModel becomeMemberModel2 = new ChatModel.BecomeMemberModel(userid2, userHeader2, userName3);
                    chatModel3.setType(25);
                    chatModel3.setBecomeMemberModel(becomeMemberModel2);
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel3);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO0(roomJoinMemberModel3, null), 3, null);
                    MixedRoomDataSource.OooO0o0().OooO0OO(roomJoinMemberModel3);
                    LiveEventBus.get("ROOM_JOIN_MEMBER").post(Long.valueOf(roomJoinMemberModel3.getUserid()));
                    oooO00o.OooO00o().f25039OoooO.postValue(new Pair<>(Long.valueOf(roomJoinMemberModel3.getUserid()), 3));
                    break;
                }
                break;
            case 1000402:
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "type = " + i + "  data = " + new String(bArr, charset));
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(new JSONObject(new String(bArr, charset)).optInt("roomMemberCount"), null), 3, null);
                break;
            case 1000900:
                if (!oooO00o.OooO00o().OooOOO()) {
                    ChatModel chatModel4 = new ChatModel();
                    chatModel4.setType(29);
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel4);
                } else {
                    String strOooO0OO8 = o0000.OooO0OO(oO00OOo0.member_task_invite_success);
                    if (!(strOooO0OO8 == null || StringsKt.isBlank(strOooO0OO8))) {
                        o000Oo0 o000oo0OooO00o8 = o000O00.OooO00o(strOooO0OO8, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o8.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o8);
                        }
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(null), 3, null);
                }
                break;
            case 1000901:
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "type = " + i + "  data = " + new String(bArr, charset));
                JSONObject jSONObject2 = new JSONObject(new String(bArr, charset));
                long jOptLong = jSONObject2.optLong("userId");
                String userName4 = jSONObject2.optString("nickName");
                String userHeader3 = jSONObject2.optString("headUrl");
                int iOptInt = jSONObject2.optInt("memberLevel");
                String strOptString = jSONObject2.optString("badgeUrl");
                String strOptString2 = jSONObject2.optString("badgeLevelUrl");
                boolean zOptBoolean = jSONObject2.optBoolean("isTopRank");
                o000000O o000000o7 = o000000O.f46674OooO00o;
                Long l4 = (Long) o000000O.OooOOo0().getValue();
                if (l4 != null && jOptLong == l4.longValue()) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(iOptInt, strOptString2, strOptString, zOptBoolean, null), 3, null);
                }
                if (iOptInt >= 5) {
                    Intrinsics.checkNotNullExpressionValue(userName4, "userName");
                    Intrinsics.checkNotNullExpressionValue(userHeader3, "userHeader");
                    Intrinsics.checkNotNullParameter(userName4, "userName");
                    Intrinsics.checkNotNullParameter(userHeader3, "userHeader");
                    ChatModel chatModel5 = new ChatModel();
                    ChatModel.MemberUpLevelModel memberUpLevelModel = new ChatModel.MemberUpLevelModel(jOptLong, userName4, userHeader3, iOptInt);
                    chatModel5.setType(31);
                    chatModel5.setMemberUpLevelModel(memberUpLevelModel);
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel5);
                }
                if (iOptInt == 10) {
                    LiveEventBus.get("ROOM_MEMBER_LEVEL_UPGRADE").post(new Pair(userName4, userHeader3));
                }
                break;
            case 1000902:
                JSONObject jSONObject3 = new JSONObject(new String(bArr, charset));
                long jOptLong2 = jSONObject3.optLong("UserId");
                String userName5 = jSONObject3.optString("NickName");
                String userHeaderUrl = jSONObject3.optString("HeadUrl");
                Intrinsics.checkNotNullExpressionValue(userName5, "userName");
                Intrinsics.checkNotNullExpressionValue(userHeaderUrl, "userHeaderUrl");
                Intrinsics.checkNotNullParameter(userName5, "userName");
                Intrinsics.checkNotNullParameter(userHeaderUrl, "userHeaderUrl");
                ArrayList<ChatModel> arrayList2 = MixedRoomDataSource.OooO0o0().f23465OooOO0O;
                int iMin = Math.min(arrayList2.size(), 9);
                if (iMin >= 0) {
                    int i2 = 0;
                    while (true) {
                        if ((arrayList2.size() - i2) - 1 >= 0 && arrayList2.get((arrayList2.size() - i2) - 1).getType() == 30) {
                            break;
                        } else if (i2 != iMin) {
                            i2++;
                        }
                    }
                }
                o0OO000.OooO00o("402003");
                ChatModel chatModel6 = new ChatModel();
                chatModel6.setType(30);
                chatModel6.setNewFrom(new RoomUserInfoModel());
                RoomUserInfoModel newFrom = chatModel6.getNewFrom();
                Intrinsics.checkNotNull(newFrom);
                newFrom.getUserId().setValue(Long.valueOf(jOptLong2));
                RoomUserInfoModel newFrom2 = chatModel6.getNewFrom();
                Intrinsics.checkNotNull(newFrom2);
                newFrom2.getUserName().setValue(userName5);
                RoomUserInfoModel newFrom3 = chatModel6.getNewFrom();
                Intrinsics.checkNotNull(newFrom3);
                newFrom3.getUserHeader().setValue(userHeaderUrl);
                MixedRoomDataSource.OooO0o0().OooO00o(chatModel6);
                break;
            case 1000903:
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "type = " + i + "  data = " + new String(bArr, charset));
                JSONObject jSONObject4 = new JSONObject(new String(bArr, charset));
                if (jSONObject4.has("badgeState")) {
                    boolean zOooO00o = o000000.OooO00o(Integer.valueOf(jSONObject4.optInt("badgeState")));
                    if (zOooO00o) {
                        o0OO000.OooO00o("402001");
                    } else {
                        o0OO000.OooO00o("402002");
                    }
                    ChatModel chatModel7 = new ChatModel();
                    chatModel7.setType(28);
                    chatModel7.setMemberBadgeActivate(zOooO00o);
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel7);
                    break;
                }
                break;
            case 1000904:
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "type = " + i + "  data = " + new String(bArr, charset));
                JSONObject jSONObject5 = new JSONObject(new String(bArr, charset));
                int iOptInt2 = jSONObject5.optInt("total");
                int iOptInt3 = jSONObject5.optInt("remain");
                long jOptLong3 = jSONObject5.optLong("disableTime");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(iOptInt3, iOptInt2, jOptLong3, jSONObject5.optLong("frequency", 30000L), null), 3, null);
                if (jOptLong3 > 0) {
                    oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
                    Job job = oo0o0oo.f47521OooOOo;
                    if (job != null) {
                        actorCoroutine = null;
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    } else {
                        actorCoroutine = null;
                    }
                    oo0o0oo.f47521OooOOo = actorCoroutine;
                    oo0o0oo.f47521OooOOo = com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new o0O0O00(oo0o0oo, actorCoroutine));
                }
                break;
            case 1000905:
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "type = " + i + "  data = " + new String(bArr, charset));
                JSONObject jSONObject6 = new JSONObject(new String(bArr, charset));
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(jSONObject6.optLong("userId"), jSONObject6.optInt("memberLevel"), jSONObject6.optString("badgeUrl"), jSONObject6.optString("badgeLevelUrl"), jSONObject6.optBoolean("isTopRank"), null), 3, null);
                break;
        }
    }
}
