package p028Oooo0o0;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o0O0O00.o000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000O extends o00O00 implements o000 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f2116Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f2117Oooo0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0O000O(boolean z) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f2116Oooo0oO = 1.0f;
        this.f2117Oooo0oo = z;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        o0O000O o0o000o = obj instanceof o0O000O ? (o0O000O) obj : null;
        if (o0o000o == null) {
            return false;
        }
        return ((this.f2116Oooo0oO > o0o000o.f2116Oooo0oO ? 1 : (this.f2116Oooo0oO == o0o000o.f2116Oooo0oO ? 0 : -1)) == 0) && this.f2117Oooo0oo == o0o000o.f2117Oooo0oo;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f2116Oooo0oO) * 31) + (this.f2117Oooo0oo ? 1231 : 1237);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // o0O0O00.o000
    public final Object o0ooOoO(OooO oooO, Object obj) {
        Intrinsics.checkNotNullParameter(oooO, "<this>");
        o0oO0Ooo o0oo0ooo2 = obj instanceof o0oO0Ooo ? (o0oO0Ooo) obj : null;
        if (o0oo0ooo2 == null) {
            o0oo0ooo2 = new o0oO0Ooo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, null, 7, null);
        }
        o0oo0ooo2.f2215OooO00o = this.f2116Oooo0oO;
        o0oo0ooo2.f2216OooO0O0 = this.f2117Oooo0oo;
        return o0oo0ooo2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("LayoutWeightImpl(weight=");
        sbOooO0o0.append(this.f2116Oooo0oO);
        sbOooO0o0.append(", fill=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f2117Oooo0oo, ')');
    }
}
