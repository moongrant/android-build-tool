package Oooo0;

import androidx.compose.runtime.Composable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O implements o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00000O f543OooO00o = new o00000O();

    public static final class OooO00o implements o0O0ooO {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final oO0Oo<Boolean> f544Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NotNull
        public final oO0Oo<Boolean> f545Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NotNull
        public final oO0Oo<Boolean> f546Oooo0oo;

        public OooO00o(@NotNull oO0Oo<Boolean> isPressed, @NotNull oO0Oo<Boolean> isHovered, @NotNull oO0Oo<Boolean> isFocused) {
            Intrinsics.checkNotNullParameter(isPressed, "isPressed");
            Intrinsics.checkNotNullParameter(isHovered, "isHovered");
            Intrinsics.checkNotNullParameter(isFocused, "isFocused");
            this.f544Oooo0o = isPressed;
            this.f545Oooo0oO = isHovered;
            this.f546Oooo0oo = isFocused;
        }

        @Override // Oooo0.o0O0ooO
        public final void OooO0OO(@NotNull p191o00o0O.o00oO0o o00oo0o2) {
            Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
            o000000.o00O0O o00o0o2 = (o000000.o00O0O) o00oo0o2;
            o00o0o2.o0ooOOo();
            if (this.f544Oooo0o.getValue().booleanValue()) {
                o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
                p191o00o0O.o0OOO0o.OooOO0(o00oo0o2, p145o00Oo0.o00000O0.OooO0OO(p145o00Oo0.o00000O0.f32064OooO0OO, 0.3f), 0L, o00o0o2.OooO0OO(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 122, null);
            } else if (this.f545Oooo0oO.getValue().booleanValue() || this.f546Oooo0oo.getValue().booleanValue()) {
                o00Oo0.o00000O0.OooO00o oooO00o2 = p145o00Oo0.o00000O0.f32063OooO0O0;
                p191o00o0O.o0OOO0o.OooOO0(o00oo0o2, p145o00Oo0.o00000O0.OooO0OO(p145o00Oo0.o00000O0.f32064OooO0OO, 0.1f), 0L, o00o0o2.OooO0OO(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 122, null);
            }
        }
    }

    @Override // Oooo0.o00O0000
    @Composable
    @NotNull
    public final o0O0ooO OooO00o(@NotNull p026Oooo0OO.o0000OO0 interactionSource, @Nullable p100o000oOoO.oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        ooo00o.OooO0o0(1683566979);
        Intrinsics.checkNotNullParameter(interactionSource, "<this>");
        ooo00o.OooO0o0(-1692965168);
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o = ooo00o.OooO0o();
        o000oOoO.oOO00O.OooO00o.C0323OooO00o c0323OooO00o = o000oOoO.oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
        p100o000oOoO.o00Oo00.OooO0o0(interactionSource, new p026Oooo0OO.o000O00O(interactionSource, o0o00oo2, null), ooo00o);
        ooo00o.Oooo0o0();
        Intrinsics.checkNotNullParameter(interactionSource, "<this>");
        ooo00o.OooO0o0(1206586544);
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o2 = ooo00o.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
            ooo00o.Oooo00o(objOooO0o2);
        }
        ooo00o.Oooo0o0();
        o0O00OO o0o00oo3 = (o0O00OO) objOooO0o2;
        p100o000oOoO.o00Oo00.OooO0o0(interactionSource, new p026Oooo0OO.o000OO(interactionSource, o0o00oo3, null), ooo00o);
        ooo00o.Oooo0o0();
        Intrinsics.checkNotNullParameter(interactionSource, "<this>");
        ooo00o.OooO0o0(-1805515472);
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o3 = ooo00o.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
            ooo00o.Oooo00o(objOooO0o3);
        }
        ooo00o.Oooo0o0();
        o0O00OO o0o00oo4 = (o0O00OO) objOooO0o3;
        p100o000oOoO.o00Oo00.OooO0o0(interactionSource, new p026Oooo0OO.o0000oo(interactionSource, o0o00oo4, null), ooo00o);
        ooo00o.Oooo0o0();
        ooo00o.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o.Oooo0oo(interactionSource);
        Object objOooO0o4 = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o4 == c0323OooO00o) {
            objOooO0o4 = new OooO00o(o0o00oo2, o0o00oo3, o0o00oo4);
            ooo00o.Oooo00o(objOooO0o4);
        }
        ooo00o.Oooo0o0();
        OooO00o oooO00o = (OooO00o) objOooO0o4;
        ooo00o.Oooo0o0();
        return oooO00o;
    }
}
