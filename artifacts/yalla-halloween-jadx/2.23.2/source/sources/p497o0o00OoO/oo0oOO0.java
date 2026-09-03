package p497o0o00OoO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import p405o0Oo0OOO.v;
import p475o0Ooooo0.o0O00oO0;
import p650o0ooo.g2;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function1<Pair<? extends Long, ? extends Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49912OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(oo0O oo0o) {
        super(1);
        this.f49912OooO0Oo = oo0o;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:6:0x0008, B:8:0x0014, B:10:0x001a, B:12:0x0020, B:17:0x003d, B:19:0x005e, B:24:0x006e, B:26:0x0072, B:28:0x0078, B:29:0x007f, B:32:0x0090, B:34:0x009c, B:36:0x00a9, B:37:0x00b3, B:23:0x0067, B:38:0x00ba), top: B:44:0x0008 }] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Long, ? extends Integer> pair) {
        MutableStateFlow<Long> userId;
        MutableStateFlow<Long> userId2;
        Pair<? extends Long, ? extends Integer> pair2 = pair;
        if (pair2 != null) {
            oo0O oo0o = this.f49912OooO0Oo;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (oo0o.OooO0o0().OooO0OO()) {
                    RoomUserInfoModel roomUserInfoModel = oo0o.f49904OooO0o0;
                    if ((roomUserInfoModel == null || (userId2 = roomUserInfoModel.getUserId()) == null || pair2.getFirst().longValue() != userId2.getValue().longValue()) ? false : true) {
                        g2 g2VarOooO0o0 = oo0o.OooO0o0();
                        int iIntValue = pair2.getSecond().intValue();
                        v vVar = g2VarOooO0o0.f58223OooOO0o;
                        vVar.f45584OooO0OO.setIdentityInfo(iIntValue);
                        vVar.f45587OooO0o0.f45544OooO0O0.OooO0OO(iIntValue, true, true);
                        RoomUserInfoModel roomUserInfoModel2 = oo0o.f49904OooO0o0;
                        Long value = null;
                        MutableStateFlow<Integer> roomMemberType = roomUserInfoModel2 != null ? roomUserInfoModel2.getRoomMemberType() : null;
                        if (roomMemberType != null) {
                            roomMemberType.setValue(pair2.getSecond());
                        }
                        RoomUserInfoModel roomUserInfoModel3 = oo0o.f49904OooO0o0;
                        if (roomUserInfoModel3 != null && (userId = roomUserInfoModel3.getUserId()) != null) {
                            value = userId.getValue();
                        }
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        if (!Intrinsics.areEqual(value, o0O00oO0.OooOOo0().getValue())) {
                            if (OooO0O0.f24533OoooOOO.OooO00o().OooOO0o()) {
                                if (pair2.getSecond().intValue() == 2) {
                                    g2.OooOO0O(oo0o.OooO0o0(), false, false, false, 15);
                                } else {
                                    g2.OooOO0O(oo0o.OooO0o0(), true, true, true, 1);
                                }
                            }
                            Result.m4215constructorimpl(Unit.INSTANCE);
                        }
                    } else {
                        Result.m4215constructorimpl(Unit.INSTANCE);
                    }
                } else {
                    Result.m4215constructorimpl(Unit.INSTANCE);
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4215constructorimpl(ResultKt.createFailure(th));
            }
        }
        return Unit.INSTANCE;
    }
}
