package p594o0oOoooo;

import com.common.support.sailfish_commons.logmodels.TrackModel;
import com.common.support.track.TrackAgent;
import com.yalla.yalla.data.db.model.BuriedPoint;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.util.buriedpoint.core.BuriedPointSDK$buriedPoint$1", f = "BuriedPointSDK.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class i0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f56886OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f56887OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f56888OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String str, String str2, Map<String, ? extends Object> map, Continuation<? super i0> continuation) {
        super(2, continuation);
        this.f56886OooO0Oo = str;
        this.f56888OooO0o0 = str2;
        this.f56887OooO0o = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new i0(this.f56886OooO0Oo, this.f56888OooO0o0, this.f56887OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BuriedPoint buriedPointCreate = BuriedPoint.Factory.INSTANCE.create(this.f56886OooO0Oo, this.f56888OooO0o0, this.f56887OooO0o);
        buriedPointCreate.setEventTime(System.currentTimeMillis());
        TrackModel trackModel = new TrackModel();
        String userId = buriedPointCreate.getUserId();
        if (userId == null) {
            userId = "";
        }
        trackModel.setUserId(userId);
        String eventId = buriedPointCreate.getEventId();
        trackModel.setEventId(eventId != null ? eventId : "");
        trackModel.addExtInfo("event", OooO.OooO00o(buriedPointCreate));
        TrackAgent.INSTANCE.onEvent(trackModel);
        return Unit.INSTANCE;
    }
}
