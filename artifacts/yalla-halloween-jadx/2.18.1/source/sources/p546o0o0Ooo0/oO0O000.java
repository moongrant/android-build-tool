package p546o0o0Ooo0;

import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f44519Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0O00oO f44520Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000(long j, oO0O00oO oo0o00oo) {
        super(0);
        this.f44519Oooo0o = j;
        this.f44520Oooo0oO = oo0o00oo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000 o00o000OooO = o00O000.OooO();
        String strValueOf = String.valueOf(this.f44519Oooo0o);
        RoomUserInfoModel roomUserInfoModel = this.f44520Oooo0oO.f44534OooO0o0;
        int i = 0;
        if (roomUserInfoModel != null && !roomUserInfoModel.getSilenced()) {
            i = 1;
        }
        Objects.requireNonNull(o00o000OooO);
        String str = "{\"to\":" + strValueOf + ",\"silence\":" + i + "}";
        o00 o00Var = o00O000.f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10006, str);
        }
        return Unit.INSTANCE;
    }
}
