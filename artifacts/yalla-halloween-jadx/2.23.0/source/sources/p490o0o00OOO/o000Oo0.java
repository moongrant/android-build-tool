package p490o0o00OOO;

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
import p464o0Oooo.o000000O;
import p519o0o0O0oO.g2;
import p641o0ooOOOO.h8;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function1<Pair<? extends Long, ? extends Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48630OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(o000O o000o) {
        super(1);
        this.f48630OooO0Oo = o000o;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:6:0x0008, B:8:0x0014, B:10:0x001a, B:12:0x0020, B:17:0x003d, B:19:0x005e, B:24:0x006e, B:26:0x0072, B:28:0x0078, B:29:0x007f, B:32:0x0090, B:34:0x009c, B:36:0x00a9, B:37:0x00b3, B:23:0x0067, B:38:0x00ba), top: B:44:0x0008 }] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Long, ? extends Integer> pair) {
        MutableStateFlow<Long> userId;
        MutableStateFlow<Long> userId2;
        Pair<? extends Long, ? extends Integer> pair2 = pair;
        if (pair2 != null) {
            o000O o000o = this.f48630OooO0Oo;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (o000o.OooO0o0().OooO0OO()) {
                    RoomUserInfoModel roomUserInfoModel = o000o.f48596OooO0o0;
                    if ((roomUserInfoModel == null || (userId2 = roomUserInfoModel.getUserId()) == null || pair2.getFirst().longValue() != userId2.getValue().longValue()) ? false : true) {
                        g2 g2VarOooO0o0 = o000o.OooO0o0();
                        int iIntValue = pair2.getSecond().intValue();
                        h8 h8Var = g2VarOooO0o0.f52269OooOO0o;
                        h8Var.f58046OooO0OO.setIdentityInfo(iIntValue);
                        h8Var.f58049OooO0o0.f57846OooO0O0.OooO0OO(iIntValue, true, true);
                        RoomUserInfoModel roomUserInfoModel2 = o000o.f48596OooO0o0;
                        Long value = null;
                        MutableStateFlow<Integer> roomMemberType = roomUserInfoModel2 != null ? roomUserInfoModel2.getRoomMemberType() : null;
                        if (roomMemberType != null) {
                            roomMemberType.setValue(pair2.getSecond());
                        }
                        RoomUserInfoModel roomUserInfoModel3 = o000o.f48596OooO0o0;
                        if (roomUserInfoModel3 != null && (userId = roomUserInfoModel3.getUserId()) != null) {
                            value = userId.getValue();
                        }
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        if (!Intrinsics.areEqual(value, o000000O.OooOOo0().getValue())) {
                            if (OooO0O0.f24995OoooOOO.OooO00o().OooOO0o()) {
                                if (pair2.getSecond().intValue() == 2) {
                                    g2.OooOO0O(o000o.OooO0o0(), false, false, false, 15);
                                } else {
                                    g2.OooOO0O(o000o.OooO0o0(), true, true, true, 1);
                                }
                            }
                            Result.m4213constructorimpl(Unit.INSTANCE);
                        }
                    } else {
                        Result.m4213constructorimpl(Unit.INSTANCE);
                    }
                } else {
                    Result.m4213constructorimpl(Unit.INSTANCE);
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4213constructorimpl(ResultKt.createFailure(th));
            }
        }
        return Unit.INSTANCE;
    }
}
