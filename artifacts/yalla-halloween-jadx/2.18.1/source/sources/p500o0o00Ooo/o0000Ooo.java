package p500o0o00Ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.RoomVoiceModule;
import com.yalla.yalla.common.repository.WebEventRepository;
import com.yalla.yalla.common.repository.WebEventRepository$uploadRoomVoice$$inlined$call$1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000Ooo f41382OooO00o = new o0000Ooo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Job f41383OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static RoomVoiceModule f41384OooO0OO;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f41385OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f41386OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f41387OooO0OO;

        public OooO00o(int i, int i2, int i3) {
            this.f41385OooO00o = i;
            this.f41386OooO0O0 = i2;
            this.f41387OooO0OO = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(o0000Ooo o0000ooo, Continuation continuation) {
        o0000oo o0000ooVar;
        Objects.requireNonNull(o0000ooo);
        if (continuation instanceof o0000oo) {
            o0000ooVar = (o0000oo) continuation;
            int i = o0000ooVar.f41390Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000ooVar.f41390Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                o0000ooVar = new o0000oo(o0000ooo, continuation);
            }
        } else {
            o0000ooVar = new o0000oo(o0000ooo, continuation);
        }
        Object obj = o0000ooVar.f41388Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0000ooVar.f41390Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            RoomVoiceModule roomVoiceModule = f41384OooO0OO;
            if (roomVoiceModule != null) {
                List<RoomVoiceModule.TimeVoice> timeVoice = roomVoiceModule.getTimeVoice();
                if (!(timeVoice == null || timeVoice.isEmpty())) {
                    RoomVoiceModule roomVoiceModule2 = new RoomVoiceModule();
                    roomVoiceModule2.setRoomId(roomVoiceModule.getRoomId());
                    roomVoiceModule2.setTimeVoice(roomVoiceModule.getTimeVoice());
                    roomVoiceModule2.setUserId(roomVoiceModule.getUserId());
                    f41384OooO0OO = null;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(roomVoiceModule2.getTimeVoice());
                    WebEventRepository webEventRepository = WebEventRepository.f20839OooO00o;
                    long roomId = roomVoiceModule2.getRoomId();
                    o0000ooVar.f41390Oooo0oo = 1;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$uploadRoomVoice$$inlined$call$1(webEventRepository, null, arrayList, roomId), o0000ooVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        f41383OooO0O0 = null;
        return Unit.INSTANCE;
    }

    @NotNull
    public final OooO00o OooO0O0(@Nullable RecyclerView recyclerView) {
        int iFindLastVisibleItemPosition;
        int childCount;
        int i = 0;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            iFindLastVisibleItemPosition = 0;
            childCount = 0;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(linearLayoutManager);
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            childCount = linearLayoutManager.getChildCount();
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("getRecycleViewScrollItem enterRoom \n                 getChildCount = ");
            sbOooO0o0.append(linearLayoutManager.getChildCount());
            sbOooO0o0.append("\n                 firstCompletelyVisibleItemPosition = ");
            sbOooO0o0.append(iFindFirstCompletelyVisibleItemPosition);
            sbOooO0o0.append("\n                 lastCompletelyVisibleItemPosition = ");
            sbOooO0o0.append(iFindLastCompletelyVisibleItemPosition);
            sbOooO0o0.append("\n                 firstVisibleItemPosition = ");
            sbOooO0o0.append(iFindFirstVisibleItemPosition);
            sbOooO0o0.append("\n                 lastVisibleItemPosition = ");
            sbOooO0o0.append(iFindLastVisibleItemPosition);
            o00O00.OooO0O0(sbOooO0o0.toString());
            i = iFindFirstVisibleItemPosition;
        }
        return new OooO00o(i, iFindLastVisibleItemPosition, childCount);
    }

    public final void OooO0OO(long j, int i) {
        List<RoomVoiceModule.TimeVoice> timeVoice;
        if (i <= 0) {
            return;
        }
        if (f41384OooO0OO == null) {
            RoomVoiceModule roomVoiceModule = new RoomVoiceModule();
            f41384OooO0OO = roomVoiceModule;
            roomVoiceModule.setRoomId(j);
        }
        RoomVoiceModule roomVoiceModule2 = f41384OooO0OO;
        if (roomVoiceModule2 != null && (timeVoice = roomVoiceModule2.getTimeVoice()) != null) {
            timeVoice.add(new RoomVoiceModule.TimeVoice(System.currentTimeMillis(), i));
        }
        if (f41383OooO0O0 == null) {
            f41383OooO0O0 = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o0000(null), 3, null);
        }
    }
}
