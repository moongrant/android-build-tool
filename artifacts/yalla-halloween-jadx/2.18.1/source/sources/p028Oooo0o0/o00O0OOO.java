package p028Oooo0o0;

import OooO00o.OooO00o;
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
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OOO extends o00O00 implements o000 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o00OO0O0.OooO0O0 f2072Oooo0oO;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00O0OOO(@NotNull o00OO0O0.OooO0O0 horizontal) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(horizontal, "horizontal");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f2072Oooo0oO = horizontal;
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
        o00O0OOO o00o0ooo2 = obj instanceof o00O0OOO ? (o00O0OOO) obj : null;
        if (o00o0ooo2 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f2072Oooo0oO, o00o0ooo2.f2072Oooo0oO);
    }

    public final int hashCode() {
        return this.f2072Oooo0oO.hashCode();
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
        o00OO0O0.OooO0O0 horizontal = this.f2072Oooo0oO;
        Intrinsics.checkNotNullParameter(horizontal, "horizontal");
        o0oo0ooo2.f2217OooO0OO = new o00O0O0.OooO00o(horizontal);
        return o0oo0ooo2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("HorizontalAlignModifier(horizontal=");
        sbOooO0o0.append(this.f2072Oooo0oO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
