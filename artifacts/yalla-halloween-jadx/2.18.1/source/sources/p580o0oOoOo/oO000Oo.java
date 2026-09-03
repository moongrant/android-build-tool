package p580o0oOoOo;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.paging.compose.OooO0OO;
import com.yalla.yalla.model.RoomMemberTaskInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.Oooo000;
import p027Oooo0o.o000O00O;
import p028Oooo0o0.o00O00o0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p607o0oo0O0.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000Oo extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f46512Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f46513Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<RoomMemberTaskInfoModel> f46514Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f46515Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ int f46516OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ long f46517OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f46518OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ int f46519OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ long f46520OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ Context f46521o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo(o000O00O o000o00o2, OooO0OO<RoomMemberTaskInfoModel> oooO0OO, int i, o00oO0o o00oo0o2, long j, long j2, int i2, int i3, long j3, Context context) {
        super(3);
        this.f46513Oooo0o = o000o00o2;
        this.f46514Oooo0oO = oooO0OO;
        this.f46515Oooo0oo = i;
        this.f46512Oooo = o00oo0o2;
        this.f46518OoooO00 = j;
        this.f46517OoooO0 = j2;
        this.f46519OoooO0O = i2;
        this.f46516OoooO = i3;
        this.f46520OoooOO0 = j3;
        this.f46521o000oOoO = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
        o00O00o0 RefreshContentStatus = o00o00o1;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Oooo000.OooO00o(SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), this.f46513Oooo0o, null, false, null, null, null, false, new oO000Oo0(this.f46514Oooo0oO, this.f46515Oooo0oo, this.f46512Oooo, this.f46518OoooO00, this.f46517OoooO0, this.f46519OoooO0O, this.f46516OoooO, this.f46520OoooOO0, this.f46521o000oOoO), ooo00o2, 6, 252);
        }
        return Unit.INSTANCE;
    }
}
