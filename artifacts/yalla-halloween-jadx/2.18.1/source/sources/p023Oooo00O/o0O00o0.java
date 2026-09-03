package p023Oooo00O;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0<V extends o0O0O00> implements o00OOOO0<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O f1196OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public V f1197OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public V f1198OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public V f1199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f1200OooO0o0;

    public o0O00o0(@NotNull o0000O floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f1196OooO00o = floatDecaySpec;
        floatDecaySpec.OooO00o();
        this.f1200OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // p023Oooo00O.o00OOOO0
    public final float OooO00o() {
        return this.f1200OooO0o0;
    }

    @Override // p023Oooo00O.o00OOOO0
    @NotNull
    public final V OooO0O0(@NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f1199OooO0Oo == null) {
            Intrinsics.checkNotNullParameter(initialValue, "<this>");
            this.f1199OooO0Oo = (V) initialValue.OooO0OO();
        }
        V v = this.f1199OooO0Oo;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            v = null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f1199OooO0Oo;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                v2 = null;
            }
            v2.OooO0o0(i, this.f1196OooO00o.OooO0OO(initialValue.OooO00o(i), initialVelocity.OooO00o(i)));
        }
        V v3 = this.f1199OooO0Oo;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        return null;
    }

    @Override // p023Oooo00O.o00OOOO0
    @NotNull
    public final V OooO0OO(long j, @NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f1197OooO0O0 == null) {
            Intrinsics.checkNotNullParameter(initialValue, "<this>");
            this.f1197OooO0O0 = (V) initialValue.OooO0OO();
        }
        V v = this.f1197OooO0O0;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v = null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f1197OooO0O0;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v2 = null;
            }
            v2.OooO0o0(i, this.f1196OooO00o.OooO0o0(j, initialValue.OooO00o(i), initialVelocity.OooO00o(i)));
        }
        V v3 = this.f1197OooO0O0;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // p023Oooo00O.o00OOOO0
    @NotNull
    public final V OooO0Oo(long j, @NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f1198OooO0OO == null) {
            Intrinsics.checkNotNullParameter(initialValue, "<this>");
            this.f1198OooO0OO = (V) initialValue.OooO0OO();
        }
        V v = this.f1198OooO0OO;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v = null;
        }
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f1198OooO0OO;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v2 = null;
            }
            o0000O o0000o2 = this.f1196OooO00o;
            initialValue.OooO00o(i);
            v2.OooO0o0(i, o0000o2.OooO0Oo(j, initialVelocity.OooO00o(i)));
        }
        V v3 = this.f1198OooO0OO;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // p023Oooo00O.o00OOOO0
    public final long OooO0o0(@NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f1198OooO0OO == null) {
            Intrinsics.checkNotNullParameter(initialValue, "<this>");
            this.f1198OooO0OO = (V) initialValue.OooO0OO();
        }
        V v = this.f1198OooO0OO;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v = null;
        }
        int iOooO0O0 = v.OooO0O0();
        long jMax = 0;
        for (int i = 0; i < iOooO0O0; i++) {
            o0000O o0000o2 = this.f1196OooO00o;
            initialValue.OooO00o(i);
            jMax = Math.max(jMax, o0000o2.OooO0O0(initialVelocity.OooO00o(i)));
        }
        return jMax;
    }
}
