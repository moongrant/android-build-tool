package p593o0oOooOo;

import androidx.lifecycle.LifecycleOwner;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.vm.event.EventCreateViewModel;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0o0000.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p518o0o0O000.o0OOO0o;
import p586o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.event.EventCreateScreen$toEventCreate$1", f = "EventCreateScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class d4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f47236Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f47237OoooO00;

    public static final class OooO00o extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47238Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f47238Oooo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("roomid", String.valueOf(this.f47238Oooo.getRoomId()));
            linkedHashMap.put("roomeventid", String.valueOf(l));
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(linkedHashMap);
            if (strOooO0oo == null) {
                strOooO0oo = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
            }
            LiveEventBus.get("EVENT_CREATE_SUCCESS").post(strOooO0oo);
            o000O o000o = o000O.f46961OooO00o;
            o000O.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(EventCreateViewModel eventCreateViewModel, LifecycleOwner lifecycleOwner, Continuation<? super d4> continuation) {
        super(2, continuation);
        this.f47236Oooo = eventCreateViewModel;
        this.f47237OoooO00 = lifecycleOwner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d4(this.f47236Oooo, this.f47237OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        EventCreateViewModel eventCreateViewModel = this.f47236Oooo;
        o000oOoO.OooO0Oo(eventCreateViewModel.create(eventCreateViewModel.getCreateToken(), String.valueOf(this.f47236Oooo.getRoomId())), this.f47237OoooO00, new OooO00o(this.f47236Oooo));
        return Unit.INSTANCE;
    }
}
