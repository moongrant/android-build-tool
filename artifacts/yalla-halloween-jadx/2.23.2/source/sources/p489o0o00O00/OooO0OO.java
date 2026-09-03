package p489o0o00O00;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.model.room.RoomVoiceModule;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.repository.WebEventRepository$uploadRoomVoice$$inlined$call$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o000O0Oo.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f48918OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Job f48919OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static RoomVoiceModule f48920OooO0OO;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f48921OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f48922OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f48923OooO0OO;

        public OooO00o(int i, int i2, int i3) {
            this.f48921OooO00o = i;
            this.f48922OooO0O0 = i2;
            this.f48923OooO0OO = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(OooO0OO oooO0OO, Continuation continuation) {
        OooOO0 oooOO1;
        oooO0OO.getClass();
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f48926OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f48926OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(oooO0OO, continuation);
            }
        } else {
            oooOO1 = new OooOO0(oooO0OO, continuation);
        }
        Object obj = oooOO1.f48925OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f48926OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            RoomVoiceModule roomVoiceModule = f48920OooO0OO;
            if (roomVoiceModule != null) {
                List<RoomVoiceModule.TimeVoice> timeVoice = roomVoiceModule.getTimeVoice();
                if (!(timeVoice == null || timeVoice.isEmpty())) {
                    RoomVoiceModule roomVoiceModule2 = new RoomVoiceModule();
                    roomVoiceModule2.setRoomId(roomVoiceModule.getRoomId());
                    roomVoiceModule2.setTimeVoice(roomVoiceModule.getTimeVoice());
                    roomVoiceModule2.setUserId(roomVoiceModule.getUserId());
                    f48920OooO0OO = null;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(roomVoiceModule2.getTimeVoice());
                    WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
                    long roomId = roomVoiceModule2.getRoomId();
                    oooOO1.f48926OooO0o = 1;
                    webEventRepository.getClass();
                    if (BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$uploadRoomVoice$$inlined$call$1(webEventRepository, null, arrayList, roomId), oooOO1) == coroutine_suspended) {
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
        f48919OooO0O0 = null;
        return Unit.INSTANCE;
    }

    @NotNull
    public static OooO00o OooO0O0(@Nullable RecyclerView recyclerView) {
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        int childCount;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            iFindFirstVisibleItemPosition = 0;
            iFindLastVisibleItemPosition = 0;
            childCount = 0;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(linearLayoutManager);
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            childCount = linearLayoutManager.getChildCount();
            StringBuilder sbOooO00o = o00000.OooO00o("getRecycleViewScrollItem enterRoom \n                 getChildCount = ", linearLayoutManager.getChildCount(), "\n                 firstCompletelyVisibleItemPosition = ", iFindFirstCompletelyVisibleItemPosition, "\n                 lastCompletelyVisibleItemPosition = ");
            OooOOO0.OooO00o(sbOooO00o, iFindLastCompletelyVisibleItemPosition, "\n                 firstVisibleItemPosition = ", iFindFirstVisibleItemPosition, "\n                 lastVisibleItemPosition = ");
            sbOooO00o.append(iFindLastVisibleItemPosition);
            o0000O00.OooO0O0(sbOooO00o.toString());
        }
        return new OooO00o(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, childCount);
    }
}
