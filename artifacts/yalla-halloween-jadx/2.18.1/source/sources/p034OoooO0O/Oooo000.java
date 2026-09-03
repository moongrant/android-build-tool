package p034OoooO0O;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p145o00Oo0.o00000O;
import p145o00Oo0.o0000oo;
import p191o00o0O.o00oO0o;
import p191o00o0O.o0OOO0o;
import p191o00o0O.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function1<o00oO0o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0000oo f3461Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f3462Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ResolvedTextDirection f3463Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f3464Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00000O f3465OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, o0000oo o0000ooVar, o00000O o00000o) {
        super(1);
        this.f3462Oooo0o = z;
        this.f3463Oooo0oO = resolvedTextDirection;
        this.f3464Oooo0oo = z2;
        this.f3461Oooo = o0000ooVar;
        this.f3465OoooO00 = o00000o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00oO0o o00oo0o2) {
        boolean zOooO0o0;
        o00oO0o onDrawWithContent = o00oo0o2;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.o0ooOOo();
        boolean z = this.f3462Oooo0o;
        ResolvedTextDirection resolvedTextDirection = this.f3463Oooo0oO;
        boolean z2 = this.f3464Oooo0oo;
        if (z) {
            zOooO0o0 = OooOo00.OooO0o0(resolvedTextDirection, z2);
        } else {
            zOooO0o0 = !OooOo00.OooO0o0(resolvedTextDirection, z2);
        }
        if (zOooO0o0) {
            o0000oo o0000ooVar = this.f3461Oooo;
            o00000O o00000o = this.f3465OoooO00;
            long jO00Oo0 = onDrawWithContent.o00Oo0();
            o0ooOOo o0oooooOoooo0o = onDrawWithContent.Ooooo0o();
            long jOooO0OO = o0oooooOoooo0o.OooO0OO();
            o0oooooOoooo0o.OooO0o().OooO0oo();
            o0oooooOoooo0o.OooO0Oo().OooO0o0(-1.0f, 1.0f, jO00Oo0);
            o0OOO0o.OooO0o0(onDrawWithContent, o0000ooVar, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, o00000o, 0, 46, null);
            o0oooooOoooo0o.OooO0o().OooOOo0();
            o0oooooOoooo0o.OooO0o0(jOooO0OO);
        } else {
            o0OOO0o.OooO0o0(onDrawWithContent, this.f3461Oooo, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, this.f3465OoooO00, 0, 46, null);
        }
        return Unit.INSTANCE;
    }
}
